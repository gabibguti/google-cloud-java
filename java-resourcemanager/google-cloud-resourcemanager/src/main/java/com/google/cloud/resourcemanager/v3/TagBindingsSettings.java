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

package com.google.cloud.resourcemanager.v3;

import static com.google.cloud.resourcemanager.v3.TagBindingsClient.ListEffectiveTagsPagedResponse;
import static com.google.cloud.resourcemanager.v3.TagBindingsClient.ListTagBindingsPagedResponse;

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
import com.google.cloud.resourcemanager.v3.stub.TagBindingsStubSettings;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link TagBindingsClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (cloudresourcemanager.googleapis.com) and default port (443)
 *       are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of listTagBindings to 30 seconds:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * TagBindingsSettings.Builder tagBindingsSettingsBuilder = TagBindingsSettings.newBuilder();
 * tagBindingsSettingsBuilder
 *     .listTagBindingsSettings()
 *     .setRetrySettings(
 *         tagBindingsSettingsBuilder
 *             .listTagBindingsSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * TagBindingsSettings tagBindingsSettings = tagBindingsSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class TagBindingsSettings extends ClientSettings<TagBindingsSettings> {

  /** Returns the object with the settings used for calls to listTagBindings. */
  public PagedCallSettings<
          ListTagBindingsRequest, ListTagBindingsResponse, ListTagBindingsPagedResponse>
      listTagBindingsSettings() {
    return ((TagBindingsStubSettings) getStubSettings()).listTagBindingsSettings();
  }

  /** Returns the object with the settings used for calls to createTagBinding. */
  public UnaryCallSettings<CreateTagBindingRequest, Operation> createTagBindingSettings() {
    return ((TagBindingsStubSettings) getStubSettings()).createTagBindingSettings();
  }

  /** Returns the object with the settings used for calls to createTagBinding. */
  public OperationCallSettings<CreateTagBindingRequest, TagBinding, CreateTagBindingMetadata>
      createTagBindingOperationSettings() {
    return ((TagBindingsStubSettings) getStubSettings()).createTagBindingOperationSettings();
  }

  /** Returns the object with the settings used for calls to deleteTagBinding. */
  public UnaryCallSettings<DeleteTagBindingRequest, Operation> deleteTagBindingSettings() {
    return ((TagBindingsStubSettings) getStubSettings()).deleteTagBindingSettings();
  }

  /** Returns the object with the settings used for calls to deleteTagBinding. */
  public OperationCallSettings<DeleteTagBindingRequest, Empty, DeleteTagBindingMetadata>
      deleteTagBindingOperationSettings() {
    return ((TagBindingsStubSettings) getStubSettings()).deleteTagBindingOperationSettings();
  }

  /** Returns the object with the settings used for calls to listEffectiveTags. */
  public PagedCallSettings<
          ListEffectiveTagsRequest, ListEffectiveTagsResponse, ListEffectiveTagsPagedResponse>
      listEffectiveTagsSettings() {
    return ((TagBindingsStubSettings) getStubSettings()).listEffectiveTagsSettings();
  }

  public static final TagBindingsSettings create(TagBindingsStubSettings stub) throws IOException {
    return new TagBindingsSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return TagBindingsStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return TagBindingsStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return TagBindingsStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return TagBindingsStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default gRPC ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return TagBindingsStubSettings.defaultGrpcTransportProviderBuilder();
  }

  /** Returns a builder for the default REST ChannelProvider for this service. */
  @BetaApi
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return TagBindingsStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return TagBindingsStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return TagBindingsStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected TagBindingsSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for TagBindingsSettings. */
  public static class Builder extends ClientSettings.Builder<TagBindingsSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(TagBindingsStubSettings.newBuilder(clientContext));
    }

    protected Builder(TagBindingsSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(TagBindingsStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(TagBindingsStubSettings.newBuilder());
    }

    @BetaApi
    private static Builder createHttpJsonDefault() {
      return new Builder(TagBindingsStubSettings.newHttpJsonBuilder());
    }

    public TagBindingsStubSettings.Builder getStubSettingsBuilder() {
      return ((TagBindingsStubSettings.Builder) getStubSettings());
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

    /** Returns the builder for the settings used for calls to listTagBindings. */
    public PagedCallSettings.Builder<
            ListTagBindingsRequest, ListTagBindingsResponse, ListTagBindingsPagedResponse>
        listTagBindingsSettings() {
      return getStubSettingsBuilder().listTagBindingsSettings();
    }

    /** Returns the builder for the settings used for calls to createTagBinding. */
    public UnaryCallSettings.Builder<CreateTagBindingRequest, Operation>
        createTagBindingSettings() {
      return getStubSettingsBuilder().createTagBindingSettings();
    }

    /** Returns the builder for the settings used for calls to createTagBinding. */
    public OperationCallSettings.Builder<
            CreateTagBindingRequest, TagBinding, CreateTagBindingMetadata>
        createTagBindingOperationSettings() {
      return getStubSettingsBuilder().createTagBindingOperationSettings();
    }

    /** Returns the builder for the settings used for calls to deleteTagBinding. */
    public UnaryCallSettings.Builder<DeleteTagBindingRequest, Operation>
        deleteTagBindingSettings() {
      return getStubSettingsBuilder().deleteTagBindingSettings();
    }

    /** Returns the builder for the settings used for calls to deleteTagBinding. */
    public OperationCallSettings.Builder<DeleteTagBindingRequest, Empty, DeleteTagBindingMetadata>
        deleteTagBindingOperationSettings() {
      return getStubSettingsBuilder().deleteTagBindingOperationSettings();
    }

    /** Returns the builder for the settings used for calls to listEffectiveTags. */
    public PagedCallSettings.Builder<
            ListEffectiveTagsRequest, ListEffectiveTagsResponse, ListEffectiveTagsPagedResponse>
        listEffectiveTagsSettings() {
      return getStubSettingsBuilder().listEffectiveTagsSettings();
    }

    @Override
    public TagBindingsSettings build() throws IOException {
      return new TagBindingsSettings(this);
    }
  }
}
