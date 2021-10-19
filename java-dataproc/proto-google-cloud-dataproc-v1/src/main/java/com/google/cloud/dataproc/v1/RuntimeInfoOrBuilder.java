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
// source: google/cloud/dataproc/v1/shared.proto

package com.google.cloud.dataproc.v1;

public interface RuntimeInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.RuntimeInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Map of remote access endpoints (such as web interfaces and APIs) to their
   * URIs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; endpoints = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getEndpointsCount();
  /**
   *
   *
   * <pre>
   * Output only. Map of remote access endpoints (such as web interfaces and APIs) to their
   * URIs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; endpoints = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  boolean containsEndpoints(java.lang.String key);
  /** Use {@link #getEndpointsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getEndpoints();
  /**
   *
   *
   * <pre>
   * Output only. Map of remote access endpoints (such as web interfaces and APIs) to their
   * URIs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; endpoints = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getEndpointsMap();
  /**
   *
   *
   * <pre>
   * Output only. Map of remote access endpoints (such as web interfaces and APIs) to their
   * URIs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; endpoints = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.lang.String getEndpointsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Output only. Map of remote access endpoints (such as web interfaces and APIs) to their
   * URIs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; endpoints = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.lang.String getEndpointsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. A URI pointing to the location of the stdout and stderr of the workload.
   * </pre>
   *
   * <code>string output_uri = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The outputUri.
   */
  java.lang.String getOutputUri();
  /**
   *
   *
   * <pre>
   * Output only. A URI pointing to the location of the stdout and stderr of the workload.
   * </pre>
   *
   * <code>string output_uri = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for outputUri.
   */
  com.google.protobuf.ByteString getOutputUriBytes();
}
