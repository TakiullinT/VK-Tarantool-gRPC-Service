package com.example.grpc.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: kv_store.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class KVStoreServiceGrpc {

  private KVStoreServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.example.grpc.KVStoreService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.generated.PutRequest,
      com.example.grpc.generated.PutResponse> getPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "put",
      requestType = com.example.grpc.generated.PutRequest.class,
      responseType = com.example.grpc.generated.PutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.generated.PutRequest,
      com.example.grpc.generated.PutResponse> getPutMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.generated.PutRequest, com.example.grpc.generated.PutResponse> getPutMethod;
    if ((getPutMethod = KVStoreServiceGrpc.getPutMethod) == null) {
      synchronized (KVStoreServiceGrpc.class) {
        if ((getPutMethod = KVStoreServiceGrpc.getPutMethod) == null) {
          KVStoreServiceGrpc.getPutMethod = getPutMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.generated.PutRequest, com.example.grpc.generated.PutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "put"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.generated.PutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.generated.PutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KVStoreServiceMethodDescriptorSupplier("put"))
              .build();
        }
      }
    }
    return getPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.generated.GetRequest,
      com.example.grpc.generated.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = com.example.grpc.generated.GetRequest.class,
      responseType = com.example.grpc.generated.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.generated.GetRequest,
      com.example.grpc.generated.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.generated.GetRequest, com.example.grpc.generated.GetResponse> getGetMethod;
    if ((getGetMethod = KVStoreServiceGrpc.getGetMethod) == null) {
      synchronized (KVStoreServiceGrpc.class) {
        if ((getGetMethod = KVStoreServiceGrpc.getGetMethod) == null) {
          KVStoreServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.generated.GetRequest, com.example.grpc.generated.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.generated.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.generated.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KVStoreServiceMethodDescriptorSupplier("get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.generated.DeleteRequest,
      com.example.grpc.generated.DeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = com.example.grpc.generated.DeleteRequest.class,
      responseType = com.example.grpc.generated.DeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.generated.DeleteRequest,
      com.example.grpc.generated.DeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.generated.DeleteRequest, com.example.grpc.generated.DeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = KVStoreServiceGrpc.getDeleteMethod) == null) {
      synchronized (KVStoreServiceGrpc.class) {
        if ((getDeleteMethod = KVStoreServiceGrpc.getDeleteMethod) == null) {
          KVStoreServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.generated.DeleteRequest, com.example.grpc.generated.DeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.generated.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.generated.DeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KVStoreServiceMethodDescriptorSupplier("delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.generated.RangeRequest,
      com.example.grpc.generated.KeyValueEntry> getRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "range",
      requestType = com.example.grpc.generated.RangeRequest.class,
      responseType = com.example.grpc.generated.KeyValueEntry.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.generated.RangeRequest,
      com.example.grpc.generated.KeyValueEntry> getRangeMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.generated.RangeRequest, com.example.grpc.generated.KeyValueEntry> getRangeMethod;
    if ((getRangeMethod = KVStoreServiceGrpc.getRangeMethod) == null) {
      synchronized (KVStoreServiceGrpc.class) {
        if ((getRangeMethod = KVStoreServiceGrpc.getRangeMethod) == null) {
          KVStoreServiceGrpc.getRangeMethod = getRangeMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.generated.RangeRequest, com.example.grpc.generated.KeyValueEntry>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "range"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.generated.RangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.generated.KeyValueEntry.getDefaultInstance()))
              .setSchemaDescriptor(new KVStoreServiceMethodDescriptorSupplier("range"))
              .build();
        }
      }
    }
    return getRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.generated.CountRequest,
      com.example.grpc.generated.CountResponse> getCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "count",
      requestType = com.example.grpc.generated.CountRequest.class,
      responseType = com.example.grpc.generated.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.generated.CountRequest,
      com.example.grpc.generated.CountResponse> getCountMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.generated.CountRequest, com.example.grpc.generated.CountResponse> getCountMethod;
    if ((getCountMethod = KVStoreServiceGrpc.getCountMethod) == null) {
      synchronized (KVStoreServiceGrpc.class) {
        if ((getCountMethod = KVStoreServiceGrpc.getCountMethod) == null) {
          KVStoreServiceGrpc.getCountMethod = getCountMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.generated.CountRequest, com.example.grpc.generated.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "count"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.generated.CountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.generated.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KVStoreServiceMethodDescriptorSupplier("count"))
              .build();
        }
      }
    }
    return getCountMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KVStoreServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KVStoreServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KVStoreServiceStub>() {
        @java.lang.Override
        public KVStoreServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KVStoreServiceStub(channel, callOptions);
        }
      };
    return KVStoreServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KVStoreServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KVStoreServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KVStoreServiceBlockingStub>() {
        @java.lang.Override
        public KVStoreServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KVStoreServiceBlockingStub(channel, callOptions);
        }
      };
    return KVStoreServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KVStoreServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KVStoreServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KVStoreServiceFutureStub>() {
        @java.lang.Override
        public KVStoreServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KVStoreServiceFutureStub(channel, callOptions);
        }
      };
    return KVStoreServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void put(com.example.grpc.generated.PutRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.generated.PutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutMethod(), responseObserver);
    }

    /**
     */
    default void get(com.example.grpc.generated.GetRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.generated.GetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    default void delete(com.example.grpc.generated.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.generated.DeleteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    default void range(com.example.grpc.generated.RangeRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.generated.KeyValueEntry> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRangeMethod(), responseObserver);
    }

    /**
     */
    default void count(com.example.grpc.generated.CountRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.generated.CountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service KVStoreService.
   */
  public static abstract class KVStoreServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return KVStoreServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service KVStoreService.
   */
  public static final class KVStoreServiceStub
      extends io.grpc.stub.AbstractAsyncStub<KVStoreServiceStub> {
    private KVStoreServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KVStoreServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KVStoreServiceStub(channel, callOptions);
    }

    /**
     */
    public void put(com.example.grpc.generated.PutRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.generated.PutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(com.example.grpc.generated.GetRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.generated.GetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(com.example.grpc.generated.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.generated.DeleteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void range(com.example.grpc.generated.RangeRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.generated.KeyValueEntry> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void count(com.example.grpc.generated.CountRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.generated.CountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service KVStoreService.
   */
  public static final class KVStoreServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<KVStoreServiceBlockingStub> {
    private KVStoreServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KVStoreServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KVStoreServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.generated.PutResponse put(com.example.grpc.generated.PutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.generated.GetResponse get(com.example.grpc.generated.GetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.generated.DeleteResponse delete(com.example.grpc.generated.DeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.example.grpc.generated.KeyValueEntry> range(
        com.example.grpc.generated.RangeRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getRangeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.generated.CountResponse count(com.example.grpc.generated.CountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service KVStoreService.
   */
  public static final class KVStoreServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<KVStoreServiceFutureStub> {
    private KVStoreServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KVStoreServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KVStoreServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.generated.PutResponse> put(
        com.example.grpc.generated.PutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.generated.GetResponse> get(
        com.example.grpc.generated.GetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.generated.DeleteResponse> delete(
        com.example.grpc.generated.DeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.generated.CountResponse> count(
        com.example.grpc.generated.CountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUT = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_DELETE = 2;
  private static final int METHODID_RANGE = 3;
  private static final int METHODID_COUNT = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUT:
          serviceImpl.put((com.example.grpc.generated.PutRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.generated.PutResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.example.grpc.generated.GetRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.generated.GetResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.example.grpc.generated.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.generated.DeleteResponse>) responseObserver);
          break;
        case METHODID_RANGE:
          serviceImpl.range((com.example.grpc.generated.RangeRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.generated.KeyValueEntry>) responseObserver);
          break;
        case METHODID_COUNT:
          serviceImpl.count((com.example.grpc.generated.CountRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.generated.CountResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getPutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.generated.PutRequest,
              com.example.grpc.generated.PutResponse>(
                service, METHODID_PUT)))
        .addMethod(
          getGetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.generated.GetRequest,
              com.example.grpc.generated.GetResponse>(
                service, METHODID_GET)))
        .addMethod(
          getDeleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.generated.DeleteRequest,
              com.example.grpc.generated.DeleteResponse>(
                service, METHODID_DELETE)))
        .addMethod(
          getRangeMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.example.grpc.generated.RangeRequest,
              com.example.grpc.generated.KeyValueEntry>(
                service, METHODID_RANGE)))
        .addMethod(
          getCountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.generated.CountRequest,
              com.example.grpc.generated.CountResponse>(
                service, METHODID_COUNT)))
        .build();
  }

  private static abstract class KVStoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KVStoreServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.generated.KvStore.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KVStoreService");
    }
  }

  private static final class KVStoreServiceFileDescriptorSupplier
      extends KVStoreServiceBaseDescriptorSupplier {
    KVStoreServiceFileDescriptorSupplier() {}
  }

  private static final class KVStoreServiceMethodDescriptorSupplier
      extends KVStoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    KVStoreServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (KVStoreServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KVStoreServiceFileDescriptorSupplier())
              .addMethod(getPutMethod())
              .addMethod(getGetMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getRangeMethod())
              .addMethod(getCountMethod())
              .build();
        }
      }
    }
    return result;
  }
}
