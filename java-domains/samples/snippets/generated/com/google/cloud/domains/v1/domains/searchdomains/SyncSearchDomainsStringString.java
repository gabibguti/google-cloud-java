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

package com.google.cloud.domains.v1.samples;

// [START domains_v1_generated_Domains_SearchDomains_StringString_sync]
import com.google.cloud.domains.v1.DomainsClient;
import com.google.cloud.domains.v1.LocationName;
import com.google.cloud.domains.v1.SearchDomainsResponse;

public class SyncSearchDomainsStringString {

  public static void main(String[] args) throws Exception {
    syncSearchDomainsStringString();
  }

  public static void syncSearchDomainsStringString() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DomainsClient domainsClient = DomainsClient.create()) {
      String location = LocationName.of("[PROJECT]", "[LOCATION]").toString();
      String query = "query107944136";
      SearchDomainsResponse response = domainsClient.searchDomains(location, query);
    }
  }
}
// [END domains_v1_generated_Domains_SearchDomains_StringString_sync]
