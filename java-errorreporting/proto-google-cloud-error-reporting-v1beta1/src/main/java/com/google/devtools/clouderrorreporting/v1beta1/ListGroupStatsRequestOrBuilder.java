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
// source: google/devtools/clouderrorreporting/v1beta1/error_stats_service.proto

package com.google.devtools.clouderrorreporting.v1beta1;

public interface ListGroupStatsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.clouderrorreporting.v1beta1.ListGroupStatsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Google Cloud Platform project. Written
   * as `projects/{projectID}` or `projects/{projectNumber}`, where `{projectID}`
   * and `{projectNumber}` can be found in the
   * [Google Cloud Console](https://support.google.com/cloud/answer/6158840).
   *
   * Examples: `projects/my-project-123`, `projects/5551234`.
   * </pre>
   *
   * <code>
   * string project_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The projectName.
   */
  java.lang.String getProjectName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Google Cloud Platform project. Written
   * as `projects/{projectID}` or `projects/{projectNumber}`, where `{projectID}`
   * and `{projectNumber}` can be found in the
   * [Google Cloud Console](https://support.google.com/cloud/answer/6158840).
   *
   * Examples: `projects/my-project-123`, `projects/5551234`.
   * </pre>
   *
   * <code>
   * string project_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for projectName.
   */
  com.google.protobuf.ByteString getProjectNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. List all &lt;code&gt;ErrorGroupStats&lt;/code&gt; with these IDs.
   * </pre>
   *
   * <code>repeated string group_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the groupId.
   */
  java.util.List<java.lang.String> getGroupIdList();
  /**
   *
   *
   * <pre>
   * Optional. List all &lt;code&gt;ErrorGroupStats&lt;/code&gt; with these IDs.
   * </pre>
   *
   * <code>repeated string group_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of groupId.
   */
  int getGroupIdCount();
  /**
   *
   *
   * <pre>
   * Optional. List all &lt;code&gt;ErrorGroupStats&lt;/code&gt; with these IDs.
   * </pre>
   *
   * <code>repeated string group_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The groupId at the given index.
   */
  java.lang.String getGroupId(int index);
  /**
   *
   *
   * <pre>
   * Optional. List all &lt;code&gt;ErrorGroupStats&lt;/code&gt; with these IDs.
   * </pre>
   *
   * <code>repeated string group_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the groupId at the given index.
   */
  com.google.protobuf.ByteString getGroupIdBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. List only &lt;code&gt;ErrorGroupStats&lt;/code&gt; which belong to a service
   * context that matches the filter.
   * Data for all service contexts is returned if this field is not specified.
   * </pre>
   *
   * <code>
   * .google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter service_filter = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the serviceFilter field is set.
   */
  boolean hasServiceFilter();
  /**
   *
   *
   * <pre>
   * Optional. List only &lt;code&gt;ErrorGroupStats&lt;/code&gt; which belong to a service
   * context that matches the filter.
   * Data for all service contexts is returned if this field is not specified.
   * </pre>
   *
   * <code>
   * .google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter service_filter = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The serviceFilter.
   */
  com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter getServiceFilter();
  /**
   *
   *
   * <pre>
   * Optional. List only &lt;code&gt;ErrorGroupStats&lt;/code&gt; which belong to a service
   * context that matches the filter.
   * Data for all service contexts is returned if this field is not specified.
   * </pre>
   *
   * <code>
   * .google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter service_filter = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilterOrBuilder
      getServiceFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. List data for the given time range.
   * If not set, a default time range is used. The field
   * &lt;code&gt;time_range_begin&lt;/code&gt; in the response will specify the beginning
   * of this time range.
   * Only &lt;code&gt;ErrorGroupStats&lt;/code&gt; with a non-zero count in the given time
   * range are returned, unless the request contains an explicit
   * &lt;code&gt;group_id&lt;/code&gt; list. If a &lt;code&gt;group_id&lt;/code&gt; list is given, also
   * &lt;code&gt;ErrorGroupStats&lt;/code&gt; with zero occurrences are returned.
   * </pre>
   *
   * <code>
   * .google.devtools.clouderrorreporting.v1beta1.QueryTimeRange time_range = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the timeRange field is set.
   */
  boolean hasTimeRange();
  /**
   *
   *
   * <pre>
   * Optional. List data for the given time range.
   * If not set, a default time range is used. The field
   * &lt;code&gt;time_range_begin&lt;/code&gt; in the response will specify the beginning
   * of this time range.
   * Only &lt;code&gt;ErrorGroupStats&lt;/code&gt; with a non-zero count in the given time
   * range are returned, unless the request contains an explicit
   * &lt;code&gt;group_id&lt;/code&gt; list. If a &lt;code&gt;group_id&lt;/code&gt; list is given, also
   * &lt;code&gt;ErrorGroupStats&lt;/code&gt; with zero occurrences are returned.
   * </pre>
   *
   * <code>
   * .google.devtools.clouderrorreporting.v1beta1.QueryTimeRange time_range = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The timeRange.
   */
  com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange getTimeRange();
  /**
   *
   *
   * <pre>
   * Optional. List data for the given time range.
   * If not set, a default time range is used. The field
   * &lt;code&gt;time_range_begin&lt;/code&gt; in the response will specify the beginning
   * of this time range.
   * Only &lt;code&gt;ErrorGroupStats&lt;/code&gt; with a non-zero count in the given time
   * range are returned, unless the request contains an explicit
   * &lt;code&gt;group_id&lt;/code&gt; list. If a &lt;code&gt;group_id&lt;/code&gt; list is given, also
   * &lt;code&gt;ErrorGroupStats&lt;/code&gt; with zero occurrences are returned.
   * </pre>
   *
   * <code>
   * .google.devtools.clouderrorreporting.v1beta1.QueryTimeRange time_range = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRangeOrBuilder getTimeRangeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The preferred duration for a single returned `TimedCount`.
   * If not set, no timed counts are returned.
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration timed_count_duration = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the timedCountDuration field is set.
   */
  boolean hasTimedCountDuration();
  /**
   *
   *
   * <pre>
   * Optional. The preferred duration for a single returned `TimedCount`.
   * If not set, no timed counts are returned.
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration timed_count_duration = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The timedCountDuration.
   */
  com.google.protobuf.Duration getTimedCountDuration();
  /**
   *
   *
   * <pre>
   * Optional. The preferred duration for a single returned `TimedCount`.
   * If not set, no timed counts are returned.
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration timed_count_duration = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.DurationOrBuilder getTimedCountDurationOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The alignment of the timed counts to be returned.
   * Default is `ALIGNMENT_EQUAL_AT_END`.
   * </pre>
   *
   * <code>
   * .google.devtools.clouderrorreporting.v1beta1.TimedCountAlignment alignment = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for alignment.
   */
  int getAlignmentValue();
  /**
   *
   *
   * <pre>
   * Optional. The alignment of the timed counts to be returned.
   * Default is `ALIGNMENT_EQUAL_AT_END`.
   * </pre>
   *
   * <code>
   * .google.devtools.clouderrorreporting.v1beta1.TimedCountAlignment alignment = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The alignment.
   */
  com.google.devtools.clouderrorreporting.v1beta1.TimedCountAlignment getAlignment();

  /**
   *
   *
   * <pre>
   * Optional. Time where the timed counts shall be aligned if rounded
   * alignment is chosen. Default is 00:00 UTC.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp alignment_time = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the alignmentTime field is set.
   */
  boolean hasAlignmentTime();
  /**
   *
   *
   * <pre>
   * Optional. Time where the timed counts shall be aligned if rounded
   * alignment is chosen. Default is 00:00 UTC.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp alignment_time = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The alignmentTime.
   */
  com.google.protobuf.Timestamp getAlignmentTime();
  /**
   *
   *
   * <pre>
   * Optional. Time where the timed counts shall be aligned if rounded
   * alignment is chosen. Default is 00:00 UTC.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp alignment_time = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getAlignmentTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The sort order in which the results are returned.
   * Default is `COUNT_DESC`.
   * </pre>
   *
   * <code>
   * .google.devtools.clouderrorreporting.v1beta1.ErrorGroupOrder order = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for order.
   */
  int getOrderValue();
  /**
   *
   *
   * <pre>
   * Optional. The sort order in which the results are returned.
   * Default is `COUNT_DESC`.
   * </pre>
   *
   * <code>
   * .google.devtools.clouderrorreporting.v1beta1.ErrorGroupOrder order = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The order.
   */
  com.google.devtools.clouderrorreporting.v1beta1.ErrorGroupOrder getOrder();

  /**
   *
   *
   * <pre>
   * Optional. The maximum number of results to return per response.
   * Default is 20.
   * </pre>
   *
   * <code>int32 page_size = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. A `next_page_token` provided by a previous response. To view
   * additional results, pass this token along with the identical query
   * parameters as the first request.
   * </pre>
   *
   * <code>string page_token = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. A `next_page_token` provided by a previous response. To view
   * additional results, pass this token along with the identical query
   * parameters as the first request.
   * </pre>
   *
   * <code>string page_token = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
