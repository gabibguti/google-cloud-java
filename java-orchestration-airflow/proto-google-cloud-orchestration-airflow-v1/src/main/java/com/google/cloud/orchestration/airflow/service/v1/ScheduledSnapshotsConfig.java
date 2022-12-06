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
// source: google/cloud/orchestration/airflow/service/v1/environments.proto

package com.google.cloud.orchestration.airflow.service.v1;

/**
 *
 *
 * <pre>
 * The configuration for scheduled snapshot creation mechanism.
 * </pre>
 *
 * Protobuf type {@code google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig}
 */
public final class ScheduledSnapshotsConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig)
    ScheduledSnapshotsConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ScheduledSnapshotsConfig.newBuilder() to construct.
  private ScheduledSnapshotsConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ScheduledSnapshotsConfig() {
    snapshotLocation_ = "";
    snapshotCreationSchedule_ = "";
    timeZone_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ScheduledSnapshotsConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
        .internal_static_google_cloud_orchestration_airflow_service_v1_ScheduledSnapshotsConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
        .internal_static_google_cloud_orchestration_airflow_service_v1_ScheduledSnapshotsConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig.class,
            com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig.Builder
                .class);
  }

  public static final int ENABLED_FIELD_NUMBER = 1;
  private boolean enabled_;
  /**
   *
   *
   * <pre>
   * Optional. Whether scheduled snapshots creation is enabled.
   * </pre>
   *
   * <code>bool enabled = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The enabled.
   */
  @java.lang.Override
  public boolean getEnabled() {
    return enabled_;
  }

  public static final int SNAPSHOT_LOCATION_FIELD_NUMBER = 6;
  private volatile java.lang.Object snapshotLocation_;
  /**
   *
   *
   * <pre>
   * Optional. The Cloud Storage location for storing automatically created snapshots.
   * </pre>
   *
   * <code>string snapshot_location = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The snapshotLocation.
   */
  @java.lang.Override
  public java.lang.String getSnapshotLocation() {
    java.lang.Object ref = snapshotLocation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      snapshotLocation_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. The Cloud Storage location for storing automatically created snapshots.
   * </pre>
   *
   * <code>string snapshot_location = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for snapshotLocation.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSnapshotLocationBytes() {
    java.lang.Object ref = snapshotLocation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      snapshotLocation_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SNAPSHOT_CREATION_SCHEDULE_FIELD_NUMBER = 3;
  private volatile java.lang.Object snapshotCreationSchedule_;
  /**
   *
   *
   * <pre>
   * Optional. The cron expression representing the time when snapshots creation mechanism
   * runs. This field is subject to additional validation around frequency of
   * execution.
   * </pre>
   *
   * <code>string snapshot_creation_schedule = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The snapshotCreationSchedule.
   */
  @java.lang.Override
  public java.lang.String getSnapshotCreationSchedule() {
    java.lang.Object ref = snapshotCreationSchedule_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      snapshotCreationSchedule_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. The cron expression representing the time when snapshots creation mechanism
   * runs. This field is subject to additional validation around frequency of
   * execution.
   * </pre>
   *
   * <code>string snapshot_creation_schedule = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for snapshotCreationSchedule.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSnapshotCreationScheduleBytes() {
    java.lang.Object ref = snapshotCreationSchedule_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      snapshotCreationSchedule_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIME_ZONE_FIELD_NUMBER = 5;
  private volatile java.lang.Object timeZone_;
  /**
   *
   *
   * <pre>
   * Optional. Time zone that sets the context to interpret snapshot_creation_schedule.
   * </pre>
   *
   * <code>string time_zone = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The timeZone.
   */
  @java.lang.Override
  public java.lang.String getTimeZone() {
    java.lang.Object ref = timeZone_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      timeZone_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. Time zone that sets the context to interpret snapshot_creation_schedule.
   * </pre>
   *
   * <code>string time_zone = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for timeZone.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTimeZoneBytes() {
    java.lang.Object ref = timeZone_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      timeZone_ = b;
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
    if (enabled_ != false) {
      output.writeBool(1, enabled_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(snapshotCreationSchedule_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, snapshotCreationSchedule_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(timeZone_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, timeZone_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(snapshotLocation_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, snapshotLocation_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enabled_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, enabled_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(snapshotCreationSchedule_)) {
      size +=
          com.google.protobuf.GeneratedMessageV3.computeStringSize(3, snapshotCreationSchedule_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(timeZone_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, timeZone_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(snapshotLocation_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, snapshotLocation_);
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
    if (!(obj
        instanceof com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig other =
        (com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig) obj;

    if (getEnabled() != other.getEnabled()) return false;
    if (!getSnapshotLocation().equals(other.getSnapshotLocation())) return false;
    if (!getSnapshotCreationSchedule().equals(other.getSnapshotCreationSchedule())) return false;
    if (!getTimeZone().equals(other.getTimeZone())) return false;
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
    hash = (37 * hash) + ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnabled());
    hash = (37 * hash) + SNAPSHOT_LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getSnapshotLocation().hashCode();
    hash = (37 * hash) + SNAPSHOT_CREATION_SCHEDULE_FIELD_NUMBER;
    hash = (53 * hash) + getSnapshotCreationSchedule().hashCode();
    hash = (37 * hash) + TIME_ZONE_FIELD_NUMBER;
    hash = (53 * hash) + getTimeZone().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig
      parseFrom(
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
      com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig prototype) {
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
   * The configuration for scheduled snapshot creation mechanism.
   * </pre>
   *
   * Protobuf type {@code google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig)
      com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
          .internal_static_google_cloud_orchestration_airflow_service_v1_ScheduledSnapshotsConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
          .internal_static_google_cloud_orchestration_airflow_service_v1_ScheduledSnapshotsConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig.class,
              com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      enabled_ = false;

      snapshotLocation_ = "";

      snapshotCreationSchedule_ = "";

      timeZone_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
          .internal_static_google_cloud_orchestration_airflow_service_v1_ScheduledSnapshotsConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig
        getDefaultInstanceForType() {
      return com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig build() {
      com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig
        buildPartial() {
      com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig result =
          new com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig(this);
      result.enabled_ = enabled_;
      result.snapshotLocation_ = snapshotLocation_;
      result.snapshotCreationSchedule_ = snapshotCreationSchedule_;
      result.timeZone_ = timeZone_;
      onBuilt();
      return result;
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
      if (other
          instanceof com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig) {
        return mergeFrom(
            (com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig other) {
      if (other
          == com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig
              .getDefaultInstance()) return this;
      if (other.getEnabled() != false) {
        setEnabled(other.getEnabled());
      }
      if (!other.getSnapshotLocation().isEmpty()) {
        snapshotLocation_ = other.snapshotLocation_;
        onChanged();
      }
      if (!other.getSnapshotCreationSchedule().isEmpty()) {
        snapshotCreationSchedule_ = other.snapshotCreationSchedule_;
        onChanged();
      }
      if (!other.getTimeZone().isEmpty()) {
        timeZone_ = other.timeZone_;
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
            case 8:
              {
                enabled_ = input.readBool();

                break;
              } // case 8
            case 26:
              {
                snapshotCreationSchedule_ = input.readStringRequireUtf8();

                break;
              } // case 26
            case 42:
              {
                timeZone_ = input.readStringRequireUtf8();

                break;
              } // case 42
            case 50:
              {
                snapshotLocation_ = input.readStringRequireUtf8();

                break;
              } // case 50
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

    private boolean enabled_;
    /**
     *
     *
     * <pre>
     * Optional. Whether scheduled snapshots creation is enabled.
     * </pre>
     *
     * <code>bool enabled = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The enabled.
     */
    @java.lang.Override
    public boolean getEnabled() {
      return enabled_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Whether scheduled snapshots creation is enabled.
     * </pre>
     *
     * <code>bool enabled = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The enabled to set.
     * @return This builder for chaining.
     */
    public Builder setEnabled(boolean value) {

      enabled_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Whether scheduled snapshots creation is enabled.
     * </pre>
     *
     * <code>bool enabled = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnabled() {

      enabled_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object snapshotLocation_ = "";
    /**
     *
     *
     * <pre>
     * Optional. The Cloud Storage location for storing automatically created snapshots.
     * </pre>
     *
     * <code>string snapshot_location = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The snapshotLocation.
     */
    public java.lang.String getSnapshotLocation() {
      java.lang.Object ref = snapshotLocation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        snapshotLocation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The Cloud Storage location for storing automatically created snapshots.
     * </pre>
     *
     * <code>string snapshot_location = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for snapshotLocation.
     */
    public com.google.protobuf.ByteString getSnapshotLocationBytes() {
      java.lang.Object ref = snapshotLocation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        snapshotLocation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The Cloud Storage location for storing automatically created snapshots.
     * </pre>
     *
     * <code>string snapshot_location = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The snapshotLocation to set.
     * @return This builder for chaining.
     */
    public Builder setSnapshotLocation(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      snapshotLocation_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The Cloud Storage location for storing automatically created snapshots.
     * </pre>
     *
     * <code>string snapshot_location = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSnapshotLocation() {

      snapshotLocation_ = getDefaultInstance().getSnapshotLocation();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The Cloud Storage location for storing automatically created snapshots.
     * </pre>
     *
     * <code>string snapshot_location = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for snapshotLocation to set.
     * @return This builder for chaining.
     */
    public Builder setSnapshotLocationBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      snapshotLocation_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object snapshotCreationSchedule_ = "";
    /**
     *
     *
     * <pre>
     * Optional. The cron expression representing the time when snapshots creation mechanism
     * runs. This field is subject to additional validation around frequency of
     * execution.
     * </pre>
     *
     * <code>string snapshot_creation_schedule = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The snapshotCreationSchedule.
     */
    public java.lang.String getSnapshotCreationSchedule() {
      java.lang.Object ref = snapshotCreationSchedule_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        snapshotCreationSchedule_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The cron expression representing the time when snapshots creation mechanism
     * runs. This field is subject to additional validation around frequency of
     * execution.
     * </pre>
     *
     * <code>string snapshot_creation_schedule = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for snapshotCreationSchedule.
     */
    public com.google.protobuf.ByteString getSnapshotCreationScheduleBytes() {
      java.lang.Object ref = snapshotCreationSchedule_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        snapshotCreationSchedule_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The cron expression representing the time when snapshots creation mechanism
     * runs. This field is subject to additional validation around frequency of
     * execution.
     * </pre>
     *
     * <code>string snapshot_creation_schedule = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The snapshotCreationSchedule to set.
     * @return This builder for chaining.
     */
    public Builder setSnapshotCreationSchedule(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      snapshotCreationSchedule_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The cron expression representing the time when snapshots creation mechanism
     * runs. This field is subject to additional validation around frequency of
     * execution.
     * </pre>
     *
     * <code>string snapshot_creation_schedule = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSnapshotCreationSchedule() {

      snapshotCreationSchedule_ = getDefaultInstance().getSnapshotCreationSchedule();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The cron expression representing the time when snapshots creation mechanism
     * runs. This field is subject to additional validation around frequency of
     * execution.
     * </pre>
     *
     * <code>string snapshot_creation_schedule = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for snapshotCreationSchedule to set.
     * @return This builder for chaining.
     */
    public Builder setSnapshotCreationScheduleBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      snapshotCreationSchedule_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object timeZone_ = "";
    /**
     *
     *
     * <pre>
     * Optional. Time zone that sets the context to interpret snapshot_creation_schedule.
     * </pre>
     *
     * <code>string time_zone = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The timeZone.
     */
    public java.lang.String getTimeZone() {
      java.lang.Object ref = timeZone_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        timeZone_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Time zone that sets the context to interpret snapshot_creation_schedule.
     * </pre>
     *
     * <code>string time_zone = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for timeZone.
     */
    public com.google.protobuf.ByteString getTimeZoneBytes() {
      java.lang.Object ref = timeZone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        timeZone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Time zone that sets the context to interpret snapshot_creation_schedule.
     * </pre>
     *
     * <code>string time_zone = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The timeZone to set.
     * @return This builder for chaining.
     */
    public Builder setTimeZone(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      timeZone_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Time zone that sets the context to interpret snapshot_creation_schedule.
     * </pre>
     *
     * <code>string time_zone = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTimeZone() {

      timeZone_ = getDefaultInstance().getTimeZone();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Time zone that sets the context to interpret snapshot_creation_schedule.
     * </pre>
     *
     * <code>string time_zone = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for timeZone to set.
     * @return This builder for chaining.
     */
    public Builder setTimeZoneBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      timeZone_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig)
  private static final com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig();
  }

  public static com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ScheduledSnapshotsConfig> PARSER =
      new com.google.protobuf.AbstractParser<ScheduledSnapshotsConfig>() {
        @java.lang.Override
        public ScheduledSnapshotsConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<ScheduledSnapshotsConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ScheduledSnapshotsConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
