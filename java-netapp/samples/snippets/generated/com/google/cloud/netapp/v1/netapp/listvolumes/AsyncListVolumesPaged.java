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

package com.google.cloud.netapp.v1.samples;

// [START netapp_v1_generated_NetApp_ListVolumes_Paged_async]
import com.google.cloud.netapp.v1.ListVolumesRequest;
import com.google.cloud.netapp.v1.ListVolumesResponse;
import com.google.cloud.netapp.v1.LocationName;
import com.google.cloud.netapp.v1.NetAppClient;
import com.google.cloud.netapp.v1.Volume;
import com.google.common.base.Strings;

public class AsyncListVolumesPaged {

  public static void main(String[] args) throws Exception {
    asyncListVolumesPaged();
  }

  public static void asyncListVolumesPaged() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (NetAppClient netAppClient = NetAppClient.create()) {
      ListVolumesRequest request =
          ListVolumesRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setFilter("filter-1274492040")
              .setOrderBy("orderBy-1207110587")
              .build();
      while (true) {
        ListVolumesResponse response = netAppClient.listVolumesCallable().call(request);
        for (Volume element : response.getVolumesList()) {
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
// [END netapp_v1_generated_NetApp_ListVolumes_Paged_async]
