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
// source: google/cloud/channel/v1/offers.proto

package com.google.cloud.channel.v1;

/**
 *
 *
 * <pre>
 * Represents period in days/months/years.
 * </pre>
 *
 * Protobuf type {@code google.cloud.channel.v1.Period}
 */
public final class Period extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.channel.v1.Period)
    PeriodOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Period.newBuilder() to construct.
  private Period(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Period() {
    periodType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Period();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.channel.v1.OffersProto
        .internal_static_google_cloud_channel_v1_Period_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.channel.v1.OffersProto
        .internal_static_google_cloud_channel_v1_Period_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.channel.v1.Period.class,
            com.google.cloud.channel.v1.Period.Builder.class);
  }

  public static final int DURATION_FIELD_NUMBER = 1;
  private int duration_ = 0;
  /**
   *
   *
   * <pre>
   * Total duration of Period Type defined.
   * </pre>
   *
   * <code>int32 duration = 1;</code>
   *
   * @return The duration.
   */
  @java.lang.Override
  public int getDuration() {
    return duration_;
  }

  public static final int PERIOD_TYPE_FIELD_NUMBER = 2;
  private int periodType_ = 0;
  /**
   *
   *
   * <pre>
   * Period Type.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.PeriodType period_type = 2;</code>
   *
   * @return The enum numeric value on the wire for periodType.
   */
  @java.lang.Override
  public int getPeriodTypeValue() {
    return periodType_;
  }
  /**
   *
   *
   * <pre>
   * Period Type.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.PeriodType period_type = 2;</code>
   *
   * @return The periodType.
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.PeriodType getPeriodType() {
    com.google.cloud.channel.v1.PeriodType result =
        com.google.cloud.channel.v1.PeriodType.forNumber(periodType_);
    return result == null ? com.google.cloud.channel.v1.PeriodType.UNRECOGNIZED : result;
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
    if (duration_ != 0) {
      output.writeInt32(1, duration_);
    }
    if (periodType_ != com.google.cloud.channel.v1.PeriodType.PERIOD_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, periodType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (duration_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, duration_);
    }
    if (periodType_ != com.google.cloud.channel.v1.PeriodType.PERIOD_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, periodType_);
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
    if (!(obj instanceof com.google.cloud.channel.v1.Period)) {
      return super.equals(obj);
    }
    com.google.cloud.channel.v1.Period other = (com.google.cloud.channel.v1.Period) obj;

    if (getDuration() != other.getDuration()) return false;
    if (periodType_ != other.periodType_) return false;
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
    hash = (37 * hash) + DURATION_FIELD_NUMBER;
    hash = (53 * hash) + getDuration();
    hash = (37 * hash) + PERIOD_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + periodType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.channel.v1.Period parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.Period parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.Period parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.Period parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.Period parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.Period parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.Period parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.Period parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.Period parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.Period parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.Period parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.Period parseFrom(
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

  public static Builder newBuilder(com.google.cloud.channel.v1.Period prototype) {
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
   * Represents period in days/months/years.
   * </pre>
   *
   * Protobuf type {@code google.cloud.channel.v1.Period}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.channel.v1.Period)
      com.google.cloud.channel.v1.PeriodOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.channel.v1.OffersProto
          .internal_static_google_cloud_channel_v1_Period_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.channel.v1.OffersProto
          .internal_static_google_cloud_channel_v1_Period_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.channel.v1.Period.class,
              com.google.cloud.channel.v1.Period.Builder.class);
    }

    // Construct using com.google.cloud.channel.v1.Period.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      duration_ = 0;
      periodType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.channel.v1.OffersProto
          .internal_static_google_cloud_channel_v1_Period_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.Period getDefaultInstanceForType() {
      return com.google.cloud.channel.v1.Period.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.Period build() {
      com.google.cloud.channel.v1.Period result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.Period buildPartial() {
      com.google.cloud.channel.v1.Period result = new com.google.cloud.channel.v1.Period(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.channel.v1.Period result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.duration_ = duration_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.periodType_ = periodType_;
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
      if (other instanceof com.google.cloud.channel.v1.Period) {
        return mergeFrom((com.google.cloud.channel.v1.Period) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.channel.v1.Period other) {
      if (other == com.google.cloud.channel.v1.Period.getDefaultInstance()) return this;
      if (other.getDuration() != 0) {
        setDuration(other.getDuration());
      }
      if (other.periodType_ != 0) {
        setPeriodTypeValue(other.getPeriodTypeValue());
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
                duration_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                periodType_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private int duration_;
    /**
     *
     *
     * <pre>
     * Total duration of Period Type defined.
     * </pre>
     *
     * <code>int32 duration = 1;</code>
     *
     * @return The duration.
     */
    @java.lang.Override
    public int getDuration() {
      return duration_;
    }
    /**
     *
     *
     * <pre>
     * Total duration of Period Type defined.
     * </pre>
     *
     * <code>int32 duration = 1;</code>
     *
     * @param value The duration to set.
     * @return This builder for chaining.
     */
    public Builder setDuration(int value) {

      duration_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Total duration of Period Type defined.
     * </pre>
     *
     * <code>int32 duration = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDuration() {
      bitField0_ = (bitField0_ & ~0x00000001);
      duration_ = 0;
      onChanged();
      return this;
    }

    private int periodType_ = 0;
    /**
     *
     *
     * <pre>
     * Period Type.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.PeriodType period_type = 2;</code>
     *
     * @return The enum numeric value on the wire for periodType.
     */
    @java.lang.Override
    public int getPeriodTypeValue() {
      return periodType_;
    }
    /**
     *
     *
     * <pre>
     * Period Type.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.PeriodType period_type = 2;</code>
     *
     * @param value The enum numeric value on the wire for periodType to set.
     * @return This builder for chaining.
     */
    public Builder setPeriodTypeValue(int value) {
      periodType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Period Type.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.PeriodType period_type = 2;</code>
     *
     * @return The periodType.
     */
    @java.lang.Override
    public com.google.cloud.channel.v1.PeriodType getPeriodType() {
      com.google.cloud.channel.v1.PeriodType result =
          com.google.cloud.channel.v1.PeriodType.forNumber(periodType_);
      return result == null ? com.google.cloud.channel.v1.PeriodType.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Period Type.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.PeriodType period_type = 2;</code>
     *
     * @param value The periodType to set.
     * @return This builder for chaining.
     */
    public Builder setPeriodType(com.google.cloud.channel.v1.PeriodType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      periodType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Period Type.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.PeriodType period_type = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPeriodType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      periodType_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.channel.v1.Period)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.channel.v1.Period)
  private static final com.google.cloud.channel.v1.Period DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.channel.v1.Period();
  }

  public static com.google.cloud.channel.v1.Period getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Period> PARSER =
      new com.google.protobuf.AbstractParser<Period>() {
        @java.lang.Override
        public Period parsePartialFrom(
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

  public static com.google.protobuf.Parser<Period> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Period> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.channel.v1.Period getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
