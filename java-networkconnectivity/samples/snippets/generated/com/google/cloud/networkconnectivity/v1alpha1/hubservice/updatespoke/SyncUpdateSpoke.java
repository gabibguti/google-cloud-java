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

package com.google.cloud.networkconnectivity.v1alpha1.samples;

// [START networkconnectivity_v1alpha1_generated_HubService_UpdateSpoke_sync]
import com.google.cloud.networkconnectivity.v1alpha1.HubServiceClient;
import com.google.cloud.networkconnectivity.v1alpha1.Spoke;
import com.google.cloud.networkconnectivity.v1alpha1.UpdateSpokeRequest;
import com.google.protobuf.FieldMask;

public class SyncUpdateSpoke {

  public static void main(String[] args) throws Exception {
    syncUpdateSpoke();
  }

  public static void syncUpdateSpoke() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (HubServiceClient hubServiceClient = HubServiceClient.create()) {
      UpdateSpokeRequest request =
          UpdateSpokeRequest.newBuilder()
              .setUpdateMask(FieldMask.newBuilder().build())
              .setSpoke(Spoke.newBuilder().build())
              .setRequestId("requestId693933066")
              .build();
      Spoke response = hubServiceClient.updateSpokeAsync(request).get();
    }
  }
}
// [END networkconnectivity_v1alpha1_generated_HubService_UpdateSpoke_sync]
