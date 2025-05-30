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
// source: google/monitoring/v3/group_service.proto

package com.google.monitoring.v3;

public final class GroupServiceProto {
  private GroupServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListGroupsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListGroupsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListGroupsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListGroupsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_GetGroupRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_GetGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_CreateGroupRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_CreateGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_UpdateGroupRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_UpdateGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_DeleteGroupRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_DeleteGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListGroupMembersRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListGroupMembersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListGroupMembersResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListGroupMembersResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/monitoring/v3/group_service.pro"
          + "to\022\024google.monitoring.v3\032\034google/api/ann"
          + "otations.proto\032\027google/api/client.proto\032"
          + "\037google/api/field_behavior.proto\032#google"
          + "/api/monitored_resource.proto\032\031google/ap"
          + "i/resource.proto\032!google/monitoring/v3/c"
          + "ommon.proto\032 google/monitoring/v3/group."
          + "proto\032\033google/protobuf/empty.proto\"\311\002\n\021L"
          + "istGroupsRequest\0226\n\004name\030\007 \001(\tB(\342A\001\002\372A!\022"
          + "\037monitoring.googleapis.com/Group\022A\n\021chil"
          + "dren_of_group\030\002 \001(\tB$\372A!\n\037monitoring.goo"
          + "gleapis.com/GroupH\000\022B\n\022ancestors_of_grou"
          + "p\030\003 \001(\tB$\372A!\n\037monitoring.googleapis.com/"
          + "GroupH\000\022D\n\024descendants_of_group\030\004 \001(\tB$\372"
          + "A!\n\037monitoring.googleapis.com/GroupH\000\022\021\n"
          + "\tpage_size\030\005 \001(\005\022\022\n\npage_token\030\006 \001(\tB\010\n\006"
          + "filter\"Y\n\022ListGroupsResponse\022*\n\005group\030\001 "
          + "\003(\0132\033.google.monitoring.v3.Group\022\027\n\017next"
          + "_page_token\030\002 \001(\t\"I\n\017GetGroupRequest\0226\n\004"
          + "name\030\003 \001(\tB(\342A\001\002\372A!\n\037monitoring.googleap"
          + "is.com/Group\"\225\001\n\022CreateGroupRequest\0226\n\004n"
          + "ame\030\004 \001(\tB(\342A\001\002\372A!\022\037monitoring.googleapi"
          + "s.com/Group\0220\n\005group\030\002 \001(\0132\033.google.moni"
          + "toring.v3.GroupB\004\342A\001\002\022\025\n\rvalidate_only\030\003"
          + " \001(\010\"]\n\022UpdateGroupRequest\0220\n\005group\030\002 \001("
          + "\0132\033.google.monitoring.v3.GroupB\004\342A\001\002\022\025\n\r"
          + "validate_only\030\003 \001(\010\"_\n\022DeleteGroupReques"
          + "t\0226\n\004name\030\003 \001(\tB(\342A\001\002\372A!\n\037monitoring.goo"
          + "gleapis.com/Group\022\021\n\trecursive\030\004 \001(\010\"\276\001\n"
          + "\027ListGroupMembersRequest\0226\n\004name\030\007 \001(\tB("
          + "\342A\001\002\372A!\n\037monitoring.googleapis.com/Group"
          + "\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npage_token\030\004 \001(\t\022"
          + "\016\n\006filter\030\005 \001(\t\0224\n\010interval\030\006 \001(\0132\".goog"
          + "le.monitoring.v3.TimeInterval\"w\n\030ListGro"
          + "upMembersResponse\022.\n\007members\030\001 \003(\0132\035.goo"
          + "gle.api.MonitoredResource\022\027\n\017next_page_t"
          + "oken\030\002 \001(\t\022\022\n\ntotal_size\030\003 \001(\0052\230\010\n\014Group"
          + "Service\022\214\001\n\nListGroups\022\'.google.monitori"
          + "ng.v3.ListGroupsRequest\032(.google.monitor"
          + "ing.v3.ListGroupsResponse\"+\332A\004name\202\323\344\223\002\036"
          + "\022\034/v3/{name=projects/*}/groups\022}\n\010GetGro"
          + "up\022%.google.monitoring.v3.GetGroupReques"
          + "t\032\033.google.monitoring.v3.Group\"-\332A\004name\202"
          + "\323\344\223\002 \022\036/v3/{name=projects/*/groups/*}\022\216\001"
          + "\n\013CreateGroup\022(.google.monitoring.v3.Cre"
          + "ateGroupRequest\032\033.google.monitoring.v3.G"
          + "roup\"8\332A\nname,group\202\323\344\223\002%\"\034/v3/{name=pro"
          + "jects/*}/groups:\005group\022\221\001\n\013UpdateGroup\022("
          + ".google.monitoring.v3.UpdateGroupRequest"
          + "\032\033.google.monitoring.v3.Group\";\332A\005group\202"
          + "\323\344\223\002-\032$/v3/{group.name=projects/*/groups"
          + "/*}:\005group\022~\n\013DeleteGroup\022(.google.monit"
          + "oring.v3.DeleteGroupRequest\032\026.google.pro"
          + "tobuf.Empty\"-\332A\004name\202\323\344\223\002 *\036/v3/{name=pr"
          + "ojects/*/groups/*}\022\250\001\n\020ListGroupMembers\022"
          + "-.google.monitoring.v3.ListGroupMembersR"
          + "equest\032..google.monitoring.v3.ListGroupM"
          + "embersResponse\"5\332A\004name\202\323\344\223\002(\022&/v3/{name"
          + "=projects/*/groups/*}/members\032\251\001\312A\031monit"
          + "oring.googleapis.com\322A\211\001https://www.goog"
          + "leapis.com/auth/cloud-platform,https://w"
          + "ww.googleapis.com/auth/monitoring,https:"
          + "//www.googleapis.com/auth/monitoring.rea"
          + "dB\314\001\n\030com.google.monitoring.v3B\021GroupSer"
          + "viceProtoP\001ZAcloud.google.com/go/monitor"
          + "ing/apiv3/v2/monitoringpb;monitoringpb\252\002"
          + "\032Google.Cloud.Monitoring.V3\312\002\032Google\\Clo"
          + "ud\\Monitoring\\V3\352\002\035Google::Cloud::Monito"
          + "ring::V3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.MonitoredResourceProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.monitoring.v3.CommonProto.getDescriptor(),
              com.google.monitoring.v3.GroupProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
            });
    internal_static_google_monitoring_v3_ListGroupsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_v3_ListGroupsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListGroupsRequest_descriptor,
            new java.lang.String[] {
              "Name",
              "ChildrenOfGroup",
              "AncestorsOfGroup",
              "DescendantsOfGroup",
              "PageSize",
              "PageToken",
              "Filter",
            });
    internal_static_google_monitoring_v3_ListGroupsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_monitoring_v3_ListGroupsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListGroupsResponse_descriptor,
            new java.lang.String[] {
              "Group", "NextPageToken",
            });
    internal_static_google_monitoring_v3_GetGroupRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_monitoring_v3_GetGroupRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_GetGroupRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_monitoring_v3_CreateGroupRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_monitoring_v3_CreateGroupRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_CreateGroupRequest_descriptor,
            new java.lang.String[] {
              "Name", "Group", "ValidateOnly",
            });
    internal_static_google_monitoring_v3_UpdateGroupRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_monitoring_v3_UpdateGroupRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_UpdateGroupRequest_descriptor,
            new java.lang.String[] {
              "Group", "ValidateOnly",
            });
    internal_static_google_monitoring_v3_DeleteGroupRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_monitoring_v3_DeleteGroupRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_DeleteGroupRequest_descriptor,
            new java.lang.String[] {
              "Name", "Recursive",
            });
    internal_static_google_monitoring_v3_ListGroupMembersRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_monitoring_v3_ListGroupMembersRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListGroupMembersRequest_descriptor,
            new java.lang.String[] {
              "Name", "PageSize", "PageToken", "Filter", "Interval",
            });
    internal_static_google_monitoring_v3_ListGroupMembersResponse_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_monitoring_v3_ListGroupMembersResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListGroupMembersResponse_descriptor,
            new java.lang.String[] {
              "Members", "NextPageToken", "TotalSize",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.MonitoredResourceProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.monitoring.v3.CommonProto.getDescriptor();
    com.google.monitoring.v3.GroupProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
