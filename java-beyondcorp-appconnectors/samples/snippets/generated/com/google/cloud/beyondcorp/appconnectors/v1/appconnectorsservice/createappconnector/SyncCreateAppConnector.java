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

package com.google.cloud.beyondcorp.appconnectors.v1.samples;

// [START beyondcorp_v1_generated_AppConnectorsService_CreateAppConnector_sync]
import com.google.cloud.beyondcorp.appconnectors.v1.AppConnector;
import com.google.cloud.beyondcorp.appconnectors.v1.AppConnectorsServiceClient;
import com.google.cloud.beyondcorp.appconnectors.v1.CreateAppConnectorRequest;
import com.google.cloud.beyondcorp.appconnectors.v1.LocationName;

public class SyncCreateAppConnector {

  public static void main(String[] args) throws Exception {
    syncCreateAppConnector();
  }

  public static void syncCreateAppConnector() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (AppConnectorsServiceClient appConnectorsServiceClient =
        AppConnectorsServiceClient.create()) {
      CreateAppConnectorRequest request =
          CreateAppConnectorRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setAppConnectorId("appConnectorId374103399")
              .setAppConnector(AppConnector.newBuilder().build())
              .setRequestId("requestId693933066")
              .setValidateOnly(true)
              .build();
      AppConnector response = appConnectorsServiceClient.createAppConnectorAsync(request).get();
    }
  }
}
// [END beyondcorp_v1_generated_AppConnectorsService_CreateAppConnector_sync]
