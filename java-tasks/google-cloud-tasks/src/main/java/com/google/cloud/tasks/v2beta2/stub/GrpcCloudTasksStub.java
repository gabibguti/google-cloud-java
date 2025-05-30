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

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsBuilder;
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
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.stub.GrpcOperationsStub;
import com.google.protobuf.Empty;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * gRPC stub implementation for the CloudTasks service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class GrpcCloudTasksStub extends CloudTasksStub {
  private static final MethodDescriptor<ListQueuesRequest, ListQueuesResponse>
      listQueuesMethodDescriptor =
          MethodDescriptor.<ListQueuesRequest, ListQueuesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.tasks.v2beta2.CloudTasks/ListQueues")
              .setRequestMarshaller(ProtoUtils.marshaller(ListQueuesRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(ListQueuesResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetQueueRequest, Queue> getQueueMethodDescriptor =
      MethodDescriptor.<GetQueueRequest, Queue>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.tasks.v2beta2.CloudTasks/GetQueue")
          .setRequestMarshaller(ProtoUtils.marshaller(GetQueueRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Queue.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<CreateQueueRequest, Queue> createQueueMethodDescriptor =
      MethodDescriptor.<CreateQueueRequest, Queue>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.tasks.v2beta2.CloudTasks/CreateQueue")
          .setRequestMarshaller(ProtoUtils.marshaller(CreateQueueRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Queue.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<UpdateQueueRequest, Queue> updateQueueMethodDescriptor =
      MethodDescriptor.<UpdateQueueRequest, Queue>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.tasks.v2beta2.CloudTasks/UpdateQueue")
          .setRequestMarshaller(ProtoUtils.marshaller(UpdateQueueRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Queue.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<DeleteQueueRequest, Empty> deleteQueueMethodDescriptor =
      MethodDescriptor.<DeleteQueueRequest, Empty>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.tasks.v2beta2.CloudTasks/DeleteQueue")
          .setRequestMarshaller(ProtoUtils.marshaller(DeleteQueueRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<PurgeQueueRequest, Queue> purgeQueueMethodDescriptor =
      MethodDescriptor.<PurgeQueueRequest, Queue>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.tasks.v2beta2.CloudTasks/PurgeQueue")
          .setRequestMarshaller(ProtoUtils.marshaller(PurgeQueueRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Queue.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<PauseQueueRequest, Queue> pauseQueueMethodDescriptor =
      MethodDescriptor.<PauseQueueRequest, Queue>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.tasks.v2beta2.CloudTasks/PauseQueue")
          .setRequestMarshaller(ProtoUtils.marshaller(PauseQueueRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Queue.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<ResumeQueueRequest, Queue> resumeQueueMethodDescriptor =
      MethodDescriptor.<ResumeQueueRequest, Queue>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.tasks.v2beta2.CloudTasks/ResumeQueue")
          .setRequestMarshaller(ProtoUtils.marshaller(ResumeQueueRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Queue.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<UploadQueueYamlRequest, Empty>
      uploadQueueYamlMethodDescriptor =
          MethodDescriptor.<UploadQueueYamlRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.tasks.v2beta2.CloudTasks/UploadQueueYaml")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UploadQueueYamlRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetIamPolicyRequest, Policy> getIamPolicyMethodDescriptor =
      MethodDescriptor.<GetIamPolicyRequest, Policy>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.tasks.v2beta2.CloudTasks/GetIamPolicy")
          .setRequestMarshaller(ProtoUtils.marshaller(GetIamPolicyRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Policy.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<SetIamPolicyRequest, Policy> setIamPolicyMethodDescriptor =
      MethodDescriptor.<SetIamPolicyRequest, Policy>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.tasks.v2beta2.CloudTasks/SetIamPolicy")
          .setRequestMarshaller(ProtoUtils.marshaller(SetIamPolicyRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Policy.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsMethodDescriptor =
          MethodDescriptor.<TestIamPermissionsRequest, TestIamPermissionsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.tasks.v2beta2.CloudTasks/TestIamPermissions")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(TestIamPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(TestIamPermissionsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ListTasksRequest, ListTasksResponse>
      listTasksMethodDescriptor =
          MethodDescriptor.<ListTasksRequest, ListTasksResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.tasks.v2beta2.CloudTasks/ListTasks")
              .setRequestMarshaller(ProtoUtils.marshaller(ListTasksRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(ListTasksResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetTaskRequest, Task> getTaskMethodDescriptor =
      MethodDescriptor.<GetTaskRequest, Task>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.tasks.v2beta2.CloudTasks/GetTask")
          .setRequestMarshaller(ProtoUtils.marshaller(GetTaskRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Task.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<CreateTaskRequest, Task> createTaskMethodDescriptor =
      MethodDescriptor.<CreateTaskRequest, Task>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.tasks.v2beta2.CloudTasks/CreateTask")
          .setRequestMarshaller(ProtoUtils.marshaller(CreateTaskRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Task.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<DeleteTaskRequest, Empty> deleteTaskMethodDescriptor =
      MethodDescriptor.<DeleteTaskRequest, Empty>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.tasks.v2beta2.CloudTasks/DeleteTask")
          .setRequestMarshaller(ProtoUtils.marshaller(DeleteTaskRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<LeaseTasksRequest, LeaseTasksResponse>
      leaseTasksMethodDescriptor =
          MethodDescriptor.<LeaseTasksRequest, LeaseTasksResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.tasks.v2beta2.CloudTasks/LeaseTasks")
              .setRequestMarshaller(ProtoUtils.marshaller(LeaseTasksRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(LeaseTasksResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<AcknowledgeTaskRequest, Empty>
      acknowledgeTaskMethodDescriptor =
          MethodDescriptor.<AcknowledgeTaskRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.tasks.v2beta2.CloudTasks/AcknowledgeTask")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(AcknowledgeTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<RenewLeaseRequest, Task> renewLeaseMethodDescriptor =
      MethodDescriptor.<RenewLeaseRequest, Task>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.tasks.v2beta2.CloudTasks/RenewLease")
          .setRequestMarshaller(ProtoUtils.marshaller(RenewLeaseRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Task.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<CancelLeaseRequest, Task> cancelLeaseMethodDescriptor =
      MethodDescriptor.<CancelLeaseRequest, Task>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.tasks.v2beta2.CloudTasks/CancelLease")
          .setRequestMarshaller(ProtoUtils.marshaller(CancelLeaseRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Task.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<RunTaskRequest, Task> runTaskMethodDescriptor =
      MethodDescriptor.<RunTaskRequest, Task>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.tasks.v2beta2.CloudTasks/RunTask")
          .setRequestMarshaller(ProtoUtils.marshaller(RunTaskRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Task.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<BufferTaskRequest, BufferTaskResponse>
      bufferTaskMethodDescriptor =
          MethodDescriptor.<BufferTaskRequest, BufferTaskResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.tasks.v2beta2.CloudTasks/BufferTask")
              .setRequestMarshaller(ProtoUtils.marshaller(BufferTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(BufferTaskResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ListLocationsRequest, ListLocationsResponse>
      listLocationsMethodDescriptor =
          MethodDescriptor.<ListLocationsRequest, ListLocationsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.location.Locations/ListLocations")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListLocationsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListLocationsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetLocationRequest, Location> getLocationMethodDescriptor =
      MethodDescriptor.<GetLocationRequest, Location>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.location.Locations/GetLocation")
          .setRequestMarshaller(ProtoUtils.marshaller(GetLocationRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Location.getDefaultInstance()))
          .build();

  private final UnaryCallable<ListQueuesRequest, ListQueuesResponse> listQueuesCallable;
  private final UnaryCallable<ListQueuesRequest, ListQueuesPagedResponse> listQueuesPagedCallable;
  private final UnaryCallable<GetQueueRequest, Queue> getQueueCallable;
  private final UnaryCallable<CreateQueueRequest, Queue> createQueueCallable;
  private final UnaryCallable<UpdateQueueRequest, Queue> updateQueueCallable;
  private final UnaryCallable<DeleteQueueRequest, Empty> deleteQueueCallable;
  private final UnaryCallable<PurgeQueueRequest, Queue> purgeQueueCallable;
  private final UnaryCallable<PauseQueueRequest, Queue> pauseQueueCallable;
  private final UnaryCallable<ResumeQueueRequest, Queue> resumeQueueCallable;
  private final UnaryCallable<UploadQueueYamlRequest, Empty> uploadQueueYamlCallable;
  private final UnaryCallable<GetIamPolicyRequest, Policy> getIamPolicyCallable;
  private final UnaryCallable<SetIamPolicyRequest, Policy> setIamPolicyCallable;
  private final UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable;
  private final UnaryCallable<ListTasksRequest, ListTasksResponse> listTasksCallable;
  private final UnaryCallable<ListTasksRequest, ListTasksPagedResponse> listTasksPagedCallable;
  private final UnaryCallable<GetTaskRequest, Task> getTaskCallable;
  private final UnaryCallable<CreateTaskRequest, Task> createTaskCallable;
  private final UnaryCallable<DeleteTaskRequest, Empty> deleteTaskCallable;
  private final UnaryCallable<LeaseTasksRequest, LeaseTasksResponse> leaseTasksCallable;
  private final UnaryCallable<AcknowledgeTaskRequest, Empty> acknowledgeTaskCallable;
  private final UnaryCallable<RenewLeaseRequest, Task> renewLeaseCallable;
  private final UnaryCallable<CancelLeaseRequest, Task> cancelLeaseCallable;
  private final UnaryCallable<RunTaskRequest, Task> runTaskCallable;
  private final UnaryCallable<BufferTaskRequest, BufferTaskResponse> bufferTaskCallable;
  private final UnaryCallable<ListLocationsRequest, ListLocationsResponse> listLocationsCallable;
  private final UnaryCallable<ListLocationsRequest, ListLocationsPagedResponse>
      listLocationsPagedCallable;
  private final UnaryCallable<GetLocationRequest, Location> getLocationCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcCloudTasksStub create(CloudTasksStubSettings settings)
      throws IOException {
    return new GrpcCloudTasksStub(settings, ClientContext.create(settings));
  }

  public static final GrpcCloudTasksStub create(ClientContext clientContext) throws IOException {
    return new GrpcCloudTasksStub(CloudTasksStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcCloudTasksStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcCloudTasksStub(
        CloudTasksStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcCloudTasksStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcCloudTasksStub(CloudTasksStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcCloudTasksCallableFactory());
  }

  /**
   * Constructs an instance of GrpcCloudTasksStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcCloudTasksStub(
      CloudTasksStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<ListQueuesRequest, ListQueuesResponse> listQueuesTransportSettings =
        GrpcCallSettings.<ListQueuesRequest, ListQueuesResponse>newBuilder()
            .setMethodDescriptor(listQueuesMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("parent", String.valueOf(request.getParent()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<GetQueueRequest, Queue> getQueueTransportSettings =
        GrpcCallSettings.<GetQueueRequest, Queue>newBuilder()
            .setMethodDescriptor(getQueueMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<CreateQueueRequest, Queue> createQueueTransportSettings =
        GrpcCallSettings.<CreateQueueRequest, Queue>newBuilder()
            .setMethodDescriptor(createQueueMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("parent", String.valueOf(request.getParent()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<UpdateQueueRequest, Queue> updateQueueTransportSettings =
        GrpcCallSettings.<UpdateQueueRequest, Queue>newBuilder()
            .setMethodDescriptor(updateQueueMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("queue.name", String.valueOf(request.getQueue().getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<DeleteQueueRequest, Empty> deleteQueueTransportSettings =
        GrpcCallSettings.<DeleteQueueRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteQueueMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<PurgeQueueRequest, Queue> purgeQueueTransportSettings =
        GrpcCallSettings.<PurgeQueueRequest, Queue>newBuilder()
            .setMethodDescriptor(purgeQueueMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<PauseQueueRequest, Queue> pauseQueueTransportSettings =
        GrpcCallSettings.<PauseQueueRequest, Queue>newBuilder()
            .setMethodDescriptor(pauseQueueMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<ResumeQueueRequest, Queue> resumeQueueTransportSettings =
        GrpcCallSettings.<ResumeQueueRequest, Queue>newBuilder()
            .setMethodDescriptor(resumeQueueMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<UploadQueueYamlRequest, Empty> uploadQueueYamlTransportSettings =
        GrpcCallSettings.<UploadQueueYamlRequest, Empty>newBuilder()
            .setMethodDescriptor(uploadQueueYamlMethodDescriptor)
            .build();
    GrpcCallSettings<GetIamPolicyRequest, Policy> getIamPolicyTransportSettings =
        GrpcCallSettings.<GetIamPolicyRequest, Policy>newBuilder()
            .setMethodDescriptor(getIamPolicyMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("resource", String.valueOf(request.getResource()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<SetIamPolicyRequest, Policy> setIamPolicyTransportSettings =
        GrpcCallSettings.<SetIamPolicyRequest, Policy>newBuilder()
            .setMethodDescriptor(setIamPolicyMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("resource", String.valueOf(request.getResource()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsTransportSettings =
            GrpcCallSettings.<TestIamPermissionsRequest, TestIamPermissionsResponse>newBuilder()
                .setMethodDescriptor(testIamPermissionsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("resource", String.valueOf(request.getResource()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<ListTasksRequest, ListTasksResponse> listTasksTransportSettings =
        GrpcCallSettings.<ListTasksRequest, ListTasksResponse>newBuilder()
            .setMethodDescriptor(listTasksMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("parent", String.valueOf(request.getParent()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<GetTaskRequest, Task> getTaskTransportSettings =
        GrpcCallSettings.<GetTaskRequest, Task>newBuilder()
            .setMethodDescriptor(getTaskMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<CreateTaskRequest, Task> createTaskTransportSettings =
        GrpcCallSettings.<CreateTaskRequest, Task>newBuilder()
            .setMethodDescriptor(createTaskMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("parent", String.valueOf(request.getParent()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<DeleteTaskRequest, Empty> deleteTaskTransportSettings =
        GrpcCallSettings.<DeleteTaskRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteTaskMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<LeaseTasksRequest, LeaseTasksResponse> leaseTasksTransportSettings =
        GrpcCallSettings.<LeaseTasksRequest, LeaseTasksResponse>newBuilder()
            .setMethodDescriptor(leaseTasksMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("parent", String.valueOf(request.getParent()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<AcknowledgeTaskRequest, Empty> acknowledgeTaskTransportSettings =
        GrpcCallSettings.<AcknowledgeTaskRequest, Empty>newBuilder()
            .setMethodDescriptor(acknowledgeTaskMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<RenewLeaseRequest, Task> renewLeaseTransportSettings =
        GrpcCallSettings.<RenewLeaseRequest, Task>newBuilder()
            .setMethodDescriptor(renewLeaseMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<CancelLeaseRequest, Task> cancelLeaseTransportSettings =
        GrpcCallSettings.<CancelLeaseRequest, Task>newBuilder()
            .setMethodDescriptor(cancelLeaseMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<RunTaskRequest, Task> runTaskTransportSettings =
        GrpcCallSettings.<RunTaskRequest, Task>newBuilder()
            .setMethodDescriptor(runTaskMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<BufferTaskRequest, BufferTaskResponse> bufferTaskTransportSettings =
        GrpcCallSettings.<BufferTaskRequest, BufferTaskResponse>newBuilder()
            .setMethodDescriptor(bufferTaskMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("queue", String.valueOf(request.getQueue()));
                  builder.add("task_id", String.valueOf(request.getTaskId()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<ListLocationsRequest, ListLocationsResponse> listLocationsTransportSettings =
        GrpcCallSettings.<ListLocationsRequest, ListLocationsResponse>newBuilder()
            .setMethodDescriptor(listLocationsMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<GetLocationRequest, Location> getLocationTransportSettings =
        GrpcCallSettings.<GetLocationRequest, Location>newBuilder()
            .setMethodDescriptor(getLocationMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();

    this.listQueuesCallable =
        callableFactory.createUnaryCallable(
            listQueuesTransportSettings, settings.listQueuesSettings(), clientContext);
    this.listQueuesPagedCallable =
        callableFactory.createPagedCallable(
            listQueuesTransportSettings, settings.listQueuesSettings(), clientContext);
    this.getQueueCallable =
        callableFactory.createUnaryCallable(
            getQueueTransportSettings, settings.getQueueSettings(), clientContext);
    this.createQueueCallable =
        callableFactory.createUnaryCallable(
            createQueueTransportSettings, settings.createQueueSettings(), clientContext);
    this.updateQueueCallable =
        callableFactory.createUnaryCallable(
            updateQueueTransportSettings, settings.updateQueueSettings(), clientContext);
    this.deleteQueueCallable =
        callableFactory.createUnaryCallable(
            deleteQueueTransportSettings, settings.deleteQueueSettings(), clientContext);
    this.purgeQueueCallable =
        callableFactory.createUnaryCallable(
            purgeQueueTransportSettings, settings.purgeQueueSettings(), clientContext);
    this.pauseQueueCallable =
        callableFactory.createUnaryCallable(
            pauseQueueTransportSettings, settings.pauseQueueSettings(), clientContext);
    this.resumeQueueCallable =
        callableFactory.createUnaryCallable(
            resumeQueueTransportSettings, settings.resumeQueueSettings(), clientContext);
    this.uploadQueueYamlCallable =
        callableFactory.createUnaryCallable(
            uploadQueueYamlTransportSettings, settings.uploadQueueYamlSettings(), clientContext);
    this.getIamPolicyCallable =
        callableFactory.createUnaryCallable(
            getIamPolicyTransportSettings, settings.getIamPolicySettings(), clientContext);
    this.setIamPolicyCallable =
        callableFactory.createUnaryCallable(
            setIamPolicyTransportSettings, settings.setIamPolicySettings(), clientContext);
    this.testIamPermissionsCallable =
        callableFactory.createUnaryCallable(
            testIamPermissionsTransportSettings,
            settings.testIamPermissionsSettings(),
            clientContext);
    this.listTasksCallable =
        callableFactory.createUnaryCallable(
            listTasksTransportSettings, settings.listTasksSettings(), clientContext);
    this.listTasksPagedCallable =
        callableFactory.createPagedCallable(
            listTasksTransportSettings, settings.listTasksSettings(), clientContext);
    this.getTaskCallable =
        callableFactory.createUnaryCallable(
            getTaskTransportSettings, settings.getTaskSettings(), clientContext);
    this.createTaskCallable =
        callableFactory.createUnaryCallable(
            createTaskTransportSettings, settings.createTaskSettings(), clientContext);
    this.deleteTaskCallable =
        callableFactory.createUnaryCallable(
            deleteTaskTransportSettings, settings.deleteTaskSettings(), clientContext);
    this.leaseTasksCallable =
        callableFactory.createUnaryCallable(
            leaseTasksTransportSettings, settings.leaseTasksSettings(), clientContext);
    this.acknowledgeTaskCallable =
        callableFactory.createUnaryCallable(
            acknowledgeTaskTransportSettings, settings.acknowledgeTaskSettings(), clientContext);
    this.renewLeaseCallable =
        callableFactory.createUnaryCallable(
            renewLeaseTransportSettings, settings.renewLeaseSettings(), clientContext);
    this.cancelLeaseCallable =
        callableFactory.createUnaryCallable(
            cancelLeaseTransportSettings, settings.cancelLeaseSettings(), clientContext);
    this.runTaskCallable =
        callableFactory.createUnaryCallable(
            runTaskTransportSettings, settings.runTaskSettings(), clientContext);
    this.bufferTaskCallable =
        callableFactory.createUnaryCallable(
            bufferTaskTransportSettings, settings.bufferTaskSettings(), clientContext);
    this.listLocationsCallable =
        callableFactory.createUnaryCallable(
            listLocationsTransportSettings, settings.listLocationsSettings(), clientContext);
    this.listLocationsPagedCallable =
        callableFactory.createPagedCallable(
            listLocationsTransportSettings, settings.listLocationsSettings(), clientContext);
    this.getLocationCallable =
        callableFactory.createUnaryCallable(
            getLocationTransportSettings, settings.getLocationSettings(), clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<ListQueuesRequest, ListQueuesResponse> listQueuesCallable() {
    return listQueuesCallable;
  }

  @Override
  public UnaryCallable<ListQueuesRequest, ListQueuesPagedResponse> listQueuesPagedCallable() {
    return listQueuesPagedCallable;
  }

  @Override
  public UnaryCallable<GetQueueRequest, Queue> getQueueCallable() {
    return getQueueCallable;
  }

  @Override
  public UnaryCallable<CreateQueueRequest, Queue> createQueueCallable() {
    return createQueueCallable;
  }

  @Override
  public UnaryCallable<UpdateQueueRequest, Queue> updateQueueCallable() {
    return updateQueueCallable;
  }

  @Override
  public UnaryCallable<DeleteQueueRequest, Empty> deleteQueueCallable() {
    return deleteQueueCallable;
  }

  @Override
  public UnaryCallable<PurgeQueueRequest, Queue> purgeQueueCallable() {
    return purgeQueueCallable;
  }

  @Override
  public UnaryCallable<PauseQueueRequest, Queue> pauseQueueCallable() {
    return pauseQueueCallable;
  }

  @Override
  public UnaryCallable<ResumeQueueRequest, Queue> resumeQueueCallable() {
    return resumeQueueCallable;
  }

  @Override
  public UnaryCallable<UploadQueueYamlRequest, Empty> uploadQueueYamlCallable() {
    return uploadQueueYamlCallable;
  }

  @Override
  public UnaryCallable<GetIamPolicyRequest, Policy> getIamPolicyCallable() {
    return getIamPolicyCallable;
  }

  @Override
  public UnaryCallable<SetIamPolicyRequest, Policy> setIamPolicyCallable() {
    return setIamPolicyCallable;
  }

  @Override
  public UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable() {
    return testIamPermissionsCallable;
  }

  @Override
  public UnaryCallable<ListTasksRequest, ListTasksResponse> listTasksCallable() {
    return listTasksCallable;
  }

  @Override
  public UnaryCallable<ListTasksRequest, ListTasksPagedResponse> listTasksPagedCallable() {
    return listTasksPagedCallable;
  }

  @Override
  public UnaryCallable<GetTaskRequest, Task> getTaskCallable() {
    return getTaskCallable;
  }

  @Override
  public UnaryCallable<CreateTaskRequest, Task> createTaskCallable() {
    return createTaskCallable;
  }

  @Override
  public UnaryCallable<DeleteTaskRequest, Empty> deleteTaskCallable() {
    return deleteTaskCallable;
  }

  @Override
  public UnaryCallable<LeaseTasksRequest, LeaseTasksResponse> leaseTasksCallable() {
    return leaseTasksCallable;
  }

  @Override
  public UnaryCallable<AcknowledgeTaskRequest, Empty> acknowledgeTaskCallable() {
    return acknowledgeTaskCallable;
  }

  @Override
  public UnaryCallable<RenewLeaseRequest, Task> renewLeaseCallable() {
    return renewLeaseCallable;
  }

  @Override
  public UnaryCallable<CancelLeaseRequest, Task> cancelLeaseCallable() {
    return cancelLeaseCallable;
  }

  @Override
  public UnaryCallable<RunTaskRequest, Task> runTaskCallable() {
    return runTaskCallable;
  }

  @Override
  public UnaryCallable<BufferTaskRequest, BufferTaskResponse> bufferTaskCallable() {
    return bufferTaskCallable;
  }

  @Override
  public UnaryCallable<ListLocationsRequest, ListLocationsResponse> listLocationsCallable() {
    return listLocationsCallable;
  }

  @Override
  public UnaryCallable<ListLocationsRequest, ListLocationsPagedResponse>
      listLocationsPagedCallable() {
    return listLocationsPagedCallable;
  }

  @Override
  public UnaryCallable<GetLocationRequest, Location> getLocationCallable() {
    return getLocationCallable;
  }

  @Override
  public final void close() {
    try {
      backgroundResources.close();
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException("Failed to close resource", e);
    }
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
