package br.com.mj.server;

import br.com.mj.*;
import io.grpc.stub.StreamObserver;

public class CustomerServiceImpl extends CustomerServiceGrpc.CustomerServiceImplBase {

    @Override
    public void save(CustomerRequest request, StreamObserver<CustomerResponse> responseObserver) {
        CustomerMessage customer = request.getCustomer();

        String name = customer.getName();
        String email = customer.getEmail();
        String password = customer.getPassword();

        //TODO: Processing...

        CustomerResponse customerResponse = CustomerResponse
                .newBuilder()
                .setResult(String.format("Saving %s, %s with password: %s\n", name, email, password))
                .build();

        responseObserver.onNext(customerResponse);
        responseObserver.onCompleted();
    }
}
