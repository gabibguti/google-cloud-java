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

package com.google.cloud.tasks.v2beta2;

import com.google.api.core.BetaApi;
import com.google.cloud.tasks.v2beta2.CloudTasksGrpc.CloudTasksImplBase;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.annotation.Generated;

@BetaApi
@Generated("by gapic-generator-java")
public class MockCloudTasksImpl extends CloudTasksImplBase {
  private List<AbstractMessage> requests;
  private Queue<Object> responses;

  public MockCloudTasksImpl() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  public List<AbstractMessage> getRequests() {
    return requests;
  }

  public void addResponse(AbstractMessage response) {
    responses.add(response);
  }

  public void setResponses(List<AbstractMessage> responses) {
    this.responses = new LinkedList<Object>(responses);
  }

  public void addException(Exception exception) {
    responses.add(exception);
  }

  public void reset() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  @Override
  public void listQueues(
      ListQueuesRequest request, StreamObserver<ListQueuesResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof ListQueuesResponse) {
      requests.add(request);
      responseObserver.onNext(((ListQueuesResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method ListQueues, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  ListQueuesResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void getQueue(
      GetQueueRequest request,
      StreamObserver<com.google.cloud.tasks.v2beta2.Queue> responseObserver) {
    Object response = responses.poll();
    if (response instanceof com.google.cloud.tasks.v2beta2.Queue) {
      requests.add(request);
      responseObserver.onNext(((com.google.cloud.tasks.v2beta2.Queue) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method GetQueue, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  com.google.cloud.tasks.v2beta2.Queue.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void createQueue(
      CreateQueueRequest request,
      StreamObserver<com.google.cloud.tasks.v2beta2.Queue> responseObserver) {
    Object response = responses.poll();
    if (response instanceof com.google.cloud.tasks.v2beta2.Queue) {
      requests.add(request);
      responseObserver.onNext(((com.google.cloud.tasks.v2beta2.Queue) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method CreateQueue, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  com.google.cloud.tasks.v2beta2.Queue.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void updateQueue(
      UpdateQueueRequest request,
      StreamObserver<com.google.cloud.tasks.v2beta2.Queue> responseObserver) {
    Object response = responses.poll();
    if (response instanceof com.google.cloud.tasks.v2beta2.Queue) {
      requests.add(request);
      responseObserver.onNext(((com.google.cloud.tasks.v2beta2.Queue) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method UpdateQueue, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  com.google.cloud.tasks.v2beta2.Queue.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void deleteQueue(DeleteQueueRequest request, StreamObserver<Empty> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Empty) {
      requests.add(request);
      responseObserver.onNext(((Empty) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method DeleteQueue, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Empty.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void purgeQueue(
      PurgeQueueRequest request,
      StreamObserver<com.google.cloud.tasks.v2beta2.Queue> responseObserver) {
    Object response = responses.poll();
    if (response instanceof com.google.cloud.tasks.v2beta2.Queue) {
      requests.add(request);
      responseObserver.onNext(((com.google.cloud.tasks.v2beta2.Queue) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method PurgeQueue, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  com.google.cloud.tasks.v2beta2.Queue.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void pauseQueue(
      PauseQueueRequest request,
      StreamObserver<com.google.cloud.tasks.v2beta2.Queue> responseObserver) {
    Object response = responses.poll();
    if (response instanceof com.google.cloud.tasks.v2beta2.Queue) {
      requests.add(request);
      responseObserver.onNext(((com.google.cloud.tasks.v2beta2.Queue) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method PauseQueue, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  com.google.cloud.tasks.v2beta2.Queue.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void resumeQueue(
      ResumeQueueRequest request,
      StreamObserver<com.google.cloud.tasks.v2beta2.Queue> responseObserver) {
    Object response = responses.poll();
    if (response instanceof com.google.cloud.tasks.v2beta2.Queue) {
      requests.add(request);
      responseObserver.onNext(((com.google.cloud.tasks.v2beta2.Queue) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method ResumeQueue, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  com.google.cloud.tasks.v2beta2.Queue.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void uploadQueueYaml(
      UploadQueueYamlRequest request, StreamObserver<Empty> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Empty) {
      requests.add(request);
      responseObserver.onNext(((Empty) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method UploadQueueYaml, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Empty.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void getIamPolicy(GetIamPolicyRequest request, StreamObserver<Policy> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Policy) {
      requests.add(request);
      responseObserver.onNext(((Policy) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method GetIamPolicy, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Policy.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void setIamPolicy(SetIamPolicyRequest request, StreamObserver<Policy> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Policy) {
      requests.add(request);
      responseObserver.onNext(((Policy) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method SetIamPolicy, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Policy.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void testIamPermissions(
      TestIamPermissionsRequest request,
      StreamObserver<TestIamPermissionsResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof TestIamPermissionsResponse) {
      requests.add(request);
      responseObserver.onNext(((TestIamPermissionsResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method TestIamPermissions, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  TestIamPermissionsResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void listTasks(
      ListTasksRequest request, StreamObserver<ListTasksResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof ListTasksResponse) {
      requests.add(request);
      responseObserver.onNext(((ListTasksResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method ListTasks, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  ListTasksResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void getTask(GetTaskRequest request, StreamObserver<Task> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Task) {
      requests.add(request);
      responseObserver.onNext(((Task) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method GetTask, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Task.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void createTask(CreateTaskRequest request, StreamObserver<Task> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Task) {
      requests.add(request);
      responseObserver.onNext(((Task) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method CreateTask, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Task.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void deleteTask(DeleteTaskRequest request, StreamObserver<Empty> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Empty) {
      requests.add(request);
      responseObserver.onNext(((Empty) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method DeleteTask, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Empty.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void leaseTasks(
      LeaseTasksRequest request, StreamObserver<LeaseTasksResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof LeaseTasksResponse) {
      requests.add(request);
      responseObserver.onNext(((LeaseTasksResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method LeaseTasks, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  LeaseTasksResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void acknowledgeTask(
      AcknowledgeTaskRequest request, StreamObserver<Empty> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Empty) {
      requests.add(request);
      responseObserver.onNext(((Empty) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method AcknowledgeTask, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Empty.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void renewLease(RenewLeaseRequest request, StreamObserver<Task> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Task) {
      requests.add(request);
      responseObserver.onNext(((Task) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method RenewLease, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Task.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void cancelLease(CancelLeaseRequest request, StreamObserver<Task> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Task) {
      requests.add(request);
      responseObserver.onNext(((Task) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method CancelLease, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Task.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void runTask(RunTaskRequest request, StreamObserver<Task> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Task) {
      requests.add(request);
      responseObserver.onNext(((Task) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method RunTask, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Task.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void bufferTask(
      BufferTaskRequest request, StreamObserver<BufferTaskResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof BufferTaskResponse) {
      requests.add(request);
      responseObserver.onNext(((BufferTaskResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method BufferTask, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  BufferTaskResponse.class.getName(),
                  Exception.class.getName())));
    }
  }
}
