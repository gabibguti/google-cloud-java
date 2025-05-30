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

package com.google.cloud.discoveryengine.v1alpha.samples;

// [START discoveryengine_v1alpha_generated_DocumentService_ListDocuments_Paged_async]
import com.google.cloud.discoveryengine.v1alpha.BranchName;
import com.google.cloud.discoveryengine.v1alpha.Document;
import com.google.cloud.discoveryengine.v1alpha.DocumentServiceClient;
import com.google.cloud.discoveryengine.v1alpha.ListDocumentsRequest;
import com.google.cloud.discoveryengine.v1alpha.ListDocumentsResponse;
import com.google.common.base.Strings;

public class AsyncListDocumentsPaged {

  public static void main(String[] args) throws Exception {
    asyncListDocumentsPaged();
  }

  public static void asyncListDocumentsPaged() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DocumentServiceClient documentServiceClient = DocumentServiceClient.create()) {
      ListDocumentsRequest request =
          ListDocumentsRequest.newBuilder()
              .setParent(
                  BranchName.ofProjectLocationDataStoreBranchName(
                          "[PROJECT]", "[LOCATION]", "[DATA_STORE]", "[BRANCH]")
                      .toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      while (true) {
        ListDocumentsResponse response =
            documentServiceClient.listDocumentsCallable().call(request);
        for (Document element : response.getDocumentsList()) {
          // doThingsWith(element);
        }
        String nextPageToken = response.getNextPageToken();
        if (!Strings.isNullOrEmpty(nextPageToken)) {
          request = request.toBuilder().setPageToken(nextPageToken).build();
        } else {
          break;
        }
      }
    }
  }
}
// [END discoveryengine_v1alpha_generated_DocumentService_ListDocuments_Paged_async]
