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

// [START baremetalsolution_v2_generated_BareMetalSolution_SubmitProvisioningConfig_LocationnameProvisioningconfig_sync]
import com.google.cloud.baremetalsolution.v2.BareMetalSolutionClient;
import com.google.cloud.baremetalsolution.v2.LocationName;
import com.google.cloud.baremetalsolution.v2.ProvisioningConfig;
import com.google.cloud.baremetalsolution.v2.SubmitProvisioningConfigResponse;

public class SyncSubmitProvisioningConfigLocationnameProvisioningconfig {

  public static void main(String[] args) throws Exception {
    syncSubmitProvisioningConfigLocationnameProvisioningconfig();
  }

  public static void syncSubmitProvisioningConfigLocationnameProvisioningconfig() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (BareMetalSolutionClient bareMetalSolutionClient = BareMetalSolutionClient.create()) {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      ProvisioningConfig provisioningConfig = ProvisioningConfig.newBuilder().build();
      SubmitProvisioningConfigResponse response =
          bareMetalSolutionClient.submitProvisioningConfig(parent, provisioningConfig);
    }
  }
}
// [END baremetalsolution_v2_generated_BareMetalSolution_SubmitProvisioningConfig_LocationnameProvisioningconfig_sync]
