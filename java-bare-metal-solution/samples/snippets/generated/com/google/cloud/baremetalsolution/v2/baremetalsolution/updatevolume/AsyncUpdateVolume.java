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

package com.google.cloud.baremetalsolution.v2.samples;

// [START baremetalsolution_v2_generated_BareMetalSolution_UpdateVolume_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.baremetalsolution.v2.BareMetalSolutionClient;
import com.google.cloud.baremetalsolution.v2.UpdateVolumeRequest;
import com.google.cloud.baremetalsolution.v2.Volume;
import com.google.longrunning.Operation;
import com.google.protobuf.FieldMask;

public class AsyncUpdateVolume {

  public static void main(String[] args) throws Exception {
    asyncUpdateVolume();
  }

  public static void asyncUpdateVolume() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (BareMetalSolutionClient bareMetalSolutionClient = BareMetalSolutionClient.create()) {
      UpdateVolumeRequest request =
          UpdateVolumeRequest.newBuilder()
              .setVolume(Volume.newBuilder().build())
              .setUpdateMask(FieldMask.newBuilder().build())
              .build();
      ApiFuture<Operation> future =
          bareMetalSolutionClient.updateVolumeCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END baremetalsolution_v2_generated_BareMetalSolution_UpdateVolume_async]
