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

package com.google.cloud.dialogflow.v2.samples;

// [START dialogflow_v2_generated_ConversationProfiles_CreateConversationProfile_ProjectnameConversationprofile_sync]
import com.google.cloud.dialogflow.v2.ConversationProfile;
import com.google.cloud.dialogflow.v2.ConversationProfilesClient;
import com.google.cloud.dialogflow.v2.ProjectName;

public class SyncCreateConversationProfileProjectnameConversationprofile {

  public static void main(String[] args) throws Exception {
    syncCreateConversationProfileProjectnameConversationprofile();
  }

  public static void syncCreateConversationProfileProjectnameConversationprofile()
      throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ConversationProfilesClient conversationProfilesClient =
        ConversationProfilesClient.create()) {
      ProjectName parent = ProjectName.of("[PROJECT]");
      ConversationProfile conversationProfile = ConversationProfile.newBuilder().build();
      ConversationProfile response =
          conversationProfilesClient.createConversationProfile(parent, conversationProfile);
    }
  }
}
// [END dialogflow_v2_generated_ConversationProfiles_CreateConversationProfile_ProjectnameConversationprofile_sync]
