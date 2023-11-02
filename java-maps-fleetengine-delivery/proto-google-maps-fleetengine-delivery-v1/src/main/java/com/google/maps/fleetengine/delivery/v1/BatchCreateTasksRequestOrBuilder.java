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
// source: google/maps/fleetengine/delivery/v1/delivery_api.proto

package google.maps.fleetengine.delivery.v1;

public interface BatchCreateTasksRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:maps.fleetengine.delivery.v1.BatchCreateTasksRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The standard Delivery API request header.
   * Note: If you set this field, then the header field in the
   * `CreateTaskRequest` messages must either be empty, or it must match this
   * field.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.delivery.v1.DeliveryRequestHeader header = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   *
   *
   * <pre>
   * Optional. The standard Delivery API request header.
   * Note: If you set this field, then the header field in the
   * `CreateTaskRequest` messages must either be empty, or it must match this
   * field.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.delivery.v1.DeliveryRequestHeader header = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The header.
   */
  google.maps.fleetengine.delivery.v1.DeliveryRequestHeader getHeader();
  /**
   *
   *
   * <pre>
   * Optional. The standard Delivery API request header.
   * Note: If you set this field, then the header field in the
   * `CreateTaskRequest` messages must either be empty, or it must match this
   * field.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.delivery.v1.DeliveryRequestHeader header = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  google.maps.fleetengine.delivery.v1.DeliveryRequestHeaderOrBuilder getHeaderOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The parent resource shared by all tasks. This value must be in
   * the format `providers/{provider}`. The `provider` must be the Google Cloud
   * Project ID. For example, `sample-cloud-project`. The parent field in the
   * `CreateTaskRequest` messages must either  be empty, or it must match this
   * field.
   * </pre>
   *
   * <code>
   * string parent = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent resource shared by all tasks. This value must be in
   * the format `providers/{provider}`. The `provider` must be the Google Cloud
   * Project ID. For example, `sample-cloud-project`. The parent field in the
   * `CreateTaskRequest` messages must either  be empty, or it must match this
   * field.
   * </pre>
   *
   * <code>
   * string parent = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The request message that specifies the resources to create.
   * Note: You can create a maximum of 500 tasks in a batch.
   * </pre>
   *
   * <code>
   * repeated .maps.fleetengine.delivery.v1.CreateTaskRequest requests = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<google.maps.fleetengine.delivery.v1.CreateTaskRequest> getRequestsList();
  /**
   *
   *
   * <pre>
   * Required. The request message that specifies the resources to create.
   * Note: You can create a maximum of 500 tasks in a batch.
   * </pre>
   *
   * <code>
   * repeated .maps.fleetengine.delivery.v1.CreateTaskRequest requests = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  google.maps.fleetengine.delivery.v1.CreateTaskRequest getRequests(int index);
  /**
   *
   *
   * <pre>
   * Required. The request message that specifies the resources to create.
   * Note: You can create a maximum of 500 tasks in a batch.
   * </pre>
   *
   * <code>
   * repeated .maps.fleetengine.delivery.v1.CreateTaskRequest requests = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getRequestsCount();
  /**
   *
   *
   * <pre>
   * Required. The request message that specifies the resources to create.
   * Note: You can create a maximum of 500 tasks in a batch.
   * </pre>
   *
   * <code>
   * repeated .maps.fleetengine.delivery.v1.CreateTaskRequest requests = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends google.maps.fleetengine.delivery.v1.CreateTaskRequestOrBuilder>
      getRequestsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. The request message that specifies the resources to create.
   * Note: You can create a maximum of 500 tasks in a batch.
   * </pre>
   *
   * <code>
   * repeated .maps.fleetengine.delivery.v1.CreateTaskRequest requests = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  google.maps.fleetengine.delivery.v1.CreateTaskRequestOrBuilder getRequestsOrBuilder(int index);
}
