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

package com.google.cloud.securitycenter.v1.samples;

// [START securitycenter_v1_generated_securitycenterclient_deletenotificationconfig_sync]
import com.google.cloud.securitycenter.v1.DeleteNotificationConfigRequest;
import com.google.cloud.securitycenter.v1.NotificationConfigName;
import com.google.cloud.securitycenter.v1.SecurityCenterClient;
import com.google.protobuf.Empty;

public class SyncDeleteNotificationConfig {

  public static void main(String[] args) throws Exception {
    syncDeleteNotificationConfig();
  }

  public static void syncDeleteNotificationConfig() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
      DeleteNotificationConfigRequest request =
          DeleteNotificationConfigRequest.newBuilder()
              .setName(
                  NotificationConfigName.of("[ORGANIZATION]", "[NOTIFICATION_CONFIG]").toString())
              .build();
      securityCenterClient.deleteNotificationConfig(request);
    }
  }
}
// [END securitycenter_v1_generated_securitycenterclient_deletenotificationconfig_sync]
