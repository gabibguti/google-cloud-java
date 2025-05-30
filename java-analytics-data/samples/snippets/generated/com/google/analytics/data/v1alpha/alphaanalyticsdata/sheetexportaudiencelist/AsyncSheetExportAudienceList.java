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

package com.google.analytics.data.v1alpha.samples;

// [START analyticsdata_v1alpha_generated_AlphaAnalyticsData_SheetExportAudienceList_async]
import com.google.analytics.data.v1alpha.AlphaAnalyticsDataClient;
import com.google.analytics.data.v1alpha.AudienceListName;
import com.google.analytics.data.v1alpha.SheetExportAudienceListRequest;
import com.google.analytics.data.v1alpha.SheetExportAudienceListResponse;
import com.google.api.core.ApiFuture;

public class AsyncSheetExportAudienceList {

  public static void main(String[] args) throws Exception {
    asyncSheetExportAudienceList();
  }

  public static void asyncSheetExportAudienceList() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (AlphaAnalyticsDataClient alphaAnalyticsDataClient = AlphaAnalyticsDataClient.create()) {
      SheetExportAudienceListRequest request =
          SheetExportAudienceListRequest.newBuilder()
              .setName(AudienceListName.of("[PROPERTY]", "[AUDIENCE_LIST]").toString())
              .setOffset(-1019779949)
              .setLimit(102976443)
              .build();
      ApiFuture<SheetExportAudienceListResponse> future =
          alphaAnalyticsDataClient.sheetExportAudienceListCallable().futureCall(request);
      // Do something.
      SheetExportAudienceListResponse response = future.get();
    }
  }
}
// [END analyticsdata_v1alpha_generated_AlphaAnalyticsData_SheetExportAudienceList_async]
