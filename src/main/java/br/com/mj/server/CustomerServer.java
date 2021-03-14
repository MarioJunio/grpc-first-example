package br.com.mj.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.protobuf.services.ProtoReflectionService;

import java.io.IOException;

public class CustomerServer {

    private static final int PORT = 8081;

    public static void main(String[] args) throws InterruptedException, IOException {
        Server server = ServerBuilder
                .forPort(PORT)
//                .useTransportSecurity(new File("ssl/server.crt"), new File("ssl/server.pem"))
                .addService(new CustomerServiceImpl())
                .addService(new CalculatorServiceImpl())
                .addService(ProtoReflectionService.newInstance())
                .build();

        server.start();
        System.out.printf("Server started at %d\n", PORT);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutdown request!");
            server.shutdown();
            System.out.println("Shutdown success!");
        }));

        server.awaitTermination();
    }

}
