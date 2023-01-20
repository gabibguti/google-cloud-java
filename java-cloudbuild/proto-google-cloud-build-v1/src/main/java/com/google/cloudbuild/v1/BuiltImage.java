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
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

package com.google.cloudbuild.v1;

/**
 *
 *
 * <pre>
 * An image built by the pipeline.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudbuild.v1.BuiltImage}
 */
public final class BuiltImage extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudbuild.v1.BuiltImage)
    BuiltImageOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BuiltImage.newBuilder() to construct.
  private BuiltImage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BuiltImage() {
    name_ = "";
    digest_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BuiltImage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloudbuild.v1.Cloudbuild
        .internal_static_google_devtools_cloudbuild_v1_BuiltImage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloudbuild.v1.Cloudbuild
        .internal_static_google_devtools_cloudbuild_v1_BuiltImage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloudbuild.v1.BuiltImage.class,
            com.google.cloudbuild.v1.BuiltImage.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Name used to push the container image to Google Container Registry, as
   * presented to `docker push`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Name used to push the container image to Google Container Registry, as
   * presented to `docker push`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DIGEST_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object digest_ = "";
  /**
   *
   *
   * <pre>
   * Docker Registry 2.0 digest.
   * </pre>
   *
   * <code>string digest = 3;</code>
   *
   * @return The digest.
   */
  @java.lang.Override
  public java.lang.String getDigest() {
    java.lang.Object ref = digest_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      digest_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Docker Registry 2.0 digest.
   * </pre>
   *
   * <code>string digest = 3;</code>
   *
   * @return The bytes for digest.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDigestBytes() {
    java.lang.Object ref = digest_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      digest_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PUSH_TIMING_FIELD_NUMBER = 4;
  private com.google.cloudbuild.v1.TimeSpan pushTiming_;
  /**
   *
   *
   * <pre>
   * Output only. Stores timing information for pushing the specified image.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v1.TimeSpan push_timing = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the pushTiming field is set.
   */
  @java.lang.Override
  public boolean hasPushTiming() {
    return pushTiming_ != null;
  }
  /**
   *
   *
   * <pre>
   * Output only. Stores timing information for pushing the specified image.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v1.TimeSpan push_timing = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The pushTiming.
   */
  @java.lang.Override
  public com.google.cloudbuild.v1.TimeSpan getPushTiming() {
    return pushTiming_ == null
        ? com.google.cloudbuild.v1.TimeSpan.getDefaultInstance()
        : pushTiming_;
  }
  /**
   *
   *
   * <pre>
   * Output only. Stores timing information for pushing the specified image.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v1.TimeSpan push_timing = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.cloudbuild.v1.TimeSpanOrBuilder getPushTimingOrBuilder() {
    return pushTiming_ == null
        ? com.google.cloudbuild.v1.TimeSpan.getDefaultInstance()
        : pushTiming_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(digest_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, digest_);
    }
    if (pushTiming_ != null) {
      output.writeMessage(4, getPushTiming());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(digest_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, digest_);
    }
    if (pushTiming_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getPushTiming());
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
    if (!(obj instanceof com.google.cloudbuild.v1.BuiltImage)) {
      return super.equals(obj);
    }
    com.google.cloudbuild.v1.BuiltImage other = (com.google.cloudbuild.v1.BuiltImage) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getDigest().equals(other.getDigest())) return false;
    if (hasPushTiming() != other.hasPushTiming()) return false;
    if (hasPushTiming()) {
      if (!getPushTiming().equals(other.getPushTiming())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + DIGEST_FIELD_NUMBER;
    hash = (53 * hash) + getDigest().hashCode();
    if (hasPushTiming()) {
      hash = (37 * hash) + PUSH_TIMING_FIELD_NUMBER;
      hash = (53 * hash) + getPushTiming().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloudbuild.v1.BuiltImage parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.BuiltImage parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.BuiltImage parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.BuiltImage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.BuiltImage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.BuiltImage parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.BuiltImage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.BuiltImage parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.BuiltImage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.BuiltImage parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.BuiltImage parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.BuiltImage parseFrom(
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

  public static Builder newBuilder(com.google.cloudbuild.v1.BuiltImage prototype) {
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
   * An image built by the pipeline.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudbuild.v1.BuiltImage}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudbuild.v1.BuiltImage)
      com.google.cloudbuild.v1.BuiltImageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_BuiltImage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_BuiltImage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloudbuild.v1.BuiltImage.class,
              com.google.cloudbuild.v1.BuiltImage.Builder.class);
    }

    // Construct using com.google.cloudbuild.v1.BuiltImage.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      digest_ = "";
      pushTiming_ = null;
      if (pushTimingBuilder_ != null) {
        pushTimingBuilder_.dispose();
        pushTimingBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_BuiltImage_descriptor;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.BuiltImage getDefaultInstanceForType() {
      return com.google.cloudbuild.v1.BuiltImage.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.BuiltImage build() {
      com.google.cloudbuild.v1.BuiltImage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.BuiltImage buildPartial() {
      com.google.cloudbuild.v1.BuiltImage result = new com.google.cloudbuild.v1.BuiltImage(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloudbuild.v1.BuiltImage result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.digest_ = digest_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.pushTiming_ = pushTimingBuilder_ == null ? pushTiming_ : pushTimingBuilder_.build();
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
      if (other instanceof com.google.cloudbuild.v1.BuiltImage) {
        return mergeFrom((com.google.cloudbuild.v1.BuiltImage) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloudbuild.v1.BuiltImage other) {
      if (other == com.google.cloudbuild.v1.BuiltImage.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDigest().isEmpty()) {
        digest_ = other.digest_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasPushTiming()) {
        mergePushTiming(other.getPushTiming());
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 26:
              {
                digest_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 26
            case 34:
              {
                input.readMessage(getPushTimingFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 34
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Name used to push the container image to Google Container Registry, as
     * presented to `docker push`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name used to push the container image to Google Container Registry, as
     * presented to `docker push`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name used to push the container image to Google Container Registry, as
     * presented to `docker push`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name used to push the container image to Google Container Registry, as
     * presented to `docker push`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name used to push the container image to Google Container Registry, as
     * presented to `docker push`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object digest_ = "";
    /**
     *
     *
     * <pre>
     * Docker Registry 2.0 digest.
     * </pre>
     *
     * <code>string digest = 3;</code>
     *
     * @return The digest.
     */
    public java.lang.String getDigest() {
      java.lang.Object ref = digest_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        digest_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Docker Registry 2.0 digest.
     * </pre>
     *
     * <code>string digest = 3;</code>
     *
     * @return The bytes for digest.
     */
    public com.google.protobuf.ByteString getDigestBytes() {
      java.lang.Object ref = digest_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        digest_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Docker Registry 2.0 digest.
     * </pre>
     *
     * <code>string digest = 3;</code>
     *
     * @param value The digest to set.
     * @return This builder for chaining.
     */
    public Builder setDigest(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      digest_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Docker Registry 2.0 digest.
     * </pre>
     *
     * <code>string digest = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDigest() {
      digest_ = getDefaultInstance().getDigest();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Docker Registry 2.0 digest.
     * </pre>
     *
     * <code>string digest = 3;</code>
     *
     * @param value The bytes for digest to set.
     * @return This builder for chaining.
     */
    public Builder setDigestBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      digest_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloudbuild.v1.TimeSpan pushTiming_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloudbuild.v1.TimeSpan,
            com.google.cloudbuild.v1.TimeSpan.Builder,
            com.google.cloudbuild.v1.TimeSpanOrBuilder>
        pushTimingBuilder_;
    /**
     *
     *
     * <pre>
     * Output only. Stores timing information for pushing the specified image.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v1.TimeSpan push_timing = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return Whether the pushTiming field is set.
     */
    public boolean hasPushTiming() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Output only. Stores timing information for pushing the specified image.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v1.TimeSpan push_timing = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The pushTiming.
     */
    public com.google.cloudbuild.v1.TimeSpan getPushTiming() {
      if (pushTimingBuilder_ == null) {
        return pushTiming_ == null
            ? com.google.cloudbuild.v1.TimeSpan.getDefaultInstance()
            : pushTiming_;
      } else {
        return pushTimingBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Stores timing information for pushing the specified image.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v1.TimeSpan push_timing = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setPushTiming(com.google.cloudbuild.v1.TimeSpan value) {
      if (pushTimingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pushTiming_ = value;
      } else {
        pushTimingBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Stores timing information for pushing the specified image.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v1.TimeSpan push_timing = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setPushTiming(com.google.cloudbuild.v1.TimeSpan.Builder builderForValue) {
      if (pushTimingBuilder_ == null) {
        pushTiming_ = builderForValue.build();
      } else {
        pushTimingBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Stores timing information for pushing the specified image.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v1.TimeSpan push_timing = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder mergePushTiming(com.google.cloudbuild.v1.TimeSpan value) {
      if (pushTimingBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && pushTiming_ != null
            && pushTiming_ != com.google.cloudbuild.v1.TimeSpan.getDefaultInstance()) {
          getPushTimingBuilder().mergeFrom(value);
        } else {
          pushTiming_ = value;
        }
      } else {
        pushTimingBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Stores timing information for pushing the specified image.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v1.TimeSpan push_timing = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder clearPushTiming() {
      bitField0_ = (bitField0_ & ~0x00000004);
      pushTiming_ = null;
      if (pushTimingBuilder_ != null) {
        pushTimingBuilder_.dispose();
        pushTimingBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Stores timing information for pushing the specified image.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v1.TimeSpan push_timing = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloudbuild.v1.TimeSpan.Builder getPushTimingBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getPushTimingFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Output only. Stores timing information for pushing the specified image.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v1.TimeSpan push_timing = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloudbuild.v1.TimeSpanOrBuilder getPushTimingOrBuilder() {
      if (pushTimingBuilder_ != null) {
        return pushTimingBuilder_.getMessageOrBuilder();
      } else {
        return pushTiming_ == null
            ? com.google.cloudbuild.v1.TimeSpan.getDefaultInstance()
            : pushTiming_;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Stores timing information for pushing the specified image.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v1.TimeSpan push_timing = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloudbuild.v1.TimeSpan,
            com.google.cloudbuild.v1.TimeSpan.Builder,
            com.google.cloudbuild.v1.TimeSpanOrBuilder>
        getPushTimingFieldBuilder() {
      if (pushTimingBuilder_ == null) {
        pushTimingBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloudbuild.v1.TimeSpan,
                com.google.cloudbuild.v1.TimeSpan.Builder,
                com.google.cloudbuild.v1.TimeSpanOrBuilder>(
                getPushTiming(), getParentForChildren(), isClean());
        pushTiming_ = null;
      }
      return pushTimingBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.devtools.cloudbuild.v1.BuiltImage)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudbuild.v1.BuiltImage)
  private static final com.google.cloudbuild.v1.BuiltImage DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloudbuild.v1.BuiltImage();
  }

  public static com.google.cloudbuild.v1.BuiltImage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BuiltImage> PARSER =
      new com.google.protobuf.AbstractParser<BuiltImage>() {
        @java.lang.Override
        public BuiltImage parsePartialFrom(
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

  public static com.google.protobuf.Parser<BuiltImage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BuiltImage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloudbuild.v1.BuiltImage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
