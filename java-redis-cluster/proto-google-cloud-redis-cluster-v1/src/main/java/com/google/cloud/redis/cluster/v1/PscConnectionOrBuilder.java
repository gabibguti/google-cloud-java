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
// source: google/cloud/redis/cluster/v1/cloud_redis_cluster.proto

package com.google.cloud.redis.cluster.v1;

public interface PscConnectionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.redis.cluster.v1.PscConnection)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The PSC connection id of the forwarding rule connected to the
   * service attachment.
   * </pre>
   *
   * <code>string psc_connection_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The pscConnectionId.
   */
  java.lang.String getPscConnectionId();
  /**
   *
   *
   * <pre>
   * Output only. The PSC connection id of the forwarding rule connected to the
   * service attachment.
   * </pre>
   *
   * <code>string psc_connection_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for pscConnectionId.
   */
  com.google.protobuf.ByteString getPscConnectionIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. The IP allocated on the consumer network for the PSC
   * forwarding rule.
   * </pre>
   *
   * <code>string address = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   *
   *
   * <pre>
   * Output only. The IP allocated on the consumer network for the PSC
   * forwarding rule.
   * </pre>
   *
   * <code>string address = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString getAddressBytes();

  /**
   *
   *
   * <pre>
   * Output only. The URI of the consumer side forwarding rule.
   * Example:
   * projects/{projectNumOrId}/regions/us-east1/forwardingRules/{resourceId}.
   * </pre>
   *
   * <code>string forwarding_rule = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The forwardingRule.
   */
  java.lang.String getForwardingRule();
  /**
   *
   *
   * <pre>
   * Output only. The URI of the consumer side forwarding rule.
   * Example:
   * projects/{projectNumOrId}/regions/us-east1/forwardingRules/{resourceId}.
   * </pre>
   *
   * <code>string forwarding_rule = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for forwardingRule.
   */
  com.google.protobuf.ByteString getForwardingRuleBytes();

  /**
   *
   *
   * <pre>
   * Output only. The consumer project_id where the forwarding rule is created
   * from.
   * </pre>
   *
   * <code>string project_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Output only. The consumer project_id where the forwarding rule is created
   * from.
   * </pre>
   *
   * <code>string project_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * The consumer network where the IP address resides, in the form of
   * projects/{project_id}/global/networks/{network_id}.
   * </pre>
   *
   * <code>string network = 5;</code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * The consumer network where the IP address resides, in the form of
   * projects/{project_id}/global/networks/{network_id}.
   * </pre>
   *
   * <code>string network = 5;</code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();
}
