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
// source: google/cloud/osconfig/v1alpha/instance_os_policies_compliance.proto

package com.google.cloud.osconfig.v1alpha;

public final class InstanceOSPoliciesComplianceProto {
  private InstanceOSPoliciesComplianceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_InstanceOSPoliciesCompliance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_InstanceOSPoliciesCompliance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_InstanceOSPoliciesCompliance_OSPolicyCompliance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_InstanceOSPoliciesCompliance_OSPolicyCompliance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_GetInstanceOSPoliciesComplianceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_GetInstanceOSPoliciesComplianceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_ListInstanceOSPoliciesCompliancesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_ListInstanceOSPoliciesCompliancesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_osconfig_v1alpha_ListInstanceOSPoliciesCompliancesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_osconfig_v1alpha_ListInstanceOSPoliciesCompliancesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nCgoogle/cloud/osconfig/v1alpha/instance"
          + "_os_policies_compliance.proto\022\035google.cl"
          + "oud.osconfig.v1alpha\032\037google/api/field_b"
          + "ehavior.proto\032\031google/api/resource.proto"
          + "\0321google/cloud/osconfig/v1alpha/config_c"
          + "ommon.proto\032\037google/protobuf/timestamp.p"
          + "roto\"\366\006\n\034InstanceOSPoliciesCompliance\022\022\n"
          + "\004name\030\001 \001(\tB\004\342A\001\003\022\026\n\010instance\030\002 \001(\tB\004\342A\001"
          + "\003\022K\n\005state\030\003 \001(\01626.google.cloud.osconfig"
          + ".v1alpha.OSPolicyComplianceStateB\004\342A\001\003\022\034"
          + "\n\016detailed_state\030\004 \001(\tB\004\342A\001\003\022#\n\025detailed"
          + "_state_reason\030\005 \001(\tB\004\342A\001\003\022s\n\025os_policy_c"
          + "ompliances\030\006 \003(\0132N.google.cloud.osconfig"
          + ".v1alpha.InstanceOSPoliciesCompliance.OS"
          + "PolicyComplianceB\004\342A\001\003\022D\n\032last_complianc"
          + "e_check_time\030\007 \001(\0132\032.google.protobuf.Tim"
          + "estampB\004\342A\001\003\022$\n\026last_compliance_run_id\030\010"
          + " \001(\tB\004\342A\001\003\032\247\002\n\022OSPolicyCompliance\022\024\n\014os_"
          + "policy_id\030\001 \001(\t\022M\n\024os_policy_assignment\030"
          + "\002 \001(\tB/\372A,\n*osconfig.googleapis.com/OSPo"
          + "licyAssignment\022E\n\005state\030\004 \001(\01626.google.c"
          + "loud.osconfig.v1alpha.OSPolicyCompliance"
          + "State\022a\n\036os_policy_resource_compliances\030"
          + "\005 \003(\01329.google.cloud.osconfig.v1alpha.OS"
          + "PolicyResourceCompliance:\002\030\001:\216\001\030\001\352A\210\001\n4o"
          + "sconfig.googleapis.com/InstanceOSPolicie"
          + "sCompliance\022Pprojects/{project}/location"
          + "s/{location}/instanceOSPoliciesComplianc"
          + "es/{instance}\"y\n&GetInstanceOSPoliciesCo"
          + "mplianceRequest\022K\n\004name\030\001 \001(\tB=\342A\001\002\372A6\n4"
          + "osconfig.googleapis.com/InstanceOSPolici"
          + "esCompliance:\002\030\001\"\241\001\n(ListInstanceOSPolic"
          + "iesCompliancesRequest\022:\n\006parent\030\001 \001(\tB*\342"
          + "A\001\002\372A#\n!locations.googleapis.com/Locatio"
          + "n\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t"
          + "\022\016\n\006filter\030\004 \001(\t:\002\030\001\"\257\001\n)ListInstanceOSP"
          + "oliciesCompliancesResponse\022e\n instance_o"
          + "s_policies_compliances\030\001 \003(\0132;.google.cl"
          + "oud.osconfig.v1alpha.InstanceOSPoliciesC"
          + "ompliance\022\027\n\017next_page_token\030\002 \001(\t:\002\030\001B\352"
          + "\001\n!com.google.cloud.osconfig.v1alphaB!In"
          + "stanceOSPoliciesComplianceProtoP\001Z=cloud"
          + ".google.com/go/osconfig/apiv1alpha/oscon"
          + "figpb;osconfigpb\252\002\035Google.Cloud.OsConfig"
          + ".V1Alpha\312\002\035Google\\Cloud\\OsConfig\\V1alpha"
          + "\352\002 Google::Cloud::OsConfig::V1alphab\006pro"
          + "to3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.osconfig.v1alpha.ConfigCommonProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_osconfig_v1alpha_InstanceOSPoliciesCompliance_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_osconfig_v1alpha_InstanceOSPoliciesCompliance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_InstanceOSPoliciesCompliance_descriptor,
            new java.lang.String[] {
              "Name",
              "Instance",
              "State",
              "DetailedState",
              "DetailedStateReason",
              "OsPolicyCompliances",
              "LastComplianceCheckTime",
              "LastComplianceRunId",
            });
    internal_static_google_cloud_osconfig_v1alpha_InstanceOSPoliciesCompliance_OSPolicyCompliance_descriptor =
        internal_static_google_cloud_osconfig_v1alpha_InstanceOSPoliciesCompliance_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_osconfig_v1alpha_InstanceOSPoliciesCompliance_OSPolicyCompliance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_InstanceOSPoliciesCompliance_OSPolicyCompliance_descriptor,
            new java.lang.String[] {
              "OsPolicyId", "OsPolicyAssignment", "State", "OsPolicyResourceCompliances",
            });
    internal_static_google_cloud_osconfig_v1alpha_GetInstanceOSPoliciesComplianceRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_osconfig_v1alpha_GetInstanceOSPoliciesComplianceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_GetInstanceOSPoliciesComplianceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_osconfig_v1alpha_ListInstanceOSPoliciesCompliancesRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_osconfig_v1alpha_ListInstanceOSPoliciesCompliancesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_ListInstanceOSPoliciesCompliancesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_osconfig_v1alpha_ListInstanceOSPoliciesCompliancesResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_osconfig_v1alpha_ListInstanceOSPoliciesCompliancesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_osconfig_v1alpha_ListInstanceOSPoliciesCompliancesResponse_descriptor,
            new java.lang.String[] {
              "InstanceOsPoliciesCompliances", "NextPageToken",
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
    com.google.cloud.osconfig.v1alpha.ConfigCommonProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
