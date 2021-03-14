package br.com.mj.client;

import br.com.mj.CustomerMessage;
import br.com.mj.CustomerRequest;
import br.com.mj.CustomerResponse;
import br.com.mj.CustomerServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.netty.shaded.io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;

import javax.net.ssl.SSLException;
import java.io.File;

public class CustomerClient {

    public static void main(String[] args) throws SSLException {

        CustomerMessage customerMessage = CustomerMessage
                .newBuilder()
                .setName("Mario Junio Marques Martins")
                .setEmail("mario.mj.95@gmail.com")
                .setPassword("bitlyuf")
                .build();

        CustomerRequest customerRequest = CustomerRequest
                .newBuilder()
                .setCustomer(customerMessage)
                .build();

        withUnsecureChannel(customerRequest);
    }

    private static void withUnsecureChannel(final CustomerRequest customerRequest) {
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress("localhost", 8081)
                .usePlaintext()
                .build();

        CustomerServiceGrpc.CustomerServiceBlockingStub customerServiceBlockingStub = CustomerServiceGrpc.newBlockingStub(managedChannel);
        CustomerResponse customerResponse = customerServiceBlockingStub.save(customerRequest);

        System.out.printf("-> Response: %s\n", customerResponse.getResult());

        managedChannel.shutdown();
    }

    private static void withSecureChannel(final CustomerRequest customerRequest) throws SSLException {
        ManagedChannel secureChannel = NettyChannelBuilder
                .forAddress("localhost", 8081)
                .sslContext(GrpcSslContexts.forClient().trustManager(new File("ssl/ca.crt")).build())
                .build();

        CustomerServiceGrpc.CustomerServiceBlockingStub customerServiceBlockingStub = CustomerServiceGrpc.newBlockingStub(secureChannel);
        CustomerResponse customerResponse = customerServiceBlockingStub.save(customerRequest);

        System.out.printf("-> Response: %s\n", customerResponse.getResult());

        secureChannel.shutdown();
    }

}
