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

package com.google.cloud.recommender.v1.samples;

// [START recommender_v1_generated_Recommender_MarkRecommendationSucceeded_StringMapstringstringString_sync]
import com.google.cloud.recommender.v1.Recommendation;
import com.google.cloud.recommender.v1.RecommendationName;
import com.google.cloud.recommender.v1.RecommenderClient;
import java.util.HashMap;
import java.util.Map;

public class SyncMarkRecommendationSucceededStringMapstringstringString {

  public static void main(String[] args) throws Exception {
    syncMarkRecommendationSucceededStringMapstringstringString();
  }

  public static void syncMarkRecommendationSucceededStringMapstringstringString() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (RecommenderClient recommenderClient = RecommenderClient.create()) {
      String name =
          RecommendationName.ofProjectLocationRecommenderRecommendationName(
                  "[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]")
              .toString();
      Map<String, String> stateMetadata = new HashMap<>();
      String etag = "etag3123477";
      Recommendation response =
          recommenderClient.markRecommendationSucceeded(name, stateMetadata, etag);
    }
  }
}
// [END recommender_v1_generated_Recommender_MarkRecommendationSucceeded_StringMapstringstringString_sync]
