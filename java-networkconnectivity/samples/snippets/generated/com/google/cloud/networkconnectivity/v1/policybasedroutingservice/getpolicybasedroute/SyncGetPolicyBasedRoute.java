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

package com.google.cloud.networkconnectivity.v1.samples;

// [START networkconnectivity_v1_generated_PolicyBasedRoutingService_GetPolicyBasedRoute_sync]
import com.google.cloud.networkconnectivity.v1.GetPolicyBasedRouteRequest;
import com.google.cloud.networkconnectivity.v1.PolicyBasedRoute;
import com.google.cloud.networkconnectivity.v1.PolicyBasedRouteName;
import com.google.cloud.networkconnectivity.v1.PolicyBasedRoutingServiceClient;

public class SyncGetPolicyBasedRoute {

  public static void main(String[] args) throws Exception {
    syncGetPolicyBasedRoute();
  }

  public static void syncGetPolicyBasedRoute() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (PolicyBasedRoutingServiceClient policyBasedRoutingServiceClient =
        PolicyBasedRoutingServiceClient.create()) {
      GetPolicyBasedRouteRequest request =
          GetPolicyBasedRouteRequest.newBuilder()
              .setName(PolicyBasedRouteName.of("[PROJECT]", "[POLICY_BASED_ROUTE]").toString())
              .build();
      PolicyBasedRoute response = policyBasedRoutingServiceClient.getPolicyBasedRoute(request);
    }
  }
}
// [END networkconnectivity_v1_generated_PolicyBasedRoutingService_GetPolicyBasedRoute_sync]
