/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.analytics.data.v1alpha;

import com.google.analytics.data.v1alpha.stub.AlphaAnalyticsDataStub;
import com.google.analytics.data.v1alpha.stub.AlphaAnalyticsDataStubSettings;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.httpjson.longrunning.OperationsClient;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.longrunning.Operation;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Google Analytics reporting data service.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (AlphaAnalyticsDataClient alphaAnalyticsDataClient = AlphaAnalyticsDataClient.create()) {
 *   RunFunnelReportRequest request =
 *       RunFunnelReportRequest.newBuilder()
 *           .setProperty("property-993141291")
 *           .addAllDateRanges(new ArrayList<DateRange>())
 *           .setFunnel(Funnel.newBuilder().build())
 *           .setFunnelBreakdown(FunnelBreakdown.newBuilder().build())
 *           .setFunnelNextAction(FunnelNextAction.newBuilder().build())
 *           .addAllSegments(new ArrayList<Segment>())
 *           .setLimit(102976443)
 *           .setDimensionFilter(FilterExpression.newBuilder().build())
 *           .setReturnPropertyQuota(true)
 *           .build();
 *   RunFunnelReportResponse response = alphaAnalyticsDataClient.runFunnelReport(request);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the AlphaAnalyticsDataClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of AlphaAnalyticsDataSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * AlphaAnalyticsDataSettings alphaAnalyticsDataSettings =
 *     AlphaAnalyticsDataSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AlphaAnalyticsDataClient alphaAnalyticsDataClient =
 *     AlphaAnalyticsDataClient.create(alphaAnalyticsDataSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * AlphaAnalyticsDataSettings alphaAnalyticsDataSettings =
 *     AlphaAnalyticsDataSettings.newBuilder().setEndpoint(myEndpoint).build();
 * AlphaAnalyticsDataClient alphaAnalyticsDataClient =
 *     AlphaAnalyticsDataClient.create(alphaAnalyticsDataSettings);
 * }</pre>
 *
 * <p>To use REST (HTTP1.1/JSON) transport (instead of gRPC) for sending and receiving requests over
 * the wire:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * AlphaAnalyticsDataSettings alphaAnalyticsDataSettings =
 *     AlphaAnalyticsDataSettings.newHttpJsonBuilder().build();
 * AlphaAnalyticsDataClient alphaAnalyticsDataClient =
 *     AlphaAnalyticsDataClient.create(alphaAnalyticsDataSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class AlphaAnalyticsDataClient implements BackgroundResource {
  private final AlphaAnalyticsDataSettings settings;
  private final AlphaAnalyticsDataStub stub;
  private final OperationsClient httpJsonOperationsClient;
  private final com.google.longrunning.OperationsClient operationsClient;

  /** Constructs an instance of AlphaAnalyticsDataClient with default settings. */
  public static final AlphaAnalyticsDataClient create() throws IOException {
    return create(AlphaAnalyticsDataSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AlphaAnalyticsDataClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final AlphaAnalyticsDataClient create(AlphaAnalyticsDataSettings settings)
      throws IOException {
    return new AlphaAnalyticsDataClient(settings);
  }

  /**
   * Constructs an instance of AlphaAnalyticsDataClient, using the given stub for making calls. This
   * is for advanced usage - prefer using create(AlphaAnalyticsDataSettings).
   */
  public static final AlphaAnalyticsDataClient create(AlphaAnalyticsDataStub stub) {
    return new AlphaAnalyticsDataClient(stub);
  }

  /**
   * Constructs an instance of AlphaAnalyticsDataClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected AlphaAnalyticsDataClient(AlphaAnalyticsDataSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((AlphaAnalyticsDataStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient =
        com.google.longrunning.OperationsClient.create(this.stub.getOperationsStub());
    this.httpJsonOperationsClient = OperationsClient.create(this.stub.getHttpJsonOperationsStub());
  }

  protected AlphaAnalyticsDataClient(AlphaAnalyticsDataStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient =
        com.google.longrunning.OperationsClient.create(this.stub.getOperationsStub());
    this.httpJsonOperationsClient = OperationsClient.create(this.stub.getHttpJsonOperationsStub());
  }

  public final AlphaAnalyticsDataSettings getSettings() {
    return settings;
  }

  public AlphaAnalyticsDataStub getStub() {
    return stub;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  public final com.google.longrunning.OperationsClient getOperationsClient() {
    return operationsClient;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  @BetaApi
  public final OperationsClient getHttpJsonOperationsClient() {
    return httpJsonOperationsClient;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a customized funnel report of your Google Analytics event data. The data returned from
   * the API is as a table with columns for the requested dimensions and metrics.
   *
   * <p>Funnel exploration lets you visualize the steps your users take to complete a task and
   * quickly see how well they are succeeding or failing at each step. For example, how do prospects
   * become shoppers and then become buyers? How do one time buyers become repeat buyers? With this
   * information, you can improve inefficient or abandoned customer journeys. To learn more, see
   * [GA4 Funnel Explorations](https://support.google.com/analytics/answer/9327974).
   *
   * <p>This method is introduced at alpha stability with the intention of gathering feedback on
   * syntax and capabilities before entering beta. To give your feedback on this API, complete the
   * [Google Analytics Data API Funnel Reporting
   * Feedback](https://docs.google.com/forms/d/e/1FAIpQLSdwOlQDJAUoBiIgUZZ3S_Lwi8gr7Bb0k1jhvc-DEg7Rol3UjA/viewform).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AlphaAnalyticsDataClient alphaAnalyticsDataClient = AlphaAnalyticsDataClient.create()) {
   *   RunFunnelReportRequest request =
   *       RunFunnelReportRequest.newBuilder()
   *           .setProperty("property-993141291")
   *           .addAllDateRanges(new ArrayList<DateRange>())
   *           .setFunnel(Funnel.newBuilder().build())
   *           .setFunnelBreakdown(FunnelBreakdown.newBuilder().build())
   *           .setFunnelNextAction(FunnelNextAction.newBuilder().build())
   *           .addAllSegments(new ArrayList<Segment>())
   *           .setLimit(102976443)
   *           .setDimensionFilter(FilterExpression.newBuilder().build())
   *           .setReturnPropertyQuota(true)
   *           .build();
   *   RunFunnelReportResponse response = alphaAnalyticsDataClient.runFunnelReport(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final RunFunnelReportResponse runFunnelReport(RunFunnelReportRequest request) {
    return runFunnelReportCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a customized funnel report of your Google Analytics event data. The data returned from
   * the API is as a table with columns for the requested dimensions and metrics.
   *
   * <p>Funnel exploration lets you visualize the steps your users take to complete a task and
   * quickly see how well they are succeeding or failing at each step. For example, how do prospects
   * become shoppers and then become buyers? How do one time buyers become repeat buyers? With this
   * information, you can improve inefficient or abandoned customer journeys. To learn more, see
   * [GA4 Funnel Explorations](https://support.google.com/analytics/answer/9327974).
   *
   * <p>This method is introduced at alpha stability with the intention of gathering feedback on
   * syntax and capabilities before entering beta. To give your feedback on this API, complete the
   * [Google Analytics Data API Funnel Reporting
   * Feedback](https://docs.google.com/forms/d/e/1FAIpQLSdwOlQDJAUoBiIgUZZ3S_Lwi8gr7Bb0k1jhvc-DEg7Rol3UjA/viewform).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AlphaAnalyticsDataClient alphaAnalyticsDataClient = AlphaAnalyticsDataClient.create()) {
   *   RunFunnelReportRequest request =
   *       RunFunnelReportRequest.newBuilder()
   *           .setProperty("property-993141291")
   *           .addAllDateRanges(new ArrayList<DateRange>())
   *           .setFunnel(Funnel.newBuilder().build())
   *           .setFunnelBreakdown(FunnelBreakdown.newBuilder().build())
   *           .setFunnelNextAction(FunnelNextAction.newBuilder().build())
   *           .addAllSegments(new ArrayList<Segment>())
   *           .setLimit(102976443)
   *           .setDimensionFilter(FilterExpression.newBuilder().build())
   *           .setReturnPropertyQuota(true)
   *           .build();
   *   ApiFuture<RunFunnelReportResponse> future =
   *       alphaAnalyticsDataClient.runFunnelReportCallable().futureCall(request);
   *   // Do something.
   *   RunFunnelReportResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<RunFunnelReportRequest, RunFunnelReportResponse>
      runFunnelReportCallable() {
    return stub.runFunnelReportCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an audience list for later retrieval. This method quickly returns the audience list's
   * resource name and initiates a long running asynchronous request to form an audience list. To
   * list the users in an audience list, first create the audience list through this method and then
   * send the audience resource name to the `QueryAudienceList` method.
   *
   * <p>See [Creating an Audience
   * List](https://developers.google.com/analytics/devguides/reporting/data/v1/audience-list-basics)
   * for an introduction to Audience Lists with examples.
   *
   * <p>An audience list is a snapshot of the users currently in the audience at the time of
   * audience list creation. Creating audience lists for one audience on different days will return
   * different results as users enter and exit the audience.
   *
   * <p>Audiences in Google Analytics 4 allow you to segment your users in the ways that are
   * important to your business. To learn more, see
   * https://support.google.com/analytics/answer/9267572. Audience lists contain the users in each
   * audience.
   *
   * <p>This method is introduced at alpha stability with the intention of gathering feedback on
   * syntax and capabilities before entering beta. To give your feedback on this API, complete the
   * [Google Analytics Audience Export API Feedback](https://forms.gle/EeA5u5LW6PEggtCEA) form.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AlphaAnalyticsDataClient alphaAnalyticsDataClient = AlphaAnalyticsDataClient.create()) {
   *   PropertyName parent = PropertyName.of("[PROPERTY]");
   *   AudienceList audienceList = AudienceList.newBuilder().build();
   *   AudienceList response =
   *       alphaAnalyticsDataClient.createAudienceListAsync(parent, audienceList).get();
   * }
   * }</pre>
   *
   * @param parent Required. The parent resource where this audience list will be created. Format:
   *     `properties/{property}`
   * @param audienceList Required. The audience list to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<AudienceList, AudienceListMetadata> createAudienceListAsync(
      PropertyName parent, AudienceList audienceList) {
    CreateAudienceListRequest request =
        CreateAudienceListRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setAudienceList(audienceList)
            .build();
    return createAudienceListAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an audience list for later retrieval. This method quickly returns the audience list's
   * resource name and initiates a long running asynchronous request to form an audience list. To
   * list the users in an audience list, first create the audience list through this method and then
   * send the audience resource name to the `QueryAudienceList` method.
   *
   * <p>See [Creating an Audience
   * List](https://developers.google.com/analytics/devguides/reporting/data/v1/audience-list-basics)
   * for an introduction to Audience Lists with examples.
   *
   * <p>An audience list is a snapshot of the users currently in the audience at the time of
   * audience list creation. Creating audience lists for one audience on different days will return
   * different results as users enter and exit the audience.
   *
   * <p>Audiences in Google Analytics 4 allow you to segment your users in the ways that are
   * important to your business. To learn more, see
   * https://support.google.com/analytics/answer/9267572. Audience lists contain the users in each
   * audience.
   *
   * <p>This method is introduced at alpha stability with the intention of gathering feedback on
   * syntax and capabilities before entering beta. To give your feedback on this API, complete the
   * [Google Analytics Audience Export API Feedback](https://forms.gle/EeA5u5LW6PEggtCEA) form.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AlphaAnalyticsDataClient alphaAnalyticsDataClient = AlphaAnalyticsDataClient.create()) {
   *   String parent = PropertyName.of("[PROPERTY]").toString();
   *   AudienceList audienceList = AudienceList.newBuilder().build();
   *   AudienceList response =
   *       alphaAnalyticsDataClient.createAudienceListAsync(parent, audienceList).get();
   * }
   * }</pre>
   *
   * @param parent Required. The parent resource where this audience list will be created. Format:
   *     `properties/{property}`
   * @param audienceList Required. The audience list to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<AudienceList, AudienceListMetadata> createAudienceListAsync(
      String parent, AudienceList audienceList) {
    CreateAudienceListRequest request =
        CreateAudienceListRequest.newBuilder()
            .setParent(parent)
            .setAudienceList(audienceList)
            .build();
    return createAudienceListAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an audience list for later retrieval. This method quickly returns the audience list's
   * resource name and initiates a long running asynchronous request to form an audience list. To
   * list the users in an audience list, first create the audience list through this method and then
   * send the audience resource name to the `QueryAudienceList` method.
   *
   * <p>See [Creating an Audience
   * List](https://developers.google.com/analytics/devguides/reporting/data/v1/audience-list-basics)
   * for an introduction to Audience Lists with examples.
   *
   * <p>An audience list is a snapshot of the users currently in the audience at the time of
   * audience list creation. Creating audience lists for one audience on different days will return
   * different results as users enter and exit the audience.
   *
   * <p>Audiences in Google Analytics 4 allow you to segment your users in the ways that are
   * important to your business. To learn more, see
   * https://support.google.com/analytics/answer/9267572. Audience lists contain the users in each
   * audience.
   *
   * <p>This method is introduced at alpha stability with the intention of gathering feedback on
   * syntax and capabilities before entering beta. To give your feedback on this API, complete the
   * [Google Analytics Audience Export API Feedback](https://forms.gle/EeA5u5LW6PEggtCEA) form.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AlphaAnalyticsDataClient alphaAnalyticsDataClient = AlphaAnalyticsDataClient.create()) {
   *   CreateAudienceListRequest request =
   *       CreateAudienceListRequest.newBuilder()
   *           .setParent(PropertyName.of("[PROPERTY]").toString())
   *           .setAudienceList(AudienceList.newBuilder().build())
   *           .build();
   *   AudienceList response = alphaAnalyticsDataClient.createAudienceListAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<AudienceList, AudienceListMetadata> createAudienceListAsync(
      CreateAudienceListRequest request) {
    return createAudienceListOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an audience list for later retrieval. This method quickly returns the audience list's
   * resource name and initiates a long running asynchronous request to form an audience list. To
   * list the users in an audience list, first create the audience list through this method and then
   * send the audience resource name to the `QueryAudienceList` method.
   *
   * <p>See [Creating an Audience
   * List](https://developers.google.com/analytics/devguides/reporting/data/v1/audience-list-basics)
   * for an introduction to Audience Lists with examples.
   *
   * <p>An audience list is a snapshot of the users currently in the audience at the time of
   * audience list creation. Creating audience lists for one audience on different days will return
   * different results as users enter and exit the audience.
   *
   * <p>Audiences in Google Analytics 4 allow you to segment your users in the ways that are
   * important to your business. To learn more, see
   * https://support.google.com/analytics/answer/9267572. Audience lists contain the users in each
   * audience.
   *
   * <p>This method is introduced at alpha stability with the intention of gathering feedback on
   * syntax and capabilities before entering beta. To give your feedback on this API, complete the
   * [Google Analytics Audience Export API Feedback](https://forms.gle/EeA5u5LW6PEggtCEA) form.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AlphaAnalyticsDataClient alphaAnalyticsDataClient = AlphaAnalyticsDataClient.create()) {
   *   CreateAudienceListRequest request =
   *       CreateAudienceListRequest.newBuilder()
   *           .setParent(PropertyName.of("[PROPERTY]").toString())
   *           .setAudienceList(AudienceList.newBuilder().build())
   *           .build();
   *   OperationFuture<AudienceList, AudienceListMetadata> future =
   *       alphaAnalyticsDataClient.createAudienceListOperationCallable().futureCall(request);
   *   // Do something.
   *   AudienceList response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<CreateAudienceListRequest, AudienceList, AudienceListMetadata>
      createAudienceListOperationCallable() {
    return stub.createAudienceListOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an audience list for later retrieval. This method quickly returns the audience list's
   * resource name and initiates a long running asynchronous request to form an audience list. To
   * list the users in an audience list, first create the audience list through this method and then
   * send the audience resource name to the `QueryAudienceList` method.
   *
   * <p>See [Creating an Audience
   * List](https://developers.google.com/analytics/devguides/reporting/data/v1/audience-list-basics)
   * for an introduction to Audience Lists with examples.
   *
   * <p>An audience list is a snapshot of the users currently in the audience at the time of
   * audience list creation. Creating audience lists for one audience on different days will return
   * different results as users enter and exit the audience.
   *
   * <p>Audiences in Google Analytics 4 allow you to segment your users in the ways that are
   * important to your business. To learn more, see
   * https://support.google.com/analytics/answer/9267572. Audience lists contain the users in each
   * audience.
   *
   * <p>This method is introduced at alpha stability with the intention of gathering feedback on
   * syntax and capabilities before entering beta. To give your feedback on this API, complete the
   * [Google Analytics Audience Export API Feedback](https://forms.gle/EeA5u5LW6PEggtCEA) form.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AlphaAnalyticsDataClient alphaAnalyticsDataClient = AlphaAnalyticsDataClient.create()) {
   *   CreateAudienceListRequest request =
   *       CreateAudienceListRequest.newBuilder()
   *           .setParent(PropertyName.of("[PROPERTY]").toString())
   *           .setAudienceList(AudienceList.newBuilder().build())
   *           .build();
   *   ApiFuture<Operation> future =
   *       alphaAnalyticsDataClient.createAudienceListCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateAudienceListRequest, Operation> createAudienceListCallable() {
    return stub.createAudienceListCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves an audience list of users. After creating an audience, the users are not immediately
   * available for listing. First, a request to `CreateAudienceList` is necessary to create an
   * audience list of users, and then second, this method is used to retrieve the users in the
   * audience list.
   *
   * <p>See [Creating an Audience
   * List](https://developers.google.com/analytics/devguides/reporting/data/v1/audience-list-basics)
   * for an introduction to Audience Lists with examples.
   *
   * <p>Audiences in Google Analytics 4 allow you to segment your users in the ways that are
   * important to your business. To learn more, see
   * https://support.google.com/analytics/answer/9267572.
   *
   * <p>This method is introduced at alpha stability with the intention of gathering feedback on
   * syntax and capabilities before entering beta. To give your feedback on this API, complete the
   * [Google Analytics Audience Export API Feedback](https://forms.gle/EeA5u5LW6PEggtCEA) form.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AlphaAnalyticsDataClient alphaAnalyticsDataClient = AlphaAnalyticsDataClient.create()) {
   *   String name = "name3373707";
   *   QueryAudienceListResponse response = alphaAnalyticsDataClient.queryAudienceList(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the audience list to retrieve users from. Format:
   *     `properties/{property}/audienceLists/{audience_list}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final QueryAudienceListResponse queryAudienceList(String name) {
    QueryAudienceListRequest request = QueryAudienceListRequest.newBuilder().setName(name).build();
    return queryAudienceList(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves an audience list of users. After creating an audience, the users are not immediately
   * available for listing. First, a request to `CreateAudienceList` is necessary to create an
   * audience list of users, and then second, this method is used to retrieve the users in the
   * audience list.
   *
   * <p>See [Creating an Audience
   * List](https://developers.google.com/analytics/devguides/reporting/data/v1/audience-list-basics)
   * for an introduction to Audience Lists with examples.
   *
   * <p>Audiences in Google Analytics 4 allow you to segment your users in the ways that are
   * important to your business. To learn more, see
   * https://support.google.com/analytics/answer/9267572.
   *
   * <p>This method is introduced at alpha stability with the intention of gathering feedback on
   * syntax and capabilities before entering beta. To give your feedback on this API, complete the
   * [Google Analytics Audience Export API Feedback](https://forms.gle/EeA5u5LW6PEggtCEA) form.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AlphaAnalyticsDataClient alphaAnalyticsDataClient = AlphaAnalyticsDataClient.create()) {
   *   QueryAudienceListRequest request =
   *       QueryAudienceListRequest.newBuilder()
   *           .setName("name3373707")
   *           .setOffset(-1019779949)
   *           .setLimit(102976443)
   *           .build();
   *   QueryAudienceListResponse response = alphaAnalyticsDataClient.queryAudienceList(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final QueryAudienceListResponse queryAudienceList(QueryAudienceListRequest request) {
    return queryAudienceListCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves an audience list of users. After creating an audience, the users are not immediately
   * available for listing. First, a request to `CreateAudienceList` is necessary to create an
   * audience list of users, and then second, this method is used to retrieve the users in the
   * audience list.
   *
   * <p>See [Creating an Audience
   * List](https://developers.google.com/analytics/devguides/reporting/data/v1/audience-list-basics)
   * for an introduction to Audience Lists with examples.
   *
   * <p>Audiences in Google Analytics 4 allow you to segment your users in the ways that are
   * important to your business. To learn more, see
   * https://support.google.com/analytics/answer/9267572.
   *
   * <p>This method is introduced at alpha stability with the intention of gathering feedback on
   * syntax and capabilities before entering beta. To give your feedback on this API, complete the
   * [Google Analytics Audience Export API Feedback](https://forms.gle/EeA5u5LW6PEggtCEA) form.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AlphaAnalyticsDataClient alphaAnalyticsDataClient = AlphaAnalyticsDataClient.create()) {
   *   QueryAudienceListRequest request =
   *       QueryAudienceListRequest.newBuilder()
   *           .setName("name3373707")
   *           .setOffset(-1019779949)
   *           .setLimit(102976443)
   *           .build();
   *   ApiFuture<QueryAudienceListResponse> future =
   *       alphaAnalyticsDataClient.queryAudienceListCallable().futureCall(request);
   *   // Do something.
   *   QueryAudienceListResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<QueryAudienceListRequest, QueryAudienceListResponse>
      queryAudienceListCallable() {
    return stub.queryAudienceListCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Exports an audience list of users to a Google Sheet. After creating an audience, the users are
   * not immediately available for listing. First, a request to `CreateAudienceList` is necessary to
   * create an audience list of users, and then second, this method is used to export those users in
   * the audience list to a Google Sheet.
   *
   * <p>See [Creating an Audience
   * List](https://developers.google.com/analytics/devguides/reporting/data/v1/audience-list-basics)
   * for an introduction to Audience Lists with examples.
   *
   * <p>Audiences in Google Analytics 4 allow you to segment your users in the ways that are
   * important to your business. To learn more, see
   * https://support.google.com/analytics/answer/9267572.
   *
   * <p>This method is introduced at alpha stability with the intention of gathering feedback on
   * syntax and capabilities before entering beta. To give your feedback on this API, complete the
   * [Google Analytics Audience Export API Feedback](https://forms.gle/EeA5u5LW6PEggtCEA) form.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AlphaAnalyticsDataClient alphaAnalyticsDataClient = AlphaAnalyticsDataClient.create()) {
   *   AudienceListName name = AudienceListName.of("[PROPERTY]", "[AUDIENCE_LIST]");
   *   SheetExportAudienceListResponse response =
   *       alphaAnalyticsDataClient.sheetExportAudienceList(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the audience list to retrieve users from. Format:
   *     `properties/{property}/audienceLists/{audience_list}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SheetExportAudienceListResponse sheetExportAudienceList(AudienceListName name) {
    SheetExportAudienceListRequest request =
        SheetExportAudienceListRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return sheetExportAudienceList(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Exports an audience list of users to a Google Sheet. After creating an audience, the users are
   * not immediately available for listing. First, a request to `CreateAudienceList` is necessary to
   * create an audience list of users, and then second, this method is used to export those users in
   * the audience list to a Google Sheet.
   *
   * <p>See [Creating an Audience
   * List](https://developers.google.com/analytics/devguides/reporting/data/v1/audience-list-basics)
   * for an introduction to Audience Lists with examples.
   *
   * <p>Audiences in Google Analytics 4 allow you to segment your users in the ways that are
   * important to your business. To learn more, see
   * https://support.google.com/analytics/answer/9267572.
   *
   * <p>This method is introduced at alpha stability with the intention of gathering feedback on
   * syntax and capabilities before entering beta. To give your feedback on this API, complete the
   * [Google Analytics Audience Export API Feedback](https://forms.gle/EeA5u5LW6PEggtCEA) form.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AlphaAnalyticsDataClient alphaAnalyticsDataClient = AlphaAnalyticsDataClient.create()) {
   *   String name = AudienceListName.of("[PROPERTY]", "[AUDIENCE_LIST]").toString();
   *   SheetExportAudienceListResponse response =
   *       alphaAnalyticsDataClient.sheetExportAudienceList(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the audience list to retrieve users from. Format:
   *     `properties/{property}/audienceLists/{audience_list}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SheetExportAudienceListResponse sheetExportAudienceList(String name) {
    SheetExportAudienceListRequest request =
        SheetExportAudienceListRequest.newBuilder().setName(name).build();
    return sheetExportAudienceList(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Exports an audience list of users to a Google Sheet. After creating an audience, the users are
   * not immediately available for listing. First, a request to `CreateAudienceList` is necessary to
   * create an audience list of users, and then second, this method is used to export those users in
   * the audience list to a Google Sheet.
   *
   * <p>See [Creating an Audience
   * List](https://developers.google.com/analytics/devguides/reporting/data/v1/audience-list-basics)
   * for an introduction to Audience Lists with examples.
   *
   * <p>Audiences in Google Analytics 4 allow you to segment your users in the ways that are
   * important to your business. To learn more, see
   * https://support.google.com/analytics/answer/9267572.
   *
   * <p>This method is introduced at alpha stability with the intention of gathering feedback on
   * syntax and capabilities before entering beta. To give your feedback on this API, complete the
   * [Google Analytics Audience Export API Feedback](https://forms.gle/EeA5u5LW6PEggtCEA) form.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AlphaAnalyticsDataClient alphaAnalyticsDataClient = AlphaAnalyticsDataClient.create()) {
   *   SheetExportAudienceListRequest request =
   *       SheetExportAudienceListRequest.newBuilder()
   *           .setName(AudienceListName.of("[PROPERTY]", "[AUDIENCE_LIST]").toString())
   *           .setOffset(-1019779949)
   *           .setLimit(102976443)
   *           .build();
   *   SheetExportAudienceListResponse response =
   *       alphaAnalyticsDataClient.sheetExportAudienceList(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SheetExportAudienceListResponse sheetExportAudienceList(
      SheetExportAudienceListRequest request) {
    return sheetExportAudienceListCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Exports an audience list of users to a Google Sheet. After creating an audience, the users are
   * not immediately available for listing. First, a request to `CreateAudienceList` is necessary to
   * create an audience list of users, and then second, this method is used to export those users in
   * the audience list to a Google Sheet.
   *
   * <p>See [Creating an Audience
   * List](https://developers.google.com/analytics/devguides/reporting/data/v1/audience-list-basics)
   * for an introduction to Audience Lists with examples.
   *
   * <p>Audiences in Google Analytics 4 allow you to segment your users in the ways that are
   * important to your business. To learn more, see
   * https://support.google.com/analytics/answer/9267572.
   *
   * <p>This method is introduced at alpha stability with the intention of gathering feedback on
   * syntax and capabilities before entering beta. To give your feedback on this API, complete the
   * [Google Analytics Audience Export API Feedback](https://forms.gle/EeA5u5LW6PEggtCEA) form.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AlphaAnalyticsDataClient alphaAnalyticsDataClient = AlphaAnalyticsDataClient.create()) {
   *   SheetExportAudienceListRequest request =
   *       SheetExportAudienceListRequest.newBuilder()
   *           .setName(AudienceListName.of("[PROPERTY]", "[AUDIENCE_LIST]").toString())
   *           .setOffset(-1019779949)
   *           .setLimit(102976443)
   *           .build();
   *   ApiFuture<SheetExportAudienceListResponse> future =
   *       alphaAnalyticsDataClient.sheetExportAudienceListCallable().futureCall(request);
   *   // Do something.
   *   SheetExportAudienceListResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<SheetExportAudienceListRequest, SheetExportAudienceListResponse>
      sheetExportAudienceListCallable() {
    return stub.sheetExportAudienceListCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets configuration metadata about a specific audience list. This method can be used to
   * understand an audience list after it has been created.
   *
   * <p>See [Creating an Audience
   * List](https://developers.google.com/analytics/devguides/reporting/data/v1/audience-list-basics)
   * for an introduction to Audience Lists with examples.
   *
   * <p>This method is introduced at alpha stability with the intention of gathering feedback on
   * syntax and capabilities before entering beta. To give your feedback on this API, complete the
   * [Google Analytics Audience Export API Feedback](https://forms.gle/EeA5u5LW6PEggtCEA) form.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AlphaAnalyticsDataClient alphaAnalyticsDataClient = AlphaAnalyticsDataClient.create()) {
   *   AudienceListName name = AudienceListName.of("[PROPERTY]", "[AUDIENCE_LIST]");
   *   AudienceList response = alphaAnalyticsDataClient.getAudienceList(name);
   * }
   * }</pre>
   *
   * @param name Required. The audience list resource name. Format:
   *     `properties/{property}/audienceLists/{audience_list}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AudienceList getAudienceList(AudienceListName name) {
    GetAudienceListRequest request =
        GetAudienceListRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getAudienceList(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets configuration metadata about a specific audience list. This method can be used to
   * understand an audience list after it has been created.
   *
   * <p>See [Creating an Audience
   * List](https://developers.google.com/analytics/devguides/reporting/data/v1/audience-list-basics)
   * for an introduction to Audience Lists with examples.
   *
   * <p>This method is introduced at alpha stability with the intention of gathering feedback on
   * syntax and capabilities before entering beta. To give your feedback on this API, complete the
   * [Google Analytics Audience Export API Feedback](https://forms.gle/EeA5u5LW6PEggtCEA) form.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AlphaAnalyticsDataClient alphaAnalyticsDataClient = AlphaAnalyticsDataClient.create()) {
   *   String name = AudienceListName.of("[PROPERTY]", "[AUDIENCE_LIST]").toString();
   *   AudienceList response = alphaAnalyticsDataClient.getAudienceList(name);
   * }
   * }</pre>
   *
   * @param name Required. The audience list resource name. Format:
   *     `properties/{property}/audienceLists/{audience_list}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AudienceList getAudienceList(String name) {
    GetAudienceListRequest request = GetAudienceListRequest.newBuilder().setName(name).build();
    return getAudienceList(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets configuration metadata about a specific audience list. This method can be used to
   * understand an audience list after it has been created.
   *
   * <p>See [Creating an Audience
   * List](https://developers.google.com/analytics/devguides/reporting/data/v1/audience-list-basics)
   * for an introduction to Audience Lists with examples.
   *
   * <p>This method is introduced at alpha stability with the intention of gathering feedback on
   * syntax and capabilities before entering beta. To give your feedback on this API, complete the
   * [Google Analytics Audience Export API Feedback](https://forms.gle/EeA5u5LW6PEggtCEA) form.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AlphaAnalyticsDataClient alphaAnalyticsDataClient = AlphaAnalyticsDataClient.create()) {
   *   GetAudienceListRequest request =
   *       GetAudienceListRequest.newBuilder()
   *           .setName(AudienceListName.of("[PROPERTY]", "[AUDIENCE_LIST]").toString())
   *           .build();
   *   AudienceList response = alphaAnalyticsDataClient.getAudienceList(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AudienceList getAudienceList(GetAudienceListRequest request) {
    return getAudienceListCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets configuration metadata about a specific audience list. This method can be used to
   * understand an audience list after it has been created.
   *
   * <p>See [Creating an Audience
   * List](https://developers.google.com/analytics/devguides/reporting/data/v1/audience-list-basics)
   * for an introduction to Audience Lists with examples.
   *
   * <p>This method is introduced at alpha stability with the intention of gathering feedback on
   * syntax and capabilities before entering beta. To give your feedback on this API, complete the
   * [Google Analytics Audience Export API Feedback](https://forms.gle/EeA5u5LW6PEggtCEA) form.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AlphaAnalyticsDataClient alphaAnalyticsDataClient = AlphaAnalyticsDataClient.create()) {
   *   GetAudienceListRequest request =
   *       GetAudienceListRequest.newBuilder()
   *           .setName(AudienceListName.of("[PROPERTY]", "[AUDIENCE_LIST]").toString())
   *           .build();
   *   ApiFuture<AudienceList> future =
   *       alphaAnalyticsDataClient.getAudienceListCallable().futureCall(request);
   *   // Do something.
   *   AudienceList response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetAudienceListRequest, AudienceList> getAudienceListCallable() {
    return stub.getAudienceListCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all audience lists for a property. This method can be used for you to find and reuse
   * existing audience lists rather than creating unnecessary new audience lists. The same audience
   * can have multiple audience lists that represent the list of users that were in an audience on
   * different days.
   *
   * <p>See [Creating an Audience
   * List](https://developers.google.com/analytics/devguides/reporting/data/v1/audience-list-basics)
   * for an introduction to Audience Lists with examples.
   *
   * <p>This method is introduced at alpha stability with the intention of gathering feedback on
   * syntax and capabilities before entering beta. To give your feedback on this API, complete the
   * [Google Analytics Audience Export API Feedback](https://forms.gle/EeA5u5LW6PEggtCEA) form.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AlphaAnalyticsDataClient alphaAnalyticsDataClient = AlphaAnalyticsDataClient.create()) {
   *   PropertyName parent = PropertyName.of("[PROPERTY]");
   *   for (AudienceList element : alphaAnalyticsDataClient.listAudienceLists(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. All audience lists for this property will be listed in the response.
   *     Format: `properties/{property}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListAudienceListsPagedResponse listAudienceLists(PropertyName parent) {
    ListAudienceListsRequest request =
        ListAudienceListsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listAudienceLists(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all audience lists for a property. This method can be used for you to find and reuse
   * existing audience lists rather than creating unnecessary new audience lists. The same audience
   * can have multiple audience lists that represent the list of users that were in an audience on
   * different days.
   *
   * <p>See [Creating an Audience
   * List](https://developers.google.com/analytics/devguides/reporting/data/v1/audience-list-basics)
   * for an introduction to Audience Lists with examples.
   *
   * <p>This method is introduced at alpha stability with the intention of gathering feedback on
   * syntax and capabilities before entering beta. To give your feedback on this API, complete the
   * [Google Analytics Audience Export API Feedback](https://forms.gle/EeA5u5LW6PEggtCEA) form.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AlphaAnalyticsDataClient alphaAnalyticsDataClient = AlphaAnalyticsDataClient.create()) {
   *   String parent = PropertyName.of("[PROPERTY]").toString();
   *   for (AudienceList element : alphaAnalyticsDataClient.listAudienceLists(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. All audience lists for this property will be listed in the response.
   *     Format: `properties/{property}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListAudienceListsPagedResponse listAudienceLists(String parent) {
    ListAudienceListsRequest request =
        ListAudienceListsRequest.newBuilder().setParent(parent).build();
    return listAudienceLists(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all audience lists for a property. This method can be used for you to find and reuse
   * existing audience lists rather than creating unnecessary new audience lists. The same audience
   * can have multiple audience lists that represent the list of users that were in an audience on
   * different days.
   *
   * <p>See [Creating an Audience
   * List](https://developers.google.com/analytics/devguides/reporting/data/v1/audience-list-basics)
   * for an introduction to Audience Lists with examples.
   *
   * <p>This method is introduced at alpha stability with the intention of gathering feedback on
   * syntax and capabilities before entering beta. To give your feedback on this API, complete the
   * [Google Analytics Audience Export API Feedback](https://forms.gle/EeA5u5LW6PEggtCEA) form.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AlphaAnalyticsDataClient alphaAnalyticsDataClient = AlphaAnalyticsDataClient.create()) {
   *   ListAudienceListsRequest request =
   *       ListAudienceListsRequest.newBuilder()
   *           .setParent(PropertyName.of("[PROPERTY]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (AudienceList element :
   *       alphaAnalyticsDataClient.listAudienceLists(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListAudienceListsPagedResponse listAudienceLists(ListAudienceListsRequest request) {
    return listAudienceListsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all audience lists for a property. This method can be used for you to find and reuse
   * existing audience lists rather than creating unnecessary new audience lists. The same audience
   * can have multiple audience lists that represent the list of users that were in an audience on
   * different days.
   *
   * <p>See [Creating an Audience
   * List](https://developers.google.com/analytics/devguides/reporting/data/v1/audience-list-basics)
   * for an introduction to Audience Lists with examples.
   *
   * <p>This method is introduced at alpha stability with the intention of gathering feedback on
   * syntax and capabilities before entering beta. To give your feedback on this API, complete the
   * [Google Analytics Audience Export API Feedback](https://forms.gle/EeA5u5LW6PEggtCEA) form.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AlphaAnalyticsDataClient alphaAnalyticsDataClient = AlphaAnalyticsDataClient.create()) {
   *   ListAudienceListsRequest request =
   *       ListAudienceListsRequest.newBuilder()
   *           .setParent(PropertyName.of("[PROPERTY]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<AudienceList> future =
   *       alphaAnalyticsDataClient.listAudienceListsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (AudienceList element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListAudienceListsRequest, ListAudienceListsPagedResponse>
      listAudienceListsPagedCallable() {
    return stub.listAudienceListsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all audience lists for a property. This method can be used for you to find and reuse
   * existing audience lists rather than creating unnecessary new audience lists. The same audience
   * can have multiple audience lists that represent the list of users that were in an audience on
   * different days.
   *
   * <p>See [Creating an Audience
   * List](https://developers.google.com/analytics/devguides/reporting/data/v1/audience-list-basics)
   * for an introduction to Audience Lists with examples.
   *
   * <p>This method is introduced at alpha stability with the intention of gathering feedback on
   * syntax and capabilities before entering beta. To give your feedback on this API, complete the
   * [Google Analytics Audience Export API Feedback](https://forms.gle/EeA5u5LW6PEggtCEA) form.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AlphaAnalyticsDataClient alphaAnalyticsDataClient = AlphaAnalyticsDataClient.create()) {
   *   ListAudienceListsRequest request =
   *       ListAudienceListsRequest.newBuilder()
   *           .setParent(PropertyName.of("[PROPERTY]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListAudienceListsResponse response =
   *         alphaAnalyticsDataClient.listAudienceListsCallable().call(request);
   *     for (AudienceList element : response.getAudienceListsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListAudienceListsRequest, ListAudienceListsResponse>
      listAudienceListsCallable() {
    return stub.listAudienceListsCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListAudienceListsPagedResponse
      extends AbstractPagedListResponse<
          ListAudienceListsRequest,
          ListAudienceListsResponse,
          AudienceList,
          ListAudienceListsPage,
          ListAudienceListsFixedSizeCollection> {

    public static ApiFuture<ListAudienceListsPagedResponse> createAsync(
        PageContext<ListAudienceListsRequest, ListAudienceListsResponse, AudienceList> context,
        ApiFuture<ListAudienceListsResponse> futureResponse) {
      ApiFuture<ListAudienceListsPage> futurePage =
          ListAudienceListsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListAudienceListsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListAudienceListsPagedResponse(ListAudienceListsPage page) {
      super(page, ListAudienceListsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListAudienceListsPage
      extends AbstractPage<
          ListAudienceListsRequest,
          ListAudienceListsResponse,
          AudienceList,
          ListAudienceListsPage> {

    private ListAudienceListsPage(
        PageContext<ListAudienceListsRequest, ListAudienceListsResponse, AudienceList> context,
        ListAudienceListsResponse response) {
      super(context, response);
    }

    private static ListAudienceListsPage createEmptyPage() {
      return new ListAudienceListsPage(null, null);
    }

    @Override
    protected ListAudienceListsPage createPage(
        PageContext<ListAudienceListsRequest, ListAudienceListsResponse, AudienceList> context,
        ListAudienceListsResponse response) {
      return new ListAudienceListsPage(context, response);
    }

    @Override
    public ApiFuture<ListAudienceListsPage> createPageAsync(
        PageContext<ListAudienceListsRequest, ListAudienceListsResponse, AudienceList> context,
        ApiFuture<ListAudienceListsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListAudienceListsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListAudienceListsRequest,
          ListAudienceListsResponse,
          AudienceList,
          ListAudienceListsPage,
          ListAudienceListsFixedSizeCollection> {

    private ListAudienceListsFixedSizeCollection(
        List<ListAudienceListsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListAudienceListsFixedSizeCollection createEmptyCollection() {
      return new ListAudienceListsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListAudienceListsFixedSizeCollection createCollection(
        List<ListAudienceListsPage> pages, int collectionSize) {
      return new ListAudienceListsFixedSizeCollection(pages, collectionSize);
    }
  }
}
