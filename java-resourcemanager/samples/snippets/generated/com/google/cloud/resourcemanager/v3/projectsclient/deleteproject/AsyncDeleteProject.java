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

package com.google.cloud.resourcemanager.v3.samples;

// [START resourcemanager_v3_generated_projectsclient_deleteproject_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.resourcemanager.v3.DeleteProjectRequest;
import com.google.cloud.resourcemanager.v3.ProjectName;
import com.google.cloud.resourcemanager.v3.ProjectsClient;
import com.google.longrunning.Operation;

public class AsyncDeleteProject {

  public static void main(String[] args) throws Exception {
    asyncDeleteProject();
  }

  public static void asyncDeleteProject() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ProjectsClient projectsClient = ProjectsClient.create()) {
      DeleteProjectRequest request =
          DeleteProjectRequest.newBuilder().setName(ProjectName.of("[PROJECT]").toString()).build();
      ApiFuture<Operation> future = projectsClient.deleteProjectCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END resourcemanager_v3_generated_projectsclient_deleteproject_async]
