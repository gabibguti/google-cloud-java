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

package com.google.cloud.accessapproval.v1.samples;

// [START accessapproval_v1_generated_AccessApproval_ApproveApprovalRequest_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.accessapproval.v1.AccessApprovalAdminClient;
import com.google.cloud.accessapproval.v1.ApprovalRequest;
import com.google.cloud.accessapproval.v1.ApprovalRequestName;
import com.google.cloud.accessapproval.v1.ApproveApprovalRequestMessage;
import com.google.protobuf.Timestamp;

public class AsyncApproveApprovalRequest {

  public static void main(String[] args) throws Exception {
    asyncApproveApprovalRequest();
  }

  public static void asyncApproveApprovalRequest() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (AccessApprovalAdminClient accessApprovalAdminClient = AccessApprovalAdminClient.create()) {
      ApproveApprovalRequestMessage request =
          ApproveApprovalRequestMessage.newBuilder()
              .setName(
                  ApprovalRequestName.ofProjectApprovalRequestName(
                          "[PROJECT]", "[APPROVAL_REQUEST]")
                      .toString())
              .setExpireTime(Timestamp.newBuilder().build())
              .build();
      ApiFuture<ApprovalRequest> future =
          accessApprovalAdminClient.approveApprovalRequestCallable().futureCall(request);
      // Do something.
      ApprovalRequest response = future.get();
    }
  }
}
// [END accessapproval_v1_generated_AccessApproval_ApproveApprovalRequest_async]
