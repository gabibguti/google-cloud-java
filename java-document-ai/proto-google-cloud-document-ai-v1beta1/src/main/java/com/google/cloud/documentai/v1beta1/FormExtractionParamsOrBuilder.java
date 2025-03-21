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

public interface FormExtractionParamsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta1.FormExtractionParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Whether to enable form extraction.
   * </pre>
   *
   * <code>bool enabled = 1;</code>
   *
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   *
   *
   * <pre>
   * User can provide pairs of (key text, value type) to improve the parsing
   * result.
   *
   * For example, if a document has a field called "Date" that holds a date
   * value and a field called "Amount" that may hold either a currency value
   * (e.g., "$500.00") or a simple number value (e.g., "20"), you could use the
   * following hints: [ {"key": "Date", value_types: [ "DATE"]}, {"key":
   * "Amount", "value_types": [ "PRICE", "NUMBER" ]} ]
   *
   * If the value type is unknown, but you want to provide hints for the keys,
   * you can leave the value_types field blank. e.g. {"key": "Date",
   * "value_types": []}
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta1.KeyValuePairHint key_value_pair_hints = 2;
   * </code>
   */
  java.util.List<com.google.cloud.documentai.v1beta1.KeyValuePairHint> getKeyValuePairHintsList();
  /**
   *
   *
   * <pre>
   * User can provide pairs of (key text, value type) to improve the parsing
   * result.
   *
   * For example, if a document has a field called "Date" that holds a date
   * value and a field called "Amount" that may hold either a currency value
   * (e.g., "$500.00") or a simple number value (e.g., "20"), you could use the
   * following hints: [ {"key": "Date", value_types: [ "DATE"]}, {"key":
   * "Amount", "value_types": [ "PRICE", "NUMBER" ]} ]
   *
   * If the value type is unknown, but you want to provide hints for the keys,
   * you can leave the value_types field blank. e.g. {"key": "Date",
   * "value_types": []}
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta1.KeyValuePairHint key_value_pair_hints = 2;
   * </code>
   */
  com.google.cloud.documentai.v1beta1.KeyValuePairHint getKeyValuePairHints(int index);
  /**
   *
   *
   * <pre>
   * User can provide pairs of (key text, value type) to improve the parsing
   * result.
   *
   * For example, if a document has a field called "Date" that holds a date
   * value and a field called "Amount" that may hold either a currency value
   * (e.g., "$500.00") or a simple number value (e.g., "20"), you could use the
   * following hints: [ {"key": "Date", value_types: [ "DATE"]}, {"key":
   * "Amount", "value_types": [ "PRICE", "NUMBER" ]} ]
   *
   * If the value type is unknown, but you want to provide hints for the keys,
   * you can leave the value_types field blank. e.g. {"key": "Date",
   * "value_types": []}
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta1.KeyValuePairHint key_value_pair_hints = 2;
   * </code>
   */
  int getKeyValuePairHintsCount();
  /**
   *
   *
   * <pre>
   * User can provide pairs of (key text, value type) to improve the parsing
   * result.
   *
   * For example, if a document has a field called "Date" that holds a date
   * value and a field called "Amount" that may hold either a currency value
   * (e.g., "$500.00") or a simple number value (e.g., "20"), you could use the
   * following hints: [ {"key": "Date", value_types: [ "DATE"]}, {"key":
   * "Amount", "value_types": [ "PRICE", "NUMBER" ]} ]
   *
   * If the value type is unknown, but you want to provide hints for the keys,
   * you can leave the value_types field blank. e.g. {"key": "Date",
   * "value_types": []}
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta1.KeyValuePairHint key_value_pair_hints = 2;
   * </code>
   */
  java.util.List<? extends com.google.cloud.documentai.v1beta1.KeyValuePairHintOrBuilder>
      getKeyValuePairHintsOrBuilderList();
  /**
   *
   *
   * <pre>
   * User can provide pairs of (key text, value type) to improve the parsing
   * result.
   *
   * For example, if a document has a field called "Date" that holds a date
   * value and a field called "Amount" that may hold either a currency value
   * (e.g., "$500.00") or a simple number value (e.g., "20"), you could use the
   * following hints: [ {"key": "Date", value_types: [ "DATE"]}, {"key":
   * "Amount", "value_types": [ "PRICE", "NUMBER" ]} ]
   *
   * If the value type is unknown, but you want to provide hints for the keys,
   * you can leave the value_types field blank. e.g. {"key": "Date",
   * "value_types": []}
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta1.KeyValuePairHint key_value_pair_hints = 2;
   * </code>
   */
  com.google.cloud.documentai.v1beta1.KeyValuePairHintOrBuilder getKeyValuePairHintsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Model version of the form extraction system. Default is
   * "builtin/stable". Specify "builtin/latest" for the latest model.
   * </pre>
   *
   * <code>string model_version = 3;</code>
   *
   * @return The modelVersion.
   */
  java.lang.String getModelVersion();
  /**
   *
   *
   * <pre>
   * Model version of the form extraction system. Default is
   * "builtin/stable". Specify "builtin/latest" for the latest model.
   * </pre>
   *
   * <code>string model_version = 3;</code>
   *
   * @return The bytes for modelVersion.
   */
  com.google.protobuf.ByteString getModelVersionBytes();
}
