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

package com.google.cloud.aiplatform.v1beta1.samples;

// [START aiplatform_v1beta1_generated_FeaturestoreService_SearchFeatures_sync]
import com.google.cloud.aiplatform.v1beta1.Feature;
import com.google.cloud.aiplatform.v1beta1.FeaturestoreServiceClient;
import com.google.cloud.aiplatform.v1beta1.LocationName;
import com.google.cloud.aiplatform.v1beta1.SearchFeaturesRequest;

public class SyncSearchFeatures {

  public static void main(String[] args) throws Exception {
    syncSearchFeatures();
  }

  public static void syncSearchFeatures() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (FeaturestoreServiceClient featurestoreServiceClient = FeaturestoreServiceClient.create()) {
      SearchFeaturesRequest request =
          SearchFeaturesRequest.newBuilder()
              .setLocation(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setQuery("query107944136")
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      for (Feature element : featurestoreServiceClient.searchFeatures(request).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END aiplatform_v1beta1_generated_FeaturestoreService_SearchFeatures_sync]
