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

// [START dialogflow_v2_generated_Agents_TrainAgent_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.dialogflow.v2.AgentsClient;
import com.google.cloud.dialogflow.v2.ProjectName;
import com.google.cloud.dialogflow.v2.TrainAgentRequest;
import com.google.longrunning.Operation;

public class AsyncTrainAgent {

  public static void main(String[] args) throws Exception {
    asyncTrainAgent();
  }

  public static void asyncTrainAgent() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (AgentsClient agentsClient = AgentsClient.create()) {
      TrainAgentRequest request =
          TrainAgentRequest.newBuilder().setParent(ProjectName.of("[PROJECT]").toString()).build();
      ApiFuture<Operation> future = agentsClient.trainAgentCallable().futureCall(request);
      // Do something.
      future.get();
    }
  }
}
// [END dialogflow_v2_generated_Agents_TrainAgent_async]
