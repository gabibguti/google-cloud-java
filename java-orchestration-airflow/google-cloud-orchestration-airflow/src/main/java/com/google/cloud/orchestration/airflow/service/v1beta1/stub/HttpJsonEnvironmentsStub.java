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

package com.google.cloud.orchestration.airflow.service.v1beta1.stub;

import static com.google.cloud.orchestration.airflow.service.v1beta1.EnvironmentsClient.ListEnvironmentsPagedResponse;

import com.google.api.HttpRule;
import com.google.api.core.BetaApi;
import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonOperationSnapshot;
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.httpjson.ProtoMessageRequestFormatter;
import com.google.api.gax.httpjson.ProtoMessageResponseParser;
import com.google.api.gax.httpjson.ProtoRestSerializer;
import com.google.api.gax.httpjson.longrunning.stub.HttpJsonOperationsStub;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.RequestParamsBuilder;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.orchestration.airflow.service.v1beta1.CheckUpgradeRequest;
import com.google.cloud.orchestration.airflow.service.v1beta1.CheckUpgradeResponse;
import com.google.cloud.orchestration.airflow.service.v1beta1.CreateEnvironmentRequest;
import com.google.cloud.orchestration.airflow.service.v1beta1.DatabaseFailoverRequest;
import com.google.cloud.orchestration.airflow.service.v1beta1.DatabaseFailoverResponse;
import com.google.cloud.orchestration.airflow.service.v1beta1.DeleteEnvironmentRequest;
import com.google.cloud.orchestration.airflow.service.v1beta1.Environment;
import com.google.cloud.orchestration.airflow.service.v1beta1.ExecuteAirflowCommandRequest;
import com.google.cloud.orchestration.airflow.service.v1beta1.ExecuteAirflowCommandResponse;
import com.google.cloud.orchestration.airflow.service.v1beta1.FetchDatabasePropertiesRequest;
import com.google.cloud.orchestration.airflow.service.v1beta1.FetchDatabasePropertiesResponse;
import com.google.cloud.orchestration.airflow.service.v1beta1.GetEnvironmentRequest;
import com.google.cloud.orchestration.airflow.service.v1beta1.ListEnvironmentsRequest;
import com.google.cloud.orchestration.airflow.service.v1beta1.ListEnvironmentsResponse;
import com.google.cloud.orchestration.airflow.service.v1beta1.LoadSnapshotRequest;
import com.google.cloud.orchestration.airflow.service.v1beta1.LoadSnapshotResponse;
import com.google.cloud.orchestration.airflow.service.v1beta1.OperationMetadata;
import com.google.cloud.orchestration.airflow.service.v1beta1.PollAirflowCommandRequest;
import com.google.cloud.orchestration.airflow.service.v1beta1.PollAirflowCommandResponse;
import com.google.cloud.orchestration.airflow.service.v1beta1.RestartWebServerRequest;
import com.google.cloud.orchestration.airflow.service.v1beta1.SaveSnapshotRequest;
import com.google.cloud.orchestration.airflow.service.v1beta1.SaveSnapshotResponse;
import com.google.cloud.orchestration.airflow.service.v1beta1.StopAirflowCommandRequest;
import com.google.cloud.orchestration.airflow.service.v1beta1.StopAirflowCommandResponse;
import com.google.cloud.orchestration.airflow.service.v1beta1.UpdateEnvironmentRequest;
import com.google.common.collect.ImmutableMap;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import com.google.protobuf.TypeRegistry;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * REST stub implementation for the Environments service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class HttpJsonEnvironmentsStub extends EnvironmentsStub {
  private static final TypeRegistry typeRegistry =
      TypeRegistry.newBuilder()
          .add(Empty.getDescriptor())
          .add(OperationMetadata.getDescriptor())
          .add(DatabaseFailoverResponse.getDescriptor())
          .add(LoadSnapshotResponse.getDescriptor())
          .add(Environment.getDescriptor())
          .add(CheckUpgradeResponse.getDescriptor())
          .add(SaveSnapshotResponse.getDescriptor())
          .build();

  private static final ApiMethodDescriptor<CreateEnvironmentRequest, Operation>
      createEnvironmentMethodDescriptor =
          ApiMethodDescriptor.<CreateEnvironmentRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.orchestration.airflow.service.v1beta1.Environments/CreateEnvironment")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<CreateEnvironmentRequest>newBuilder()
                      .setPath(
                          "/v1beta1/{parent=projects/*/locations/*}/environments",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<CreateEnvironmentRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<CreateEnvironmentRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("environment", request.getEnvironment(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (CreateEnvironmentRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<GetEnvironmentRequest, Environment>
      getEnvironmentMethodDescriptor =
          ApiMethodDescriptor.<GetEnvironmentRequest, Environment>newBuilder()
              .setFullMethodName(
                  "google.cloud.orchestration.airflow.service.v1beta1.Environments/GetEnvironment")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetEnvironmentRequest>newBuilder()
                      .setPath(
                          "/v1beta1/{name=projects/*/locations/*/environments/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetEnvironmentRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetEnvironmentRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Environment>newBuilder()
                      .setDefaultInstance(Environment.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<ListEnvironmentsRequest, ListEnvironmentsResponse>
      listEnvironmentsMethodDescriptor =
          ApiMethodDescriptor.<ListEnvironmentsRequest, ListEnvironmentsResponse>newBuilder()
              .setFullMethodName(
                  "google.cloud.orchestration.airflow.service.v1beta1.Environments/ListEnvironments")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListEnvironmentsRequest>newBuilder()
                      .setPath(
                          "/v1beta1/{parent=projects/*/locations/*}/environments",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListEnvironmentsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListEnvironmentsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListEnvironmentsResponse>newBuilder()
                      .setDefaultInstance(ListEnvironmentsResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<UpdateEnvironmentRequest, Operation>
      updateEnvironmentMethodDescriptor =
          ApiMethodDescriptor.<UpdateEnvironmentRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.orchestration.airflow.service.v1beta1.Environments/UpdateEnvironment")
              .setHttpMethod("PATCH")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<UpdateEnvironmentRequest>newBuilder()
                      .setPath(
                          "/v1beta1/{name=projects/*/locations/*/environments/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<UpdateEnvironmentRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<UpdateEnvironmentRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "updateMask", request.getUpdateMask());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("environment", request.getEnvironment(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (UpdateEnvironmentRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<DeleteEnvironmentRequest, Operation>
      deleteEnvironmentMethodDescriptor =
          ApiMethodDescriptor.<DeleteEnvironmentRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.orchestration.airflow.service.v1beta1.Environments/DeleteEnvironment")
              .setHttpMethod("DELETE")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<DeleteEnvironmentRequest>newBuilder()
                      .setPath(
                          "/v1beta1/{name=projects/*/locations/*/environments/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteEnvironmentRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteEnvironmentRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (DeleteEnvironmentRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<RestartWebServerRequest, Operation>
      restartWebServerMethodDescriptor =
          ApiMethodDescriptor.<RestartWebServerRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.orchestration.airflow.service.v1beta1.Environments/RestartWebServer")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<RestartWebServerRequest>newBuilder()
                      .setPath(
                          "/v1beta1/{name=projects/*/locations/*/environments/*}:restartWebServer",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<RestartWebServerRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<RestartWebServerRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("*", request.toBuilder().clearName().build(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (RestartWebServerRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<CheckUpgradeRequest, Operation>
      checkUpgradeMethodDescriptor =
          ApiMethodDescriptor.<CheckUpgradeRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.orchestration.airflow.service.v1beta1.Environments/CheckUpgrade")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<CheckUpgradeRequest>newBuilder()
                      .setPath(
                          "/v1beta1/{environment=projects/*/locations/*/environments/*}:checkUpgrade",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<CheckUpgradeRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields, "environment", request.getEnvironment());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<CheckUpgradeRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody(
                                      "*", request.toBuilder().clearEnvironment().build(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (CheckUpgradeRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<
          ExecuteAirflowCommandRequest, ExecuteAirflowCommandResponse>
      executeAirflowCommandMethodDescriptor =
          ApiMethodDescriptor
              .<ExecuteAirflowCommandRequest, ExecuteAirflowCommandResponse>newBuilder()
              .setFullMethodName(
                  "google.cloud.orchestration.airflow.service.v1beta1.Environments/ExecuteAirflowCommand")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ExecuteAirflowCommandRequest>newBuilder()
                      .setPath(
                          "/v1beta1/{environment=projects/*/locations/*/environments/*}:executeAirflowCommand",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ExecuteAirflowCommandRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields, "environment", request.getEnvironment());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ExecuteAirflowCommandRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody(
                                      "*", request.toBuilder().clearEnvironment().build(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ExecuteAirflowCommandResponse>newBuilder()
                      .setDefaultInstance(ExecuteAirflowCommandResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<StopAirflowCommandRequest, StopAirflowCommandResponse>
      stopAirflowCommandMethodDescriptor =
          ApiMethodDescriptor.<StopAirflowCommandRequest, StopAirflowCommandResponse>newBuilder()
              .setFullMethodName(
                  "google.cloud.orchestration.airflow.service.v1beta1.Environments/StopAirflowCommand")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<StopAirflowCommandRequest>newBuilder()
                      .setPath(
                          "/v1beta1/{environment=projects/*/locations/*/environments/*}:stopAirflowCommand",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<StopAirflowCommandRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields, "environment", request.getEnvironment());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<StopAirflowCommandRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody(
                                      "*", request.toBuilder().clearEnvironment().build(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<StopAirflowCommandResponse>newBuilder()
                      .setDefaultInstance(StopAirflowCommandResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<PollAirflowCommandRequest, PollAirflowCommandResponse>
      pollAirflowCommandMethodDescriptor =
          ApiMethodDescriptor.<PollAirflowCommandRequest, PollAirflowCommandResponse>newBuilder()
              .setFullMethodName(
                  "google.cloud.orchestration.airflow.service.v1beta1.Environments/PollAirflowCommand")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<PollAirflowCommandRequest>newBuilder()
                      .setPath(
                          "/v1beta1/{environment=projects/*/locations/*/environments/*}:pollAirflowCommand",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<PollAirflowCommandRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields, "environment", request.getEnvironment());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<PollAirflowCommandRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody(
                                      "*", request.toBuilder().clearEnvironment().build(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<PollAirflowCommandResponse>newBuilder()
                      .setDefaultInstance(PollAirflowCommandResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<SaveSnapshotRequest, Operation>
      saveSnapshotMethodDescriptor =
          ApiMethodDescriptor.<SaveSnapshotRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.orchestration.airflow.service.v1beta1.Environments/SaveSnapshot")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<SaveSnapshotRequest>newBuilder()
                      .setPath(
                          "/v1beta1/{environment=projects/*/locations/*/environments/*}:saveSnapshot",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<SaveSnapshotRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields, "environment", request.getEnvironment());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<SaveSnapshotRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody(
                                      "*", request.toBuilder().clearEnvironment().build(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (SaveSnapshotRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<LoadSnapshotRequest, Operation>
      loadSnapshotMethodDescriptor =
          ApiMethodDescriptor.<LoadSnapshotRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.orchestration.airflow.service.v1beta1.Environments/LoadSnapshot")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<LoadSnapshotRequest>newBuilder()
                      .setPath(
                          "/v1beta1/{environment=projects/*/locations/*/environments/*}:loadSnapshot",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<LoadSnapshotRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields, "environment", request.getEnvironment());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<LoadSnapshotRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody(
                                      "*", request.toBuilder().clearEnvironment().build(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (LoadSnapshotRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<DatabaseFailoverRequest, Operation>
      databaseFailoverMethodDescriptor =
          ApiMethodDescriptor.<DatabaseFailoverRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.orchestration.airflow.service.v1beta1.Environments/DatabaseFailover")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<DatabaseFailoverRequest>newBuilder()
                      .setPath(
                          "/v1beta1/{environment=projects/*/locations/*/environments/*}:databaseFailover",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<DatabaseFailoverRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields, "environment", request.getEnvironment());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<DatabaseFailoverRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody(
                                      "*", request.toBuilder().clearEnvironment().build(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (DatabaseFailoverRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<
          FetchDatabasePropertiesRequest, FetchDatabasePropertiesResponse>
      fetchDatabasePropertiesMethodDescriptor =
          ApiMethodDescriptor
              .<FetchDatabasePropertiesRequest, FetchDatabasePropertiesResponse>newBuilder()
              .setFullMethodName(
                  "google.cloud.orchestration.airflow.service.v1beta1.Environments/FetchDatabaseProperties")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<FetchDatabasePropertiesRequest>newBuilder()
                      .setPath(
                          "/v1beta1/{environment=projects/*/locations/*/environments/*}:fetchDatabaseProperties",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<FetchDatabasePropertiesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields, "environment", request.getEnvironment());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<FetchDatabasePropertiesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<FetchDatabasePropertiesResponse>newBuilder()
                      .setDefaultInstance(FetchDatabasePropertiesResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private final UnaryCallable<CreateEnvironmentRequest, Operation> createEnvironmentCallable;
  private final OperationCallable<CreateEnvironmentRequest, Environment, OperationMetadata>
      createEnvironmentOperationCallable;
  private final UnaryCallable<GetEnvironmentRequest, Environment> getEnvironmentCallable;
  private final UnaryCallable<ListEnvironmentsRequest, ListEnvironmentsResponse>
      listEnvironmentsCallable;
  private final UnaryCallable<ListEnvironmentsRequest, ListEnvironmentsPagedResponse>
      listEnvironmentsPagedCallable;
  private final UnaryCallable<UpdateEnvironmentRequest, Operation> updateEnvironmentCallable;
  private final OperationCallable<UpdateEnvironmentRequest, Environment, OperationMetadata>
      updateEnvironmentOperationCallable;
  private final UnaryCallable<DeleteEnvironmentRequest, Operation> deleteEnvironmentCallable;
  private final OperationCallable<DeleteEnvironmentRequest, Empty, OperationMetadata>
      deleteEnvironmentOperationCallable;
  private final UnaryCallable<RestartWebServerRequest, Operation> restartWebServerCallable;
  private final OperationCallable<RestartWebServerRequest, Environment, OperationMetadata>
      restartWebServerOperationCallable;
  private final UnaryCallable<CheckUpgradeRequest, Operation> checkUpgradeCallable;
  private final OperationCallable<CheckUpgradeRequest, CheckUpgradeResponse, OperationMetadata>
      checkUpgradeOperationCallable;
  private final UnaryCallable<ExecuteAirflowCommandRequest, ExecuteAirflowCommandResponse>
      executeAirflowCommandCallable;
  private final UnaryCallable<StopAirflowCommandRequest, StopAirflowCommandResponse>
      stopAirflowCommandCallable;
  private final UnaryCallable<PollAirflowCommandRequest, PollAirflowCommandResponse>
      pollAirflowCommandCallable;
  private final UnaryCallable<SaveSnapshotRequest, Operation> saveSnapshotCallable;
  private final OperationCallable<SaveSnapshotRequest, SaveSnapshotResponse, OperationMetadata>
      saveSnapshotOperationCallable;
  private final UnaryCallable<LoadSnapshotRequest, Operation> loadSnapshotCallable;
  private final OperationCallable<LoadSnapshotRequest, LoadSnapshotResponse, OperationMetadata>
      loadSnapshotOperationCallable;
  private final UnaryCallable<DatabaseFailoverRequest, Operation> databaseFailoverCallable;
  private final OperationCallable<
          DatabaseFailoverRequest, DatabaseFailoverResponse, OperationMetadata>
      databaseFailoverOperationCallable;
  private final UnaryCallable<FetchDatabasePropertiesRequest, FetchDatabasePropertiesResponse>
      fetchDatabasePropertiesCallable;

  private final BackgroundResource backgroundResources;
  private final HttpJsonOperationsStub httpJsonOperationsStub;
  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonEnvironmentsStub create(EnvironmentsStubSettings settings)
      throws IOException {
    return new HttpJsonEnvironmentsStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonEnvironmentsStub create(ClientContext clientContext)
      throws IOException {
    return new HttpJsonEnvironmentsStub(
        EnvironmentsStubSettings.newHttpJsonBuilder().build(), clientContext);
  }

  public static final HttpJsonEnvironmentsStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonEnvironmentsStub(
        EnvironmentsStubSettings.newHttpJsonBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonEnvironmentsStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected HttpJsonEnvironmentsStub(EnvironmentsStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new HttpJsonEnvironmentsCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonEnvironmentsStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected HttpJsonEnvironmentsStub(
      EnvironmentsStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.httpJsonOperationsStub =
        HttpJsonOperationsStub.create(
            clientContext,
            callableFactory,
            typeRegistry,
            ImmutableMap.<String, HttpRule>builder()
                .put(
                    "google.longrunning.Operations.DeleteOperation",
                    HttpRule.newBuilder()
                        .setDelete("/v1beta1/{name=projects/*/locations/*/operations/*}")
                        .build())
                .put(
                    "google.longrunning.Operations.GetOperation",
                    HttpRule.newBuilder()
                        .setGet("/v1beta1/{name=projects/*/locations/*/operations/*}")
                        .build())
                .put(
                    "google.longrunning.Operations.ListOperations",
                    HttpRule.newBuilder()
                        .setGet("/v1beta1/{name=projects/*/locations/*}/operations")
                        .build())
                .build());

    HttpJsonCallSettings<CreateEnvironmentRequest, Operation> createEnvironmentTransportSettings =
        HttpJsonCallSettings.<CreateEnvironmentRequest, Operation>newBuilder()
            .setMethodDescriptor(createEnvironmentMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("parent", String.valueOf(request.getParent()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<GetEnvironmentRequest, Environment> getEnvironmentTransportSettings =
        HttpJsonCallSettings.<GetEnvironmentRequest, Environment>newBuilder()
            .setMethodDescriptor(getEnvironmentMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<ListEnvironmentsRequest, ListEnvironmentsResponse>
        listEnvironmentsTransportSettings =
            HttpJsonCallSettings.<ListEnvironmentsRequest, ListEnvironmentsResponse>newBuilder()
                .setMethodDescriptor(listEnvironmentsMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("parent", String.valueOf(request.getParent()));
                      return builder.build();
                    })
                .build();
    HttpJsonCallSettings<UpdateEnvironmentRequest, Operation> updateEnvironmentTransportSettings =
        HttpJsonCallSettings.<UpdateEnvironmentRequest, Operation>newBuilder()
            .setMethodDescriptor(updateEnvironmentMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<DeleteEnvironmentRequest, Operation> deleteEnvironmentTransportSettings =
        HttpJsonCallSettings.<DeleteEnvironmentRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteEnvironmentMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<RestartWebServerRequest, Operation> restartWebServerTransportSettings =
        HttpJsonCallSettings.<RestartWebServerRequest, Operation>newBuilder()
            .setMethodDescriptor(restartWebServerMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<CheckUpgradeRequest, Operation> checkUpgradeTransportSettings =
        HttpJsonCallSettings.<CheckUpgradeRequest, Operation>newBuilder()
            .setMethodDescriptor(checkUpgradeMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("environment", String.valueOf(request.getEnvironment()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<ExecuteAirflowCommandRequest, ExecuteAirflowCommandResponse>
        executeAirflowCommandTransportSettings =
            HttpJsonCallSettings
                .<ExecuteAirflowCommandRequest, ExecuteAirflowCommandResponse>newBuilder()
                .setMethodDescriptor(executeAirflowCommandMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("environment", String.valueOf(request.getEnvironment()));
                      return builder.build();
                    })
                .build();
    HttpJsonCallSettings<StopAirflowCommandRequest, StopAirflowCommandResponse>
        stopAirflowCommandTransportSettings =
            HttpJsonCallSettings.<StopAirflowCommandRequest, StopAirflowCommandResponse>newBuilder()
                .setMethodDescriptor(stopAirflowCommandMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("environment", String.valueOf(request.getEnvironment()));
                      return builder.build();
                    })
                .build();
    HttpJsonCallSettings<PollAirflowCommandRequest, PollAirflowCommandResponse>
        pollAirflowCommandTransportSettings =
            HttpJsonCallSettings.<PollAirflowCommandRequest, PollAirflowCommandResponse>newBuilder()
                .setMethodDescriptor(pollAirflowCommandMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("environment", String.valueOf(request.getEnvironment()));
                      return builder.build();
                    })
                .build();
    HttpJsonCallSettings<SaveSnapshotRequest, Operation> saveSnapshotTransportSettings =
        HttpJsonCallSettings.<SaveSnapshotRequest, Operation>newBuilder()
            .setMethodDescriptor(saveSnapshotMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("environment", String.valueOf(request.getEnvironment()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<LoadSnapshotRequest, Operation> loadSnapshotTransportSettings =
        HttpJsonCallSettings.<LoadSnapshotRequest, Operation>newBuilder()
            .setMethodDescriptor(loadSnapshotMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("environment", String.valueOf(request.getEnvironment()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<DatabaseFailoverRequest, Operation> databaseFailoverTransportSettings =
        HttpJsonCallSettings.<DatabaseFailoverRequest, Operation>newBuilder()
            .setMethodDescriptor(databaseFailoverMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("environment", String.valueOf(request.getEnvironment()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<FetchDatabasePropertiesRequest, FetchDatabasePropertiesResponse>
        fetchDatabasePropertiesTransportSettings =
            HttpJsonCallSettings
                .<FetchDatabasePropertiesRequest, FetchDatabasePropertiesResponse>newBuilder()
                .setMethodDescriptor(fetchDatabasePropertiesMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("environment", String.valueOf(request.getEnvironment()));
                      return builder.build();
                    })
                .build();

    this.createEnvironmentCallable =
        callableFactory.createUnaryCallable(
            createEnvironmentTransportSettings,
            settings.createEnvironmentSettings(),
            clientContext);
    this.createEnvironmentOperationCallable =
        callableFactory.createOperationCallable(
            createEnvironmentTransportSettings,
            settings.createEnvironmentOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.getEnvironmentCallable =
        callableFactory.createUnaryCallable(
            getEnvironmentTransportSettings, settings.getEnvironmentSettings(), clientContext);
    this.listEnvironmentsCallable =
        callableFactory.createUnaryCallable(
            listEnvironmentsTransportSettings, settings.listEnvironmentsSettings(), clientContext);
    this.listEnvironmentsPagedCallable =
        callableFactory.createPagedCallable(
            listEnvironmentsTransportSettings, settings.listEnvironmentsSettings(), clientContext);
    this.updateEnvironmentCallable =
        callableFactory.createUnaryCallable(
            updateEnvironmentTransportSettings,
            settings.updateEnvironmentSettings(),
            clientContext);
    this.updateEnvironmentOperationCallable =
        callableFactory.createOperationCallable(
            updateEnvironmentTransportSettings,
            settings.updateEnvironmentOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.deleteEnvironmentCallable =
        callableFactory.createUnaryCallable(
            deleteEnvironmentTransportSettings,
            settings.deleteEnvironmentSettings(),
            clientContext);
    this.deleteEnvironmentOperationCallable =
        callableFactory.createOperationCallable(
            deleteEnvironmentTransportSettings,
            settings.deleteEnvironmentOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.restartWebServerCallable =
        callableFactory.createUnaryCallable(
            restartWebServerTransportSettings, settings.restartWebServerSettings(), clientContext);
    this.restartWebServerOperationCallable =
        callableFactory.createOperationCallable(
            restartWebServerTransportSettings,
            settings.restartWebServerOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.checkUpgradeCallable =
        callableFactory.createUnaryCallable(
            checkUpgradeTransportSettings, settings.checkUpgradeSettings(), clientContext);
    this.checkUpgradeOperationCallable =
        callableFactory.createOperationCallable(
            checkUpgradeTransportSettings,
            settings.checkUpgradeOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.executeAirflowCommandCallable =
        callableFactory.createUnaryCallable(
            executeAirflowCommandTransportSettings,
            settings.executeAirflowCommandSettings(),
            clientContext);
    this.stopAirflowCommandCallable =
        callableFactory.createUnaryCallable(
            stopAirflowCommandTransportSettings,
            settings.stopAirflowCommandSettings(),
            clientContext);
    this.pollAirflowCommandCallable =
        callableFactory.createUnaryCallable(
            pollAirflowCommandTransportSettings,
            settings.pollAirflowCommandSettings(),
            clientContext);
    this.saveSnapshotCallable =
        callableFactory.createUnaryCallable(
            saveSnapshotTransportSettings, settings.saveSnapshotSettings(), clientContext);
    this.saveSnapshotOperationCallable =
        callableFactory.createOperationCallable(
            saveSnapshotTransportSettings,
            settings.saveSnapshotOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.loadSnapshotCallable =
        callableFactory.createUnaryCallable(
            loadSnapshotTransportSettings, settings.loadSnapshotSettings(), clientContext);
    this.loadSnapshotOperationCallable =
        callableFactory.createOperationCallable(
            loadSnapshotTransportSettings,
            settings.loadSnapshotOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.databaseFailoverCallable =
        callableFactory.createUnaryCallable(
            databaseFailoverTransportSettings, settings.databaseFailoverSettings(), clientContext);
    this.databaseFailoverOperationCallable =
        callableFactory.createOperationCallable(
            databaseFailoverTransportSettings,
            settings.databaseFailoverOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.fetchDatabasePropertiesCallable =
        callableFactory.createUnaryCallable(
            fetchDatabasePropertiesTransportSettings,
            settings.fetchDatabasePropertiesSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @InternalApi
  public static List<ApiMethodDescriptor> getMethodDescriptors() {
    List<ApiMethodDescriptor> methodDescriptors = new ArrayList<>();
    methodDescriptors.add(createEnvironmentMethodDescriptor);
    methodDescriptors.add(getEnvironmentMethodDescriptor);
    methodDescriptors.add(listEnvironmentsMethodDescriptor);
    methodDescriptors.add(updateEnvironmentMethodDescriptor);
    methodDescriptors.add(deleteEnvironmentMethodDescriptor);
    methodDescriptors.add(restartWebServerMethodDescriptor);
    methodDescriptors.add(checkUpgradeMethodDescriptor);
    methodDescriptors.add(executeAirflowCommandMethodDescriptor);
    methodDescriptors.add(stopAirflowCommandMethodDescriptor);
    methodDescriptors.add(pollAirflowCommandMethodDescriptor);
    methodDescriptors.add(saveSnapshotMethodDescriptor);
    methodDescriptors.add(loadSnapshotMethodDescriptor);
    methodDescriptors.add(databaseFailoverMethodDescriptor);
    methodDescriptors.add(fetchDatabasePropertiesMethodDescriptor);
    return methodDescriptors;
  }

  public HttpJsonOperationsStub getHttpJsonOperationsStub() {
    return httpJsonOperationsStub;
  }

  @Override
  public UnaryCallable<CreateEnvironmentRequest, Operation> createEnvironmentCallable() {
    return createEnvironmentCallable;
  }

  @Override
  public OperationCallable<CreateEnvironmentRequest, Environment, OperationMetadata>
      createEnvironmentOperationCallable() {
    return createEnvironmentOperationCallable;
  }

  @Override
  public UnaryCallable<GetEnvironmentRequest, Environment> getEnvironmentCallable() {
    return getEnvironmentCallable;
  }

  @Override
  public UnaryCallable<ListEnvironmentsRequest, ListEnvironmentsResponse>
      listEnvironmentsCallable() {
    return listEnvironmentsCallable;
  }

  @Override
  public UnaryCallable<ListEnvironmentsRequest, ListEnvironmentsPagedResponse>
      listEnvironmentsPagedCallable() {
    return listEnvironmentsPagedCallable;
  }

  @Override
  public UnaryCallable<UpdateEnvironmentRequest, Operation> updateEnvironmentCallable() {
    return updateEnvironmentCallable;
  }

  @Override
  public OperationCallable<UpdateEnvironmentRequest, Environment, OperationMetadata>
      updateEnvironmentOperationCallable() {
    return updateEnvironmentOperationCallable;
  }

  @Override
  public UnaryCallable<DeleteEnvironmentRequest, Operation> deleteEnvironmentCallable() {
    return deleteEnvironmentCallable;
  }

  @Override
  public OperationCallable<DeleteEnvironmentRequest, Empty, OperationMetadata>
      deleteEnvironmentOperationCallable() {
    return deleteEnvironmentOperationCallable;
  }

  @Override
  public UnaryCallable<RestartWebServerRequest, Operation> restartWebServerCallable() {
    return restartWebServerCallable;
  }

  @Override
  public OperationCallable<RestartWebServerRequest, Environment, OperationMetadata>
      restartWebServerOperationCallable() {
    return restartWebServerOperationCallable;
  }

  @Override
  public UnaryCallable<CheckUpgradeRequest, Operation> checkUpgradeCallable() {
    return checkUpgradeCallable;
  }

  @Override
  public OperationCallable<CheckUpgradeRequest, CheckUpgradeResponse, OperationMetadata>
      checkUpgradeOperationCallable() {
    return checkUpgradeOperationCallable;
  }

  @Override
  public UnaryCallable<ExecuteAirflowCommandRequest, ExecuteAirflowCommandResponse>
      executeAirflowCommandCallable() {
    return executeAirflowCommandCallable;
  }

  @Override
  public UnaryCallable<StopAirflowCommandRequest, StopAirflowCommandResponse>
      stopAirflowCommandCallable() {
    return stopAirflowCommandCallable;
  }

  @Override
  public UnaryCallable<PollAirflowCommandRequest, PollAirflowCommandResponse>
      pollAirflowCommandCallable() {
    return pollAirflowCommandCallable;
  }

  @Override
  public UnaryCallable<SaveSnapshotRequest, Operation> saveSnapshotCallable() {
    return saveSnapshotCallable;
  }

  @Override
  public OperationCallable<SaveSnapshotRequest, SaveSnapshotResponse, OperationMetadata>
      saveSnapshotOperationCallable() {
    return saveSnapshotOperationCallable;
  }

  @Override
  public UnaryCallable<LoadSnapshotRequest, Operation> loadSnapshotCallable() {
    return loadSnapshotCallable;
  }

  @Override
  public OperationCallable<LoadSnapshotRequest, LoadSnapshotResponse, OperationMetadata>
      loadSnapshotOperationCallable() {
    return loadSnapshotOperationCallable;
  }

  @Override
  public UnaryCallable<DatabaseFailoverRequest, Operation> databaseFailoverCallable() {
    return databaseFailoverCallable;
  }

  @Override
  public OperationCallable<DatabaseFailoverRequest, DatabaseFailoverResponse, OperationMetadata>
      databaseFailoverOperationCallable() {
    return databaseFailoverOperationCallable;
  }

  @Override
  public UnaryCallable<FetchDatabasePropertiesRequest, FetchDatabasePropertiesResponse>
      fetchDatabasePropertiesCallable() {
    return fetchDatabasePropertiesCallable;
  }

  @Override
  public final void close() {
    try {
      backgroundResources.close();
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException("Failed to close resource", e);
    }
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
