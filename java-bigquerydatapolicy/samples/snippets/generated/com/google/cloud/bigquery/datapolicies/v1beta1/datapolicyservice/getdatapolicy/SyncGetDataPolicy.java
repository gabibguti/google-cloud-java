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

package com.google.cloud.bigquery.datapolicies.v1beta1.samples;

// [START bigquerydatapolicy_v1beta1_generated_DataPolicyService_GetDataPolicy_sync]
import com.google.cloud.bigquery.datapolicies.v1beta1.DataPolicy;
import com.google.cloud.bigquery.datapolicies.v1beta1.DataPolicyName;
import com.google.cloud.bigquery.datapolicies.v1beta1.DataPolicyServiceClient;
import com.google.cloud.bigquery.datapolicies.v1beta1.GetDataPolicyRequest;

public class SyncGetDataPolicy {

  public static void main(String[] args) throws Exception {
    syncGetDataPolicy();
  }

  public static void syncGetDataPolicy() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DataPolicyServiceClient dataPolicyServiceClient = DataPolicyServiceClient.create()) {
      GetDataPolicyRequest request =
          GetDataPolicyRequest.newBuilder()
              .setName(DataPolicyName.of("[PROJECT]", "[LOCATION]", "[DATA_POLICY]").toString())
              .build();
      DataPolicy response = dataPolicyServiceClient.getDataPolicy(request);
    }
  }
}
// [END bigquerydatapolicy_v1beta1_generated_DataPolicyService_GetDataPolicy_sync]
