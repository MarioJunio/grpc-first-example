package br.com.mj.calculator;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.34.1)",
    comments = "Source: calculator.proto")
public final class CalculatorServiceGrpc {

  private CalculatorServiceGrpc() {}

  public static final String SERVICE_NAME = "calculator.CalculatorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.mj.calculator.CalculatorRequest,
      br.com.mj.calculator.CalculatorResponse> getSumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sum",
      requestType = br.com.mj.calculator.CalculatorRequest.class,
      responseType = br.com.mj.calculator.CalculatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.mj.calculator.CalculatorRequest,
      br.com.mj.calculator.CalculatorResponse> getSumMethod() {
    io.grpc.MethodDescriptor<br.com.mj.calculator.CalculatorRequest, br.com.mj.calculator.CalculatorResponse> getSumMethod;
    if ((getSumMethod = CalculatorServiceGrpc.getSumMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getSumMethod = CalculatorServiceGrpc.getSumMethod) == null) {
          CalculatorServiceGrpc.getSumMethod = getSumMethod =
              io.grpc.MethodDescriptor.<br.com.mj.calculator.CalculatorRequest, br.com.mj.calculator.CalculatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.mj.calculator.CalculatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.mj.calculator.CalculatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("sum"))
              .build();
        }
      }
    }
    return getSumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.mj.calculator.CalculatorRequest,
      br.com.mj.calculator.CalculatorResponse> getSubtractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "subtract",
      requestType = br.com.mj.calculator.CalculatorRequest.class,
      responseType = br.com.mj.calculator.CalculatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.mj.calculator.CalculatorRequest,
      br.com.mj.calculator.CalculatorResponse> getSubtractMethod() {
    io.grpc.MethodDescriptor<br.com.mj.calculator.CalculatorRequest, br.com.mj.calculator.CalculatorResponse> getSubtractMethod;
    if ((getSubtractMethod = CalculatorServiceGrpc.getSubtractMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getSubtractMethod = CalculatorServiceGrpc.getSubtractMethod) == null) {
          CalculatorServiceGrpc.getSubtractMethod = getSubtractMethod =
              io.grpc.MethodDescriptor.<br.com.mj.calculator.CalculatorRequest, br.com.mj.calculator.CalculatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "subtract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.mj.calculator.CalculatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.mj.calculator.CalculatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("subtract"))
              .build();
        }
      }
    }
    return getSubtractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.mj.calculator.CalculatorRequest,
      br.com.mj.calculator.CalculatorResponse> getMultiplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "multiply",
      requestType = br.com.mj.calculator.CalculatorRequest.class,
      responseType = br.com.mj.calculator.CalculatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.mj.calculator.CalculatorRequest,
      br.com.mj.calculator.CalculatorResponse> getMultiplyMethod() {
    io.grpc.MethodDescriptor<br.com.mj.calculator.CalculatorRequest, br.com.mj.calculator.CalculatorResponse> getMultiplyMethod;
    if ((getMultiplyMethod = CalculatorServiceGrpc.getMultiplyMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getMultiplyMethod = CalculatorServiceGrpc.getMultiplyMethod) == null) {
          CalculatorServiceGrpc.getMultiplyMethod = getMultiplyMethod =
              io.grpc.MethodDescriptor.<br.com.mj.calculator.CalculatorRequest, br.com.mj.calculator.CalculatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "multiply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.mj.calculator.CalculatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.mj.calculator.CalculatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("multiply"))
              .build();
        }
      }
    }
    return getMultiplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.mj.calculator.CalculatorRequest,
      br.com.mj.calculator.CalculatorResponse> getDivisionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "division",
      requestType = br.com.mj.calculator.CalculatorRequest.class,
      responseType = br.com.mj.calculator.CalculatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.mj.calculator.CalculatorRequest,
      br.com.mj.calculator.CalculatorResponse> getDivisionMethod() {
    io.grpc.MethodDescriptor<br.com.mj.calculator.CalculatorRequest, br.com.mj.calculator.CalculatorResponse> getDivisionMethod;
    if ((getDivisionMethod = CalculatorServiceGrpc.getDivisionMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getDivisionMethod = CalculatorServiceGrpc.getDivisionMethod) == null) {
          CalculatorServiceGrpc.getDivisionMethod = getDivisionMethod =
              io.grpc.MethodDescriptor.<br.com.mj.calculator.CalculatorRequest, br.com.mj.calculator.CalculatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "division"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.mj.calculator.CalculatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.mj.calculator.CalculatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("division"))
              .build();
        }
      }
    }
    return getDivisionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.mj.calculator.PrimeRequest,
      br.com.mj.calculator.CalculatorResponse> getPrimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "prime",
      requestType = br.com.mj.calculator.PrimeRequest.class,
      responseType = br.com.mj.calculator.CalculatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<br.com.mj.calculator.PrimeRequest,
      br.com.mj.calculator.CalculatorResponse> getPrimeMethod() {
    io.grpc.MethodDescriptor<br.com.mj.calculator.PrimeRequest, br.com.mj.calculator.CalculatorResponse> getPrimeMethod;
    if ((getPrimeMethod = CalculatorServiceGrpc.getPrimeMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getPrimeMethod = CalculatorServiceGrpc.getPrimeMethod) == null) {
          CalculatorServiceGrpc.getPrimeMethod = getPrimeMethod =
              io.grpc.MethodDescriptor.<br.com.mj.calculator.PrimeRequest, br.com.mj.calculator.CalculatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "prime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.mj.calculator.PrimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.mj.calculator.CalculatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("prime"))
              .build();
        }
      }
    }
    return getPrimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.mj.calculator.AverageRequest,
      br.com.mj.calculator.AverageResponse> getAvgMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "avg",
      requestType = br.com.mj.calculator.AverageRequest.class,
      responseType = br.com.mj.calculator.AverageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<br.com.mj.calculator.AverageRequest,
      br.com.mj.calculator.AverageResponse> getAvgMethod() {
    io.grpc.MethodDescriptor<br.com.mj.calculator.AverageRequest, br.com.mj.calculator.AverageResponse> getAvgMethod;
    if ((getAvgMethod = CalculatorServiceGrpc.getAvgMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getAvgMethod = CalculatorServiceGrpc.getAvgMethod) == null) {
          CalculatorServiceGrpc.getAvgMethod = getAvgMethod =
              io.grpc.MethodDescriptor.<br.com.mj.calculator.AverageRequest, br.com.mj.calculator.AverageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "avg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.mj.calculator.AverageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.mj.calculator.AverageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("avg"))
              .build();
        }
      }
    }
    return getAvgMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.mj.calculator.MaximumRequest,
      br.com.mj.calculator.MaximumResponse> getFindMaximumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findMaximum",
      requestType = br.com.mj.calculator.MaximumRequest.class,
      responseType = br.com.mj.calculator.MaximumResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<br.com.mj.calculator.MaximumRequest,
      br.com.mj.calculator.MaximumResponse> getFindMaximumMethod() {
    io.grpc.MethodDescriptor<br.com.mj.calculator.MaximumRequest, br.com.mj.calculator.MaximumResponse> getFindMaximumMethod;
    if ((getFindMaximumMethod = CalculatorServiceGrpc.getFindMaximumMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getFindMaximumMethod = CalculatorServiceGrpc.getFindMaximumMethod) == null) {
          CalculatorServiceGrpc.getFindMaximumMethod = getFindMaximumMethod =
              io.grpc.MethodDescriptor.<br.com.mj.calculator.MaximumRequest, br.com.mj.calculator.MaximumResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findMaximum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.mj.calculator.MaximumRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.mj.calculator.MaximumResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("findMaximum"))
              .build();
        }
      }
    }
    return getFindMaximumMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CalculatorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceStub>() {
        @java.lang.Override
        public CalculatorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculatorServiceStub(channel, callOptions);
        }
      };
    return CalculatorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CalculatorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceBlockingStub>() {
        @java.lang.Override
        public CalculatorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculatorServiceBlockingStub(channel, callOptions);
        }
      };
    return CalculatorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CalculatorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceFutureStub>() {
        @java.lang.Override
        public CalculatorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculatorServiceFutureStub(channel, callOptions);
        }
      };
    return CalculatorServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CalculatorServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sum(br.com.mj.calculator.CalculatorRequest request,
        io.grpc.stub.StreamObserver<br.com.mj.calculator.CalculatorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSumMethod(), responseObserver);
    }

    /**
     */
    public void subtract(br.com.mj.calculator.CalculatorRequest request,
        io.grpc.stub.StreamObserver<br.com.mj.calculator.CalculatorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSubtractMethod(), responseObserver);
    }

    /**
     */
    public void multiply(br.com.mj.calculator.CalculatorRequest request,
        io.grpc.stub.StreamObserver<br.com.mj.calculator.CalculatorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMultiplyMethod(), responseObserver);
    }

    /**
     */
    public void division(br.com.mj.calculator.CalculatorRequest request,
        io.grpc.stub.StreamObserver<br.com.mj.calculator.CalculatorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDivisionMethod(), responseObserver);
    }

    /**
     */
    public void prime(br.com.mj.calculator.PrimeRequest request,
        io.grpc.stub.StreamObserver<br.com.mj.calculator.CalculatorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPrimeMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<br.com.mj.calculator.AverageRequest> avg(
        io.grpc.stub.StreamObserver<br.com.mj.calculator.AverageResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getAvgMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<br.com.mj.calculator.MaximumRequest> findMaximum(
        io.grpc.stub.StreamObserver<br.com.mj.calculator.MaximumResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getFindMaximumMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSumMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.mj.calculator.CalculatorRequest,
                br.com.mj.calculator.CalculatorResponse>(
                  this, METHODID_SUM)))
          .addMethod(
            getSubtractMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.mj.calculator.CalculatorRequest,
                br.com.mj.calculator.CalculatorResponse>(
                  this, METHODID_SUBTRACT)))
          .addMethod(
            getMultiplyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.mj.calculator.CalculatorRequest,
                br.com.mj.calculator.CalculatorResponse>(
                  this, METHODID_MULTIPLY)))
          .addMethod(
            getDivisionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.mj.calculator.CalculatorRequest,
                br.com.mj.calculator.CalculatorResponse>(
                  this, METHODID_DIVISION)))
          .addMethod(
            getPrimeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                br.com.mj.calculator.PrimeRequest,
                br.com.mj.calculator.CalculatorResponse>(
                  this, METHODID_PRIME)))
          .addMethod(
            getAvgMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                br.com.mj.calculator.AverageRequest,
                br.com.mj.calculator.AverageResponse>(
                  this, METHODID_AVG)))
          .addMethod(
            getFindMaximumMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                br.com.mj.calculator.MaximumRequest,
                br.com.mj.calculator.MaximumResponse>(
                  this, METHODID_FIND_MAXIMUM)))
          .build();
    }
  }

  /**
   */
  public static final class CalculatorServiceStub extends io.grpc.stub.AbstractAsyncStub<CalculatorServiceStub> {
    private CalculatorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculatorServiceStub(channel, callOptions);
    }

    /**
     */
    public void sum(br.com.mj.calculator.CalculatorRequest request,
        io.grpc.stub.StreamObserver<br.com.mj.calculator.CalculatorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subtract(br.com.mj.calculator.CalculatorRequest request,
        io.grpc.stub.StreamObserver<br.com.mj.calculator.CalculatorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubtractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void multiply(br.com.mj.calculator.CalculatorRequest request,
        io.grpc.stub.StreamObserver<br.com.mj.calculator.CalculatorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMultiplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void division(br.com.mj.calculator.CalculatorRequest request,
        io.grpc.stub.StreamObserver<br.com.mj.calculator.CalculatorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDivisionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void prime(br.com.mj.calculator.PrimeRequest request,
        io.grpc.stub.StreamObserver<br.com.mj.calculator.CalculatorResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getPrimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<br.com.mj.calculator.AverageRequest> avg(
        io.grpc.stub.StreamObserver<br.com.mj.calculator.AverageResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getAvgMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<br.com.mj.calculator.MaximumRequest> findMaximum(
        io.grpc.stub.StreamObserver<br.com.mj.calculator.MaximumResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getFindMaximumMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class CalculatorServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CalculatorServiceBlockingStub> {
    private CalculatorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculatorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.mj.calculator.CalculatorResponse sum(br.com.mj.calculator.CalculatorRequest request) {
      return blockingUnaryCall(
          getChannel(), getSumMethod(), getCallOptions(), request);
    }

    /**
     */
    public br.com.mj.calculator.CalculatorResponse subtract(br.com.mj.calculator.CalculatorRequest request) {
      return blockingUnaryCall(
          getChannel(), getSubtractMethod(), getCallOptions(), request);
    }

    /**
     */
    public br.com.mj.calculator.CalculatorResponse multiply(br.com.mj.calculator.CalculatorRequest request) {
      return blockingUnaryCall(
          getChannel(), getMultiplyMethod(), getCallOptions(), request);
    }

    /**
     */
    public br.com.mj.calculator.CalculatorResponse division(br.com.mj.calculator.CalculatorRequest request) {
      return blockingUnaryCall(
          getChannel(), getDivisionMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<br.com.mj.calculator.CalculatorResponse> prime(
        br.com.mj.calculator.PrimeRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getPrimeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CalculatorServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CalculatorServiceFutureStub> {
    private CalculatorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculatorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.mj.calculator.CalculatorResponse> sum(
        br.com.mj.calculator.CalculatorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSumMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.mj.calculator.CalculatorResponse> subtract(
        br.com.mj.calculator.CalculatorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSubtractMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.mj.calculator.CalculatorResponse> multiply(
        br.com.mj.calculator.CalculatorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMultiplyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.mj.calculator.CalculatorResponse> division(
        br.com.mj.calculator.CalculatorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDivisionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUM = 0;
  private static final int METHODID_SUBTRACT = 1;
  private static final int METHODID_MULTIPLY = 2;
  private static final int METHODID_DIVISION = 3;
  private static final int METHODID_PRIME = 4;
  private static final int METHODID_AVG = 5;
  private static final int METHODID_FIND_MAXIMUM = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CalculatorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CalculatorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUM:
          serviceImpl.sum((br.com.mj.calculator.CalculatorRequest) request,
              (io.grpc.stub.StreamObserver<br.com.mj.calculator.CalculatorResponse>) responseObserver);
          break;
        case METHODID_SUBTRACT:
          serviceImpl.subtract((br.com.mj.calculator.CalculatorRequest) request,
              (io.grpc.stub.StreamObserver<br.com.mj.calculator.CalculatorResponse>) responseObserver);
          break;
        case METHODID_MULTIPLY:
          serviceImpl.multiply((br.com.mj.calculator.CalculatorRequest) request,
              (io.grpc.stub.StreamObserver<br.com.mj.calculator.CalculatorResponse>) responseObserver);
          break;
        case METHODID_DIVISION:
          serviceImpl.division((br.com.mj.calculator.CalculatorRequest) request,
              (io.grpc.stub.StreamObserver<br.com.mj.calculator.CalculatorResponse>) responseObserver);
          break;
        case METHODID_PRIME:
          serviceImpl.prime((br.com.mj.calculator.PrimeRequest) request,
              (io.grpc.stub.StreamObserver<br.com.mj.calculator.CalculatorResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AVG:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.avg(
              (io.grpc.stub.StreamObserver<br.com.mj.calculator.AverageResponse>) responseObserver);
        case METHODID_FIND_MAXIMUM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.findMaximum(
              (io.grpc.stub.StreamObserver<br.com.mj.calculator.MaximumResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CalculatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CalculatorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.mj.calculator.Calculator.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CalculatorService");
    }
  }

  private static final class CalculatorServiceFileDescriptorSupplier
      extends CalculatorServiceBaseDescriptorSupplier {
    CalculatorServiceFileDescriptorSupplier() {}
  }

  private static final class CalculatorServiceMethodDescriptorSupplier
      extends CalculatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CalculatorServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CalculatorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CalculatorServiceFileDescriptorSupplier())
              .addMethod(getSumMethod())
              .addMethod(getSubtractMethod())
              .addMethod(getMultiplyMethod())
              .addMethod(getDivisionMethod())
              .addMethod(getPrimeMethod())
              .addMethod(getAvgMethod())
              .addMethod(getFindMaximumMethod())
              .build();
        }
      }
    }
    return result;
  }
}
