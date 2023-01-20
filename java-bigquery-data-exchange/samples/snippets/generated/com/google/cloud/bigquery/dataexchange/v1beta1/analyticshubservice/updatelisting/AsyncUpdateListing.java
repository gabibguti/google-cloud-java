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

package com.google.cloud.bigquery.dataexchange.v1beta1.samples;

// [START analyticshub_v1beta1_generated_AnalyticsHubService_UpdateListing_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.bigquery.dataexchange.v1beta1.AnalyticsHubServiceClient;
import com.google.cloud.bigquery.dataexchange.v1beta1.Listing;
import com.google.cloud.bigquery.dataexchange.v1beta1.UpdateListingRequest;
import com.google.protobuf.FieldMask;

public class AsyncUpdateListing {

  public static void main(String[] args) throws Exception {
    asyncUpdateListing();
  }

  public static void asyncUpdateListing() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (AnalyticsHubServiceClient analyticsHubServiceClient = AnalyticsHubServiceClient.create()) {
      UpdateListingRequest request =
          UpdateListingRequest.newBuilder()
              .setUpdateMask(FieldMask.newBuilder().build())
              .setListing(Listing.newBuilder().build())
              .build();
      ApiFuture<Listing> future =
          analyticsHubServiceClient.updateListingCallable().futureCall(request);
      // Do something.
      Listing response = future.get();
    }
  }
}
// [END analyticshub_v1beta1_generated_AnalyticsHubService_UpdateListing_async]
