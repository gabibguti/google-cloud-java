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
// source: google/cloud/orchestration/airflow/service/v1/environments.proto

package com.google.cloud.orchestration.airflow.service.v1;

public interface NodeConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orchestration.airflow.service.v1.NodeConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine [zone](/compute/docs/regions-zones) in which
   * to deploy the VMs used to run the Apache Airflow software, specified as a
   * [relative resource
   * name](/apis/design/resource_names#relative_resource_name). For example:
   * "projects/{projectId}/zones/{zoneId}".
   * This `location` must belong to the enclosing environment's project and
   * location. If both this field and `nodeConfig.machineType` are specified,
   * `nodeConfig.machineType` must belong to this `location`; if both are
   * unspecified, the service will pick a zone in the Compute Engine region
   * corresponding to the Cloud Composer location, and propagate that choice to
   * both fields. If only one field (`location` or `nodeConfig.machineType`) is
   * specified, the location information from the specified field will be
   * propagated to the unspecified field.
   * This field is supported for Cloud Composer environments in versions
   * composer-1.*.*-airflow-*.*.*.
   * </pre>
   *
   * <code>string location = 1;</code>
   *
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine [zone](/compute/docs/regions-zones) in which
   * to deploy the VMs used to run the Apache Airflow software, specified as a
   * [relative resource
   * name](/apis/design/resource_names#relative_resource_name). For example:
   * "projects/{projectId}/zones/{zoneId}".
   * This `location` must belong to the enclosing environment's project and
   * location. If both this field and `nodeConfig.machineType` are specified,
   * `nodeConfig.machineType` must belong to this `location`; if both are
   * unspecified, the service will pick a zone in the Compute Engine region
   * corresponding to the Cloud Composer location, and propagate that choice to
   * both fields. If only one field (`location` or `nodeConfig.machineType`) is
   * specified, the location information from the specified field will be
   * propagated to the unspecified field.
   * This field is supported for Cloud Composer environments in versions
   * composer-1.*.*-airflow-*.*.*.
   * </pre>
   *
   * <code>string location = 1;</code>
   *
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString getLocationBytes();

  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine
   * [machine type](/compute/docs/machine-types) used for cluster instances,
   * specified as a
   * [relative resource
   * name](/apis/design/resource_names#relative_resource_name). For example:
   * "projects/{projectId}/zones/{zoneId}/machineTypes/{machineTypeId}".
   * The `machineType` must belong to the enclosing environment's project and
   * location. If both this field and `nodeConfig.location` are specified,
   * this `machineType` must belong to the `nodeConfig.location`; if both are
   * unspecified, the service will pick a zone in the Compute Engine region
   * corresponding to the Cloud Composer location, and propagate that choice to
   * both fields. If exactly one of this field and `nodeConfig.location` is
   * specified, the location information from the specified field will be
   * propagated to the unspecified field.
   * The `machineTypeId` must not be a [shared-core machine
   * type](/compute/docs/machine-types#sharedcore).
   * If this field is unspecified, the `machineTypeId` defaults
   * to "n1-standard-1".
   * This field is supported for Cloud Composer environments in versions
   * composer-1.*.*-airflow-*.*.*.
   * </pre>
   *
   * <code>string machine_type = 2;</code>
   *
   * @return The machineType.
   */
  java.lang.String getMachineType();
  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine
   * [machine type](/compute/docs/machine-types) used for cluster instances,
   * specified as a
   * [relative resource
   * name](/apis/design/resource_names#relative_resource_name). For example:
   * "projects/{projectId}/zones/{zoneId}/machineTypes/{machineTypeId}".
   * The `machineType` must belong to the enclosing environment's project and
   * location. If both this field and `nodeConfig.location` are specified,
   * this `machineType` must belong to the `nodeConfig.location`; if both are
   * unspecified, the service will pick a zone in the Compute Engine region
   * corresponding to the Cloud Composer location, and propagate that choice to
   * both fields. If exactly one of this field and `nodeConfig.location` is
   * specified, the location information from the specified field will be
   * propagated to the unspecified field.
   * The `machineTypeId` must not be a [shared-core machine
   * type](/compute/docs/machine-types#sharedcore).
   * If this field is unspecified, the `machineTypeId` defaults
   * to "n1-standard-1".
   * This field is supported for Cloud Composer environments in versions
   * composer-1.*.*-airflow-*.*.*.
   * </pre>
   *
   * <code>string machine_type = 2;</code>
   *
   * @return The bytes for machineType.
   */
  com.google.protobuf.ByteString getMachineTypeBytes();

  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine network to be used for machine
   * communications, specified as a
   * [relative resource
   * name](/apis/design/resource_names#relative_resource_name). For example:
   * "projects/{projectId}/global/networks/{networkId}".
   * If unspecified, the "default" network ID in the environment's project is
   * used. If a [Custom Subnet Network](/vpc/docs/vpc#vpc_networks_and_subnets)
   * is provided, `nodeConfig.subnetwork` must also be provided. For
   * [Shared VPC](/vpc/docs/shared-vpc) subnetwork requirements, see
   * `nodeConfig.subnetwork`.
   * </pre>
   *
   * <code>string network = 3;</code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine network to be used for machine
   * communications, specified as a
   * [relative resource
   * name](/apis/design/resource_names#relative_resource_name). For example:
   * "projects/{projectId}/global/networks/{networkId}".
   * If unspecified, the "default" network ID in the environment's project is
   * used. If a [Custom Subnet Network](/vpc/docs/vpc#vpc_networks_and_subnets)
   * is provided, `nodeConfig.subnetwork` must also be provided. For
   * [Shared VPC](/vpc/docs/shared-vpc) subnetwork requirements, see
   * `nodeConfig.subnetwork`.
   * </pre>
   *
   * <code>string network = 3;</code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine subnetwork to be used for machine
   * communications, specified as a
   * [relative resource
   * name](/apis/design/resource_names#relative_resource_name). For example:
   * "projects/{projectId}/regions/{regionId}/subnetworks/{subnetworkId}"
   * If a subnetwork is provided, `nodeConfig.network` must also be provided,
   * and the subnetwork must belong to the enclosing environment's project and
   * location.
   * </pre>
   *
   * <code>string subnetwork = 4;</code>
   *
   * @return The subnetwork.
   */
  java.lang.String getSubnetwork();
  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine subnetwork to be used for machine
   * communications, specified as a
   * [relative resource
   * name](/apis/design/resource_names#relative_resource_name). For example:
   * "projects/{projectId}/regions/{regionId}/subnetworks/{subnetworkId}"
   * If a subnetwork is provided, `nodeConfig.network` must also be provided,
   * and the subnetwork must belong to the enclosing environment's project and
   * location.
   * </pre>
   *
   * <code>string subnetwork = 4;</code>
   *
   * @return The bytes for subnetwork.
   */
  com.google.protobuf.ByteString getSubnetworkBytes();

  /**
   *
   *
   * <pre>
   * Optional. The disk size in GB used for node VMs. Minimum size is 30GB.
   * If unspecified, defaults to 100GB. Cannot be updated.
   * This field is supported for Cloud Composer environments in versions
   * composer-1.*.*-airflow-*.*.*.
   * </pre>
   *
   * <code>int32 disk_size_gb = 5;</code>
   *
   * @return The diskSizeGb.
   */
  int getDiskSizeGb();

  /**
   *
   *
   * <pre>
   * Optional. The set of Google API scopes to be made available on all
   * node VMs. If `oauth_scopes` is empty, defaults to
   * ["https://www.googleapis.com/auth/cloud-platform"]. Cannot be updated.
   * This field is supported for Cloud Composer environments in versions
   * composer-1.*.*-airflow-*.*.*.
   * </pre>
   *
   * <code>repeated string oauth_scopes = 6;</code>
   *
   * @return A list containing the oauthScopes.
   */
  java.util.List<java.lang.String> getOauthScopesList();
  /**
   *
   *
   * <pre>
   * Optional. The set of Google API scopes to be made available on all
   * node VMs. If `oauth_scopes` is empty, defaults to
   * ["https://www.googleapis.com/auth/cloud-platform"]. Cannot be updated.
   * This field is supported for Cloud Composer environments in versions
   * composer-1.*.*-airflow-*.*.*.
   * </pre>
   *
   * <code>repeated string oauth_scopes = 6;</code>
   *
   * @return The count of oauthScopes.
   */
  int getOauthScopesCount();
  /**
   *
   *
   * <pre>
   * Optional. The set of Google API scopes to be made available on all
   * node VMs. If `oauth_scopes` is empty, defaults to
   * ["https://www.googleapis.com/auth/cloud-platform"]. Cannot be updated.
   * This field is supported for Cloud Composer environments in versions
   * composer-1.*.*-airflow-*.*.*.
   * </pre>
   *
   * <code>repeated string oauth_scopes = 6;</code>
   *
   * @param index The index of the element to return.
   * @return The oauthScopes at the given index.
   */
  java.lang.String getOauthScopes(int index);
  /**
   *
   *
   * <pre>
   * Optional. The set of Google API scopes to be made available on all
   * node VMs. If `oauth_scopes` is empty, defaults to
   * ["https://www.googleapis.com/auth/cloud-platform"]. Cannot be updated.
   * This field is supported for Cloud Composer environments in versions
   * composer-1.*.*-airflow-*.*.*.
   * </pre>
   *
   * <code>repeated string oauth_scopes = 6;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the oauthScopes at the given index.
   */
  com.google.protobuf.ByteString getOauthScopesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. The Google Cloud Platform Service Account to be used by the node
   * VMs. If a service account is not specified, the "default" Compute Engine
   * service account is used. Cannot be updated.
   * </pre>
   *
   * <code>string service_account = 7;</code>
   *
   * @return The serviceAccount.
   */
  java.lang.String getServiceAccount();
  /**
   *
   *
   * <pre>
   * Optional. The Google Cloud Platform Service Account to be used by the node
   * VMs. If a service account is not specified, the "default" Compute Engine
   * service account is used. Cannot be updated.
   * </pre>
   *
   * <code>string service_account = 7;</code>
   *
   * @return The bytes for serviceAccount.
   */
  com.google.protobuf.ByteString getServiceAccountBytes();

  /**
   *
   *
   * <pre>
   * Optional. The list of instance tags applied to all node VMs. Tags are used
   * to identify valid sources or targets for network firewalls. Each tag within
   * the list must comply with [RFC1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Cannot be updated.
   * This field is supported for Cloud Composer environments in versions
   * composer-1.*.*-airflow-*.*.*.
   * </pre>
   *
   * <code>repeated string tags = 8;</code>
   *
   * @return A list containing the tags.
   */
  java.util.List<java.lang.String> getTagsList();
  /**
   *
   *
   * <pre>
   * Optional. The list of instance tags applied to all node VMs. Tags are used
   * to identify valid sources or targets for network firewalls. Each tag within
   * the list must comply with [RFC1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Cannot be updated.
   * This field is supported for Cloud Composer environments in versions
   * composer-1.*.*-airflow-*.*.*.
   * </pre>
   *
   * <code>repeated string tags = 8;</code>
   *
   * @return The count of tags.
   */
  int getTagsCount();
  /**
   *
   *
   * <pre>
   * Optional. The list of instance tags applied to all node VMs. Tags are used
   * to identify valid sources or targets for network firewalls. Each tag within
   * the list must comply with [RFC1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Cannot be updated.
   * This field is supported for Cloud Composer environments in versions
   * composer-1.*.*-airflow-*.*.*.
   * </pre>
   *
   * <code>repeated string tags = 8;</code>
   *
   * @param index The index of the element to return.
   * @return The tags at the given index.
   */
  java.lang.String getTags(int index);
  /**
   *
   *
   * <pre>
   * Optional. The list of instance tags applied to all node VMs. Tags are used
   * to identify valid sources or targets for network firewalls. Each tag within
   * the list must comply with [RFC1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Cannot be updated.
   * This field is supported for Cloud Composer environments in versions
   * composer-1.*.*-airflow-*.*.*.
   * </pre>
   *
   * <code>repeated string tags = 8;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the tags at the given index.
   */
  com.google.protobuf.ByteString getTagsBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. The configuration for controlling how IPs are allocated in the
   * GKE cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1.IPAllocationPolicy ip_allocation_policy = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the ipAllocationPolicy field is set.
   */
  boolean hasIpAllocationPolicy();
  /**
   *
   *
   * <pre>
   * Optional. The configuration for controlling how IPs are allocated in the
   * GKE cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1.IPAllocationPolicy ip_allocation_policy = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The ipAllocationPolicy.
   */
  com.google.cloud.orchestration.airflow.service.v1.IPAllocationPolicy getIpAllocationPolicy();
  /**
   *
   *
   * <pre>
   * Optional. The configuration for controlling how IPs are allocated in the
   * GKE cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1.IPAllocationPolicy ip_allocation_policy = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.orchestration.airflow.service.v1.IPAllocationPolicyOrBuilder
      getIpAllocationPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Deploys 'ip-masq-agent' daemon set in the GKE cluster and defines
   * nonMasqueradeCIDRs equals to pod IP range so IP masquerading is used for
   * all destination addresses, except between pods traffic.
   * See:
   * https://cloud.google.com/kubernetes-engine/docs/how-to/ip-masquerade-agent
   * </pre>
   *
   * <code>bool enable_ip_masq_agent = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The enableIpMasqAgent.
   */
  boolean getEnableIpMasqAgent();
}
