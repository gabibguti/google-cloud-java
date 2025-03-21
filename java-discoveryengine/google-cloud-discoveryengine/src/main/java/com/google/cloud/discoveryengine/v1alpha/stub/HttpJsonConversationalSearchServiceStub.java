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

package com.google.cloud.discoveryengine.v1alpha.stub;

import static com.google.cloud.discoveryengine.v1alpha.ConversationalSearchServiceClient.ListConversationsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.httpjson.ProtoMessageRequestFormatter;
import com.google.api.gax.httpjson.ProtoMessageResponseParser;
import com.google.api.gax.httpjson.ProtoRestSerializer;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsBuilder;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.discoveryengine.v1alpha.Conversation;
import com.google.cloud.discoveryengine.v1alpha.ConverseConversationRequest;
import com.google.cloud.discoveryengine.v1alpha.ConverseConversationResponse;
import com.google.cloud.discoveryengine.v1alpha.CreateConversationRequest;
import com.google.cloud.discoveryengine.v1alpha.DeleteConversationRequest;
import com.google.cloud.discoveryengine.v1alpha.GetConversationRequest;
import com.google.cloud.discoveryengine.v1alpha.ListConversationsRequest;
import com.google.cloud.discoveryengine.v1alpha.ListConversationsResponse;
import com.google.cloud.discoveryengine.v1alpha.UpdateConversationRequest;
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
 * REST stub implementation for the ConversationalSearchService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class HttpJsonConversationalSearchServiceStub extends ConversationalSearchServiceStub {
  private static final TypeRegistry typeRegistry = TypeRegistry.newBuilder().build();

  private static final ApiMethodDescriptor<
          ConverseConversationRequest, ConverseConversationResponse>
      converseConversationMethodDescriptor =
          ApiMethodDescriptor
              .<ConverseConversationRequest, ConverseConversationResponse>newBuilder()
              .setFullMethodName(
                  "google.cloud.discoveryengine.v1alpha.ConversationalSearchService/ConverseConversation")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ConverseConversationRequest>newBuilder()
                      .setPath(
                          "/v1alpha/{name=projects/*/locations/*/dataStores/*/conversations/*}:converse",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ConverseConversationRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setAdditionalPaths(
                          "/v1alpha/{name=projects/*/locations/*/collections/*/dataStores/*/conversations/*}:converse")
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ConverseConversationRequest> serializer =
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
                  ProtoMessageResponseParser.<ConverseConversationResponse>newBuilder()
                      .setDefaultInstance(ConverseConversationResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<CreateConversationRequest, Conversation>
      createConversationMethodDescriptor =
          ApiMethodDescriptor.<CreateConversationRequest, Conversation>newBuilder()
              .setFullMethodName(
                  "google.cloud.discoveryengine.v1alpha.ConversationalSearchService/CreateConversation")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<CreateConversationRequest>newBuilder()
                      .setPath(
                          "/v1alpha/{parent=projects/*/locations/*/dataStores/*}/conversations",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<CreateConversationRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setAdditionalPaths(
                          "/v1alpha/{parent=projects/*/locations/*/collections/*/dataStores/*}/conversations")
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<CreateConversationRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("conversation", request.getConversation(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Conversation>newBuilder()
                      .setDefaultInstance(Conversation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<DeleteConversationRequest, Empty>
      deleteConversationMethodDescriptor =
          ApiMethodDescriptor.<DeleteConversationRequest, Empty>newBuilder()
              .setFullMethodName(
                  "google.cloud.discoveryengine.v1alpha.ConversationalSearchService/DeleteConversation")
              .setHttpMethod("DELETE")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<DeleteConversationRequest>newBuilder()
                      .setPath(
                          "/v1alpha/{name=projects/*/locations/*/dataStores/*/conversations/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteConversationRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setAdditionalPaths(
                          "/v1alpha/{name=projects/*/locations/*/collections/*/dataStores/*/conversations/*}")
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteConversationRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Empty>newBuilder()
                      .setDefaultInstance(Empty.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<UpdateConversationRequest, Conversation>
      updateConversationMethodDescriptor =
          ApiMethodDescriptor.<UpdateConversationRequest, Conversation>newBuilder()
              .setFullMethodName(
                  "google.cloud.discoveryengine.v1alpha.ConversationalSearchService/UpdateConversation")
              .setHttpMethod("PATCH")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<UpdateConversationRequest>newBuilder()
                      .setPath(
                          "/v1alpha/{conversation.name=projects/*/locations/*/dataStores/*/conversations/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<UpdateConversationRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields, "conversation.name", request.getConversation().getName());
                            return fields;
                          })
                      .setAdditionalPaths(
                          "/v1alpha/{conversation.name=projects/*/locations/*/collections/*/dataStores/*/conversations/*}")
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<UpdateConversationRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "updateMask", request.getUpdateMask());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("conversation", request.getConversation(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Conversation>newBuilder()
                      .setDefaultInstance(Conversation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetConversationRequest, Conversation>
      getConversationMethodDescriptor =
          ApiMethodDescriptor.<GetConversationRequest, Conversation>newBuilder()
              .setFullMethodName(
                  "google.cloud.discoveryengine.v1alpha.ConversationalSearchService/GetConversation")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetConversationRequest>newBuilder()
                      .setPath(
                          "/v1alpha/{name=projects/*/locations/*/dataStores/*/conversations/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetConversationRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setAdditionalPaths(
                          "/v1alpha/{name=projects/*/locations/*/collections/*/dataStores/*/conversations/*}")
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetConversationRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Conversation>newBuilder()
                      .setDefaultInstance(Conversation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<ListConversationsRequest, ListConversationsResponse>
      listConversationsMethodDescriptor =
          ApiMethodDescriptor.<ListConversationsRequest, ListConversationsResponse>newBuilder()
              .setFullMethodName(
                  "google.cloud.discoveryengine.v1alpha.ConversationalSearchService/ListConversations")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListConversationsRequest>newBuilder()
                      .setPath(
                          "/v1alpha/{parent=projects/*/locations/*/dataStores/*}/conversations",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListConversationsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setAdditionalPaths(
                          "/v1alpha/{parent=projects/*/locations/*/collections/*/dataStores/*}/conversations")
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListConversationsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "filter", request.getFilter());
                            serializer.putQueryParam(fields, "orderBy", request.getOrderBy());
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListConversationsResponse>newBuilder()
                      .setDefaultInstance(ListConversationsResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private final UnaryCallable<ConverseConversationRequest, ConverseConversationResponse>
      converseConversationCallable;
  private final UnaryCallable<CreateConversationRequest, Conversation> createConversationCallable;
  private final UnaryCallable<DeleteConversationRequest, Empty> deleteConversationCallable;
  private final UnaryCallable<UpdateConversationRequest, Conversation> updateConversationCallable;
  private final UnaryCallable<GetConversationRequest, Conversation> getConversationCallable;
  private final UnaryCallable<ListConversationsRequest, ListConversationsResponse>
      listConversationsCallable;
  private final UnaryCallable<ListConversationsRequest, ListConversationsPagedResponse>
      listConversationsPagedCallable;

  private final BackgroundResource backgroundResources;
  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonConversationalSearchServiceStub create(
      ConversationalSearchServiceStubSettings settings) throws IOException {
    return new HttpJsonConversationalSearchServiceStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonConversationalSearchServiceStub create(ClientContext clientContext)
      throws IOException {
    return new HttpJsonConversationalSearchServiceStub(
        ConversationalSearchServiceStubSettings.newHttpJsonBuilder().build(), clientContext);
  }

  public static final HttpJsonConversationalSearchServiceStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonConversationalSearchServiceStub(
        ConversationalSearchServiceStubSettings.newHttpJsonBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonConversationalSearchServiceStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected HttpJsonConversationalSearchServiceStub(
      ConversationalSearchServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new HttpJsonConversationalSearchServiceCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonConversationalSearchServiceStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected HttpJsonConversationalSearchServiceStub(
      ConversationalSearchServiceStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<ConverseConversationRequest, ConverseConversationResponse>
        converseConversationTransportSettings =
            HttpJsonCallSettings
                .<ConverseConversationRequest, ConverseConversationResponse>newBuilder()
                .setMethodDescriptor(converseConversationMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("name", String.valueOf(request.getName()));
                      return builder.build();
                    })
                .build();
    HttpJsonCallSettings<CreateConversationRequest, Conversation>
        createConversationTransportSettings =
            HttpJsonCallSettings.<CreateConversationRequest, Conversation>newBuilder()
                .setMethodDescriptor(createConversationMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("parent", String.valueOf(request.getParent()));
                      return builder.build();
                    })
                .build();
    HttpJsonCallSettings<DeleteConversationRequest, Empty> deleteConversationTransportSettings =
        HttpJsonCallSettings.<DeleteConversationRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteConversationMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<UpdateConversationRequest, Conversation>
        updateConversationTransportSettings =
            HttpJsonCallSettings.<UpdateConversationRequest, Conversation>newBuilder()
                .setMethodDescriptor(updateConversationMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add(
                          "conversation.name", String.valueOf(request.getConversation().getName()));
                      return builder.build();
                    })
                .build();
    HttpJsonCallSettings<GetConversationRequest, Conversation> getConversationTransportSettings =
        HttpJsonCallSettings.<GetConversationRequest, Conversation>newBuilder()
            .setMethodDescriptor(getConversationMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<ListConversationsRequest, ListConversationsResponse>
        listConversationsTransportSettings =
            HttpJsonCallSettings.<ListConversationsRequest, ListConversationsResponse>newBuilder()
                .setMethodDescriptor(listConversationsMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("parent", String.valueOf(request.getParent()));
                      return builder.build();
                    })
                .build();

    this.converseConversationCallable =
        callableFactory.createUnaryCallable(
            converseConversationTransportSettings,
            settings.converseConversationSettings(),
            clientContext);
    this.createConversationCallable =
        callableFactory.createUnaryCallable(
            createConversationTransportSettings,
            settings.createConversationSettings(),
            clientContext);
    this.deleteConversationCallable =
        callableFactory.createUnaryCallable(
            deleteConversationTransportSettings,
            settings.deleteConversationSettings(),
            clientContext);
    this.updateConversationCallable =
        callableFactory.createUnaryCallable(
            updateConversationTransportSettings,
            settings.updateConversationSettings(),
            clientContext);
    this.getConversationCallable =
        callableFactory.createUnaryCallable(
            getConversationTransportSettings, settings.getConversationSettings(), clientContext);
    this.listConversationsCallable =
        callableFactory.createUnaryCallable(
            listConversationsTransportSettings,
            settings.listConversationsSettings(),
            clientContext);
    this.listConversationsPagedCallable =
        callableFactory.createPagedCallable(
            listConversationsTransportSettings,
            settings.listConversationsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @InternalApi
  public static List<ApiMethodDescriptor> getMethodDescriptors() {
    List<ApiMethodDescriptor> methodDescriptors = new ArrayList<>();
    methodDescriptors.add(converseConversationMethodDescriptor);
    methodDescriptors.add(createConversationMethodDescriptor);
    methodDescriptors.add(deleteConversationMethodDescriptor);
    methodDescriptors.add(updateConversationMethodDescriptor);
    methodDescriptors.add(getConversationMethodDescriptor);
    methodDescriptors.add(listConversationsMethodDescriptor);
    return methodDescriptors;
  }

  @Override
  public UnaryCallable<ConverseConversationRequest, ConverseConversationResponse>
      converseConversationCallable() {
    return converseConversationCallable;
  }

  @Override
  public UnaryCallable<CreateConversationRequest, Conversation> createConversationCallable() {
    return createConversationCallable;
  }

  @Override
  public UnaryCallable<DeleteConversationRequest, Empty> deleteConversationCallable() {
    return deleteConversationCallable;
  }

  @Override
  public UnaryCallable<UpdateConversationRequest, Conversation> updateConversationCallable() {
    return updateConversationCallable;
  }

  @Override
  public UnaryCallable<GetConversationRequest, Conversation> getConversationCallable() {
    return getConversationCallable;
  }

  @Override
  public UnaryCallable<ListConversationsRequest, ListConversationsResponse>
      listConversationsCallable() {
    return listConversationsCallable;
  }

  @Override
  public UnaryCallable<ListConversationsRequest, ListConversationsPagedResponse>
      listConversationsPagedCallable() {
    return listConversationsPagedCallable;
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
