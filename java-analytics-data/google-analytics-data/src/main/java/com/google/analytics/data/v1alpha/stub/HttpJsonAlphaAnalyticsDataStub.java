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

package com.google.analytics.data.v1alpha.stub;

import static com.google.analytics.data.v1alpha.AlphaAnalyticsDataClient.ListAudienceListsPagedResponse;

import com.google.analytics.data.v1alpha.AudienceList;
import com.google.analytics.data.v1alpha.AudienceListMetadata;
import com.google.analytics.data.v1alpha.CreateAudienceListRequest;
import com.google.analytics.data.v1alpha.GetAudienceListRequest;
import com.google.analytics.data.v1alpha.ListAudienceListsRequest;
import com.google.analytics.data.v1alpha.ListAudienceListsResponse;
import com.google.analytics.data.v1alpha.QueryAudienceListRequest;
import com.google.analytics.data.v1alpha.QueryAudienceListResponse;
import com.google.analytics.data.v1alpha.RunFunnelReportRequest;
import com.google.analytics.data.v1alpha.RunFunnelReportResponse;
import com.google.analytics.data.v1alpha.SheetExportAudienceListRequest;
import com.google.analytics.data.v1alpha.SheetExportAudienceListResponse;
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
import com.google.longrunning.Operation;
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
 * REST stub implementation for the AlphaAnalyticsData service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class HttpJsonAlphaAnalyticsDataStub extends AlphaAnalyticsDataStub {
  private static final TypeRegistry typeRegistry =
      TypeRegistry.newBuilder()
          .add(AudienceList.getDescriptor())
          .add(AudienceListMetadata.getDescriptor())
          .build();

  private static final ApiMethodDescriptor<RunFunnelReportRequest, RunFunnelReportResponse>
      runFunnelReportMethodDescriptor =
          ApiMethodDescriptor.<RunFunnelReportRequest, RunFunnelReportResponse>newBuilder()
              .setFullMethodName("google.analytics.data.v1alpha.AlphaAnalyticsData/RunFunnelReport")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<RunFunnelReportRequest>newBuilder()
                      .setPath(
                          "/v1alpha/{property=properties/*}:runFunnelReport",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<RunFunnelReportRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "property", request.getProperty());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<RunFunnelReportRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("*", request.toBuilder().clearProperty().build(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<RunFunnelReportResponse>newBuilder()
                      .setDefaultInstance(RunFunnelReportResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<CreateAudienceListRequest, Operation>
      createAudienceListMethodDescriptor =
          ApiMethodDescriptor.<CreateAudienceListRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.analytics.data.v1alpha.AlphaAnalyticsData/CreateAudienceList")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<CreateAudienceListRequest>newBuilder()
                      .setPath(
                          "/v1alpha/{parent=properties/*}/audienceLists",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<CreateAudienceListRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<CreateAudienceListRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("audienceList", request.getAudienceList(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (CreateAudienceListRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private static final ApiMethodDescriptor<QueryAudienceListRequest, QueryAudienceListResponse>
      queryAudienceListMethodDescriptor =
          ApiMethodDescriptor.<QueryAudienceListRequest, QueryAudienceListResponse>newBuilder()
              .setFullMethodName(
                  "google.analytics.data.v1alpha.AlphaAnalyticsData/QueryAudienceList")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<QueryAudienceListRequest>newBuilder()
                      .setPath(
                          "/v1alpha/{name=properties/*/audienceLists/*}:query",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<QueryAudienceListRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<QueryAudienceListRequest> serializer =
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
                  ProtoMessageResponseParser.<QueryAudienceListResponse>newBuilder()
                      .setDefaultInstance(QueryAudienceListResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<
          SheetExportAudienceListRequest, SheetExportAudienceListResponse>
      sheetExportAudienceListMethodDescriptor =
          ApiMethodDescriptor
              .<SheetExportAudienceListRequest, SheetExportAudienceListResponse>newBuilder()
              .setFullMethodName(
                  "google.analytics.data.v1alpha.AlphaAnalyticsData/SheetExportAudienceList")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<SheetExportAudienceListRequest>newBuilder()
                      .setPath(
                          "/v1alpha/{name=properties/*/audienceLists/*}:exportSheet",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<SheetExportAudienceListRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<SheetExportAudienceListRequest> serializer =
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
                  ProtoMessageResponseParser.<SheetExportAudienceListResponse>newBuilder()
                      .setDefaultInstance(SheetExportAudienceListResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetAudienceListRequest, AudienceList>
      getAudienceListMethodDescriptor =
          ApiMethodDescriptor.<GetAudienceListRequest, AudienceList>newBuilder()
              .setFullMethodName("google.analytics.data.v1alpha.AlphaAnalyticsData/GetAudienceList")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetAudienceListRequest>newBuilder()
                      .setPath(
                          "/v1alpha/{name=properties/*/audienceLists/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetAudienceListRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetAudienceListRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<AudienceList>newBuilder()
                      .setDefaultInstance(AudienceList.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<ListAudienceListsRequest, ListAudienceListsResponse>
      listAudienceListsMethodDescriptor =
          ApiMethodDescriptor.<ListAudienceListsRequest, ListAudienceListsResponse>newBuilder()
              .setFullMethodName(
                  "google.analytics.data.v1alpha.AlphaAnalyticsData/ListAudienceLists")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListAudienceListsRequest>newBuilder()
                      .setPath(
                          "/v1alpha/{parent=properties/*}/audienceLists",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListAudienceListsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListAudienceListsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListAudienceListsResponse>newBuilder()
                      .setDefaultInstance(ListAudienceListsResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private final UnaryCallable<RunFunnelReportRequest, RunFunnelReportResponse>
      runFunnelReportCallable;
  private final UnaryCallable<CreateAudienceListRequest, Operation> createAudienceListCallable;
  private final OperationCallable<CreateAudienceListRequest, AudienceList, AudienceListMetadata>
      createAudienceListOperationCallable;
  private final UnaryCallable<QueryAudienceListRequest, QueryAudienceListResponse>
      queryAudienceListCallable;
  private final UnaryCallable<SheetExportAudienceListRequest, SheetExportAudienceListResponse>
      sheetExportAudienceListCallable;
  private final UnaryCallable<GetAudienceListRequest, AudienceList> getAudienceListCallable;
  private final UnaryCallable<ListAudienceListsRequest, ListAudienceListsResponse>
      listAudienceListsCallable;
  private final UnaryCallable<ListAudienceListsRequest, ListAudienceListsPagedResponse>
      listAudienceListsPagedCallable;

  private final BackgroundResource backgroundResources;
  private final HttpJsonOperationsStub httpJsonOperationsStub;
  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonAlphaAnalyticsDataStub create(AlphaAnalyticsDataStubSettings settings)
      throws IOException {
    return new HttpJsonAlphaAnalyticsDataStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonAlphaAnalyticsDataStub create(ClientContext clientContext)
      throws IOException {
    return new HttpJsonAlphaAnalyticsDataStub(
        AlphaAnalyticsDataStubSettings.newHttpJsonBuilder().build(), clientContext);
  }

  public static final HttpJsonAlphaAnalyticsDataStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonAlphaAnalyticsDataStub(
        AlphaAnalyticsDataStubSettings.newHttpJsonBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonAlphaAnalyticsDataStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonAlphaAnalyticsDataStub(
      AlphaAnalyticsDataStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new HttpJsonAlphaAnalyticsDataCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonAlphaAnalyticsDataStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonAlphaAnalyticsDataStub(
      AlphaAnalyticsDataStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.httpJsonOperationsStub =
        HttpJsonOperationsStub.create(clientContext, callableFactory, typeRegistry);

    HttpJsonCallSettings<RunFunnelReportRequest, RunFunnelReportResponse>
        runFunnelReportTransportSettings =
            HttpJsonCallSettings.<RunFunnelReportRequest, RunFunnelReportResponse>newBuilder()
                .setMethodDescriptor(runFunnelReportMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("property", String.valueOf(request.getProperty()));
                      return builder.build();
                    })
                .build();
    HttpJsonCallSettings<CreateAudienceListRequest, Operation> createAudienceListTransportSettings =
        HttpJsonCallSettings.<CreateAudienceListRequest, Operation>newBuilder()
            .setMethodDescriptor(createAudienceListMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("parent", String.valueOf(request.getParent()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<QueryAudienceListRequest, QueryAudienceListResponse>
        queryAudienceListTransportSettings =
            HttpJsonCallSettings.<QueryAudienceListRequest, QueryAudienceListResponse>newBuilder()
                .setMethodDescriptor(queryAudienceListMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("name", String.valueOf(request.getName()));
                      return builder.build();
                    })
                .build();
    HttpJsonCallSettings<SheetExportAudienceListRequest, SheetExportAudienceListResponse>
        sheetExportAudienceListTransportSettings =
            HttpJsonCallSettings
                .<SheetExportAudienceListRequest, SheetExportAudienceListResponse>newBuilder()
                .setMethodDescriptor(sheetExportAudienceListMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("name", String.valueOf(request.getName()));
                      return builder.build();
                    })
                .build();
    HttpJsonCallSettings<GetAudienceListRequest, AudienceList> getAudienceListTransportSettings =
        HttpJsonCallSettings.<GetAudienceListRequest, AudienceList>newBuilder()
            .setMethodDescriptor(getAudienceListMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<ListAudienceListsRequest, ListAudienceListsResponse>
        listAudienceListsTransportSettings =
            HttpJsonCallSettings.<ListAudienceListsRequest, ListAudienceListsResponse>newBuilder()
                .setMethodDescriptor(listAudienceListsMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("parent", String.valueOf(request.getParent()));
                      return builder.build();
                    })
                .build();

    this.runFunnelReportCallable =
        callableFactory.createUnaryCallable(
            runFunnelReportTransportSettings, settings.runFunnelReportSettings(), clientContext);
    this.createAudienceListCallable =
        callableFactory.createUnaryCallable(
            createAudienceListTransportSettings,
            settings.createAudienceListSettings(),
            clientContext);
    this.createAudienceListOperationCallable =
        callableFactory.createOperationCallable(
            createAudienceListTransportSettings,
            settings.createAudienceListOperationSettings(),
            clientContext,
            httpJsonOperationsStub);
    this.queryAudienceListCallable =
        callableFactory.createUnaryCallable(
            queryAudienceListTransportSettings,
            settings.queryAudienceListSettings(),
            clientContext);
    this.sheetExportAudienceListCallable =
        callableFactory.createUnaryCallable(
            sheetExportAudienceListTransportSettings,
            settings.sheetExportAudienceListSettings(),
            clientContext);
    this.getAudienceListCallable =
        callableFactory.createUnaryCallable(
            getAudienceListTransportSettings, settings.getAudienceListSettings(), clientContext);
    this.listAudienceListsCallable =
        callableFactory.createUnaryCallable(
            listAudienceListsTransportSettings,
            settings.listAudienceListsSettings(),
            clientContext);
    this.listAudienceListsPagedCallable =
        callableFactory.createPagedCallable(
            listAudienceListsTransportSettings,
            settings.listAudienceListsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @InternalApi
  public static List<ApiMethodDescriptor> getMethodDescriptors() {
    List<ApiMethodDescriptor> methodDescriptors = new ArrayList<>();
    methodDescriptors.add(runFunnelReportMethodDescriptor);
    methodDescriptors.add(createAudienceListMethodDescriptor);
    methodDescriptors.add(queryAudienceListMethodDescriptor);
    methodDescriptors.add(sheetExportAudienceListMethodDescriptor);
    methodDescriptors.add(getAudienceListMethodDescriptor);
    methodDescriptors.add(listAudienceListsMethodDescriptor);
    return methodDescriptors;
  }

  public HttpJsonOperationsStub getHttpJsonOperationsStub() {
    return httpJsonOperationsStub;
  }

  @Override
  public UnaryCallable<RunFunnelReportRequest, RunFunnelReportResponse> runFunnelReportCallable() {
    return runFunnelReportCallable;
  }

  @Override
  public UnaryCallable<CreateAudienceListRequest, Operation> createAudienceListCallable() {
    return createAudienceListCallable;
  }

  @Override
  public OperationCallable<CreateAudienceListRequest, AudienceList, AudienceListMetadata>
      createAudienceListOperationCallable() {
    return createAudienceListOperationCallable;
  }

  @Override
  public UnaryCallable<QueryAudienceListRequest, QueryAudienceListResponse>
      queryAudienceListCallable() {
    return queryAudienceListCallable;
  }

  @Override
  public UnaryCallable<SheetExportAudienceListRequest, SheetExportAudienceListResponse>
      sheetExportAudienceListCallable() {
    return sheetExportAudienceListCallable;
  }

  @Override
  public UnaryCallable<GetAudienceListRequest, AudienceList> getAudienceListCallable() {
    return getAudienceListCallable;
  }

  @Override
  public UnaryCallable<ListAudienceListsRequest, ListAudienceListsResponse>
      listAudienceListsCallable() {
    return listAudienceListsCallable;
  }

  @Override
  public UnaryCallable<ListAudienceListsRequest, ListAudienceListsPagedResponse>
      listAudienceListsPagedCallable() {
    return listAudienceListsPagedCallable;
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
