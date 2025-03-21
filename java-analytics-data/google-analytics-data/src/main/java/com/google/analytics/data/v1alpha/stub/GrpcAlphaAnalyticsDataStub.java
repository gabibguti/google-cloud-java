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
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.RequestParamsBuilder;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.GrpcOperationsStub;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * gRPC stub implementation for the AlphaAnalyticsData service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class GrpcAlphaAnalyticsDataStub extends AlphaAnalyticsDataStub {
  private static final MethodDescriptor<RunFunnelReportRequest, RunFunnelReportResponse>
      runFunnelReportMethodDescriptor =
          MethodDescriptor.<RunFunnelReportRequest, RunFunnelReportResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.analytics.data.v1alpha.AlphaAnalyticsData/RunFunnelReport")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(RunFunnelReportRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(RunFunnelReportResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<CreateAudienceListRequest, Operation>
      createAudienceListMethodDescriptor =
          MethodDescriptor.<CreateAudienceListRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.data.v1alpha.AlphaAnalyticsData/CreateAudienceList")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateAudienceListRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<QueryAudienceListRequest, QueryAudienceListResponse>
      queryAudienceListMethodDescriptor =
          MethodDescriptor.<QueryAudienceListRequest, QueryAudienceListResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.data.v1alpha.AlphaAnalyticsData/QueryAudienceList")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(QueryAudienceListRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(QueryAudienceListResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          SheetExportAudienceListRequest, SheetExportAudienceListResponse>
      sheetExportAudienceListMethodDescriptor =
          MethodDescriptor
              .<SheetExportAudienceListRequest, SheetExportAudienceListResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.data.v1alpha.AlphaAnalyticsData/SheetExportAudienceList")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(SheetExportAudienceListRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(SheetExportAudienceListResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetAudienceListRequest, AudienceList>
      getAudienceListMethodDescriptor =
          MethodDescriptor.<GetAudienceListRequest, AudienceList>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.analytics.data.v1alpha.AlphaAnalyticsData/GetAudienceList")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetAudienceListRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(AudienceList.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ListAudienceListsRequest, ListAudienceListsResponse>
      listAudienceListsMethodDescriptor =
          MethodDescriptor.<ListAudienceListsRequest, ListAudienceListsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.data.v1alpha.AlphaAnalyticsData/ListAudienceLists")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListAudienceListsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListAudienceListsResponse.getDefaultInstance()))
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
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcAlphaAnalyticsDataStub create(AlphaAnalyticsDataStubSettings settings)
      throws IOException {
    return new GrpcAlphaAnalyticsDataStub(settings, ClientContext.create(settings));
  }

  public static final GrpcAlphaAnalyticsDataStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcAlphaAnalyticsDataStub(
        AlphaAnalyticsDataStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcAlphaAnalyticsDataStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcAlphaAnalyticsDataStub(
        AlphaAnalyticsDataStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcAlphaAnalyticsDataStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcAlphaAnalyticsDataStub(
      AlphaAnalyticsDataStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcAlphaAnalyticsDataCallableFactory());
  }

  /**
   * Constructs an instance of GrpcAlphaAnalyticsDataStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcAlphaAnalyticsDataStub(
      AlphaAnalyticsDataStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<RunFunnelReportRequest, RunFunnelReportResponse>
        runFunnelReportTransportSettings =
            GrpcCallSettings.<RunFunnelReportRequest, RunFunnelReportResponse>newBuilder()
                .setMethodDescriptor(runFunnelReportMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("property", String.valueOf(request.getProperty()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<CreateAudienceListRequest, Operation> createAudienceListTransportSettings =
        GrpcCallSettings.<CreateAudienceListRequest, Operation>newBuilder()
            .setMethodDescriptor(createAudienceListMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("parent", String.valueOf(request.getParent()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<QueryAudienceListRequest, QueryAudienceListResponse>
        queryAudienceListTransportSettings =
            GrpcCallSettings.<QueryAudienceListRequest, QueryAudienceListResponse>newBuilder()
                .setMethodDescriptor(queryAudienceListMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("name", String.valueOf(request.getName()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<SheetExportAudienceListRequest, SheetExportAudienceListResponse>
        sheetExportAudienceListTransportSettings =
            GrpcCallSettings
                .<SheetExportAudienceListRequest, SheetExportAudienceListResponse>newBuilder()
                .setMethodDescriptor(sheetExportAudienceListMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("name", String.valueOf(request.getName()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<GetAudienceListRequest, AudienceList> getAudienceListTransportSettings =
        GrpcCallSettings.<GetAudienceListRequest, AudienceList>newBuilder()
            .setMethodDescriptor(getAudienceListMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<ListAudienceListsRequest, ListAudienceListsResponse>
        listAudienceListsTransportSettings =
            GrpcCallSettings.<ListAudienceListsRequest, ListAudienceListsResponse>newBuilder()
                .setMethodDescriptor(listAudienceListsMethodDescriptor)
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
            operationsStub);
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

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
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
