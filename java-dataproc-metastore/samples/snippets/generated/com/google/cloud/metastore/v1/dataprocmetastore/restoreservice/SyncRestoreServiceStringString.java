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

package com.google.cloud.metastore.v1.samples;

// [START metastore_v1_generated_DataprocMetastore_RestoreService_StringString_sync]
import com.google.cloud.metastore.v1.BackupName;
import com.google.cloud.metastore.v1.DataprocMetastoreClient;
import com.google.cloud.metastore.v1.Restore;
import com.google.cloud.metastore.v1.ServiceName;

public class SyncRestoreServiceStringString {

  public static void main(String[] args) throws Exception {
    syncRestoreServiceStringString();
  }

  public static void syncRestoreServiceStringString() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DataprocMetastoreClient dataprocMetastoreClient = DataprocMetastoreClient.create()) {
      String service = ServiceName.of("[PROJECT]", "[LOCATION]", "[SERVICE]").toString();
      String backup = BackupName.of("[PROJECT]", "[LOCATION]", "[SERVICE]", "[BACKUP]").toString();
      Restore response = dataprocMetastoreClient.restoreServiceAsync(service, backup).get();
    }
  }
}
// [END metastore_v1_generated_DataprocMetastore_RestoreService_StringString_sync]
