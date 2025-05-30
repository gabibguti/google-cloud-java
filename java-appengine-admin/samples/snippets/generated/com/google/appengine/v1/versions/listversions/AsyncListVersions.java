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

package com.google.appengine.v1.samples;

// [START appengine_v1_generated_Versions_ListVersions_async]
import com.google.api.core.ApiFuture;
import com.google.appengine.v1.ListVersionsRequest;
import com.google.appengine.v1.Version;
import com.google.appengine.v1.VersionView;
import com.google.appengine.v1.VersionsClient;

public class AsyncListVersions {

  public static void main(String[] args) throws Exception {
    asyncListVersions();
  }

  public static void asyncListVersions() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (VersionsClient versionsClient = VersionsClient.create()) {
      ListVersionsRequest request =
          ListVersionsRequest.newBuilder()
              .setParent("parent-995424086")
              .setView(VersionView.forNumber(0))
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      ApiFuture<Version> future = versionsClient.listVersionsPagedCallable().futureCall(request);
      // Do something.
      for (Version element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END appengine_v1_generated_Versions_ListVersions_async]
