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
 * Response containing existing `BuildTriggers`.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudbuild.v1.ListBuildTriggersResponse}
 */
public final class ListBuildTriggersResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudbuild.v1.ListBuildTriggersResponse)
    ListBuildTriggersResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListBuildTriggersResponse.newBuilder() to construct.
  private ListBuildTriggersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListBuildTriggersResponse() {
    triggers_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListBuildTriggersResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloudbuild.v1.Cloudbuild
        .internal_static_google_devtools_cloudbuild_v1_ListBuildTriggersResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloudbuild.v1.Cloudbuild
        .internal_static_google_devtools_cloudbuild_v1_ListBuildTriggersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloudbuild.v1.ListBuildTriggersResponse.class,
            com.google.cloudbuild.v1.ListBuildTriggersResponse.Builder.class);
  }

  public static final int TRIGGERS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloudbuild.v1.BuildTrigger> triggers_;
  /**
   *
   *
   * <pre>
   * `BuildTriggers` for the project, sorted by `create_time` descending.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.BuildTrigger triggers = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloudbuild.v1.BuildTrigger> getTriggersList() {
    return triggers_;
  }
  /**
   *
   *
   * <pre>
   * `BuildTriggers` for the project, sorted by `create_time` descending.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.BuildTrigger triggers = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloudbuild.v1.BuildTriggerOrBuilder>
      getTriggersOrBuilderList() {
    return triggers_;
  }
  /**
   *
   *
   * <pre>
   * `BuildTriggers` for the project, sorted by `create_time` descending.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.BuildTrigger triggers = 1;</code>
   */
  @java.lang.Override
  public int getTriggersCount() {
    return triggers_.size();
  }
  /**
   *
   *
   * <pre>
   * `BuildTriggers` for the project, sorted by `create_time` descending.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.BuildTrigger triggers = 1;</code>
   */
  @java.lang.Override
  public com.google.cloudbuild.v1.BuildTrigger getTriggers(int index) {
    return triggers_.get(index);
  }
  /**
   *
   *
   * <pre>
   * `BuildTriggers` for the project, sorted by `create_time` descending.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.BuildTrigger triggers = 1;</code>
   */
  @java.lang.Override
  public com.google.cloudbuild.v1.BuildTriggerOrBuilder getTriggersOrBuilder(int index) {
    return triggers_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * Token to receive the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Token to receive the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < triggers_.size(); i++) {
      output.writeMessage(1, triggers_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < triggers_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, triggers_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloudbuild.v1.ListBuildTriggersResponse)) {
      return super.equals(obj);
    }
    com.google.cloudbuild.v1.ListBuildTriggersResponse other =
        (com.google.cloudbuild.v1.ListBuildTriggersResponse) obj;

    if (!getTriggersList().equals(other.getTriggersList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getTriggersCount() > 0) {
      hash = (37 * hash) + TRIGGERS_FIELD_NUMBER;
      hash = (53 * hash) + getTriggersList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloudbuild.v1.ListBuildTriggersResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.ListBuildTriggersResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.ListBuildTriggersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.ListBuildTriggersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.ListBuildTriggersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.ListBuildTriggersResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.ListBuildTriggersResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.ListBuildTriggersResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.ListBuildTriggersResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.ListBuildTriggersResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.ListBuildTriggersResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.ListBuildTriggersResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloudbuild.v1.ListBuildTriggersResponse prototype) {
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
   * Response containing existing `BuildTriggers`.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudbuild.v1.ListBuildTriggersResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudbuild.v1.ListBuildTriggersResponse)
      com.google.cloudbuild.v1.ListBuildTriggersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_ListBuildTriggersResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_ListBuildTriggersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloudbuild.v1.ListBuildTriggersResponse.class,
              com.google.cloudbuild.v1.ListBuildTriggersResponse.Builder.class);
    }

    // Construct using com.google.cloudbuild.v1.ListBuildTriggersResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (triggersBuilder_ == null) {
        triggers_ = java.util.Collections.emptyList();
      } else {
        triggers_ = null;
        triggersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_ListBuildTriggersResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.ListBuildTriggersResponse getDefaultInstanceForType() {
      return com.google.cloudbuild.v1.ListBuildTriggersResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.ListBuildTriggersResponse build() {
      com.google.cloudbuild.v1.ListBuildTriggersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.ListBuildTriggersResponse buildPartial() {
      com.google.cloudbuild.v1.ListBuildTriggersResponse result =
          new com.google.cloudbuild.v1.ListBuildTriggersResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloudbuild.v1.ListBuildTriggersResponse result) {
      if (triggersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          triggers_ = java.util.Collections.unmodifiableList(triggers_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.triggers_ = triggers_;
      } else {
        result.triggers_ = triggersBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloudbuild.v1.ListBuildTriggersResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloudbuild.v1.ListBuildTriggersResponse) {
        return mergeFrom((com.google.cloudbuild.v1.ListBuildTriggersResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloudbuild.v1.ListBuildTriggersResponse other) {
      if (other == com.google.cloudbuild.v1.ListBuildTriggersResponse.getDefaultInstance())
        return this;
      if (triggersBuilder_ == null) {
        if (!other.triggers_.isEmpty()) {
          if (triggers_.isEmpty()) {
            triggers_ = other.triggers_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTriggersIsMutable();
            triggers_.addAll(other.triggers_);
          }
          onChanged();
        }
      } else {
        if (!other.triggers_.isEmpty()) {
          if (triggersBuilder_.isEmpty()) {
            triggersBuilder_.dispose();
            triggersBuilder_ = null;
            triggers_ = other.triggers_;
            bitField0_ = (bitField0_ & ~0x00000001);
            triggersBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getTriggersFieldBuilder()
                    : null;
          } else {
            triggersBuilder_.addAllMessages(other.triggers_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
                com.google.cloudbuild.v1.BuildTrigger m =
                    input.readMessage(
                        com.google.cloudbuild.v1.BuildTrigger.parser(), extensionRegistry);
                if (triggersBuilder_ == null) {
                  ensureTriggersIsMutable();
                  triggers_.add(m);
                } else {
                  triggersBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.cloudbuild.v1.BuildTrigger> triggers_ =
        java.util.Collections.emptyList();

    private void ensureTriggersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        triggers_ = new java.util.ArrayList<com.google.cloudbuild.v1.BuildTrigger>(triggers_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloudbuild.v1.BuildTrigger,
            com.google.cloudbuild.v1.BuildTrigger.Builder,
            com.google.cloudbuild.v1.BuildTriggerOrBuilder>
        triggersBuilder_;

    /**
     *
     *
     * <pre>
     * `BuildTriggers` for the project, sorted by `create_time` descending.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.BuildTrigger triggers = 1;</code>
     */
    public java.util.List<com.google.cloudbuild.v1.BuildTrigger> getTriggersList() {
      if (triggersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(triggers_);
      } else {
        return triggersBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * `BuildTriggers` for the project, sorted by `create_time` descending.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.BuildTrigger triggers = 1;</code>
     */
    public int getTriggersCount() {
      if (triggersBuilder_ == null) {
        return triggers_.size();
      } else {
        return triggersBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * `BuildTriggers` for the project, sorted by `create_time` descending.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.BuildTrigger triggers = 1;</code>
     */
    public com.google.cloudbuild.v1.BuildTrigger getTriggers(int index) {
      if (triggersBuilder_ == null) {
        return triggers_.get(index);
      } else {
        return triggersBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * `BuildTriggers` for the project, sorted by `create_time` descending.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.BuildTrigger triggers = 1;</code>
     */
    public Builder setTriggers(int index, com.google.cloudbuild.v1.BuildTrigger value) {
      if (triggersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTriggersIsMutable();
        triggers_.set(index, value);
        onChanged();
      } else {
        triggersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * `BuildTriggers` for the project, sorted by `create_time` descending.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.BuildTrigger triggers = 1;</code>
     */
    public Builder setTriggers(
        int index, com.google.cloudbuild.v1.BuildTrigger.Builder builderForValue) {
      if (triggersBuilder_ == null) {
        ensureTriggersIsMutable();
        triggers_.set(index, builderForValue.build());
        onChanged();
      } else {
        triggersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * `BuildTriggers` for the project, sorted by `create_time` descending.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.BuildTrigger triggers = 1;</code>
     */
    public Builder addTriggers(com.google.cloudbuild.v1.BuildTrigger value) {
      if (triggersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTriggersIsMutable();
        triggers_.add(value);
        onChanged();
      } else {
        triggersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * `BuildTriggers` for the project, sorted by `create_time` descending.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.BuildTrigger triggers = 1;</code>
     */
    public Builder addTriggers(int index, com.google.cloudbuild.v1.BuildTrigger value) {
      if (triggersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTriggersIsMutable();
        triggers_.add(index, value);
        onChanged();
      } else {
        triggersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * `BuildTriggers` for the project, sorted by `create_time` descending.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.BuildTrigger triggers = 1;</code>
     */
    public Builder addTriggers(com.google.cloudbuild.v1.BuildTrigger.Builder builderForValue) {
      if (triggersBuilder_ == null) {
        ensureTriggersIsMutable();
        triggers_.add(builderForValue.build());
        onChanged();
      } else {
        triggersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * `BuildTriggers` for the project, sorted by `create_time` descending.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.BuildTrigger triggers = 1;</code>
     */
    public Builder addTriggers(
        int index, com.google.cloudbuild.v1.BuildTrigger.Builder builderForValue) {
      if (triggersBuilder_ == null) {
        ensureTriggersIsMutable();
        triggers_.add(index, builderForValue.build());
        onChanged();
      } else {
        triggersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * `BuildTriggers` for the project, sorted by `create_time` descending.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.BuildTrigger triggers = 1;</code>
     */
    public Builder addAllTriggers(
        java.lang.Iterable<? extends com.google.cloudbuild.v1.BuildTrigger> values) {
      if (triggersBuilder_ == null) {
        ensureTriggersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, triggers_);
        onChanged();
      } else {
        triggersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * `BuildTriggers` for the project, sorted by `create_time` descending.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.BuildTrigger triggers = 1;</code>
     */
    public Builder clearTriggers() {
      if (triggersBuilder_ == null) {
        triggers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        triggersBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * `BuildTriggers` for the project, sorted by `create_time` descending.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.BuildTrigger triggers = 1;</code>
     */
    public Builder removeTriggers(int index) {
      if (triggersBuilder_ == null) {
        ensureTriggersIsMutable();
        triggers_.remove(index);
        onChanged();
      } else {
        triggersBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * `BuildTriggers` for the project, sorted by `create_time` descending.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.BuildTrigger triggers = 1;</code>
     */
    public com.google.cloudbuild.v1.BuildTrigger.Builder getTriggersBuilder(int index) {
      return getTriggersFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * `BuildTriggers` for the project, sorted by `create_time` descending.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.BuildTrigger triggers = 1;</code>
     */
    public com.google.cloudbuild.v1.BuildTriggerOrBuilder getTriggersOrBuilder(int index) {
      if (triggersBuilder_ == null) {
        return triggers_.get(index);
      } else {
        return triggersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * `BuildTriggers` for the project, sorted by `create_time` descending.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.BuildTrigger triggers = 1;</code>
     */
    public java.util.List<? extends com.google.cloudbuild.v1.BuildTriggerOrBuilder>
        getTriggersOrBuilderList() {
      if (triggersBuilder_ != null) {
        return triggersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(triggers_);
      }
    }
    /**
     *
     *
     * <pre>
     * `BuildTriggers` for the project, sorted by `create_time` descending.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.BuildTrigger triggers = 1;</code>
     */
    public com.google.cloudbuild.v1.BuildTrigger.Builder addTriggersBuilder() {
      return getTriggersFieldBuilder()
          .addBuilder(com.google.cloudbuild.v1.BuildTrigger.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * `BuildTriggers` for the project, sorted by `create_time` descending.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.BuildTrigger triggers = 1;</code>
     */
    public com.google.cloudbuild.v1.BuildTrigger.Builder addTriggersBuilder(int index) {
      return getTriggersFieldBuilder()
          .addBuilder(index, com.google.cloudbuild.v1.BuildTrigger.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * `BuildTriggers` for the project, sorted by `create_time` descending.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudbuild.v1.BuildTrigger triggers = 1;</code>
     */
    public java.util.List<com.google.cloudbuild.v1.BuildTrigger.Builder> getTriggersBuilderList() {
      return getTriggersFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloudbuild.v1.BuildTrigger,
            com.google.cloudbuild.v1.BuildTrigger.Builder,
            com.google.cloudbuild.v1.BuildTriggerOrBuilder>
        getTriggersFieldBuilder() {
      if (triggersBuilder_ == null) {
        triggersBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloudbuild.v1.BuildTrigger,
                com.google.cloudbuild.v1.BuildTrigger.Builder,
                com.google.cloudbuild.v1.BuildTriggerOrBuilder>(
                triggers_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        triggers_ = null;
      }
      return triggersBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Token to receive the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Token to receive the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Token to receive the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to receive the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Token to receive the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.devtools.cloudbuild.v1.ListBuildTriggersResponse)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudbuild.v1.ListBuildTriggersResponse)
  private static final com.google.cloudbuild.v1.ListBuildTriggersResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloudbuild.v1.ListBuildTriggersResponse();
  }

  public static com.google.cloudbuild.v1.ListBuildTriggersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListBuildTriggersResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListBuildTriggersResponse>() {
        @java.lang.Override
        public ListBuildTriggersResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListBuildTriggersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListBuildTriggersResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloudbuild.v1.ListBuildTriggersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
