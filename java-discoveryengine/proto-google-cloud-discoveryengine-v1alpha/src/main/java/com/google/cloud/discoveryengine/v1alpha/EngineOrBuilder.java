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
// source: google/cloud/discoveryengine/v1alpha/engine.proto

package com.google.cloud.discoveryengine.v1alpha;

public interface EngineOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1alpha.Engine)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Additional config specs for a `similar-items` engine.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.Engine.SimilarDocumentsEngineConfig similar_documents_config = 9;
   * </code>
   *
   * @return Whether the similarDocumentsConfig field is set.
   */
  boolean hasSimilarDocumentsConfig();
  /**
   *
   *
   * <pre>
   * Additional config specs for a `similar-items` engine.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.Engine.SimilarDocumentsEngineConfig similar_documents_config = 9;
   * </code>
   *
   * @return The similarDocumentsConfig.
   */
  com.google.cloud.discoveryengine.v1alpha.Engine.SimilarDocumentsEngineConfig
      getSimilarDocumentsConfig();
  /**
   *
   *
   * <pre>
   * Additional config specs for a `similar-items` engine.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.Engine.SimilarDocumentsEngineConfig similar_documents_config = 9;
   * </code>
   */
  com.google.cloud.discoveryengine.v1alpha.Engine.SimilarDocumentsEngineConfigOrBuilder
      getSimilarDocumentsConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configurations for the Chat Engine. Only applicable if
   * [solution_type][google.cloud.discoveryengine.v1alpha.Engine.solution_type]
   * is
   * [SOLUTION_TYPE_CHAT][google.cloud.discoveryengine.v1alpha.SolutionType.SOLUTION_TYPE_CHAT].
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1alpha.Engine.ChatEngineConfig chat_engine_config = 11;
   * </code>
   *
   * @return Whether the chatEngineConfig field is set.
   */
  boolean hasChatEngineConfig();
  /**
   *
   *
   * <pre>
   * Configurations for the Chat Engine. Only applicable if
   * [solution_type][google.cloud.discoveryengine.v1alpha.Engine.solution_type]
   * is
   * [SOLUTION_TYPE_CHAT][google.cloud.discoveryengine.v1alpha.SolutionType.SOLUTION_TYPE_CHAT].
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1alpha.Engine.ChatEngineConfig chat_engine_config = 11;
   * </code>
   *
   * @return The chatEngineConfig.
   */
  com.google.cloud.discoveryengine.v1alpha.Engine.ChatEngineConfig getChatEngineConfig();
  /**
   *
   *
   * <pre>
   * Configurations for the Chat Engine. Only applicable if
   * [solution_type][google.cloud.discoveryengine.v1alpha.Engine.solution_type]
   * is
   * [SOLUTION_TYPE_CHAT][google.cloud.discoveryengine.v1alpha.SolutionType.SOLUTION_TYPE_CHAT].
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1alpha.Engine.ChatEngineConfig chat_engine_config = 11;
   * </code>
   */
  com.google.cloud.discoveryengine.v1alpha.Engine.ChatEngineConfigOrBuilder
      getChatEngineConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configurations for the Search Engine. Only applicable if
   * [solution_type][google.cloud.discoveryengine.v1alpha.Engine.solution_type]
   * is
   * [SOLUTION_TYPE_SEARCH][google.cloud.discoveryengine.v1alpha.SolutionType.SOLUTION_TYPE_SEARCH].
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.Engine.SearchEngineConfig search_engine_config = 13;
   * </code>
   *
   * @return Whether the searchEngineConfig field is set.
   */
  boolean hasSearchEngineConfig();
  /**
   *
   *
   * <pre>
   * Configurations for the Search Engine. Only applicable if
   * [solution_type][google.cloud.discoveryengine.v1alpha.Engine.solution_type]
   * is
   * [SOLUTION_TYPE_SEARCH][google.cloud.discoveryengine.v1alpha.SolutionType.SOLUTION_TYPE_SEARCH].
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.Engine.SearchEngineConfig search_engine_config = 13;
   * </code>
   *
   * @return The searchEngineConfig.
   */
  com.google.cloud.discoveryengine.v1alpha.Engine.SearchEngineConfig getSearchEngineConfig();
  /**
   *
   *
   * <pre>
   * Configurations for the Search Engine. Only applicable if
   * [solution_type][google.cloud.discoveryengine.v1alpha.Engine.solution_type]
   * is
   * [SOLUTION_TYPE_SEARCH][google.cloud.discoveryengine.v1alpha.SolutionType.SOLUTION_TYPE_SEARCH].
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.Engine.SearchEngineConfig search_engine_config = 13;
   * </code>
   */
  com.google.cloud.discoveryengine.v1alpha.Engine.SearchEngineConfigOrBuilder
      getSearchEngineConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configurations for the Media Engine. Only applicable on the data
   * stores with
   * [solution_type][google.cloud.discoveryengine.v1alpha.Engine.solution_type]
   * [SOLUTION_TYPE_RECOMMENDATION][google.cloud.discoveryengine.v1alpha.SolutionType.SOLUTION_TYPE_RECOMMENDATION]
   * and
   * [IndustryVertical.MEDIA][google.cloud.discoveryengine.v1alpha.IndustryVertical.MEDIA]
   * vertical.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.Engine.MediaRecommendationEngineConfig media_recommendation_engine_config = 14;
   * </code>
   *
   * @return Whether the mediaRecommendationEngineConfig field is set.
   */
  boolean hasMediaRecommendationEngineConfig();
  /**
   *
   *
   * <pre>
   * Configurations for the Media Engine. Only applicable on the data
   * stores with
   * [solution_type][google.cloud.discoveryengine.v1alpha.Engine.solution_type]
   * [SOLUTION_TYPE_RECOMMENDATION][google.cloud.discoveryengine.v1alpha.SolutionType.SOLUTION_TYPE_RECOMMENDATION]
   * and
   * [IndustryVertical.MEDIA][google.cloud.discoveryengine.v1alpha.IndustryVertical.MEDIA]
   * vertical.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.Engine.MediaRecommendationEngineConfig media_recommendation_engine_config = 14;
   * </code>
   *
   * @return The mediaRecommendationEngineConfig.
   */
  com.google.cloud.discoveryengine.v1alpha.Engine.MediaRecommendationEngineConfig
      getMediaRecommendationEngineConfig();
  /**
   *
   *
   * <pre>
   * Configurations for the Media Engine. Only applicable on the data
   * stores with
   * [solution_type][google.cloud.discoveryengine.v1alpha.Engine.solution_type]
   * [SOLUTION_TYPE_RECOMMENDATION][google.cloud.discoveryengine.v1alpha.SolutionType.SOLUTION_TYPE_RECOMMENDATION]
   * and
   * [IndustryVertical.MEDIA][google.cloud.discoveryengine.v1alpha.IndustryVertical.MEDIA]
   * vertical.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.Engine.MediaRecommendationEngineConfig media_recommendation_engine_config = 14;
   * </code>
   */
  com.google.cloud.discoveryengine.v1alpha.Engine.MediaRecommendationEngineConfigOrBuilder
      getMediaRecommendationEngineConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Additional information of a recommendation engine. Only
   * applicable if
   * [solution_type][google.cloud.discoveryengine.v1alpha.Engine.solution_type]
   * is
   * [SOLUTION_TYPE_RECOMMENDATION][google.cloud.discoveryengine.v1alpha.SolutionType.SOLUTION_TYPE_RECOMMENDATION].
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.Engine.RecommendationMetadata recommendation_metadata = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the recommendationMetadata field is set.
   */
  boolean hasRecommendationMetadata();
  /**
   *
   *
   * <pre>
   * Output only. Additional information of a recommendation engine. Only
   * applicable if
   * [solution_type][google.cloud.discoveryengine.v1alpha.Engine.solution_type]
   * is
   * [SOLUTION_TYPE_RECOMMENDATION][google.cloud.discoveryengine.v1alpha.SolutionType.SOLUTION_TYPE_RECOMMENDATION].
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.Engine.RecommendationMetadata recommendation_metadata = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The recommendationMetadata.
   */
  com.google.cloud.discoveryengine.v1alpha.Engine.RecommendationMetadata
      getRecommendationMetadata();
  /**
   *
   *
   * <pre>
   * Output only. Additional information of a recommendation engine. Only
   * applicable if
   * [solution_type][google.cloud.discoveryengine.v1alpha.Engine.solution_type]
   * is
   * [SOLUTION_TYPE_RECOMMENDATION][google.cloud.discoveryengine.v1alpha.SolutionType.SOLUTION_TYPE_RECOMMENDATION].
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.Engine.RecommendationMetadata recommendation_metadata = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.discoveryengine.v1alpha.Engine.RecommendationMetadataOrBuilder
      getRecommendationMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Additional information of the Chat Engine. Only applicable
   * if
   * [solution_type][google.cloud.discoveryengine.v1alpha.Engine.solution_type]
   * is
   * [SOLUTION_TYPE_CHAT][google.cloud.discoveryengine.v1alpha.SolutionType.SOLUTION_TYPE_CHAT].
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.Engine.ChatEngineMetadata chat_engine_metadata = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the chatEngineMetadata field is set.
   */
  boolean hasChatEngineMetadata();
  /**
   *
   *
   * <pre>
   * Output only. Additional information of the Chat Engine. Only applicable
   * if
   * [solution_type][google.cloud.discoveryengine.v1alpha.Engine.solution_type]
   * is
   * [SOLUTION_TYPE_CHAT][google.cloud.discoveryengine.v1alpha.SolutionType.SOLUTION_TYPE_CHAT].
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.Engine.ChatEngineMetadata chat_engine_metadata = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The chatEngineMetadata.
   */
  com.google.cloud.discoveryengine.v1alpha.Engine.ChatEngineMetadata getChatEngineMetadata();
  /**
   *
   *
   * <pre>
   * Output only. Additional information of the Chat Engine. Only applicable
   * if
   * [solution_type][google.cloud.discoveryengine.v1alpha.Engine.solution_type]
   * is
   * [SOLUTION_TYPE_CHAT][google.cloud.discoveryengine.v1alpha.SolutionType.SOLUTION_TYPE_CHAT].
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.Engine.ChatEngineMetadata chat_engine_metadata = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.discoveryengine.v1alpha.Engine.ChatEngineMetadataOrBuilder
      getChatEngineMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Immutable. The fully qualified resource name of the engine.
   *
   * This field must be a UTF-8 encoded string with a length limit of 1024
   * characters.
   *
   * Format:
   * `projects/{project_number}/locations/{location}/collections/{collection}/engines/{engine}`
   * engine should be 1-63 characters, and valid characters are
   * /[a-z0-9][a-z0-9-_]*&#47;. Otherwise, an INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Immutable. The fully qualified resource name of the engine.
   *
   * This field must be a UTF-8 encoded string with a length limit of 1024
   * characters.
   *
   * Format:
   * `projects/{project_number}/locations/{location}/collections/{collection}/engines/{engine}`
   * engine should be 1-63 characters, and valid characters are
   * /[a-z0-9][a-z0-9-_]*&#47;. Otherwise, an INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The display name of the engine. Should be human readable. UTF-8
   * encoded string with limit of 1024 characters.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. The display name of the engine. Should be human readable. UTF-8
   * encoded string with limit of 1024 characters.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp the Recommendation Engine was created at.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp the Recommendation Engine was created at.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp the Recommendation Engine was created at.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp the Recommendation Engine was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp the Recommendation Engine was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp the Recommendation Engine was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The data stores associated with this engine.
   *
   * For
   * [SOLUTION_TYPE_SEARCH][google.cloud.discoveryengine.v1alpha.SolutionType.SOLUTION_TYPE_SEARCH]
   * and
   * [SOLUTION_TYPE_RECOMMENDATION][google.cloud.discoveryengine.v1alpha.SolutionType.SOLUTION_TYPE_RECOMMENDATION]
   * type of engines, they can only associate with at most one data store.
   *
   * If
   * [solution_type][google.cloud.discoveryengine.v1alpha.Engine.solution_type]
   * is
   * [SOLUTION_TYPE_CHAT][google.cloud.discoveryengine.v1alpha.SolutionType.SOLUTION_TYPE_CHAT],
   * multiple [DataStore][google.cloud.discoveryengine.v1alpha.DataStore]s in
   * the same [Collection][google.cloud.discoveryengine.v1alpha.Collection] can
   * be associated here.
   *
   * Note that when used in
   * [CreateEngineRequest][google.cloud.discoveryengine.v1alpha.CreateEngineRequest],
   * one DataStore id must be provided as the system will use it for necessary
   * intializations.
   * </pre>
   *
   * <code>repeated string data_store_ids = 5;</code>
   *
   * @return A list containing the dataStoreIds.
   */
  java.util.List<java.lang.String> getDataStoreIdsList();
  /**
   *
   *
   * <pre>
   * The data stores associated with this engine.
   *
   * For
   * [SOLUTION_TYPE_SEARCH][google.cloud.discoveryengine.v1alpha.SolutionType.SOLUTION_TYPE_SEARCH]
   * and
   * [SOLUTION_TYPE_RECOMMENDATION][google.cloud.discoveryengine.v1alpha.SolutionType.SOLUTION_TYPE_RECOMMENDATION]
   * type of engines, they can only associate with at most one data store.
   *
   * If
   * [solution_type][google.cloud.discoveryengine.v1alpha.Engine.solution_type]
   * is
   * [SOLUTION_TYPE_CHAT][google.cloud.discoveryengine.v1alpha.SolutionType.SOLUTION_TYPE_CHAT],
   * multiple [DataStore][google.cloud.discoveryengine.v1alpha.DataStore]s in
   * the same [Collection][google.cloud.discoveryengine.v1alpha.Collection] can
   * be associated here.
   *
   * Note that when used in
   * [CreateEngineRequest][google.cloud.discoveryengine.v1alpha.CreateEngineRequest],
   * one DataStore id must be provided as the system will use it for necessary
   * intializations.
   * </pre>
   *
   * <code>repeated string data_store_ids = 5;</code>
   *
   * @return The count of dataStoreIds.
   */
  int getDataStoreIdsCount();
  /**
   *
   *
   * <pre>
   * The data stores associated with this engine.
   *
   * For
   * [SOLUTION_TYPE_SEARCH][google.cloud.discoveryengine.v1alpha.SolutionType.SOLUTION_TYPE_SEARCH]
   * and
   * [SOLUTION_TYPE_RECOMMENDATION][google.cloud.discoveryengine.v1alpha.SolutionType.SOLUTION_TYPE_RECOMMENDATION]
   * type of engines, they can only associate with at most one data store.
   *
   * If
   * [solution_type][google.cloud.discoveryengine.v1alpha.Engine.solution_type]
   * is
   * [SOLUTION_TYPE_CHAT][google.cloud.discoveryengine.v1alpha.SolutionType.SOLUTION_TYPE_CHAT],
   * multiple [DataStore][google.cloud.discoveryengine.v1alpha.DataStore]s in
   * the same [Collection][google.cloud.discoveryengine.v1alpha.Collection] can
   * be associated here.
   *
   * Note that when used in
   * [CreateEngineRequest][google.cloud.discoveryengine.v1alpha.CreateEngineRequest],
   * one DataStore id must be provided as the system will use it for necessary
   * intializations.
   * </pre>
   *
   * <code>repeated string data_store_ids = 5;</code>
   *
   * @param index The index of the element to return.
   * @return The dataStoreIds at the given index.
   */
  java.lang.String getDataStoreIds(int index);
  /**
   *
   *
   * <pre>
   * The data stores associated with this engine.
   *
   * For
   * [SOLUTION_TYPE_SEARCH][google.cloud.discoveryengine.v1alpha.SolutionType.SOLUTION_TYPE_SEARCH]
   * and
   * [SOLUTION_TYPE_RECOMMENDATION][google.cloud.discoveryengine.v1alpha.SolutionType.SOLUTION_TYPE_RECOMMENDATION]
   * type of engines, they can only associate with at most one data store.
   *
   * If
   * [solution_type][google.cloud.discoveryengine.v1alpha.Engine.solution_type]
   * is
   * [SOLUTION_TYPE_CHAT][google.cloud.discoveryengine.v1alpha.SolutionType.SOLUTION_TYPE_CHAT],
   * multiple [DataStore][google.cloud.discoveryengine.v1alpha.DataStore]s in
   * the same [Collection][google.cloud.discoveryengine.v1alpha.Collection] can
   * be associated here.
   *
   * Note that when used in
   * [CreateEngineRequest][google.cloud.discoveryengine.v1alpha.CreateEngineRequest],
   * one DataStore id must be provided as the system will use it for necessary
   * intializations.
   * </pre>
   *
   * <code>repeated string data_store_ids = 5;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the dataStoreIds at the given index.
   */
  com.google.protobuf.ByteString getDataStoreIdsBytes(int index);

  /**
   *
   *
   * <pre>
   * Required. The solutions of the engine.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.SolutionType solution_type = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for solutionType.
   */
  int getSolutionTypeValue();
  /**
   *
   *
   * <pre>
   * Required. The solutions of the engine.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.SolutionType solution_type = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The solutionType.
   */
  com.google.cloud.discoveryengine.v1alpha.SolutionType getSolutionType();

  /**
   *
   *
   * <pre>
   * The industry vertical that the engine registers.
   * The restriction of the Engine industry vertical is based on
   * [DataStore][google.cloud.discoveryengine.v1alpha.DataStore]: If
   * unspecified, default to `GENERIC`. Vertical on Engine has to match vertical
   * of the DataStore liniked to the engine.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1alpha.IndustryVertical industry_vertical = 16;</code>
   *
   * @return The enum numeric value on the wire for industryVertical.
   */
  int getIndustryVerticalValue();
  /**
   *
   *
   * <pre>
   * The industry vertical that the engine registers.
   * The restriction of the Engine industry vertical is based on
   * [DataStore][google.cloud.discoveryengine.v1alpha.DataStore]: If
   * unspecified, default to `GENERIC`. Vertical on Engine has to match vertical
   * of the DataStore liniked to the engine.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1alpha.IndustryVertical industry_vertical = 16;</code>
   *
   * @return The industryVertical.
   */
  com.google.cloud.discoveryengine.v1alpha.IndustryVertical getIndustryVertical();

  /**
   *
   *
   * <pre>
   * Common config spec that specifies the metadata of the engine.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1alpha.Engine.CommonConfig common_config = 15;</code>
   *
   * @return Whether the commonConfig field is set.
   */
  boolean hasCommonConfig();
  /**
   *
   *
   * <pre>
   * Common config spec that specifies the metadata of the engine.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1alpha.Engine.CommonConfig common_config = 15;</code>
   *
   * @return The commonConfig.
   */
  com.google.cloud.discoveryengine.v1alpha.Engine.CommonConfig getCommonConfig();
  /**
   *
   *
   * <pre>
   * Common config spec that specifies the metadata of the engine.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1alpha.Engine.CommonConfig common_config = 15;</code>
   */
  com.google.cloud.discoveryengine.v1alpha.Engine.CommonConfigOrBuilder getCommonConfigOrBuilder();

  com.google.cloud.discoveryengine.v1alpha.Engine.EngineConfigCase getEngineConfigCase();

  com.google.cloud.discoveryengine.v1alpha.Engine.EngineMetadataCase getEngineMetadataCase();
}
