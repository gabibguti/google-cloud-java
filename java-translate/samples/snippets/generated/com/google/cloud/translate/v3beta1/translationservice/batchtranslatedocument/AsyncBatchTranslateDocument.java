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

package com.google.cloud.translate.v3beta1.samples;

// [START translate_v3beta1_generated_TranslationService_BatchTranslateDocument_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.translate.v3beta1.BatchDocumentInputConfig;
import com.google.cloud.translate.v3beta1.BatchDocumentOutputConfig;
import com.google.cloud.translate.v3beta1.BatchTranslateDocumentRequest;
import com.google.cloud.translate.v3beta1.LocationName;
import com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig;
import com.google.cloud.translate.v3beta1.TranslationServiceClient;
import com.google.longrunning.Operation;
import java.util.ArrayList;
import java.util.HashMap;

public class AsyncBatchTranslateDocument {

  public static void main(String[] args) throws Exception {
    asyncBatchTranslateDocument();
  }

  public static void asyncBatchTranslateDocument() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (TranslationServiceClient translationServiceClient = TranslationServiceClient.create()) {
      BatchTranslateDocumentRequest request =
          BatchTranslateDocumentRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setSourceLanguageCode("sourceLanguageCode1645917472")
              .addAllTargetLanguageCodes(new ArrayList<String>())
              .addAllInputConfigs(new ArrayList<BatchDocumentInputConfig>())
              .setOutputConfig(BatchDocumentOutputConfig.newBuilder().build())
              .putAllModels(new HashMap<String, String>())
              .putAllGlossaries(new HashMap<String, TranslateTextGlossaryConfig>())
              .putAllFormatConversions(new HashMap<String, String>())
              .setCustomizedAttribution("customizedAttribution557650238")
              .setEnableShadowRemovalNativePdf(true)
              .setEnableRotationCorrection(true)
              .build();
      ApiFuture<Operation> future =
          translationServiceClient.batchTranslateDocumentCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END translate_v3beta1_generated_TranslationService_BatchTranslateDocument_async]
