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

package com.google.analytics.admin.v1alpha.samples;

// [START analyticsadmin_v1alpha_generated_AnalyticsAdminService_ListDisplayVideo360AdvertiserLinks_sync]
import com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient;
import com.google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLink;
import com.google.analytics.admin.v1alpha.ListDisplayVideo360AdvertiserLinksRequest;
import com.google.analytics.admin.v1alpha.PropertyName;

public class SyncListDisplayVideo360AdvertiserLinks {

  public static void main(String[] args) throws Exception {
    syncListDisplayVideo360AdvertiserLinks();
  }

  public static void syncListDisplayVideo360AdvertiserLinks() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (AnalyticsAdminServiceClient analyticsAdminServiceClient =
        AnalyticsAdminServiceClient.create()) {
      ListDisplayVideo360AdvertiserLinksRequest request =
          ListDisplayVideo360AdvertiserLinksRequest.newBuilder()
              .setParent(PropertyName.of("[PROPERTY]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      for (DisplayVideo360AdvertiserLink element :
          analyticsAdminServiceClient.listDisplayVideo360AdvertiserLinks(request).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END analyticsadmin_v1alpha_generated_AnalyticsAdminService_ListDisplayVideo360AdvertiserLinks_sync]
