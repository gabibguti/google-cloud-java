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

package com.google.cloud.gkehub.v1beta1.samples;

// [START gkehub_v1beta1_generated_GkeHubMembershipService_UpdateMembership_LRO_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.gkehub.v1beta1.GkeHubMembershipServiceClient;
import com.google.cloud.gkehub.v1beta1.Membership;
import com.google.cloud.gkehub.v1beta1.MembershipName;
import com.google.cloud.gkehub.v1beta1.OperationMetadata;
import com.google.cloud.gkehub.v1beta1.UpdateMembershipRequest;
import com.google.protobuf.FieldMask;

public class AsyncUpdateMembershipLRO {

  public static void main(String[] args) throws Exception {
    asyncUpdateMembershipLRO();
  }

  public static void asyncUpdateMembershipLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (GkeHubMembershipServiceClient gkeHubMembershipServiceClient =
        GkeHubMembershipServiceClient.create()) {
      UpdateMembershipRequest request =
          UpdateMembershipRequest.newBuilder()
              .setName(MembershipName.of("[PROJECT]", "[LOCATION]", "[MEMBERSHIP]").toString())
              .setUpdateMask(FieldMask.newBuilder().build())
              .setResource(Membership.newBuilder().build())
              .setRequestId("requestId693933066")
              .build();
      OperationFuture<Membership, OperationMetadata> future =
          gkeHubMembershipServiceClient.updateMembershipOperationCallable().futureCall(request);
      // Do something.
      Membership response = future.get();
    }
  }
}
// [END gkehub_v1beta1_generated_GkeHubMembershipService_UpdateMembership_LRO_async]
