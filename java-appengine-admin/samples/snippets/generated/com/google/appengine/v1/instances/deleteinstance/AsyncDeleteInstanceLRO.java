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

package com.google.appengine.v1.samples;

// [START appengine_v1_generated_Instances_DeleteInstance_LRO_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.appengine.v1.DeleteInstanceRequest;
import com.google.appengine.v1.InstancesClient;
import com.google.appengine.v1.OperationMetadataV1;
import com.google.protobuf.Empty;

public class AsyncDeleteInstanceLRO {

  public static void main(String[] args) throws Exception {
    asyncDeleteInstanceLRO();
  }

  public static void asyncDeleteInstanceLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (InstancesClient instancesClient = InstancesClient.create()) {
      DeleteInstanceRequest request =
          DeleteInstanceRequest.newBuilder().setName("name3373707").build();
      OperationFuture<Empty, OperationMetadataV1> future =
          instancesClient.deleteInstanceOperationCallable().futureCall(request);
      // Do something.
      future.get();
    }
  }
}
// [END appengine_v1_generated_Instances_DeleteInstance_LRO_async]
