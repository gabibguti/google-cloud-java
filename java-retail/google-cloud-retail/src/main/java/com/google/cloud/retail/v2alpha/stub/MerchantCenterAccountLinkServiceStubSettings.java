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

package com.google.cloud.retail.v2alpha.stub;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.grpc.ProtoOperationTransformers;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.HttpJsonTransportChannel;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.longrunning.OperationTimedPollAlgorithm;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.retail.v2alpha.CreateMerchantCenterAccountLinkMetadata;
import com.google.cloud.retail.v2alpha.CreateMerchantCenterAccountLinkRequest;
import com.google.cloud.retail.v2alpha.DeleteMerchantCenterAccountLinkRequest;
import com.google.cloud.retail.v2alpha.ListMerchantCenterAccountLinksRequest;
import com.google.cloud.retail.v2alpha.ListMerchantCenterAccountLinksResponse;
import com.google.cloud.retail.v2alpha.MerchantCenterAccountLink;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link MerchantCenterAccountLinkServiceStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (retail.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of listMerchantCenterAccountLinks to 30 seconds:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * MerchantCenterAccountLinkServiceStubSettings.Builder
 *     merchantCenterAccountLinkServiceSettingsBuilder =
 *         MerchantCenterAccountLinkServiceStubSettings.newBuilder();
 * merchantCenterAccountLinkServiceSettingsBuilder
 *     .listMerchantCenterAccountLinksSettings()
 *     .setRetrySettings(
 *         merchantCenterAccountLinkServiceSettingsBuilder
 *             .listMerchantCenterAccountLinksSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * MerchantCenterAccountLinkServiceStubSettings merchantCenterAccountLinkServiceSettings =
 *     merchantCenterAccountLinkServiceSettingsBuilder.build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class MerchantCenterAccountLinkServiceStubSettings
    extends StubSettings<MerchantCenterAccountLinkServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/cloud-platform").build();

  private final UnaryCallSettings<
          ListMerchantCenterAccountLinksRequest, ListMerchantCenterAccountLinksResponse>
      listMerchantCenterAccountLinksSettings;
  private final UnaryCallSettings<CreateMerchantCenterAccountLinkRequest, Operation>
      createMerchantCenterAccountLinkSettings;
  private final OperationCallSettings<
          CreateMerchantCenterAccountLinkRequest,
          MerchantCenterAccountLink,
          CreateMerchantCenterAccountLinkMetadata>
      createMerchantCenterAccountLinkOperationSettings;
  private final UnaryCallSettings<DeleteMerchantCenterAccountLinkRequest, Empty>
      deleteMerchantCenterAccountLinkSettings;

  /** Returns the object with the settings used for calls to listMerchantCenterAccountLinks. */
  public UnaryCallSettings<
          ListMerchantCenterAccountLinksRequest, ListMerchantCenterAccountLinksResponse>
      listMerchantCenterAccountLinksSettings() {
    return listMerchantCenterAccountLinksSettings;
  }

  /** Returns the object with the settings used for calls to createMerchantCenterAccountLink. */
  public UnaryCallSettings<CreateMerchantCenterAccountLinkRequest, Operation>
      createMerchantCenterAccountLinkSettings() {
    return createMerchantCenterAccountLinkSettings;
  }

  /** Returns the object with the settings used for calls to createMerchantCenterAccountLink. */
  public OperationCallSettings<
          CreateMerchantCenterAccountLinkRequest,
          MerchantCenterAccountLink,
          CreateMerchantCenterAccountLinkMetadata>
      createMerchantCenterAccountLinkOperationSettings() {
    return createMerchantCenterAccountLinkOperationSettings;
  }

  /** Returns the object with the settings used for calls to deleteMerchantCenterAccountLink. */
  public UnaryCallSettings<DeleteMerchantCenterAccountLinkRequest, Empty>
      deleteMerchantCenterAccountLinkSettings() {
    return deleteMerchantCenterAccountLinkSettings;
  }

  public MerchantCenterAccountLinkServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcMerchantCenterAccountLinkServiceStub.create(this);
    }
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonMerchantCenterAccountLinkServiceStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "retail.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "retail.mtls.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder()
        .setScopesToApply(DEFAULT_SERVICE_SCOPES)
        .setUseJwtAccessWithScope(true);
  }

  /** Returns a builder for the default gRPC ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder()
        .setMaxInboundMessageSize(Integer.MAX_VALUE);
  }

  /** Returns a builder for the default REST ChannelProvider for this service. */
  @BetaApi
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return InstantiatingHttpJsonChannelProvider.newBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultGrpcApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic",
            GaxProperties.getLibraryVersion(MerchantCenterAccountLinkServiceStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultHttpJsonApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic",
            GaxProperties.getLibraryVersion(MerchantCenterAccountLinkServiceStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return MerchantCenterAccountLinkServiceStubSettings.defaultGrpcApiClientHeaderProviderBuilder();
  }

  /** Returns a new gRPC builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new REST builder for this class. */
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

  protected MerchantCenterAccountLinkServiceStubSettings(Builder settingsBuilder)
      throws IOException {
    super(settingsBuilder);

    listMerchantCenterAccountLinksSettings =
        settingsBuilder.listMerchantCenterAccountLinksSettings().build();
    createMerchantCenterAccountLinkSettings =
        settingsBuilder.createMerchantCenterAccountLinkSettings().build();
    createMerchantCenterAccountLinkOperationSettings =
        settingsBuilder.createMerchantCenterAccountLinkOperationSettings().build();
    deleteMerchantCenterAccountLinkSettings =
        settingsBuilder.deleteMerchantCenterAccountLinkSettings().build();
  }

  /** Builder for MerchantCenterAccountLinkServiceStubSettings. */
  public static class Builder
      extends StubSettings.Builder<MerchantCenterAccountLinkServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<
            ListMerchantCenterAccountLinksRequest, ListMerchantCenterAccountLinksResponse>
        listMerchantCenterAccountLinksSettings;
    private final UnaryCallSettings.Builder<CreateMerchantCenterAccountLinkRequest, Operation>
        createMerchantCenterAccountLinkSettings;
    private final OperationCallSettings.Builder<
            CreateMerchantCenterAccountLinkRequest,
            MerchantCenterAccountLink,
            CreateMerchantCenterAccountLinkMetadata>
        createMerchantCenterAccountLinkOperationSettings;
    private final UnaryCallSettings.Builder<DeleteMerchantCenterAccountLinkRequest, Empty>
        deleteMerchantCenterAccountLinkSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put("no_retry_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings = RetrySettings.newBuilder().setRpcTimeoutMultiplier(1.0).build();
      definitions.put("no_retry_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      listMerchantCenterAccountLinksSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createMerchantCenterAccountLinkSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createMerchantCenterAccountLinkOperationSettings = OperationCallSettings.newBuilder();
      deleteMerchantCenterAccountLinkSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listMerchantCenterAccountLinksSettings,
              createMerchantCenterAccountLinkSettings,
              deleteMerchantCenterAccountLinkSettings);
      initDefaults(this);
    }

    protected Builder(MerchantCenterAccountLinkServiceStubSettings settings) {
      super(settings);

      listMerchantCenterAccountLinksSettings =
          settings.listMerchantCenterAccountLinksSettings.toBuilder();
      createMerchantCenterAccountLinkSettings =
          settings.createMerchantCenterAccountLinkSettings.toBuilder();
      createMerchantCenterAccountLinkOperationSettings =
          settings.createMerchantCenterAccountLinkOperationSettings.toBuilder();
      deleteMerchantCenterAccountLinkSettings =
          settings.deleteMerchantCenterAccountLinkSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listMerchantCenterAccountLinksSettings,
              createMerchantCenterAccountLinkSettings,
              deleteMerchantCenterAccountLinkSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder createHttpJsonDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultHttpJsonTransportProviderBuilder().build());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultHttpJsonApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .listMerchantCenterAccountLinksSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .createMerchantCenterAccountLinkSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .deleteMerchantCenterAccountLinkSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .createMerchantCenterAccountLinkOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<CreateMerchantCenterAccountLinkRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(
                  MerchantCenterAccountLink.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  CreateMerchantCenterAccountLinkMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      return builder;
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to listMerchantCenterAccountLinks. */
    public UnaryCallSettings.Builder<
            ListMerchantCenterAccountLinksRequest, ListMerchantCenterAccountLinksResponse>
        listMerchantCenterAccountLinksSettings() {
      return listMerchantCenterAccountLinksSettings;
    }

    /** Returns the builder for the settings used for calls to createMerchantCenterAccountLink. */
    public UnaryCallSettings.Builder<CreateMerchantCenterAccountLinkRequest, Operation>
        createMerchantCenterAccountLinkSettings() {
      return createMerchantCenterAccountLinkSettings;
    }

    /** Returns the builder for the settings used for calls to createMerchantCenterAccountLink. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            CreateMerchantCenterAccountLinkRequest,
            MerchantCenterAccountLink,
            CreateMerchantCenterAccountLinkMetadata>
        createMerchantCenterAccountLinkOperationSettings() {
      return createMerchantCenterAccountLinkOperationSettings;
    }

    /** Returns the builder for the settings used for calls to deleteMerchantCenterAccountLink. */
    public UnaryCallSettings.Builder<DeleteMerchantCenterAccountLinkRequest, Empty>
        deleteMerchantCenterAccountLinkSettings() {
      return deleteMerchantCenterAccountLinkSettings;
    }

    @Override
    public MerchantCenterAccountLinkServiceStubSettings build() throws IOException {
      return new MerchantCenterAccountLinkServiceStubSettings(this);
    }
  }
}
