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

package com.google.cloud.vision.v1p3beta1.samples;

// [START vision_v1p3beta1_generated_ProductSearch_UpdateProduct_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.vision.v1p3beta1.Product;
import com.google.cloud.vision.v1p3beta1.ProductSearchClient;
import com.google.cloud.vision.v1p3beta1.UpdateProductRequest;
import com.google.protobuf.FieldMask;

public class AsyncUpdateProduct {

  public static void main(String[] args) throws Exception {
    asyncUpdateProduct();
  }

  public static void asyncUpdateProduct() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
      UpdateProductRequest request =
          UpdateProductRequest.newBuilder()
              .setProduct(Product.newBuilder().build())
              .setUpdateMask(FieldMask.newBuilder().build())
              .build();
      ApiFuture<Product> future = productSearchClient.updateProductCallable().futureCall(request);
      // Do something.
      Product response = future.get();
    }
  }
}
// [END vision_v1p3beta1_generated_ProductSearch_UpdateProduct_async]
