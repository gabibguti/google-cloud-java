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
// source: google/cloud/policytroubleshooter/iam/v3/troubleshooter.proto

package com.google.cloud.policytroubleshooter.iam.v3;

/**
 *
 *
 * <pre>
 * Whether IAM deny policies deny the principal the permission.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.policytroubleshooter.iam.v3.DenyAccessState}
 */
public enum DenyAccessState implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Not specified.
   * </pre>
   *
   * <code>DENY_ACCESS_STATE_UNSPECIFIED = 0;</code>
   */
  DENY_ACCESS_STATE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * The deny policy denies the principal the permission.
   * </pre>
   *
   * <code>DENY_ACCESS_STATE_DENIED = 1;</code>
   */
  DENY_ACCESS_STATE_DENIED(1),
  /**
   *
   *
   * <pre>
   * The deny policy doesn't deny the principal the permission.
   * </pre>
   *
   * <code>DENY_ACCESS_STATE_NOT_DENIED = 2;</code>
   */
  DENY_ACCESS_STATE_NOT_DENIED(2),
  /**
   *
   *
   * <pre>
   * The deny policy denies the principal the permission if a condition
   * expression evaluates to `true`. However, the sender of the request didn't
   * provide enough context for Policy Troubleshooter to evaluate the condition
   * expression.
   * </pre>
   *
   * <code>DENY_ACCESS_STATE_UNKNOWN_CONDITIONAL = 3;</code>
   */
  DENY_ACCESS_STATE_UNKNOWN_CONDITIONAL(3),
  /**
   *
   *
   * <pre>
   * The sender of the request does not have access to all of the deny policies
   * that Policy Troubleshooter needs to evaluate the principal's access.
   * </pre>
   *
   * <code>DENY_ACCESS_STATE_UNKNOWN_INFO = 4;</code>
   */
  DENY_ACCESS_STATE_UNKNOWN_INFO(4),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Not specified.
   * </pre>
   *
   * <code>DENY_ACCESS_STATE_UNSPECIFIED = 0;</code>
   */
  public static final int DENY_ACCESS_STATE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * The deny policy denies the principal the permission.
   * </pre>
   *
   * <code>DENY_ACCESS_STATE_DENIED = 1;</code>
   */
  public static final int DENY_ACCESS_STATE_DENIED_VALUE = 1;
  /**
   *
   *
   * <pre>
   * The deny policy doesn't deny the principal the permission.
   * </pre>
   *
   * <code>DENY_ACCESS_STATE_NOT_DENIED = 2;</code>
   */
  public static final int DENY_ACCESS_STATE_NOT_DENIED_VALUE = 2;
  /**
   *
   *
   * <pre>
   * The deny policy denies the principal the permission if a condition
   * expression evaluates to `true`. However, the sender of the request didn't
   * provide enough context for Policy Troubleshooter to evaluate the condition
   * expression.
   * </pre>
   *
   * <code>DENY_ACCESS_STATE_UNKNOWN_CONDITIONAL = 3;</code>
   */
  public static final int DENY_ACCESS_STATE_UNKNOWN_CONDITIONAL_VALUE = 3;
  /**
   *
   *
   * <pre>
   * The sender of the request does not have access to all of the deny policies
   * that Policy Troubleshooter needs to evaluate the principal's access.
   * </pre>
   *
   * <code>DENY_ACCESS_STATE_UNKNOWN_INFO = 4;</code>
   */
  public static final int DENY_ACCESS_STATE_UNKNOWN_INFO_VALUE = 4;

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
  public static DenyAccessState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DenyAccessState forNumber(int value) {
    switch (value) {
      case 0:
        return DENY_ACCESS_STATE_UNSPECIFIED;
      case 1:
        return DENY_ACCESS_STATE_DENIED;
      case 2:
        return DENY_ACCESS_STATE_NOT_DENIED;
      case 3:
        return DENY_ACCESS_STATE_UNKNOWN_CONDITIONAL;
      case 4:
        return DENY_ACCESS_STATE_UNKNOWN_INFO;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DenyAccessState> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<DenyAccessState> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<DenyAccessState>() {
        public DenyAccessState findValueByNumber(int number) {
          return DenyAccessState.forNumber(number);
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
    return com.google.cloud.policytroubleshooter.iam.v3.TroubleshooterProto.getDescriptor()
        .getEnumTypes()
        .get(1);
  }

  private static final DenyAccessState[] VALUES = values();

  public static DenyAccessState valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private DenyAccessState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.policytroubleshooter.iam.v3.DenyAccessState)
}
