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

package com.google.cloud.orchestration.airflow.service.v1.stub;

import static com.google.cloud.orchestration.airflow.service.v1.EnvironmentsClient.ListEnvironmentsPagedResponse;

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.RequestParamsBuilder;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.orchestration.airflow.service.v1.CreateEnvironmentRequest;
import com.google.cloud.orchestration.airflow.service.v1.DatabaseFailoverRequest;
import com.google.cloud.orchestration.airflow.service.v1.DatabaseFailoverResponse;
import com.google.cloud.orchestration.airflow.service.v1.DeleteEnvironmentRequest;
import com.google.cloud.orchestration.airflow.service.v1.Environment;
import com.google.cloud.orchestration.airflow.service.v1.ExecuteAirflowCommandRequest;
import com.google.cloud.orchestration.airflow.service.v1.ExecuteAirflowCommandResponse;
import com.google.cloud.orchestration.airflow.service.v1.FetchDatabasePropertiesRequest;
import com.google.cloud.orchestration.airflow.service.v1.FetchDatabasePropertiesResponse;
import com.google.cloud.orchestration.airflow.service.v1.GetEnvironmentRequest;
import com.google.cloud.orchestration.airflow.service.v1.ListEnvironmentsRequest;
import com.google.cloud.orchestration.airflow.service.v1.ListEnvironmentsResponse;
import com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest;
import com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotResponse;
import com.google.cloud.orchestration.airflow.service.v1.OperationMetadata;
import com.google.cloud.orchestration.airflow.service.v1.PollAirflowCommandRequest;
import com.google.cloud.orchestration.airflow.service.v1.PollAirflowCommandResponse;
import com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest;
import com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse;
import com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandRequest;
import com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse;
import com.google.cloud.orchestration.airflow.service.v1.UpdateEnvironmentRequest;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.GrpcOperationsStub;
import com.google.protobuf.Empty;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * gRPC stub implementation for the Environments service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcEnvironmentsStub extends EnvironmentsStub {
  private static final MethodDescriptor<CreateEnvironmentRequest, Operation>
      createEnvironmentMethodDescriptor =
          MethodDescriptor.<CreateEnvironmentRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.orchestration.airflow.service.v1.Environments/CreateEnvironment")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateEnvironmentRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetEnvironmentRequest, Environment>
      getEnvironmentMethodDescriptor =
          MethodDescriptor.<GetEnvironmentRequest, Environment>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.orchestration.airflow.service.v1.Environments/GetEnvironment")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetEnvironmentRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Environment.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ListEnvironmentsRequest, ListEnvironmentsResponse>
      listEnvironmentsMethodDescriptor =
          MethodDescriptor.<ListEnvironmentsRequest, ListEnvironmentsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.orchestration.airflow.service.v1.Environments/ListEnvironments")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListEnvironmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListEnvironmentsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<UpdateEnvironmentRequest, Operation>
      updateEnvironmentMethodDescriptor =
          MethodDescriptor.<UpdateEnvironmentRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.orchestration.airflow.service.v1.Environments/UpdateEnvironment")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateEnvironmentRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<DeleteEnvironmentRequest, Operation>
      deleteEnvironmentMethodDescriptor =
          MethodDescriptor.<DeleteEnvironmentRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.orchestration.airflow.service.v1.Environments/DeleteEnvironment")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeleteEnvironmentRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ExecuteAirflowCommandRequest, ExecuteAirflowCommandResponse>
      executeAirflowCommandMethodDescriptor =
          MethodDescriptor.<ExecuteAirflowCommandRequest, ExecuteAirflowCommandResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.orchestration.airflow.service.v1.Environments/ExecuteAirflowCommand")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ExecuteAirflowCommandRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ExecuteAirflowCommandResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<StopAirflowCommandRequest, StopAirflowCommandResponse>
      stopAirflowCommandMethodDescriptor =
          MethodDescriptor.<StopAirflowCommandRequest, StopAirflowCommandResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.orchestration.airflow.service.v1.Environments/StopAirflowCommand")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(StopAirflowCommandRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(StopAirflowCommandResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<PollAirflowCommandRequest, PollAirflowCommandResponse>
      pollAirflowCommandMethodDescriptor =
          MethodDescriptor.<PollAirflowCommandRequest, PollAirflowCommandResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.orchestration.airflow.service.v1.Environments/PollAirflowCommand")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(PollAirflowCommandRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(PollAirflowCommandResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<SaveSnapshotRequest, Operation>
      saveSnapshotMethodDescriptor =
          MethodDescriptor.<SaveSnapshotRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.orchestration.airflow.service.v1.Environments/SaveSnapshot")
              .setRequestMarshaller(ProtoUtils.marshaller(SaveSnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<LoadSnapshotRequest, Operation>
      loadSnapshotMethodDescriptor =
          MethodDescriptor.<LoadSnapshotRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.orchestration.airflow.service.v1.Environments/LoadSnapshot")
              .setRequestMarshaller(ProtoUtils.marshaller(LoadSnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<DatabaseFailoverRequest, Operation>
      databaseFailoverMethodDescriptor =
          MethodDescriptor.<DatabaseFailoverRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.orchestration.airflow.service.v1.Environments/DatabaseFailover")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DatabaseFailoverRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          FetchDatabasePropertiesRequest, FetchDatabasePropertiesResponse>
      fetchDatabasePropertiesMethodDescriptor =
          MethodDescriptor
              .<FetchDatabasePropertiesRequest, FetchDatabasePropertiesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.orchestration.airflow.service.v1.Environments/FetchDatabaseProperties")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(FetchDatabasePropertiesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(FetchDatabasePropertiesResponse.getDefaultInstance()))
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
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcEnvironmentsStub create(EnvironmentsStubSettings settings)
      throws IOException {
    return new GrpcEnvironmentsStub(settings, ClientContext.create(settings));
  }

  public static final GrpcEnvironmentsStub create(ClientContext clientContext) throws IOException {
    return new GrpcEnvironmentsStub(EnvironmentsStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcEnvironmentsStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcEnvironmentsStub(
        EnvironmentsStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcEnvironmentsStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcEnvironmentsStub(EnvironmentsStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcEnvironmentsCallableFactory());
  }

  /**
   * Constructs an instance of GrpcEnvironmentsStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcEnvironmentsStub(
      EnvironmentsStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<CreateEnvironmentRequest, Operation> createEnvironmentTransportSettings =
        GrpcCallSettings.<CreateEnvironmentRequest, Operation>newBuilder()
            .setMethodDescriptor(createEnvironmentMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("parent", String.valueOf(request.getParent()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<GetEnvironmentRequest, Environment> getEnvironmentTransportSettings =
        GrpcCallSettings.<GetEnvironmentRequest, Environment>newBuilder()
            .setMethodDescriptor(getEnvironmentMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<ListEnvironmentsRequest, ListEnvironmentsResponse>
        listEnvironmentsTransportSettings =
            GrpcCallSettings.<ListEnvironmentsRequest, ListEnvironmentsResponse>newBuilder()
                .setMethodDescriptor(listEnvironmentsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("parent", String.valueOf(request.getParent()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<UpdateEnvironmentRequest, Operation> updateEnvironmentTransportSettings =
        GrpcCallSettings.<UpdateEnvironmentRequest, Operation>newBuilder()
            .setMethodDescriptor(updateEnvironmentMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<DeleteEnvironmentRequest, Operation> deleteEnvironmentTransportSettings =
        GrpcCallSettings.<DeleteEnvironmentRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteEnvironmentMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<ExecuteAirflowCommandRequest, ExecuteAirflowCommandResponse>
        executeAirflowCommandTransportSettings =
            GrpcCallSettings
                .<ExecuteAirflowCommandRequest, ExecuteAirflowCommandResponse>newBuilder()
                .setMethodDescriptor(executeAirflowCommandMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("environment", String.valueOf(request.getEnvironment()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<StopAirflowCommandRequest, StopAirflowCommandResponse>
        stopAirflowCommandTransportSettings =
            GrpcCallSettings.<StopAirflowCommandRequest, StopAirflowCommandResponse>newBuilder()
                .setMethodDescriptor(stopAirflowCommandMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("environment", String.valueOf(request.getEnvironment()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<PollAirflowCommandRequest, PollAirflowCommandResponse>
        pollAirflowCommandTransportSettings =
            GrpcCallSettings.<PollAirflowCommandRequest, PollAirflowCommandResponse>newBuilder()
                .setMethodDescriptor(pollAirflowCommandMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("environment", String.valueOf(request.getEnvironment()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<SaveSnapshotRequest, Operation> saveSnapshotTransportSettings =
        GrpcCallSettings.<SaveSnapshotRequest, Operation>newBuilder()
            .setMethodDescriptor(saveSnapshotMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("environment", String.valueOf(request.getEnvironment()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<LoadSnapshotRequest, Operation> loadSnapshotTransportSettings =
        GrpcCallSettings.<LoadSnapshotRequest, Operation>newBuilder()
            .setMethodDescriptor(loadSnapshotMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("environment", String.valueOf(request.getEnvironment()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<DatabaseFailoverRequest, Operation> databaseFailoverTransportSettings =
        GrpcCallSettings.<DatabaseFailoverRequest, Operation>newBuilder()
            .setMethodDescriptor(databaseFailoverMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("environment", String.valueOf(request.getEnvironment()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<FetchDatabasePropertiesRequest, FetchDatabasePropertiesResponse>
        fetchDatabasePropertiesTransportSettings =
            GrpcCallSettings
                .<FetchDatabasePropertiesRequest, FetchDatabasePropertiesResponse>newBuilder()
                .setMethodDescriptor(fetchDatabasePropertiesMethodDescriptor)
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
            operationsStub);
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
            operationsStub);
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
            operationsStub);
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
            operationsStub);
    this.loadSnapshotCallable =
        callableFactory.createUnaryCallable(
            loadSnapshotTransportSettings, settings.loadSnapshotSettings(), clientContext);
    this.loadSnapshotOperationCallable =
        callableFactory.createOperationCallable(
            loadSnapshotTransportSettings,
            settings.loadSnapshotOperationSettings(),
            clientContext,
            operationsStub);
    this.databaseFailoverCallable =
        callableFactory.createUnaryCallable(
            databaseFailoverTransportSettings, settings.databaseFailoverSettings(), clientContext);
    this.databaseFailoverOperationCallable =
        callableFactory.createOperationCallable(
            databaseFailoverTransportSettings,
            settings.databaseFailoverOperationSettings(),
            clientContext,
            operationsStub);
    this.fetchDatabasePropertiesCallable =
        callableFactory.createUnaryCallable(
            fetchDatabasePropertiesTransportSettings,
            settings.fetchDatabasePropertiesSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
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
