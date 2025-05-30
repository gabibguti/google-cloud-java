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

package google.maps.fleetengine.v1.samples;

// [START fleetengine_v1_generated_VehicleService_GetVehicle_async]
import com.google.api.core.ApiFuture;
import com.google.protobuf.Timestamp;
import google.maps.fleetengine.v1.GetVehicleRequest;
import google.maps.fleetengine.v1.RequestHeader;
import google.maps.fleetengine.v1.Vehicle;
import google.maps.fleetengine.v1.VehicleName;
import google.maps.fleetengine.v1.VehicleServiceClient;

public class AsyncGetVehicle {

  public static void main(String[] args) throws Exception {
    asyncGetVehicle();
  }

  public static void asyncGetVehicle() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (VehicleServiceClient vehicleServiceClient = VehicleServiceClient.create()) {
      GetVehicleRequest request =
          GetVehicleRequest.newBuilder()
              .setHeader(RequestHeader.newBuilder().build())
              .setName(VehicleName.of("[PROVIDER]", "[VEHICLE]").toString())
              .setCurrentRouteSegmentVersion(Timestamp.newBuilder().build())
              .setWaypointsVersion(Timestamp.newBuilder().build())
              .build();
      ApiFuture<Vehicle> future = vehicleServiceClient.getVehicleCallable().futureCall(request);
      // Do something.
      Vehicle response = future.get();
    }
  }
}
// [END fleetengine_v1_generated_VehicleService_GetVehicle_async]
