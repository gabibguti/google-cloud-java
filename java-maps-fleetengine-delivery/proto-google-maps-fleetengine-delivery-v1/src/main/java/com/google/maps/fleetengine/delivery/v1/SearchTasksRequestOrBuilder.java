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

@java.lang.Deprecated
public interface SearchTasksRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:maps.fleetengine.delivery.v1.SearchTasksRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The standard Delivery API request header.
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
   * Required. Must be in the format `providers/{provider}`.
   * The provider must be the Google Cloud Project ID. For example,
   * `sample-cloud-project`.
   * </pre>
   *
   * <code>string parent = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. Must be in the format `providers/{provider}`.
   * The provider must be the Google Cloud Project ID. For example,
   * `sample-cloud-project`.
   * </pre>
   *
   * <code>string parent = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The identifier of the set of related Tasks being requested.
   * Tracking IDs are subject to the following restrictions:
   *
   * * Must be a valid Unicode string.
   * * Limited to a maximum length of 64 characters.
   * * Normalized according to [Unicode Normalization Form C]
   * (http://www.unicode.org/reports/tr15/).
   * * May not contain any of the following ASCII characters: '/', ':', '?',
   * ',', or '#'.
   * </pre>
   *
   * <code>string tracking_id = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The trackingId.
   */
  java.lang.String getTrackingId();
  /**
   *
   *
   * <pre>
   * Required. The identifier of the set of related Tasks being requested.
   * Tracking IDs are subject to the following restrictions:
   *
   * * Must be a valid Unicode string.
   * * Limited to a maximum length of 64 characters.
   * * Normalized according to [Unicode Normalization Form C]
   * (http://www.unicode.org/reports/tr15/).
   * * May not contain any of the following ASCII characters: '/', ':', '?',
   * ',', or '#'.
   * </pre>
   *
   * <code>string tracking_id = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for trackingId.
   */
  com.google.protobuf.ByteString getTrackingIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. The maximum number of Tasks to return. The service may return
   * fewer than this value. If you don't specify this value, then the server
   * determines the number of results to return.
   * </pre>
   *
   * <code>int32 page_size = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. A page token, received from a previous `SearchTasks` call. You
   * must provide this value to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to `SearchTasks` must match
   * the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. A page token, received from a previous `SearchTasks` call. You
   * must provide this value to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to `SearchTasks` must match
   * the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
