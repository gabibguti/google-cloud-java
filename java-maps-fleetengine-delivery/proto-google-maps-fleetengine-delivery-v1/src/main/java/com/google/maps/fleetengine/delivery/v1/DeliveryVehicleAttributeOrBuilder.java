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

public interface DeliveryVehicleAttributeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:maps.fleetengine.delivery.v1.DeliveryVehicleAttribute)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The attribute's key.
   * </pre>
   *
   * <code>string key = 1;</code>
   *
   * @return The key.
   */
  java.lang.String getKey();
  /**
   *
   *
   * <pre>
   * The attribute's key.
   * </pre>
   *
   * <code>string key = 1;</code>
   *
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString getKeyBytes();

  /**
   *
   *
   * <pre>
   * The attribute's value.
   * </pre>
   *
   * <code>string value = 2;</code>
   *
   * @return The value.
   */
  java.lang.String getValue();
  /**
   *
   *
   * <pre>
   * The attribute's value.
   * </pre>
   *
   * <code>string value = 2;</code>
   *
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString getValueBytes();

  /**
   *
   *
   * <pre>
   * String typed attribute value.
   *
   * Note: This is identical to the `value` field which will eventually be
   * deprecated. For create or update methods, either field can be used, but
   * it's strongly recommended to use `string_value`. If both `string_value`
   * and `value` are set, they must be identical or an error will be thrown.
   * Both fields are populated in responses.
   * </pre>
   *
   * <code>string string_value = 3;</code>
   *
   * @return Whether the stringValue field is set.
   */
  boolean hasStringValue();
  /**
   *
   *
   * <pre>
   * String typed attribute value.
   *
   * Note: This is identical to the `value` field which will eventually be
   * deprecated. For create or update methods, either field can be used, but
   * it's strongly recommended to use `string_value`. If both `string_value`
   * and `value` are set, they must be identical or an error will be thrown.
   * Both fields are populated in responses.
   * </pre>
   *
   * <code>string string_value = 3;</code>
   *
   * @return The stringValue.
   */
  java.lang.String getStringValue();
  /**
   *
   *
   * <pre>
   * String typed attribute value.
   *
   * Note: This is identical to the `value` field which will eventually be
   * deprecated. For create or update methods, either field can be used, but
   * it's strongly recommended to use `string_value`. If both `string_value`
   * and `value` are set, they must be identical or an error will be thrown.
   * Both fields are populated in responses.
   * </pre>
   *
   * <code>string string_value = 3;</code>
   *
   * @return The bytes for stringValue.
   */
  com.google.protobuf.ByteString getStringValueBytes();

  /**
   *
   *
   * <pre>
   * Boolean typed attribute value.
   * </pre>
   *
   * <code>bool bool_value = 4;</code>
   *
   * @return Whether the boolValue field is set.
   */
  boolean hasBoolValue();
  /**
   *
   *
   * <pre>
   * Boolean typed attribute value.
   * </pre>
   *
   * <code>bool bool_value = 4;</code>
   *
   * @return The boolValue.
   */
  boolean getBoolValue();

  /**
   *
   *
   * <pre>
   * Double typed attribute value.
   * </pre>
   *
   * <code>double number_value = 5;</code>
   *
   * @return Whether the numberValue field is set.
   */
  boolean hasNumberValue();
  /**
   *
   *
   * <pre>
   * Double typed attribute value.
   * </pre>
   *
   * <code>double number_value = 5;</code>
   *
   * @return The numberValue.
   */
  double getNumberValue();

  google.maps.fleetengine.delivery.v1.DeliveryVehicleAttribute.DeliveryVehicleAttributeValueCase
      getDeliveryVehicleAttributeValueCase();
}
