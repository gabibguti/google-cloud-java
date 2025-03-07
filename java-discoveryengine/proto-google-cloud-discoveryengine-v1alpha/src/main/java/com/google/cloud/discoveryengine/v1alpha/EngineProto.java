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

public final class EngineProto {
  private EngineProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_SearchEngineConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_SearchEngineConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_SimilarDocumentsEngineConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_SimilarDocumentsEngineConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_MediaRecommendationEngineConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_MediaRecommendationEngineConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_MediaRecommendationEngineConfig_OptimizationObjectiveConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_MediaRecommendationEngineConfig_OptimizationObjectiveConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_ChatEngineConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_ChatEngineConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_ChatEngineConfig_AgentCreationConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_ChatEngineConfig_AgentCreationConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_CommonConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_CommonConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_RecommendationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_RecommendationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_ChatEngineMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Engine_ChatEngineMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/discoveryengine/v1alpha/e"
          + "ngine.proto\022$google.cloud.discoveryengin"
          + "e.v1alpha\032\037google/api/field_behavior.pro"
          + "to\032\031google/api/resource.proto\0321google/cl"
          + "oud/discoveryengine/v1alpha/common.proto"
          + "\032\037google/protobuf/timestamp.proto\"\361\025\n\006En"
          + "gine\022m\n\030similar_documents_config\030\t \001(\0132I"
          + ".google.cloud.discoveryengine.v1alpha.En"
          + "gine.SimilarDocumentsEngineConfigH\000\022[\n\022c"
          + "hat_engine_config\030\013 \001(\0132=.google.cloud.d"
          + "iscoveryengine.v1alpha.Engine.ChatEngine"
          + "ConfigH\000\022_\n\024search_engine_config\030\r \001(\0132?"
          + ".google.cloud.discoveryengine.v1alpha.En"
          + "gine.SearchEngineConfigH\000\022z\n\"media_recom"
          + "mendation_engine_config\030\016 \001(\0132L.google.c"
          + "loud.discoveryengine.v1alpha.Engine.Medi"
          + "aRecommendationEngineConfigH\000\022l\n\027recomme"
          + "ndation_metadata\030\n \001(\0132C.google.cloud.di"
          + "scoveryengine.v1alpha.Engine.Recommendat"
          + "ionMetadataB\004\342A\001\003H\001\022e\n\024chat_engine_metad"
          + "ata\030\014 \001(\0132?.google.cloud.discoveryengine"
          + ".v1alpha.Engine.ChatEngineMetadataB\004\342A\001\003"
          + "H\001\022\022\n\004name\030\001 \001(\tB\004\342A\001\005\022\032\n\014display_name\030\002"
          + " \001(\tB\004\342A\001\002\0225\n\013create_time\030\003 \001(\0132\032.google"
          + ".protobuf.TimestampB\004\342A\001\003\0225\n\013update_time"
          + "\030\004 \001(\0132\032.google.protobuf.TimestampB\004\342A\001\003"
          + "\022\026\n\016data_store_ids\030\005 \003(\t\022O\n\rsolution_typ"
          + "e\030\006 \001(\01622.google.cloud.discoveryengine.v"
          + "1alpha.SolutionTypeB\004\342A\001\002\022Q\n\021industry_ve"
          + "rtical\030\020 \001(\01626.google.cloud.discoveryeng"
          + "ine.v1alpha.IndustryVertical\022P\n\rcommon_c"
          + "onfig\030\017 \001(\01329.google.cloud.discoveryengi"
          + "ne.v1alpha.Engine.CommonConfig\032\246\001\n\022Searc"
          + "hEngineConfig\022E\n\013search_tier\030\001 \001(\01620.goo"
          + "gle.cloud.discoveryengine.v1alpha.Search"
          + "Tier\022I\n\016search_add_ons\030\002 \003(\01621.google.cl"
          + "oud.discoveryengine.v1alpha.SearchAddOn\032"
          + "\036\n\034SimilarDocumentsEngineConfig\032\211\004\n\037Medi"
          + "aRecommendationEngineConfig\022\022\n\004type\030\001 \001("
          + "\tB\004\342A\001\002\022\036\n\026optimization_objective\030\002 \001(\t\022"
          + "\217\001\n\035optimization_objective_config\030\003 \001(\0132"
          + "h.google.cloud.discoveryengine.v1alpha.E"
          + "ngine.MediaRecommendationEngineConfig.Op"
          + "timizationObjectiveConfig\022r\n\016training_st"
          + "ate\030\004 \001(\0162Z.google.cloud.discoveryengine"
          + ".v1alpha.Engine.MediaRecommendationEngin"
          + "eConfig.TrainingState\032a\n\033OptimizationObj"
          + "ectiveConfig\022\032\n\014target_field\030\001 \001(\tB\004\342A\001\002"
          + "\022&\n\030target_field_value_float\030\002 \001(\002B\004\342A\001\002"
          + "\"I\n\rTrainingState\022\036\n\032TRAINING_STATE_UNSP"
          + "ECIFIED\020\000\022\n\n\006PAUSED\020\001\022\014\n\010TRAINING\020\002\032\207\002\n\020"
          + "ChatEngineConfig\022p\n\025agent_creation_confi"
          + "g\030\001 \001(\0132Q.google.cloud.discoveryengine.v"
          + "1alpha.Engine.ChatEngineConfig.AgentCrea"
          + "tionConfig\022 \n\030dialogflow_agent_to_link\030\002"
          + " \001(\t\032_\n\023AgentCreationConfig\022\020\n\010business\030"
          + "\001 \001(\t\022\035\n\025default_language_code\030\002 \001(\t\022\027\n\t"
          + "time_zone\030\003 \001(\tB\004\342A\001\002\032$\n\014CommonConfig\022\024\n"
          + "\014company_name\030\001 \001(\t\032\344\003\n\026RecommendationMe"
          + "tadata\022m\n\rserving_state\030\001 \001(\0162P.google.c"
          + "loud.discoveryengine.v1alpha.Engine.Reco"
          + "mmendationMetadata.ServingStateB\004\342A\001\003\022g\n"
          + "\ndata_state\030\002 \001(\0162M.google.cloud.discove"
          + "ryengine.v1alpha.Engine.RecommendationMe"
          + "tadata.DataStateB\004\342A\001\003\0228\n\016last_tune_time"
          + "\030\003 \001(\0132\032.google.protobuf.TimestampB\004\342A\001\003"
          + "\022\036\n\020tuning_operation\030\004 \001(\tB\004\342A\001\003\"R\n\014Serv"
          + "ingState\022\035\n\031SERVING_STATE_UNSPECIFIED\020\000\022"
          + "\014\n\010INACTIVE\020\001\022\n\n\006ACTIVE\020\002\022\t\n\005TUNED\020\003\"D\n\t"
          + "DataState\022\032\n\026DATA_STATE_UNSPECIFIED\020\000\022\013\n"
          + "\007DATA_OK\020\001\022\016\n\nDATA_ERROR\020\002\032.\n\022ChatEngine"
          + "Metadata\022\030\n\020dialogflow_agent\030\001 \001(\t:}\352Az\n"
          + "%discoveryengine.googleapis.com/Engine\022Q"
          + "projects/{project}/locations/{location}/"
          + "collections/{collection}/engines/{engine"
          + "}B\017\n\rengine_configB\021\n\017engine_metadataB\227\002"
          + "\n(com.google.cloud.discoveryengine.v1alp"
          + "haB\013EngineProtoP\001ZRcloud.google.com/go/d"
          + "iscoveryengine/apiv1alpha/discoveryengin"
          + "epb;discoveryenginepb\242\002\017DISCOVERYENGINE\252"
          + "\002$Google.Cloud.DiscoveryEngine.V1Alpha\312\002"
          + "$Google\\Cloud\\DiscoveryEngine\\V1alpha\352\002\'"
          + "Google::Cloud::DiscoveryEngine::V1alphab"
          + "\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1alpha.CommonProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Engine_descriptor,
            new java.lang.String[] {
              "SimilarDocumentsConfig",
              "ChatEngineConfig",
              "SearchEngineConfig",
              "MediaRecommendationEngineConfig",
              "RecommendationMetadata",
              "ChatEngineMetadata",
              "Name",
              "DisplayName",
              "CreateTime",
              "UpdateTime",
              "DataStoreIds",
              "SolutionType",
              "IndustryVertical",
              "CommonConfig",
              "EngineConfig",
              "EngineMetadata",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_SearchEngineConfig_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Engine_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_SearchEngineConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Engine_SearchEngineConfig_descriptor,
            new java.lang.String[] {
              "SearchTier", "SearchAddOns",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_SimilarDocumentsEngineConfig_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Engine_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_SimilarDocumentsEngineConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Engine_SimilarDocumentsEngineConfig_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_MediaRecommendationEngineConfig_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Engine_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_MediaRecommendationEngineConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Engine_MediaRecommendationEngineConfig_descriptor,
            new java.lang.String[] {
              "Type", "OptimizationObjective", "OptimizationObjectiveConfig", "TrainingState",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_MediaRecommendationEngineConfig_OptimizationObjectiveConfig_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Engine_MediaRecommendationEngineConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_MediaRecommendationEngineConfig_OptimizationObjectiveConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Engine_MediaRecommendationEngineConfig_OptimizationObjectiveConfig_descriptor,
            new java.lang.String[] {
              "TargetField", "TargetFieldValueFloat",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_ChatEngineConfig_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Engine_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_ChatEngineConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Engine_ChatEngineConfig_descriptor,
            new java.lang.String[] {
              "AgentCreationConfig", "DialogflowAgentToLink",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_ChatEngineConfig_AgentCreationConfig_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Engine_ChatEngineConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_ChatEngineConfig_AgentCreationConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Engine_ChatEngineConfig_AgentCreationConfig_descriptor,
            new java.lang.String[] {
              "Business", "DefaultLanguageCode", "TimeZone",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_CommonConfig_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Engine_descriptor
            .getNestedTypes()
            .get(4);
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_CommonConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Engine_CommonConfig_descriptor,
            new java.lang.String[] {
              "CompanyName",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_RecommendationMetadata_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Engine_descriptor
            .getNestedTypes()
            .get(5);
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_RecommendationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Engine_RecommendationMetadata_descriptor,
            new java.lang.String[] {
              "ServingState", "DataState", "LastTuneTime", "TuningOperation",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_ChatEngineMetadata_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Engine_descriptor
            .getNestedTypes()
            .get(6);
    internal_static_google_cloud_discoveryengine_v1alpha_Engine_ChatEngineMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Engine_ChatEngineMetadata_descriptor,
            new java.lang.String[] {
              "DialogflowAgent",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.discoveryengine.v1alpha.CommonProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
