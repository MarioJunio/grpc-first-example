package br.com.mj.client;

import br.com.mj.calculator.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class CalculatorClient {

    public static void main(String[] args) throws InterruptedException {

        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress("localhost", 8081)
                .usePlaintext()
                .build();

        managedChannel.shutdown();
    }

    private static void unaryCalls(ManagedChannel channel) {
        CalculatorServiceGrpc.CalculatorServiceBlockingStub calculatorService = CalculatorServiceGrpc.newBlockingStub(channel);

        CalculatorRequest calculatorRequest = CalculatorRequest
                .newBuilder()
                .setN1(5)
                .setN2(10)
                .build();

        CalculatorResponse sum = calculatorService.sum(calculatorRequest);
        CalculatorResponse subtract = calculatorService.subtract(calculatorRequest);
        CalculatorResponse multiply = calculatorService.multiply(calculatorRequest);
        CalculatorResponse division = calculatorService.division(calculatorRequest);

        System.out.printf("Calculator Sum result is: %.2f\n", sum.getResult());
        System.out.printf("Calculator Subtract result is: %.2f\n", subtract.getResult());
        System.out.printf("Calculator Multiply result is: %.2f\n", multiply.getResult());
        System.out.printf("Calculator Division result is: %.2f\n", division.getResult());
    }

    private static void serverStreamCall(ManagedChannel channel) {
        CalculatorServiceGrpc.CalculatorServiceBlockingStub calculatorService = CalculatorServiceGrpc.newBlockingStub(channel);

        System.out.println("Prime number: 120");
        calculatorService.prime(PrimeRequest.newBuilder().setPrime(120).build()).forEachRemaining(n -> {
            System.out.printf("-> Prime decomposition: %.2f\n", n.getResult());
        });
    }

    private static void clientStreamCall(ManagedChannel managedChannel) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        CalculatorServiceGrpc.CalculatorServiceStub calculatorServiceStub = CalculatorServiceGrpc.newStub(managedChannel);

        StreamObserver<AverageRequest> request = calculatorServiceStub.avg(new StreamObserver<>() {

            @Override
            public void onNext(AverageResponse value) {
                System.out.printf("-> Response with average: %.2f\n", value.getResult());
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                System.out.println("-> Response completed");
                countDownLatch.countDown();
            }

        });

        request.onNext(AverageRequest.newBuilder().setNumber(2).build());
        request.onNext(AverageRequest.newBuilder().setNumber(5).build());
        request.onNext(AverageRequest.newBuilder().setNumber(10).build());

        request.onCompleted();
        System.out.println("-> Request completed");

        countDownLatch.await();
    }

    private static void biDirectionalCall(ManagedChannel channel) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        CalculatorServiceGrpc.CalculatorServiceStub calculatorServiceStub = CalculatorServiceGrpc.newStub(channel);

        StreamObserver<MaximumRequest> request = calculatorServiceStub.findMaximum(new StreamObserver<>() {
            List<Integer> maxNumbers = new ArrayList<>();

            @Override
            public void onNext(MaximumResponse response) {
                maxNumbers.add(response.getResponse());
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                System.out.println("=> " + maxNumbers.toString());
                countDownLatch.countDown();
            }
        });

        request.onNext(MaximumRequest.newBuilder().setNumber(1).build());
        request.onNext(MaximumRequest.newBuilder().setNumber(5).build());
        request.onNext(MaximumRequest.newBuilder().setNumber(3).build());
        request.onNext(MaximumRequest.newBuilder().setNumber(12).build());
        request.onNext(MaximumRequest.newBuilder().setNumber(25).build());
        request.onNext(MaximumRequest.newBuilder().setNumber(10).build());

        request.onCompleted();

        countDownLatch.await();
    }
}
