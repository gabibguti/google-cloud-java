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

package com.google.cloud.dataplex.v1.samples;

// [START dataplex_v1_generated_DataplexService_UpdateEnvironment_EnvironmentFieldmask_sync]
import com.google.cloud.dataplex.v1.DataplexServiceClient;
import com.google.cloud.dataplex.v1.Environment;
import com.google.protobuf.FieldMask;

public class SyncUpdateEnvironmentEnvironmentFieldmask {

  public static void main(String[] args) throws Exception {
    syncUpdateEnvironmentEnvironmentFieldmask();
  }

  public static void syncUpdateEnvironmentEnvironmentFieldmask() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DataplexServiceClient dataplexServiceClient = DataplexServiceClient.create()) {
      Environment environment = Environment.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      Environment response =
          dataplexServiceClient.updateEnvironmentAsync(environment, updateMask).get();
    }
  }
}
// [END dataplex_v1_generated_DataplexService_UpdateEnvironment_EnvironmentFieldmask_sync]
