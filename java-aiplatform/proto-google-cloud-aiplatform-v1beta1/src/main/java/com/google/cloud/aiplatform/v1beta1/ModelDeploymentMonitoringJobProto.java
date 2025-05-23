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
// source: google/cloud/aiplatform/v1beta1/model_deployment_monitoring_job.proto

package com.google.cloud.aiplatform.v1beta1;

public final class ModelDeploymentMonitoringJobProto {
  private ModelDeploymentMonitoringJobProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_LatestMonitoringPipelineMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_LatestMonitoringPipelineMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringBigQueryTable_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringBigQueryTable_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringObjectiveConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringObjectiveConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringScheduleConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringScheduleConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsAnomalies_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsAnomalies_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsAnomalies_FeatureHistoricStatsAnomalies_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsAnomalies_FeatureHistoricStatsAnomalies_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/cloud/aiplatform/v1beta1/model_"
          + "deployment_monitoring_job.proto\022\037google."
          + "cloud.aiplatform.v1beta1\032\037google/api/fie"
          + "ld_behavior.proto\032\031google/api/resource.p"
          + "roto\0325google/cloud/aiplatform/v1beta1/en"
          + "cryption_spec.proto\032>google/cloud/aiplat"
          + "form/v1beta1/feature_monitoring_stats.pr"
          + "oto\032(google/cloud/aiplatform/v1beta1/io."
          + "proto\032/google/cloud/aiplatform/v1beta1/j"
          + "ob_state.proto\0326google/cloud/aiplatform/"
          + "v1beta1/model_monitoring.proto\032\036google/p"
          + "rotobuf/duration.proto\032\034google/protobuf/"
          + "struct.proto\032\037google/protobuf/timestamp."
          + "proto\032\027google/rpc/status.proto\"\363\020\n\034Model"
          + "DeploymentMonitoringJob\022\022\n\004name\030\001 \001(\tB\004\342"
          + "A\001\003\022\032\n\014display_name\030\002 \001(\tB\004\342A\001\002\022=\n\010endpo"
          + "int\030\003 \001(\tB+\342A\001\002\372A$\n\"aiplatform.googleapi"
          + "s.com/Endpoint\022>\n\005state\030\004 \001(\0162).google.c"
          + "loud.aiplatform.v1beta1.JobStateB\004\342A\001\003\022s"
          + "\n\016schedule_state\030\005 \001(\0162U.google.cloud.ai"
          + "platform.v1beta1.ModelDeploymentMonitori"
          + "ngJob.MonitoringScheduleStateB\004\342A\001\003\022\221\001\n#"
          + "latest_monitoring_pipeline_metadata\030\031 \001("
          + "\0132^.google.cloud.aiplatform.v1beta1.Mode"
          + "lDeploymentMonitoringJob.LatestMonitorin"
          + "gPipelineMetadataB\004\342A\001\003\022\206\001\n-model_deploy"
          + "ment_monitoring_objective_configs\030\006 \003(\0132"
          + "I.google.cloud.aiplatform.v1beta1.ModelD"
          + "eploymentMonitoringObjectiveConfigB\004\342A\001\002"
          + "\022\203\001\n+model_deployment_monitoring_schedul"
          + "e_config\030\007 \001(\0132H.google.cloud.aiplatform"
          + ".v1beta1.ModelDeploymentMonitoringSchedu"
          + "leConfigB\004\342A\001\002\022Z\n\031logging_sampling_strat"
          + "egy\030\010 \001(\01321.google.cloud.aiplatform.v1be"
          + "ta1.SamplingStrategyB\004\342A\001\002\022b\n\035model_moni"
          + "toring_alert_config\030\017 \001(\0132;.google.cloud"
          + ".aiplatform.v1beta1.ModelMonitoringAlert"
          + "Config\022#\n\033predict_instance_schema_uri\030\t "
          + "\001(\t\0227\n\027sample_predict_instance\030\023 \001(\0132\026.g"
          + "oogle.protobuf.Value\022$\n\034analysis_instanc"
          + "e_schema_uri\030\020 \001(\t\022f\n\017bigquery_tables\030\n "
          + "\003(\0132G.google.cloud.aiplatform.v1beta1.Mo"
          + "delDeploymentMonitoringBigQueryTableB\004\342A"
          + "\001\003\022*\n\007log_ttl\030\021 \001(\0132\031.google.protobuf.Du"
          + "ration\022Y\n\006labels\030\013 \003(\0132I.google.cloud.ai"
          + "platform.v1beta1.ModelDeploymentMonitori"
          + "ngJob.LabelsEntry\0225\n\013create_time\030\014 \001(\0132\032"
          + ".google.protobuf.TimestampB\004\342A\001\003\0225\n\013upda"
          + "te_time\030\r \001(\0132\032.google.protobuf.Timestam"
          + "pB\004\342A\001\003\022<\n\022next_schedule_time\030\016 \001(\0132\032.go"
          + "ogle.protobuf.TimestampB\004\342A\001\003\022W\n\036stats_a"
          + "nomalies_base_directory\030\024 \001(\0132/.google.c"
          + "loud.aiplatform.v1beta1.GcsDestination\022H"
          + "\n\017encryption_spec\030\025 \001(\0132/.google.cloud.a"
          + "iplatform.v1beta1.EncryptionSpec\022\'\n\037enab"
          + "le_monitoring_pipeline_logs\030\026 \001(\010\022\'\n\005err"
          + "or\030\027 \001(\0132\022.google.rpc.StatusB\004\342A\001\003\032t\n La"
          + "testMonitoringPipelineMetadata\022,\n\010run_ti"
          + "me\030\001 \001(\0132\032.google.protobuf.Timestamp\022\"\n\006"
          + "status\030\002 \001(\0132\022.google.rpc.Status\032-\n\013Labe"
          + "lsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\""
          + "k\n\027MonitoringScheduleState\022)\n%MONITORING"
          + "_SCHEDULE_STATE_UNSPECIFIED\020\000\022\013\n\007PENDING"
          + "\020\001\022\013\n\007OFFLINE\020\002\022\013\n\007RUNNING\020\003:\245\001\352A\241\001\n6aip"
          + "latform.googleapis.com/ModelDeploymentMo"
          + "nitoringJob\022gprojects/{project}/location"
          + "s/{location}/modelDeploymentMonitoringJo"
          + "bs/{model_deployment_monitoring_job}\"\222\003\n"
          + "&ModelDeploymentMonitoringBigQueryTable\022"
          + "e\n\nlog_source\030\001 \001(\0162Q.google.cloud.aipla"
          + "tform.v1beta1.ModelDeploymentMonitoringB"
          + "igQueryTable.LogSource\022a\n\010log_type\030\002 \001(\016"
          + "2O.google.cloud.aiplatform.v1beta1.Model"
          + "DeploymentMonitoringBigQueryTable.LogTyp"
          + "e\022\033\n\023bigquery_table_path\030\003 \001(\t\"B\n\tLogSou"
          + "rce\022\032\n\026LOG_SOURCE_UNSPECIFIED\020\000\022\014\n\010TRAIN"
          + "ING\020\001\022\013\n\007SERVING\020\002\"=\n\007LogType\022\030\n\024LOG_TYP"
          + "E_UNSPECIFIED\020\000\022\013\n\007PREDICT\020\001\022\013\n\007EXPLAIN\020"
          + "\002\"\240\001\n(ModelDeploymentMonitoringObjective"
          + "Config\022\031\n\021deployed_model_id\030\001 \001(\t\022Y\n\020obj"
          + "ective_config\030\002 \001(\0132?.google.cloud.aipla"
          + "tform.v1beta1.ModelMonitoringObjectiveCo"
          + "nfig\"\227\001\n\'ModelDeploymentMonitoringSchedu"
          + "leConfig\0229\n\020monitor_interval\030\001 \001(\0132\031.goo"
          + "gle.protobuf.DurationB\004\342A\001\002\0221\n\016monitor_w"
          + "indow\030\002 \001(\0132\031.google.protobuf.Duration\"\305"
          + "\004\n\035ModelMonitoringStatsAnomalies\022Z\n\tobje"
          + "ctive\030\001 \001(\0162G.google.cloud.aiplatform.v1"
          + "beta1.ModelDeploymentMonitoringObjective"
          + "Type\022\031\n\021deployed_model_id\030\002 \001(\t\022\025\n\ranoma"
          + "ly_count\030\003 \001(\005\022s\n\rfeature_stats\030\004 \003(\0132\\."
          + "google.cloud.aiplatform.v1beta1.ModelMon"
          + "itoringStatsAnomalies.FeatureHistoricSta"
          + "tsAnomalies\032\240\002\n\035FeatureHistoricStatsAnom"
          + "alies\022\034\n\024feature_display_name\030\001 \001(\t\022C\n\tt"
          + "hreshold\030\003 \001(\01320.google.cloud.aiplatform"
          + ".v1beta1.ThresholdConfig\022L\n\016training_sta"
          + "ts\030\004 \001(\01324.google.cloud.aiplatform.v1bet"
          + "a1.FeatureStatsAnomaly\022N\n\020prediction_sta"
          + "ts\030\005 \003(\01324.google.cloud.aiplatform.v1bet"
          + "a1.FeatureStatsAnomaly*\316\001\n&ModelDeployme"
          + "ntMonitoringObjectiveType\022:\n6MODEL_DEPLO"
          + "YMENT_MONITORING_OBJECTIVE_TYPE_UNSPECIF"
          + "IED\020\000\022\024\n\020RAW_FEATURE_SKEW\020\001\022\025\n\021RAW_FEATU"
          + "RE_DRIFT\020\002\022\034\n\030FEATURE_ATTRIBUTION_SKEW\020\003"
          + "\022\035\n\031FEATURE_ATTRIBUTION_DRIFT\020\004B\370\001\n#com."
          + "google.cloud.aiplatform.v1beta1B!ModelDe"
          + "ploymentMonitoringJobProtoP\001ZCcloud.goog"
          + "le.com/go/aiplatform/apiv1beta1/aiplatfo"
          + "rmpb;aiplatformpb\252\002\037Google.Cloud.AIPlatf"
          + "orm.V1Beta1\312\002\037Google\\Cloud\\AIPlatform\\V1"
          + "beta1\352\002\"Google::Cloud::AIPlatform::V1bet"
          + "a1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.FeatureMonitoringStatsProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.JobStateProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ModelMonitoringProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Endpoint",
              "State",
              "ScheduleState",
              "LatestMonitoringPipelineMetadata",
              "ModelDeploymentMonitoringObjectiveConfigs",
              "ModelDeploymentMonitoringScheduleConfig",
              "LoggingSamplingStrategy",
              "ModelMonitoringAlertConfig",
              "PredictInstanceSchemaUri",
              "SamplePredictInstance",
              "AnalysisInstanceSchemaUri",
              "BigqueryTables",
              "LogTtl",
              "Labels",
              "CreateTime",
              "UpdateTime",
              "NextScheduleTime",
              "StatsAnomaliesBaseDirectory",
              "EncryptionSpec",
              "EnableMonitoringPipelineLogs",
              "Error",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_LatestMonitoringPipelineMetadata_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_LatestMonitoringPipelineMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_LatestMonitoringPipelineMetadata_descriptor,
            new java.lang.String[] {
              "RunTime", "Status",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringJob_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringBigQueryTable_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringBigQueryTable_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringBigQueryTable_descriptor,
            new java.lang.String[] {
              "LogSource", "LogType", "BigqueryTablePath",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringObjectiveConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringObjectiveConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringObjectiveConfig_descriptor,
            new java.lang.String[] {
              "DeployedModelId", "ObjectiveConfig",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringScheduleConfig_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringScheduleConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringScheduleConfig_descriptor,
            new java.lang.String[] {
              "MonitorInterval", "MonitorWindow",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsAnomalies_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsAnomalies_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsAnomalies_descriptor,
            new java.lang.String[] {
              "Objective", "DeployedModelId", "AnomalyCount", "FeatureStats",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsAnomalies_FeatureHistoricStatsAnomalies_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsAnomalies_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsAnomalies_FeatureHistoricStatsAnomalies_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelMonitoringStatsAnomalies_FeatureHistoricStatsAnomalies_descriptor,
            new java.lang.String[] {
              "FeatureDisplayName", "Threshold", "TrainingStats", "PredictionStats",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.FeatureMonitoringStatsProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.JobStateProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ModelMonitoringProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
