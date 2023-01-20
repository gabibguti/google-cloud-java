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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.GlobalSetLabelsRequest}
 */
public final class GlobalSetLabelsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.GlobalSetLabelsRequest)
    GlobalSetLabelsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GlobalSetLabelsRequest.newBuilder() to construct.
  private GlobalSetLabelsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GlobalSetLabelsRequest() {
    labelFingerprint_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GlobalSetLabelsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_GlobalSetLabelsRequest_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(int number) {
    switch (number) {
      case 500195327:
        return internalGetLabels();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_GlobalSetLabelsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.GlobalSetLabelsRequest.class,
            com.google.cloud.compute.v1.GlobalSetLabelsRequest.Builder.class);
  }

  private int bitField0_;
  public static final int LABEL_FINGERPRINT_FIELD_NUMBER = 178124825;

  @SuppressWarnings("serial")
  private volatile java.lang.Object labelFingerprint_ = "";
  /**
   *
   *
   * <pre>
   * The fingerprint of the previous set of labels for this resource, used to detect conflicts. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash when updating or changing labels, otherwise the request will fail with error 412 conditionNotMet. Make a get() request to the resource to get the latest fingerprint.
   * </pre>
   *
   * <code>optional string label_fingerprint = 178124825;</code>
   *
   * @return Whether the labelFingerprint field is set.
   */
  @java.lang.Override
  public boolean hasLabelFingerprint() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The fingerprint of the previous set of labels for this resource, used to detect conflicts. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash when updating or changing labels, otherwise the request will fail with error 412 conditionNotMet. Make a get() request to the resource to get the latest fingerprint.
   * </pre>
   *
   * <code>optional string label_fingerprint = 178124825;</code>
   *
   * @return The labelFingerprint.
   */
  @java.lang.Override
  public java.lang.String getLabelFingerprint() {
    java.lang.Object ref = labelFingerprint_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      labelFingerprint_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The fingerprint of the previous set of labels for this resource, used to detect conflicts. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash when updating or changing labels, otherwise the request will fail with error 412 conditionNotMet. Make a get() request to the resource to get the latest fingerprint.
   * </pre>
   *
   * <code>optional string label_fingerprint = 178124825;</code>
   *
   * @return The bytes for labelFingerprint.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLabelFingerprintBytes() {
    java.lang.Object ref = labelFingerprint_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      labelFingerprint_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LABELS_FIELD_NUMBER = 500195327;

  private static final class LabelsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
            com.google.cloud.compute.v1.Compute
                .internal_static_google_cloud_compute_v1_GlobalSetLabelsRequest_LabelsEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.STRING,
            "");
  }

  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<java.lang.String, java.lang.String> labels_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetLabels() {
    if (labels_ == null) {
      return com.google.protobuf.MapField.emptyMapField(LabelsDefaultEntryHolder.defaultEntry);
    }
    return labels_;
  }

  public int getLabelsCount() {
    return internalGetLabels().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * A list of labels to apply for this resource. Each label must comply with the requirements for labels. For example, "webserver-frontend": "images". A label value can also be empty (e.g. "my-label": "").
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  @java.lang.Override
  public boolean containsLabels(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetLabels().getMap().containsKey(key);
  }
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getLabels() {
    return getLabelsMap();
  }
  /**
   *
   *
   * <pre>
   * A list of labels to apply for this resource. Each label must comply with the requirements for labels. For example, "webserver-frontend": "images". A label value can also be empty (e.g. "my-label": "").
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getLabelsMap() {
    return internalGetLabels().getMap();
  }
  /**
   *
   *
   * <pre>
   * A list of labels to apply for this resource. Each label must comply with the requirements for labels. For example, "webserver-frontend": "images". A label value can also be empty (e.g. "my-label": "").
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  @java.lang.Override
  public /* nullable */ java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetLabels().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * A list of labels to apply for this resource. Each label must comply with the requirements for labels. For example, "webserver-frontend": "images". A label value can also be empty (e.g. "my-label": "").
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 500195327;</code>
   */
  @java.lang.Override
  public java.lang.String getLabelsOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetLabels().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 178124825, labelFingerprint_);
    }
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetLabels(), LabelsDefaultEntryHolder.defaultEntry, 500195327);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size +=
          com.google.protobuf.GeneratedMessageV3.computeStringSize(178124825, labelFingerprint_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
        internalGetLabels().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String> labels__ =
          LabelsDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(500195327, labels__);
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
    if (!(obj instanceof com.google.cloud.compute.v1.GlobalSetLabelsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.GlobalSetLabelsRequest other =
        (com.google.cloud.compute.v1.GlobalSetLabelsRequest) obj;

    if (hasLabelFingerprint() != other.hasLabelFingerprint()) return false;
    if (hasLabelFingerprint()) {
      if (!getLabelFingerprint().equals(other.getLabelFingerprint())) return false;
    }
    if (!internalGetLabels().equals(other.internalGetLabels())) return false;
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
    if (hasLabelFingerprint()) {
      hash = (37 * hash) + LABEL_FINGERPRINT_FIELD_NUMBER;
      hash = (53 * hash) + getLabelFingerprint().hashCode();
    }
    if (!internalGetLabels().getMap().isEmpty()) {
      hash = (37 * hash) + LABELS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetLabels().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.GlobalSetLabelsRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.GlobalSetLabelsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.GlobalSetLabelsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.GlobalSetLabelsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.GlobalSetLabelsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.GlobalSetLabelsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.GlobalSetLabelsRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.GlobalSetLabelsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.GlobalSetLabelsRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.GlobalSetLabelsRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.GlobalSetLabelsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.GlobalSetLabelsRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.GlobalSetLabelsRequest prototype) {
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
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.GlobalSetLabelsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.GlobalSetLabelsRequest)
      com.google.cloud.compute.v1.GlobalSetLabelsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_GlobalSetLabelsRequest_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 500195327:
          return internalGetLabels();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
      switch (number) {
        case 500195327:
          return internalGetMutableLabels();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_GlobalSetLabelsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.GlobalSetLabelsRequest.class,
              com.google.cloud.compute.v1.GlobalSetLabelsRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.GlobalSetLabelsRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      labelFingerprint_ = "";
      internalGetMutableLabels().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_GlobalSetLabelsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.GlobalSetLabelsRequest getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.GlobalSetLabelsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.GlobalSetLabelsRequest build() {
      com.google.cloud.compute.v1.GlobalSetLabelsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.GlobalSetLabelsRequest buildPartial() {
      com.google.cloud.compute.v1.GlobalSetLabelsRequest result =
          new com.google.cloud.compute.v1.GlobalSetLabelsRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.GlobalSetLabelsRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.labelFingerprint_ = labelFingerprint_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.labels_ = internalGetLabels();
        result.labels_.makeImmutable();
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.compute.v1.GlobalSetLabelsRequest) {
        return mergeFrom((com.google.cloud.compute.v1.GlobalSetLabelsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.GlobalSetLabelsRequest other) {
      if (other == com.google.cloud.compute.v1.GlobalSetLabelsRequest.getDefaultInstance())
        return this;
      if (other.hasLabelFingerprint()) {
        labelFingerprint_ = other.labelFingerprint_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      internalGetMutableLabels().mergeFrom(other.internalGetLabels());
      bitField0_ |= 0x00000002;
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
            case 1424998602:
              {
                labelFingerprint_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 1424998602
            case -293404678:
              {
                com.google.protobuf.MapEntry<java.lang.String, java.lang.String> labels__ =
                    input.readMessage(
                        LabelsDefaultEntryHolder.defaultEntry.getParserForType(),
                        extensionRegistry);
                internalGetMutableLabels()
                    .getMutableMap()
                    .put(labels__.getKey(), labels__.getValue());
                bitField0_ |= 0x00000002;
                break;
              } // case -293404678
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

    private java.lang.Object labelFingerprint_ = "";
    /**
     *
     *
     * <pre>
     * The fingerprint of the previous set of labels for this resource, used to detect conflicts. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash when updating or changing labels, otherwise the request will fail with error 412 conditionNotMet. Make a get() request to the resource to get the latest fingerprint.
     * </pre>
     *
     * <code>optional string label_fingerprint = 178124825;</code>
     *
     * @return Whether the labelFingerprint field is set.
     */
    public boolean hasLabelFingerprint() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The fingerprint of the previous set of labels for this resource, used to detect conflicts. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash when updating or changing labels, otherwise the request will fail with error 412 conditionNotMet. Make a get() request to the resource to get the latest fingerprint.
     * </pre>
     *
     * <code>optional string label_fingerprint = 178124825;</code>
     *
     * @return The labelFingerprint.
     */
    public java.lang.String getLabelFingerprint() {
      java.lang.Object ref = labelFingerprint_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        labelFingerprint_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The fingerprint of the previous set of labels for this resource, used to detect conflicts. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash when updating or changing labels, otherwise the request will fail with error 412 conditionNotMet. Make a get() request to the resource to get the latest fingerprint.
     * </pre>
     *
     * <code>optional string label_fingerprint = 178124825;</code>
     *
     * @return The bytes for labelFingerprint.
     */
    public com.google.protobuf.ByteString getLabelFingerprintBytes() {
      java.lang.Object ref = labelFingerprint_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        labelFingerprint_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The fingerprint of the previous set of labels for this resource, used to detect conflicts. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash when updating or changing labels, otherwise the request will fail with error 412 conditionNotMet. Make a get() request to the resource to get the latest fingerprint.
     * </pre>
     *
     * <code>optional string label_fingerprint = 178124825;</code>
     *
     * @param value The labelFingerprint to set.
     * @return This builder for chaining.
     */
    public Builder setLabelFingerprint(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      labelFingerprint_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The fingerprint of the previous set of labels for this resource, used to detect conflicts. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash when updating or changing labels, otherwise the request will fail with error 412 conditionNotMet. Make a get() request to the resource to get the latest fingerprint.
     * </pre>
     *
     * <code>optional string label_fingerprint = 178124825;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLabelFingerprint() {
      labelFingerprint_ = getDefaultInstance().getLabelFingerprint();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The fingerprint of the previous set of labels for this resource, used to detect conflicts. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash when updating or changing labels, otherwise the request will fail with error 412 conditionNotMet. Make a get() request to the resource to get the latest fingerprint.
     * </pre>
     *
     * <code>optional string label_fingerprint = 178124825;</code>
     *
     * @param value The bytes for labelFingerprint to set.
     * @return This builder for chaining.
     */
    public Builder setLabelFingerprintBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      labelFingerprint_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> labels_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetLabels() {
      if (labels_ == null) {
        return com.google.protobuf.MapField.emptyMapField(LabelsDefaultEntryHolder.defaultEntry);
      }
      return labels_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableLabels() {
      if (labels_ == null) {
        labels_ = com.google.protobuf.MapField.newMapField(LabelsDefaultEntryHolder.defaultEntry);
      }
      if (!labels_.isMutable()) {
        labels_ = labels_.copy();
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return labels_;
    }

    public int getLabelsCount() {
      return internalGetLabels().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * A list of labels to apply for this resource. Each label must comply with the requirements for labels. For example, "webserver-frontend": "images". A label value can also be empty (e.g. "my-label": "").
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 500195327;</code>
     */
    @java.lang.Override
    public boolean containsLabels(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetLabels().getMap().containsKey(key);
    }
    /** Use {@link #getLabelsMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getLabels() {
      return getLabelsMap();
    }
    /**
     *
     *
     * <pre>
     * A list of labels to apply for this resource. Each label must comply with the requirements for labels. For example, "webserver-frontend": "images". A label value can also be empty (e.g. "my-label": "").
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 500195327;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getLabelsMap() {
      return internalGetLabels().getMap();
    }
    /**
     *
     *
     * <pre>
     * A list of labels to apply for this resource. Each label must comply with the requirements for labels. For example, "webserver-frontend": "images". A label value can also be empty (e.g. "my-label": "").
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 500195327;</code>
     */
    @java.lang.Override
    public /* nullable */ java.lang.String getLabelsOrDefault(
        java.lang.String key,
        /* nullable */
        java.lang.String defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetLabels().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * A list of labels to apply for this resource. Each label must comply with the requirements for labels. For example, "webserver-frontend": "images". A label value can also be empty (e.g. "my-label": "").
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 500195327;</code>
     */
    @java.lang.Override
    public java.lang.String getLabelsOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetLabels().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearLabels() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableLabels().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of labels to apply for this resource. Each label must comply with the requirements for labels. For example, "webserver-frontend": "images". A label value can also be empty (e.g. "my-label": "").
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 500195327;</code>
     */
    public Builder removeLabels(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableLabels().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMutableLabels() {
      bitField0_ |= 0x00000002;
      return internalGetMutableLabels().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * A list of labels to apply for this resource. Each label must comply with the requirements for labels. For example, "webserver-frontend": "images". A label value can also be empty (e.g. "my-label": "").
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 500195327;</code>
     */
    public Builder putLabels(java.lang.String key, java.lang.String value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }
      internalGetMutableLabels().getMutableMap().put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of labels to apply for this resource. Each label must comply with the requirements for labels. For example, "webserver-frontend": "images". A label value can also be empty (e.g. "my-label": "").
     * </pre>
     *
     * <code>map&lt;string, string&gt; labels = 500195327;</code>
     */
    public Builder putAllLabels(java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableLabels().getMutableMap().putAll(values);
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.GlobalSetLabelsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.GlobalSetLabelsRequest)
  private static final com.google.cloud.compute.v1.GlobalSetLabelsRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.GlobalSetLabelsRequest();
  }

  public static com.google.cloud.compute.v1.GlobalSetLabelsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GlobalSetLabelsRequest> PARSER =
      new com.google.protobuf.AbstractParser<GlobalSetLabelsRequest>() {
        @java.lang.Override
        public GlobalSetLabelsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GlobalSetLabelsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GlobalSetLabelsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.GlobalSetLabelsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
