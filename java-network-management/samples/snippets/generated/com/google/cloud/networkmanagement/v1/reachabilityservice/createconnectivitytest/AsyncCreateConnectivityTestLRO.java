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

package com.google.cloud.networkmanagement.v1.samples;

// [START networkmanagement_v1_generated_ReachabilityService_CreateConnectivityTest_LRO_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.networkmanagement.v1.ConnectivityTest;
import com.google.cloud.networkmanagement.v1.CreateConnectivityTestRequest;
import com.google.cloud.networkmanagement.v1.OperationMetadata;
import com.google.cloud.networkmanagement.v1.ReachabilityServiceClient;

public class AsyncCreateConnectivityTestLRO {

  public static void main(String[] args) throws Exception {
    asyncCreateConnectivityTestLRO();
  }

  public static void asyncCreateConnectivityTestLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ReachabilityServiceClient reachabilityServiceClient = ReachabilityServiceClient.create()) {
      CreateConnectivityTestRequest request =
          CreateConnectivityTestRequest.newBuilder()
              .setParent("parent-995424086")
              .setTestId("testId-877170355")
              .setResource(ConnectivityTest.newBuilder().build())
              .build();
      OperationFuture<ConnectivityTest, OperationMetadata> future =
          reachabilityServiceClient.createConnectivityTestOperationCallable().futureCall(request);
      // Do something.
      ConnectivityTest response = future.get();
    }
  }
}
// [END networkmanagement_v1_generated_ReachabilityService_CreateConnectivityTest_LRO_async]
