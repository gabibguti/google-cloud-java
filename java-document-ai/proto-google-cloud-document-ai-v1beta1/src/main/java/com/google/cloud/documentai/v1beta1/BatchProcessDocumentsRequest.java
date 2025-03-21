/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/documentai/v1beta1/document_understanding.proto

package com.google.cloud.documentai.v1beta1;

/**
 *
 *
 * <pre>
 * Request to batch process documents as an asynchronous operation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest}
 */
public final class BatchProcessDocumentsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest)
    BatchProcessDocumentsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BatchProcessDocumentsRequest.newBuilder() to construct.
  private BatchProcessDocumentsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchProcessDocumentsRequest() {
    requests_ = java.util.Collections.emptyList();
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BatchProcessDocumentsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.documentai.v1beta1.DocumentAiProto
        .internal_static_google_cloud_documentai_v1beta1_BatchProcessDocumentsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.documentai.v1beta1.DocumentAiProto
        .internal_static_google_cloud_documentai_v1beta1_BatchProcessDocumentsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest.class,
            com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest.Builder.class);
  }

  public static final int REQUESTS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.documentai.v1beta1.ProcessDocumentRequest> requests_;
  /**
   *
   *
   * <pre>
   * Required. Individual requests for each document.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.documentai.v1beta1.ProcessDocumentRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.documentai.v1beta1.ProcessDocumentRequest>
      getRequestsList() {
    return requests_;
  }
  /**
   *
   *
   * <pre>
   * Required. Individual requests for each document.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.documentai.v1beta1.ProcessDocumentRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public java.util.List<
          ? extends com.google.cloud.documentai.v1beta1.ProcessDocumentRequestOrBuilder>
      getRequestsOrBuilderList() {
    return requests_;
  }
  /**
   *
   *
   * <pre>
   * Required. Individual requests for each document.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.documentai.v1beta1.ProcessDocumentRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public int getRequestsCount() {
    return requests_.size();
  }
  /**
   *
   *
   * <pre>
   * Required. Individual requests for each document.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.documentai.v1beta1.ProcessDocumentRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1beta1.ProcessDocumentRequest getRequests(int index) {
    return requests_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Required. Individual requests for each document.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.documentai.v1beta1.ProcessDocumentRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1beta1.ProcessDocumentRequestOrBuilder getRequestsOrBuilder(
      int index) {
    return requests_.get(index);
  }

  public static final int PARENT_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Target project and location to make a call.
   *
   * Format: `projects/{project-id}/locations/{location-id}`.
   *
   * If no location is specified, a region will be chosen automatically.
   * </pre>
   *
   * <code>string parent = 2;</code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Target project and location to make a call.
   *
   * Format: `projects/{project-id}/locations/{location-id}`.
   *
   * If no location is specified, a region will be chosen automatically.
   * </pre>
   *
   * <code>string parent = 2;</code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < requests_.size(); i++) {
      output.writeMessage(1, requests_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, parent_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < requests_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, requests_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, parent_);
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
    if (!(obj instanceof com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest other =
        (com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest) obj;

    if (!getRequestsList().equals(other.getRequestsList())) return false;
    if (!getParent().equals(other.getParent())) return false;
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
    if (getRequestsCount() > 0) {
      hash = (37 * hash) + REQUESTS_FIELD_NUMBER;
      hash = (53 * hash) + getRequestsList().hashCode();
    }
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest parseFrom(
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
      com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest prototype) {
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
   * Request to batch process documents as an asynchronous operation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest)
      com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.documentai.v1beta1.DocumentAiProto
          .internal_static_google_cloud_documentai_v1beta1_BatchProcessDocumentsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.documentai.v1beta1.DocumentAiProto
          .internal_static_google_cloud_documentai_v1beta1_BatchProcessDocumentsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest.class,
              com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest.Builder.class);
    }

    // Construct using com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (requestsBuilder_ == null) {
        requests_ = java.util.Collections.emptyList();
      } else {
        requests_ = null;
        requestsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      parent_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.documentai.v1beta1.DocumentAiProto
          .internal_static_google_cloud_documentai_v1beta1_BatchProcessDocumentsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest
        getDefaultInstanceForType() {
      return com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest build() {
      com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest buildPartial() {
      com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest result =
          new com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest result) {
      if (requestsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          requests_ = java.util.Collections.unmodifiableList(requests_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.requests_ = requests_;
      } else {
        result.requests_ = requestsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.parent_ = parent_;
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
      if (other instanceof com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest) {
        return mergeFrom((com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest other) {
      if (other
          == com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest.getDefaultInstance())
        return this;
      if (requestsBuilder_ == null) {
        if (!other.requests_.isEmpty()) {
          if (requests_.isEmpty()) {
            requests_ = other.requests_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRequestsIsMutable();
            requests_.addAll(other.requests_);
          }
          onChanged();
        }
      } else {
        if (!other.requests_.isEmpty()) {
          if (requestsBuilder_.isEmpty()) {
            requestsBuilder_.dispose();
            requestsBuilder_ = null;
            requests_ = other.requests_;
            bitField0_ = (bitField0_ & ~0x00000001);
            requestsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getRequestsFieldBuilder()
                    : null;
          } else {
            requestsBuilder_.addAllMessages(other.requests_);
          }
        }
      }
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000002;
        onChanged();
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
                com.google.cloud.documentai.v1beta1.ProcessDocumentRequest m =
                    input.readMessage(
                        com.google.cloud.documentai.v1beta1.ProcessDocumentRequest.parser(),
                        extensionRegistry);
                if (requestsBuilder_ == null) {
                  ensureRequestsIsMutable();
                  requests_.add(m);
                } else {
                  requestsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                parent_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.cloud.documentai.v1beta1.ProcessDocumentRequest> requests_ =
        java.util.Collections.emptyList();

    private void ensureRequestsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        requests_ =
            new java.util.ArrayList<com.google.cloud.documentai.v1beta1.ProcessDocumentRequest>(
                requests_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.documentai.v1beta1.ProcessDocumentRequest,
            com.google.cloud.documentai.v1beta1.ProcessDocumentRequest.Builder,
            com.google.cloud.documentai.v1beta1.ProcessDocumentRequestOrBuilder>
        requestsBuilder_;

    /**
     *
     *
     * <pre>
     * Required. Individual requests for each document.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.documentai.v1beta1.ProcessDocumentRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<com.google.cloud.documentai.v1beta1.ProcessDocumentRequest>
        getRequestsList() {
      if (requestsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(requests_);
      } else {
        return requestsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Individual requests for each document.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.documentai.v1beta1.ProcessDocumentRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public int getRequestsCount() {
      if (requestsBuilder_ == null) {
        return requests_.size();
      } else {
        return requestsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Individual requests for each document.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.documentai.v1beta1.ProcessDocumentRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.documentai.v1beta1.ProcessDocumentRequest getRequests(int index) {
      if (requestsBuilder_ == null) {
        return requests_.get(index);
      } else {
        return requestsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Individual requests for each document.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.documentai.v1beta1.ProcessDocumentRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setRequests(
        int index, com.google.cloud.documentai.v1beta1.ProcessDocumentRequest value) {
      if (requestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequestsIsMutable();
        requests_.set(index, value);
        onChanged();
      } else {
        requestsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Individual requests for each document.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.documentai.v1beta1.ProcessDocumentRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setRequests(
        int index,
        com.google.cloud.documentai.v1beta1.ProcessDocumentRequest.Builder builderForValue) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        requests_.set(index, builderForValue.build());
        onChanged();
      } else {
        requestsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Individual requests for each document.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.documentai.v1beta1.ProcessDocumentRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addRequests(com.google.cloud.documentai.v1beta1.ProcessDocumentRequest value) {
      if (requestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequestsIsMutable();
        requests_.add(value);
        onChanged();
      } else {
        requestsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Individual requests for each document.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.documentai.v1beta1.ProcessDocumentRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addRequests(
        int index, com.google.cloud.documentai.v1beta1.ProcessDocumentRequest value) {
      if (requestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRequestsIsMutable();
        requests_.add(index, value);
        onChanged();
      } else {
        requestsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Individual requests for each document.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.documentai.v1beta1.ProcessDocumentRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addRequests(
        com.google.cloud.documentai.v1beta1.ProcessDocumentRequest.Builder builderForValue) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        requests_.add(builderForValue.build());
        onChanged();
      } else {
        requestsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Individual requests for each document.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.documentai.v1beta1.ProcessDocumentRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addRequests(
        int index,
        com.google.cloud.documentai.v1beta1.ProcessDocumentRequest.Builder builderForValue) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        requests_.add(index, builderForValue.build());
        onChanged();
      } else {
        requestsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Individual requests for each document.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.documentai.v1beta1.ProcessDocumentRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addAllRequests(
        java.lang.Iterable<? extends com.google.cloud.documentai.v1beta1.ProcessDocumentRequest>
            values) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, requests_);
        onChanged();
      } else {
        requestsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Individual requests for each document.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.documentai.v1beta1.ProcessDocumentRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearRequests() {
      if (requestsBuilder_ == null) {
        requests_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        requestsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Individual requests for each document.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.documentai.v1beta1.ProcessDocumentRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder removeRequests(int index) {
      if (requestsBuilder_ == null) {
        ensureRequestsIsMutable();
        requests_.remove(index);
        onChanged();
      } else {
        requestsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Individual requests for each document.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.documentai.v1beta1.ProcessDocumentRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.documentai.v1beta1.ProcessDocumentRequest.Builder getRequestsBuilder(
        int index) {
      return getRequestsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Required. Individual requests for each document.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.documentai.v1beta1.ProcessDocumentRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.documentai.v1beta1.ProcessDocumentRequestOrBuilder getRequestsOrBuilder(
        int index) {
      if (requestsBuilder_ == null) {
        return requests_.get(index);
      } else {
        return requestsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Individual requests for each document.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.documentai.v1beta1.ProcessDocumentRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<
            ? extends com.google.cloud.documentai.v1beta1.ProcessDocumentRequestOrBuilder>
        getRequestsOrBuilderList() {
      if (requestsBuilder_ != null) {
        return requestsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(requests_);
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Individual requests for each document.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.documentai.v1beta1.ProcessDocumentRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.documentai.v1beta1.ProcessDocumentRequest.Builder addRequestsBuilder() {
      return getRequestsFieldBuilder()
          .addBuilder(
              com.google.cloud.documentai.v1beta1.ProcessDocumentRequest.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Required. Individual requests for each document.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.documentai.v1beta1.ProcessDocumentRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.documentai.v1beta1.ProcessDocumentRequest.Builder addRequestsBuilder(
        int index) {
      return getRequestsFieldBuilder()
          .addBuilder(
              index,
              com.google.cloud.documentai.v1beta1.ProcessDocumentRequest.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Required. Individual requests for each document.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.documentai.v1beta1.ProcessDocumentRequest requests = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<com.google.cloud.documentai.v1beta1.ProcessDocumentRequest.Builder>
        getRequestsBuilderList() {
      return getRequestsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.documentai.v1beta1.ProcessDocumentRequest,
            com.google.cloud.documentai.v1beta1.ProcessDocumentRequest.Builder,
            com.google.cloud.documentai.v1beta1.ProcessDocumentRequestOrBuilder>
        getRequestsFieldBuilder() {
      if (requestsBuilder_ == null) {
        requestsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.documentai.v1beta1.ProcessDocumentRequest,
                com.google.cloud.documentai.v1beta1.ProcessDocumentRequest.Builder,
                com.google.cloud.documentai.v1beta1.ProcessDocumentRequestOrBuilder>(
                requests_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        requests_ = null;
      }
      return requestsBuilder_;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Target project and location to make a call.
     *
     * Format: `projects/{project-id}/locations/{location-id}`.
     *
     * If no location is specified, a region will be chosen automatically.
     * </pre>
     *
     * <code>string parent = 2;</code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Target project and location to make a call.
     *
     * Format: `projects/{project-id}/locations/{location-id}`.
     *
     * If no location is specified, a region will be chosen automatically.
     * </pre>
     *
     * <code>string parent = 2;</code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Target project and location to make a call.
     *
     * Format: `projects/{project-id}/locations/{location-id}`.
     *
     * If no location is specified, a region will be chosen automatically.
     * </pre>
     *
     * <code>string parent = 2;</code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Target project and location to make a call.
     *
     * Format: `projects/{project-id}/locations/{location-id}`.
     *
     * If no location is specified, a region will be chosen automatically.
     * </pre>
     *
     * <code>string parent = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Target project and location to make a call.
     *
     * Format: `projects/{project-id}/locations/{location-id}`.
     *
     * If no location is specified, a region will be chosen automatically.
     * </pre>
     *
     * <code>string parent = 2;</code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest)
  private static final com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest();
  }

  public static com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchProcessDocumentsRequest> PARSER =
      new com.google.protobuf.AbstractParser<BatchProcessDocumentsRequest>() {
        @java.lang.Override
        public BatchProcessDocumentsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchProcessDocumentsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchProcessDocumentsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.documentai.v1beta1.BatchProcessDocumentsRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
