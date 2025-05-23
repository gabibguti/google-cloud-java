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

package com.google.cloud.notebooks.v1.samples;

// [START notebooks_v1_generated_NotebookService_UpdateInstanceMetadataItems_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.notebooks.v1.NotebookServiceClient;
import com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsRequest;
import com.google.cloud.notebooks.v1.UpdateInstanceMetadataItemsResponse;
import java.util.HashMap;

public class AsyncUpdateInstanceMetadataItems {

  public static void main(String[] args) throws Exception {
    asyncUpdateInstanceMetadataItems();
  }

  public static void asyncUpdateInstanceMetadataItems() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (NotebookServiceClient notebookServiceClient = NotebookServiceClient.create()) {
      UpdateInstanceMetadataItemsRequest request =
          UpdateInstanceMetadataItemsRequest.newBuilder()
              .setName("name3373707")
              .putAllItems(new HashMap<String, String>())
              .build();
      ApiFuture<UpdateInstanceMetadataItemsResponse> future =
          notebookServiceClient.updateInstanceMetadataItemsCallable().futureCall(request);
      // Do something.
      UpdateInstanceMetadataItemsResponse response = future.get();
    }
  }
}
// [END notebooks_v1_generated_NotebookService_UpdateInstanceMetadataItems_async]
