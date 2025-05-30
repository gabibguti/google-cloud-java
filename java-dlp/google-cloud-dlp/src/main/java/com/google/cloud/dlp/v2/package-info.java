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
 * A client to Cloud Data Loss Prevention (DLP)
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>======================= DlpServiceClient =======================
 *
 * <p>Service Description: The Cloud Data Loss Prevention (DLP) API is a service that allows clients
 * to detect the presence of Personally Identifiable Information (PII) and other privacy-sensitive
 * data in user-supplied, unstructured data streams, like text blocks or images. The service also
 * includes methods for sensitive data redaction and scheduling of data scans on Google Cloud
 * Platform based data sets.
 *
 * <p>To learn more about concepts and find how-to guides see https://cloud.google.com/dlp/docs/.
 *
 * <p>Sample for DlpServiceClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (DlpServiceClient dlpServiceClient = DlpServiceClient.create()) {
 *   InspectContentRequest request =
 *       InspectContentRequest.newBuilder()
 *           .setParent(ProjectName.of("[PROJECT]").toString())
 *           .setInspectConfig(InspectConfig.newBuilder().build())
 *           .setItem(ContentItem.newBuilder().build())
 *           .setInspectTemplateName("inspectTemplateName1828857433")
 *           .setLocationId("locationId1541836720")
 *           .build();
 *   InspectContentResponse response = dlpServiceClient.inspectContent(request);
 * }
 * }</pre>
 */
@Generated("by gapic-generator-java")
package com.google.cloud.dlp.v2;

import javax.annotation.Generated;
