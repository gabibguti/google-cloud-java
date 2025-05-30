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
// source: google/cloud/aiplatform/v1/feature_group.proto

package com.google.cloud.aiplatform.v1;

public final class FeatureGroupProto {
  private FeatureGroupProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FeatureGroup_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureGroup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FeatureGroup_BigQuery_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureGroup_BigQuery_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FeatureGroup_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureGroup_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/aiplatform/v1/feature_gro"
          + "up.proto\022\032google.cloud.aiplatform.v1\032\037go"
          + "ogle/api/field_behavior.proto\032\031google/ap"
          + "i/resource.proto\032#google/cloud/aiplatfor"
          + "m/v1/io.proto\032\037google/protobuf/timestamp"
          + ".proto\"\231\005\n\014FeatureGroup\022F\n\tbig_query\030\007 \001"
          + "(\01321.google.cloud.aiplatform.v1.FeatureG"
          + "roup.BigQueryH\000\022\022\n\004name\030\001 \001(\tB\004\342A\001\003\0225\n\013c"
          + "reate_time\030\002 \001(\0132\032.google.protobuf.Times"
          + "tampB\004\342A\001\003\0225\n\013update_time\030\003 \001(\0132\032.google"
          + ".protobuf.TimestampB\004\342A\001\003\022\022\n\004etag\030\004 \001(\tB"
          + "\004\342A\001\001\022J\n\006labels\030\005 \003(\01324.google.cloud.aip"
          + "latform.v1.FeatureGroup.LabelsEntryB\004\342A\001"
          + "\001\022\031\n\013description\030\006 \001(\tB\004\342A\001\001\032x\n\010BigQuery"
          + "\022K\n\020big_query_source\030\001 \001(\0132*.google.clou"
          + "d.aiplatform.v1.BigQuerySourceB\005\342A\002\005\002\022\037\n"
          + "\021entity_id_columns\030\002 \003(\tB\004\342A\001\001\032-\n\013Labels"
          + "Entry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:\220\001"
          + "\352A\214\001\n&aiplatform.googleapis.com/FeatureG"
          + "roup\022Eprojects/{project}/locations/{loca"
          + "tion}/featureGroups/{feature_group}*\rfea"
          + "tureGroups2\014featureGroupB\010\n\006sourceB\317\001\n\036c"
          + "om.google.cloud.aiplatform.v1B\021FeatureGr"
          + "oupProtoP\001Z>cloud.google.com/go/aiplatfo"
          + "rm/apiv1/aiplatformpb;aiplatformpb\252\002\032Goo"
          + "gle.Cloud.AIPlatform.V1\312\002\032Google\\Cloud\\A"
          + "IPlatform\\V1\352\002\035Google::Cloud::AIPlatform"
          + "::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.IoProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_FeatureGroup_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_FeatureGroup_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FeatureGroup_descriptor,
            new java.lang.String[] {
              "BigQuery",
              "Name",
              "CreateTime",
              "UpdateTime",
              "Etag",
              "Labels",
              "Description",
              "Source",
            });
    internal_static_google_cloud_aiplatform_v1_FeatureGroup_BigQuery_descriptor =
        internal_static_google_cloud_aiplatform_v1_FeatureGroup_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_FeatureGroup_BigQuery_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FeatureGroup_BigQuery_descriptor,
            new java.lang.String[] {
              "BigQuerySource", "EntityIdColumns",
            });
    internal_static_google_cloud_aiplatform_v1_FeatureGroup_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_FeatureGroup_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_FeatureGroup_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FeatureGroup_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.IoProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
