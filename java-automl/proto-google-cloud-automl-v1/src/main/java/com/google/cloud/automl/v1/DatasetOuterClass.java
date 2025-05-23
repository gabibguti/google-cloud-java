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
// source: google/cloud/automl/v1/dataset.proto

package com.google.cloud.automl.v1;

public final class DatasetOuterClass {
  private DatasetOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_Dataset_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_Dataset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_Dataset_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_Dataset_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n$google/cloud/automl/v1/dataset.proto\022\026"
          + "google.cloud.automl.v1\032\031google/api/resou"
          + "rce.proto\032\"google/cloud/automl/v1/image."
          + "proto\032!google/cloud/automl/v1/text.proto"
          + "\032(google/cloud/automl/v1/translation.pro"
          + "to\032\037google/protobuf/timestamp.proto\"\340\007\n\007"
          + "Dataset\022Z\n\034translation_dataset_metadata\030"
          + "\027 \001(\01322.google.cloud.automl.v1.Translati"
          + "onDatasetMetadataH\000\022k\n%image_classificat"
          + "ion_dataset_metadata\030\030 \001(\0132:.google.clou"
          + "d.automl.v1.ImageClassificationDatasetMe"
          + "tadataH\000\022i\n$text_classification_dataset_"
          + "metadata\030\031 \001(\01329.google.cloud.automl.v1."
          + "TextClassificationDatasetMetadataH\000\022n\n\'i"
          + "mage_object_detection_dataset_metadata\030\032"
          + " \001(\0132;.google.cloud.automl.v1.ImageObjec"
          + "tDetectionDatasetMetadataH\000\022a\n text_extr"
          + "action_dataset_metadata\030\034 \001(\01325.google.c"
          + "loud.automl.v1.TextExtractionDatasetMeta"
          + "dataH\000\022_\n\037text_sentiment_dataset_metadat"
          + "a\030\036 \001(\01324.google.cloud.automl.v1.TextSen"
          + "timentDatasetMetadataH\000\022\014\n\004name\030\001 \001(\t\022\024\n"
          + "\014display_name\030\002 \001(\t\022\023\n\013description\030\003 \001(\t"
          + "\022\025\n\rexample_count\030\025 \001(\005\022/\n\013create_time\030\016"
          + " \001(\0132\032.google.protobuf.Timestamp\022\014\n\004etag"
          + "\030\021 \001(\t\022;\n\006labels\030\' \003(\0132+.google.cloud.au"
          + "toml.v1.Dataset.LabelsEntry\032-\n\013LabelsEnt"
          + "ry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:^\352A[\n"
          + "\035automl.googleapis.com/Dataset\022:projects"
          + "/{project}/locations/{location}/datasets"
          + "/{dataset}B\022\n\020dataset_metadataB\240\001\n\032com.g"
          + "oogle.cloud.automl.v1P\001Z2cloud.google.co"
          + "m/go/automl/apiv1/automlpb;automlpb\252\002\026Go"
          + "ogle.Cloud.AutoML.V1\312\002\026Google\\Cloud\\Auto"
          + "Ml\\V1\352\002\031Google::Cloud::AutoML::V1b\006proto"
          + "3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.automl.v1.ImageProto.getDescriptor(),
              com.google.cloud.automl.v1.TextProto.getDescriptor(),
              com.google.cloud.automl.v1.TranslationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_automl_v1_Dataset_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1_Dataset_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_Dataset_descriptor,
            new java.lang.String[] {
              "TranslationDatasetMetadata",
              "ImageClassificationDatasetMetadata",
              "TextClassificationDatasetMetadata",
              "ImageObjectDetectionDatasetMetadata",
              "TextExtractionDatasetMetadata",
              "TextSentimentDatasetMetadata",
              "Name",
              "DisplayName",
              "Description",
              "ExampleCount",
              "CreateTime",
              "Etag",
              "Labels",
              "DatasetMetadata",
            });
    internal_static_google_cloud_automl_v1_Dataset_LabelsEntry_descriptor =
        internal_static_google_cloud_automl_v1_Dataset_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_automl_v1_Dataset_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_Dataset_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.automl.v1.ImageProto.getDescriptor();
    com.google.cloud.automl.v1.TextProto.getDescriptor();
    com.google.cloud.automl.v1.TranslationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
