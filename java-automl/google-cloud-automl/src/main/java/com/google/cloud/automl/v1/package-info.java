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

/**
 * A client to Cloud AutoML API
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>======================= PredictionServiceClient =======================
 *
 * <p>Service Description: AutoML Prediction API.
 *
 * <p>On any input that is documented to expect a string parameter in snake_case or dash-case,
 * either of those cases is accepted.
 *
 * <p>Sample for PredictionServiceClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (PredictionServiceClient predictionServiceClient = PredictionServiceClient.create()) {
 *   ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
 *   ExamplePayload payload = ExamplePayload.newBuilder().build();
 *   Map<String, String> params = new HashMap<>();
 *   PredictResponse response = predictionServiceClient.predict(name, payload, params);
 * }
 * }</pre>
 *
 * <p>======================= AutoMlClient =======================
 *
 * <p>Service Description: AutoML Server API.
 *
 * <p>The resource names are assigned by the server. The server never reuses names that it has
 * created after the resources with those names are deleted.
 *
 * <p>An ID of a resource is the last element of the item's resource name. For
 * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}`, then the id for the item
 * is `{dataset_id}`.
 *
 * <p>Currently the only supported `location_id` is "us-central1".
 *
 * <p>On any input that is documented to expect a string parameter in snake_case or dash-case,
 * either of those cases is accepted.
 *
 * <p>Sample for AutoMlClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (AutoMlClient autoMlClient = AutoMlClient.create()) {
 *   DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
 *   Dataset response = autoMlClient.getDataset(name);
 * }
 * }</pre>
 */
@Generated("by gapic-generator-java")
package com.google.cloud.automl.v1;

import javax.annotation.Generated;
