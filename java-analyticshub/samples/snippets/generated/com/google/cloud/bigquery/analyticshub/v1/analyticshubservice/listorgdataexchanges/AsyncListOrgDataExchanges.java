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

package com.google.cloud.bigquery.analyticshub.v1.samples;

// [START analyticshub_v1_generated_AnalyticsHubService_ListOrgDataExchanges_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.bigquery.analyticshub.v1.AnalyticsHubServiceClient;
import com.google.cloud.bigquery.analyticshub.v1.DataExchange;
import com.google.cloud.bigquery.analyticshub.v1.ListOrgDataExchangesRequest;

public class AsyncListOrgDataExchanges {

  public static void main(String[] args) throws Exception {
    asyncListOrgDataExchanges();
  }

  public static void asyncListOrgDataExchanges() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (AnalyticsHubServiceClient analyticsHubServiceClient = AnalyticsHubServiceClient.create()) {
      ListOrgDataExchangesRequest request =
          ListOrgDataExchangesRequest.newBuilder()
              .setOrganization("organization1178922291")
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      ApiFuture<DataExchange> future =
          analyticsHubServiceClient.listOrgDataExchangesPagedCallable().futureCall(request);
      // Do something.
      for (DataExchange element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END analyticshub_v1_generated_AnalyticsHubService_ListOrgDataExchanges_async]
