package com.cd.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.1)",
    comments = "Source: CartService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CartServiceGrpc {

  private CartServiceGrpc() {}

  public static final String SERVICE_NAME = "CartService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.cd.proto.AddCartRequest,
      com.cd.proto.AddCartResponse> getAddCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addCart",
      requestType = com.cd.proto.AddCartRequest.class,
      responseType = com.cd.proto.AddCartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cd.proto.AddCartRequest,
      com.cd.proto.AddCartResponse> getAddCartMethod() {
    io.grpc.MethodDescriptor<com.cd.proto.AddCartRequest, com.cd.proto.AddCartResponse> getAddCartMethod;
    if ((getAddCartMethod = CartServiceGrpc.getAddCartMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getAddCartMethod = CartServiceGrpc.getAddCartMethod) == null) {
          CartServiceGrpc.getAddCartMethod = getAddCartMethod =
              io.grpc.MethodDescriptor.<com.cd.proto.AddCartRequest, com.cd.proto.AddCartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cd.proto.AddCartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cd.proto.AddCartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("addCart"))
              .build();
        }
      }
    }
    return getAddCartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cd.proto.GetCartRequest,
      com.cd.proto.GetCartResponse> getGetCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCart",
      requestType = com.cd.proto.GetCartRequest.class,
      responseType = com.cd.proto.GetCartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cd.proto.GetCartRequest,
      com.cd.proto.GetCartResponse> getGetCartMethod() {
    io.grpc.MethodDescriptor<com.cd.proto.GetCartRequest, com.cd.proto.GetCartResponse> getGetCartMethod;
    if ((getGetCartMethod = CartServiceGrpc.getGetCartMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getGetCartMethod = CartServiceGrpc.getGetCartMethod) == null) {
          CartServiceGrpc.getGetCartMethod = getGetCartMethod =
              io.grpc.MethodDescriptor.<com.cd.proto.GetCartRequest, com.cd.proto.GetCartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cd.proto.GetCartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cd.proto.GetCartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("getCart"))
              .build();
        }
      }
    }
    return getGetCartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cd.proto.AddToCartRequest,
      com.cd.proto.AddToCartResponse> getAddToCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addToCart",
      requestType = com.cd.proto.AddToCartRequest.class,
      responseType = com.cd.proto.AddToCartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cd.proto.AddToCartRequest,
      com.cd.proto.AddToCartResponse> getAddToCartMethod() {
    io.grpc.MethodDescriptor<com.cd.proto.AddToCartRequest, com.cd.proto.AddToCartResponse> getAddToCartMethod;
    if ((getAddToCartMethod = CartServiceGrpc.getAddToCartMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getAddToCartMethod = CartServiceGrpc.getAddToCartMethod) == null) {
          CartServiceGrpc.getAddToCartMethod = getAddToCartMethod =
              io.grpc.MethodDescriptor.<com.cd.proto.AddToCartRequest, com.cd.proto.AddToCartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addToCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cd.proto.AddToCartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cd.proto.AddToCartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("addToCart"))
              .build();
        }
      }
    }
    return getAddToCartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cd.proto.DeleteFromCartRequest,
      com.cd.proto.DeleteFromCartResponse> getDeleteFromCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteFromCart",
      requestType = com.cd.proto.DeleteFromCartRequest.class,
      responseType = com.cd.proto.DeleteFromCartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cd.proto.DeleteFromCartRequest,
      com.cd.proto.DeleteFromCartResponse> getDeleteFromCartMethod() {
    io.grpc.MethodDescriptor<com.cd.proto.DeleteFromCartRequest, com.cd.proto.DeleteFromCartResponse> getDeleteFromCartMethod;
    if ((getDeleteFromCartMethod = CartServiceGrpc.getDeleteFromCartMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getDeleteFromCartMethod = CartServiceGrpc.getDeleteFromCartMethod) == null) {
          CartServiceGrpc.getDeleteFromCartMethod = getDeleteFromCartMethod =
              io.grpc.MethodDescriptor.<com.cd.proto.DeleteFromCartRequest, com.cd.proto.DeleteFromCartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteFromCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cd.proto.DeleteFromCartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cd.proto.DeleteFromCartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("deleteFromCart"))
              .build();
        }
      }
    }
    return getDeleteFromCartMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CartServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CartServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CartServiceStub>() {
        @java.lang.Override
        public CartServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CartServiceStub(channel, callOptions);
        }
      };
    return CartServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CartServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CartServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CartServiceBlockingStub>() {
        @java.lang.Override
        public CartServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CartServiceBlockingStub(channel, callOptions);
        }
      };
    return CartServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CartServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CartServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CartServiceFutureStub>() {
        @java.lang.Override
        public CartServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CartServiceFutureStub(channel, callOptions);
        }
      };
    return CartServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void addCart(com.cd.proto.AddCartRequest request,
        io.grpc.stub.StreamObserver<com.cd.proto.AddCartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddCartMethod(), responseObserver);
    }

    /**
     */
    default void getCart(com.cd.proto.GetCartRequest request,
        io.grpc.stub.StreamObserver<com.cd.proto.GetCartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCartMethod(), responseObserver);
    }

    /**
     */
    default void addToCart(com.cd.proto.AddToCartRequest request,
        io.grpc.stub.StreamObserver<com.cd.proto.AddToCartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddToCartMethod(), responseObserver);
    }

    /**
     */
    default void deleteFromCart(com.cd.proto.DeleteFromCartRequest request,
        io.grpc.stub.StreamObserver<com.cd.proto.DeleteFromCartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFromCartMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CartService.
   */
  public static abstract class CartServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CartServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CartService.
   */
  public static final class CartServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CartServiceStub> {
    private CartServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CartServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CartServiceStub(channel, callOptions);
    }

    /**
     */
    public void addCart(com.cd.proto.AddCartRequest request,
        io.grpc.stub.StreamObserver<com.cd.proto.AddCartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddCartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCart(com.cd.proto.GetCartRequest request,
        io.grpc.stub.StreamObserver<com.cd.proto.GetCartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addToCart(com.cd.proto.AddToCartRequest request,
        io.grpc.stub.StreamObserver<com.cd.proto.AddToCartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddToCartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteFromCart(com.cd.proto.DeleteFromCartRequest request,
        io.grpc.stub.StreamObserver<com.cd.proto.DeleteFromCartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFromCartMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CartService.
   */
  public static final class CartServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CartServiceBlockingStub> {
    private CartServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CartServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CartServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.cd.proto.AddCartResponse addCart(com.cd.proto.AddCartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddCartMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cd.proto.GetCartResponse getCart(com.cd.proto.GetCartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCartMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cd.proto.AddToCartResponse addToCart(com.cd.proto.AddToCartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddToCartMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cd.proto.DeleteFromCartResponse deleteFromCart(com.cd.proto.DeleteFromCartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFromCartMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CartService.
   */
  public static final class CartServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CartServiceFutureStub> {
    private CartServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CartServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CartServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cd.proto.AddCartResponse> addCart(
        com.cd.proto.AddCartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddCartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cd.proto.GetCartResponse> getCart(
        com.cd.proto.GetCartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cd.proto.AddToCartResponse> addToCart(
        com.cd.proto.AddToCartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddToCartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cd.proto.DeleteFromCartResponse> deleteFromCart(
        com.cd.proto.DeleteFromCartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFromCartMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_CART = 0;
  private static final int METHODID_GET_CART = 1;
  private static final int METHODID_ADD_TO_CART = 2;
  private static final int METHODID_DELETE_FROM_CART = 3;

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
        case METHODID_ADD_CART:
          serviceImpl.addCart((com.cd.proto.AddCartRequest) request,
              (io.grpc.stub.StreamObserver<com.cd.proto.AddCartResponse>) responseObserver);
          break;
        case METHODID_GET_CART:
          serviceImpl.getCart((com.cd.proto.GetCartRequest) request,
              (io.grpc.stub.StreamObserver<com.cd.proto.GetCartResponse>) responseObserver);
          break;
        case METHODID_ADD_TO_CART:
          serviceImpl.addToCart((com.cd.proto.AddToCartRequest) request,
              (io.grpc.stub.StreamObserver<com.cd.proto.AddToCartResponse>) responseObserver);
          break;
        case METHODID_DELETE_FROM_CART:
          serviceImpl.deleteFromCart((com.cd.proto.DeleteFromCartRequest) request,
              (io.grpc.stub.StreamObserver<com.cd.proto.DeleteFromCartResponse>) responseObserver);
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
          getAddCartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cd.proto.AddCartRequest,
              com.cd.proto.AddCartResponse>(
                service, METHODID_ADD_CART)))
        .addMethod(
          getGetCartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cd.proto.GetCartRequest,
              com.cd.proto.GetCartResponse>(
                service, METHODID_GET_CART)))
        .addMethod(
          getAddToCartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cd.proto.AddToCartRequest,
              com.cd.proto.AddToCartResponse>(
                service, METHODID_ADD_TO_CART)))
        .addMethod(
          getDeleteFromCartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.cd.proto.DeleteFromCartRequest,
              com.cd.proto.DeleteFromCartResponse>(
                service, METHODID_DELETE_FROM_CART)))
        .build();
  }

  private static abstract class CartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CartServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.cd.proto.CartServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CartService");
    }
  }

  private static final class CartServiceFileDescriptorSupplier
      extends CartServiceBaseDescriptorSupplier {
    CartServiceFileDescriptorSupplier() {}
  }

  private static final class CartServiceMethodDescriptorSupplier
      extends CartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CartServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CartServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CartServiceFileDescriptorSupplier())
              .addMethod(getAddCartMethod())
              .addMethod(getGetCartMethod())
              .addMethod(getAddToCartMethod())
              .addMethod(getDeleteFromCartMethod())
              .build();
        }
      }
    }
    return result;
  }
}
