package com.employeeorg.employeeaddress;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.47.0)",
    comments = "Source: employee-address.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AddressServiceGrpc {

  private AddressServiceGrpc() {}

  public static final String SERVICE_NAME = "AddressService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.employeeorg.employeeaddress.GetEmployeeAddressRequest,
      com.employeeorg.employeeaddress.GetEmployeeAddressResponse> getGetEmployeeAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEmployeeAddress",
      requestType = com.employeeorg.employeeaddress.GetEmployeeAddressRequest.class,
      responseType = com.employeeorg.employeeaddress.GetEmployeeAddressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.employeeorg.employeeaddress.GetEmployeeAddressRequest,
      com.employeeorg.employeeaddress.GetEmployeeAddressResponse> getGetEmployeeAddressMethod() {
    io.grpc.MethodDescriptor<com.employeeorg.employeeaddress.GetEmployeeAddressRequest, com.employeeorg.employeeaddress.GetEmployeeAddressResponse> getGetEmployeeAddressMethod;
    if ((getGetEmployeeAddressMethod = AddressServiceGrpc.getGetEmployeeAddressMethod) == null) {
      synchronized (AddressServiceGrpc.class) {
        if ((getGetEmployeeAddressMethod = AddressServiceGrpc.getGetEmployeeAddressMethod) == null) {
          AddressServiceGrpc.getGetEmployeeAddressMethod = getGetEmployeeAddressMethod =
              io.grpc.MethodDescriptor.<com.employeeorg.employeeaddress.GetEmployeeAddressRequest, com.employeeorg.employeeaddress.GetEmployeeAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEmployeeAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.employeeorg.employeeaddress.GetEmployeeAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.employeeorg.employeeaddress.GetEmployeeAddressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AddressServiceMethodDescriptorSupplier("GetEmployeeAddress"))
              .build();
        }
      }
    }
    return getGetEmployeeAddressMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AddressServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AddressServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AddressServiceStub>() {
        @java.lang.Override
        public AddressServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AddressServiceStub(channel, callOptions);
        }
      };
    return AddressServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AddressServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AddressServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AddressServiceBlockingStub>() {
        @java.lang.Override
        public AddressServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AddressServiceBlockingStub(channel, callOptions);
        }
      };
    return AddressServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AddressServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AddressServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AddressServiceFutureStub>() {
        @java.lang.Override
        public AddressServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AddressServiceFutureStub(channel, callOptions);
        }
      };
    return AddressServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AddressServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getEmployeeAddress(com.employeeorg.employeeaddress.GetEmployeeAddressRequest request,
        io.grpc.stub.StreamObserver<com.employeeorg.employeeaddress.GetEmployeeAddressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEmployeeAddressMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetEmployeeAddressMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.employeeorg.employeeaddress.GetEmployeeAddressRequest,
                com.employeeorg.employeeaddress.GetEmployeeAddressResponse>(
                  this, METHODID_GET_EMPLOYEE_ADDRESS)))
          .build();
    }
  }

  /**
   */
  public static final class AddressServiceStub extends io.grpc.stub.AbstractAsyncStub<AddressServiceStub> {
    private AddressServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddressServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AddressServiceStub(channel, callOptions);
    }

    /**
     */
    public void getEmployeeAddress(com.employeeorg.employeeaddress.GetEmployeeAddressRequest request,
        io.grpc.stub.StreamObserver<com.employeeorg.employeeaddress.GetEmployeeAddressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEmployeeAddressMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AddressServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AddressServiceBlockingStub> {
    private AddressServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddressServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AddressServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.employeeorg.employeeaddress.GetEmployeeAddressResponse getEmployeeAddress(com.employeeorg.employeeaddress.GetEmployeeAddressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEmployeeAddressMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AddressServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AddressServiceFutureStub> {
    private AddressServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddressServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AddressServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.employeeorg.employeeaddress.GetEmployeeAddressResponse> getEmployeeAddress(
        com.employeeorg.employeeaddress.GetEmployeeAddressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEmployeeAddressMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_EMPLOYEE_ADDRESS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AddressServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AddressServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_EMPLOYEE_ADDRESS:
          serviceImpl.getEmployeeAddress((com.employeeorg.employeeaddress.GetEmployeeAddressRequest) request,
              (io.grpc.stub.StreamObserver<com.employeeorg.employeeaddress.GetEmployeeAddressResponse>) responseObserver);
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

  private static abstract class AddressServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AddressServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.employeeorg.employeeaddress.EmployeeAddress.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AddressService");
    }
  }

  private static final class AddressServiceFileDescriptorSupplier
      extends AddressServiceBaseDescriptorSupplier {
    AddressServiceFileDescriptorSupplier() {}
  }

  private static final class AddressServiceMethodDescriptorSupplier
      extends AddressServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AddressServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AddressServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AddressServiceFileDescriptorSupplier())
              .addMethod(getGetEmployeeAddressMethod())
              .build();
        }
      }
    }
    return result;
  }
}
