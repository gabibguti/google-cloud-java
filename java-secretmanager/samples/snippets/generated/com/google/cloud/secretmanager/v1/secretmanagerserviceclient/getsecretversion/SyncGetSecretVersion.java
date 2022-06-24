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

package com.google.cloud.secretmanager.v1.samples;

// [START secretmanager_v1_generated_secretmanagerserviceclient_getsecretversion_sync]
import com.google.cloud.secretmanager.v1.GetSecretVersionRequest;
import com.google.cloud.secretmanager.v1.SecretManagerServiceClient;
import com.google.cloud.secretmanager.v1.SecretVersion;
import com.google.cloud.secretmanager.v1.SecretVersionName;

public class SyncGetSecretVersion {

  public static void main(String[] args) throws Exception {
    syncGetSecretVersion();
  }

  public static void syncGetSecretVersion() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (SecretManagerServiceClient secretManagerServiceClient =
        SecretManagerServiceClient.create()) {
      GetSecretVersionRequest request =
          GetSecretVersionRequest.newBuilder()
              .setName(SecretVersionName.of("[PROJECT]", "[SECRET]", "[SECRET_VERSION]").toString())
              .build();
      SecretVersion response = secretManagerServiceClient.getSecretVersion(request);
    }
  }
}
// [END secretmanager_v1_generated_secretmanagerserviceclient_getsecretversion_sync]
