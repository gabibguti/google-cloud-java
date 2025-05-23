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
// source: google/cloud/resourcesettings/v1/resource_settings.proto

package com.google.cloud.resourcesettings.v1;

public interface GetSettingRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.resourcesettings.v1.GetSettingRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the setting to get. See [Setting][google.cloud.resourcesettings.v1.Setting] for naming
   * requirements.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The name of the setting to get. See [Setting][google.cloud.resourcesettings.v1.Setting] for naming
   * requirements.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The SettingView for this request.
   * </pre>
   *
   * <code>.google.cloud.resourcesettings.v1.SettingView view = 2;</code>
   *
   * @return The enum numeric value on the wire for view.
   */
  int getViewValue();
  /**
   *
   *
   * <pre>
   * The SettingView for this request.
   * </pre>
   *
   * <code>.google.cloud.resourcesettings.v1.SettingView view = 2;</code>
   *
   * @return The view.
   */
  com.google.cloud.resourcesettings.v1.SettingView getView();
}
