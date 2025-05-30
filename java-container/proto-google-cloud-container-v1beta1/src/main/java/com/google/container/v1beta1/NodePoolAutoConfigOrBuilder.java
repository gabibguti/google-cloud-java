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
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface NodePoolAutoConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.NodePoolAutoConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of instance tags applied to all nodes. Tags are used to identify
   * valid sources or targets for network firewalls and are specified by
   * the client during cluster creation. Each tag within the list
   * must comply with RFC1035.
   * </pre>
   *
   * <code>.google.container.v1beta1.NetworkTags network_tags = 1;</code>
   *
   * @return Whether the networkTags field is set.
   */
  boolean hasNetworkTags();
  /**
   *
   *
   * <pre>
   * The list of instance tags applied to all nodes. Tags are used to identify
   * valid sources or targets for network firewalls and are specified by
   * the client during cluster creation. Each tag within the list
   * must comply with RFC1035.
   * </pre>
   *
   * <code>.google.container.v1beta1.NetworkTags network_tags = 1;</code>
   *
   * @return The networkTags.
   */
  com.google.container.v1beta1.NetworkTags getNetworkTags();
  /**
   *
   *
   * <pre>
   * The list of instance tags applied to all nodes. Tags are used to identify
   * valid sources or targets for network firewalls and are specified by
   * the client during cluster creation. Each tag within the list
   * must comply with RFC1035.
   * </pre>
   *
   * <code>.google.container.v1beta1.NetworkTags network_tags = 1;</code>
   */
  com.google.container.v1beta1.NetworkTagsOrBuilder getNetworkTagsOrBuilder();

  /**
   *
   *
   * <pre>
   * Resource manager tag keys and values to be attached to the nodes
   * for managing Compute Engine firewalls using Network Firewall Policies.
   * </pre>
   *
   * <code>.google.container.v1beta1.ResourceManagerTags resource_manager_tags = 2;</code>
   *
   * @return Whether the resourceManagerTags field is set.
   */
  boolean hasResourceManagerTags();
  /**
   *
   *
   * <pre>
   * Resource manager tag keys and values to be attached to the nodes
   * for managing Compute Engine firewalls using Network Firewall Policies.
   * </pre>
   *
   * <code>.google.container.v1beta1.ResourceManagerTags resource_manager_tags = 2;</code>
   *
   * @return The resourceManagerTags.
   */
  com.google.container.v1beta1.ResourceManagerTags getResourceManagerTags();
  /**
   *
   *
   * <pre>
   * Resource manager tag keys and values to be attached to the nodes
   * for managing Compute Engine firewalls using Network Firewall Policies.
   * </pre>
   *
   * <code>.google.container.v1beta1.ResourceManagerTags resource_manager_tags = 2;</code>
   */
  com.google.container.v1beta1.ResourceManagerTagsOrBuilder getResourceManagerTagsOrBuilder();
}
