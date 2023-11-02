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
// source: google/maps/fleetengine/delivery/v1/delivery_api.proto

package google.maps.fleetengine.delivery.v1;

/**
 *
 *
 * <pre>
 * The `SearchTasks` response. It contains the set of Tasks that meet the search
 * criteria in the `SearchTasksRequest`.
 * </pre>
 *
 * Protobuf type {@code maps.fleetengine.delivery.v1.SearchTasksResponse}
 */
@java.lang.Deprecated
public final class SearchTasksResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:maps.fleetengine.delivery.v1.SearchTasksResponse)
    SearchTasksResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SearchTasksResponse.newBuilder() to construct.
  private SearchTasksResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SearchTasksResponse() {
    tasks_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SearchTasksResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return google.maps.fleetengine.delivery.v1.DeliveryApi
        .internal_static_maps_fleetengine_delivery_v1_SearchTasksResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return google.maps.fleetengine.delivery.v1.DeliveryApi
        .internal_static_maps_fleetengine_delivery_v1_SearchTasksResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            google.maps.fleetengine.delivery.v1.SearchTasksResponse.class,
            google.maps.fleetengine.delivery.v1.SearchTasksResponse.Builder.class);
  }

  public static final int TASKS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<google.maps.fleetengine.delivery.v1.Task> tasks_;
  /**
   *
   *
   * <pre>
   * The set of Tasks for the requested `tracking_id`. A successful response can
   * also be empty. An empty response indicates that no Tasks are associated
   * with the supplied `tracking_id`.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.delivery.v1.Task tasks = 1;</code>
   */
  @java.lang.Override
  public java.util.List<google.maps.fleetengine.delivery.v1.Task> getTasksList() {
    return tasks_;
  }
  /**
   *
   *
   * <pre>
   * The set of Tasks for the requested `tracking_id`. A successful response can
   * also be empty. An empty response indicates that no Tasks are associated
   * with the supplied `tracking_id`.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.delivery.v1.Task tasks = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends google.maps.fleetengine.delivery.v1.TaskOrBuilder>
      getTasksOrBuilderList() {
    return tasks_;
  }
  /**
   *
   *
   * <pre>
   * The set of Tasks for the requested `tracking_id`. A successful response can
   * also be empty. An empty response indicates that no Tasks are associated
   * with the supplied `tracking_id`.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.delivery.v1.Task tasks = 1;</code>
   */
  @java.lang.Override
  public int getTasksCount() {
    return tasks_.size();
  }
  /**
   *
   *
   * <pre>
   * The set of Tasks for the requested `tracking_id`. A successful response can
   * also be empty. An empty response indicates that no Tasks are associated
   * with the supplied `tracking_id`.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.delivery.v1.Task tasks = 1;</code>
   */
  @java.lang.Override
  public google.maps.fleetengine.delivery.v1.Task getTasks(int index) {
    return tasks_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The set of Tasks for the requested `tracking_id`. A successful response can
   * also be empty. An empty response indicates that no Tasks are associated
   * with the supplied `tracking_id`.
   * </pre>
   *
   * <code>repeated .maps.fleetengine.delivery.v1.Task tasks = 1;</code>
   */
  @java.lang.Override
  public google.maps.fleetengine.delivery.v1.TaskOrBuilder getTasksOrBuilder(int index) {
    return tasks_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * Pass this token in the `SearchTasksRequest` to continue to
   * list results. If all results have been returned, then this field is either
   * an empty string, or it doesn't appear in the response.
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
   * Pass this token in the `SearchTasksRequest` to continue to
   * list results. If all results have been returned, then this field is either
   * an empty string, or it doesn't appear in the response.
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
    for (int i = 0; i < tasks_.size(); i++) {
      output.writeMessage(1, tasks_.get(i));
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
    for (int i = 0; i < tasks_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, tasks_.get(i));
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
    if (!(obj instanceof google.maps.fleetengine.delivery.v1.SearchTasksResponse)) {
      return super.equals(obj);
    }
    google.maps.fleetengine.delivery.v1.SearchTasksResponse other =
        (google.maps.fleetengine.delivery.v1.SearchTasksResponse) obj;

    if (!getTasksList().equals(other.getTasksList())) return false;
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
    if (getTasksCount() > 0) {
      hash = (37 * hash) + TASKS_FIELD_NUMBER;
      hash = (53 * hash) + getTasksList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static google.maps.fleetengine.delivery.v1.SearchTasksResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static google.maps.fleetengine.delivery.v1.SearchTasksResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static google.maps.fleetengine.delivery.v1.SearchTasksResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static google.maps.fleetengine.delivery.v1.SearchTasksResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static google.maps.fleetengine.delivery.v1.SearchTasksResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static google.maps.fleetengine.delivery.v1.SearchTasksResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static google.maps.fleetengine.delivery.v1.SearchTasksResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static google.maps.fleetengine.delivery.v1.SearchTasksResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static google.maps.fleetengine.delivery.v1.SearchTasksResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static google.maps.fleetengine.delivery.v1.SearchTasksResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static google.maps.fleetengine.delivery.v1.SearchTasksResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static google.maps.fleetengine.delivery.v1.SearchTasksResponse parseFrom(
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
      google.maps.fleetengine.delivery.v1.SearchTasksResponse prototype) {
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
   * The `SearchTasks` response. It contains the set of Tasks that meet the search
   * criteria in the `SearchTasksRequest`.
   * </pre>
   *
   * Protobuf type {@code maps.fleetengine.delivery.v1.SearchTasksResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:maps.fleetengine.delivery.v1.SearchTasksResponse)
      google.maps.fleetengine.delivery.v1.SearchTasksResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return google.maps.fleetengine.delivery.v1.DeliveryApi
          .internal_static_maps_fleetengine_delivery_v1_SearchTasksResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.maps.fleetengine.delivery.v1.DeliveryApi
          .internal_static_maps_fleetengine_delivery_v1_SearchTasksResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.maps.fleetengine.delivery.v1.SearchTasksResponse.class,
              google.maps.fleetengine.delivery.v1.SearchTasksResponse.Builder.class);
    }

    // Construct using google.maps.fleetengine.delivery.v1.SearchTasksResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (tasksBuilder_ == null) {
        tasks_ = java.util.Collections.emptyList();
      } else {
        tasks_ = null;
        tasksBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return google.maps.fleetengine.delivery.v1.DeliveryApi
          .internal_static_maps_fleetengine_delivery_v1_SearchTasksResponse_descriptor;
    }

    @java.lang.Override
    public google.maps.fleetengine.delivery.v1.SearchTasksResponse getDefaultInstanceForType() {
      return google.maps.fleetengine.delivery.v1.SearchTasksResponse.getDefaultInstance();
    }

    @java.lang.Override
    public google.maps.fleetengine.delivery.v1.SearchTasksResponse build() {
      google.maps.fleetengine.delivery.v1.SearchTasksResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public google.maps.fleetengine.delivery.v1.SearchTasksResponse buildPartial() {
      google.maps.fleetengine.delivery.v1.SearchTasksResponse result =
          new google.maps.fleetengine.delivery.v1.SearchTasksResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        google.maps.fleetengine.delivery.v1.SearchTasksResponse result) {
      if (tasksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          tasks_ = java.util.Collections.unmodifiableList(tasks_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.tasks_ = tasks_;
      } else {
        result.tasks_ = tasksBuilder_.build();
      }
    }

    private void buildPartial0(google.maps.fleetengine.delivery.v1.SearchTasksResponse result) {
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
      if (other instanceof google.maps.fleetengine.delivery.v1.SearchTasksResponse) {
        return mergeFrom((google.maps.fleetengine.delivery.v1.SearchTasksResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(google.maps.fleetengine.delivery.v1.SearchTasksResponse other) {
      if (other == google.maps.fleetengine.delivery.v1.SearchTasksResponse.getDefaultInstance())
        return this;
      if (tasksBuilder_ == null) {
        if (!other.tasks_.isEmpty()) {
          if (tasks_.isEmpty()) {
            tasks_ = other.tasks_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTasksIsMutable();
            tasks_.addAll(other.tasks_);
          }
          onChanged();
        }
      } else {
        if (!other.tasks_.isEmpty()) {
          if (tasksBuilder_.isEmpty()) {
            tasksBuilder_.dispose();
            tasksBuilder_ = null;
            tasks_ = other.tasks_;
            bitField0_ = (bitField0_ & ~0x00000001);
            tasksBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getTasksFieldBuilder()
                    : null;
          } else {
            tasksBuilder_.addAllMessages(other.tasks_);
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
                google.maps.fleetengine.delivery.v1.Task m =
                    input.readMessage(
                        google.maps.fleetengine.delivery.v1.Task.parser(), extensionRegistry);
                if (tasksBuilder_ == null) {
                  ensureTasksIsMutable();
                  tasks_.add(m);
                } else {
                  tasksBuilder_.addMessage(m);
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

    private java.util.List<google.maps.fleetengine.delivery.v1.Task> tasks_ =
        java.util.Collections.emptyList();

    private void ensureTasksIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        tasks_ = new java.util.ArrayList<google.maps.fleetengine.delivery.v1.Task>(tasks_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            google.maps.fleetengine.delivery.v1.Task,
            google.maps.fleetengine.delivery.v1.Task.Builder,
            google.maps.fleetengine.delivery.v1.TaskOrBuilder>
        tasksBuilder_;

    /**
     *
     *
     * <pre>
     * The set of Tasks for the requested `tracking_id`. A successful response can
     * also be empty. An empty response indicates that no Tasks are associated
     * with the supplied `tracking_id`.
     * </pre>
     *
     * <code>repeated .maps.fleetengine.delivery.v1.Task tasks = 1;</code>
     */
    public java.util.List<google.maps.fleetengine.delivery.v1.Task> getTasksList() {
      if (tasksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tasks_);
      } else {
        return tasksBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The set of Tasks for the requested `tracking_id`. A successful response can
     * also be empty. An empty response indicates that no Tasks are associated
     * with the supplied `tracking_id`.
     * </pre>
     *
     * <code>repeated .maps.fleetengine.delivery.v1.Task tasks = 1;</code>
     */
    public int getTasksCount() {
      if (tasksBuilder_ == null) {
        return tasks_.size();
      } else {
        return tasksBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The set of Tasks for the requested `tracking_id`. A successful response can
     * also be empty. An empty response indicates that no Tasks are associated
     * with the supplied `tracking_id`.
     * </pre>
     *
     * <code>repeated .maps.fleetengine.delivery.v1.Task tasks = 1;</code>
     */
    public google.maps.fleetengine.delivery.v1.Task getTasks(int index) {
      if (tasksBuilder_ == null) {
        return tasks_.get(index);
      } else {
        return tasksBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The set of Tasks for the requested `tracking_id`. A successful response can
     * also be empty. An empty response indicates that no Tasks are associated
     * with the supplied `tracking_id`.
     * </pre>
     *
     * <code>repeated .maps.fleetengine.delivery.v1.Task tasks = 1;</code>
     */
    public Builder setTasks(int index, google.maps.fleetengine.delivery.v1.Task value) {
      if (tasksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTasksIsMutable();
        tasks_.set(index, value);
        onChanged();
      } else {
        tasksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The set of Tasks for the requested `tracking_id`. A successful response can
     * also be empty. An empty response indicates that no Tasks are associated
     * with the supplied `tracking_id`.
     * </pre>
     *
     * <code>repeated .maps.fleetengine.delivery.v1.Task tasks = 1;</code>
     */
    public Builder setTasks(
        int index, google.maps.fleetengine.delivery.v1.Task.Builder builderForValue) {
      if (tasksBuilder_ == null) {
        ensureTasksIsMutable();
        tasks_.set(index, builderForValue.build());
        onChanged();
      } else {
        tasksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The set of Tasks for the requested `tracking_id`. A successful response can
     * also be empty. An empty response indicates that no Tasks are associated
     * with the supplied `tracking_id`.
     * </pre>
     *
     * <code>repeated .maps.fleetengine.delivery.v1.Task tasks = 1;</code>
     */
    public Builder addTasks(google.maps.fleetengine.delivery.v1.Task value) {
      if (tasksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTasksIsMutable();
        tasks_.add(value);
        onChanged();
      } else {
        tasksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The set of Tasks for the requested `tracking_id`. A successful response can
     * also be empty. An empty response indicates that no Tasks are associated
     * with the supplied `tracking_id`.
     * </pre>
     *
     * <code>repeated .maps.fleetengine.delivery.v1.Task tasks = 1;</code>
     */
    public Builder addTasks(int index, google.maps.fleetengine.delivery.v1.Task value) {
      if (tasksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTasksIsMutable();
        tasks_.add(index, value);
        onChanged();
      } else {
        tasksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The set of Tasks for the requested `tracking_id`. A successful response can
     * also be empty. An empty response indicates that no Tasks are associated
     * with the supplied `tracking_id`.
     * </pre>
     *
     * <code>repeated .maps.fleetengine.delivery.v1.Task tasks = 1;</code>
     */
    public Builder addTasks(google.maps.fleetengine.delivery.v1.Task.Builder builderForValue) {
      if (tasksBuilder_ == null) {
        ensureTasksIsMutable();
        tasks_.add(builderForValue.build());
        onChanged();
      } else {
        tasksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The set of Tasks for the requested `tracking_id`. A successful response can
     * also be empty. An empty response indicates that no Tasks are associated
     * with the supplied `tracking_id`.
     * </pre>
     *
     * <code>repeated .maps.fleetengine.delivery.v1.Task tasks = 1;</code>
     */
    public Builder addTasks(
        int index, google.maps.fleetengine.delivery.v1.Task.Builder builderForValue) {
      if (tasksBuilder_ == null) {
        ensureTasksIsMutable();
        tasks_.add(index, builderForValue.build());
        onChanged();
      } else {
        tasksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The set of Tasks for the requested `tracking_id`. A successful response can
     * also be empty. An empty response indicates that no Tasks are associated
     * with the supplied `tracking_id`.
     * </pre>
     *
     * <code>repeated .maps.fleetengine.delivery.v1.Task tasks = 1;</code>
     */
    public Builder addAllTasks(
        java.lang.Iterable<? extends google.maps.fleetengine.delivery.v1.Task> values) {
      if (tasksBuilder_ == null) {
        ensureTasksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, tasks_);
        onChanged();
      } else {
        tasksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The set of Tasks for the requested `tracking_id`. A successful response can
     * also be empty. An empty response indicates that no Tasks are associated
     * with the supplied `tracking_id`.
     * </pre>
     *
     * <code>repeated .maps.fleetengine.delivery.v1.Task tasks = 1;</code>
     */
    public Builder clearTasks() {
      if (tasksBuilder_ == null) {
        tasks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        tasksBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The set of Tasks for the requested `tracking_id`. A successful response can
     * also be empty. An empty response indicates that no Tasks are associated
     * with the supplied `tracking_id`.
     * </pre>
     *
     * <code>repeated .maps.fleetengine.delivery.v1.Task tasks = 1;</code>
     */
    public Builder removeTasks(int index) {
      if (tasksBuilder_ == null) {
        ensureTasksIsMutable();
        tasks_.remove(index);
        onChanged();
      } else {
        tasksBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The set of Tasks for the requested `tracking_id`. A successful response can
     * also be empty. An empty response indicates that no Tasks are associated
     * with the supplied `tracking_id`.
     * </pre>
     *
     * <code>repeated .maps.fleetengine.delivery.v1.Task tasks = 1;</code>
     */
    public google.maps.fleetengine.delivery.v1.Task.Builder getTasksBuilder(int index) {
      return getTasksFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The set of Tasks for the requested `tracking_id`. A successful response can
     * also be empty. An empty response indicates that no Tasks are associated
     * with the supplied `tracking_id`.
     * </pre>
     *
     * <code>repeated .maps.fleetengine.delivery.v1.Task tasks = 1;</code>
     */
    public google.maps.fleetengine.delivery.v1.TaskOrBuilder getTasksOrBuilder(int index) {
      if (tasksBuilder_ == null) {
        return tasks_.get(index);
      } else {
        return tasksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The set of Tasks for the requested `tracking_id`. A successful response can
     * also be empty. An empty response indicates that no Tasks are associated
     * with the supplied `tracking_id`.
     * </pre>
     *
     * <code>repeated .maps.fleetengine.delivery.v1.Task tasks = 1;</code>
     */
    public java.util.List<? extends google.maps.fleetengine.delivery.v1.TaskOrBuilder>
        getTasksOrBuilderList() {
      if (tasksBuilder_ != null) {
        return tasksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(tasks_);
      }
    }
    /**
     *
     *
     * <pre>
     * The set of Tasks for the requested `tracking_id`. A successful response can
     * also be empty. An empty response indicates that no Tasks are associated
     * with the supplied `tracking_id`.
     * </pre>
     *
     * <code>repeated .maps.fleetengine.delivery.v1.Task tasks = 1;</code>
     */
    public google.maps.fleetengine.delivery.v1.Task.Builder addTasksBuilder() {
      return getTasksFieldBuilder()
          .addBuilder(google.maps.fleetengine.delivery.v1.Task.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The set of Tasks for the requested `tracking_id`. A successful response can
     * also be empty. An empty response indicates that no Tasks are associated
     * with the supplied `tracking_id`.
     * </pre>
     *
     * <code>repeated .maps.fleetengine.delivery.v1.Task tasks = 1;</code>
     */
    public google.maps.fleetengine.delivery.v1.Task.Builder addTasksBuilder(int index) {
      return getTasksFieldBuilder()
          .addBuilder(index, google.maps.fleetengine.delivery.v1.Task.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The set of Tasks for the requested `tracking_id`. A successful response can
     * also be empty. An empty response indicates that no Tasks are associated
     * with the supplied `tracking_id`.
     * </pre>
     *
     * <code>repeated .maps.fleetengine.delivery.v1.Task tasks = 1;</code>
     */
    public java.util.List<google.maps.fleetengine.delivery.v1.Task.Builder> getTasksBuilderList() {
      return getTasksFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            google.maps.fleetengine.delivery.v1.Task,
            google.maps.fleetengine.delivery.v1.Task.Builder,
            google.maps.fleetengine.delivery.v1.TaskOrBuilder>
        getTasksFieldBuilder() {
      if (tasksBuilder_ == null) {
        tasksBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                google.maps.fleetengine.delivery.v1.Task,
                google.maps.fleetengine.delivery.v1.Task.Builder,
                google.maps.fleetengine.delivery.v1.TaskOrBuilder>(
                tasks_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        tasks_ = null;
      }
      return tasksBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Pass this token in the `SearchTasksRequest` to continue to
     * list results. If all results have been returned, then this field is either
     * an empty string, or it doesn't appear in the response.
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
     * Pass this token in the `SearchTasksRequest` to continue to
     * list results. If all results have been returned, then this field is either
     * an empty string, or it doesn't appear in the response.
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
     * Pass this token in the `SearchTasksRequest` to continue to
     * list results. If all results have been returned, then this field is either
     * an empty string, or it doesn't appear in the response.
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
     * Pass this token in the `SearchTasksRequest` to continue to
     * list results. If all results have been returned, then this field is either
     * an empty string, or it doesn't appear in the response.
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
     * Pass this token in the `SearchTasksRequest` to continue to
     * list results. If all results have been returned, then this field is either
     * an empty string, or it doesn't appear in the response.
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

    // @@protoc_insertion_point(builder_scope:maps.fleetengine.delivery.v1.SearchTasksResponse)
  }

  // @@protoc_insertion_point(class_scope:maps.fleetengine.delivery.v1.SearchTasksResponse)
  private static final google.maps.fleetengine.delivery.v1.SearchTasksResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new google.maps.fleetengine.delivery.v1.SearchTasksResponse();
  }

  public static google.maps.fleetengine.delivery.v1.SearchTasksResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchTasksResponse> PARSER =
      new com.google.protobuf.AbstractParser<SearchTasksResponse>() {
        @java.lang.Override
        public SearchTasksResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SearchTasksResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchTasksResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public google.maps.fleetengine.delivery.v1.SearchTasksResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
