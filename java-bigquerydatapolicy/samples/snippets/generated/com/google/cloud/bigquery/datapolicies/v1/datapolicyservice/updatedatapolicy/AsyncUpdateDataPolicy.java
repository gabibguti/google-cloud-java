/*
 * Copyright 2022 Google LLC
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

package com.google.cloud.bigquery.datapolicies.v1.samples;

// [START bigquerydatapolicy_v1_generated_DataPolicyService_UpdateDataPolicy_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.bigquery.datapolicies.v1.DataPolicy;
import com.google.cloud.bigquery.datapolicies.v1.DataPolicyServiceClient;
import com.google.cloud.bigquery.datapolicies.v1.UpdateDataPolicyRequest;
import com.google.protobuf.FieldMask;

public class AsyncUpdateDataPolicy {

  public static void main(String[] args) throws Exception {
    asyncUpdateDataPolicy();
  }

  public static void asyncUpdateDataPolicy() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DataPolicyServiceClient dataPolicyServiceClient = DataPolicyServiceClient.create()) {
      UpdateDataPolicyRequest request =
          UpdateDataPolicyRequest.newBuilder()
              .setDataPolicy(DataPolicy.newBuilder().build())
              .setUpdateMask(FieldMask.newBuilder().build())
              .build();
      ApiFuture<DataPolicy> future =
          dataPolicyServiceClient.updateDataPolicyCallable().futureCall(request);
      // Do something.
      DataPolicy response = future.get();
    }
  }
}
// [END bigquerydatapolicy_v1_generated_DataPolicyService_UpdateDataPolicy_async]
