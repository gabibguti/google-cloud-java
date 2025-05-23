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

package com.google.cloud.recommendationengine.v1beta1.samples;

// [START recommendationengine_v1beta1_generated_CatalogService_ImportCatalogItems_LRO_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.recommendationengine.v1beta1.CatalogName;
import com.google.cloud.recommendationengine.v1beta1.CatalogServiceClient;
import com.google.cloud.recommendationengine.v1beta1.ImportCatalogItemsRequest;
import com.google.cloud.recommendationengine.v1beta1.ImportCatalogItemsResponse;
import com.google.cloud.recommendationengine.v1beta1.ImportErrorsConfig;
import com.google.cloud.recommendationengine.v1beta1.ImportMetadata;
import com.google.cloud.recommendationengine.v1beta1.InputConfig;

public class AsyncImportCatalogItemsLRO {

  public static void main(String[] args) throws Exception {
    asyncImportCatalogItemsLRO();
  }

  public static void asyncImportCatalogItemsLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (CatalogServiceClient catalogServiceClient = CatalogServiceClient.create()) {
      ImportCatalogItemsRequest request =
          ImportCatalogItemsRequest.newBuilder()
              .setParent(CatalogName.of("[PROJECT]", "[LOCATION]", "[CATALOG]").toString())
              .setRequestId("requestId693933066")
              .setInputConfig(InputConfig.newBuilder().build())
              .setErrorsConfig(ImportErrorsConfig.newBuilder().build())
              .build();
      OperationFuture<ImportCatalogItemsResponse, ImportMetadata> future =
          catalogServiceClient.importCatalogItemsOperationCallable().futureCall(request);
      // Do something.
      ImportCatalogItemsResponse response = future.get();
    }
  }
}
// [END recommendationengine_v1beta1_generated_CatalogService_ImportCatalogItems_LRO_async]
