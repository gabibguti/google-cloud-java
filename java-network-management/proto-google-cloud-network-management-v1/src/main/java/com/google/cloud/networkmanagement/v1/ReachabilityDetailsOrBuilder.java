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
// source: google/cloud/networkmanagement/v1/connectivity_test.proto

package com.google.cloud.networkmanagement.v1;

public interface ReachabilityDetailsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkmanagement.v1.ReachabilityDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The overall result of the test's configuration analysis.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.ReachabilityDetails.Result result = 1;</code>
   *
   * @return The enum numeric value on the wire for result.
   */
  int getResultValue();
  /**
   *
   *
   * <pre>
   * The overall result of the test's configuration analysis.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.ReachabilityDetails.Result result = 1;</code>
   *
   * @return The result.
   */
  com.google.cloud.networkmanagement.v1.ReachabilityDetails.Result getResult();

  /**
   *
   *
   * <pre>
   * The time of the configuration analysis.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp verify_time = 2;</code>
   *
   * @return Whether the verifyTime field is set.
   */
  boolean hasVerifyTime();
  /**
   *
   *
   * <pre>
   * The time of the configuration analysis.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp verify_time = 2;</code>
   *
   * @return The verifyTime.
   */
  com.google.protobuf.Timestamp getVerifyTime();
  /**
   *
   *
   * <pre>
   * The time of the configuration analysis.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp verify_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getVerifyTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The details of a failure or a cancellation of reachability analysis.
   * </pre>
   *
   * <code>.google.rpc.Status error = 3;</code>
   *
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   *
   *
   * <pre>
   * The details of a failure or a cancellation of reachability analysis.
   * </pre>
   *
   * <code>.google.rpc.Status error = 3;</code>
   *
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   *
   *
   * <pre>
   * The details of a failure or a cancellation of reachability analysis.
   * </pre>
   *
   * <code>.google.rpc.Status error = 3;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();

  /**
   *
   *
   * <pre>
   * Result may contain a list of traces if a test has multiple possible
   * paths in the network, such as when destination endpoint is a load balancer
   * with multiple backends.
   * </pre>
   *
   * <code>repeated .google.cloud.networkmanagement.v1.Trace traces = 5;</code>
   */
  java.util.List<com.google.cloud.networkmanagement.v1.Trace> getTracesList();
  /**
   *
   *
   * <pre>
   * Result may contain a list of traces if a test has multiple possible
   * paths in the network, such as when destination endpoint is a load balancer
   * with multiple backends.
   * </pre>
   *
   * <code>repeated .google.cloud.networkmanagement.v1.Trace traces = 5;</code>
   */
  com.google.cloud.networkmanagement.v1.Trace getTraces(int index);
  /**
   *
   *
   * <pre>
   * Result may contain a list of traces if a test has multiple possible
   * paths in the network, such as when destination endpoint is a load balancer
   * with multiple backends.
   * </pre>
   *
   * <code>repeated .google.cloud.networkmanagement.v1.Trace traces = 5;</code>
   */
  int getTracesCount();
  /**
   *
   *
   * <pre>
   * Result may contain a list of traces if a test has multiple possible
   * paths in the network, such as when destination endpoint is a load balancer
   * with multiple backends.
   * </pre>
   *
   * <code>repeated .google.cloud.networkmanagement.v1.Trace traces = 5;</code>
   */
  java.util.List<? extends com.google.cloud.networkmanagement.v1.TraceOrBuilder>
      getTracesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Result may contain a list of traces if a test has multiple possible
   * paths in the network, such as when destination endpoint is a load balancer
   * with multiple backends.
   * </pre>
   *
   * <code>repeated .google.cloud.networkmanagement.v1.Trace traces = 5;</code>
   */
  com.google.cloud.networkmanagement.v1.TraceOrBuilder getTracesOrBuilder(int index);
}
