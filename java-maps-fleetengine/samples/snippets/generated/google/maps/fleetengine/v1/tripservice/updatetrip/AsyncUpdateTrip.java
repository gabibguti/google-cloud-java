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

// [START fleetengine_v1_generated_TripService_UpdateTrip_async]
import com.google.api.core.ApiFuture;
import com.google.protobuf.FieldMask;
import google.maps.fleetengine.v1.RequestHeader;
import google.maps.fleetengine.v1.Trip;
import google.maps.fleetengine.v1.TripServiceClient;
import google.maps.fleetengine.v1.UpdateTripRequest;

public class AsyncUpdateTrip {

  public static void main(String[] args) throws Exception {
    asyncUpdateTrip();
  }

  public static void asyncUpdateTrip() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (TripServiceClient tripServiceClient = TripServiceClient.create()) {
      UpdateTripRequest request =
          UpdateTripRequest.newBuilder()
              .setHeader(RequestHeader.newBuilder().build())
              .setName("name3373707")
              .setTrip(Trip.newBuilder().build())
              .setUpdateMask(FieldMask.newBuilder().build())
              .build();
      ApiFuture<Trip> future = tripServiceClient.updateTripCallable().futureCall(request);
      // Do something.
      Trip response = future.get();
    }
  }
}
// [END fleetengine_v1_generated_TripService_UpdateTrip_async]
