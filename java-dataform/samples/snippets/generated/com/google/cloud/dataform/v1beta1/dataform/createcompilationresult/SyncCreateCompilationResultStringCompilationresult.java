/*
 * Copyright 2022 Google LLC
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

package com.google.cloud.dataform.v1beta1.samples;

// [START dataform_v1beta1_generated_Dataform_CreateCompilationResult_StringCompilationresult_sync]
import com.google.cloud.dataform.v1beta1.CompilationResult;
import com.google.cloud.dataform.v1beta1.DataformClient;
import com.google.cloud.dataform.v1beta1.RepositoryName;

public class SyncCreateCompilationResultStringCompilationresult {

  public static void main(String[] args) throws Exception {
    syncCreateCompilationResultStringCompilationresult();
  }

  public static void syncCreateCompilationResultStringCompilationresult() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DataformClient dataformClient = DataformClient.create()) {
      String parent = RepositoryName.of("[PROJECT]", "[LOCATION]", "[REPOSITORY]").toString();
      CompilationResult compilationResult = CompilationResult.newBuilder().build();
      CompilationResult response =
          dataformClient.createCompilationResult(parent, compilationResult);
    }
  }
}
// [END dataform_v1beta1_generated_Dataform_CreateCompilationResult_StringCompilationresult_sync]
