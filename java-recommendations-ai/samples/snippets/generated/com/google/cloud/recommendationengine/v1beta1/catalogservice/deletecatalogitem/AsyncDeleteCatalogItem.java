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

// [START recommendationengine_v1beta1_generated_CatalogService_DeleteCatalogItem_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.recommendationengine.v1beta1.CatalogItemPathName;
import com.google.cloud.recommendationengine.v1beta1.CatalogServiceClient;
import com.google.cloud.recommendationengine.v1beta1.DeleteCatalogItemRequest;
import com.google.protobuf.Empty;

public class AsyncDeleteCatalogItem {

  public static void main(String[] args) throws Exception {
    asyncDeleteCatalogItem();
  }

  public static void asyncDeleteCatalogItem() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (CatalogServiceClient catalogServiceClient = CatalogServiceClient.create()) {
      DeleteCatalogItemRequest request =
          DeleteCatalogItemRequest.newBuilder()
              .setName(
                  CatalogItemPathName.of(
                          "[PROJECT]", "[LOCATION]", "[CATALOG]", "[CATALOG_ITEM_PATH]")
                      .toString())
              .build();
      ApiFuture<Empty> future =
          catalogServiceClient.deleteCatalogItemCallable().futureCall(request);
      // Do something.
      future.get();
    }
  }
}
// [END recommendationengine_v1beta1_generated_CatalogService_DeleteCatalogItem_async]
