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

package com.google.cloud.devtools.cloudbuild.v1.samples;

// [START cloudbuild_v1_generated_CloudBuild_CreateBuild_LRO_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.devtools.cloudbuild.v1.CloudBuildClient;
import com.google.cloudbuild.v1.Build;
import com.google.cloudbuild.v1.BuildOperationMetadata;
import com.google.cloudbuild.v1.CreateBuildRequest;
import com.google.cloudbuild.v1.LocationName;

public class AsyncCreateBuildLRO {

  public static void main(String[] args) throws Exception {
    asyncCreateBuildLRO();
  }

  public static void asyncCreateBuildLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (CloudBuildClient cloudBuildClient = CloudBuildClient.create()) {
      CreateBuildRequest request =
          CreateBuildRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setProjectId("projectId-894832108")
              .setBuild(Build.newBuilder().build())
              .build();
      OperationFuture<Build, BuildOperationMetadata> future =
          cloudBuildClient.createBuildOperationCallable().futureCall(request);
      // Do something.
      Build response = future.get();
    }
  }
}
// [END cloudbuild_v1_generated_CloudBuild_CreateBuild_LRO_async]
