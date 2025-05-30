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

package com.google.cloud.tasks.v2beta2.stub;

import static com.google.cloud.tasks.v2beta2.CloudTasksClient.ListLocationsPagedResponse;
import static com.google.cloud.tasks.v2beta2.CloudTasksClient.ListQueuesPagedResponse;
import static com.google.cloud.tasks.v2beta2.CloudTasksClient.ListTasksPagedResponse;

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
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.cloud.tasks.v2beta2.AcknowledgeTaskRequest;
import com.google.cloud.tasks.v2beta2.BufferTaskRequest;
import com.google.cloud.tasks.v2beta2.BufferTaskResponse;
import com.google.cloud.tasks.v2beta2.CancelLeaseRequest;
import com.google.cloud.tasks.v2beta2.CreateQueueRequest;
import com.google.cloud.tasks.v2beta2.CreateTaskRequest;
import com.google.cloud.tasks.v2beta2.DeleteQueueRequest;
import com.google.cloud.tasks.v2beta2.DeleteTaskRequest;
import com.google.cloud.tasks.v2beta2.GetQueueRequest;
import com.google.cloud.tasks.v2beta2.GetTaskRequest;
import com.google.cloud.tasks.v2beta2.LeaseTasksRequest;
import com.google.cloud.tasks.v2beta2.LeaseTasksResponse;
import com.google.cloud.tasks.v2beta2.ListQueuesRequest;
import com.google.cloud.tasks.v2beta2.ListQueuesResponse;
import com.google.cloud.tasks.v2beta2.ListTasksRequest;
import com.google.cloud.tasks.v2beta2.ListTasksResponse;
import com.google.cloud.tasks.v2beta2.PauseQueueRequest;
import com.google.cloud.tasks.v2beta2.PurgeQueueRequest;
import com.google.cloud.tasks.v2beta2.Queue;
import com.google.cloud.tasks.v2beta2.RenewLeaseRequest;
import com.google.cloud.tasks.v2beta2.ResumeQueueRequest;
import com.google.cloud.tasks.v2beta2.RunTaskRequest;
import com.google.cloud.tasks.v2beta2.Task;
import com.google.cloud.tasks.v2beta2.UpdateQueueRequest;
import com.google.cloud.tasks.v2beta2.UploadQueueYamlRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link CloudTasksStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (cloudtasks.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of getQueue to 30 seconds:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * CloudTasksStubSettings.Builder cloudTasksSettingsBuilder = CloudTasksStubSettings.newBuilder();
 * cloudTasksSettingsBuilder
 *     .getQueueSettings()
 *     .setRetrySettings(
 *         cloudTasksSettingsBuilder
 *             .getQueueSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * CloudTasksStubSettings cloudTasksSettings = cloudTasksSettingsBuilder.build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class CloudTasksStubSettings extends StubSettings<CloudTasksStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/cloud-platform").build();

  private final PagedCallSettings<ListQueuesRequest, ListQueuesResponse, ListQueuesPagedResponse>
      listQueuesSettings;
  private final UnaryCallSettings<GetQueueRequest, Queue> getQueueSettings;
  private final UnaryCallSettings<CreateQueueRequest, Queue> createQueueSettings;
  private final UnaryCallSettings<UpdateQueueRequest, Queue> updateQueueSettings;
  private final UnaryCallSettings<DeleteQueueRequest, Empty> deleteQueueSettings;
  private final UnaryCallSettings<PurgeQueueRequest, Queue> purgeQueueSettings;
  private final UnaryCallSettings<PauseQueueRequest, Queue> pauseQueueSettings;
  private final UnaryCallSettings<ResumeQueueRequest, Queue> resumeQueueSettings;
  private final UnaryCallSettings<UploadQueueYamlRequest, Empty> uploadQueueYamlSettings;
  private final UnaryCallSettings<GetIamPolicyRequest, Policy> getIamPolicySettings;
  private final UnaryCallSettings<SetIamPolicyRequest, Policy> setIamPolicySettings;
  private final UnaryCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsSettings;
  private final PagedCallSettings<ListTasksRequest, ListTasksResponse, ListTasksPagedResponse>
      listTasksSettings;
  private final UnaryCallSettings<GetTaskRequest, Task> getTaskSettings;
  private final UnaryCallSettings<CreateTaskRequest, Task> createTaskSettings;
  private final UnaryCallSettings<DeleteTaskRequest, Empty> deleteTaskSettings;
  private final UnaryCallSettings<LeaseTasksRequest, LeaseTasksResponse> leaseTasksSettings;
  private final UnaryCallSettings<AcknowledgeTaskRequest, Empty> acknowledgeTaskSettings;
  private final UnaryCallSettings<RenewLeaseRequest, Task> renewLeaseSettings;
  private final UnaryCallSettings<CancelLeaseRequest, Task> cancelLeaseSettings;
  private final UnaryCallSettings<RunTaskRequest, Task> runTaskSettings;
  private final UnaryCallSettings<BufferTaskRequest, BufferTaskResponse> bufferTaskSettings;
  private final PagedCallSettings<
          ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
      listLocationsSettings;
  private final UnaryCallSettings<GetLocationRequest, Location> getLocationSettings;

  private static final PagedListDescriptor<ListQueuesRequest, ListQueuesResponse, Queue>
      LIST_QUEUES_PAGE_STR_DESC =
          new PagedListDescriptor<ListQueuesRequest, ListQueuesResponse, Queue>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListQueuesRequest injectToken(ListQueuesRequest payload, String token) {
              return ListQueuesRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListQueuesRequest injectPageSize(ListQueuesRequest payload, int pageSize) {
              return ListQueuesRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListQueuesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListQueuesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Queue> extractResources(ListQueuesResponse payload) {
              return payload.getQueuesList() == null
                  ? ImmutableList.<Queue>of()
                  : payload.getQueuesList();
            }
          };

  private static final PagedListDescriptor<ListTasksRequest, ListTasksResponse, Task>
      LIST_TASKS_PAGE_STR_DESC =
          new PagedListDescriptor<ListTasksRequest, ListTasksResponse, Task>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListTasksRequest injectToken(ListTasksRequest payload, String token) {
              return ListTasksRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListTasksRequest injectPageSize(ListTasksRequest payload, int pageSize) {
              return ListTasksRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListTasksRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListTasksResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Task> extractResources(ListTasksResponse payload) {
              return payload.getTasksList() == null
                  ? ImmutableList.<Task>of()
                  : payload.getTasksList();
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
          ListQueuesRequest, ListQueuesResponse, ListQueuesPagedResponse>
      LIST_QUEUES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListQueuesRequest, ListQueuesResponse, ListQueuesPagedResponse>() {
            @Override
            public ApiFuture<ListQueuesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListQueuesRequest, ListQueuesResponse> callable,
                ListQueuesRequest request,
                ApiCallContext context,
                ApiFuture<ListQueuesResponse> futureResponse) {
              PageContext<ListQueuesRequest, ListQueuesResponse, Queue> pageContext =
                  PageContext.create(callable, LIST_QUEUES_PAGE_STR_DESC, request, context);
              return ListQueuesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListTasksRequest, ListTasksResponse, ListTasksPagedResponse>
      LIST_TASKS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListTasksRequest, ListTasksResponse, ListTasksPagedResponse>() {
            @Override
            public ApiFuture<ListTasksPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListTasksRequest, ListTasksResponse> callable,
                ListTasksRequest request,
                ApiCallContext context,
                ApiFuture<ListTasksResponse> futureResponse) {
              PageContext<ListTasksRequest, ListTasksResponse, Task> pageContext =
                  PageContext.create(callable, LIST_TASKS_PAGE_STR_DESC, request, context);
              return ListTasksPagedResponse.createAsync(pageContext, futureResponse);
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

  /** Returns the object with the settings used for calls to listQueues. */
  public PagedCallSettings<ListQueuesRequest, ListQueuesResponse, ListQueuesPagedResponse>
      listQueuesSettings() {
    return listQueuesSettings;
  }

  /** Returns the object with the settings used for calls to getQueue. */
  public UnaryCallSettings<GetQueueRequest, Queue> getQueueSettings() {
    return getQueueSettings;
  }

  /** Returns the object with the settings used for calls to createQueue. */
  public UnaryCallSettings<CreateQueueRequest, Queue> createQueueSettings() {
    return createQueueSettings;
  }

  /** Returns the object with the settings used for calls to updateQueue. */
  public UnaryCallSettings<UpdateQueueRequest, Queue> updateQueueSettings() {
    return updateQueueSettings;
  }

  /** Returns the object with the settings used for calls to deleteQueue. */
  public UnaryCallSettings<DeleteQueueRequest, Empty> deleteQueueSettings() {
    return deleteQueueSettings;
  }

  /** Returns the object with the settings used for calls to purgeQueue. */
  public UnaryCallSettings<PurgeQueueRequest, Queue> purgeQueueSettings() {
    return purgeQueueSettings;
  }

  /** Returns the object with the settings used for calls to pauseQueue. */
  public UnaryCallSettings<PauseQueueRequest, Queue> pauseQueueSettings() {
    return pauseQueueSettings;
  }

  /** Returns the object with the settings used for calls to resumeQueue. */
  public UnaryCallSettings<ResumeQueueRequest, Queue> resumeQueueSettings() {
    return resumeQueueSettings;
  }

  /** Returns the object with the settings used for calls to uploadQueueYaml. */
  public UnaryCallSettings<UploadQueueYamlRequest, Empty> uploadQueueYamlSettings() {
    return uploadQueueYamlSettings;
  }

  /** Returns the object with the settings used for calls to getIamPolicy. */
  public UnaryCallSettings<GetIamPolicyRequest, Policy> getIamPolicySettings() {
    return getIamPolicySettings;
  }

  /** Returns the object with the settings used for calls to setIamPolicy. */
  public UnaryCallSettings<SetIamPolicyRequest, Policy> setIamPolicySettings() {
    return setIamPolicySettings;
  }

  /** Returns the object with the settings used for calls to testIamPermissions. */
  public UnaryCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsSettings() {
    return testIamPermissionsSettings;
  }

  /** Returns the object with the settings used for calls to listTasks. */
  public PagedCallSettings<ListTasksRequest, ListTasksResponse, ListTasksPagedResponse>
      listTasksSettings() {
    return listTasksSettings;
  }

  /** Returns the object with the settings used for calls to getTask. */
  public UnaryCallSettings<GetTaskRequest, Task> getTaskSettings() {
    return getTaskSettings;
  }

  /** Returns the object with the settings used for calls to createTask. */
  public UnaryCallSettings<CreateTaskRequest, Task> createTaskSettings() {
    return createTaskSettings;
  }

  /** Returns the object with the settings used for calls to deleteTask. */
  public UnaryCallSettings<DeleteTaskRequest, Empty> deleteTaskSettings() {
    return deleteTaskSettings;
  }

  /** Returns the object with the settings used for calls to leaseTasks. */
  public UnaryCallSettings<LeaseTasksRequest, LeaseTasksResponse> leaseTasksSettings() {
    return leaseTasksSettings;
  }

  /** Returns the object with the settings used for calls to acknowledgeTask. */
  public UnaryCallSettings<AcknowledgeTaskRequest, Empty> acknowledgeTaskSettings() {
    return acknowledgeTaskSettings;
  }

  /** Returns the object with the settings used for calls to renewLease. */
  public UnaryCallSettings<RenewLeaseRequest, Task> renewLeaseSettings() {
    return renewLeaseSettings;
  }

  /** Returns the object with the settings used for calls to cancelLease. */
  public UnaryCallSettings<CancelLeaseRequest, Task> cancelLeaseSettings() {
    return cancelLeaseSettings;
  }

  /** Returns the object with the settings used for calls to runTask. */
  public UnaryCallSettings<RunTaskRequest, Task> runTaskSettings() {
    return runTaskSettings;
  }

  /** Returns the object with the settings used for calls to bufferTask. */
  public UnaryCallSettings<BufferTaskRequest, BufferTaskResponse> bufferTaskSettings() {
    return bufferTaskSettings;
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

  public CloudTasksStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcCloudTasksStub.create(this);
    }
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonCloudTasksStub.create(this);
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
    return "cloudtasks.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "cloudtasks.mtls.googleapis.com:443";
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
            "gapic", GaxProperties.getLibraryVersion(CloudTasksStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultHttpJsonApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(CloudTasksStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return CloudTasksStubSettings.defaultGrpcApiClientHeaderProviderBuilder();
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

  protected CloudTasksStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    listQueuesSettings = settingsBuilder.listQueuesSettings().build();
    getQueueSettings = settingsBuilder.getQueueSettings().build();
    createQueueSettings = settingsBuilder.createQueueSettings().build();
    updateQueueSettings = settingsBuilder.updateQueueSettings().build();
    deleteQueueSettings = settingsBuilder.deleteQueueSettings().build();
    purgeQueueSettings = settingsBuilder.purgeQueueSettings().build();
    pauseQueueSettings = settingsBuilder.pauseQueueSettings().build();
    resumeQueueSettings = settingsBuilder.resumeQueueSettings().build();
    uploadQueueYamlSettings = settingsBuilder.uploadQueueYamlSettings().build();
    getIamPolicySettings = settingsBuilder.getIamPolicySettings().build();
    setIamPolicySettings = settingsBuilder.setIamPolicySettings().build();
    testIamPermissionsSettings = settingsBuilder.testIamPermissionsSettings().build();
    listTasksSettings = settingsBuilder.listTasksSettings().build();
    getTaskSettings = settingsBuilder.getTaskSettings().build();
    createTaskSettings = settingsBuilder.createTaskSettings().build();
    deleteTaskSettings = settingsBuilder.deleteTaskSettings().build();
    leaseTasksSettings = settingsBuilder.leaseTasksSettings().build();
    acknowledgeTaskSettings = settingsBuilder.acknowledgeTaskSettings().build();
    renewLeaseSettings = settingsBuilder.renewLeaseSettings().build();
    cancelLeaseSettings = settingsBuilder.cancelLeaseSettings().build();
    runTaskSettings = settingsBuilder.runTaskSettings().build();
    bufferTaskSettings = settingsBuilder.bufferTaskSettings().build();
    listLocationsSettings = settingsBuilder.listLocationsSettings().build();
    getLocationSettings = settingsBuilder.getLocationSettings().build();
  }

  /** Builder for CloudTasksStubSettings. */
  public static class Builder extends StubSettings.Builder<CloudTasksStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final PagedCallSettings.Builder<
            ListQueuesRequest, ListQueuesResponse, ListQueuesPagedResponse>
        listQueuesSettings;
    private final UnaryCallSettings.Builder<GetQueueRequest, Queue> getQueueSettings;
    private final UnaryCallSettings.Builder<CreateQueueRequest, Queue> createQueueSettings;
    private final UnaryCallSettings.Builder<UpdateQueueRequest, Queue> updateQueueSettings;
    private final UnaryCallSettings.Builder<DeleteQueueRequest, Empty> deleteQueueSettings;
    private final UnaryCallSettings.Builder<PurgeQueueRequest, Queue> purgeQueueSettings;
    private final UnaryCallSettings.Builder<PauseQueueRequest, Queue> pauseQueueSettings;
    private final UnaryCallSettings.Builder<ResumeQueueRequest, Queue> resumeQueueSettings;
    private final UnaryCallSettings.Builder<UploadQueueYamlRequest, Empty> uploadQueueYamlSettings;
    private final UnaryCallSettings.Builder<GetIamPolicyRequest, Policy> getIamPolicySettings;
    private final UnaryCallSettings.Builder<SetIamPolicyRequest, Policy> setIamPolicySettings;
    private final UnaryCallSettings.Builder<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsSettings;
    private final PagedCallSettings.Builder<
            ListTasksRequest, ListTasksResponse, ListTasksPagedResponse>
        listTasksSettings;
    private final UnaryCallSettings.Builder<GetTaskRequest, Task> getTaskSettings;
    private final UnaryCallSettings.Builder<CreateTaskRequest, Task> createTaskSettings;
    private final UnaryCallSettings.Builder<DeleteTaskRequest, Empty> deleteTaskSettings;
    private final UnaryCallSettings.Builder<LeaseTasksRequest, LeaseTasksResponse>
        leaseTasksSettings;
    private final UnaryCallSettings.Builder<AcknowledgeTaskRequest, Empty> acknowledgeTaskSettings;
    private final UnaryCallSettings.Builder<RenewLeaseRequest, Task> renewLeaseSettings;
    private final UnaryCallSettings.Builder<CancelLeaseRequest, Task> cancelLeaseSettings;
    private final UnaryCallSettings.Builder<RunTaskRequest, Task> runTaskSettings;
    private final UnaryCallSettings.Builder<BufferTaskRequest, BufferTaskResponse>
        bufferTaskSettings;
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
              .setMaxRetryDelay(Duration.ofMillis(10000L))
              .setInitialRpcTimeout(Duration.ofMillis(20000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(20000L))
              .setTotalTimeout(Duration.ofMillis(20000L))
              .build();
      definitions.put("retry_policy_0_params", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRpcTimeout(Duration.ofMillis(20000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(20000L))
              .setTotalTimeout(Duration.ofMillis(20000L))
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

      listQueuesSettings = PagedCallSettings.newBuilder(LIST_QUEUES_PAGE_STR_FACT);
      getQueueSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createQueueSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateQueueSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteQueueSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      purgeQueueSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      pauseQueueSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      resumeQueueSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      uploadQueueYamlSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getIamPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      setIamPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      testIamPermissionsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listTasksSettings = PagedCallSettings.newBuilder(LIST_TASKS_PAGE_STR_FACT);
      getTaskSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createTaskSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteTaskSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      leaseTasksSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      acknowledgeTaskSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      renewLeaseSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      cancelLeaseSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      runTaskSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      bufferTaskSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listLocationsSettings = PagedCallSettings.newBuilder(LIST_LOCATIONS_PAGE_STR_FACT);
      getLocationSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listQueuesSettings,
              getQueueSettings,
              createQueueSettings,
              updateQueueSettings,
              deleteQueueSettings,
              purgeQueueSettings,
              pauseQueueSettings,
              resumeQueueSettings,
              uploadQueueYamlSettings,
              getIamPolicySettings,
              setIamPolicySettings,
              testIamPermissionsSettings,
              listTasksSettings,
              getTaskSettings,
              createTaskSettings,
              deleteTaskSettings,
              leaseTasksSettings,
              acknowledgeTaskSettings,
              renewLeaseSettings,
              cancelLeaseSettings,
              runTaskSettings,
              bufferTaskSettings,
              listLocationsSettings,
              getLocationSettings);
      initDefaults(this);
    }

    protected Builder(CloudTasksStubSettings settings) {
      super(settings);

      listQueuesSettings = settings.listQueuesSettings.toBuilder();
      getQueueSettings = settings.getQueueSettings.toBuilder();
      createQueueSettings = settings.createQueueSettings.toBuilder();
      updateQueueSettings = settings.updateQueueSettings.toBuilder();
      deleteQueueSettings = settings.deleteQueueSettings.toBuilder();
      purgeQueueSettings = settings.purgeQueueSettings.toBuilder();
      pauseQueueSettings = settings.pauseQueueSettings.toBuilder();
      resumeQueueSettings = settings.resumeQueueSettings.toBuilder();
      uploadQueueYamlSettings = settings.uploadQueueYamlSettings.toBuilder();
      getIamPolicySettings = settings.getIamPolicySettings.toBuilder();
      setIamPolicySettings = settings.setIamPolicySettings.toBuilder();
      testIamPermissionsSettings = settings.testIamPermissionsSettings.toBuilder();
      listTasksSettings = settings.listTasksSettings.toBuilder();
      getTaskSettings = settings.getTaskSettings.toBuilder();
      createTaskSettings = settings.createTaskSettings.toBuilder();
      deleteTaskSettings = settings.deleteTaskSettings.toBuilder();
      leaseTasksSettings = settings.leaseTasksSettings.toBuilder();
      acknowledgeTaskSettings = settings.acknowledgeTaskSettings.toBuilder();
      renewLeaseSettings = settings.renewLeaseSettings.toBuilder();
      cancelLeaseSettings = settings.cancelLeaseSettings.toBuilder();
      runTaskSettings = settings.runTaskSettings.toBuilder();
      bufferTaskSettings = settings.bufferTaskSettings.toBuilder();
      listLocationsSettings = settings.listLocationsSettings.toBuilder();
      getLocationSettings = settings.getLocationSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listQueuesSettings,
              getQueueSettings,
              createQueueSettings,
              updateQueueSettings,
              deleteQueueSettings,
              purgeQueueSettings,
              pauseQueueSettings,
              resumeQueueSettings,
              uploadQueueYamlSettings,
              getIamPolicySettings,
              setIamPolicySettings,
              testIamPermissionsSettings,
              listTasksSettings,
              getTaskSettings,
              createTaskSettings,
              deleteTaskSettings,
              leaseTasksSettings,
              acknowledgeTaskSettings,
              renewLeaseSettings,
              cancelLeaseSettings,
              runTaskSettings,
              bufferTaskSettings,
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
          .listQueuesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getQueueSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .createQueueSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .updateQueueSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .deleteQueueSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .purgeQueueSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .pauseQueueSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .resumeQueueSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .uploadQueueYamlSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .getIamPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .setIamPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .testIamPermissionsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listTasksSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getTaskSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .createTaskSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .deleteTaskSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .leaseTasksSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .acknowledgeTaskSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .renewLeaseSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .cancelLeaseSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .runTaskSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .bufferTaskSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

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

    /** Returns the builder for the settings used for calls to listQueues. */
    public PagedCallSettings.Builder<ListQueuesRequest, ListQueuesResponse, ListQueuesPagedResponse>
        listQueuesSettings() {
      return listQueuesSettings;
    }

    /** Returns the builder for the settings used for calls to getQueue. */
    public UnaryCallSettings.Builder<GetQueueRequest, Queue> getQueueSettings() {
      return getQueueSettings;
    }

    /** Returns the builder for the settings used for calls to createQueue. */
    public UnaryCallSettings.Builder<CreateQueueRequest, Queue> createQueueSettings() {
      return createQueueSettings;
    }

    /** Returns the builder for the settings used for calls to updateQueue. */
    public UnaryCallSettings.Builder<UpdateQueueRequest, Queue> updateQueueSettings() {
      return updateQueueSettings;
    }

    /** Returns the builder for the settings used for calls to deleteQueue. */
    public UnaryCallSettings.Builder<DeleteQueueRequest, Empty> deleteQueueSettings() {
      return deleteQueueSettings;
    }

    /** Returns the builder for the settings used for calls to purgeQueue. */
    public UnaryCallSettings.Builder<PurgeQueueRequest, Queue> purgeQueueSettings() {
      return purgeQueueSettings;
    }

    /** Returns the builder for the settings used for calls to pauseQueue. */
    public UnaryCallSettings.Builder<PauseQueueRequest, Queue> pauseQueueSettings() {
      return pauseQueueSettings;
    }

    /** Returns the builder for the settings used for calls to resumeQueue. */
    public UnaryCallSettings.Builder<ResumeQueueRequest, Queue> resumeQueueSettings() {
      return resumeQueueSettings;
    }

    /** Returns the builder for the settings used for calls to uploadQueueYaml. */
    public UnaryCallSettings.Builder<UploadQueueYamlRequest, Empty> uploadQueueYamlSettings() {
      return uploadQueueYamlSettings;
    }

    /** Returns the builder for the settings used for calls to getIamPolicy. */
    public UnaryCallSettings.Builder<GetIamPolicyRequest, Policy> getIamPolicySettings() {
      return getIamPolicySettings;
    }

    /** Returns the builder for the settings used for calls to setIamPolicy. */
    public UnaryCallSettings.Builder<SetIamPolicyRequest, Policy> setIamPolicySettings() {
      return setIamPolicySettings;
    }

    /** Returns the builder for the settings used for calls to testIamPermissions. */
    public UnaryCallSettings.Builder<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsSettings() {
      return testIamPermissionsSettings;
    }

    /** Returns the builder for the settings used for calls to listTasks. */
    public PagedCallSettings.Builder<ListTasksRequest, ListTasksResponse, ListTasksPagedResponse>
        listTasksSettings() {
      return listTasksSettings;
    }

    /** Returns the builder for the settings used for calls to getTask. */
    public UnaryCallSettings.Builder<GetTaskRequest, Task> getTaskSettings() {
      return getTaskSettings;
    }

    /** Returns the builder for the settings used for calls to createTask. */
    public UnaryCallSettings.Builder<CreateTaskRequest, Task> createTaskSettings() {
      return createTaskSettings;
    }

    /** Returns the builder for the settings used for calls to deleteTask. */
    public UnaryCallSettings.Builder<DeleteTaskRequest, Empty> deleteTaskSettings() {
      return deleteTaskSettings;
    }

    /** Returns the builder for the settings used for calls to leaseTasks. */
    public UnaryCallSettings.Builder<LeaseTasksRequest, LeaseTasksResponse> leaseTasksSettings() {
      return leaseTasksSettings;
    }

    /** Returns the builder for the settings used for calls to acknowledgeTask. */
    public UnaryCallSettings.Builder<AcknowledgeTaskRequest, Empty> acknowledgeTaskSettings() {
      return acknowledgeTaskSettings;
    }

    /** Returns the builder for the settings used for calls to renewLease. */
    public UnaryCallSettings.Builder<RenewLeaseRequest, Task> renewLeaseSettings() {
      return renewLeaseSettings;
    }

    /** Returns the builder for the settings used for calls to cancelLease. */
    public UnaryCallSettings.Builder<CancelLeaseRequest, Task> cancelLeaseSettings() {
      return cancelLeaseSettings;
    }

    /** Returns the builder for the settings used for calls to runTask. */
    public UnaryCallSettings.Builder<RunTaskRequest, Task> runTaskSettings() {
      return runTaskSettings;
    }

    /** Returns the builder for the settings used for calls to bufferTask. */
    public UnaryCallSettings.Builder<BufferTaskRequest, BufferTaskResponse> bufferTaskSettings() {
      return bufferTaskSettings;
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
    public CloudTasksStubSettings build() throws IOException {
      return new CloudTasksStubSettings(this);
    }
  }
}
