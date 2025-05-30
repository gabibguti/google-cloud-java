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

package com.google.cloud.billing.v1.samples;

// [START cloudbilling_v1_generated_CloudBilling_UpdateProjectBillingInfo_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.billing.v1.CloudBillingClient;
import com.google.cloud.billing.v1.ProjectBillingInfo;
import com.google.cloud.billing.v1.UpdateProjectBillingInfoRequest;

public class AsyncUpdateProjectBillingInfo {

  public static void main(String[] args) throws Exception {
    asyncUpdateProjectBillingInfo();
  }

  public static void asyncUpdateProjectBillingInfo() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (CloudBillingClient cloudBillingClient = CloudBillingClient.create()) {
      UpdateProjectBillingInfoRequest request =
          UpdateProjectBillingInfoRequest.newBuilder()
              .setName("name3373707")
              .setProjectBillingInfo(ProjectBillingInfo.newBuilder().build())
              .build();
      ApiFuture<ProjectBillingInfo> future =
          cloudBillingClient.updateProjectBillingInfoCallable().futureCall(request);
      // Do something.
      ProjectBillingInfo response = future.get();
    }
  }
}
// [END cloudbilling_v1_generated_CloudBilling_UpdateProjectBillingInfo_async]
