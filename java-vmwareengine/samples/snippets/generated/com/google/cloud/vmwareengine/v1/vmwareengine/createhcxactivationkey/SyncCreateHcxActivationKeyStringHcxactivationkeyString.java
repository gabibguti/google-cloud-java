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

package com.google.cloud.vmwareengine.v1.samples;

// [START vmwareengine_v1_generated_VmwareEngine_CreateHcxActivationKey_StringHcxactivationkeyString_sync]
import com.google.cloud.vmwareengine.v1.HcxActivationKey;
import com.google.cloud.vmwareengine.v1.PrivateCloudName;
import com.google.cloud.vmwareengine.v1.VmwareEngineClient;

public class SyncCreateHcxActivationKeyStringHcxactivationkeyString {

  public static void main(String[] args) throws Exception {
    syncCreateHcxActivationKeyStringHcxactivationkeyString();
  }

  public static void syncCreateHcxActivationKeyStringHcxactivationkeyString() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (VmwareEngineClient vmwareEngineClient = VmwareEngineClient.create()) {
      String parent = PrivateCloudName.of("[PROJECT]", "[LOCATION]", "[PRIVATE_CLOUD]").toString();
      HcxActivationKey hcxActivationKey = HcxActivationKey.newBuilder().build();
      String hcxActivationKeyId = "hcxActivationKeyId-645871673";
      HcxActivationKey response =
          vmwareEngineClient
              .createHcxActivationKeyAsync(parent, hcxActivationKey, hcxActivationKeyId)
              .get();
    }
  }
}
// [END vmwareengine_v1_generated_VmwareEngine_CreateHcxActivationKey_StringHcxactivationkeyString_sync]
