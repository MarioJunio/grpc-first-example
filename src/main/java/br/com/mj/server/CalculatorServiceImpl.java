package br.com.mj.server;

import br.com.mj.calculator.*;
import com.google.common.primitives.Ints;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalculatorServiceImpl extends CalculatorServiceGrpc.CalculatorServiceImplBase {

    @Override
    public void sum(CalculatorRequest request, StreamObserver<CalculatorResponse> responseObserver) {
        double result = request.getN1() + request.getN2();
        complete(result, responseObserver);
    }

    @Override
    public void subtract(CalculatorRequest request, StreamObserver<CalculatorResponse> responseObserver) {
        double result = request.getN1() - request.getN2();
        complete(result, responseObserver);
    }

    @Override
    public void multiply(CalculatorRequest request, StreamObserver<CalculatorResponse> responseObserver) {
        double result = request.getN1() * request.getN2();
        complete(result, responseObserver);
    }

    @Override
    public void division(CalculatorRequest request, StreamObserver<CalculatorResponse> responseObserver) {
        double result = request.getN1() / request.getN2();
        complete(result, responseObserver);
    }

    @Override
    public void prime(PrimeRequest request, StreamObserver<CalculatorResponse> responseObserver) {
        int k = 2;
        int n = request.getPrime();

        while (n > 1) {

            if (n % k == 0) {
                n /= k;
                responseObserver.onNext(CalculatorResponse
                        .newBuilder()
                        .setResult(Double.valueOf(k))
                        .build());
            } else {
                k++;
            }
        }

        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<AverageRequest> avg(StreamObserver<AverageResponse> responseObserver) {
        List<Integer> numbers = new ArrayList<>();

        return new StreamObserver<>() {
            @Override
            public void onNext(AverageRequest averageRequest) {
                numbers.add(averageRequest.getNumber());
            }

            @Override
            public void onError(Throwable t) {
                responseObserver.onError(t);
                responseObserver.onCompleted();
            }

            @Override
            public void onCompleted() {
                double avg = Arrays.stream(Ints.toArray(numbers)).average().orElse(0d);

                responseObserver.onNext(AverageResponse.newBuilder().setResult(avg).build());
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<MaximumRequest> findMaximum(StreamObserver<MaximumResponse> responseObserver) {

        return new StreamObserver<>() {
            Integer lastMaxNumber;

            @Override
            public void onNext(MaximumRequest value) {

                if (lastMaxNumber == null || value.getNumber() > lastMaxNumber) {
                    lastMaxNumber = value.getNumber();
                    responseObserver.onNext(MaximumResponse.newBuilder().setResponse(lastMaxNumber).build());
                }

            }

            @Override
            public void onError(Throwable t) {
                responseObserver.onError(t);
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }

    private void complete(double result, StreamObserver<CalculatorResponse> responseObserver) {

        try {
            CalculatorResponse response = CalculatorResponse
                    .newBuilder()
                    .setResult(result)
                    .build();

            responseObserver.onNext(response);
        } catch (Exception e) {
            responseObserver.onError(e);
        } finally {
            responseObserver.onCompleted();
        }

    }
}
