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

package com.google.cloud.automl.v1beta1;

import static com.google.cloud.automl.v1beta1.AutoMlClient.ListColumnSpecsPagedResponse;
import static com.google.cloud.automl.v1beta1.AutoMlClient.ListDatasetsPagedResponse;
import static com.google.cloud.automl.v1beta1.AutoMlClient.ListModelEvaluationsPagedResponse;
import static com.google.cloud.automl.v1beta1.AutoMlClient.ListModelsPagedResponse;
import static com.google.cloud.automl.v1beta1.AutoMlClient.ListTableSpecsPagedResponse;

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
import com.google.cloud.automl.v1beta1.stub.AutoMlStubSettings;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link AutoMlClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (automl.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of createDataset to 30 seconds:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * AutoMlSettings.Builder autoMlSettingsBuilder = AutoMlSettings.newBuilder();
 * autoMlSettingsBuilder
 *     .createDatasetSettings()
 *     .setRetrySettings(
 *         autoMlSettingsBuilder
 *             .createDatasetSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * AutoMlSettings autoMlSettings = autoMlSettingsBuilder.build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class AutoMlSettings extends ClientSettings<AutoMlSettings> {

  /** Returns the object with the settings used for calls to createDataset. */
  public UnaryCallSettings<CreateDatasetRequest, Dataset> createDatasetSettings() {
    return ((AutoMlStubSettings) getStubSettings()).createDatasetSettings();
  }

  /** Returns the object with the settings used for calls to getDataset. */
  public UnaryCallSettings<GetDatasetRequest, Dataset> getDatasetSettings() {
    return ((AutoMlStubSettings) getStubSettings()).getDatasetSettings();
  }

  /** Returns the object with the settings used for calls to listDatasets. */
  public PagedCallSettings<ListDatasetsRequest, ListDatasetsResponse, ListDatasetsPagedResponse>
      listDatasetsSettings() {
    return ((AutoMlStubSettings) getStubSettings()).listDatasetsSettings();
  }

  /** Returns the object with the settings used for calls to updateDataset. */
  public UnaryCallSettings<UpdateDatasetRequest, Dataset> updateDatasetSettings() {
    return ((AutoMlStubSettings) getStubSettings()).updateDatasetSettings();
  }

  /** Returns the object with the settings used for calls to deleteDataset. */
  public UnaryCallSettings<DeleteDatasetRequest, Operation> deleteDatasetSettings() {
    return ((AutoMlStubSettings) getStubSettings()).deleteDatasetSettings();
  }

  /** Returns the object with the settings used for calls to deleteDataset. */
  public OperationCallSettings<DeleteDatasetRequest, Empty, OperationMetadata>
      deleteDatasetOperationSettings() {
    return ((AutoMlStubSettings) getStubSettings()).deleteDatasetOperationSettings();
  }

  /** Returns the object with the settings used for calls to importData. */
  public UnaryCallSettings<ImportDataRequest, Operation> importDataSettings() {
    return ((AutoMlStubSettings) getStubSettings()).importDataSettings();
  }

  /** Returns the object with the settings used for calls to importData. */
  public OperationCallSettings<ImportDataRequest, Empty, OperationMetadata>
      importDataOperationSettings() {
    return ((AutoMlStubSettings) getStubSettings()).importDataOperationSettings();
  }

  /** Returns the object with the settings used for calls to exportData. */
  public UnaryCallSettings<ExportDataRequest, Operation> exportDataSettings() {
    return ((AutoMlStubSettings) getStubSettings()).exportDataSettings();
  }

  /** Returns the object with the settings used for calls to exportData. */
  public OperationCallSettings<ExportDataRequest, Empty, OperationMetadata>
      exportDataOperationSettings() {
    return ((AutoMlStubSettings) getStubSettings()).exportDataOperationSettings();
  }

  /** Returns the object with the settings used for calls to getAnnotationSpec. */
  public UnaryCallSettings<GetAnnotationSpecRequest, AnnotationSpec> getAnnotationSpecSettings() {
    return ((AutoMlStubSettings) getStubSettings()).getAnnotationSpecSettings();
  }

  /** Returns the object with the settings used for calls to getTableSpec. */
  public UnaryCallSettings<GetTableSpecRequest, TableSpec> getTableSpecSettings() {
    return ((AutoMlStubSettings) getStubSettings()).getTableSpecSettings();
  }

  /** Returns the object with the settings used for calls to listTableSpecs. */
  public PagedCallSettings<
          ListTableSpecsRequest, ListTableSpecsResponse, ListTableSpecsPagedResponse>
      listTableSpecsSettings() {
    return ((AutoMlStubSettings) getStubSettings()).listTableSpecsSettings();
  }

  /** Returns the object with the settings used for calls to updateTableSpec. */
  public UnaryCallSettings<UpdateTableSpecRequest, TableSpec> updateTableSpecSettings() {
    return ((AutoMlStubSettings) getStubSettings()).updateTableSpecSettings();
  }

  /** Returns the object with the settings used for calls to getColumnSpec. */
  public UnaryCallSettings<GetColumnSpecRequest, ColumnSpec> getColumnSpecSettings() {
    return ((AutoMlStubSettings) getStubSettings()).getColumnSpecSettings();
  }

  /** Returns the object with the settings used for calls to listColumnSpecs. */
  public PagedCallSettings<
          ListColumnSpecsRequest, ListColumnSpecsResponse, ListColumnSpecsPagedResponse>
      listColumnSpecsSettings() {
    return ((AutoMlStubSettings) getStubSettings()).listColumnSpecsSettings();
  }

  /** Returns the object with the settings used for calls to updateColumnSpec. */
  public UnaryCallSettings<UpdateColumnSpecRequest, ColumnSpec> updateColumnSpecSettings() {
    return ((AutoMlStubSettings) getStubSettings()).updateColumnSpecSettings();
  }

  /** Returns the object with the settings used for calls to createModel. */
  public UnaryCallSettings<CreateModelRequest, Operation> createModelSettings() {
    return ((AutoMlStubSettings) getStubSettings()).createModelSettings();
  }

  /** Returns the object with the settings used for calls to createModel. */
  public OperationCallSettings<CreateModelRequest, Model, OperationMetadata>
      createModelOperationSettings() {
    return ((AutoMlStubSettings) getStubSettings()).createModelOperationSettings();
  }

  /** Returns the object with the settings used for calls to getModel. */
  public UnaryCallSettings<GetModelRequest, Model> getModelSettings() {
    return ((AutoMlStubSettings) getStubSettings()).getModelSettings();
  }

  /** Returns the object with the settings used for calls to listModels. */
  public PagedCallSettings<ListModelsRequest, ListModelsResponse, ListModelsPagedResponse>
      listModelsSettings() {
    return ((AutoMlStubSettings) getStubSettings()).listModelsSettings();
  }

  /** Returns the object with the settings used for calls to deleteModel. */
  public UnaryCallSettings<DeleteModelRequest, Operation> deleteModelSettings() {
    return ((AutoMlStubSettings) getStubSettings()).deleteModelSettings();
  }

  /** Returns the object with the settings used for calls to deleteModel. */
  public OperationCallSettings<DeleteModelRequest, Empty, OperationMetadata>
      deleteModelOperationSettings() {
    return ((AutoMlStubSettings) getStubSettings()).deleteModelOperationSettings();
  }

  /** Returns the object with the settings used for calls to deployModel. */
  public UnaryCallSettings<DeployModelRequest, Operation> deployModelSettings() {
    return ((AutoMlStubSettings) getStubSettings()).deployModelSettings();
  }

  /** Returns the object with the settings used for calls to deployModel. */
  public OperationCallSettings<DeployModelRequest, Empty, OperationMetadata>
      deployModelOperationSettings() {
    return ((AutoMlStubSettings) getStubSettings()).deployModelOperationSettings();
  }

  /** Returns the object with the settings used for calls to undeployModel. */
  public UnaryCallSettings<UndeployModelRequest, Operation> undeployModelSettings() {
    return ((AutoMlStubSettings) getStubSettings()).undeployModelSettings();
  }

  /** Returns the object with the settings used for calls to undeployModel. */
  public OperationCallSettings<UndeployModelRequest, Empty, OperationMetadata>
      undeployModelOperationSettings() {
    return ((AutoMlStubSettings) getStubSettings()).undeployModelOperationSettings();
  }

  /** Returns the object with the settings used for calls to exportModel. */
  public UnaryCallSettings<ExportModelRequest, Operation> exportModelSettings() {
    return ((AutoMlStubSettings) getStubSettings()).exportModelSettings();
  }

  /** Returns the object with the settings used for calls to exportModel. */
  public OperationCallSettings<ExportModelRequest, Empty, OperationMetadata>
      exportModelOperationSettings() {
    return ((AutoMlStubSettings) getStubSettings()).exportModelOperationSettings();
  }

  /** Returns the object with the settings used for calls to exportEvaluatedExamples. */
  public UnaryCallSettings<ExportEvaluatedExamplesRequest, Operation>
      exportEvaluatedExamplesSettings() {
    return ((AutoMlStubSettings) getStubSettings()).exportEvaluatedExamplesSettings();
  }

  /** Returns the object with the settings used for calls to exportEvaluatedExamples. */
  public OperationCallSettings<ExportEvaluatedExamplesRequest, Empty, OperationMetadata>
      exportEvaluatedExamplesOperationSettings() {
    return ((AutoMlStubSettings) getStubSettings()).exportEvaluatedExamplesOperationSettings();
  }

  /** Returns the object with the settings used for calls to getModelEvaluation. */
  public UnaryCallSettings<GetModelEvaluationRequest, ModelEvaluation>
      getModelEvaluationSettings() {
    return ((AutoMlStubSettings) getStubSettings()).getModelEvaluationSettings();
  }

  /** Returns the object with the settings used for calls to listModelEvaluations. */
  public PagedCallSettings<
          ListModelEvaluationsRequest,
          ListModelEvaluationsResponse,
          ListModelEvaluationsPagedResponse>
      listModelEvaluationsSettings() {
    return ((AutoMlStubSettings) getStubSettings()).listModelEvaluationsSettings();
  }

  public static final AutoMlSettings create(AutoMlStubSettings stub) throws IOException {
    return new AutoMlSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return AutoMlStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return AutoMlStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return AutoMlStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return AutoMlStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default gRPC ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return AutoMlStubSettings.defaultGrpcTransportProviderBuilder();
  }

  /** Returns a builder for the default REST ChannelProvider for this service. */
  @BetaApi
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return AutoMlStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return AutoMlStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return AutoMlStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected AutoMlSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for AutoMlSettings. */
  public static class Builder extends ClientSettings.Builder<AutoMlSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(AutoMlStubSettings.newBuilder(clientContext));
    }

    protected Builder(AutoMlSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(AutoMlStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(AutoMlStubSettings.newBuilder());
    }

    @BetaApi
    private static Builder createHttpJsonDefault() {
      return new Builder(AutoMlStubSettings.newHttpJsonBuilder());
    }

    public AutoMlStubSettings.Builder getStubSettingsBuilder() {
      return ((AutoMlStubSettings.Builder) getStubSettings());
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

    /** Returns the builder for the settings used for calls to createDataset. */
    public UnaryCallSettings.Builder<CreateDatasetRequest, Dataset> createDatasetSettings() {
      return getStubSettingsBuilder().createDatasetSettings();
    }

    /** Returns the builder for the settings used for calls to getDataset. */
    public UnaryCallSettings.Builder<GetDatasetRequest, Dataset> getDatasetSettings() {
      return getStubSettingsBuilder().getDatasetSettings();
    }

    /** Returns the builder for the settings used for calls to listDatasets. */
    public PagedCallSettings.Builder<
            ListDatasetsRequest, ListDatasetsResponse, ListDatasetsPagedResponse>
        listDatasetsSettings() {
      return getStubSettingsBuilder().listDatasetsSettings();
    }

    /** Returns the builder for the settings used for calls to updateDataset. */
    public UnaryCallSettings.Builder<UpdateDatasetRequest, Dataset> updateDatasetSettings() {
      return getStubSettingsBuilder().updateDatasetSettings();
    }

    /** Returns the builder for the settings used for calls to deleteDataset. */
    public UnaryCallSettings.Builder<DeleteDatasetRequest, Operation> deleteDatasetSettings() {
      return getStubSettingsBuilder().deleteDatasetSettings();
    }

    /** Returns the builder for the settings used for calls to deleteDataset. */
    public OperationCallSettings.Builder<DeleteDatasetRequest, Empty, OperationMetadata>
        deleteDatasetOperationSettings() {
      return getStubSettingsBuilder().deleteDatasetOperationSettings();
    }

    /** Returns the builder for the settings used for calls to importData. */
    public UnaryCallSettings.Builder<ImportDataRequest, Operation> importDataSettings() {
      return getStubSettingsBuilder().importDataSettings();
    }

    /** Returns the builder for the settings used for calls to importData. */
    public OperationCallSettings.Builder<ImportDataRequest, Empty, OperationMetadata>
        importDataOperationSettings() {
      return getStubSettingsBuilder().importDataOperationSettings();
    }

    /** Returns the builder for the settings used for calls to exportData. */
    public UnaryCallSettings.Builder<ExportDataRequest, Operation> exportDataSettings() {
      return getStubSettingsBuilder().exportDataSettings();
    }

    /** Returns the builder for the settings used for calls to exportData. */
    public OperationCallSettings.Builder<ExportDataRequest, Empty, OperationMetadata>
        exportDataOperationSettings() {
      return getStubSettingsBuilder().exportDataOperationSettings();
    }

    /** Returns the builder for the settings used for calls to getAnnotationSpec. */
    public UnaryCallSettings.Builder<GetAnnotationSpecRequest, AnnotationSpec>
        getAnnotationSpecSettings() {
      return getStubSettingsBuilder().getAnnotationSpecSettings();
    }

    /** Returns the builder for the settings used for calls to getTableSpec. */
    public UnaryCallSettings.Builder<GetTableSpecRequest, TableSpec> getTableSpecSettings() {
      return getStubSettingsBuilder().getTableSpecSettings();
    }

    /** Returns the builder for the settings used for calls to listTableSpecs. */
    public PagedCallSettings.Builder<
            ListTableSpecsRequest, ListTableSpecsResponse, ListTableSpecsPagedResponse>
        listTableSpecsSettings() {
      return getStubSettingsBuilder().listTableSpecsSettings();
    }

    /** Returns the builder for the settings used for calls to updateTableSpec. */
    public UnaryCallSettings.Builder<UpdateTableSpecRequest, TableSpec> updateTableSpecSettings() {
      return getStubSettingsBuilder().updateTableSpecSettings();
    }

    /** Returns the builder for the settings used for calls to getColumnSpec. */
    public UnaryCallSettings.Builder<GetColumnSpecRequest, ColumnSpec> getColumnSpecSettings() {
      return getStubSettingsBuilder().getColumnSpecSettings();
    }

    /** Returns the builder for the settings used for calls to listColumnSpecs. */
    public PagedCallSettings.Builder<
            ListColumnSpecsRequest, ListColumnSpecsResponse, ListColumnSpecsPagedResponse>
        listColumnSpecsSettings() {
      return getStubSettingsBuilder().listColumnSpecsSettings();
    }

    /** Returns the builder for the settings used for calls to updateColumnSpec. */
    public UnaryCallSettings.Builder<UpdateColumnSpecRequest, ColumnSpec>
        updateColumnSpecSettings() {
      return getStubSettingsBuilder().updateColumnSpecSettings();
    }

    /** Returns the builder for the settings used for calls to createModel. */
    public UnaryCallSettings.Builder<CreateModelRequest, Operation> createModelSettings() {
      return getStubSettingsBuilder().createModelSettings();
    }

    /** Returns the builder for the settings used for calls to createModel. */
    public OperationCallSettings.Builder<CreateModelRequest, Model, OperationMetadata>
        createModelOperationSettings() {
      return getStubSettingsBuilder().createModelOperationSettings();
    }

    /** Returns the builder for the settings used for calls to getModel. */
    public UnaryCallSettings.Builder<GetModelRequest, Model> getModelSettings() {
      return getStubSettingsBuilder().getModelSettings();
    }

    /** Returns the builder for the settings used for calls to listModels. */
    public PagedCallSettings.Builder<ListModelsRequest, ListModelsResponse, ListModelsPagedResponse>
        listModelsSettings() {
      return getStubSettingsBuilder().listModelsSettings();
    }

    /** Returns the builder for the settings used for calls to deleteModel. */
    public UnaryCallSettings.Builder<DeleteModelRequest, Operation> deleteModelSettings() {
      return getStubSettingsBuilder().deleteModelSettings();
    }

    /** Returns the builder for the settings used for calls to deleteModel. */
    public OperationCallSettings.Builder<DeleteModelRequest, Empty, OperationMetadata>
        deleteModelOperationSettings() {
      return getStubSettingsBuilder().deleteModelOperationSettings();
    }

    /** Returns the builder for the settings used for calls to deployModel. */
    public UnaryCallSettings.Builder<DeployModelRequest, Operation> deployModelSettings() {
      return getStubSettingsBuilder().deployModelSettings();
    }

    /** Returns the builder for the settings used for calls to deployModel. */
    public OperationCallSettings.Builder<DeployModelRequest, Empty, OperationMetadata>
        deployModelOperationSettings() {
      return getStubSettingsBuilder().deployModelOperationSettings();
    }

    /** Returns the builder for the settings used for calls to undeployModel. */
    public UnaryCallSettings.Builder<UndeployModelRequest, Operation> undeployModelSettings() {
      return getStubSettingsBuilder().undeployModelSettings();
    }

    /** Returns the builder for the settings used for calls to undeployModel. */
    public OperationCallSettings.Builder<UndeployModelRequest, Empty, OperationMetadata>
        undeployModelOperationSettings() {
      return getStubSettingsBuilder().undeployModelOperationSettings();
    }

    /** Returns the builder for the settings used for calls to exportModel. */
    public UnaryCallSettings.Builder<ExportModelRequest, Operation> exportModelSettings() {
      return getStubSettingsBuilder().exportModelSettings();
    }

    /** Returns the builder for the settings used for calls to exportModel. */
    public OperationCallSettings.Builder<ExportModelRequest, Empty, OperationMetadata>
        exportModelOperationSettings() {
      return getStubSettingsBuilder().exportModelOperationSettings();
    }

    /** Returns the builder for the settings used for calls to exportEvaluatedExamples. */
    public UnaryCallSettings.Builder<ExportEvaluatedExamplesRequest, Operation>
        exportEvaluatedExamplesSettings() {
      return getStubSettingsBuilder().exportEvaluatedExamplesSettings();
    }

    /** Returns the builder for the settings used for calls to exportEvaluatedExamples. */
    public OperationCallSettings.Builder<ExportEvaluatedExamplesRequest, Empty, OperationMetadata>
        exportEvaluatedExamplesOperationSettings() {
      return getStubSettingsBuilder().exportEvaluatedExamplesOperationSettings();
    }

    /** Returns the builder for the settings used for calls to getModelEvaluation. */
    public UnaryCallSettings.Builder<GetModelEvaluationRequest, ModelEvaluation>
        getModelEvaluationSettings() {
      return getStubSettingsBuilder().getModelEvaluationSettings();
    }

    /** Returns the builder for the settings used for calls to listModelEvaluations. */
    public PagedCallSettings.Builder<
            ListModelEvaluationsRequest,
            ListModelEvaluationsResponse,
            ListModelEvaluationsPagedResponse>
        listModelEvaluationsSettings() {
      return getStubSettingsBuilder().listModelEvaluationsSettings();
    }

    @Override
    public AutoMlSettings build() throws IOException {
      return new AutoMlSettings(this);
    }
  }
}
