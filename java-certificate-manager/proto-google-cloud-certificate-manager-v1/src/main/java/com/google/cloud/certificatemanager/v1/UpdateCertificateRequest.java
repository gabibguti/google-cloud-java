/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/certificatemanager/v1/certificate_manager.proto

package com.google.cloud.certificatemanager.v1;

/**
 *
 *
 * <pre>
 * Request for the `UpdateCertificate` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.certificatemanager.v1.UpdateCertificateRequest}
 */
public final class UpdateCertificateRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.certificatemanager.v1.UpdateCertificateRequest)
    UpdateCertificateRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateCertificateRequest.newBuilder() to construct.
  private UpdateCertificateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateCertificateRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateCertificateRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.certificatemanager.v1.CertificateManagerProto
        .internal_static_google_cloud_certificatemanager_v1_UpdateCertificateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.certificatemanager.v1.CertificateManagerProto
        .internal_static_google_cloud_certificatemanager_v1_UpdateCertificateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.certificatemanager.v1.UpdateCertificateRequest.class,
            com.google.cloud.certificatemanager.v1.UpdateCertificateRequest.Builder.class);
  }

  public static final int CERTIFICATE_FIELD_NUMBER = 1;
  private com.google.cloud.certificatemanager.v1.Certificate certificate_;
  /**
   *
   *
   * <pre>
   * Required. A definition of the certificate to update.
   * </pre>
   *
   * <code>
   * .google.cloud.certificatemanager.v1.Certificate certificate = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the certificate field is set.
   */
  @java.lang.Override
  public boolean hasCertificate() {
    return certificate_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. A definition of the certificate to update.
   * </pre>
   *
   * <code>
   * .google.cloud.certificatemanager.v1.Certificate certificate = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The certificate.
   */
  @java.lang.Override
  public com.google.cloud.certificatemanager.v1.Certificate getCertificate() {
    return certificate_ == null
        ? com.google.cloud.certificatemanager.v1.Certificate.getDefaultInstance()
        : certificate_;
  }
  /**
   *
   *
   * <pre>
   * Required. A definition of the certificate to update.
   * </pre>
   *
   * <code>
   * .google.cloud.certificatemanager.v1.Certificate certificate = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.certificatemanager.v1.CertificateOrBuilder getCertificateOrBuilder() {
    return certificate_ == null
        ? com.google.cloud.certificatemanager.v1.Certificate.getDefaultInstance()
        : certificate_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Required. The update mask applies to the resource. For the `FieldMask`
   * definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The update mask applies to the resource. For the `FieldMask`
   * definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Required. The update mask applies to the resource. For the `FieldMask`
   * definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (certificate_ != null) {
      output.writeMessage(1, getCertificate());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (certificate_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getCertificate());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.certificatemanager.v1.UpdateCertificateRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.certificatemanager.v1.UpdateCertificateRequest other =
        (com.google.cloud.certificatemanager.v1.UpdateCertificateRequest) obj;

    if (hasCertificate() != other.hasCertificate()) return false;
    if (hasCertificate()) {
      if (!getCertificate().equals(other.getCertificate())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasCertificate()) {
      hash = (37 * hash) + CERTIFICATE_FIELD_NUMBER;
      hash = (53 * hash) + getCertificate().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.certificatemanager.v1.UpdateCertificateRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.certificatemanager.v1.UpdateCertificateRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.certificatemanager.v1.UpdateCertificateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.certificatemanager.v1.UpdateCertificateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.certificatemanager.v1.UpdateCertificateRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.certificatemanager.v1.UpdateCertificateRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.certificatemanager.v1.UpdateCertificateRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.certificatemanager.v1.UpdateCertificateRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.certificatemanager.v1.UpdateCertificateRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.certificatemanager.v1.UpdateCertificateRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.certificatemanager.v1.UpdateCertificateRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.certificatemanager.v1.UpdateCertificateRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.certificatemanager.v1.UpdateCertificateRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request for the `UpdateCertificate` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.certificatemanager.v1.UpdateCertificateRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.certificatemanager.v1.UpdateCertificateRequest)
      com.google.cloud.certificatemanager.v1.UpdateCertificateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.certificatemanager.v1.CertificateManagerProto
          .internal_static_google_cloud_certificatemanager_v1_UpdateCertificateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.certificatemanager.v1.CertificateManagerProto
          .internal_static_google_cloud_certificatemanager_v1_UpdateCertificateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.certificatemanager.v1.UpdateCertificateRequest.class,
              com.google.cloud.certificatemanager.v1.UpdateCertificateRequest.Builder.class);
    }

    // Construct using com.google.cloud.certificatemanager.v1.UpdateCertificateRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      certificate_ = null;
      if (certificateBuilder_ != null) {
        certificateBuilder_.dispose();
        certificateBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.certificatemanager.v1.CertificateManagerProto
          .internal_static_google_cloud_certificatemanager_v1_UpdateCertificateRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.certificatemanager.v1.UpdateCertificateRequest
        getDefaultInstanceForType() {
      return com.google.cloud.certificatemanager.v1.UpdateCertificateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.certificatemanager.v1.UpdateCertificateRequest build() {
      com.google.cloud.certificatemanager.v1.UpdateCertificateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.certificatemanager.v1.UpdateCertificateRequest buildPartial() {
      com.google.cloud.certificatemanager.v1.UpdateCertificateRequest result =
          new com.google.cloud.certificatemanager.v1.UpdateCertificateRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.certificatemanager.v1.UpdateCertificateRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.certificate_ =
            certificateBuilder_ == null ? certificate_ : certificateBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.certificatemanager.v1.UpdateCertificateRequest) {
        return mergeFrom((com.google.cloud.certificatemanager.v1.UpdateCertificateRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.certificatemanager.v1.UpdateCertificateRequest other) {
      if (other
          == com.google.cloud.certificatemanager.v1.UpdateCertificateRequest.getDefaultInstance())
        return this;
      if (other.hasCertificate()) {
        mergeCertificate(other.getCertificate());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                input.readMessage(getCertificateFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private com.google.cloud.certificatemanager.v1.Certificate certificate_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.certificatemanager.v1.Certificate,
            com.google.cloud.certificatemanager.v1.Certificate.Builder,
            com.google.cloud.certificatemanager.v1.CertificateOrBuilder>
        certificateBuilder_;
    /**
     *
     *
     * <pre>
     * Required. A definition of the certificate to update.
     * </pre>
     *
     * <code>
     * .google.cloud.certificatemanager.v1.Certificate certificate = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the certificate field is set.
     */
    public boolean hasCertificate() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. A definition of the certificate to update.
     * </pre>
     *
     * <code>
     * .google.cloud.certificatemanager.v1.Certificate certificate = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The certificate.
     */
    public com.google.cloud.certificatemanager.v1.Certificate getCertificate() {
      if (certificateBuilder_ == null) {
        return certificate_ == null
            ? com.google.cloud.certificatemanager.v1.Certificate.getDefaultInstance()
            : certificate_;
      } else {
        return certificateBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A definition of the certificate to update.
     * </pre>
     *
     * <code>
     * .google.cloud.certificatemanager.v1.Certificate certificate = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setCertificate(com.google.cloud.certificatemanager.v1.Certificate value) {
      if (certificateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        certificate_ = value;
      } else {
        certificateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A definition of the certificate to update.
     * </pre>
     *
     * <code>
     * .google.cloud.certificatemanager.v1.Certificate certificate = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setCertificate(
        com.google.cloud.certificatemanager.v1.Certificate.Builder builderForValue) {
      if (certificateBuilder_ == null) {
        certificate_ = builderForValue.build();
      } else {
        certificateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A definition of the certificate to update.
     * </pre>
     *
     * <code>
     * .google.cloud.certificatemanager.v1.Certificate certificate = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeCertificate(com.google.cloud.certificatemanager.v1.Certificate value) {
      if (certificateBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && certificate_ != null
            && certificate_
                != com.google.cloud.certificatemanager.v1.Certificate.getDefaultInstance()) {
          getCertificateBuilder().mergeFrom(value);
        } else {
          certificate_ = value;
        }
      } else {
        certificateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A definition of the certificate to update.
     * </pre>
     *
     * <code>
     * .google.cloud.certificatemanager.v1.Certificate certificate = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearCertificate() {
      bitField0_ = (bitField0_ & ~0x00000001);
      certificate_ = null;
      if (certificateBuilder_ != null) {
        certificateBuilder_.dispose();
        certificateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A definition of the certificate to update.
     * </pre>
     *
     * <code>
     * .google.cloud.certificatemanager.v1.Certificate certificate = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.certificatemanager.v1.Certificate.Builder getCertificateBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCertificateFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. A definition of the certificate to update.
     * </pre>
     *
     * <code>
     * .google.cloud.certificatemanager.v1.Certificate certificate = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.certificatemanager.v1.CertificateOrBuilder getCertificateOrBuilder() {
      if (certificateBuilder_ != null) {
        return certificateBuilder_.getMessageOrBuilder();
      } else {
        return certificate_ == null
            ? com.google.cloud.certificatemanager.v1.Certificate.getDefaultInstance()
            : certificate_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A definition of the certificate to update.
     * </pre>
     *
     * <code>
     * .google.cloud.certificatemanager.v1.Certificate certificate = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.certificatemanager.v1.Certificate,
            com.google.cloud.certificatemanager.v1.Certificate.Builder,
            com.google.cloud.certificatemanager.v1.CertificateOrBuilder>
        getCertificateFieldBuilder() {
      if (certificateBuilder_ == null) {
        certificateBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.certificatemanager.v1.Certificate,
                com.google.cloud.certificatemanager.v1.Certificate.Builder,
                com.google.cloud.certificatemanager.v1.CertificateOrBuilder>(
                getCertificate(), getParentForChildren(), isClean());
        certificate_ = null;
      }
      return certificateBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The update mask applies to the resource. For the `FieldMask`
     * definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The update mask applies to the resource. For the `FieldMask`
     * definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The update mask applies to the resource. For the `FieldMask`
     * definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The update mask applies to the resource. For the `FieldMask`
     * definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The update mask applies to the resource. For the `FieldMask`
     * definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The update mask applies to the resource. For the `FieldMask`
     * definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The update mask applies to the resource. For the `FieldMask`
     * definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The update mask applies to the resource. For the `FieldMask`
     * definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The update mask applies to the resource. For the `FieldMask`
     * definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.certificatemanager.v1.UpdateCertificateRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.certificatemanager.v1.UpdateCertificateRequest)
  private static final com.google.cloud.certificatemanager.v1.UpdateCertificateRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.certificatemanager.v1.UpdateCertificateRequest();
  }

  public static com.google.cloud.certificatemanager.v1.UpdateCertificateRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateCertificateRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateCertificateRequest>() {
        @java.lang.Override
        public UpdateCertificateRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<UpdateCertificateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateCertificateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.certificatemanager.v1.UpdateCertificateRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
