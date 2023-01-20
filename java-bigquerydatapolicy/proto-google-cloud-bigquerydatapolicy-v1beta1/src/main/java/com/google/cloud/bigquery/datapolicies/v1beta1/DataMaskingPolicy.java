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
// source: google/cloud/bigquery/datapolicies/v1beta1/datapolicy.proto

package com.google.cloud.bigquery.datapolicies.v1beta1;

/**
 *
 *
 * <pre>
 * The data masking policy that is used to specify data masking rule.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy}
 */
public final class DataMaskingPolicy extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy)
    DataMaskingPolicyOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DataMaskingPolicy.newBuilder() to construct.
  private DataMaskingPolicy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DataMaskingPolicy() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DataMaskingPolicy();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.datapolicies.v1beta1.DataPolicyProto
        .internal_static_google_cloud_bigquery_datapolicies_v1beta1_DataMaskingPolicy_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.datapolicies.v1beta1.DataPolicyProto
        .internal_static_google_cloud_bigquery_datapolicies_v1beta1_DataMaskingPolicy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy.class,
            com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * The available masking rules. Learn more here:
   * https://cloud.google.com/bigquery/docs/column-data-masking-intro#masking_options.
   * </pre>
   *
   * Protobuf enum {@code
   * google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy.PredefinedExpression}
   */
  public enum PredefinedExpression implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Default, unspecified predefined expression. No masking will take place
     * since no expression is specified.
     * </pre>
     *
     * <code>PREDEFINED_EXPRESSION_UNSPECIFIED = 0;</code>
     */
    PREDEFINED_EXPRESSION_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Masking expression to replace data with SHA-256 hash.
     * </pre>
     *
     * <code>SHA256 = 3;</code>
     */
    SHA256(3),
    /**
     *
     *
     * <pre>
     * Masking expression to replace data with NULLs.
     * </pre>
     *
     * <code>ALWAYS_NULL = 5;</code>
     */
    ALWAYS_NULL(5),
    /**
     *
     *
     * <pre>
     * Masking expression to replace data with their default masking values.
     * The default masking values for each type listed as below:
     * * STRING: ""
     * * BYTES: b''
     * * INTEGER: 0
     * * FLOAT: 0.0
     * * NUMERIC: 0
     * * BOOLEAN: FALSE
     * * TIMESTAMP: 0001-01-01 00:00:00 UTC
     * * DATE: 0001-01-01
     * * TIME: 00:00:00
     * * DATETIME: 0001-01-01T00:00:00
     * * GEOGRAPHY: POINT(0 0)
     * * BIGNUMERIC: 0
     * * ARRAY: []
     * * STRUCT: NOT_APPLICABLE
     * * JSON: NULL
     * </pre>
     *
     * <code>DEFAULT_MASKING_VALUE = 7;</code>
     */
    DEFAULT_MASKING_VALUE(7),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Default, unspecified predefined expression. No masking will take place
     * since no expression is specified.
     * </pre>
     *
     * <code>PREDEFINED_EXPRESSION_UNSPECIFIED = 0;</code>
     */
    public static final int PREDEFINED_EXPRESSION_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Masking expression to replace data with SHA-256 hash.
     * </pre>
     *
     * <code>SHA256 = 3;</code>
     */
    public static final int SHA256_VALUE = 3;
    /**
     *
     *
     * <pre>
     * Masking expression to replace data with NULLs.
     * </pre>
     *
     * <code>ALWAYS_NULL = 5;</code>
     */
    public static final int ALWAYS_NULL_VALUE = 5;
    /**
     *
     *
     * <pre>
     * Masking expression to replace data with their default masking values.
     * The default masking values for each type listed as below:
     * * STRING: ""
     * * BYTES: b''
     * * INTEGER: 0
     * * FLOAT: 0.0
     * * NUMERIC: 0
     * * BOOLEAN: FALSE
     * * TIMESTAMP: 0001-01-01 00:00:00 UTC
     * * DATE: 0001-01-01
     * * TIME: 00:00:00
     * * DATETIME: 0001-01-01T00:00:00
     * * GEOGRAPHY: POINT(0 0)
     * * BIGNUMERIC: 0
     * * ARRAY: []
     * * STRUCT: NOT_APPLICABLE
     * * JSON: NULL
     * </pre>
     *
     * <code>DEFAULT_MASKING_VALUE = 7;</code>
     */
    public static final int DEFAULT_MASKING_VALUE_VALUE = 7;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PredefinedExpression valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static PredefinedExpression forNumber(int value) {
      switch (value) {
        case 0:
          return PREDEFINED_EXPRESSION_UNSPECIFIED;
        case 3:
          return SHA256;
        case 5:
          return ALWAYS_NULL;
        case 7:
          return DEFAULT_MASKING_VALUE;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PredefinedExpression>
        internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<PredefinedExpression>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<PredefinedExpression>() {
              public PredefinedExpression findValueByNumber(int number) {
                return PredefinedExpression.forNumber(number);
              }
            };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final PredefinedExpression[] VALUES = values();

    public static PredefinedExpression valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private PredefinedExpression(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy.PredefinedExpression)
  }

  private int maskingExpressionCase_ = 0;
  private java.lang.Object maskingExpression_;

  public enum MaskingExpressionCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    PREDEFINED_EXPRESSION(1),
    MASKINGEXPRESSION_NOT_SET(0);
    private final int value;

    private MaskingExpressionCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MaskingExpressionCase valueOf(int value) {
      return forNumber(value);
    }

    public static MaskingExpressionCase forNumber(int value) {
      switch (value) {
        case 1:
          return PREDEFINED_EXPRESSION;
        case 0:
          return MASKINGEXPRESSION_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public MaskingExpressionCase getMaskingExpressionCase() {
    return MaskingExpressionCase.forNumber(maskingExpressionCase_);
  }

  public static final int PREDEFINED_EXPRESSION_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * A predefined masking expression.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy.PredefinedExpression predefined_expression = 1;
   * </code>
   *
   * @return Whether the predefinedExpression field is set.
   */
  public boolean hasPredefinedExpression() {
    return maskingExpressionCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * A predefined masking expression.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy.PredefinedExpression predefined_expression = 1;
   * </code>
   *
   * @return The enum numeric value on the wire for predefinedExpression.
   */
  public int getPredefinedExpressionValue() {
    if (maskingExpressionCase_ == 1) {
      return (java.lang.Integer) maskingExpression_;
    }
    return 0;
  }
  /**
   *
   *
   * <pre>
   * A predefined masking expression.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy.PredefinedExpression predefined_expression = 1;
   * </code>
   *
   * @return The predefinedExpression.
   */
  public com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy.PredefinedExpression
      getPredefinedExpression() {
    if (maskingExpressionCase_ == 1) {
      com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy.PredefinedExpression result =
          com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy.PredefinedExpression
              .forNumber((java.lang.Integer) maskingExpression_);
      return result == null
          ? com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy.PredefinedExpression
              .UNRECOGNIZED
          : result;
    }
    return com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy.PredefinedExpression
        .PREDEFINED_EXPRESSION_UNSPECIFIED;
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
    if (maskingExpressionCase_ == 1) {
      output.writeEnum(1, ((java.lang.Integer) maskingExpression_));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (maskingExpressionCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeEnumSize(
              1, ((java.lang.Integer) maskingExpression_));
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
    if (!(obj instanceof com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy other =
        (com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy) obj;

    if (!getMaskingExpressionCase().equals(other.getMaskingExpressionCase())) return false;
    switch (maskingExpressionCase_) {
      case 1:
        if (getPredefinedExpressionValue() != other.getPredefinedExpressionValue()) return false;
        break;
      case 0:
      default:
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
    switch (maskingExpressionCase_) {
      case 1:
        hash = (37 * hash) + PREDEFINED_EXPRESSION_FIELD_NUMBER;
        hash = (53 * hash) + getPredefinedExpressionValue();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy parseFrom(
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
      com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy prototype) {
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
   * The data masking policy that is used to specify data masking rule.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy)
      com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.datapolicies.v1beta1.DataPolicyProto
          .internal_static_google_cloud_bigquery_datapolicies_v1beta1_DataMaskingPolicy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.datapolicies.v1beta1.DataPolicyProto
          .internal_static_google_cloud_bigquery_datapolicies_v1beta1_DataMaskingPolicy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy.class,
              com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      maskingExpressionCase_ = 0;
      maskingExpression_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.datapolicies.v1beta1.DataPolicyProto
          .internal_static_google_cloud_bigquery_datapolicies_v1beta1_DataMaskingPolicy_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy
        getDefaultInstanceForType() {
      return com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy build() {
      com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy buildPartial() {
      com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy result =
          new com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(
        com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy result) {
      result.maskingExpressionCase_ = maskingExpressionCase_;
      result.maskingExpression_ = this.maskingExpression_;
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
      if (other instanceof com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy) {
        return mergeFrom((com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy other) {
      if (other
          == com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy.getDefaultInstance())
        return this;
      switch (other.getMaskingExpressionCase()) {
        case PREDEFINED_EXPRESSION:
          {
            setPredefinedExpressionValue(other.getPredefinedExpressionValue());
            break;
          }
        case MASKINGEXPRESSION_NOT_SET:
          {
            break;
          }
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
                int rawValue = input.readEnum();
                maskingExpressionCase_ = 1;
                maskingExpression_ = rawValue;
                break;
              } // case 8
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

    private int maskingExpressionCase_ = 0;
    private java.lang.Object maskingExpression_;

    public MaskingExpressionCase getMaskingExpressionCase() {
      return MaskingExpressionCase.forNumber(maskingExpressionCase_);
    }

    public Builder clearMaskingExpression() {
      maskingExpressionCase_ = 0;
      maskingExpression_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     *
     *
     * <pre>
     * A predefined masking expression.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy.PredefinedExpression predefined_expression = 1;
     * </code>
     *
     * @return Whether the predefinedExpression field is set.
     */
    @java.lang.Override
    public boolean hasPredefinedExpression() {
      return maskingExpressionCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * A predefined masking expression.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy.PredefinedExpression predefined_expression = 1;
     * </code>
     *
     * @return The enum numeric value on the wire for predefinedExpression.
     */
    @java.lang.Override
    public int getPredefinedExpressionValue() {
      if (maskingExpressionCase_ == 1) {
        return ((java.lang.Integer) maskingExpression_).intValue();
      }
      return 0;
    }
    /**
     *
     *
     * <pre>
     * A predefined masking expression.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy.PredefinedExpression predefined_expression = 1;
     * </code>
     *
     * @param value The enum numeric value on the wire for predefinedExpression to set.
     * @return This builder for chaining.
     */
    public Builder setPredefinedExpressionValue(int value) {
      maskingExpressionCase_ = 1;
      maskingExpression_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A predefined masking expression.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy.PredefinedExpression predefined_expression = 1;
     * </code>
     *
     * @return The predefinedExpression.
     */
    @java.lang.Override
    public com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy.PredefinedExpression
        getPredefinedExpression() {
      if (maskingExpressionCase_ == 1) {
        com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy.PredefinedExpression
            result =
                com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy
                    .PredefinedExpression.forNumber((java.lang.Integer) maskingExpression_);
        return result == null
            ? com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy.PredefinedExpression
                .UNRECOGNIZED
            : result;
      }
      return com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy.PredefinedExpression
          .PREDEFINED_EXPRESSION_UNSPECIFIED;
    }
    /**
     *
     *
     * <pre>
     * A predefined masking expression.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy.PredefinedExpression predefined_expression = 1;
     * </code>
     *
     * @param value The predefinedExpression to set.
     * @return This builder for chaining.
     */
    public Builder setPredefinedExpression(
        com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy.PredefinedExpression
            value) {
      if (value == null) {
        throw new NullPointerException();
      }
      maskingExpressionCase_ = 1;
      maskingExpression_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A predefined masking expression.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy.PredefinedExpression predefined_expression = 1;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPredefinedExpression() {
      if (maskingExpressionCase_ == 1) {
        maskingExpressionCase_ = 0;
        maskingExpression_ = null;
        onChanged();
      }
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy)
  private static final com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy();
  }

  public static com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DataMaskingPolicy> PARSER =
      new com.google.protobuf.AbstractParser<DataMaskingPolicy>() {
        @java.lang.Override
        public DataMaskingPolicy parsePartialFrom(
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

  public static com.google.protobuf.Parser<DataMaskingPolicy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DataMaskingPolicy> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.datapolicies.v1beta1.DataMaskingPolicy
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
