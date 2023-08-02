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
// source: google/cloud/commerce/consumer/procurement/v1/procurement_service.proto

package com.google.cloud.commerce.consumer.procurement.v1;

public interface ListOrdersRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.commerce.consumer.procurement.v1.ListOrdersRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource to query for orders.
   * This field has the form `billingAccounts/{billing-account-id}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent resource to query for orders.
   * This field has the form `billingAccounts/{billing-account-id}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The maximum number of entries requested.
   * The default page size is 25 and the maximum page size is 200.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * The token for fetching the next page.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * The token for fetching the next page.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Filter that you can use to limit the list request.
   *
   * A query string that can match a selected set of attributes
   * with string values. For example, `display_name=abc`.
   * Supported query attributes are
   *
   * * `display_name`
   *
   * If the query contains special characters other than letters,
   * underscore, or digits, the phrase must be quoted with double quotes. For
   * example, `display_name="foo:bar"`, where the display name needs to be
   * quoted because it contains special character colon.
   *
   * Queries can be combined with `OR`, and `NOT` to form more complex queries.
   * You can also group them to force a desired evaluation order.
   * For example, `display_name=abc OR display_name=def`.
   * </pre>
   *
   * <code>string filter = 4;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Filter that you can use to limit the list request.
   *
   * A query string that can match a selected set of attributes
   * with string values. For example, `display_name=abc`.
   * Supported query attributes are
   *
   * * `display_name`
   *
   * If the query contains special characters other than letters,
   * underscore, or digits, the phrase must be quoted with double quotes. For
   * example, `display_name="foo:bar"`, where the display name needs to be
   * quoted because it contains special character colon.
   *
   * Queries can be combined with `OR`, and `NOT` to form more complex queries.
   * You can also group them to force a desired evaluation order.
   * For example, `display_name=abc OR display_name=def`.
   * </pre>
   *
   * <code>string filter = 4;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();
}
