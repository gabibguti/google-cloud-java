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
// source: google/cloud/discoveryengine/v1/completion_service.proto

package com.google.cloud.discoveryengine.v1;

public final class CompletionServiceProto {
  private CompletionServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_CompleteQueryRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_CompleteQueryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_CompleteQueryResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_CompleteQueryResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_CompleteQueryResponse_QuerySuggestion_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_CompleteQueryResponse_QuerySuggestion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n8google/cloud/discoveryengine/v1/comple"
          + "tion_service.proto\022\037google.cloud.discove"
          + "ryengine.v1\032\034google/api/annotations.prot"
          + "o\032\027google/api/client.proto\032\037google/api/f"
          + "ield_behavior.proto\032\031google/api/resource"
          + ".proto\"\301\001\n\024CompleteQueryRequest\022E\n\ndata_"
          + "store\030\001 \001(\tB1\342A\001\002\372A*\n(discoveryengine.go"
          + "ogleapis.com/DataStore\022\023\n\005query\030\002 \001(\tB\004\342"
          + "A\001\002\022\023\n\013query_model\030\003 \001(\t\022\026\n\016user_pseudo_"
          + "id\030\004 \001(\t\022 \n\030include_tail_suggestions\030\005 \001"
          + "(\010\"\277\001\n\025CompleteQueryResponse\022a\n\021query_su"
          + "ggestions\030\001 \003(\0132F.google.cloud.discovery"
          + "engine.v1.CompleteQueryResponse.QuerySug"
          + "gestion\022\034\n\024tail_match_triggered\030\002 \001(\010\032%\n"
          + "\017QuerySuggestion\022\022\n\nsuggestion\030\001 \001(\t2\212\003\n"
          + "\021CompletionService\022\240\002\n\rCompleteQuery\0225.g"
          + "oogle.cloud.discoveryengine.v1.CompleteQ"
          + "ueryRequest\0326.google.cloud.discoveryengi"
          + "ne.v1.CompleteQueryResponse\"\237\001\202\323\344\223\002\230\001\022B/"
          + "v1/{data_store=projects/*/locations/*/da"
          + "taStores/*}:completeQueryZR\022P/v1/{data_s"
          + "tore=projects/*/locations/*/collections/"
          + "*/dataStores/*}:completeQuery\032R\312A\036discov"
          + "eryengine.googleapis.com\322A.https://www.g"
          + "oogleapis.com/auth/cloud-platformB\211\002\n#co"
          + "m.google.cloud.discoveryengine.v1B\026Compl"
          + "etionServiceProtoP\001ZMcloud.google.com/go"
          + "/discoveryengine/apiv1/discoveryenginepb"
          + ";discoveryenginepb\242\002\017DISCOVERYENGINE\252\002\037G"
          + "oogle.Cloud.DiscoveryEngine.V1\312\002\037Google\\"
          + "Cloud\\DiscoveryEngine\\V1\352\002\"Google::Cloud"
          + "::DiscoveryEngine::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1_CompleteQueryRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1_CompleteQueryRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_CompleteQueryRequest_descriptor,
            new java.lang.String[] {
              "DataStore", "Query", "QueryModel", "UserPseudoId", "IncludeTailSuggestions",
            });
    internal_static_google_cloud_discoveryengine_v1_CompleteQueryResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1_CompleteQueryResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_CompleteQueryResponse_descriptor,
            new java.lang.String[] {
              "QuerySuggestions", "TailMatchTriggered",
            });
    internal_static_google_cloud_discoveryengine_v1_CompleteQueryResponse_QuerySuggestion_descriptor =
        internal_static_google_cloud_discoveryengine_v1_CompleteQueryResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1_CompleteQueryResponse_QuerySuggestion_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_CompleteQueryResponse_QuerySuggestion_descriptor,
            new java.lang.String[] {
              "Suggestion",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
