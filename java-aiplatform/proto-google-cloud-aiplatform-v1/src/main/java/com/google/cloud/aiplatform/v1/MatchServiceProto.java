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
// source: google/cloud/aiplatform/v1/match_service.proto

package com.google.cloud.aiplatform.v1;

public final class MatchServiceProto {
  private MatchServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FindNeighborsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FindNeighborsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FindNeighborsRequest_Query_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FindNeighborsRequest_Query_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FindNeighborsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FindNeighborsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FindNeighborsResponse_Neighbor_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FindNeighborsResponse_Neighbor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FindNeighborsResponse_NearestNeighbors_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FindNeighborsResponse_NearestNeighbors_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ReadIndexDatapointsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ReadIndexDatapointsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ReadIndexDatapointsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ReadIndexDatapointsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/aiplatform/v1/match_servi"
          + "ce.proto\022\032google.cloud.aiplatform.v1\032\034go"
          + "ogle/api/annotations.proto\032\027google/api/c"
          + "lient.proto\032\037google/api/field_behavior.p"
          + "roto\032\031google/api/resource.proto\032&google/"
          + "cloud/aiplatform/v1/index.proto\"\313\003\n\024Find"
          + "NeighborsRequest\022G\n\016index_endpoint\030\001 \001(\t"
          + "B/\340A\002\372A)\n\'aiplatform.googleapis.com/Inde"
          + "xEndpoint\022\031\n\021deployed_index_id\030\002 \001(\t\022G\n\007"
          + "queries\030\003 \003(\01326.google.cloud.aiplatform."
          + "v1.FindNeighborsRequest.Query\022\035\n\025return_"
          + "full_datapoint\030\004 \001(\010\032\346\001\n\005Query\022B\n\tdatapo"
          + "int\030\001 \001(\0132*.google.cloud.aiplatform.v1.I"
          + "ndexDatapointB\003\340A\002\022\026\n\016neighbor_count\030\002 \001"
          + "(\005\022-\n%per_crowding_attribute_neighbor_co"
          + "unt\030\003 \001(\005\022\"\n\032approximate_neighbor_count\030"
          + "\004 \001(\005\022.\n&fraction_leaf_nodes_to_search_o"
          + "verride\030\005 \001(\001\"\302\002\n\025FindNeighborsResponse\022"
          + "]\n\021nearest_neighbors\030\001 \003(\0132B.google.clou"
          + "d.aiplatform.v1.FindNeighborsResponse.Ne"
          + "arestNeighbors\032[\n\010Neighbor\022=\n\tdatapoint\030"
          + "\001 \001(\0132*.google.cloud.aiplatform.v1.Index"
          + "Datapoint\022\020\n\010distance\030\002 \001(\001\032m\n\020NearestNe"
          + "ighbors\022\n\n\002id\030\001 \001(\t\022M\n\tneighbors\030\002 \003(\0132:"
          + ".google.cloud.aiplatform.v1.FindNeighbor"
          + "sResponse.Neighbor\"\215\001\n\032ReadIndexDatapoin"
          + "tsRequest\022G\n\016index_endpoint\030\001 \001(\tB/\340A\002\372A"
          + ")\n\'aiplatform.googleapis.com/IndexEndpoi"
          + "nt\022\031\n\021deployed_index_id\030\002 \001(\t\022\013\n\003ids\030\003 \003"
          + "(\t\"]\n\033ReadIndexDatapointsResponse\022>\n\ndat"
          + "apoints\030\001 \003(\0132*.google.cloud.aiplatform."
          + "v1.IndexDatapoint2\221\004\n\014MatchService\022\313\001\n\rF"
          + "indNeighbors\0220.google.cloud.aiplatform.v"
          + "1.FindNeighborsRequest\0321.google.cloud.ai"
          + "platform.v1.FindNeighborsResponse\"U\202\323\344\223\002"
          + "O\"J/v1/{index_endpoint=projects/*/locati"
          + "ons/*/indexEndpoints/*}:findNeighbors:\001*"
          + "\022\343\001\n\023ReadIndexDatapoints\0226.google.cloud."
          + "aiplatform.v1.ReadIndexDatapointsRequest"
          + "\0327.google.cloud.aiplatform.v1.ReadIndexD"
          + "atapointsResponse\"[\202\323\344\223\002U\"P/v1/{index_en"
          + "dpoint=projects/*/locations/*/indexEndpo"
          + "ints/*}:readIndexDatapoints:\001*\032M\312A\031aipla"
          + "tform.googleapis.com\322A.https://www.googl"
          + "eapis.com/auth/cloud-platformB\317\001\n\036com.go"
          + "ogle.cloud.aiplatform.v1B\021MatchServicePr"
          + "otoP\001Z>cloud.google.com/go/aiplatform/ap"
          + "iv1/aiplatformpb;aiplatformpb\252\002\032Google.C"
          + "loud.AIPlatform.V1\312\002\032Google\\Cloud\\AIPlat"
          + "form\\V1\352\002\035Google::Cloud::AIPlatform::V1b"
          + "\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.IndexProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_FindNeighborsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_FindNeighborsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FindNeighborsRequest_descriptor,
            new java.lang.String[] {
              "IndexEndpoint", "DeployedIndexId", "Queries", "ReturnFullDatapoint",
            });
    internal_static_google_cloud_aiplatform_v1_FindNeighborsRequest_Query_descriptor =
        internal_static_google_cloud_aiplatform_v1_FindNeighborsRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_FindNeighborsRequest_Query_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FindNeighborsRequest_Query_descriptor,
            new java.lang.String[] {
              "Datapoint",
              "NeighborCount",
              "PerCrowdingAttributeNeighborCount",
              "ApproximateNeighborCount",
              "FractionLeafNodesToSearchOverride",
            });
    internal_static_google_cloud_aiplatform_v1_FindNeighborsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_FindNeighborsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FindNeighborsResponse_descriptor,
            new java.lang.String[] {
              "NearestNeighbors",
            });
    internal_static_google_cloud_aiplatform_v1_FindNeighborsResponse_Neighbor_descriptor =
        internal_static_google_cloud_aiplatform_v1_FindNeighborsResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_FindNeighborsResponse_Neighbor_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FindNeighborsResponse_Neighbor_descriptor,
            new java.lang.String[] {
              "Datapoint", "Distance",
            });
    internal_static_google_cloud_aiplatform_v1_FindNeighborsResponse_NearestNeighbors_descriptor =
        internal_static_google_cloud_aiplatform_v1_FindNeighborsResponse_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_FindNeighborsResponse_NearestNeighbors_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FindNeighborsResponse_NearestNeighbors_descriptor,
            new java.lang.String[] {
              "Id", "Neighbors",
            });
    internal_static_google_cloud_aiplatform_v1_ReadIndexDatapointsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_ReadIndexDatapointsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ReadIndexDatapointsRequest_descriptor,
            new java.lang.String[] {
              "IndexEndpoint", "DeployedIndexId", "Ids",
            });
    internal_static_google_cloud_aiplatform_v1_ReadIndexDatapointsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_ReadIndexDatapointsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ReadIndexDatapointsResponse_descriptor,
            new java.lang.String[] {
              "Datapoints",
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
    com.google.cloud.aiplatform.v1.IndexProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
