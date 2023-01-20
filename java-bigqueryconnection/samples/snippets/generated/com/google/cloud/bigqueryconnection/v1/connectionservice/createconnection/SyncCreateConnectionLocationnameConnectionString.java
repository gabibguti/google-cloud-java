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

package com.google.cloud.bigqueryconnection.v1.samples;

// [START bigqueryconnection_v1_generated_ConnectionService_CreateConnection_LocationnameConnectionString_sync]
import com.google.cloud.bigquery.connection.v1.Connection;
import com.google.cloud.bigquery.connection.v1.LocationName;
import com.google.cloud.bigqueryconnection.v1.ConnectionServiceClient;

public class SyncCreateConnectionLocationnameConnectionString {

  public static void main(String[] args) throws Exception {
    syncCreateConnectionLocationnameConnectionString();
  }

  public static void syncCreateConnectionLocationnameConnectionString() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ConnectionServiceClient connectionServiceClient = ConnectionServiceClient.create()) {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      Connection connection = Connection.newBuilder().build();
      String connectionId = "connectionId1923106969";
      Connection response =
          connectionServiceClient.createConnection(parent, connection, connectionId);
    }
  }
}
// [END bigqueryconnection_v1_generated_ConnectionService_CreateConnection_LocationnameConnectionString_sync]
