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

package com.google.cloud.retail.v2alpha.samples;

// [START retail_v2alpha_generated_ServingConfigService_RemoveControl_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.retail.v2alpha.RemoveControlRequest;
import com.google.cloud.retail.v2alpha.ServingConfig;
import com.google.cloud.retail.v2alpha.ServingConfigName;
import com.google.cloud.retail.v2alpha.ServingConfigServiceClient;

public class AsyncRemoveControl {

  public static void main(String[] args) throws Exception {
    asyncRemoveControl();
  }

  public static void asyncRemoveControl() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ServingConfigServiceClient servingConfigServiceClient =
        ServingConfigServiceClient.create()) {
      RemoveControlRequest request =
          RemoveControlRequest.newBuilder()
              .setServingConfig(
                  ServingConfigName.of("[PROJECT]", "[LOCATION]", "[CATALOG]", "[SERVING_CONFIG]")
                      .toString())
              .setControlId("controlId-395080872")
              .build();
      ApiFuture<ServingConfig> future =
          servingConfigServiceClient.removeControlCallable().futureCall(request);
      // Do something.
      ServingConfig response = future.get();
    }
  }
}
// [END retail_v2alpha_generated_ServingConfigService_RemoveControl_async]
