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

package com.google.cloud.dialogflow.v2beta1.samples;

// [START dialogflow_v2beta1_generated_SessionEntityTypes_DeleteSessionEntityType_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.dialogflow.v2beta1.DeleteSessionEntityTypeRequest;
import com.google.cloud.dialogflow.v2beta1.SessionEntityTypeName;
import com.google.cloud.dialogflow.v2beta1.SessionEntityTypesClient;
import com.google.protobuf.Empty;

public class AsyncDeleteSessionEntityType {

  public static void main(String[] args) throws Exception {
    asyncDeleteSessionEntityType();
  }

  public static void asyncDeleteSessionEntityType() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
      DeleteSessionEntityTypeRequest request =
          DeleteSessionEntityTypeRequest.newBuilder()
              .setName(
                  SessionEntityTypeName.ofProjectSessionEntityTypeName(
                          "[PROJECT]", "[SESSION]", "[ENTITY_TYPE]")
                      .toString())
              .build();
      ApiFuture<Empty> future =
          sessionEntityTypesClient.deleteSessionEntityTypeCallable().futureCall(request);
      // Do something.
      future.get();
    }
  }
}
// [END dialogflow_v2beta1_generated_SessionEntityTypes_DeleteSessionEntityType_async]
