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

package com.google.cloud.talent.v4;

import static com.google.cloud.talent.v4.CompanyServiceClient.ListCompaniesPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.talent.v4.stub.CompanyServiceStubSettings;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link CompanyServiceClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (jobs.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of createCompany to 30 seconds:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * CompanyServiceSettings.Builder companyServiceSettingsBuilder =
 *     CompanyServiceSettings.newBuilder();
 * companyServiceSettingsBuilder
 *     .createCompanySettings()
 *     .setRetrySettings(
 *         companyServiceSettingsBuilder
 *             .createCompanySettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * CompanyServiceSettings companyServiceSettings = companyServiceSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class CompanyServiceSettings extends ClientSettings<CompanyServiceSettings> {

  /** Returns the object with the settings used for calls to createCompany. */
  public UnaryCallSettings<CreateCompanyRequest, Company> createCompanySettings() {
    return ((CompanyServiceStubSettings) getStubSettings()).createCompanySettings();
  }

  /** Returns the object with the settings used for calls to getCompany. */
  public UnaryCallSettings<GetCompanyRequest, Company> getCompanySettings() {
    return ((CompanyServiceStubSettings) getStubSettings()).getCompanySettings();
  }

  /** Returns the object with the settings used for calls to updateCompany. */
  public UnaryCallSettings<UpdateCompanyRequest, Company> updateCompanySettings() {
    return ((CompanyServiceStubSettings) getStubSettings()).updateCompanySettings();
  }

  /** Returns the object with the settings used for calls to deleteCompany. */
  public UnaryCallSettings<DeleteCompanyRequest, Empty> deleteCompanySettings() {
    return ((CompanyServiceStubSettings) getStubSettings()).deleteCompanySettings();
  }

  /** Returns the object with the settings used for calls to listCompanies. */
  public PagedCallSettings<ListCompaniesRequest, ListCompaniesResponse, ListCompaniesPagedResponse>
      listCompaniesSettings() {
    return ((CompanyServiceStubSettings) getStubSettings()).listCompaniesSettings();
  }

  public static final CompanyServiceSettings create(CompanyServiceStubSettings stub)
      throws IOException {
    return new CompanyServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return CompanyServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return CompanyServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return CompanyServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return CompanyServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default gRPC ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return CompanyServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  /** Returns a builder for the default REST ChannelProvider for this service. */
  @BetaApi
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return CompanyServiceStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return CompanyServiceStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return CompanyServiceStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected CompanyServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for CompanyServiceSettings. */
  public static class Builder extends ClientSettings.Builder<CompanyServiceSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(CompanyServiceStubSettings.newBuilder(clientContext));
    }

    protected Builder(CompanyServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(CompanyServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(CompanyServiceStubSettings.newBuilder());
    }

    @BetaApi
    private static Builder createHttpJsonDefault() {
      return new Builder(CompanyServiceStubSettings.newHttpJsonBuilder());
    }

    public CompanyServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((CompanyServiceStubSettings.Builder) getStubSettings());
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

    /** Returns the builder for the settings used for calls to createCompany. */
    public UnaryCallSettings.Builder<CreateCompanyRequest, Company> createCompanySettings() {
      return getStubSettingsBuilder().createCompanySettings();
    }

    /** Returns the builder for the settings used for calls to getCompany. */
    public UnaryCallSettings.Builder<GetCompanyRequest, Company> getCompanySettings() {
      return getStubSettingsBuilder().getCompanySettings();
    }

    /** Returns the builder for the settings used for calls to updateCompany. */
    public UnaryCallSettings.Builder<UpdateCompanyRequest, Company> updateCompanySettings() {
      return getStubSettingsBuilder().updateCompanySettings();
    }

    /** Returns the builder for the settings used for calls to deleteCompany. */
    public UnaryCallSettings.Builder<DeleteCompanyRequest, Empty> deleteCompanySettings() {
      return getStubSettingsBuilder().deleteCompanySettings();
    }

    /** Returns the builder for the settings used for calls to listCompanies. */
    public PagedCallSettings.Builder<
            ListCompaniesRequest, ListCompaniesResponse, ListCompaniesPagedResponse>
        listCompaniesSettings() {
      return getStubSettingsBuilder().listCompaniesSettings();
    }

    @Override
    public CompanyServiceSettings build() throws IOException {
      return new CompanyServiceSettings(this);
    }
  }
}
