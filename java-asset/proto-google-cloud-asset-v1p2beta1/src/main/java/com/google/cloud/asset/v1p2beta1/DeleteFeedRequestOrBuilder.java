/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/asset/v1p2beta1/asset_service.proto

package com.google.cloud.asset.v1p2beta1;

public interface DeleteFeedRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1p2beta1.DeleteFeedRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the feed and it must be in the format of:
   * projects/project_number/feeds/feed_id
   * folders/folder_number/feeds/feed_id
   * organizations/organization_number/feeds/feed_id
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name of the feed and it must be in the format of:
   * projects/project_number/feeds/feed_id
   * folders/folder_number/feeds/feed_id
   * organizations/organization_number/feeds/feed_id
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();
}
