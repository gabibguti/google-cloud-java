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
// source: google/cloud/discoveryengine/v1alpha/engine_service.proto

package com.google.cloud.discoveryengine.v1alpha;

public interface UpdateEngineRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1alpha.UpdateEngineRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The [Engine][google.cloud.discoveryengine.v1alpha.Engine] to
   * update.
   *
   * If the caller does not have permission to update the
   * [Engine][google.cloud.discoveryengine.v1alpha.Engine], regardless of
   * whether or not it exists, a PERMISSION_DENIED error is returned.
   *
   * If the [Engine][google.cloud.discoveryengine.v1alpha.Engine] to update does
   * not exist, a NOT_FOUND error is returned.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.Engine engine = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the engine field is set.
   */
  boolean hasEngine();
  /**
   *
   *
   * <pre>
   * Required. The [Engine][google.cloud.discoveryengine.v1alpha.Engine] to
   * update.
   *
   * If the caller does not have permission to update the
   * [Engine][google.cloud.discoveryengine.v1alpha.Engine], regardless of
   * whether or not it exists, a PERMISSION_DENIED error is returned.
   *
   * If the [Engine][google.cloud.discoveryengine.v1alpha.Engine] to update does
   * not exist, a NOT_FOUND error is returned.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.Engine engine = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The engine.
   */
  com.google.cloud.discoveryengine.v1alpha.Engine getEngine();
  /**
   *
   *
   * <pre>
   * Required. The [Engine][google.cloud.discoveryengine.v1alpha.Engine] to
   * update.
   *
   * If the caller does not have permission to update the
   * [Engine][google.cloud.discoveryengine.v1alpha.Engine], regardless of
   * whether or not it exists, a PERMISSION_DENIED error is returned.
   *
   * If the [Engine][google.cloud.discoveryengine.v1alpha.Engine] to update does
   * not exist, a NOT_FOUND error is returned.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.Engine engine = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.discoveryengine.v1alpha.EngineOrBuilder getEngineOrBuilder();

  /**
   *
   *
   * <pre>
   * Indicates which fields in the provided
   * [Engine][google.cloud.discoveryengine.v1alpha.Engine] to update.
   *
   * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
   * is returned.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Indicates which fields in the provided
   * [Engine][google.cloud.discoveryengine.v1alpha.Engine] to update.
   *
   * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
   * is returned.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Indicates which fields in the provided
   * [Engine][google.cloud.discoveryengine.v1alpha.Engine] to update.
   *
   * If an unsupported or unknown field is provided, an INVALID_ARGUMENT error
   * is returned.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
