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
// source: google/cloud/dataplex/v1/data_quality.proto

package com.google.cloud.dataplex.v1;

public interface DataQualityResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.DataQualityResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Overall data quality result -- `true` if all rules passed.
   * </pre>
   *
   * <code>bool passed = 5;</code>
   *
   * @return The passed.
   */
  boolean getPassed();

  /**
   *
   *
   * <pre>
   * A list of results at the dimension level.
   *
   * A dimension will have a corresponding `DataQualityDimensionResult` if and
   * only if there is at least one rule with the 'dimension' field set to it.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.DataQualityDimensionResult dimensions = 2;</code>
   */
  java.util.List<com.google.cloud.dataplex.v1.DataQualityDimensionResult> getDimensionsList();
  /**
   *
   *
   * <pre>
   * A list of results at the dimension level.
   *
   * A dimension will have a corresponding `DataQualityDimensionResult` if and
   * only if there is at least one rule with the 'dimension' field set to it.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.DataQualityDimensionResult dimensions = 2;</code>
   */
  com.google.cloud.dataplex.v1.DataQualityDimensionResult getDimensions(int index);
  /**
   *
   *
   * <pre>
   * A list of results at the dimension level.
   *
   * A dimension will have a corresponding `DataQualityDimensionResult` if and
   * only if there is at least one rule with the 'dimension' field set to it.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.DataQualityDimensionResult dimensions = 2;</code>
   */
  int getDimensionsCount();
  /**
   *
   *
   * <pre>
   * A list of results at the dimension level.
   *
   * A dimension will have a corresponding `DataQualityDimensionResult` if and
   * only if there is at least one rule with the 'dimension' field set to it.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.DataQualityDimensionResult dimensions = 2;</code>
   */
  java.util.List<? extends com.google.cloud.dataplex.v1.DataQualityDimensionResultOrBuilder>
      getDimensionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of results at the dimension level.
   *
   * A dimension will have a corresponding `DataQualityDimensionResult` if and
   * only if there is at least one rule with the 'dimension' field set to it.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.DataQualityDimensionResult dimensions = 2;</code>
   */
  com.google.cloud.dataplex.v1.DataQualityDimensionResultOrBuilder getDimensionsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * A list of all the rules in a job, and their results.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.DataQualityRuleResult rules = 3;</code>
   */
  java.util.List<com.google.cloud.dataplex.v1.DataQualityRuleResult> getRulesList();
  /**
   *
   *
   * <pre>
   * A list of all the rules in a job, and their results.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.DataQualityRuleResult rules = 3;</code>
   */
  com.google.cloud.dataplex.v1.DataQualityRuleResult getRules(int index);
  /**
   *
   *
   * <pre>
   * A list of all the rules in a job, and their results.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.DataQualityRuleResult rules = 3;</code>
   */
  int getRulesCount();
  /**
   *
   *
   * <pre>
   * A list of all the rules in a job, and their results.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.DataQualityRuleResult rules = 3;</code>
   */
  java.util.List<? extends com.google.cloud.dataplex.v1.DataQualityRuleResultOrBuilder>
      getRulesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of all the rules in a job, and their results.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.DataQualityRuleResult rules = 3;</code>
   */
  com.google.cloud.dataplex.v1.DataQualityRuleResultOrBuilder getRulesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The count of rows processed.
   * </pre>
   *
   * <code>int64 row_count = 4;</code>
   *
   * @return The rowCount.
   */
  long getRowCount();

  /**
   *
   *
   * <pre>
   * The data scanned for this result.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.ScannedData scanned_data = 7;</code>
   *
   * @return Whether the scannedData field is set.
   */
  boolean hasScannedData();
  /**
   *
   *
   * <pre>
   * The data scanned for this result.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.ScannedData scanned_data = 7;</code>
   *
   * @return The scannedData.
   */
  com.google.cloud.dataplex.v1.ScannedData getScannedData();
  /**
   *
   *
   * <pre>
   * The data scanned for this result.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.ScannedData scanned_data = 7;</code>
   */
  com.google.cloud.dataplex.v1.ScannedDataOrBuilder getScannedDataOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The result of post scan actions.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataQualityResult.PostScanActionsResult post_scan_actions_result = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the postScanActionsResult field is set.
   */
  boolean hasPostScanActionsResult();
  /**
   *
   *
   * <pre>
   * Output only. The result of post scan actions.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataQualityResult.PostScanActionsResult post_scan_actions_result = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The postScanActionsResult.
   */
  com.google.cloud.dataplex.v1.DataQualityResult.PostScanActionsResult getPostScanActionsResult();
  /**
   *
   *
   * <pre>
   * Output only. The result of post scan actions.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataQualityResult.PostScanActionsResult post_scan_actions_result = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataplex.v1.DataQualityResult.PostScanActionsResultOrBuilder
      getPostScanActionsResultOrBuilder();
}
