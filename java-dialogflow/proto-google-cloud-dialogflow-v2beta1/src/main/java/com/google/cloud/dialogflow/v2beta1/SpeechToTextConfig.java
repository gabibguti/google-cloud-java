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
// source: google/cloud/dialogflow/v2beta1/audio_config.proto

package com.google.cloud.dialogflow.v2beta1;

/**
 *
 *
 * <pre>
 * Configures speech transcription for
 * [ConversationProfile][google.cloud.dialogflow.v2beta1.ConversationProfile].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.SpeechToTextConfig}
 */
public final class SpeechToTextConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.SpeechToTextConfig)
    SpeechToTextConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SpeechToTextConfig.newBuilder() to construct.
  private SpeechToTextConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SpeechToTextConfig() {
    speechModelVariant_ = 0;
    model_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SpeechToTextConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2beta1.AudioConfigProto
        .internal_static_google_cloud_dialogflow_v2beta1_SpeechToTextConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.AudioConfigProto
        .internal_static_google_cloud_dialogflow_v2beta1_SpeechToTextConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.SpeechToTextConfig.class,
            com.google.cloud.dialogflow.v2beta1.SpeechToTextConfig.Builder.class);
  }

  public static final int SPEECH_MODEL_VARIANT_FIELD_NUMBER = 1;
  private int speechModelVariant_ = 0;
  /**
   *
   *
   * <pre>
   * The speech model used in speech to text.
   * `SPEECH_MODEL_VARIANT_UNSPECIFIED`, `USE_BEST_AVAILABLE` will be treated as
   * `USE_ENHANCED`. It can be overridden in
   * [AnalyzeContentRequest][google.cloud.dialogflow.v2beta1.AnalyzeContentRequest]
   * and
   * [StreamingAnalyzeContentRequest][google.cloud.dialogflow.v2beta1.StreamingAnalyzeContentRequest]
   * request. If enhanced model variant is specified and an enhanced version of
   * the specified model for the language does not exist, then it would emit an
   * error.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.SpeechModelVariant speech_model_variant = 1;</code>
   *
   * @return The enum numeric value on the wire for speechModelVariant.
   */
  @java.lang.Override
  public int getSpeechModelVariantValue() {
    return speechModelVariant_;
  }
  /**
   *
   *
   * <pre>
   * The speech model used in speech to text.
   * `SPEECH_MODEL_VARIANT_UNSPECIFIED`, `USE_BEST_AVAILABLE` will be treated as
   * `USE_ENHANCED`. It can be overridden in
   * [AnalyzeContentRequest][google.cloud.dialogflow.v2beta1.AnalyzeContentRequest]
   * and
   * [StreamingAnalyzeContentRequest][google.cloud.dialogflow.v2beta1.StreamingAnalyzeContentRequest]
   * request. If enhanced model variant is specified and an enhanced version of
   * the specified model for the language does not exist, then it would emit an
   * error.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.SpeechModelVariant speech_model_variant = 1;</code>
   *
   * @return The speechModelVariant.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.SpeechModelVariant getSpeechModelVariant() {
    com.google.cloud.dialogflow.v2beta1.SpeechModelVariant result =
        com.google.cloud.dialogflow.v2beta1.SpeechModelVariant.forNumber(speechModelVariant_);
    return result == null
        ? com.google.cloud.dialogflow.v2beta1.SpeechModelVariant.UNRECOGNIZED
        : result;
  }

  public static final int MODEL_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object model_ = "";
  /**
   *
   *
   * <pre>
   * Which Speech model to select. Select the model best suited to your domain
   * to get best results. If a model is not explicitly specified, then a default
   * model is used.
   * Refer to
   * [Cloud Speech API
   * documentation](https://cloud.google.com/speech-to-text/docs/basics#select-model)
   * for more details.
   * </pre>
   *
   * <code>string model = 2;</code>
   *
   * @return The model.
   */
  @java.lang.Override
  public java.lang.String getModel() {
    java.lang.Object ref = model_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      model_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Which Speech model to select. Select the model best suited to your domain
   * to get best results. If a model is not explicitly specified, then a default
   * model is used.
   * Refer to
   * [Cloud Speech API
   * documentation](https://cloud.google.com/speech-to-text/docs/basics#select-model)
   * for more details.
   * </pre>
   *
   * <code>string model = 2;</code>
   *
   * @return The bytes for model.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getModelBytes() {
    java.lang.Object ref = model_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      model_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USE_TIMEOUT_BASED_ENDPOINTING_FIELD_NUMBER = 11;
  private boolean useTimeoutBasedEndpointing_ = false;
  /**
   *
   *
   * <pre>
   * Use timeout based endpointing, interpreting endpointer sensitivy as
   * seconds of timeout value.
   * </pre>
   *
   * <code>bool use_timeout_based_endpointing = 11;</code>
   *
   * @return The useTimeoutBasedEndpointing.
   */
  @java.lang.Override
  public boolean getUseTimeoutBasedEndpointing() {
    return useTimeoutBasedEndpointing_;
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
    if (speechModelVariant_
        != com.google.cloud.dialogflow.v2beta1.SpeechModelVariant.SPEECH_MODEL_VARIANT_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, speechModelVariant_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(model_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, model_);
    }
    if (useTimeoutBasedEndpointing_ != false) {
      output.writeBool(11, useTimeoutBasedEndpointing_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (speechModelVariant_
        != com.google.cloud.dialogflow.v2beta1.SpeechModelVariant.SPEECH_MODEL_VARIANT_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, speechModelVariant_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(model_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, model_);
    }
    if (useTimeoutBasedEndpointing_ != false) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBoolSize(11, useTimeoutBasedEndpointing_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.SpeechToTextConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.SpeechToTextConfig other =
        (com.google.cloud.dialogflow.v2beta1.SpeechToTextConfig) obj;

    if (speechModelVariant_ != other.speechModelVariant_) return false;
    if (!getModel().equals(other.getModel())) return false;
    if (getUseTimeoutBasedEndpointing() != other.getUseTimeoutBasedEndpointing()) return false;
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
    hash = (37 * hash) + SPEECH_MODEL_VARIANT_FIELD_NUMBER;
    hash = (53 * hash) + speechModelVariant_;
    hash = (37 * hash) + MODEL_FIELD_NUMBER;
    hash = (53 * hash) + getModel().hashCode();
    hash = (37 * hash) + USE_TIMEOUT_BASED_ENDPOINTING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getUseTimeoutBasedEndpointing());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.SpeechToTextConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.SpeechToTextConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.SpeechToTextConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.SpeechToTextConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.SpeechToTextConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.SpeechToTextConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.SpeechToTextConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.SpeechToTextConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.SpeechToTextConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.SpeechToTextConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.SpeechToTextConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.SpeechToTextConfig parseFrom(
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
      com.google.cloud.dialogflow.v2beta1.SpeechToTextConfig prototype) {
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
   * Configures speech transcription for
   * [ConversationProfile][google.cloud.dialogflow.v2beta1.ConversationProfile].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.SpeechToTextConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.SpeechToTextConfig)
      com.google.cloud.dialogflow.v2beta1.SpeechToTextConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.AudioConfigProto
          .internal_static_google_cloud_dialogflow_v2beta1_SpeechToTextConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.AudioConfigProto
          .internal_static_google_cloud_dialogflow_v2beta1_SpeechToTextConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.SpeechToTextConfig.class,
              com.google.cloud.dialogflow.v2beta1.SpeechToTextConfig.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.SpeechToTextConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      speechModelVariant_ = 0;
      model_ = "";
      useTimeoutBasedEndpointing_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2beta1.AudioConfigProto
          .internal_static_google_cloud_dialogflow_v2beta1_SpeechToTextConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.SpeechToTextConfig getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.SpeechToTextConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.SpeechToTextConfig build() {
      com.google.cloud.dialogflow.v2beta1.SpeechToTextConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.SpeechToTextConfig buildPartial() {
      com.google.cloud.dialogflow.v2beta1.SpeechToTextConfig result =
          new com.google.cloud.dialogflow.v2beta1.SpeechToTextConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dialogflow.v2beta1.SpeechToTextConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.speechModelVariant_ = speechModelVariant_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.model_ = model_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.useTimeoutBasedEndpointing_ = useTimeoutBasedEndpointing_;
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
      if (other instanceof com.google.cloud.dialogflow.v2beta1.SpeechToTextConfig) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.SpeechToTextConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.SpeechToTextConfig other) {
      if (other == com.google.cloud.dialogflow.v2beta1.SpeechToTextConfig.getDefaultInstance())
        return this;
      if (other.speechModelVariant_ != 0) {
        setSpeechModelVariantValue(other.getSpeechModelVariantValue());
      }
      if (!other.getModel().isEmpty()) {
        model_ = other.model_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getUseTimeoutBasedEndpointing() != false) {
        setUseTimeoutBasedEndpointing(other.getUseTimeoutBasedEndpointing());
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
                speechModelVariant_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                model_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 88:
              {
                useTimeoutBasedEndpointing_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 88
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

    private int speechModelVariant_ = 0;
    /**
     *
     *
     * <pre>
     * The speech model used in speech to text.
     * `SPEECH_MODEL_VARIANT_UNSPECIFIED`, `USE_BEST_AVAILABLE` will be treated as
     * `USE_ENHANCED`. It can be overridden in
     * [AnalyzeContentRequest][google.cloud.dialogflow.v2beta1.AnalyzeContentRequest]
     * and
     * [StreamingAnalyzeContentRequest][google.cloud.dialogflow.v2beta1.StreamingAnalyzeContentRequest]
     * request. If enhanced model variant is specified and an enhanced version of
     * the specified model for the language does not exist, then it would emit an
     * error.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.SpeechModelVariant speech_model_variant = 1;</code>
     *
     * @return The enum numeric value on the wire for speechModelVariant.
     */
    @java.lang.Override
    public int getSpeechModelVariantValue() {
      return speechModelVariant_;
    }
    /**
     *
     *
     * <pre>
     * The speech model used in speech to text.
     * `SPEECH_MODEL_VARIANT_UNSPECIFIED`, `USE_BEST_AVAILABLE` will be treated as
     * `USE_ENHANCED`. It can be overridden in
     * [AnalyzeContentRequest][google.cloud.dialogflow.v2beta1.AnalyzeContentRequest]
     * and
     * [StreamingAnalyzeContentRequest][google.cloud.dialogflow.v2beta1.StreamingAnalyzeContentRequest]
     * request. If enhanced model variant is specified and an enhanced version of
     * the specified model for the language does not exist, then it would emit an
     * error.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.SpeechModelVariant speech_model_variant = 1;</code>
     *
     * @param value The enum numeric value on the wire for speechModelVariant to set.
     * @return This builder for chaining.
     */
    public Builder setSpeechModelVariantValue(int value) {
      speechModelVariant_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The speech model used in speech to text.
     * `SPEECH_MODEL_VARIANT_UNSPECIFIED`, `USE_BEST_AVAILABLE` will be treated as
     * `USE_ENHANCED`. It can be overridden in
     * [AnalyzeContentRequest][google.cloud.dialogflow.v2beta1.AnalyzeContentRequest]
     * and
     * [StreamingAnalyzeContentRequest][google.cloud.dialogflow.v2beta1.StreamingAnalyzeContentRequest]
     * request. If enhanced model variant is specified and an enhanced version of
     * the specified model for the language does not exist, then it would emit an
     * error.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.SpeechModelVariant speech_model_variant = 1;</code>
     *
     * @return The speechModelVariant.
     */
    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.SpeechModelVariant getSpeechModelVariant() {
      com.google.cloud.dialogflow.v2beta1.SpeechModelVariant result =
          com.google.cloud.dialogflow.v2beta1.SpeechModelVariant.forNumber(speechModelVariant_);
      return result == null
          ? com.google.cloud.dialogflow.v2beta1.SpeechModelVariant.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The speech model used in speech to text.
     * `SPEECH_MODEL_VARIANT_UNSPECIFIED`, `USE_BEST_AVAILABLE` will be treated as
     * `USE_ENHANCED`. It can be overridden in
     * [AnalyzeContentRequest][google.cloud.dialogflow.v2beta1.AnalyzeContentRequest]
     * and
     * [StreamingAnalyzeContentRequest][google.cloud.dialogflow.v2beta1.StreamingAnalyzeContentRequest]
     * request. If enhanced model variant is specified and an enhanced version of
     * the specified model for the language does not exist, then it would emit an
     * error.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.SpeechModelVariant speech_model_variant = 1;</code>
     *
     * @param value The speechModelVariant to set.
     * @return This builder for chaining.
     */
    public Builder setSpeechModelVariant(
        com.google.cloud.dialogflow.v2beta1.SpeechModelVariant value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      speechModelVariant_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The speech model used in speech to text.
     * `SPEECH_MODEL_VARIANT_UNSPECIFIED`, `USE_BEST_AVAILABLE` will be treated as
     * `USE_ENHANCED`. It can be overridden in
     * [AnalyzeContentRequest][google.cloud.dialogflow.v2beta1.AnalyzeContentRequest]
     * and
     * [StreamingAnalyzeContentRequest][google.cloud.dialogflow.v2beta1.StreamingAnalyzeContentRequest]
     * request. If enhanced model variant is specified and an enhanced version of
     * the specified model for the language does not exist, then it would emit an
     * error.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.SpeechModelVariant speech_model_variant = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSpeechModelVariant() {
      bitField0_ = (bitField0_ & ~0x00000001);
      speechModelVariant_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object model_ = "";
    /**
     *
     *
     * <pre>
     * Which Speech model to select. Select the model best suited to your domain
     * to get best results. If a model is not explicitly specified, then a default
     * model is used.
     * Refer to
     * [Cloud Speech API
     * documentation](https://cloud.google.com/speech-to-text/docs/basics#select-model)
     * for more details.
     * </pre>
     *
     * <code>string model = 2;</code>
     *
     * @return The model.
     */
    public java.lang.String getModel() {
      java.lang.Object ref = model_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        model_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Which Speech model to select. Select the model best suited to your domain
     * to get best results. If a model is not explicitly specified, then a default
     * model is used.
     * Refer to
     * [Cloud Speech API
     * documentation](https://cloud.google.com/speech-to-text/docs/basics#select-model)
     * for more details.
     * </pre>
     *
     * <code>string model = 2;</code>
     *
     * @return The bytes for model.
     */
    public com.google.protobuf.ByteString getModelBytes() {
      java.lang.Object ref = model_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        model_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Which Speech model to select. Select the model best suited to your domain
     * to get best results. If a model is not explicitly specified, then a default
     * model is used.
     * Refer to
     * [Cloud Speech API
     * documentation](https://cloud.google.com/speech-to-text/docs/basics#select-model)
     * for more details.
     * </pre>
     *
     * <code>string model = 2;</code>
     *
     * @param value The model to set.
     * @return This builder for chaining.
     */
    public Builder setModel(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      model_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Which Speech model to select. Select the model best suited to your domain
     * to get best results. If a model is not explicitly specified, then a default
     * model is used.
     * Refer to
     * [Cloud Speech API
     * documentation](https://cloud.google.com/speech-to-text/docs/basics#select-model)
     * for more details.
     * </pre>
     *
     * <code>string model = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearModel() {
      model_ = getDefaultInstance().getModel();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Which Speech model to select. Select the model best suited to your domain
     * to get best results. If a model is not explicitly specified, then a default
     * model is used.
     * Refer to
     * [Cloud Speech API
     * documentation](https://cloud.google.com/speech-to-text/docs/basics#select-model)
     * for more details.
     * </pre>
     *
     * <code>string model = 2;</code>
     *
     * @param value The bytes for model to set.
     * @return This builder for chaining.
     */
    public Builder setModelBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      model_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private boolean useTimeoutBasedEndpointing_;
    /**
     *
     *
     * <pre>
     * Use timeout based endpointing, interpreting endpointer sensitivy as
     * seconds of timeout value.
     * </pre>
     *
     * <code>bool use_timeout_based_endpointing = 11;</code>
     *
     * @return The useTimeoutBasedEndpointing.
     */
    @java.lang.Override
    public boolean getUseTimeoutBasedEndpointing() {
      return useTimeoutBasedEndpointing_;
    }
    /**
     *
     *
     * <pre>
     * Use timeout based endpointing, interpreting endpointer sensitivy as
     * seconds of timeout value.
     * </pre>
     *
     * <code>bool use_timeout_based_endpointing = 11;</code>
     *
     * @param value The useTimeoutBasedEndpointing to set.
     * @return This builder for chaining.
     */
    public Builder setUseTimeoutBasedEndpointing(boolean value) {

      useTimeoutBasedEndpointing_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Use timeout based endpointing, interpreting endpointer sensitivy as
     * seconds of timeout value.
     * </pre>
     *
     * <code>bool use_timeout_based_endpointing = 11;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUseTimeoutBasedEndpointing() {
      bitField0_ = (bitField0_ & ~0x00000004);
      useTimeoutBasedEndpointing_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.SpeechToTextConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.SpeechToTextConfig)
  private static final com.google.cloud.dialogflow.v2beta1.SpeechToTextConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.SpeechToTextConfig();
  }

  public static com.google.cloud.dialogflow.v2beta1.SpeechToTextConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SpeechToTextConfig> PARSER =
      new com.google.protobuf.AbstractParser<SpeechToTextConfig>() {
        @java.lang.Override
        public SpeechToTextConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<SpeechToTextConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SpeechToTextConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.SpeechToTextConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
