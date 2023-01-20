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

package com.google.cloud.dataform.v1alpha2.samples;

// [START dataform_v1alpha2_generated_Dataform_DeleteWorkflowInvocation_sync]
import com.google.cloud.dataform.v1alpha2.DataformClient;
import com.google.cloud.dataform.v1alpha2.DeleteWorkflowInvocationRequest;
import com.google.cloud.dataform.v1alpha2.WorkflowInvocationName;
import com.google.protobuf.Empty;

public class SyncDeleteWorkflowInvocation {

  public static void main(String[] args) throws Exception {
    syncDeleteWorkflowInvocation();
  }

  public static void syncDeleteWorkflowInvocation() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DataformClient dataformClient = DataformClient.create()) {
      DeleteWorkflowInvocationRequest request =
          DeleteWorkflowInvocationRequest.newBuilder()
              .setName(
                  WorkflowInvocationName.of(
                          "[PROJECT]", "[LOCATION]", "[REPOSITORY]", "[WORKFLOW_INVOCATION]")
                      .toString())
              .build();
      dataformClient.deleteWorkflowInvocation(request);
    }
  }
}
// [END dataform_v1alpha2_generated_Dataform_DeleteWorkflowInvocation_sync]
