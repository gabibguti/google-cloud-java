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

package com.google.cloud.monitoring.v3.stub.samples;

// [START monitoring_v3_generated_ServiceMonitoringServiceStubSettings_CreateService_sync]
import com.google.cloud.monitoring.v3.stub.ServiceMonitoringServiceStubSettings;
import java.time.Duration;

public class SyncCreateService {

  public static void main(String[] args) throws Exception {
    syncCreateService();
  }

  public static void syncCreateService() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    ServiceMonitoringServiceStubSettings.Builder serviceMonitoringServiceSettingsBuilder =
        ServiceMonitoringServiceStubSettings.newBuilder();
    serviceMonitoringServiceSettingsBuilder
        .createServiceSettings()
        .setRetrySettings(
            serviceMonitoringServiceSettingsBuilder
                .createServiceSettings()
                .getRetrySettings()
                .toBuilder()
                .setTotalTimeout(Duration.ofSeconds(30))
                .build());
    ServiceMonitoringServiceStubSettings serviceMonitoringServiceSettings =
        serviceMonitoringServiceSettingsBuilder.build();
  }
}
// [END monitoring_v3_generated_ServiceMonitoringServiceStubSettings_CreateService_sync]
