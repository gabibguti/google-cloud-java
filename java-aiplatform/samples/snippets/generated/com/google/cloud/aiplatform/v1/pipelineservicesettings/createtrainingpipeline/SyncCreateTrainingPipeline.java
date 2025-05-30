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

package com.google.cloud.aiplatform.v1.samples;

// [START aiplatform_v1_generated_PipelineServiceSettings_CreateTrainingPipeline_sync]
import com.google.cloud.aiplatform.v1.PipelineServiceSettings;
import java.time.Duration;

public class SyncCreateTrainingPipeline {

  public static void main(String[] args) throws Exception {
    syncCreateTrainingPipeline();
  }

  public static void syncCreateTrainingPipeline() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    PipelineServiceSettings.Builder pipelineServiceSettingsBuilder =
        PipelineServiceSettings.newBuilder();
    pipelineServiceSettingsBuilder
        .createTrainingPipelineSettings()
        .setRetrySettings(
            pipelineServiceSettingsBuilder
                .createTrainingPipelineSettings()
                .getRetrySettings()
                .toBuilder()
                .setTotalTimeout(Duration.ofSeconds(30))
                .build());
    PipelineServiceSettings pipelineServiceSettings = pipelineServiceSettingsBuilder.build();
  }
}
// [END aiplatform_v1_generated_PipelineServiceSettings_CreateTrainingPipeline_sync]
