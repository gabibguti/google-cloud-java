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
// source: google/cloud/dataproc/v1/shared.proto

package com.google.cloud.dataproc.v1;

public interface UsageMetricsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.UsageMetrics)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. DCU (Dataproc Compute Units) usage in (`milliDCU` x `seconds`)
   * (see [Dataproc Serverless pricing]
   * (https://cloud.google.com/dataproc-serverless/pricing)).
   * </pre>
   *
   * <code>int64 milli_dcu_seconds = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The milliDcuSeconds.
   */
  long getMilliDcuSeconds();

  /**
   *
   *
   * <pre>
   * Optional. Shuffle storage usage in (`GB` x `seconds`) (see
   * [Dataproc Serverless pricing]
   * (https://cloud.google.com/dataproc-serverless/pricing)).
   * </pre>
   *
   * <code>int64 shuffle_storage_gb_seconds = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The shuffleStorageGbSeconds.
   */
  long getShuffleStorageGbSeconds();
}
