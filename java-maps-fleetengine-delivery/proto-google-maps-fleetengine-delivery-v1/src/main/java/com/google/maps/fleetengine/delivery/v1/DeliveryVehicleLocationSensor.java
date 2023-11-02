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
// source: google/maps/fleetengine/delivery/v1/common.proto

package google.maps.fleetengine.delivery.v1;

/**
 *
 *
 * <pre>
 * The sensor or methodology used to determine the location.
 * </pre>
 *
 * Protobuf enum {@code maps.fleetengine.delivery.v1.DeliveryVehicleLocationSensor}
 */
public enum DeliveryVehicleLocationSensor implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * The sensor is unspecified or unknown.
   * </pre>
   *
   * <code>UNKNOWN_SENSOR = 0;</code>
   */
  UNKNOWN_SENSOR(0),
  /**
   *
   *
   * <pre>
   * GPS or Assisted GPS.
   * </pre>
   *
   * <code>GPS = 1;</code>
   */
  GPS(1),
  /**
   *
   *
   * <pre>
   * Assisted GPS, cell tower ID, or WiFi access point.
   * </pre>
   *
   * <code>NETWORK = 2;</code>
   */
  NETWORK(2),
  /**
   *
   *
   * <pre>
   * Cell tower ID or WiFi access point.
   * </pre>
   *
   * <code>PASSIVE = 3;</code>
   */
  PASSIVE(3),
  /**
   *
   *
   * <pre>
   * A location determined by the mobile device to be the most likely
   * road position.
   * </pre>
   *
   * <code>ROAD_SNAPPED_LOCATION_PROVIDER = 4;</code>
   */
  ROAD_SNAPPED_LOCATION_PROVIDER(4),
  /**
   *
   *
   * <pre>
   * A customer-supplied location from an independent source.  Typically, this
   * value is used for a location provided from sources other than the mobile
   * device running Driver SDK.  If the original source is described by one of
   * the other enum values, use that value. Locations marked
   * CUSTOMER_SUPPLIED_LOCATION are typically provided via a DeliveryVehicle's
   * `last_location.supplemental_location_sensor`.
   * </pre>
   *
   * <code>CUSTOMER_SUPPLIED_LOCATION = 5;</code>
   */
  CUSTOMER_SUPPLIED_LOCATION(5),
  /**
   *
   *
   * <pre>
   * A location calculated by Fleet Engine based on the signals available to it.
   * Output only. This value will be rejected if it is received in a request.
   * </pre>
   *
   * <code>FLEET_ENGINE_LOCATION = 6;</code>
   */
  FLEET_ENGINE_LOCATION(6),
  /**
   *
   *
   * <pre>
   * Android's Fused Location Provider.
   * </pre>
   *
   * <code>FUSED_LOCATION_PROVIDER = 100;</code>
   */
  FUSED_LOCATION_PROVIDER(100),
  /**
   *
   *
   * <pre>
   * The location provider on Apple operating systems.
   * </pre>
   *
   * <code>CORE_LOCATION = 200;</code>
   */
  CORE_LOCATION(200),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * The sensor is unspecified or unknown.
   * </pre>
   *
   * <code>UNKNOWN_SENSOR = 0;</code>
   */
  public static final int UNKNOWN_SENSOR_VALUE = 0;
  /**
   *
   *
   * <pre>
   * GPS or Assisted GPS.
   * </pre>
   *
   * <code>GPS = 1;</code>
   */
  public static final int GPS_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Assisted GPS, cell tower ID, or WiFi access point.
   * </pre>
   *
   * <code>NETWORK = 2;</code>
   */
  public static final int NETWORK_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Cell tower ID or WiFi access point.
   * </pre>
   *
   * <code>PASSIVE = 3;</code>
   */
  public static final int PASSIVE_VALUE = 3;
  /**
   *
   *
   * <pre>
   * A location determined by the mobile device to be the most likely
   * road position.
   * </pre>
   *
   * <code>ROAD_SNAPPED_LOCATION_PROVIDER = 4;</code>
   */
  public static final int ROAD_SNAPPED_LOCATION_PROVIDER_VALUE = 4;
  /**
   *
   *
   * <pre>
   * A customer-supplied location from an independent source.  Typically, this
   * value is used for a location provided from sources other than the mobile
   * device running Driver SDK.  If the original source is described by one of
   * the other enum values, use that value. Locations marked
   * CUSTOMER_SUPPLIED_LOCATION are typically provided via a DeliveryVehicle's
   * `last_location.supplemental_location_sensor`.
   * </pre>
   *
   * <code>CUSTOMER_SUPPLIED_LOCATION = 5;</code>
   */
  public static final int CUSTOMER_SUPPLIED_LOCATION_VALUE = 5;
  /**
   *
   *
   * <pre>
   * A location calculated by Fleet Engine based on the signals available to it.
   * Output only. This value will be rejected if it is received in a request.
   * </pre>
   *
   * <code>FLEET_ENGINE_LOCATION = 6;</code>
   */
  public static final int FLEET_ENGINE_LOCATION_VALUE = 6;
  /**
   *
   *
   * <pre>
   * Android's Fused Location Provider.
   * </pre>
   *
   * <code>FUSED_LOCATION_PROVIDER = 100;</code>
   */
  public static final int FUSED_LOCATION_PROVIDER_VALUE = 100;
  /**
   *
   *
   * <pre>
   * The location provider on Apple operating systems.
   * </pre>
   *
   * <code>CORE_LOCATION = 200;</code>
   */
  public static final int CORE_LOCATION_VALUE = 200;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static DeliveryVehicleLocationSensor valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DeliveryVehicleLocationSensor forNumber(int value) {
    switch (value) {
      case 0:
        return UNKNOWN_SENSOR;
      case 1:
        return GPS;
      case 2:
        return NETWORK;
      case 3:
        return PASSIVE;
      case 4:
        return ROAD_SNAPPED_LOCATION_PROVIDER;
      case 5:
        return CUSTOMER_SUPPLIED_LOCATION;
      case 6:
        return FLEET_ENGINE_LOCATION;
      case 100:
        return FUSED_LOCATION_PROVIDER;
      case 200:
        return CORE_LOCATION;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DeliveryVehicleLocationSensor>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<DeliveryVehicleLocationSensor>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DeliveryVehicleLocationSensor>() {
            public DeliveryVehicleLocationSensor findValueByNumber(int number) {
              return DeliveryVehicleLocationSensor.forNumber(number);
            }
          };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return google.maps.fleetengine.delivery.v1.Common.getDescriptor().getEnumTypes().get(0);
  }

  private static final DeliveryVehicleLocationSensor[] VALUES = values();

  public static DeliveryVehicleLocationSensor valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private DeliveryVehicleLocationSensor(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:maps.fleetengine.delivery.v1.DeliveryVehicleLocationSensor)
}
