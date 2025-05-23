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
// source: google/cloud/dataform/v1beta1/dataform.proto

package com.google.cloud.dataform.v1beta1;

public interface WorkflowConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataform.v1beta1.WorkflowConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The workflow config's name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The workflow config's name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The name of the release config whose release_compilation_result
   * should be executed. Must be in the format
   * `projects/&#42;&#47;locations/&#42;&#47;repositories/&#42;&#47;releaseConfigs/&#42;`.
   * </pre>
   *
   * <code>
   * string release_config = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The releaseConfig.
   */
  java.lang.String getReleaseConfig();
  /**
   *
   *
   * <pre>
   * Required. The name of the release config whose release_compilation_result
   * should be executed. Must be in the format
   * `projects/&#42;&#47;locations/&#42;&#47;repositories/&#42;&#47;releaseConfigs/&#42;`.
   * </pre>
   *
   * <code>
   * string release_config = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for releaseConfig.
   */
  com.google.protobuf.ByteString getReleaseConfigBytes();

  /**
   *
   *
   * <pre>
   * Optional. If left unset, a default InvocationConfig will be used.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1beta1.InvocationConfig invocation_config = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the invocationConfig field is set.
   */
  boolean hasInvocationConfig();
  /**
   *
   *
   * <pre>
   * Optional. If left unset, a default InvocationConfig will be used.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1beta1.InvocationConfig invocation_config = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The invocationConfig.
   */
  com.google.cloud.dataform.v1beta1.InvocationConfig getInvocationConfig();
  /**
   *
   *
   * <pre>
   * Optional. If left unset, a default InvocationConfig will be used.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1beta1.InvocationConfig invocation_config = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataform.v1beta1.InvocationConfigOrBuilder getInvocationConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Optional schedule (in cron format) for automatic execution of
   * this workflow config.
   * </pre>
   *
   * <code>string cron_schedule = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The cronSchedule.
   */
  java.lang.String getCronSchedule();
  /**
   *
   *
   * <pre>
   * Optional. Optional schedule (in cron format) for automatic execution of
   * this workflow config.
   * </pre>
   *
   * <code>string cron_schedule = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for cronSchedule.
   */
  com.google.protobuf.ByteString getCronScheduleBytes();

  /**
   *
   *
   * <pre>
   * Optional. Specifies the time zone to be used when interpreting
   * cron_schedule. Must be a time zone name from the time zone database
   * (https://en.wikipedia.org/wiki/List_of_tz_database_time_zones). If left
   * unspecified, the default is UTC.
   * </pre>
   *
   * <code>string time_zone = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The timeZone.
   */
  java.lang.String getTimeZone();
  /**
   *
   *
   * <pre>
   * Optional. Specifies the time zone to be used when interpreting
   * cron_schedule. Must be a time zone name from the time zone database
   * (https://en.wikipedia.org/wiki/List_of_tz_database_time_zones). If left
   * unspecified, the default is UTC.
   * </pre>
   *
   * <code>string time_zone = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for timeZone.
   */
  com.google.protobuf.ByteString getTimeZoneBytes();

  /**
   *
   *
   * <pre>
   * Output only. Records of the 10 most recent scheduled execution attempts,
   * ordered in in descending order of `execution_time`. Updated whenever
   * automatic creation of a workflow invocation is triggered by cron_schedule.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataform.v1beta1.WorkflowConfig.ScheduledExecutionRecord recent_scheduled_execution_records = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.dataform.v1beta1.WorkflowConfig.ScheduledExecutionRecord>
      getRecentScheduledExecutionRecordsList();
  /**
   *
   *
   * <pre>
   * Output only. Records of the 10 most recent scheduled execution attempts,
   * ordered in in descending order of `execution_time`. Updated whenever
   * automatic creation of a workflow invocation is triggered by cron_schedule.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataform.v1beta1.WorkflowConfig.ScheduledExecutionRecord recent_scheduled_execution_records = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataform.v1beta1.WorkflowConfig.ScheduledExecutionRecord
      getRecentScheduledExecutionRecords(int index);
  /**
   *
   *
   * <pre>
   * Output only. Records of the 10 most recent scheduled execution attempts,
   * ordered in in descending order of `execution_time`. Updated whenever
   * automatic creation of a workflow invocation is triggered by cron_schedule.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataform.v1beta1.WorkflowConfig.ScheduledExecutionRecord recent_scheduled_execution_records = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getRecentScheduledExecutionRecordsCount();
  /**
   *
   *
   * <pre>
   * Output only. Records of the 10 most recent scheduled execution attempts,
   * ordered in in descending order of `execution_time`. Updated whenever
   * automatic creation of a workflow invocation is triggered by cron_schedule.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataform.v1beta1.WorkflowConfig.ScheduledExecutionRecord recent_scheduled_execution_records = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.dataform.v1beta1.WorkflowConfig.ScheduledExecutionRecordOrBuilder>
      getRecentScheduledExecutionRecordsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Records of the 10 most recent scheduled execution attempts,
   * ordered in in descending order of `execution_time`. Updated whenever
   * automatic creation of a workflow invocation is triggered by cron_schedule.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataform.v1beta1.WorkflowConfig.ScheduledExecutionRecord recent_scheduled_execution_records = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataform.v1beta1.WorkflowConfig.ScheduledExecutionRecordOrBuilder
      getRecentScheduledExecutionRecordsOrBuilder(int index);
}
