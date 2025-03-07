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

package com.google.cloud.compute.v1;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.stub.RoutersStub;
import com.google.cloud.compute.v1.stub.RoutersStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: The Routers API.
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
 * try (RoutersClient routersClient = RoutersClient.create()) {
 *   String project = "project-309310695";
 *   String region = "region-934795532";
 *   String router = "router-925132983";
 *   Router response = routersClient.get(project, region, router);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the RoutersClient object to clean up resources such as
 * threads. In the example above, try-with-resources is used, which automatically calls close().
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
 * <p>This class can be customized by passing in a custom instance of RoutersSettings to create().
 * For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * RoutersSettings routersSettings =
 *     RoutersSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * RoutersClient routersClient = RoutersClient.create(routersSettings);
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
 * RoutersSettings routersSettings = RoutersSettings.newBuilder().setEndpoint(myEndpoint).build();
 * RoutersClient routersClient = RoutersClient.create(routersSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class RoutersClient implements BackgroundResource {
  private final RoutersSettings settings;
  private final RoutersStub stub;

  /** Constructs an instance of RoutersClient with default settings. */
  public static final RoutersClient create() throws IOException {
    return create(RoutersSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of RoutersClient, using the given settings. The channels are created
   * based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final RoutersClient create(RoutersSettings settings) throws IOException {
    return new RoutersClient(settings);
  }

  /**
   * Constructs an instance of RoutersClient, using the given stub for making calls. This is for
   * advanced usage - prefer using create(RoutersSettings).
   */
  public static final RoutersClient create(RoutersStub stub) {
    return new RoutersClient(stub);
  }

  /**
   * Constructs an instance of RoutersClient, using the given settings. This is protected so that it
   * is easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected RoutersClient(RoutersSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((RoutersStubSettings) settings.getStubSettings()).createStub();
  }

  protected RoutersClient(RoutersStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final RoutersSettings getSettings() {
    return settings;
  }

  public RoutersStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves an aggregated list of routers.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RoutersClient routersClient = RoutersClient.create()) {
   *   String project = "project-309310695";
   *   for (Map.Entry<String, RoutersScopedList> element :
   *       routersClient.aggregatedList(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AggregatedListPagedResponse aggregatedList(String project) {
    AggregatedListRoutersRequest request =
        AggregatedListRoutersRequest.newBuilder().setProject(project).build();
    return aggregatedList(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves an aggregated list of routers.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RoutersClient routersClient = RoutersClient.create()) {
   *   AggregatedListRoutersRequest request =
   *       AggregatedListRoutersRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setIncludeAllScopes(true)
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   for (Map.Entry<String, RoutersScopedList> element :
   *       routersClient.aggregatedList(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AggregatedListPagedResponse aggregatedList(AggregatedListRoutersRequest request) {
    return aggregatedListPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves an aggregated list of routers.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RoutersClient routersClient = RoutersClient.create()) {
   *   AggregatedListRoutersRequest request =
   *       AggregatedListRoutersRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setIncludeAllScopes(true)
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   ApiFuture<Map.Entry<String, RoutersScopedList>> future =
   *       routersClient.aggregatedListPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Map.Entry<String, RoutersScopedList> element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<AggregatedListRoutersRequest, AggregatedListPagedResponse>
      aggregatedListPagedCallable() {
    return stub.aggregatedListPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves an aggregated list of routers.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RoutersClient routersClient = RoutersClient.create()) {
   *   AggregatedListRoutersRequest request =
   *       AggregatedListRoutersRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setIncludeAllScopes(true)
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   while (true) {
   *     RouterAggregatedList response = routersClient.aggregatedListCallable().call(request);
   *     for (Map.Entry<String, RoutersScopedList> element : response.getItemsList()) {
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
  public final UnaryCallable<AggregatedListRoutersRequest, RouterAggregatedList>
      aggregatedListCallable() {
    return stub.aggregatedListCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified Router resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RoutersClient routersClient = RoutersClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   String router = "router-925132983";
   *   Operation response = routersClient.deleteAsync(project, region, router).get();
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region Name of the region for this request.
   * @param router Name of the Router resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> deleteAsync(
      String project, String region, String router) {
    DeleteRouterRequest request =
        DeleteRouterRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setRouter(router)
            .build();
    return deleteAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified Router resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RoutersClient routersClient = RoutersClient.create()) {
   *   DeleteRouterRequest request =
   *       DeleteRouterRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .setRouter("router-925132983")
   *           .build();
   *   Operation response = routersClient.deleteAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Operation, Operation> deleteAsync(DeleteRouterRequest request) {
    return deleteOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified Router resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RoutersClient routersClient = RoutersClient.create()) {
   *   DeleteRouterRequest request =
   *       DeleteRouterRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .setRouter("router-925132983")
   *           .build();
   *   OperationFuture<Operation, Operation> future =
   *       routersClient.deleteOperationCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<DeleteRouterRequest, Operation, Operation>
      deleteOperationCallable() {
    return stub.deleteOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified Router resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RoutersClient routersClient = RoutersClient.create()) {
   *   DeleteRouterRequest request =
   *       DeleteRouterRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .setRouter("router-925132983")
   *           .build();
   *   ApiFuture<Operation> future = routersClient.deleteCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteRouterRequest, Operation> deleteCallable() {
    return stub.deleteCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the specified Router resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RoutersClient routersClient = RoutersClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   String router = "router-925132983";
   *   Router response = routersClient.get(project, region, router);
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region Name of the region for this request.
   * @param router Name of the Router resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Router get(String project, String region, String router) {
    GetRouterRequest request =
        GetRouterRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setRouter(router)
            .build();
    return get(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the specified Router resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RoutersClient routersClient = RoutersClient.create()) {
   *   GetRouterRequest request =
   *       GetRouterRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRouter("router-925132983")
   *           .build();
   *   Router response = routersClient.get(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Router get(GetRouterRequest request) {
    return getCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the specified Router resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RoutersClient routersClient = RoutersClient.create()) {
   *   GetRouterRequest request =
   *       GetRouterRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRouter("router-925132983")
   *           .build();
   *   ApiFuture<Router> future = routersClient.getCallable().futureCall(request);
   *   // Do something.
   *   Router response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetRouterRequest, Router> getCallable() {
    return stub.getCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves runtime Nat mapping information of VM endpoints.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RoutersClient routersClient = RoutersClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   String router = "router-925132983";
   *   for (VmEndpointNatMappings element :
   *       routersClient.getNatMappingInfo(project, region, router).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region Name of the region for this request.
   * @param router Name of the Router resource to query for Nat Mapping information of VM endpoints.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GetNatMappingInfoPagedResponse getNatMappingInfo(
      String project, String region, String router) {
    GetNatMappingInfoRoutersRequest request =
        GetNatMappingInfoRoutersRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setRouter(router)
            .build();
    return getNatMappingInfo(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves runtime Nat mapping information of VM endpoints.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RoutersClient routersClient = RoutersClient.create()) {
   *   GetNatMappingInfoRoutersRequest request =
   *       GetNatMappingInfoRoutersRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setMaxResults(1128457243)
   *           .setNatName("natName1727733580")
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setReturnPartialSuccess(true)
   *           .setRouter("router-925132983")
   *           .build();
   *   for (VmEndpointNatMappings element : routersClient.getNatMappingInfo(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GetNatMappingInfoPagedResponse getNatMappingInfo(
      GetNatMappingInfoRoutersRequest request) {
    return getNatMappingInfoPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves runtime Nat mapping information of VM endpoints.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RoutersClient routersClient = RoutersClient.create()) {
   *   GetNatMappingInfoRoutersRequest request =
   *       GetNatMappingInfoRoutersRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setMaxResults(1128457243)
   *           .setNatName("natName1727733580")
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setReturnPartialSuccess(true)
   *           .setRouter("router-925132983")
   *           .build();
   *   ApiFuture<VmEndpointNatMappings> future =
   *       routersClient.getNatMappingInfoPagedCallable().futureCall(request);
   *   // Do something.
   *   for (VmEndpointNatMappings element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<GetNatMappingInfoRoutersRequest, GetNatMappingInfoPagedResponse>
      getNatMappingInfoPagedCallable() {
    return stub.getNatMappingInfoPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves runtime Nat mapping information of VM endpoints.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RoutersClient routersClient = RoutersClient.create()) {
   *   GetNatMappingInfoRoutersRequest request =
   *       GetNatMappingInfoRoutersRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setMaxResults(1128457243)
   *           .setNatName("natName1727733580")
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setReturnPartialSuccess(true)
   *           .setRouter("router-925132983")
   *           .build();
   *   while (true) {
   *     VmEndpointNatMappingsList response =
   *         routersClient.getNatMappingInfoCallable().call(request);
   *     for (VmEndpointNatMappings element : response.getResultList()) {
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
  public final UnaryCallable<GetNatMappingInfoRoutersRequest, VmEndpointNatMappingsList>
      getNatMappingInfoCallable() {
    return stub.getNatMappingInfoCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves runtime information of the specified router.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RoutersClient routersClient = RoutersClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   String router = "router-925132983";
   *   RouterStatusResponse response = routersClient.getRouterStatus(project, region, router);
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region Name of the region for this request.
   * @param router Name of the Router resource to query.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final RouterStatusResponse getRouterStatus(String project, String region, String router) {
    GetRouterStatusRouterRequest request =
        GetRouterStatusRouterRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setRouter(router)
            .build();
    return getRouterStatus(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves runtime information of the specified router.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RoutersClient routersClient = RoutersClient.create()) {
   *   GetRouterStatusRouterRequest request =
   *       GetRouterStatusRouterRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRouter("router-925132983")
   *           .build();
   *   RouterStatusResponse response = routersClient.getRouterStatus(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final RouterStatusResponse getRouterStatus(GetRouterStatusRouterRequest request) {
    return getRouterStatusCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves runtime information of the specified router.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RoutersClient routersClient = RoutersClient.create()) {
   *   GetRouterStatusRouterRequest request =
   *       GetRouterStatusRouterRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRouter("router-925132983")
   *           .build();
   *   ApiFuture<RouterStatusResponse> future =
   *       routersClient.getRouterStatusCallable().futureCall(request);
   *   // Do something.
   *   RouterStatusResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetRouterStatusRouterRequest, RouterStatusResponse>
      getRouterStatusCallable() {
    return stub.getRouterStatusCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a Router resource in the specified project and region using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RoutersClient routersClient = RoutersClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   Router routerResource = Router.newBuilder().build();
   *   Operation response = routersClient.insertAsync(project, region, routerResource).get();
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region Name of the region for this request.
   * @param routerResource The body resource for this request
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> insertAsync(
      String project, String region, Router routerResource) {
    InsertRouterRequest request =
        InsertRouterRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setRouterResource(routerResource)
            .build();
    return insertAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a Router resource in the specified project and region using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RoutersClient routersClient = RoutersClient.create()) {
   *   InsertRouterRequest request =
   *       InsertRouterRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .setRouterResource(Router.newBuilder().build())
   *           .build();
   *   Operation response = routersClient.insertAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Operation, Operation> insertAsync(InsertRouterRequest request) {
    return insertOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a Router resource in the specified project and region using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RoutersClient routersClient = RoutersClient.create()) {
   *   InsertRouterRequest request =
   *       InsertRouterRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .setRouterResource(Router.newBuilder().build())
   *           .build();
   *   OperationFuture<Operation, Operation> future =
   *       routersClient.insertOperationCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<InsertRouterRequest, Operation, Operation>
      insertOperationCallable() {
    return stub.insertOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a Router resource in the specified project and region using the data included in the
   * request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RoutersClient routersClient = RoutersClient.create()) {
   *   InsertRouterRequest request =
   *       InsertRouterRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .setRouterResource(Router.newBuilder().build())
   *           .build();
   *   ApiFuture<Operation> future = routersClient.insertCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<InsertRouterRequest, Operation> insertCallable() {
    return stub.insertCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves a list of Router resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RoutersClient routersClient = RoutersClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   for (Router element : routersClient.list(project, region).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region Name of the region for this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPagedResponse list(String project, String region) {
    ListRoutersRequest request =
        ListRoutersRequest.newBuilder().setProject(project).setRegion(region).build();
    return list(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves a list of Router resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RoutersClient routersClient = RoutersClient.create()) {
   *   ListRoutersRequest request =
   *       ListRoutersRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   for (Router element : routersClient.list(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPagedResponse list(ListRoutersRequest request) {
    return listPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves a list of Router resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RoutersClient routersClient = RoutersClient.create()) {
   *   ListRoutersRequest request =
   *       ListRoutersRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   ApiFuture<Router> future = routersClient.listPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Router element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListRoutersRequest, ListPagedResponse> listPagedCallable() {
    return stub.listPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves a list of Router resources available to the specified project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RoutersClient routersClient = RoutersClient.create()) {
   *   ListRoutersRequest request =
   *       ListRoutersRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   while (true) {
   *     RouterList response = routersClient.listCallable().call(request);
   *     for (Router element : response.getItemsList()) {
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
  public final UnaryCallable<ListRoutersRequest, RouterList> listCallable() {
    return stub.listCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Patches the specified Router resource with the data included in the request. This method
   * supports PATCH semantics and uses JSON merge patch format and processing rules.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RoutersClient routersClient = RoutersClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   String router = "router-925132983";
   *   Router routerResource = Router.newBuilder().build();
   *   Operation response = routersClient.patchAsync(project, region, router, routerResource).get();
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region Name of the region for this request.
   * @param router Name of the Router resource to patch.
   * @param routerResource The body resource for this request
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> patchAsync(
      String project, String region, String router, Router routerResource) {
    PatchRouterRequest request =
        PatchRouterRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setRouter(router)
            .setRouterResource(routerResource)
            .build();
    return patchAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Patches the specified Router resource with the data included in the request. This method
   * supports PATCH semantics and uses JSON merge patch format and processing rules.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RoutersClient routersClient = RoutersClient.create()) {
   *   PatchRouterRequest request =
   *       PatchRouterRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .setRouter("router-925132983")
   *           .setRouterResource(Router.newBuilder().build())
   *           .build();
   *   Operation response = routersClient.patchAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Operation, Operation> patchAsync(PatchRouterRequest request) {
    return patchOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Patches the specified Router resource with the data included in the request. This method
   * supports PATCH semantics and uses JSON merge patch format and processing rules.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RoutersClient routersClient = RoutersClient.create()) {
   *   PatchRouterRequest request =
   *       PatchRouterRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .setRouter("router-925132983")
   *           .setRouterResource(Router.newBuilder().build())
   *           .build();
   *   OperationFuture<Operation, Operation> future =
   *       routersClient.patchOperationCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<PatchRouterRequest, Operation, Operation>
      patchOperationCallable() {
    return stub.patchOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Patches the specified Router resource with the data included in the request. This method
   * supports PATCH semantics and uses JSON merge patch format and processing rules.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RoutersClient routersClient = RoutersClient.create()) {
   *   PatchRouterRequest request =
   *       PatchRouterRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .setRouter("router-925132983")
   *           .setRouterResource(Router.newBuilder().build())
   *           .build();
   *   ApiFuture<Operation> future = routersClient.patchCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<PatchRouterRequest, Operation> patchCallable() {
    return stub.patchCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Preview fields auto-generated during router create and update operations. Calling this method
   * does NOT create or update the router.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RoutersClient routersClient = RoutersClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   String router = "router-925132983";
   *   Router routerResource = Router.newBuilder().build();
   *   RoutersPreviewResponse response =
   *       routersClient.preview(project, region, router, routerResource);
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region Name of the region for this request.
   * @param router Name of the Router resource to query.
   * @param routerResource The body resource for this request
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final RoutersPreviewResponse preview(
      String project, String region, String router, Router routerResource) {
    PreviewRouterRequest request =
        PreviewRouterRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setRouter(router)
            .setRouterResource(routerResource)
            .build();
    return preview(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Preview fields auto-generated during router create and update operations. Calling this method
   * does NOT create or update the router.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RoutersClient routersClient = RoutersClient.create()) {
   *   PreviewRouterRequest request =
   *       PreviewRouterRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRouter("router-925132983")
   *           .setRouterResource(Router.newBuilder().build())
   *           .build();
   *   RoutersPreviewResponse response = routersClient.preview(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final RoutersPreviewResponse preview(PreviewRouterRequest request) {
    return previewCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Preview fields auto-generated during router create and update operations. Calling this method
   * does NOT create or update the router.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RoutersClient routersClient = RoutersClient.create()) {
   *   PreviewRouterRequest request =
   *       PreviewRouterRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRouter("router-925132983")
   *           .setRouterResource(Router.newBuilder().build())
   *           .build();
   *   ApiFuture<RoutersPreviewResponse> future =
   *       routersClient.previewCallable().futureCall(request);
   *   // Do something.
   *   RoutersPreviewResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<PreviewRouterRequest, RoutersPreviewResponse> previewCallable() {
    return stub.previewCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified Router resource with the data included in the request. This method
   * conforms to PUT semantics, which requests that the state of the target resource be created or
   * replaced with the state defined by the representation enclosed in the request message payload.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RoutersClient routersClient = RoutersClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   String router = "router-925132983";
   *   Router routerResource = Router.newBuilder().build();
   *   Operation response = routersClient.updateAsync(project, region, router, routerResource).get();
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region Name of the region for this request.
   * @param router Name of the Router resource to update.
   * @param routerResource The body resource for this request
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> updateAsync(
      String project, String region, String router, Router routerResource) {
    UpdateRouterRequest request =
        UpdateRouterRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setRouter(router)
            .setRouterResource(routerResource)
            .build();
    return updateAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified Router resource with the data included in the request. This method
   * conforms to PUT semantics, which requests that the state of the target resource be created or
   * replaced with the state defined by the representation enclosed in the request message payload.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RoutersClient routersClient = RoutersClient.create()) {
   *   UpdateRouterRequest request =
   *       UpdateRouterRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .setRouter("router-925132983")
   *           .setRouterResource(Router.newBuilder().build())
   *           .build();
   *   Operation response = routersClient.updateAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Operation, Operation> updateAsync(UpdateRouterRequest request) {
    return updateOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified Router resource with the data included in the request. This method
   * conforms to PUT semantics, which requests that the state of the target resource be created or
   * replaced with the state defined by the representation enclosed in the request message payload.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RoutersClient routersClient = RoutersClient.create()) {
   *   UpdateRouterRequest request =
   *       UpdateRouterRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .setRouter("router-925132983")
   *           .setRouterResource(Router.newBuilder().build())
   *           .build();
   *   OperationFuture<Operation, Operation> future =
   *       routersClient.updateOperationCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<UpdateRouterRequest, Operation, Operation>
      updateOperationCallable() {
    return stub.updateOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified Router resource with the data included in the request. This method
   * conforms to PUT semantics, which requests that the state of the target resource be created or
   * replaced with the state defined by the representation enclosed in the request message payload.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RoutersClient routersClient = RoutersClient.create()) {
   *   UpdateRouterRequest request =
   *       UpdateRouterRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .setRouter("router-925132983")
   *           .setRouterResource(Router.newBuilder().build())
   *           .build();
   *   ApiFuture<Operation> future = routersClient.updateCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateRouterRequest, Operation> updateCallable() {
    return stub.updateCallable();
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

  public static class AggregatedListPagedResponse
      extends AbstractPagedListResponse<
          AggregatedListRoutersRequest,
          RouterAggregatedList,
          Map.Entry<String, RoutersScopedList>,
          AggregatedListPage,
          AggregatedListFixedSizeCollection> {

    public static ApiFuture<AggregatedListPagedResponse> createAsync(
        PageContext<
                AggregatedListRoutersRequest,
                RouterAggregatedList,
                Map.Entry<String, RoutersScopedList>>
            context,
        ApiFuture<RouterAggregatedList> futureResponse) {
      ApiFuture<AggregatedListPage> futurePage =
          AggregatedListPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new AggregatedListPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private AggregatedListPagedResponse(AggregatedListPage page) {
      super(page, AggregatedListFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class AggregatedListPage
      extends AbstractPage<
          AggregatedListRoutersRequest,
          RouterAggregatedList,
          Map.Entry<String, RoutersScopedList>,
          AggregatedListPage> {

    private AggregatedListPage(
        PageContext<
                AggregatedListRoutersRequest,
                RouterAggregatedList,
                Map.Entry<String, RoutersScopedList>>
            context,
        RouterAggregatedList response) {
      super(context, response);
    }

    private static AggregatedListPage createEmptyPage() {
      return new AggregatedListPage(null, null);
    }

    @Override
    protected AggregatedListPage createPage(
        PageContext<
                AggregatedListRoutersRequest,
                RouterAggregatedList,
                Map.Entry<String, RoutersScopedList>>
            context,
        RouterAggregatedList response) {
      return new AggregatedListPage(context, response);
    }

    @Override
    public ApiFuture<AggregatedListPage> createPageAsync(
        PageContext<
                AggregatedListRoutersRequest,
                RouterAggregatedList,
                Map.Entry<String, RoutersScopedList>>
            context,
        ApiFuture<RouterAggregatedList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class AggregatedListFixedSizeCollection
      extends AbstractFixedSizeCollection<
          AggregatedListRoutersRequest,
          RouterAggregatedList,
          Map.Entry<String, RoutersScopedList>,
          AggregatedListPage,
          AggregatedListFixedSizeCollection> {

    private AggregatedListFixedSizeCollection(List<AggregatedListPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static AggregatedListFixedSizeCollection createEmptyCollection() {
      return new AggregatedListFixedSizeCollection(null, 0);
    }

    @Override
    protected AggregatedListFixedSizeCollection createCollection(
        List<AggregatedListPage> pages, int collectionSize) {
      return new AggregatedListFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class GetNatMappingInfoPagedResponse
      extends AbstractPagedListResponse<
          GetNatMappingInfoRoutersRequest,
          VmEndpointNatMappingsList,
          VmEndpointNatMappings,
          GetNatMappingInfoPage,
          GetNatMappingInfoFixedSizeCollection> {

    public static ApiFuture<GetNatMappingInfoPagedResponse> createAsync(
        PageContext<
                GetNatMappingInfoRoutersRequest, VmEndpointNatMappingsList, VmEndpointNatMappings>
            context,
        ApiFuture<VmEndpointNatMappingsList> futureResponse) {
      ApiFuture<GetNatMappingInfoPage> futurePage =
          GetNatMappingInfoPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new GetNatMappingInfoPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private GetNatMappingInfoPagedResponse(GetNatMappingInfoPage page) {
      super(page, GetNatMappingInfoFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class GetNatMappingInfoPage
      extends AbstractPage<
          GetNatMappingInfoRoutersRequest,
          VmEndpointNatMappingsList,
          VmEndpointNatMappings,
          GetNatMappingInfoPage> {

    private GetNatMappingInfoPage(
        PageContext<
                GetNatMappingInfoRoutersRequest, VmEndpointNatMappingsList, VmEndpointNatMappings>
            context,
        VmEndpointNatMappingsList response) {
      super(context, response);
    }

    private static GetNatMappingInfoPage createEmptyPage() {
      return new GetNatMappingInfoPage(null, null);
    }

    @Override
    protected GetNatMappingInfoPage createPage(
        PageContext<
                GetNatMappingInfoRoutersRequest, VmEndpointNatMappingsList, VmEndpointNatMappings>
            context,
        VmEndpointNatMappingsList response) {
      return new GetNatMappingInfoPage(context, response);
    }

    @Override
    public ApiFuture<GetNatMappingInfoPage> createPageAsync(
        PageContext<
                GetNatMappingInfoRoutersRequest, VmEndpointNatMappingsList, VmEndpointNatMappings>
            context,
        ApiFuture<VmEndpointNatMappingsList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class GetNatMappingInfoFixedSizeCollection
      extends AbstractFixedSizeCollection<
          GetNatMappingInfoRoutersRequest,
          VmEndpointNatMappingsList,
          VmEndpointNatMappings,
          GetNatMappingInfoPage,
          GetNatMappingInfoFixedSizeCollection> {

    private GetNatMappingInfoFixedSizeCollection(
        List<GetNatMappingInfoPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static GetNatMappingInfoFixedSizeCollection createEmptyCollection() {
      return new GetNatMappingInfoFixedSizeCollection(null, 0);
    }

    @Override
    protected GetNatMappingInfoFixedSizeCollection createCollection(
        List<GetNatMappingInfoPage> pages, int collectionSize) {
      return new GetNatMappingInfoFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListPagedResponse
      extends AbstractPagedListResponse<
          ListRoutersRequest, RouterList, Router, ListPage, ListFixedSizeCollection> {

    public static ApiFuture<ListPagedResponse> createAsync(
        PageContext<ListRoutersRequest, RouterList, Router> context,
        ApiFuture<RouterList> futureResponse) {
      ApiFuture<ListPage> futurePage =
          ListPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage, input -> new ListPagedResponse(input), MoreExecutors.directExecutor());
    }

    private ListPagedResponse(ListPage page) {
      super(page, ListFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListPage
      extends AbstractPage<ListRoutersRequest, RouterList, Router, ListPage> {

    private ListPage(
        PageContext<ListRoutersRequest, RouterList, Router> context, RouterList response) {
      super(context, response);
    }

    private static ListPage createEmptyPage() {
      return new ListPage(null, null);
    }

    @Override
    protected ListPage createPage(
        PageContext<ListRoutersRequest, RouterList, Router> context, RouterList response) {
      return new ListPage(context, response);
    }

    @Override
    public ApiFuture<ListPage> createPageAsync(
        PageContext<ListRoutersRequest, RouterList, Router> context,
        ApiFuture<RouterList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListRoutersRequest, RouterList, Router, ListPage, ListFixedSizeCollection> {

    private ListFixedSizeCollection(List<ListPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListFixedSizeCollection createEmptyCollection() {
      return new ListFixedSizeCollection(null, 0);
    }

    @Override
    protected ListFixedSizeCollection createCollection(List<ListPage> pages, int collectionSize) {
      return new ListFixedSizeCollection(pages, collectionSize);
    }
  }
}
