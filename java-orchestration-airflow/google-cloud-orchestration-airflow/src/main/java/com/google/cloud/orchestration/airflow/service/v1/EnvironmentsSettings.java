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

package com.google.cloud.orchestration.airflow.service.v1;

import static com.google.cloud.orchestration.airflow.service.v1.EnvironmentsClient.ListEnvironmentsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.orchestration.airflow.service.v1.stub.EnvironmentsStubSettings;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link EnvironmentsClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (composer.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of getEnvironment to 30 seconds:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * EnvironmentsSettings.Builder environmentsSettingsBuilder = EnvironmentsSettings.newBuilder();
 * environmentsSettingsBuilder
 *     .getEnvironmentSettings()
 *     .setRetrySettings(
 *         environmentsSettingsBuilder
 *             .getEnvironmentSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * EnvironmentsSettings environmentsSettings = environmentsSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class EnvironmentsSettings extends ClientSettings<EnvironmentsSettings> {

  /** Returns the object with the settings used for calls to createEnvironment. */
  public UnaryCallSettings<CreateEnvironmentRequest, Operation> createEnvironmentSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).createEnvironmentSettings();
  }

  /** Returns the object with the settings used for calls to createEnvironment. */
  public OperationCallSettings<CreateEnvironmentRequest, Environment, OperationMetadata>
      createEnvironmentOperationSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).createEnvironmentOperationSettings();
  }

  /** Returns the object with the settings used for calls to getEnvironment. */
  public UnaryCallSettings<GetEnvironmentRequest, Environment> getEnvironmentSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).getEnvironmentSettings();
  }

  /** Returns the object with the settings used for calls to listEnvironments. */
  public PagedCallSettings<
          ListEnvironmentsRequest, ListEnvironmentsResponse, ListEnvironmentsPagedResponse>
      listEnvironmentsSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).listEnvironmentsSettings();
  }

  /** Returns the object with the settings used for calls to updateEnvironment. */
  public UnaryCallSettings<UpdateEnvironmentRequest, Operation> updateEnvironmentSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).updateEnvironmentSettings();
  }

  /** Returns the object with the settings used for calls to updateEnvironment. */
  public OperationCallSettings<UpdateEnvironmentRequest, Environment, OperationMetadata>
      updateEnvironmentOperationSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).updateEnvironmentOperationSettings();
  }

  /** Returns the object with the settings used for calls to deleteEnvironment. */
  public UnaryCallSettings<DeleteEnvironmentRequest, Operation> deleteEnvironmentSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).deleteEnvironmentSettings();
  }

  /** Returns the object with the settings used for calls to deleteEnvironment. */
  public OperationCallSettings<DeleteEnvironmentRequest, Empty, OperationMetadata>
      deleteEnvironmentOperationSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).deleteEnvironmentOperationSettings();
  }

  /** Returns the object with the settings used for calls to executeAirflowCommand. */
  public UnaryCallSettings<ExecuteAirflowCommandRequest, ExecuteAirflowCommandResponse>
      executeAirflowCommandSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).executeAirflowCommandSettings();
  }

  /** Returns the object with the settings used for calls to stopAirflowCommand. */
  public UnaryCallSettings<StopAirflowCommandRequest, StopAirflowCommandResponse>
      stopAirflowCommandSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).stopAirflowCommandSettings();
  }

  /** Returns the object with the settings used for calls to pollAirflowCommand. */
  public UnaryCallSettings<PollAirflowCommandRequest, PollAirflowCommandResponse>
      pollAirflowCommandSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).pollAirflowCommandSettings();
  }

  /** Returns the object with the settings used for calls to saveSnapshot. */
  public UnaryCallSettings<SaveSnapshotRequest, Operation> saveSnapshotSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).saveSnapshotSettings();
  }

  /** Returns the object with the settings used for calls to saveSnapshot. */
  public OperationCallSettings<SaveSnapshotRequest, SaveSnapshotResponse, OperationMetadata>
      saveSnapshotOperationSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).saveSnapshotOperationSettings();
  }

  /** Returns the object with the settings used for calls to loadSnapshot. */
  public UnaryCallSettings<LoadSnapshotRequest, Operation> loadSnapshotSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).loadSnapshotSettings();
  }

  /** Returns the object with the settings used for calls to loadSnapshot. */
  public OperationCallSettings<LoadSnapshotRequest, LoadSnapshotResponse, OperationMetadata>
      loadSnapshotOperationSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).loadSnapshotOperationSettings();
  }

  /** Returns the object with the settings used for calls to databaseFailover. */
  public UnaryCallSettings<DatabaseFailoverRequest, Operation> databaseFailoverSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).databaseFailoverSettings();
  }

  /** Returns the object with the settings used for calls to databaseFailover. */
  public OperationCallSettings<DatabaseFailoverRequest, DatabaseFailoverResponse, OperationMetadata>
      databaseFailoverOperationSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).databaseFailoverOperationSettings();
  }

  /** Returns the object with the settings used for calls to fetchDatabaseProperties. */
  public UnaryCallSettings<FetchDatabasePropertiesRequest, FetchDatabasePropertiesResponse>
      fetchDatabasePropertiesSettings() {
    return ((EnvironmentsStubSettings) getStubSettings()).fetchDatabasePropertiesSettings();
  }

  public static final EnvironmentsSettings create(EnvironmentsStubSettings stub)
      throws IOException {
    return new EnvironmentsSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return EnvironmentsStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return EnvironmentsStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return EnvironmentsStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return EnvironmentsStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default gRPC ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return EnvironmentsStubSettings.defaultGrpcTransportProviderBuilder();
  }

  /** Returns a builder for the default REST ChannelProvider for this service. */
  @BetaApi
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return EnvironmentsStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return EnvironmentsStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return EnvironmentsStubSettings.defaultApiClientHeaderProviderBuilder();
  }

  /** Returns a new gRPC builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new REST builder for this class. */
  @BetaApi
  public static Builder newHttpJsonBuilder() {
    return Builder.createHttpJsonDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected EnvironmentsSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for EnvironmentsSettings. */
  public static class Builder extends ClientSettings.Builder<EnvironmentsSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(EnvironmentsStubSettings.newBuilder(clientContext));
    }

    protected Builder(EnvironmentsSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(EnvironmentsStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(EnvironmentsStubSettings.newBuilder());
    }

    @BetaApi
    private static Builder createHttpJsonDefault() {
      return new Builder(EnvironmentsStubSettings.newHttpJsonBuilder());
    }

    public EnvironmentsStubSettings.Builder getStubSettingsBuilder() {
      return ((EnvironmentsStubSettings.Builder) getStubSettings());
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to createEnvironment. */
    public UnaryCallSettings.Builder<CreateEnvironmentRequest, Operation>
        createEnvironmentSettings() {
      return getStubSettingsBuilder().createEnvironmentSettings();
    }

    /** Returns the builder for the settings used for calls to createEnvironment. */
    public OperationCallSettings.Builder<CreateEnvironmentRequest, Environment, OperationMetadata>
        createEnvironmentOperationSettings() {
      return getStubSettingsBuilder().createEnvironmentOperationSettings();
    }

    /** Returns the builder for the settings used for calls to getEnvironment. */
    public UnaryCallSettings.Builder<GetEnvironmentRequest, Environment> getEnvironmentSettings() {
      return getStubSettingsBuilder().getEnvironmentSettings();
    }

    /** Returns the builder for the settings used for calls to listEnvironments. */
    public PagedCallSettings.Builder<
            ListEnvironmentsRequest, ListEnvironmentsResponse, ListEnvironmentsPagedResponse>
        listEnvironmentsSettings() {
      return getStubSettingsBuilder().listEnvironmentsSettings();
    }

    /** Returns the builder for the settings used for calls to updateEnvironment. */
    public UnaryCallSettings.Builder<UpdateEnvironmentRequest, Operation>
        updateEnvironmentSettings() {
      return getStubSettingsBuilder().updateEnvironmentSettings();
    }

    /** Returns the builder for the settings used for calls to updateEnvironment. */
    public OperationCallSettings.Builder<UpdateEnvironmentRequest, Environment, OperationMetadata>
        updateEnvironmentOperationSettings() {
      return getStubSettingsBuilder().updateEnvironmentOperationSettings();
    }

    /** Returns the builder for the settings used for calls to deleteEnvironment. */
    public UnaryCallSettings.Builder<DeleteEnvironmentRequest, Operation>
        deleteEnvironmentSettings() {
      return getStubSettingsBuilder().deleteEnvironmentSettings();
    }

    /** Returns the builder for the settings used for calls to deleteEnvironment. */
    public OperationCallSettings.Builder<DeleteEnvironmentRequest, Empty, OperationMetadata>
        deleteEnvironmentOperationSettings() {
      return getStubSettingsBuilder().deleteEnvironmentOperationSettings();
    }

    /** Returns the builder for the settings used for calls to executeAirflowCommand. */
    public UnaryCallSettings.Builder<ExecuteAirflowCommandRequest, ExecuteAirflowCommandResponse>
        executeAirflowCommandSettings() {
      return getStubSettingsBuilder().executeAirflowCommandSettings();
    }

    /** Returns the builder for the settings used for calls to stopAirflowCommand. */
    public UnaryCallSettings.Builder<StopAirflowCommandRequest, StopAirflowCommandResponse>
        stopAirflowCommandSettings() {
      return getStubSettingsBuilder().stopAirflowCommandSettings();
    }

    /** Returns the builder for the settings used for calls to pollAirflowCommand. */
    public UnaryCallSettings.Builder<PollAirflowCommandRequest, PollAirflowCommandResponse>
        pollAirflowCommandSettings() {
      return getStubSettingsBuilder().pollAirflowCommandSettings();
    }

    /** Returns the builder for the settings used for calls to saveSnapshot. */
    public UnaryCallSettings.Builder<SaveSnapshotRequest, Operation> saveSnapshotSettings() {
      return getStubSettingsBuilder().saveSnapshotSettings();
    }

    /** Returns the builder for the settings used for calls to saveSnapshot. */
    public OperationCallSettings.Builder<
            SaveSnapshotRequest, SaveSnapshotResponse, OperationMetadata>
        saveSnapshotOperationSettings() {
      return getStubSettingsBuilder().saveSnapshotOperationSettings();
    }

    /** Returns the builder for the settings used for calls to loadSnapshot. */
    public UnaryCallSettings.Builder<LoadSnapshotRequest, Operation> loadSnapshotSettings() {
      return getStubSettingsBuilder().loadSnapshotSettings();
    }

    /** Returns the builder for the settings used for calls to loadSnapshot. */
    public OperationCallSettings.Builder<
            LoadSnapshotRequest, LoadSnapshotResponse, OperationMetadata>
        loadSnapshotOperationSettings() {
      return getStubSettingsBuilder().loadSnapshotOperationSettings();
    }

    /** Returns the builder for the settings used for calls to databaseFailover. */
    public UnaryCallSettings.Builder<DatabaseFailoverRequest, Operation>
        databaseFailoverSettings() {
      return getStubSettingsBuilder().databaseFailoverSettings();
    }

    /** Returns the builder for the settings used for calls to databaseFailover. */
    public OperationCallSettings.Builder<
            DatabaseFailoverRequest, DatabaseFailoverResponse, OperationMetadata>
        databaseFailoverOperationSettings() {
      return getStubSettingsBuilder().databaseFailoverOperationSettings();
    }

    /** Returns the builder for the settings used for calls to fetchDatabaseProperties. */
    public UnaryCallSettings.Builder<
            FetchDatabasePropertiesRequest, FetchDatabasePropertiesResponse>
        fetchDatabasePropertiesSettings() {
      return getStubSettingsBuilder().fetchDatabasePropertiesSettings();
    }

    @Override
    public EnvironmentsSettings build() throws IOException {
      return new EnvironmentsSettings(this);
    }
  }
}
