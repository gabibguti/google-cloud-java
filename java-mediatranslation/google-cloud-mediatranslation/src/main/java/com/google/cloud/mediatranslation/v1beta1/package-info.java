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
 * A client to Media Translation API
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>======================= SpeechTranslationServiceClient =======================
 *
 * <p>Service Description: Provides translation from/to media types.
 *
 * <p>Sample for SpeechTranslationServiceClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (SpeechTranslationServiceClient speechTranslationServiceClient =
 *     SpeechTranslationServiceClient.create()) {
 *   BidiStream<StreamingTranslateSpeechRequest, StreamingTranslateSpeechResponse> bidiStream =
 *       speechTranslationServiceClient.streamingTranslateSpeechCallable().call();
 *   StreamingTranslateSpeechRequest request =
 *       StreamingTranslateSpeechRequest.newBuilder().build();
 *   bidiStream.send(request);
 *   for (StreamingTranslateSpeechResponse response : bidiStream) {
 *     // Do something when a response is received.
 *   }
 * }
 * }</pre>
 */
@Generated("by gapic-generator-java")
package com.google.cloud.mediatranslation.v1beta1;

import javax.annotation.Generated;
