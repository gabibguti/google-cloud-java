/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/fleetengine/delivery/v1/delivery_vehicles.proto

package google.maps.fleetengine.delivery.v1;

public interface VehicleJourneySegmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:maps.fleetengine.delivery.v1.VehicleJourneySegment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Specifies the stop location, along with the `Task`s associated with
   * the stop. Some fields of the VehicleStop might not be present if this
   * journey segment is part of `JourneySharingInfo`.
   * </pre>
   *
   * <code>.maps.fleetengine.delivery.v1.VehicleStop stop = 1;</code>
   *
   * @return Whether the stop field is set.
   */
  boolean hasStop();
  /**
   *
   *
   * <pre>
   * Specifies the stop location, along with the `Task`s associated with
   * the stop. Some fields of the VehicleStop might not be present if this
   * journey segment is part of `JourneySharingInfo`.
   * </pre>
   *
   * <code>.maps.fleetengine.delivery.v1.VehicleStop stop = 1;</code>
   *
   * @return The stop.
   */
  google.maps.fleetengine.delivery.v1.VehicleStop getStop();
  /**
   *
   *
   * <pre>
   * Specifies the stop location, along with the `Task`s associated with
   * the stop. Some fields of the VehicleStop might not be present if this
   * journey segment is part of `JourneySharingInfo`.
   * </pre>
   *
   * <code>.maps.fleetengine.delivery.v1.VehicleStop stop = 1;</code>
   */
  google.maps.fleetengine.delivery.v1.VehicleStopOrBuilder getStopOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The travel distance from the previous stop to this stop.
   * If the current stop is the first stop in the list of journey
   * segments, then the starting point is the vehicle's location recorded
   * at the time that this stop was added to the list. This field might not be
   * present if this journey segment is part of `JourneySharingInfo`.
   * </pre>
   *
   * <code>
   * .google.protobuf.Int32Value driving_distance_meters = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the drivingDistanceMeters field is set.
   */
  boolean hasDrivingDistanceMeters();
  /**
   *
   *
   * <pre>
   * Output only. The travel distance from the previous stop to this stop.
   * If the current stop is the first stop in the list of journey
   * segments, then the starting point is the vehicle's location recorded
   * at the time that this stop was added to the list. This field might not be
   * present if this journey segment is part of `JourneySharingInfo`.
   * </pre>
   *
   * <code>
   * .google.protobuf.Int32Value driving_distance_meters = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The drivingDistanceMeters.
   */
  com.google.protobuf.Int32Value getDrivingDistanceMeters();
  /**
   *
   *
   * <pre>
   * Output only. The travel distance from the previous stop to this stop.
   * If the current stop is the first stop in the list of journey
   * segments, then the starting point is the vehicle's location recorded
   * at the time that this stop was added to the list. This field might not be
   * present if this journey segment is part of `JourneySharingInfo`.
   * </pre>
   *
   * <code>
   * .google.protobuf.Int32Value driving_distance_meters = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.Int32ValueOrBuilder getDrivingDistanceMetersOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The travel time from the previous stop to this stop.
   * If the current stop is the first stop in the list of journey
   * segments, then the starting point is the Vehicle's location recorded
   * at the time that this stop was added to the list.
   *
   * If this field is defined in the path
   * `Task.remaining_vehicle_journey_segments[0].driving_duration` (gRPC) or
   * `Task.remainingVehicleJourneySegments[0].drivingDuration` (REST),
   * then it may be populated with the value from
   * `DeliveryVehicle.remaining_duration` (gRPC) or
   * `DeliveryVehicle.remainingDuration` (REST).
   * This provides the remaining driving duration from the driver app's latest
   * known location rather than the driving time from the previous stop.
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration driving_duration = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the drivingDuration field is set.
   */
  boolean hasDrivingDuration();
  /**
   *
   *
   * <pre>
   * Output only. The travel time from the previous stop to this stop.
   * If the current stop is the first stop in the list of journey
   * segments, then the starting point is the Vehicle's location recorded
   * at the time that this stop was added to the list.
   *
   * If this field is defined in the path
   * `Task.remaining_vehicle_journey_segments[0].driving_duration` (gRPC) or
   * `Task.remainingVehicleJourneySegments[0].drivingDuration` (REST),
   * then it may be populated with the value from
   * `DeliveryVehicle.remaining_duration` (gRPC) or
   * `DeliveryVehicle.remainingDuration` (REST).
   * This provides the remaining driving duration from the driver app's latest
   * known location rather than the driving time from the previous stop.
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration driving_duration = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The drivingDuration.
   */
  com.google.protobuf.Duration getDrivingDuration();
  /**
   *
   *
   * <pre>
   * Output only. The travel time from the previous stop to this stop.
   * If the current stop is the first stop in the list of journey
   * segments, then the starting point is the Vehicle's location recorded
   * at the time that this stop was added to the list.
   *
   * If this field is defined in the path
   * `Task.remaining_vehicle_journey_segments[0].driving_duration` (gRPC) or
   * `Task.remainingVehicleJourneySegments[0].drivingDuration` (REST),
   * then it may be populated with the value from
   * `DeliveryVehicle.remaining_duration` (gRPC) or
   * `DeliveryVehicle.remainingDuration` (REST).
   * This provides the remaining driving duration from the driver app's latest
   * known location rather than the driving time from the previous stop.
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration driving_duration = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.DurationOrBuilder getDrivingDurationOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The path from the previous stop to this stop. If the current
   * stop is the first stop in the list of journey segments, then this is the
   * path from the vehicle's current location to this stop at the time that the
   * stop was added to the list. This field might not be present if this journey
   * segment is part of `JourneySharingInfo`.
   *
   * If this field is defined in the path
   * `Task.journey_sharing_info.remaining_vehicle_journey_segments[0].path`
   * (gRPC) or `Task.journeySharingInfo.remainingVehicleJourneySegments[0].path`
   * (REST), then it may be populated with the `LatLng`s decoded from
   * `DeliveryVehicle.current_route_segment` (gRPC) or
   * `DeliveryVehicle.currentRouteSegment` (REST). This provides the driving
   * path from the driver app's latest known location rather than the path from
   * the previous stop.
   * </pre>
   *
   * <code>repeated .google.type.LatLng path = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.type.LatLng> getPathList();
  /**
   *
   *
   * <pre>
   * Output only. The path from the previous stop to this stop. If the current
   * stop is the first stop in the list of journey segments, then this is the
   * path from the vehicle's current location to this stop at the time that the
   * stop was added to the list. This field might not be present if this journey
   * segment is part of `JourneySharingInfo`.
   *
   * If this field is defined in the path
   * `Task.journey_sharing_info.remaining_vehicle_journey_segments[0].path`
   * (gRPC) or `Task.journeySharingInfo.remainingVehicleJourneySegments[0].path`
   * (REST), then it may be populated with the `LatLng`s decoded from
   * `DeliveryVehicle.current_route_segment` (gRPC) or
   * `DeliveryVehicle.currentRouteSegment` (REST). This provides the driving
   * path from the driver app's latest known location rather than the path from
   * the previous stop.
   * </pre>
   *
   * <code>repeated .google.type.LatLng path = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.type.LatLng getPath(int index);
  /**
   *
   *
   * <pre>
   * Output only. The path from the previous stop to this stop. If the current
   * stop is the first stop in the list of journey segments, then this is the
   * path from the vehicle's current location to this stop at the time that the
   * stop was added to the list. This field might not be present if this journey
   * segment is part of `JourneySharingInfo`.
   *
   * If this field is defined in the path
   * `Task.journey_sharing_info.remaining_vehicle_journey_segments[0].path`
   * (gRPC) or `Task.journeySharingInfo.remainingVehicleJourneySegments[0].path`
   * (REST), then it may be populated with the `LatLng`s decoded from
   * `DeliveryVehicle.current_route_segment` (gRPC) or
   * `DeliveryVehicle.currentRouteSegment` (REST). This provides the driving
   * path from the driver app's latest known location rather than the path from
   * the previous stop.
   * </pre>
   *
   * <code>repeated .google.type.LatLng path = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getPathCount();
  /**
   *
   *
   * <pre>
   * Output only. The path from the previous stop to this stop. If the current
   * stop is the first stop in the list of journey segments, then this is the
   * path from the vehicle's current location to this stop at the time that the
   * stop was added to the list. This field might not be present if this journey
   * segment is part of `JourneySharingInfo`.
   *
   * If this field is defined in the path
   * `Task.journey_sharing_info.remaining_vehicle_journey_segments[0].path`
   * (gRPC) or `Task.journeySharingInfo.remainingVehicleJourneySegments[0].path`
   * (REST), then it may be populated with the `LatLng`s decoded from
   * `DeliveryVehicle.current_route_segment` (gRPC) or
   * `DeliveryVehicle.currentRouteSegment` (REST). This provides the driving
   * path from the driver app's latest known location rather than the path from
   * the previous stop.
   * </pre>
   *
   * <code>repeated .google.type.LatLng path = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.type.LatLngOrBuilder> getPathOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. The path from the previous stop to this stop. If the current
   * stop is the first stop in the list of journey segments, then this is the
   * path from the vehicle's current location to this stop at the time that the
   * stop was added to the list. This field might not be present if this journey
   * segment is part of `JourneySharingInfo`.
   *
   * If this field is defined in the path
   * `Task.journey_sharing_info.remaining_vehicle_journey_segments[0].path`
   * (gRPC) or `Task.journeySharingInfo.remainingVehicleJourneySegments[0].path`
   * (REST), then it may be populated with the `LatLng`s decoded from
   * `DeliveryVehicle.current_route_segment` (gRPC) or
   * `DeliveryVehicle.currentRouteSegment` (REST). This provides the driving
   * path from the driver app's latest known location rather than the path from
   * the previous stop.
   * </pre>
   *
   * <code>repeated .google.type.LatLng path = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.type.LatLngOrBuilder getPathOrBuilder(int index);
}
