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
// source: google/cloud/aiplatform/v1beta1/persistent_resource.proto

package com.google.cloud.aiplatform.v1beta1;

public interface RaySpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.RaySpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Default image for user to choose a preferred ML framework
   * (for example, TensorFlow or Pytorch) by choosing from [Vertex prebuilt
   * images](https://cloud.google.com/vertex-ai/docs/training/pre-built-containers).
   * Either this or the resource_pool_images is required. Use this field if
   * you need all the resource pools to have the same Ray image. Otherwise, use
   * the {&#64;code resource_pool_images} field.
   * </pre>
   *
   * <code>string image_uri = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The imageUri.
   */
  java.lang.String getImageUri();
  /**
   *
   *
   * <pre>
   * Optional. Default image for user to choose a preferred ML framework
   * (for example, TensorFlow or Pytorch) by choosing from [Vertex prebuilt
   * images](https://cloud.google.com/vertex-ai/docs/training/pre-built-containers).
   * Either this or the resource_pool_images is required. Use this field if
   * you need all the resource pools to have the same Ray image. Otherwise, use
   * the {&#64;code resource_pool_images} field.
   * </pre>
   *
   * <code>string image_uri = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for imageUri.
   */
  com.google.protobuf.ByteString getImageUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. Required if image_uri isn't set. A map of resource_pool_id to
   * prebuild Ray image if user need to use different images for different
   * head/worker pools. This map needs to cover all the resource pool ids.
   * Example:
   * {
   *   "ray_head_node_pool": "head image"
   *   "ray_worker_node_pool1": "worker image"
   *   "ray_worker_node_pool2": "another worker image"
   * }
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; resource_pool_images = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getResourcePoolImagesCount();
  /**
   *
   *
   * <pre>
   * Optional. Required if image_uri isn't set. A map of resource_pool_id to
   * prebuild Ray image if user need to use different images for different
   * head/worker pools. This map needs to cover all the resource pool ids.
   * Example:
   * {
   *   "ray_head_node_pool": "head image"
   *   "ray_worker_node_pool1": "worker image"
   *   "ray_worker_node_pool2": "another worker image"
   * }
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; resource_pool_images = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsResourcePoolImages(java.lang.String key);
  /** Use {@link #getResourcePoolImagesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getResourcePoolImages();
  /**
   *
   *
   * <pre>
   * Optional. Required if image_uri isn't set. A map of resource_pool_id to
   * prebuild Ray image if user need to use different images for different
   * head/worker pools. This map needs to cover all the resource pool ids.
   * Example:
   * {
   *   "ray_head_node_pool": "head image"
   *   "ray_worker_node_pool1": "worker image"
   *   "ray_worker_node_pool2": "another worker image"
   * }
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; resource_pool_images = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getResourcePoolImagesMap();
  /**
   *
   *
   * <pre>
   * Optional. Required if image_uri isn't set. A map of resource_pool_id to
   * prebuild Ray image if user need to use different images for different
   * head/worker pools. This map needs to cover all the resource pool ids.
   * Example:
   * {
   *   "ray_head_node_pool": "head image"
   *   "ray_worker_node_pool1": "worker image"
   *   "ray_worker_node_pool2": "another worker image"
   * }
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; resource_pool_images = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  /* nullable */
  java.lang.String getResourcePoolImagesOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. Required if image_uri isn't set. A map of resource_pool_id to
   * prebuild Ray image if user need to use different images for different
   * head/worker pools. This map needs to cover all the resource pool ids.
   * Example:
   * {
   *   "ray_head_node_pool": "head image"
   *   "ray_worker_node_pool1": "worker image"
   *   "ray_worker_node_pool2": "another worker image"
   * }
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; resource_pool_images = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.lang.String getResourcePoolImagesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. This will be used to indicate which resource pool will serve as
   * the Ray head node(the first node within that pool). Will use the machine
   * from the first workerpool as the head node by default if this field isn't
   * set.
   * </pre>
   *
   * <code>string head_node_resource_pool_id = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The headNodeResourcePoolId.
   */
  java.lang.String getHeadNodeResourcePoolId();
  /**
   *
   *
   * <pre>
   * Optional. This will be used to indicate which resource pool will serve as
   * the Ray head node(the first node within that pool). Will use the machine
   * from the first workerpool as the head node by default if this field isn't
   * set.
   * </pre>
   *
   * <code>string head_node_resource_pool_id = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for headNodeResourcePoolId.
   */
  com.google.protobuf.ByteString getHeadNodeResourcePoolIdBytes();
}
