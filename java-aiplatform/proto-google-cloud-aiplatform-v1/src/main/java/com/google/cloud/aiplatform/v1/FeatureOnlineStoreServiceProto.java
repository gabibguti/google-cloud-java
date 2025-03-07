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
// source: google/cloud/aiplatform/v1/feature_online_store_service.proto

package com.google.cloud.aiplatform.v1;

public final class FeatureOnlineStoreServiceProto {
  private FeatureOnlineStoreServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FeatureViewDataKey_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureViewDataKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesResponse_FeatureNameValuePairList_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesResponse_FeatureNameValuePairList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesResponse_FeatureNameValuePairList_FeatureNameValuePair_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesResponse_FeatureNameValuePairList_FeatureNameValuePair_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n=google/cloud/aiplatform/v1/feature_onl"
          + "ine_store_service.proto\022\032google.cloud.ai"
          + "platform.v1\032\034google/api/annotations.prot"
          + "o\032\027google/api/client.proto\032\037google/api/f"
          + "ield_behavior.proto\032\031google/api/resource"
          + ".proto\032<google/cloud/aiplatform/v1/featu"
          + "restore_online_service.proto\032\034google/pro"
          + "tobuf/struct.proto\"0\n\022FeatureViewDataKey"
          + "\022\r\n\003key\030\001 \001(\tH\000B\013\n\tkey_oneof\"\367\001\n\031FetchFe"
          + "atureValuesRequest\022D\n\014feature_view\030\001 \001(\t"
          + "B.\342A\001\002\372A\'\n%aiplatform.googleapis.com/Fea"
          + "tureView\022F\n\010data_key\030\006 \001(\0132..google.clou"
          + "d.aiplatform.v1.FeatureViewDataKeyB\004\342A\001\001"
          + "\022L\n\013data_format\030\007 \001(\01621.google.cloud.aip"
          + "latform.v1.FeatureViewDataFormatB\004\342A\001\001\"\274"
          + "\003\n\032FetchFeatureValuesResponse\022e\n\nkey_val"
          + "ues\030\003 \001(\0132O.google.cloud.aiplatform.v1.F"
          + "etchFeatureValuesResponse.FeatureNameVal"
          + "uePairListH\000\022/\n\014proto_struct\030\002 \001(\0132\027.goo"
          + "gle.protobuf.StructH\000\032\373\001\n\030FeatureNameVal"
          + "uePairList\022v\n\010features\030\001 \003(\0132d.google.cl"
          + "oud.aiplatform.v1.FetchFeatureValuesResp"
          + "onse.FeatureNameValuePairList.FeatureNam"
          + "eValuePair\032g\n\024FeatureNameValuePair\0229\n\005va"
          + "lue\030\002 \001(\0132(.google.cloud.aiplatform.v1.F"
          + "eatureValueH\000\022\014\n\004name\030\001 \001(\tB\006\n\004dataB\010\n\006f"
          + "ormat*b\n\025FeatureViewDataFormat\022(\n$FEATUR"
          + "E_VIEW_DATA_FORMAT_UNSPECIFIED\020\000\022\r\n\tKEY_"
          + "VALUE\020\001\022\020\n\014PROTO_STRUCT\020\0022\370\002\n\031FeatureOnl"
          + "ineStoreService\022\213\002\n\022FetchFeatureValues\0225"
          + ".google.cloud.aiplatform.v1.FetchFeature"
          + "ValuesRequest\0326.google.cloud.aiplatform."
          + "v1.FetchFeatureValuesResponse\"\205\001\332A\026featu"
          + "re_view, data_key\202\323\344\223\002f\"a/v1/{feature_vi"
          + "ew=projects/*/locations/*/featureOnlineS"
          + "tores/*/featureViews/*}:fetchFeatureValu"
          + "es:\001*\032M\312A\031aiplatform.googleapis.com\322A.ht"
          + "tps://www.googleapis.com/auth/cloud-plat"
          + "formB\334\001\n\036com.google.cloud.aiplatform.v1B"
          + "\036FeatureOnlineStoreServiceProtoP\001Z>cloud"
          + ".google.com/go/aiplatform/apiv1/aiplatfo"
          + "rmpb;aiplatformpb\252\002\032Google.Cloud.AIPlatf"
          + "orm.V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Go"
          + "ogle::Cloud::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.FeaturestoreOnlineServiceProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_FeatureViewDataKey_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_FeatureViewDataKey_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FeatureViewDataKey_descriptor,
            new java.lang.String[] {
              "Key", "KeyOneof",
            });
    internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesRequest_descriptor,
            new java.lang.String[] {
              "FeatureView", "DataKey", "DataFormat",
            });
    internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesResponse_descriptor,
            new java.lang.String[] {
              "KeyValues", "ProtoStruct", "Format",
            });
    internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesResponse_FeatureNameValuePairList_descriptor =
        internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesResponse_FeatureNameValuePairList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesResponse_FeatureNameValuePairList_descriptor,
            new java.lang.String[] {
              "Features",
            });
    internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesResponse_FeatureNameValuePairList_FeatureNameValuePair_descriptor =
        internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesResponse_FeatureNameValuePairList_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesResponse_FeatureNameValuePairList_FeatureNameValuePair_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FetchFeatureValuesResponse_FeatureNameValuePairList_FeatureNameValuePair_descriptor,
            new java.lang.String[] {
              "Value", "Name", "Data",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.FeaturestoreOnlineServiceProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
