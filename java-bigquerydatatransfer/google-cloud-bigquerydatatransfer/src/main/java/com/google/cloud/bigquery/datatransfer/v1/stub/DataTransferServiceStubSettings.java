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

package com.google.cloud.bigquery.datatransfer.v1.stub;

import static com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient.ListDataSourcesPagedResponse;
import static com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient.ListLocationsPagedResponse;
import static com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient.ListTransferConfigsPagedResponse;
import static com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient.ListTransferLogsPagedResponse;
import static com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient.ListTransferRunsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.HttpJsonTransportChannel;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.bigquery.datatransfer.v1.CheckValidCredsRequest;
import com.google.cloud.bigquery.datatransfer.v1.CheckValidCredsResponse;
import com.google.cloud.bigquery.datatransfer.v1.CreateTransferConfigRequest;
import com.google.cloud.bigquery.datatransfer.v1.DataSource;
import com.google.cloud.bigquery.datatransfer.v1.DeleteTransferConfigRequest;
import com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest;
import com.google.cloud.bigquery.datatransfer.v1.EnrollDataSourcesRequest;
import com.google.cloud.bigquery.datatransfer.v1.GetDataSourceRequest;
import com.google.cloud.bigquery.datatransfer.v1.GetTransferConfigRequest;
import com.google.cloud.bigquery.datatransfer.v1.GetTransferRunRequest;
import com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesRequest;
import com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse;
import com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest;
import com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse;
import com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsRequest;
import com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse;
import com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsRequest;
import com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse;
import com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsRequest;
import com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse;
import com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsRequest;
import com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse;
import com.google.cloud.bigquery.datatransfer.v1.TransferConfig;
import com.google.cloud.bigquery.datatransfer.v1.TransferMessage;
import com.google.cloud.bigquery.datatransfer.v1.TransferRun;
import com.google.cloud.bigquery.datatransfer.v1.UpdateTransferConfigRequest;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link DataTransferServiceStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (bigquerydatatransfer.googleapis.com) and default port (443)
 *       are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of getDataSource to 30 seconds:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * DataTransferServiceStubSettings.Builder dataTransferServiceSettingsBuilder =
 *     DataTransferServiceStubSettings.newBuilder();
 * dataTransferServiceSettingsBuilder
 *     .getDataSourceSettings()
 *     .setRetrySettings(
 *         dataTransferServiceSettingsBuilder
 *             .getDataSourceSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * DataTransferServiceStubSettings dataTransferServiceSettings =
 *     dataTransferServiceSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class DataTransferServiceStubSettings extends StubSettings<DataTransferServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/cloud-platform").build();

  private final UnaryCallSettings<GetDataSourceRequest, DataSource> getDataSourceSettings;
  private final PagedCallSettings<
          ListDataSourcesRequest, ListDataSourcesResponse, ListDataSourcesPagedResponse>
      listDataSourcesSettings;
  private final UnaryCallSettings<CreateTransferConfigRequest, TransferConfig>
      createTransferConfigSettings;
  private final UnaryCallSettings<UpdateTransferConfigRequest, TransferConfig>
      updateTransferConfigSettings;
  private final UnaryCallSettings<DeleteTransferConfigRequest, Empty> deleteTransferConfigSettings;
  private final UnaryCallSettings<GetTransferConfigRequest, TransferConfig>
      getTransferConfigSettings;
  private final PagedCallSettings<
          ListTransferConfigsRequest, ListTransferConfigsResponse, ListTransferConfigsPagedResponse>
      listTransferConfigsSettings;
  private final UnaryCallSettings<ScheduleTransferRunsRequest, ScheduleTransferRunsResponse>
      scheduleTransferRunsSettings;
  private final UnaryCallSettings<StartManualTransferRunsRequest, StartManualTransferRunsResponse>
      startManualTransferRunsSettings;
  private final UnaryCallSettings<GetTransferRunRequest, TransferRun> getTransferRunSettings;
  private final UnaryCallSettings<DeleteTransferRunRequest, Empty> deleteTransferRunSettings;
  private final PagedCallSettings<
          ListTransferRunsRequest, ListTransferRunsResponse, ListTransferRunsPagedResponse>
      listTransferRunsSettings;
  private final PagedCallSettings<
          ListTransferLogsRequest, ListTransferLogsResponse, ListTransferLogsPagedResponse>
      listTransferLogsSettings;
  private final UnaryCallSettings<CheckValidCredsRequest, CheckValidCredsResponse>
      checkValidCredsSettings;
  private final UnaryCallSettings<EnrollDataSourcesRequest, Empty> enrollDataSourcesSettings;
  private final PagedCallSettings<
          ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
      listLocationsSettings;
  private final UnaryCallSettings<GetLocationRequest, Location> getLocationSettings;

  private static final PagedListDescriptor<
          ListDataSourcesRequest, ListDataSourcesResponse, DataSource>
      LIST_DATA_SOURCES_PAGE_STR_DESC =
          new PagedListDescriptor<ListDataSourcesRequest, ListDataSourcesResponse, DataSource>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListDataSourcesRequest injectToken(
                ListDataSourcesRequest payload, String token) {
              return ListDataSourcesRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListDataSourcesRequest injectPageSize(
                ListDataSourcesRequest payload, int pageSize) {
              return ListDataSourcesRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListDataSourcesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListDataSourcesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<DataSource> extractResources(ListDataSourcesResponse payload) {
              return payload.getDataSourcesList() == null
                  ? ImmutableList.<DataSource>of()
                  : payload.getDataSourcesList();
            }
          };

  private static final PagedListDescriptor<
          ListTransferConfigsRequest, ListTransferConfigsResponse, TransferConfig>
      LIST_TRANSFER_CONFIGS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListTransferConfigsRequest, ListTransferConfigsResponse, TransferConfig>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListTransferConfigsRequest injectToken(
                ListTransferConfigsRequest payload, String token) {
              return ListTransferConfigsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListTransferConfigsRequest injectPageSize(
                ListTransferConfigsRequest payload, int pageSize) {
              return ListTransferConfigsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListTransferConfigsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListTransferConfigsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<TransferConfig> extractResources(ListTransferConfigsResponse payload) {
              return payload.getTransferConfigsList() == null
                  ? ImmutableList.<TransferConfig>of()
                  : payload.getTransferConfigsList();
            }
          };

  private static final PagedListDescriptor<
          ListTransferRunsRequest, ListTransferRunsResponse, TransferRun>
      LIST_TRANSFER_RUNS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListTransferRunsRequest, ListTransferRunsResponse, TransferRun>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListTransferRunsRequest injectToken(
                ListTransferRunsRequest payload, String token) {
              return ListTransferRunsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListTransferRunsRequest injectPageSize(
                ListTransferRunsRequest payload, int pageSize) {
              return ListTransferRunsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListTransferRunsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListTransferRunsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<TransferRun> extractResources(ListTransferRunsResponse payload) {
              return payload.getTransferRunsList() == null
                  ? ImmutableList.<TransferRun>of()
                  : payload.getTransferRunsList();
            }
          };

  private static final PagedListDescriptor<
          ListTransferLogsRequest, ListTransferLogsResponse, TransferMessage>
      LIST_TRANSFER_LOGS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListTransferLogsRequest, ListTransferLogsResponse, TransferMessage>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListTransferLogsRequest injectToken(
                ListTransferLogsRequest payload, String token) {
              return ListTransferLogsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListTransferLogsRequest injectPageSize(
                ListTransferLogsRequest payload, int pageSize) {
              return ListTransferLogsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListTransferLogsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListTransferLogsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<TransferMessage> extractResources(ListTransferLogsResponse payload) {
              return payload.getTransferMessagesList() == null
                  ? ImmutableList.<TransferMessage>of()
                  : payload.getTransferMessagesList();
            }
          };

  private static final PagedListDescriptor<ListLocationsRequest, ListLocationsResponse, Location>
      LIST_LOCATIONS_PAGE_STR_DESC =
          new PagedListDescriptor<ListLocationsRequest, ListLocationsResponse, Location>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListLocationsRequest injectToken(ListLocationsRequest payload, String token) {
              return ListLocationsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListLocationsRequest injectPageSize(ListLocationsRequest payload, int pageSize) {
              return ListLocationsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListLocationsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListLocationsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Location> extractResources(ListLocationsResponse payload) {
              return payload.getLocationsList() == null
                  ? ImmutableList.<Location>of()
                  : payload.getLocationsList();
            }
          };

  private static final PagedListResponseFactory<
          ListDataSourcesRequest, ListDataSourcesResponse, ListDataSourcesPagedResponse>
      LIST_DATA_SOURCES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListDataSourcesRequest, ListDataSourcesResponse, ListDataSourcesPagedResponse>() {
            @Override
            public ApiFuture<ListDataSourcesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListDataSourcesRequest, ListDataSourcesResponse> callable,
                ListDataSourcesRequest request,
                ApiCallContext context,
                ApiFuture<ListDataSourcesResponse> futureResponse) {
              PageContext<ListDataSourcesRequest, ListDataSourcesResponse, DataSource> pageContext =
                  PageContext.create(callable, LIST_DATA_SOURCES_PAGE_STR_DESC, request, context);
              return ListDataSourcesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListTransferConfigsRequest, ListTransferConfigsResponse, ListTransferConfigsPagedResponse>
      LIST_TRANSFER_CONFIGS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListTransferConfigsRequest,
              ListTransferConfigsResponse,
              ListTransferConfigsPagedResponse>() {
            @Override
            public ApiFuture<ListTransferConfigsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListTransferConfigsRequest, ListTransferConfigsResponse> callable,
                ListTransferConfigsRequest request,
                ApiCallContext context,
                ApiFuture<ListTransferConfigsResponse> futureResponse) {
              PageContext<ListTransferConfigsRequest, ListTransferConfigsResponse, TransferConfig>
                  pageContext =
                      PageContext.create(
                          callable, LIST_TRANSFER_CONFIGS_PAGE_STR_DESC, request, context);
              return ListTransferConfigsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListTransferRunsRequest, ListTransferRunsResponse, ListTransferRunsPagedResponse>
      LIST_TRANSFER_RUNS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListTransferRunsRequest, ListTransferRunsResponse, ListTransferRunsPagedResponse>() {
            @Override
            public ApiFuture<ListTransferRunsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListTransferRunsRequest, ListTransferRunsResponse> callable,
                ListTransferRunsRequest request,
                ApiCallContext context,
                ApiFuture<ListTransferRunsResponse> futureResponse) {
              PageContext<ListTransferRunsRequest, ListTransferRunsResponse, TransferRun>
                  pageContext =
                      PageContext.create(
                          callable, LIST_TRANSFER_RUNS_PAGE_STR_DESC, request, context);
              return ListTransferRunsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListTransferLogsRequest, ListTransferLogsResponse, ListTransferLogsPagedResponse>
      LIST_TRANSFER_LOGS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListTransferLogsRequest, ListTransferLogsResponse, ListTransferLogsPagedResponse>() {
            @Override
            public ApiFuture<ListTransferLogsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListTransferLogsRequest, ListTransferLogsResponse> callable,
                ListTransferLogsRequest request,
                ApiCallContext context,
                ApiFuture<ListTransferLogsResponse> futureResponse) {
              PageContext<ListTransferLogsRequest, ListTransferLogsResponse, TransferMessage>
                  pageContext =
                      PageContext.create(
                          callable, LIST_TRANSFER_LOGS_PAGE_STR_DESC, request, context);
              return ListTransferLogsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
      LIST_LOCATIONS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>() {
            @Override
            public ApiFuture<ListLocationsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListLocationsRequest, ListLocationsResponse> callable,
                ListLocationsRequest request,
                ApiCallContext context,
                ApiFuture<ListLocationsResponse> futureResponse) {
              PageContext<ListLocationsRequest, ListLocationsResponse, Location> pageContext =
                  PageContext.create(callable, LIST_LOCATIONS_PAGE_STR_DESC, request, context);
              return ListLocationsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to getDataSource. */
  public UnaryCallSettings<GetDataSourceRequest, DataSource> getDataSourceSettings() {
    return getDataSourceSettings;
  }

  /** Returns the object with the settings used for calls to listDataSources. */
  public PagedCallSettings<
          ListDataSourcesRequest, ListDataSourcesResponse, ListDataSourcesPagedResponse>
      listDataSourcesSettings() {
    return listDataSourcesSettings;
  }

  /** Returns the object with the settings used for calls to createTransferConfig. */
  public UnaryCallSettings<CreateTransferConfigRequest, TransferConfig>
      createTransferConfigSettings() {
    return createTransferConfigSettings;
  }

  /** Returns the object with the settings used for calls to updateTransferConfig. */
  public UnaryCallSettings<UpdateTransferConfigRequest, TransferConfig>
      updateTransferConfigSettings() {
    return updateTransferConfigSettings;
  }

  /** Returns the object with the settings used for calls to deleteTransferConfig. */
  public UnaryCallSettings<DeleteTransferConfigRequest, Empty> deleteTransferConfigSettings() {
    return deleteTransferConfigSettings;
  }

  /** Returns the object with the settings used for calls to getTransferConfig. */
  public UnaryCallSettings<GetTransferConfigRequest, TransferConfig> getTransferConfigSettings() {
    return getTransferConfigSettings;
  }

  /** Returns the object with the settings used for calls to listTransferConfigs. */
  public PagedCallSettings<
          ListTransferConfigsRequest, ListTransferConfigsResponse, ListTransferConfigsPagedResponse>
      listTransferConfigsSettings() {
    return listTransferConfigsSettings;
  }

  /**
   * Returns the object with the settings used for calls to scheduleTransferRuns.
   *
   * @deprecated This method is deprecated and will be removed in the next major version update.
   */
  @Deprecated
  public UnaryCallSettings<ScheduleTransferRunsRequest, ScheduleTransferRunsResponse>
      scheduleTransferRunsSettings() {
    return scheduleTransferRunsSettings;
  }

  /** Returns the object with the settings used for calls to startManualTransferRuns. */
  public UnaryCallSettings<StartManualTransferRunsRequest, StartManualTransferRunsResponse>
      startManualTransferRunsSettings() {
    return startManualTransferRunsSettings;
  }

  /** Returns the object with the settings used for calls to getTransferRun. */
  public UnaryCallSettings<GetTransferRunRequest, TransferRun> getTransferRunSettings() {
    return getTransferRunSettings;
  }

  /** Returns the object with the settings used for calls to deleteTransferRun. */
  public UnaryCallSettings<DeleteTransferRunRequest, Empty> deleteTransferRunSettings() {
    return deleteTransferRunSettings;
  }

  /** Returns the object with the settings used for calls to listTransferRuns. */
  public PagedCallSettings<
          ListTransferRunsRequest, ListTransferRunsResponse, ListTransferRunsPagedResponse>
      listTransferRunsSettings() {
    return listTransferRunsSettings;
  }

  /** Returns the object with the settings used for calls to listTransferLogs. */
  public PagedCallSettings<
          ListTransferLogsRequest, ListTransferLogsResponse, ListTransferLogsPagedResponse>
      listTransferLogsSettings() {
    return listTransferLogsSettings;
  }

  /** Returns the object with the settings used for calls to checkValidCreds. */
  public UnaryCallSettings<CheckValidCredsRequest, CheckValidCredsResponse>
      checkValidCredsSettings() {
    return checkValidCredsSettings;
  }

  /** Returns the object with the settings used for calls to enrollDataSources. */
  public UnaryCallSettings<EnrollDataSourcesRequest, Empty> enrollDataSourcesSettings() {
    return enrollDataSourcesSettings;
  }

  /** Returns the object with the settings used for calls to listLocations. */
  public PagedCallSettings<ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
      listLocationsSettings() {
    return listLocationsSettings;
  }

  /** Returns the object with the settings used for calls to getLocation. */
  public UnaryCallSettings<GetLocationRequest, Location> getLocationSettings() {
    return getLocationSettings;
  }

  public DataTransferServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcDataTransferServiceStub.create(this);
    }
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonDataTransferServiceStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "bigquerydatatransfer.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "bigquerydatatransfer.mtls.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder()
        .setScopesToApply(DEFAULT_SERVICE_SCOPES)
        .setUseJwtAccessWithScope(true);
  }

  /** Returns a builder for the default gRPC ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder()
        .setMaxInboundMessageSize(Integer.MAX_VALUE);
  }

  /** Returns a builder for the default REST ChannelProvider for this service. */
  @BetaApi
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return InstantiatingHttpJsonChannelProvider.newBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultGrpcApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(DataTransferServiceStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultHttpJsonApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(DataTransferServiceStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return DataTransferServiceStubSettings.defaultGrpcApiClientHeaderProviderBuilder();
  }

  /** Returns a new gRPC builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new REST builder for this class. */
  public static Builder newHttpJsonBuilder() {
    return Builder.createHttpJsonDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected DataTransferServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    getDataSourceSettings = settingsBuilder.getDataSourceSettings().build();
    listDataSourcesSettings = settingsBuilder.listDataSourcesSettings().build();
    createTransferConfigSettings = settingsBuilder.createTransferConfigSettings().build();
    updateTransferConfigSettings = settingsBuilder.updateTransferConfigSettings().build();
    deleteTransferConfigSettings = settingsBuilder.deleteTransferConfigSettings().build();
    getTransferConfigSettings = settingsBuilder.getTransferConfigSettings().build();
    listTransferConfigsSettings = settingsBuilder.listTransferConfigsSettings().build();
    scheduleTransferRunsSettings = settingsBuilder.scheduleTransferRunsSettings().build();
    startManualTransferRunsSettings = settingsBuilder.startManualTransferRunsSettings().build();
    getTransferRunSettings = settingsBuilder.getTransferRunSettings().build();
    deleteTransferRunSettings = settingsBuilder.deleteTransferRunSettings().build();
    listTransferRunsSettings = settingsBuilder.listTransferRunsSettings().build();
    listTransferLogsSettings = settingsBuilder.listTransferLogsSettings().build();
    checkValidCredsSettings = settingsBuilder.checkValidCredsSettings().build();
    enrollDataSourcesSettings = settingsBuilder.enrollDataSourcesSettings().build();
    listLocationsSettings = settingsBuilder.listLocationsSettings().build();
    getLocationSettings = settingsBuilder.getLocationSettings().build();
  }

  /** Builder for DataTransferServiceStubSettings. */
  public static class Builder
      extends StubSettings.Builder<DataTransferServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<GetDataSourceRequest, DataSource> getDataSourceSettings;
    private final PagedCallSettings.Builder<
            ListDataSourcesRequest, ListDataSourcesResponse, ListDataSourcesPagedResponse>
        listDataSourcesSettings;
    private final UnaryCallSettings.Builder<CreateTransferConfigRequest, TransferConfig>
        createTransferConfigSettings;
    private final UnaryCallSettings.Builder<UpdateTransferConfigRequest, TransferConfig>
        updateTransferConfigSettings;
    private final UnaryCallSettings.Builder<DeleteTransferConfigRequest, Empty>
        deleteTransferConfigSettings;
    private final UnaryCallSettings.Builder<GetTransferConfigRequest, TransferConfig>
        getTransferConfigSettings;
    private final PagedCallSettings.Builder<
            ListTransferConfigsRequest,
            ListTransferConfigsResponse,
            ListTransferConfigsPagedResponse>
        listTransferConfigsSettings;
    private final UnaryCallSettings.Builder<
            ScheduleTransferRunsRequest, ScheduleTransferRunsResponse>
        scheduleTransferRunsSettings;
    private final UnaryCallSettings.Builder<
            StartManualTransferRunsRequest, StartManualTransferRunsResponse>
        startManualTransferRunsSettings;
    private final UnaryCallSettings.Builder<GetTransferRunRequest, TransferRun>
        getTransferRunSettings;
    private final UnaryCallSettings.Builder<DeleteTransferRunRequest, Empty>
        deleteTransferRunSettings;
    private final PagedCallSettings.Builder<
            ListTransferRunsRequest, ListTransferRunsResponse, ListTransferRunsPagedResponse>
        listTransferRunsSettings;
    private final PagedCallSettings.Builder<
            ListTransferLogsRequest, ListTransferLogsResponse, ListTransferLogsPagedResponse>
        listTransferLogsSettings;
    private final UnaryCallSettings.Builder<CheckValidCredsRequest, CheckValidCredsResponse>
        checkValidCredsSettings;
    private final UnaryCallSettings.Builder<EnrollDataSourcesRequest, Empty>
        enrollDataSourcesSettings;
    private final PagedCallSettings.Builder<
            ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
        listLocationsSettings;
    private final UnaryCallSettings.Builder<GetLocationRequest, Location> getLocationSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "retry_policy_0_codes",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.UNAVAILABLE, StatusCode.Code.DEADLINE_EXCEEDED)));
      definitions.put(
          "no_retry_1_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      definitions.put("no_retry_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(60000L))
              .setInitialRpcTimeout(Duration.ofMillis(20000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(20000L))
              .setTotalTimeout(Duration.ofMillis(20000L))
              .build();
      definitions.put("retry_policy_0_params", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRpcTimeout(Duration.ofMillis(30000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(30000L))
              .setTotalTimeout(Duration.ofMillis(30000L))
              .build();
      definitions.put("no_retry_1_params", settings);
      settings = RetrySettings.newBuilder().setRpcTimeoutMultiplier(1.0).build();
      definitions.put("no_retry_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      getDataSourceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listDataSourcesSettings = PagedCallSettings.newBuilder(LIST_DATA_SOURCES_PAGE_STR_FACT);
      createTransferConfigSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateTransferConfigSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteTransferConfigSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getTransferConfigSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listTransferConfigsSettings =
          PagedCallSettings.newBuilder(LIST_TRANSFER_CONFIGS_PAGE_STR_FACT);
      scheduleTransferRunsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      startManualTransferRunsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getTransferRunSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteTransferRunSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listTransferRunsSettings = PagedCallSettings.newBuilder(LIST_TRANSFER_RUNS_PAGE_STR_FACT);
      listTransferLogsSettings = PagedCallSettings.newBuilder(LIST_TRANSFER_LOGS_PAGE_STR_FACT);
      checkValidCredsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      enrollDataSourcesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listLocationsSettings = PagedCallSettings.newBuilder(LIST_LOCATIONS_PAGE_STR_FACT);
      getLocationSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              getDataSourceSettings,
              listDataSourcesSettings,
              createTransferConfigSettings,
              updateTransferConfigSettings,
              deleteTransferConfigSettings,
              getTransferConfigSettings,
              listTransferConfigsSettings,
              scheduleTransferRunsSettings,
              startManualTransferRunsSettings,
              getTransferRunSettings,
              deleteTransferRunSettings,
              listTransferRunsSettings,
              listTransferLogsSettings,
              checkValidCredsSettings,
              enrollDataSourcesSettings,
              listLocationsSettings,
              getLocationSettings);
      initDefaults(this);
    }

    protected Builder(DataTransferServiceStubSettings settings) {
      super(settings);

      getDataSourceSettings = settings.getDataSourceSettings.toBuilder();
      listDataSourcesSettings = settings.listDataSourcesSettings.toBuilder();
      createTransferConfigSettings = settings.createTransferConfigSettings.toBuilder();
      updateTransferConfigSettings = settings.updateTransferConfigSettings.toBuilder();
      deleteTransferConfigSettings = settings.deleteTransferConfigSettings.toBuilder();
      getTransferConfigSettings = settings.getTransferConfigSettings.toBuilder();
      listTransferConfigsSettings = settings.listTransferConfigsSettings.toBuilder();
      scheduleTransferRunsSettings = settings.scheduleTransferRunsSettings.toBuilder();
      startManualTransferRunsSettings = settings.startManualTransferRunsSettings.toBuilder();
      getTransferRunSettings = settings.getTransferRunSettings.toBuilder();
      deleteTransferRunSettings = settings.deleteTransferRunSettings.toBuilder();
      listTransferRunsSettings = settings.listTransferRunsSettings.toBuilder();
      listTransferLogsSettings = settings.listTransferLogsSettings.toBuilder();
      checkValidCredsSettings = settings.checkValidCredsSettings.toBuilder();
      enrollDataSourcesSettings = settings.enrollDataSourcesSettings.toBuilder();
      listLocationsSettings = settings.listLocationsSettings.toBuilder();
      getLocationSettings = settings.getLocationSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              getDataSourceSettings,
              listDataSourcesSettings,
              createTransferConfigSettings,
              updateTransferConfigSettings,
              deleteTransferConfigSettings,
              getTransferConfigSettings,
              listTransferConfigsSettings,
              scheduleTransferRunsSettings,
              startManualTransferRunsSettings,
              getTransferRunSettings,
              deleteTransferRunSettings,
              listTransferRunsSettings,
              listTransferLogsSettings,
              checkValidCredsSettings,
              enrollDataSourcesSettings,
              listLocationsSettings,
              getLocationSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder createHttpJsonDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultHttpJsonTransportProviderBuilder().build());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultHttpJsonApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .getDataSourceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listDataSourcesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .createTransferConfigSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .updateTransferConfigSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .deleteTransferConfigSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getTransferConfigSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listTransferConfigsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .scheduleTransferRunsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .startManualTransferRunsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getTransferRunSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .deleteTransferRunSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listTransferRunsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listTransferLogsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .checkValidCredsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .enrollDataSourcesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .listLocationsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getLocationSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      return builder;
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to getDataSource. */
    public UnaryCallSettings.Builder<GetDataSourceRequest, DataSource> getDataSourceSettings() {
      return getDataSourceSettings;
    }

    /** Returns the builder for the settings used for calls to listDataSources. */
    public PagedCallSettings.Builder<
            ListDataSourcesRequest, ListDataSourcesResponse, ListDataSourcesPagedResponse>
        listDataSourcesSettings() {
      return listDataSourcesSettings;
    }

    /** Returns the builder for the settings used for calls to createTransferConfig. */
    public UnaryCallSettings.Builder<CreateTransferConfigRequest, TransferConfig>
        createTransferConfigSettings() {
      return createTransferConfigSettings;
    }

    /** Returns the builder for the settings used for calls to updateTransferConfig. */
    public UnaryCallSettings.Builder<UpdateTransferConfigRequest, TransferConfig>
        updateTransferConfigSettings() {
      return updateTransferConfigSettings;
    }

    /** Returns the builder for the settings used for calls to deleteTransferConfig. */
    public UnaryCallSettings.Builder<DeleteTransferConfigRequest, Empty>
        deleteTransferConfigSettings() {
      return deleteTransferConfigSettings;
    }

    /** Returns the builder for the settings used for calls to getTransferConfig. */
    public UnaryCallSettings.Builder<GetTransferConfigRequest, TransferConfig>
        getTransferConfigSettings() {
      return getTransferConfigSettings;
    }

    /** Returns the builder for the settings used for calls to listTransferConfigs. */
    public PagedCallSettings.Builder<
            ListTransferConfigsRequest,
            ListTransferConfigsResponse,
            ListTransferConfigsPagedResponse>
        listTransferConfigsSettings() {
      return listTransferConfigsSettings;
    }

    /**
     * Returns the builder for the settings used for calls to scheduleTransferRuns.
     *
     * @deprecated This method is deprecated and will be removed in the next major version update.
     */
    @Deprecated
    public UnaryCallSettings.Builder<ScheduleTransferRunsRequest, ScheduleTransferRunsResponse>
        scheduleTransferRunsSettings() {
      return scheduleTransferRunsSettings;
    }

    /** Returns the builder for the settings used for calls to startManualTransferRuns. */
    public UnaryCallSettings.Builder<
            StartManualTransferRunsRequest, StartManualTransferRunsResponse>
        startManualTransferRunsSettings() {
      return startManualTransferRunsSettings;
    }

    /** Returns the builder for the settings used for calls to getTransferRun. */
    public UnaryCallSettings.Builder<GetTransferRunRequest, TransferRun> getTransferRunSettings() {
      return getTransferRunSettings;
    }

    /** Returns the builder for the settings used for calls to deleteTransferRun. */
    public UnaryCallSettings.Builder<DeleteTransferRunRequest, Empty> deleteTransferRunSettings() {
      return deleteTransferRunSettings;
    }

    /** Returns the builder for the settings used for calls to listTransferRuns. */
    public PagedCallSettings.Builder<
            ListTransferRunsRequest, ListTransferRunsResponse, ListTransferRunsPagedResponse>
        listTransferRunsSettings() {
      return listTransferRunsSettings;
    }

    /** Returns the builder for the settings used for calls to listTransferLogs. */
    public PagedCallSettings.Builder<
            ListTransferLogsRequest, ListTransferLogsResponse, ListTransferLogsPagedResponse>
        listTransferLogsSettings() {
      return listTransferLogsSettings;
    }

    /** Returns the builder for the settings used for calls to checkValidCreds. */
    public UnaryCallSettings.Builder<CheckValidCredsRequest, CheckValidCredsResponse>
        checkValidCredsSettings() {
      return checkValidCredsSettings;
    }

    /** Returns the builder for the settings used for calls to enrollDataSources. */
    public UnaryCallSettings.Builder<EnrollDataSourcesRequest, Empty> enrollDataSourcesSettings() {
      return enrollDataSourcesSettings;
    }

    /** Returns the builder for the settings used for calls to listLocations. */
    public PagedCallSettings.Builder<
            ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
        listLocationsSettings() {
      return listLocationsSettings;
    }

    /** Returns the builder for the settings used for calls to getLocation. */
    public UnaryCallSettings.Builder<GetLocationRequest, Location> getLocationSettings() {
      return getLocationSettings;
    }

    @Override
    public DataTransferServiceStubSettings build() throws IOException {
      return new DataTransferServiceStubSettings(this);
    }
  }
}
