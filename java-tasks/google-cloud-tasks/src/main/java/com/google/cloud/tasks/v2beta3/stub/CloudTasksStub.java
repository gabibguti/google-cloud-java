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

package com.google.cloud.tasks.v2beta3.stub;

import static com.google.cloud.tasks.v2beta3.CloudTasksClient.ListLocationsPagedResponse;
import static com.google.cloud.tasks.v2beta3.CloudTasksClient.ListQueuesPagedResponse;
import static com.google.cloud.tasks.v2beta3.CloudTasksClient.ListTasksPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.cloud.tasks.v2beta3.BufferTaskRequest;
import com.google.cloud.tasks.v2beta3.BufferTaskResponse;
import com.google.cloud.tasks.v2beta3.CreateQueueRequest;
import com.google.cloud.tasks.v2beta3.CreateTaskRequest;
import com.google.cloud.tasks.v2beta3.DeleteQueueRequest;
import com.google.cloud.tasks.v2beta3.DeleteTaskRequest;
import com.google.cloud.tasks.v2beta3.GetQueueRequest;
import com.google.cloud.tasks.v2beta3.GetTaskRequest;
import com.google.cloud.tasks.v2beta3.ListQueuesRequest;
import com.google.cloud.tasks.v2beta3.ListQueuesResponse;
import com.google.cloud.tasks.v2beta3.ListTasksRequest;
import com.google.cloud.tasks.v2beta3.ListTasksResponse;
import com.google.cloud.tasks.v2beta3.PauseQueueRequest;
import com.google.cloud.tasks.v2beta3.PurgeQueueRequest;
import com.google.cloud.tasks.v2beta3.Queue;
import com.google.cloud.tasks.v2beta3.ResumeQueueRequest;
import com.google.cloud.tasks.v2beta3.RunTaskRequest;
import com.google.cloud.tasks.v2beta3.Task;
import com.google.cloud.tasks.v2beta3.UpdateQueueRequest;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the CloudTasks service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@BetaApi
@Generated("by gapic-generator-java")
public abstract class CloudTasksStub implements BackgroundResource {

  public UnaryCallable<ListQueuesRequest, ListQueuesPagedResponse> listQueuesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listQueuesPagedCallable()");
  }

  public UnaryCallable<ListQueuesRequest, ListQueuesResponse> listQueuesCallable() {
    throw new UnsupportedOperationException("Not implemented: listQueuesCallable()");
  }

  public UnaryCallable<GetQueueRequest, Queue> getQueueCallable() {
    throw new UnsupportedOperationException("Not implemented: getQueueCallable()");
  }

  public UnaryCallable<CreateQueueRequest, Queue> createQueueCallable() {
    throw new UnsupportedOperationException("Not implemented: createQueueCallable()");
  }

  public UnaryCallable<UpdateQueueRequest, Queue> updateQueueCallable() {
    throw new UnsupportedOperationException("Not implemented: updateQueueCallable()");
  }

  public UnaryCallable<DeleteQueueRequest, Empty> deleteQueueCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteQueueCallable()");
  }

  public UnaryCallable<PurgeQueueRequest, Queue> purgeQueueCallable() {
    throw new UnsupportedOperationException("Not implemented: purgeQueueCallable()");
  }

  public UnaryCallable<PauseQueueRequest, Queue> pauseQueueCallable() {
    throw new UnsupportedOperationException("Not implemented: pauseQueueCallable()");
  }

  public UnaryCallable<ResumeQueueRequest, Queue> resumeQueueCallable() {
    throw new UnsupportedOperationException("Not implemented: resumeQueueCallable()");
  }

  public UnaryCallable<GetIamPolicyRequest, Policy> getIamPolicyCallable() {
    throw new UnsupportedOperationException("Not implemented: getIamPolicyCallable()");
  }

  public UnaryCallable<SetIamPolicyRequest, Policy> setIamPolicyCallable() {
    throw new UnsupportedOperationException("Not implemented: setIamPolicyCallable()");
  }

  public UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable() {
    throw new UnsupportedOperationException("Not implemented: testIamPermissionsCallable()");
  }

  public UnaryCallable<ListTasksRequest, ListTasksPagedResponse> listTasksPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listTasksPagedCallable()");
  }

  public UnaryCallable<ListTasksRequest, ListTasksResponse> listTasksCallable() {
    throw new UnsupportedOperationException("Not implemented: listTasksCallable()");
  }

  public UnaryCallable<GetTaskRequest, Task> getTaskCallable() {
    throw new UnsupportedOperationException("Not implemented: getTaskCallable()");
  }

  public UnaryCallable<CreateTaskRequest, Task> createTaskCallable() {
    throw new UnsupportedOperationException("Not implemented: createTaskCallable()");
  }

  public UnaryCallable<DeleteTaskRequest, Empty> deleteTaskCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteTaskCallable()");
  }

  public UnaryCallable<RunTaskRequest, Task> runTaskCallable() {
    throw new UnsupportedOperationException("Not implemented: runTaskCallable()");
  }

  public UnaryCallable<BufferTaskRequest, BufferTaskResponse> bufferTaskCallable() {
    throw new UnsupportedOperationException("Not implemented: bufferTaskCallable()");
  }

  public UnaryCallable<ListLocationsRequest, ListLocationsPagedResponse>
      listLocationsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listLocationsPagedCallable()");
  }

  public UnaryCallable<ListLocationsRequest, ListLocationsResponse> listLocationsCallable() {
    throw new UnsupportedOperationException("Not implemented: listLocationsCallable()");
  }

  public UnaryCallable<GetLocationRequest, Location> getLocationCallable() {
    throw new UnsupportedOperationException("Not implemented: getLocationCallable()");
  }

  @Override
  public abstract void close();
}
