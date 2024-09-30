// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: employee-address.proto

package com.employeeorg.employeeaddress;

/**
 * Protobuf type {@code GetEmployeeAddressResponse}
 */
public final class GetEmployeeAddressResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GetEmployeeAddressResponse)
    GetEmployeeAddressResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetEmployeeAddressResponse.newBuilder() to construct.
  private GetEmployeeAddressResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetEmployeeAddressResponse() {
    empAddress_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetEmployeeAddressResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetEmployeeAddressResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            empId_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            empAddress_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.employeeorg.employeeaddress.EmployeeAddress.internal_static_GetEmployeeAddressResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.employeeorg.employeeaddress.EmployeeAddress.internal_static_GetEmployeeAddressResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.employeeorg.employeeaddress.GetEmployeeAddressResponse.class, com.employeeorg.employeeaddress.GetEmployeeAddressResponse.Builder.class);
  }

  public static final int EMP_ID_FIELD_NUMBER = 1;
  private int empId_;
  /**
   * <code>int32 emp_id = 1;</code>
   * @return The empId.
   */
  @java.lang.Override
  public int getEmpId() {
    return empId_;
  }

  public static final int EMP_ADDRESS_FIELD_NUMBER = 2;
  private volatile java.lang.Object empAddress_;
  /**
   * <code>string emp_address = 2;</code>
   * @return The empAddress.
   */
  @java.lang.Override
  public java.lang.String getEmpAddress() {
    java.lang.Object ref = empAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      empAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string emp_address = 2;</code>
   * @return The bytes for empAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEmpAddressBytes() {
    java.lang.Object ref = empAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      empAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (empId_ != 0) {
      output.writeInt32(1, empId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(empAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, empAddress_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (empId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, empId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(empAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, empAddress_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.employeeorg.employeeaddress.GetEmployeeAddressResponse)) {
      return super.equals(obj);
    }
    com.employeeorg.employeeaddress.GetEmployeeAddressResponse other = (com.employeeorg.employeeaddress.GetEmployeeAddressResponse) obj;

    if (getEmpId()
        != other.getEmpId()) return false;
    if (!getEmpAddress()
        .equals(other.getEmpAddress())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + EMP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEmpId();
    hash = (37 * hash) + EMP_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getEmpAddress().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.employeeorg.employeeaddress.GetEmployeeAddressResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.employeeorg.employeeaddress.GetEmployeeAddressResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.employeeorg.employeeaddress.GetEmployeeAddressResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.employeeorg.employeeaddress.GetEmployeeAddressResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.employeeorg.employeeaddress.GetEmployeeAddressResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.employeeorg.employeeaddress.GetEmployeeAddressResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.employeeorg.employeeaddress.GetEmployeeAddressResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.employeeorg.employeeaddress.GetEmployeeAddressResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.employeeorg.employeeaddress.GetEmployeeAddressResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.employeeorg.employeeaddress.GetEmployeeAddressResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.employeeorg.employeeaddress.GetEmployeeAddressResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.employeeorg.employeeaddress.GetEmployeeAddressResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.employeeorg.employeeaddress.GetEmployeeAddressResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code GetEmployeeAddressResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GetEmployeeAddressResponse)
      com.employeeorg.employeeaddress.GetEmployeeAddressResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.employeeorg.employeeaddress.EmployeeAddress.internal_static_GetEmployeeAddressResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.employeeorg.employeeaddress.EmployeeAddress.internal_static_GetEmployeeAddressResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.employeeorg.employeeaddress.GetEmployeeAddressResponse.class, com.employeeorg.employeeaddress.GetEmployeeAddressResponse.Builder.class);
    }

    // Construct using com.employeeorg.employeeaddress.GetEmployeeAddressResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      empId_ = 0;

      empAddress_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.employeeorg.employeeaddress.EmployeeAddress.internal_static_GetEmployeeAddressResponse_descriptor;
    }

    @java.lang.Override
    public com.employeeorg.employeeaddress.GetEmployeeAddressResponse getDefaultInstanceForType() {
      return com.employeeorg.employeeaddress.GetEmployeeAddressResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.employeeorg.employeeaddress.GetEmployeeAddressResponse build() {
      com.employeeorg.employeeaddress.GetEmployeeAddressResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.employeeorg.employeeaddress.GetEmployeeAddressResponse buildPartial() {
      com.employeeorg.employeeaddress.GetEmployeeAddressResponse result = new com.employeeorg.employeeaddress.GetEmployeeAddressResponse(this);
      result.empId_ = empId_;
      result.empAddress_ = empAddress_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.employeeorg.employeeaddress.GetEmployeeAddressResponse) {
        return mergeFrom((com.employeeorg.employeeaddress.GetEmployeeAddressResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.employeeorg.employeeaddress.GetEmployeeAddressResponse other) {
      if (other == com.employeeorg.employeeaddress.GetEmployeeAddressResponse.getDefaultInstance()) return this;
      if (other.getEmpId() != 0) {
        setEmpId(other.getEmpId());
      }
      if (!other.getEmpAddress().isEmpty()) {
        empAddress_ = other.empAddress_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.employeeorg.employeeaddress.GetEmployeeAddressResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.employeeorg.employeeaddress.GetEmployeeAddressResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int empId_ ;
    /**
     * <code>int32 emp_id = 1;</code>
     * @return The empId.
     */
    @java.lang.Override
    public int getEmpId() {
      return empId_;
    }
    /**
     * <code>int32 emp_id = 1;</code>
     * @param value The empId to set.
     * @return This builder for chaining.
     */
    public Builder setEmpId(int value) {
      
      empId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 emp_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEmpId() {
      
      empId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object empAddress_ = "";
    /**
     * <code>string emp_address = 2;</code>
     * @return The empAddress.
     */
    public java.lang.String getEmpAddress() {
      java.lang.Object ref = empAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        empAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string emp_address = 2;</code>
     * @return The bytes for empAddress.
     */
    public com.google.protobuf.ByteString
        getEmpAddressBytes() {
      java.lang.Object ref = empAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        empAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string emp_address = 2;</code>
     * @param value The empAddress to set.
     * @return This builder for chaining.
     */
    public Builder setEmpAddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      empAddress_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string emp_address = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEmpAddress() {
      
      empAddress_ = getDefaultInstance().getEmpAddress();
      onChanged();
      return this;
    }
    /**
     * <code>string emp_address = 2;</code>
     * @param value The bytes for empAddress to set.
     * @return This builder for chaining.
     */
    public Builder setEmpAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      empAddress_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:GetEmployeeAddressResponse)
  }

  // @@protoc_insertion_point(class_scope:GetEmployeeAddressResponse)
  private static final com.employeeorg.employeeaddress.GetEmployeeAddressResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.employeeorg.employeeaddress.GetEmployeeAddressResponse();
  }

  public static com.employeeorg.employeeaddress.GetEmployeeAddressResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetEmployeeAddressResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetEmployeeAddressResponse>() {
    @java.lang.Override
    public GetEmployeeAddressResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetEmployeeAddressResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetEmployeeAddressResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetEmployeeAddressResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.employeeorg.employeeaddress.GetEmployeeAddressResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

