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

package com.google.cloud.contentwarehouse.v1.samples;

// [START contentwarehouse_v1_generated_RuleSetService_GetRuleSet_String_sync]
import com.google.cloud.contentwarehouse.v1.RuleSet;
import com.google.cloud.contentwarehouse.v1.RuleSetName;
import com.google.cloud.contentwarehouse.v1.RuleSetServiceClient;

public class SyncGetRuleSetString {

  public static void main(String[] args) throws Exception {
    syncGetRuleSetString();
  }

  public static void syncGetRuleSetString() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (RuleSetServiceClient ruleSetServiceClient = RuleSetServiceClient.create()) {
      String name = RuleSetName.of("[PROJECT]", "[LOCATION]", "[RULE_SET]").toString();
      RuleSet response = ruleSetServiceClient.getRuleSet(name);
    }
  }
}
// [END contentwarehouse_v1_generated_RuleSetService_GetRuleSet_String_sync]
