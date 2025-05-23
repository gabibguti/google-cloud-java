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

package com.google.cloud.documentai.v1.samples;

// [START documentai_v1_generated_DocumentProcessorService_CreateProcessor_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.documentai.v1.CreateProcessorRequest;
import com.google.cloud.documentai.v1.DocumentProcessorServiceClient;
import com.google.cloud.documentai.v1.LocationName;
import com.google.cloud.documentai.v1.Processor;

public class AsyncCreateProcessor {

  public static void main(String[] args) throws Exception {
    asyncCreateProcessor();
  }

  public static void asyncCreateProcessor() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DocumentProcessorServiceClient documentProcessorServiceClient =
        DocumentProcessorServiceClient.create()) {
      CreateProcessorRequest request =
          CreateProcessorRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setProcessor(Processor.newBuilder().build())
              .build();
      ApiFuture<Processor> future =
          documentProcessorServiceClient.createProcessorCallable().futureCall(request);
      // Do something.
      Processor response = future.get();
    }
  }
}
// [END documentai_v1_generated_DocumentProcessorService_CreateProcessor_async]
