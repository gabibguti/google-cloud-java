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

package com.google.cloud.dataproc.v1.samples;

// [START dataproc_v1_generated_ClusterController_ListClusters_Paged_async]
import com.google.cloud.dataproc.v1.Cluster;
import com.google.cloud.dataproc.v1.ClusterControllerClient;
import com.google.cloud.dataproc.v1.ListClustersRequest;
import com.google.cloud.dataproc.v1.ListClustersResponse;
import com.google.common.base.Strings;

public class AsyncListClustersPaged {

  public static void main(String[] args) throws Exception {
    asyncListClustersPaged();
  }

  public static void asyncListClustersPaged() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ClusterControllerClient clusterControllerClient = ClusterControllerClient.create()) {
      ListClustersRequest request =
          ListClustersRequest.newBuilder()
              .setProjectId("projectId-894832108")
              .setRegion("region-934795532")
              .setFilter("filter-1274492040")
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      while (true) {
        ListClustersResponse response =
            clusterControllerClient.listClustersCallable().call(request);
        for (Cluster element : response.getClustersList()) {
          // doThingsWith(element);
        }
        String nextPageToken = response.getNextPageToken();
        if (!Strings.isNullOrEmpty(nextPageToken)) {
          request = request.toBuilder().setPageToken(nextPageToken).build();
        } else {
          break;
        }
      }
    }
  }
}
// [END dataproc_v1_generated_ClusterController_ListClusters_Paged_async]
