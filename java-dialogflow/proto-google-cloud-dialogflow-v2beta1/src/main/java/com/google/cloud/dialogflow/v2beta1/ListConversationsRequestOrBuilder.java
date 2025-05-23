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
// source: google/cloud/dialogflow/v2beta1/conversation.proto

package com.google.cloud.dialogflow.v2beta1;

public interface ListConversationsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.ListConversationsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The project from which to list all conversation.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The project from which to list all conversation.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional. The maximum number of items to return in a single page. By
   * default 100 and at most 1000.
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
   * Optional. The next_page_token value returned from a previous list request.
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
   * Optional. The next_page_token value returned from a previous list request.
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
   * A filter expression that filters conversations listed in the response. In
   * general, the expression must specify the field name, a comparison operator,
   * and the value to use for filtering:
   * &lt;ul&gt;
   *   &lt;li&gt;The value must be a string, a number, or a boolean.&lt;/li&gt;
   *   &lt;li&gt;The comparison operator must be either `=`,`!=`, `&gt;`, or `&lt;`.&lt;/li&gt;
   *   &lt;li&gt;To filter on multiple expressions, separate the
   *       expressions with `AND` or `OR` (omitting both implies `AND`).&lt;/li&gt;
   *   &lt;li&gt;For clarity, expressions can be enclosed in parentheses.&lt;/li&gt;
   * &lt;/ul&gt;
   * Only `lifecycle_state` can be filtered on in this way. For example,
   * the following expression only returns `COMPLETED` conversations:
   *
   * `lifecycle_state = "COMPLETED"`
   *
   * For more information about filtering, see
   * [API Filtering](https://aip.dev/160).
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
   * A filter expression that filters conversations listed in the response. In
   * general, the expression must specify the field name, a comparison operator,
   * and the value to use for filtering:
   * &lt;ul&gt;
   *   &lt;li&gt;The value must be a string, a number, or a boolean.&lt;/li&gt;
   *   &lt;li&gt;The comparison operator must be either `=`,`!=`, `&gt;`, or `&lt;`.&lt;/li&gt;
   *   &lt;li&gt;To filter on multiple expressions, separate the
   *       expressions with `AND` or `OR` (omitting both implies `AND`).&lt;/li&gt;
   *   &lt;li&gt;For clarity, expressions can be enclosed in parentheses.&lt;/li&gt;
   * &lt;/ul&gt;
   * Only `lifecycle_state` can be filtered on in this way. For example,
   * the following expression only returns `COMPLETED` conversations:
   *
   * `lifecycle_state = "COMPLETED"`
   *
   * For more information about filtering, see
   * [API Filtering](https://aip.dev/160).
   * </pre>
   *
   * <code>string filter = 4;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();
}
