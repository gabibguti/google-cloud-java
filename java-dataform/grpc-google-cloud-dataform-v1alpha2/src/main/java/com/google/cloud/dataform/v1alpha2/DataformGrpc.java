/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.dataform.v1alpha2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 *
 *
 * <pre>
 * Dataform is a service to develop, create, document, test, and update curated
 * tables in BigQuery.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/dataform/v1alpha2/dataform.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DataformGrpc {

  private DataformGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.cloud.dataform.v1alpha2.Dataform";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.ListRepositoriesRequest,
          com.google.cloud.dataform.v1alpha2.ListRepositoriesResponse>
      getListRepositoriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRepositories",
      requestType = com.google.cloud.dataform.v1alpha2.ListRepositoriesRequest.class,
      responseType = com.google.cloud.dataform.v1alpha2.ListRepositoriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.ListRepositoriesRequest,
          com.google.cloud.dataform.v1alpha2.ListRepositoriesResponse>
      getListRepositoriesMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dataform.v1alpha2.ListRepositoriesRequest,
            com.google.cloud.dataform.v1alpha2.ListRepositoriesResponse>
        getListRepositoriesMethod;
    if ((getListRepositoriesMethod = DataformGrpc.getListRepositoriesMethod) == null) {
      synchronized (DataformGrpc.class) {
        if ((getListRepositoriesMethod = DataformGrpc.getListRepositoriesMethod) == null) {
          DataformGrpc.getListRepositoriesMethod =
              getListRepositoriesMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dataform.v1alpha2.ListRepositoriesRequest,
                          com.google.cloud.dataform.v1alpha2.ListRepositoriesResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRepositories"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.ListRepositoriesRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.ListRepositoriesResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(new DataformMethodDescriptorSupplier("ListRepositories"))
                      .build();
        }
      }
    }
    return getListRepositoriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.GetRepositoryRequest,
          com.google.cloud.dataform.v1alpha2.Repository>
      getGetRepositoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRepository",
      requestType = com.google.cloud.dataform.v1alpha2.GetRepositoryRequest.class,
      responseType = com.google.cloud.dataform.v1alpha2.Repository.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.GetRepositoryRequest,
          com.google.cloud.dataform.v1alpha2.Repository>
      getGetRepositoryMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dataform.v1alpha2.GetRepositoryRequest,
            com.google.cloud.dataform.v1alpha2.Repository>
        getGetRepositoryMethod;
    if ((getGetRepositoryMethod = DataformGrpc.getGetRepositoryMethod) == null) {
      synchronized (DataformGrpc.class) {
        if ((getGetRepositoryMethod = DataformGrpc.getGetRepositoryMethod) == null) {
          DataformGrpc.getGetRepositoryMethod =
              getGetRepositoryMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dataform.v1alpha2.GetRepositoryRequest,
                          com.google.cloud.dataform.v1alpha2.Repository>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRepository"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.GetRepositoryRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.Repository.getDefaultInstance()))
                      .setSchemaDescriptor(new DataformMethodDescriptorSupplier("GetRepository"))
                      .build();
        }
      }
    }
    return getGetRepositoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.CreateRepositoryRequest,
          com.google.cloud.dataform.v1alpha2.Repository>
      getCreateRepositoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRepository",
      requestType = com.google.cloud.dataform.v1alpha2.CreateRepositoryRequest.class,
      responseType = com.google.cloud.dataform.v1alpha2.Repository.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.CreateRepositoryRequest,
          com.google.cloud.dataform.v1alpha2.Repository>
      getCreateRepositoryMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dataform.v1alpha2.CreateRepositoryRequest,
            com.google.cloud.dataform.v1alpha2.Repository>
        getCreateRepositoryMethod;
    if ((getCreateRepositoryMethod = DataformGrpc.getCreateRepositoryMethod) == null) {
      synchronized (DataformGrpc.class) {
        if ((getCreateRepositoryMethod = DataformGrpc.getCreateRepositoryMethod) == null) {
          DataformGrpc.getCreateRepositoryMethod =
              getCreateRepositoryMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dataform.v1alpha2.CreateRepositoryRequest,
                          com.google.cloud.dataform.v1alpha2.Repository>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRepository"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.CreateRepositoryRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.Repository.getDefaultInstance()))
                      .setSchemaDescriptor(new DataformMethodDescriptorSupplier("CreateRepository"))
                      .build();
        }
      }
    }
    return getCreateRepositoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.UpdateRepositoryRequest,
          com.google.cloud.dataform.v1alpha2.Repository>
      getUpdateRepositoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRepository",
      requestType = com.google.cloud.dataform.v1alpha2.UpdateRepositoryRequest.class,
      responseType = com.google.cloud.dataform.v1alpha2.Repository.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.UpdateRepositoryRequest,
          com.google.cloud.dataform.v1alpha2.Repository>
      getUpdateRepositoryMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dataform.v1alpha2.UpdateRepositoryRequest,
            com.google.cloud.dataform.v1alpha2.Repository>
        getUpdateRepositoryMethod;
    if ((getUpdateRepositoryMethod = DataformGrpc.getUpdateRepositoryMethod) == null) {
      synchronized (DataformGrpc.class) {
        if ((getUpdateRepositoryMethod = DataformGrpc.getUpdateRepositoryMethod) == null) {
          DataformGrpc.getUpdateRepositoryMethod =
              getUpdateRepositoryMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dataform.v1alpha2.UpdateRepositoryRequest,
                          com.google.cloud.dataform.v1alpha2.Repository>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRepository"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.UpdateRepositoryRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.Repository.getDefaultInstance()))
                      .setSchemaDescriptor(new DataformMethodDescriptorSupplier("UpdateRepository"))
                      .build();
        }
      }
    }
    return getUpdateRepositoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.DeleteRepositoryRequest, com.google.protobuf.Empty>
      getDeleteRepositoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRepository",
      requestType = com.google.cloud.dataform.v1alpha2.DeleteRepositoryRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.DeleteRepositoryRequest, com.google.protobuf.Empty>
      getDeleteRepositoryMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dataform.v1alpha2.DeleteRepositoryRequest, com.google.protobuf.Empty>
        getDeleteRepositoryMethod;
    if ((getDeleteRepositoryMethod = DataformGrpc.getDeleteRepositoryMethod) == null) {
      synchronized (DataformGrpc.class) {
        if ((getDeleteRepositoryMethod = DataformGrpc.getDeleteRepositoryMethod) == null) {
          DataformGrpc.getDeleteRepositoryMethod =
              getDeleteRepositoryMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dataform.v1alpha2.DeleteRepositoryRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRepository"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.DeleteRepositoryRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(new DataformMethodDescriptorSupplier("DeleteRepository"))
                      .build();
        }
      }
    }
    return getDeleteRepositoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.FetchRemoteBranchesRequest,
          com.google.cloud.dataform.v1alpha2.FetchRemoteBranchesResponse>
      getFetchRemoteBranchesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FetchRemoteBranches",
      requestType = com.google.cloud.dataform.v1alpha2.FetchRemoteBranchesRequest.class,
      responseType = com.google.cloud.dataform.v1alpha2.FetchRemoteBranchesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.FetchRemoteBranchesRequest,
          com.google.cloud.dataform.v1alpha2.FetchRemoteBranchesResponse>
      getFetchRemoteBranchesMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dataform.v1alpha2.FetchRemoteBranchesRequest,
            com.google.cloud.dataform.v1alpha2.FetchRemoteBranchesResponse>
        getFetchRemoteBranchesMethod;
    if ((getFetchRemoteBranchesMethod = DataformGrpc.getFetchRemoteBranchesMethod) == null) {
      synchronized (DataformGrpc.class) {
        if ((getFetchRemoteBranchesMethod = DataformGrpc.getFetchRemoteBranchesMethod) == null) {
          DataformGrpc.getFetchRemoteBranchesMethod =
              getFetchRemoteBranchesMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dataform.v1alpha2.FetchRemoteBranchesRequest,
                          com.google.cloud.dataform.v1alpha2.FetchRemoteBranchesResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "FetchRemoteBranches"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.FetchRemoteBranchesRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.FetchRemoteBranchesResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataformMethodDescriptorSupplier("FetchRemoteBranches"))
                      .build();
        }
      }
    }
    return getFetchRemoteBranchesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.ListWorkspacesRequest,
          com.google.cloud.dataform.v1alpha2.ListWorkspacesResponse>
      getListWorkspacesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListWorkspaces",
      requestType = com.google.cloud.dataform.v1alpha2.ListWorkspacesRequest.class,
      responseType = com.google.cloud.dataform.v1alpha2.ListWorkspacesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.ListWorkspacesRequest,
          com.google.cloud.dataform.v1alpha2.ListWorkspacesResponse>
      getListWorkspacesMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dataform.v1alpha2.ListWorkspacesRequest,
            com.google.cloud.dataform.v1alpha2.ListWorkspacesResponse>
        getListWorkspacesMethod;
    if ((getListWorkspacesMethod = DataformGrpc.getListWorkspacesMethod) == null) {
      synchronized (DataformGrpc.class) {
        if ((getListWorkspacesMethod = DataformGrpc.getListWorkspacesMethod) == null) {
          DataformGrpc.getListWorkspacesMethod =
              getListWorkspacesMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dataform.v1alpha2.ListWorkspacesRequest,
                          com.google.cloud.dataform.v1alpha2.ListWorkspacesResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListWorkspaces"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.ListWorkspacesRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.ListWorkspacesResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(new DataformMethodDescriptorSupplier("ListWorkspaces"))
                      .build();
        }
      }
    }
    return getListWorkspacesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.GetWorkspaceRequest,
          com.google.cloud.dataform.v1alpha2.Workspace>
      getGetWorkspaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWorkspace",
      requestType = com.google.cloud.dataform.v1alpha2.GetWorkspaceRequest.class,
      responseType = com.google.cloud.dataform.v1alpha2.Workspace.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.GetWorkspaceRequest,
          com.google.cloud.dataform.v1alpha2.Workspace>
      getGetWorkspaceMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dataform.v1alpha2.GetWorkspaceRequest,
            com.google.cloud.dataform.v1alpha2.Workspace>
        getGetWorkspaceMethod;
    if ((getGetWorkspaceMethod = DataformGrpc.getGetWorkspaceMethod) == null) {
      synchronized (DataformGrpc.class) {
        if ((getGetWorkspaceMethod = DataformGrpc.getGetWorkspaceMethod) == null) {
          DataformGrpc.getGetWorkspaceMethod =
              getGetWorkspaceMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dataform.v1alpha2.GetWorkspaceRequest,
                          com.google.cloud.dataform.v1alpha2.Workspace>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWorkspace"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.GetWorkspaceRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.Workspace.getDefaultInstance()))
                      .setSchemaDescriptor(new DataformMethodDescriptorSupplier("GetWorkspace"))
                      .build();
        }
      }
    }
    return getGetWorkspaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.CreateWorkspaceRequest,
          com.google.cloud.dataform.v1alpha2.Workspace>
      getCreateWorkspaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWorkspace",
      requestType = com.google.cloud.dataform.v1alpha2.CreateWorkspaceRequest.class,
      responseType = com.google.cloud.dataform.v1alpha2.Workspace.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.CreateWorkspaceRequest,
          com.google.cloud.dataform.v1alpha2.Workspace>
      getCreateWorkspaceMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dataform.v1alpha2.CreateWorkspaceRequest,
            com.google.cloud.dataform.v1alpha2.Workspace>
        getCreateWorkspaceMethod;
    if ((getCreateWorkspaceMethod = DataformGrpc.getCreateWorkspaceMethod) == null) {
      synchronized (DataformGrpc.class) {
        if ((getCreateWorkspaceMethod = DataformGrpc.getCreateWorkspaceMethod) == null) {
          DataformGrpc.getCreateWorkspaceMethod =
              getCreateWorkspaceMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dataform.v1alpha2.CreateWorkspaceRequest,
                          com.google.cloud.dataform.v1alpha2.Workspace>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateWorkspace"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.CreateWorkspaceRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.Workspace.getDefaultInstance()))
                      .setSchemaDescriptor(new DataformMethodDescriptorSupplier("CreateWorkspace"))
                      .build();
        }
      }
    }
    return getCreateWorkspaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.DeleteWorkspaceRequest, com.google.protobuf.Empty>
      getDeleteWorkspaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteWorkspace",
      requestType = com.google.cloud.dataform.v1alpha2.DeleteWorkspaceRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.DeleteWorkspaceRequest, com.google.protobuf.Empty>
      getDeleteWorkspaceMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dataform.v1alpha2.DeleteWorkspaceRequest, com.google.protobuf.Empty>
        getDeleteWorkspaceMethod;
    if ((getDeleteWorkspaceMethod = DataformGrpc.getDeleteWorkspaceMethod) == null) {
      synchronized (DataformGrpc.class) {
        if ((getDeleteWorkspaceMethod = DataformGrpc.getDeleteWorkspaceMethod) == null) {
          DataformGrpc.getDeleteWorkspaceMethod =
              getDeleteWorkspaceMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dataform.v1alpha2.DeleteWorkspaceRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteWorkspace"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.DeleteWorkspaceRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(new DataformMethodDescriptorSupplier("DeleteWorkspace"))
                      .build();
        }
      }
    }
    return getDeleteWorkspaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.InstallNpmPackagesRequest,
          com.google.cloud.dataform.v1alpha2.InstallNpmPackagesResponse>
      getInstallNpmPackagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InstallNpmPackages",
      requestType = com.google.cloud.dataform.v1alpha2.InstallNpmPackagesRequest.class,
      responseType = com.google.cloud.dataform.v1alpha2.InstallNpmPackagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.InstallNpmPackagesRequest,
          com.google.cloud.dataform.v1alpha2.InstallNpmPackagesResponse>
      getInstallNpmPackagesMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dataform.v1alpha2.InstallNpmPackagesRequest,
            com.google.cloud.dataform.v1alpha2.InstallNpmPackagesResponse>
        getInstallNpmPackagesMethod;
    if ((getInstallNpmPackagesMethod = DataformGrpc.getInstallNpmPackagesMethod) == null) {
      synchronized (DataformGrpc.class) {
        if ((getInstallNpmPackagesMethod = DataformGrpc.getInstallNpmPackagesMethod) == null) {
          DataformGrpc.getInstallNpmPackagesMethod =
              getInstallNpmPackagesMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dataform.v1alpha2.InstallNpmPackagesRequest,
                          com.google.cloud.dataform.v1alpha2.InstallNpmPackagesResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InstallNpmPackages"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.InstallNpmPackagesRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.InstallNpmPackagesResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataformMethodDescriptorSupplier("InstallNpmPackages"))
                      .build();
        }
      }
    }
    return getInstallNpmPackagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest, com.google.protobuf.Empty>
      getPullGitCommitsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PullGitCommits",
      requestType = com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest, com.google.protobuf.Empty>
      getPullGitCommitsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest, com.google.protobuf.Empty>
        getPullGitCommitsMethod;
    if ((getPullGitCommitsMethod = DataformGrpc.getPullGitCommitsMethod) == null) {
      synchronized (DataformGrpc.class) {
        if ((getPullGitCommitsMethod = DataformGrpc.getPullGitCommitsMethod) == null) {
          DataformGrpc.getPullGitCommitsMethod =
              getPullGitCommitsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PullGitCommits"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(new DataformMethodDescriptorSupplier("PullGitCommits"))
                      .build();
        }
      }
    }
    return getPullGitCommitsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.PushGitCommitsRequest, com.google.protobuf.Empty>
      getPushGitCommitsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PushGitCommits",
      requestType = com.google.cloud.dataform.v1alpha2.PushGitCommitsRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.PushGitCommitsRequest, com.google.protobuf.Empty>
      getPushGitCommitsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dataform.v1alpha2.PushGitCommitsRequest, com.google.protobuf.Empty>
        getPushGitCommitsMethod;
    if ((getPushGitCommitsMethod = DataformGrpc.getPushGitCommitsMethod) == null) {
      synchronized (DataformGrpc.class) {
        if ((getPushGitCommitsMethod = DataformGrpc.getPushGitCommitsMethod) == null) {
          DataformGrpc.getPushGitCommitsMethod =
              getPushGitCommitsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dataform.v1alpha2.PushGitCommitsRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PushGitCommits"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.PushGitCommitsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(new DataformMethodDescriptorSupplier("PushGitCommits"))
                      .build();
        }
      }
    }
    return getPushGitCommitsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.FetchFileGitStatusesRequest,
          com.google.cloud.dataform.v1alpha2.FetchFileGitStatusesResponse>
      getFetchFileGitStatusesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FetchFileGitStatuses",
      requestType = com.google.cloud.dataform.v1alpha2.FetchFileGitStatusesRequest.class,
      responseType = com.google.cloud.dataform.v1alpha2.FetchFileGitStatusesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.FetchFileGitStatusesRequest,
          com.google.cloud.dataform.v1alpha2.FetchFileGitStatusesResponse>
      getFetchFileGitStatusesMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dataform.v1alpha2.FetchFileGitStatusesRequest,
            com.google.cloud.dataform.v1alpha2.FetchFileGitStatusesResponse>
        getFetchFileGitStatusesMethod;
    if ((getFetchFileGitStatusesMethod = DataformGrpc.getFetchFileGitStatusesMethod) == null) {
      synchronized (DataformGrpc.class) {
        if ((getFetchFileGitStatusesMethod = DataformGrpc.getFetchFileGitStatusesMethod) == null) {
          DataformGrpc.getFetchFileGitStatusesMethod =
              getFetchFileGitStatusesMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dataform.v1alpha2.FetchFileGitStatusesRequest,
                          com.google.cloud.dataform.v1alpha2.FetchFileGitStatusesResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "FetchFileGitStatuses"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.FetchFileGitStatusesRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.FetchFileGitStatusesResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataformMethodDescriptorSupplier("FetchFileGitStatuses"))
                      .build();
        }
      }
    }
    return getFetchFileGitStatusesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.FetchGitAheadBehindRequest,
          com.google.cloud.dataform.v1alpha2.FetchGitAheadBehindResponse>
      getFetchGitAheadBehindMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FetchGitAheadBehind",
      requestType = com.google.cloud.dataform.v1alpha2.FetchGitAheadBehindRequest.class,
      responseType = com.google.cloud.dataform.v1alpha2.FetchGitAheadBehindResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.FetchGitAheadBehindRequest,
          com.google.cloud.dataform.v1alpha2.FetchGitAheadBehindResponse>
      getFetchGitAheadBehindMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dataform.v1alpha2.FetchGitAheadBehindRequest,
            com.google.cloud.dataform.v1alpha2.FetchGitAheadBehindResponse>
        getFetchGitAheadBehindMethod;
    if ((getFetchGitAheadBehindMethod = DataformGrpc.getFetchGitAheadBehindMethod) == null) {
      synchronized (DataformGrpc.class) {
        if ((getFetchGitAheadBehindMethod = DataformGrpc.getFetchGitAheadBehindMethod) == null) {
          DataformGrpc.getFetchGitAheadBehindMethod =
              getFetchGitAheadBehindMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dataform.v1alpha2.FetchGitAheadBehindRequest,
                          com.google.cloud.dataform.v1alpha2.FetchGitAheadBehindResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "FetchGitAheadBehind"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.FetchGitAheadBehindRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.FetchGitAheadBehindResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataformMethodDescriptorSupplier("FetchGitAheadBehind"))
                      .build();
        }
      }
    }
    return getFetchGitAheadBehindMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.CommitWorkspaceChangesRequest,
          com.google.protobuf.Empty>
      getCommitWorkspaceChangesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CommitWorkspaceChanges",
      requestType = com.google.cloud.dataform.v1alpha2.CommitWorkspaceChangesRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.CommitWorkspaceChangesRequest,
          com.google.protobuf.Empty>
      getCommitWorkspaceChangesMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dataform.v1alpha2.CommitWorkspaceChangesRequest,
            com.google.protobuf.Empty>
        getCommitWorkspaceChangesMethod;
    if ((getCommitWorkspaceChangesMethod = DataformGrpc.getCommitWorkspaceChangesMethod) == null) {
      synchronized (DataformGrpc.class) {
        if ((getCommitWorkspaceChangesMethod = DataformGrpc.getCommitWorkspaceChangesMethod)
            == null) {
          DataformGrpc.getCommitWorkspaceChangesMethod =
              getCommitWorkspaceChangesMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dataform.v1alpha2.CommitWorkspaceChangesRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "CommitWorkspaceChanges"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.CommitWorkspaceChangesRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataformMethodDescriptorSupplier("CommitWorkspaceChanges"))
                      .build();
        }
      }
    }
    return getCommitWorkspaceChangesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest,
          com.google.protobuf.Empty>
      getResetWorkspaceChangesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResetWorkspaceChanges",
      requestType = com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest,
          com.google.protobuf.Empty>
      getResetWorkspaceChangesMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest,
            com.google.protobuf.Empty>
        getResetWorkspaceChangesMethod;
    if ((getResetWorkspaceChangesMethod = DataformGrpc.getResetWorkspaceChangesMethod) == null) {
      synchronized (DataformGrpc.class) {
        if ((getResetWorkspaceChangesMethod = DataformGrpc.getResetWorkspaceChangesMethod)
            == null) {
          DataformGrpc.getResetWorkspaceChangesMethod =
              getResetWorkspaceChangesMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "ResetWorkspaceChanges"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataformMethodDescriptorSupplier("ResetWorkspaceChanges"))
                      .build();
        }
      }
    }
    return getResetWorkspaceChangesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.FetchFileDiffRequest,
          com.google.cloud.dataform.v1alpha2.FetchFileDiffResponse>
      getFetchFileDiffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FetchFileDiff",
      requestType = com.google.cloud.dataform.v1alpha2.FetchFileDiffRequest.class,
      responseType = com.google.cloud.dataform.v1alpha2.FetchFileDiffResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.FetchFileDiffRequest,
          com.google.cloud.dataform.v1alpha2.FetchFileDiffResponse>
      getFetchFileDiffMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dataform.v1alpha2.FetchFileDiffRequest,
            com.google.cloud.dataform.v1alpha2.FetchFileDiffResponse>
        getFetchFileDiffMethod;
    if ((getFetchFileDiffMethod = DataformGrpc.getFetchFileDiffMethod) == null) {
      synchronized (DataformGrpc.class) {
        if ((getFetchFileDiffMethod = DataformGrpc.getFetchFileDiffMethod) == null) {
          DataformGrpc.getFetchFileDiffMethod =
              getFetchFileDiffMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dataform.v1alpha2.FetchFileDiffRequest,
                          com.google.cloud.dataform.v1alpha2.FetchFileDiffResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FetchFileDiff"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.FetchFileDiffRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.FetchFileDiffResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(new DataformMethodDescriptorSupplier("FetchFileDiff"))
                      .build();
        }
      }
    }
    return getFetchFileDiffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.QueryDirectoryContentsRequest,
          com.google.cloud.dataform.v1alpha2.QueryDirectoryContentsResponse>
      getQueryDirectoryContentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryDirectoryContents",
      requestType = com.google.cloud.dataform.v1alpha2.QueryDirectoryContentsRequest.class,
      responseType = com.google.cloud.dataform.v1alpha2.QueryDirectoryContentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.QueryDirectoryContentsRequest,
          com.google.cloud.dataform.v1alpha2.QueryDirectoryContentsResponse>
      getQueryDirectoryContentsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dataform.v1alpha2.QueryDirectoryContentsRequest,
            com.google.cloud.dataform.v1alpha2.QueryDirectoryContentsResponse>
        getQueryDirectoryContentsMethod;
    if ((getQueryDirectoryContentsMethod = DataformGrpc.getQueryDirectoryContentsMethod) == null) {
      synchronized (DataformGrpc.class) {
        if ((getQueryDirectoryContentsMethod = DataformGrpc.getQueryDirectoryContentsMethod)
            == null) {
          DataformGrpc.getQueryDirectoryContentsMethod =
              getQueryDirectoryContentsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dataform.v1alpha2.QueryDirectoryContentsRequest,
                          com.google.cloud.dataform.v1alpha2.QueryDirectoryContentsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "QueryDirectoryContents"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.QueryDirectoryContentsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.QueryDirectoryContentsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataformMethodDescriptorSupplier("QueryDirectoryContents"))
                      .build();
        }
      }
    }
    return getQueryDirectoryContentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.MakeDirectoryRequest,
          com.google.cloud.dataform.v1alpha2.MakeDirectoryResponse>
      getMakeDirectoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MakeDirectory",
      requestType = com.google.cloud.dataform.v1alpha2.MakeDirectoryRequest.class,
      responseType = com.google.cloud.dataform.v1alpha2.MakeDirectoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.MakeDirectoryRequest,
          com.google.cloud.dataform.v1alpha2.MakeDirectoryResponse>
      getMakeDirectoryMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dataform.v1alpha2.MakeDirectoryRequest,
            com.google.cloud.dataform.v1alpha2.MakeDirectoryResponse>
        getMakeDirectoryMethod;
    if ((getMakeDirectoryMethod = DataformGrpc.getMakeDirectoryMethod) == null) {
      synchronized (DataformGrpc.class) {
        if ((getMakeDirectoryMethod = DataformGrpc.getMakeDirectoryMethod) == null) {
          DataformGrpc.getMakeDirectoryMethod =
              getMakeDirectoryMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dataform.v1alpha2.MakeDirectoryRequest,
                          com.google.cloud.dataform.v1alpha2.MakeDirectoryResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MakeDirectory"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.MakeDirectoryRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.MakeDirectoryResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(new DataformMethodDescriptorSupplier("MakeDirectory"))
                      .build();
        }
      }
    }
    return getMakeDirectoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest, com.google.protobuf.Empty>
      getRemoveDirectoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveDirectory",
      requestType = com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest, com.google.protobuf.Empty>
      getRemoveDirectoryMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest, com.google.protobuf.Empty>
        getRemoveDirectoryMethod;
    if ((getRemoveDirectoryMethod = DataformGrpc.getRemoveDirectoryMethod) == null) {
      synchronized (DataformGrpc.class) {
        if ((getRemoveDirectoryMethod = DataformGrpc.getRemoveDirectoryMethod) == null) {
          DataformGrpc.getRemoveDirectoryMethod =
              getRemoveDirectoryMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveDirectory"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(new DataformMethodDescriptorSupplier("RemoveDirectory"))
                      .build();
        }
      }
    }
    return getRemoveDirectoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.MoveDirectoryRequest,
          com.google.cloud.dataform.v1alpha2.MoveDirectoryResponse>
      getMoveDirectoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MoveDirectory",
      requestType = com.google.cloud.dataform.v1alpha2.MoveDirectoryRequest.class,
      responseType = com.google.cloud.dataform.v1alpha2.MoveDirectoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.MoveDirectoryRequest,
          com.google.cloud.dataform.v1alpha2.MoveDirectoryResponse>
      getMoveDirectoryMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dataform.v1alpha2.MoveDirectoryRequest,
            com.google.cloud.dataform.v1alpha2.MoveDirectoryResponse>
        getMoveDirectoryMethod;
    if ((getMoveDirectoryMethod = DataformGrpc.getMoveDirectoryMethod) == null) {
      synchronized (DataformGrpc.class) {
        if ((getMoveDirectoryMethod = DataformGrpc.getMoveDirectoryMethod) == null) {
          DataformGrpc.getMoveDirectoryMethod =
              getMoveDirectoryMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dataform.v1alpha2.MoveDirectoryRequest,
                          com.google.cloud.dataform.v1alpha2.MoveDirectoryResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MoveDirectory"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.MoveDirectoryRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.MoveDirectoryResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(new DataformMethodDescriptorSupplier("MoveDirectory"))
                      .build();
        }
      }
    }
    return getMoveDirectoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.ReadFileRequest,
          com.google.cloud.dataform.v1alpha2.ReadFileResponse>
      getReadFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadFile",
      requestType = com.google.cloud.dataform.v1alpha2.ReadFileRequest.class,
      responseType = com.google.cloud.dataform.v1alpha2.ReadFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.ReadFileRequest,
          com.google.cloud.dataform.v1alpha2.ReadFileResponse>
      getReadFileMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dataform.v1alpha2.ReadFileRequest,
            com.google.cloud.dataform.v1alpha2.ReadFileResponse>
        getReadFileMethod;
    if ((getReadFileMethod = DataformGrpc.getReadFileMethod) == null) {
      synchronized (DataformGrpc.class) {
        if ((getReadFileMethod = DataformGrpc.getReadFileMethod) == null) {
          DataformGrpc.getReadFileMethod =
              getReadFileMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dataform.v1alpha2.ReadFileRequest,
                          com.google.cloud.dataform.v1alpha2.ReadFileResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadFile"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.ReadFileRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.ReadFileResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(new DataformMethodDescriptorSupplier("ReadFile"))
                      .build();
        }
      }
    }
    return getReadFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.RemoveFileRequest, com.google.protobuf.Empty>
      getRemoveFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveFile",
      requestType = com.google.cloud.dataform.v1alpha2.RemoveFileRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.RemoveFileRequest, com.google.protobuf.Empty>
      getRemoveFileMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dataform.v1alpha2.RemoveFileRequest, com.google.protobuf.Empty>
        getRemoveFileMethod;
    if ((getRemoveFileMethod = DataformGrpc.getRemoveFileMethod) == null) {
      synchronized (DataformGrpc.class) {
        if ((getRemoveFileMethod = DataformGrpc.getRemoveFileMethod) == null) {
          DataformGrpc.getRemoveFileMethod =
              getRemoveFileMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dataform.v1alpha2.RemoveFileRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveFile"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.RemoveFileRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(new DataformMethodDescriptorSupplier("RemoveFile"))
                      .build();
        }
      }
    }
    return getRemoveFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.MoveFileRequest,
          com.google.cloud.dataform.v1alpha2.MoveFileResponse>
      getMoveFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MoveFile",
      requestType = com.google.cloud.dataform.v1alpha2.MoveFileRequest.class,
      responseType = com.google.cloud.dataform.v1alpha2.MoveFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.MoveFileRequest,
          com.google.cloud.dataform.v1alpha2.MoveFileResponse>
      getMoveFileMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dataform.v1alpha2.MoveFileRequest,
            com.google.cloud.dataform.v1alpha2.MoveFileResponse>
        getMoveFileMethod;
    if ((getMoveFileMethod = DataformGrpc.getMoveFileMethod) == null) {
      synchronized (DataformGrpc.class) {
        if ((getMoveFileMethod = DataformGrpc.getMoveFileMethod) == null) {
          DataformGrpc.getMoveFileMethod =
              getMoveFileMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dataform.v1alpha2.MoveFileRequest,
                          com.google.cloud.dataform.v1alpha2.MoveFileResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MoveFile"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.MoveFileRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.MoveFileResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(new DataformMethodDescriptorSupplier("MoveFile"))
                      .build();
        }
      }
    }
    return getMoveFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.WriteFileRequest,
          com.google.cloud.dataform.v1alpha2.WriteFileResponse>
      getWriteFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WriteFile",
      requestType = com.google.cloud.dataform.v1alpha2.WriteFileRequest.class,
      responseType = com.google.cloud.dataform.v1alpha2.WriteFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.WriteFileRequest,
          com.google.cloud.dataform.v1alpha2.WriteFileResponse>
      getWriteFileMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dataform.v1alpha2.WriteFileRequest,
            com.google.cloud.dataform.v1alpha2.WriteFileResponse>
        getWriteFileMethod;
    if ((getWriteFileMethod = DataformGrpc.getWriteFileMethod) == null) {
      synchronized (DataformGrpc.class) {
        if ((getWriteFileMethod = DataformGrpc.getWriteFileMethod) == null) {
          DataformGrpc.getWriteFileMethod =
              getWriteFileMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dataform.v1alpha2.WriteFileRequest,
                          com.google.cloud.dataform.v1alpha2.WriteFileResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WriteFile"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.WriteFileRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.WriteFileResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(new DataformMethodDescriptorSupplier("WriteFile"))
                      .build();
        }
      }
    }
    return getWriteFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.ListCompilationResultsRequest,
          com.google.cloud.dataform.v1alpha2.ListCompilationResultsResponse>
      getListCompilationResultsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCompilationResults",
      requestType = com.google.cloud.dataform.v1alpha2.ListCompilationResultsRequest.class,
      responseType = com.google.cloud.dataform.v1alpha2.ListCompilationResultsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.ListCompilationResultsRequest,
          com.google.cloud.dataform.v1alpha2.ListCompilationResultsResponse>
      getListCompilationResultsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dataform.v1alpha2.ListCompilationResultsRequest,
            com.google.cloud.dataform.v1alpha2.ListCompilationResultsResponse>
        getListCompilationResultsMethod;
    if ((getListCompilationResultsMethod = DataformGrpc.getListCompilationResultsMethod) == null) {
      synchronized (DataformGrpc.class) {
        if ((getListCompilationResultsMethod = DataformGrpc.getListCompilationResultsMethod)
            == null) {
          DataformGrpc.getListCompilationResultsMethod =
              getListCompilationResultsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dataform.v1alpha2.ListCompilationResultsRequest,
                          com.google.cloud.dataform.v1alpha2.ListCompilationResultsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "ListCompilationResults"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.ListCompilationResultsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.ListCompilationResultsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataformMethodDescriptorSupplier("ListCompilationResults"))
                      .build();
        }
      }
    }
    return getListCompilationResultsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.GetCompilationResultRequest,
          com.google.cloud.dataform.v1alpha2.CompilationResult>
      getGetCompilationResultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCompilationResult",
      requestType = com.google.cloud.dataform.v1alpha2.GetCompilationResultRequest.class,
      responseType = com.google.cloud.dataform.v1alpha2.CompilationResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.GetCompilationResultRequest,
          com.google.cloud.dataform.v1alpha2.CompilationResult>
      getGetCompilationResultMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dataform.v1alpha2.GetCompilationResultRequest,
            com.google.cloud.dataform.v1alpha2.CompilationResult>
        getGetCompilationResultMethod;
    if ((getGetCompilationResultMethod = DataformGrpc.getGetCompilationResultMethod) == null) {
      synchronized (DataformGrpc.class) {
        if ((getGetCompilationResultMethod = DataformGrpc.getGetCompilationResultMethod) == null) {
          DataformGrpc.getGetCompilationResultMethod =
              getGetCompilationResultMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dataform.v1alpha2.GetCompilationResultRequest,
                          com.google.cloud.dataform.v1alpha2.CompilationResult>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "GetCompilationResult"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.GetCompilationResultRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.CompilationResult
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataformMethodDescriptorSupplier("GetCompilationResult"))
                      .build();
        }
      }
    }
    return getGetCompilationResultMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.CreateCompilationResultRequest,
          com.google.cloud.dataform.v1alpha2.CompilationResult>
      getCreateCompilationResultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCompilationResult",
      requestType = com.google.cloud.dataform.v1alpha2.CreateCompilationResultRequest.class,
      responseType = com.google.cloud.dataform.v1alpha2.CompilationResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.CreateCompilationResultRequest,
          com.google.cloud.dataform.v1alpha2.CompilationResult>
      getCreateCompilationResultMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dataform.v1alpha2.CreateCompilationResultRequest,
            com.google.cloud.dataform.v1alpha2.CompilationResult>
        getCreateCompilationResultMethod;
    if ((getCreateCompilationResultMethod = DataformGrpc.getCreateCompilationResultMethod)
        == null) {
      synchronized (DataformGrpc.class) {
        if ((getCreateCompilationResultMethod = DataformGrpc.getCreateCompilationResultMethod)
            == null) {
          DataformGrpc.getCreateCompilationResultMethod =
              getCreateCompilationResultMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dataform.v1alpha2.CreateCompilationResultRequest,
                          com.google.cloud.dataform.v1alpha2.CompilationResult>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "CreateCompilationResult"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.CreateCompilationResultRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.CompilationResult
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataformMethodDescriptorSupplier("CreateCompilationResult"))
                      .build();
        }
      }
    }
    return getCreateCompilationResultMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.QueryCompilationResultActionsRequest,
          com.google.cloud.dataform.v1alpha2.QueryCompilationResultActionsResponse>
      getQueryCompilationResultActionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryCompilationResultActions",
      requestType = com.google.cloud.dataform.v1alpha2.QueryCompilationResultActionsRequest.class,
      responseType = com.google.cloud.dataform.v1alpha2.QueryCompilationResultActionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.QueryCompilationResultActionsRequest,
          com.google.cloud.dataform.v1alpha2.QueryCompilationResultActionsResponse>
      getQueryCompilationResultActionsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dataform.v1alpha2.QueryCompilationResultActionsRequest,
            com.google.cloud.dataform.v1alpha2.QueryCompilationResultActionsResponse>
        getQueryCompilationResultActionsMethod;
    if ((getQueryCompilationResultActionsMethod =
            DataformGrpc.getQueryCompilationResultActionsMethod)
        == null) {
      synchronized (DataformGrpc.class) {
        if ((getQueryCompilationResultActionsMethod =
                DataformGrpc.getQueryCompilationResultActionsMethod)
            == null) {
          DataformGrpc.getQueryCompilationResultActionsMethod =
              getQueryCompilationResultActionsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dataform.v1alpha2.QueryCompilationResultActionsRequest,
                          com.google.cloud.dataform.v1alpha2.QueryCompilationResultActionsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "QueryCompilationResultActions"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2
                                  .QueryCompilationResultActionsRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2
                                  .QueryCompilationResultActionsResponse.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataformMethodDescriptorSupplier("QueryCompilationResultActions"))
                      .build();
        }
      }
    }
    return getQueryCompilationResultActionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.ListWorkflowInvocationsRequest,
          com.google.cloud.dataform.v1alpha2.ListWorkflowInvocationsResponse>
      getListWorkflowInvocationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListWorkflowInvocations",
      requestType = com.google.cloud.dataform.v1alpha2.ListWorkflowInvocationsRequest.class,
      responseType = com.google.cloud.dataform.v1alpha2.ListWorkflowInvocationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.ListWorkflowInvocationsRequest,
          com.google.cloud.dataform.v1alpha2.ListWorkflowInvocationsResponse>
      getListWorkflowInvocationsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dataform.v1alpha2.ListWorkflowInvocationsRequest,
            com.google.cloud.dataform.v1alpha2.ListWorkflowInvocationsResponse>
        getListWorkflowInvocationsMethod;
    if ((getListWorkflowInvocationsMethod = DataformGrpc.getListWorkflowInvocationsMethod)
        == null) {
      synchronized (DataformGrpc.class) {
        if ((getListWorkflowInvocationsMethod = DataformGrpc.getListWorkflowInvocationsMethod)
            == null) {
          DataformGrpc.getListWorkflowInvocationsMethod =
              getListWorkflowInvocationsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dataform.v1alpha2.ListWorkflowInvocationsRequest,
                          com.google.cloud.dataform.v1alpha2.ListWorkflowInvocationsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "ListWorkflowInvocations"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.ListWorkflowInvocationsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.ListWorkflowInvocationsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataformMethodDescriptorSupplier("ListWorkflowInvocations"))
                      .build();
        }
      }
    }
    return getListWorkflowInvocationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.GetWorkflowInvocationRequest,
          com.google.cloud.dataform.v1alpha2.WorkflowInvocation>
      getGetWorkflowInvocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWorkflowInvocation",
      requestType = com.google.cloud.dataform.v1alpha2.GetWorkflowInvocationRequest.class,
      responseType = com.google.cloud.dataform.v1alpha2.WorkflowInvocation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.GetWorkflowInvocationRequest,
          com.google.cloud.dataform.v1alpha2.WorkflowInvocation>
      getGetWorkflowInvocationMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dataform.v1alpha2.GetWorkflowInvocationRequest,
            com.google.cloud.dataform.v1alpha2.WorkflowInvocation>
        getGetWorkflowInvocationMethod;
    if ((getGetWorkflowInvocationMethod = DataformGrpc.getGetWorkflowInvocationMethod) == null) {
      synchronized (DataformGrpc.class) {
        if ((getGetWorkflowInvocationMethod = DataformGrpc.getGetWorkflowInvocationMethod)
            == null) {
          DataformGrpc.getGetWorkflowInvocationMethod =
              getGetWorkflowInvocationMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dataform.v1alpha2.GetWorkflowInvocationRequest,
                          com.google.cloud.dataform.v1alpha2.WorkflowInvocation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "GetWorkflowInvocation"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.GetWorkflowInvocationRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.WorkflowInvocation
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataformMethodDescriptorSupplier("GetWorkflowInvocation"))
                      .build();
        }
      }
    }
    return getGetWorkflowInvocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.CreateWorkflowInvocationRequest,
          com.google.cloud.dataform.v1alpha2.WorkflowInvocation>
      getCreateWorkflowInvocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWorkflowInvocation",
      requestType = com.google.cloud.dataform.v1alpha2.CreateWorkflowInvocationRequest.class,
      responseType = com.google.cloud.dataform.v1alpha2.WorkflowInvocation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.CreateWorkflowInvocationRequest,
          com.google.cloud.dataform.v1alpha2.WorkflowInvocation>
      getCreateWorkflowInvocationMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dataform.v1alpha2.CreateWorkflowInvocationRequest,
            com.google.cloud.dataform.v1alpha2.WorkflowInvocation>
        getCreateWorkflowInvocationMethod;
    if ((getCreateWorkflowInvocationMethod = DataformGrpc.getCreateWorkflowInvocationMethod)
        == null) {
      synchronized (DataformGrpc.class) {
        if ((getCreateWorkflowInvocationMethod = DataformGrpc.getCreateWorkflowInvocationMethod)
            == null) {
          DataformGrpc.getCreateWorkflowInvocationMethod =
              getCreateWorkflowInvocationMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dataform.v1alpha2.CreateWorkflowInvocationRequest,
                          com.google.cloud.dataform.v1alpha2.WorkflowInvocation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "CreateWorkflowInvocation"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.CreateWorkflowInvocationRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.WorkflowInvocation
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataformMethodDescriptorSupplier("CreateWorkflowInvocation"))
                      .build();
        }
      }
    }
    return getCreateWorkflowInvocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.DeleteWorkflowInvocationRequest,
          com.google.protobuf.Empty>
      getDeleteWorkflowInvocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteWorkflowInvocation",
      requestType = com.google.cloud.dataform.v1alpha2.DeleteWorkflowInvocationRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.DeleteWorkflowInvocationRequest,
          com.google.protobuf.Empty>
      getDeleteWorkflowInvocationMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dataform.v1alpha2.DeleteWorkflowInvocationRequest,
            com.google.protobuf.Empty>
        getDeleteWorkflowInvocationMethod;
    if ((getDeleteWorkflowInvocationMethod = DataformGrpc.getDeleteWorkflowInvocationMethod)
        == null) {
      synchronized (DataformGrpc.class) {
        if ((getDeleteWorkflowInvocationMethod = DataformGrpc.getDeleteWorkflowInvocationMethod)
            == null) {
          DataformGrpc.getDeleteWorkflowInvocationMethod =
              getDeleteWorkflowInvocationMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dataform.v1alpha2.DeleteWorkflowInvocationRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "DeleteWorkflowInvocation"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.DeleteWorkflowInvocationRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataformMethodDescriptorSupplier("DeleteWorkflowInvocation"))
                      .build();
        }
      }
    }
    return getDeleteWorkflowInvocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.CancelWorkflowInvocationRequest,
          com.google.protobuf.Empty>
      getCancelWorkflowInvocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelWorkflowInvocation",
      requestType = com.google.cloud.dataform.v1alpha2.CancelWorkflowInvocationRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.CancelWorkflowInvocationRequest,
          com.google.protobuf.Empty>
      getCancelWorkflowInvocationMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dataform.v1alpha2.CancelWorkflowInvocationRequest,
            com.google.protobuf.Empty>
        getCancelWorkflowInvocationMethod;
    if ((getCancelWorkflowInvocationMethod = DataformGrpc.getCancelWorkflowInvocationMethod)
        == null) {
      synchronized (DataformGrpc.class) {
        if ((getCancelWorkflowInvocationMethod = DataformGrpc.getCancelWorkflowInvocationMethod)
            == null) {
          DataformGrpc.getCancelWorkflowInvocationMethod =
              getCancelWorkflowInvocationMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dataform.v1alpha2.CancelWorkflowInvocationRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "CancelWorkflowInvocation"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2.CancelWorkflowInvocationRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataformMethodDescriptorSupplier("CancelWorkflowInvocation"))
                      .build();
        }
      }
    }
    return getCancelWorkflowInvocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.QueryWorkflowInvocationActionsRequest,
          com.google.cloud.dataform.v1alpha2.QueryWorkflowInvocationActionsResponse>
      getQueryWorkflowInvocationActionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryWorkflowInvocationActions",
      requestType = com.google.cloud.dataform.v1alpha2.QueryWorkflowInvocationActionsRequest.class,
      responseType =
          com.google.cloud.dataform.v1alpha2.QueryWorkflowInvocationActionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.dataform.v1alpha2.QueryWorkflowInvocationActionsRequest,
          com.google.cloud.dataform.v1alpha2.QueryWorkflowInvocationActionsResponse>
      getQueryWorkflowInvocationActionsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.dataform.v1alpha2.QueryWorkflowInvocationActionsRequest,
            com.google.cloud.dataform.v1alpha2.QueryWorkflowInvocationActionsResponse>
        getQueryWorkflowInvocationActionsMethod;
    if ((getQueryWorkflowInvocationActionsMethod =
            DataformGrpc.getQueryWorkflowInvocationActionsMethod)
        == null) {
      synchronized (DataformGrpc.class) {
        if ((getQueryWorkflowInvocationActionsMethod =
                DataformGrpc.getQueryWorkflowInvocationActionsMethod)
            == null) {
          DataformGrpc.getQueryWorkflowInvocationActionsMethod =
              getQueryWorkflowInvocationActionsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.dataform.v1alpha2.QueryWorkflowInvocationActionsRequest,
                          com.google.cloud.dataform.v1alpha2.QueryWorkflowInvocationActionsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "QueryWorkflowInvocationActions"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2
                                  .QueryWorkflowInvocationActionsRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.dataform.v1alpha2
                                  .QueryWorkflowInvocationActionsResponse.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataformMethodDescriptorSupplier("QueryWorkflowInvocationActions"))
                      .build();
        }
      }
    }
    return getQueryWorkflowInvocationActionsMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static DataformStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataformStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<DataformStub>() {
          @java.lang.Override
          public DataformStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new DataformStub(channel, callOptions);
          }
        };
    return DataformStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataformBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataformBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<DataformBlockingStub>() {
          @java.lang.Override
          public DataformBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new DataformBlockingStub(channel, callOptions);
          }
        };
    return DataformBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static DataformFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataformFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<DataformFutureStub>() {
          @java.lang.Override
          public DataformFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new DataformFutureStub(channel, callOptions);
          }
        };
    return DataformFutureStub.newStub(factory, channel);
  }

  /**
   *
   *
   * <pre>
   * Dataform is a service to develop, create, document, test, and update curated
   * tables in BigQuery.
   * </pre>
   */
  public interface AsyncService {

    /**
     *
     *
     * <pre>
     * Lists Repositories in a given project and location.
     * </pre>
     */
    default void listRepositories(
        com.google.cloud.dataform.v1alpha2.ListRepositoriesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.ListRepositoriesResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getListRepositoriesMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Fetches a single Repository.
     * </pre>
     */
    default void getRepository(
        com.google.cloud.dataform.v1alpha2.GetRepositoryRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.Repository>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getGetRepositoryMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a new Repository in a given project and location.
     * </pre>
     */
    default void createRepository(
        com.google.cloud.dataform.v1alpha2.CreateRepositoryRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.Repository>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getCreateRepositoryMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates a single Repository.
     * </pre>
     */
    default void updateRepository(
        com.google.cloud.dataform.v1alpha2.UpdateRepositoryRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.Repository>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getUpdateRepositoryMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a single Repository.
     * </pre>
     */
    default void deleteRepository(
        com.google.cloud.dataform.v1alpha2.DeleteRepositoryRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getDeleteRepositoryMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Fetches a Repository's remote branches.
     * </pre>
     */
    default void fetchRemoteBranches(
        com.google.cloud.dataform.v1alpha2.FetchRemoteBranchesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.FetchRemoteBranchesResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getFetchRemoteBranchesMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists Workspaces in a given Repository.
     * </pre>
     */
    default void listWorkspaces(
        com.google.cloud.dataform.v1alpha2.ListWorkspacesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.ListWorkspacesResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getListWorkspacesMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Fetches a single Workspace.
     * </pre>
     */
    default void getWorkspace(
        com.google.cloud.dataform.v1alpha2.GetWorkspaceRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.Workspace>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getGetWorkspaceMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a new Workspace in a given Repository.
     * </pre>
     */
    default void createWorkspace(
        com.google.cloud.dataform.v1alpha2.CreateWorkspaceRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.Workspace>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getCreateWorkspaceMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a single Workspace.
     * </pre>
     */
    default void deleteWorkspace(
        com.google.cloud.dataform.v1alpha2.DeleteWorkspaceRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getDeleteWorkspaceMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Installs dependency NPM packages (inside a Workspace).
     * </pre>
     */
    default void installNpmPackages(
        com.google.cloud.dataform.v1alpha2.InstallNpmPackagesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.InstallNpmPackagesResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getInstallNpmPackagesMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Pulls Git commits from the Repository's remote into a Workspace.
     * </pre>
     */
    default void pullGitCommits(
        com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getPullGitCommitsMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Pushes Git commits from a Workspace to the Repository's remote.
     * </pre>
     */
    default void pushGitCommits(
        com.google.cloud.dataform.v1alpha2.PushGitCommitsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getPushGitCommitsMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Fetches Git statuses for the files in a Workspace.
     * </pre>
     */
    default void fetchFileGitStatuses(
        com.google.cloud.dataform.v1alpha2.FetchFileGitStatusesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.FetchFileGitStatusesResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getFetchFileGitStatusesMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Fetches Git ahead/behind against a remote branch.
     * </pre>
     */
    default void fetchGitAheadBehind(
        com.google.cloud.dataform.v1alpha2.FetchGitAheadBehindRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.FetchGitAheadBehindResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getFetchGitAheadBehindMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Applies a Git commit for uncommitted files in a Workspace.
     * </pre>
     */
    default void commitWorkspaceChanges(
        com.google.cloud.dataform.v1alpha2.CommitWorkspaceChangesRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getCommitWorkspaceChangesMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Performs a Git reset for uncommitted files in a Workspace.
     * </pre>
     */
    default void resetWorkspaceChanges(
        com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getResetWorkspaceChangesMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Fetches Git diff for an uncommitted file in a Workspace.
     * </pre>
     */
    default void fetchFileDiff(
        com.google.cloud.dataform.v1alpha2.FetchFileDiffRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.FetchFileDiffResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getFetchFileDiffMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Returns the contents of a given Workspace directory.
     * </pre>
     */
    default void queryDirectoryContents(
        com.google.cloud.dataform.v1alpha2.QueryDirectoryContentsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.dataform.v1alpha2.QueryDirectoryContentsResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getQueryDirectoryContentsMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a directory inside a Workspace.
     * </pre>
     */
    default void makeDirectory(
        com.google.cloud.dataform.v1alpha2.MakeDirectoryRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.MakeDirectoryResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getMakeDirectoryMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a directory (inside a Workspace) and all of its contents.
     * </pre>
     */
    default void removeDirectory(
        com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getRemoveDirectoryMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Moves a directory (inside a Workspace), and all of its contents, to a new
     * location.
     * </pre>
     */
    default void moveDirectory(
        com.google.cloud.dataform.v1alpha2.MoveDirectoryRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.MoveDirectoryResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getMoveDirectoryMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Returns the contents of a file (inside a Workspace).
     * </pre>
     */
    default void readFile(
        com.google.cloud.dataform.v1alpha2.ReadFileRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.ReadFileResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadFileMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a file (inside a Workspace).
     * </pre>
     */
    default void removeFile(
        com.google.cloud.dataform.v1alpha2.RemoveFileRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveFileMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Moves a file (inside a Workspace) to a new location.
     * </pre>
     */
    default void moveFile(
        com.google.cloud.dataform.v1alpha2.MoveFileRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.MoveFileResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveFileMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Writes to a file (inside a Workspace).
     * </pre>
     */
    default void writeFile(
        com.google.cloud.dataform.v1alpha2.WriteFileRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.WriteFileResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWriteFileMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists CompilationResults in a given Repository.
     * </pre>
     */
    default void listCompilationResults(
        com.google.cloud.dataform.v1alpha2.ListCompilationResultsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.dataform.v1alpha2.ListCompilationResultsResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getListCompilationResultsMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Fetches a single CompilationResult.
     * </pre>
     */
    default void getCompilationResult(
        com.google.cloud.dataform.v1alpha2.GetCompilationResultRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.CompilationResult>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getGetCompilationResultMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a new CompilationResult in a given project and location.
     * </pre>
     */
    default void createCompilationResult(
        com.google.cloud.dataform.v1alpha2.CreateCompilationResultRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.CompilationResult>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getCreateCompilationResultMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Returns CompilationResultActions in a given CompilationResult.
     * </pre>
     */
    default void queryCompilationResultActions(
        com.google.cloud.dataform.v1alpha2.QueryCompilationResultActionsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.dataform.v1alpha2.QueryCompilationResultActionsResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getQueryCompilationResultActionsMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists WorkflowInvocations in a given Repository.
     * </pre>
     */
    default void listWorkflowInvocations(
        com.google.cloud.dataform.v1alpha2.ListWorkflowInvocationsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.dataform.v1alpha2.ListWorkflowInvocationsResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getListWorkflowInvocationsMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Fetches a single WorkflowInvocation.
     * </pre>
     */
    default void getWorkflowInvocation(
        com.google.cloud.dataform.v1alpha2.GetWorkflowInvocationRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.WorkflowInvocation>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getGetWorkflowInvocationMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a new WorkflowInvocation in a given Repository.
     * </pre>
     */
    default void createWorkflowInvocation(
        com.google.cloud.dataform.v1alpha2.CreateWorkflowInvocationRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.WorkflowInvocation>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getCreateWorkflowInvocationMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a single WorkflowInvocation.
     * </pre>
     */
    default void deleteWorkflowInvocation(
        com.google.cloud.dataform.v1alpha2.DeleteWorkflowInvocationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getDeleteWorkflowInvocationMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Requests cancellation of a running WorkflowInvocation.
     * </pre>
     */
    default void cancelWorkflowInvocation(
        com.google.cloud.dataform.v1alpha2.CancelWorkflowInvocationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getCancelWorkflowInvocationMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Returns WorkflowInvocationActions in a given WorkflowInvocation.
     * </pre>
     */
    default void queryWorkflowInvocationActions(
        com.google.cloud.dataform.v1alpha2.QueryWorkflowInvocationActionsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.dataform.v1alpha2.QueryWorkflowInvocationActionsResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getQueryWorkflowInvocationActionsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Dataform.
   *
   * <pre>
   * Dataform is a service to develop, create, document, test, and update curated
   * tables in BigQuery.
   * </pre>
   */
  public abstract static class DataformImplBase implements io.grpc.BindableService, AsyncService {

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return DataformGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Dataform.
   *
   * <pre>
   * Dataform is a service to develop, create, document, test, and update curated
   * tables in BigQuery.
   * </pre>
   */
  public static final class DataformStub extends io.grpc.stub.AbstractAsyncStub<DataformStub> {
    private DataformStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataformStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataformStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Lists Repositories in a given project and location.
     * </pre>
     */
    public void listRepositories(
        com.google.cloud.dataform.v1alpha2.ListRepositoriesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.ListRepositoriesResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRepositoriesMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Fetches a single Repository.
     * </pre>
     */
    public void getRepository(
        com.google.cloud.dataform.v1alpha2.GetRepositoryRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.Repository>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRepositoryMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a new Repository in a given project and location.
     * </pre>
     */
    public void createRepository(
        com.google.cloud.dataform.v1alpha2.CreateRepositoryRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.Repository>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRepositoryMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates a single Repository.
     * </pre>
     */
    public void updateRepository(
        com.google.cloud.dataform.v1alpha2.UpdateRepositoryRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.Repository>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRepositoryMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a single Repository.
     * </pre>
     */
    public void deleteRepository(
        com.google.cloud.dataform.v1alpha2.DeleteRepositoryRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRepositoryMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Fetches a Repository's remote branches.
     * </pre>
     */
    public void fetchRemoteBranches(
        com.google.cloud.dataform.v1alpha2.FetchRemoteBranchesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.FetchRemoteBranchesResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFetchRemoteBranchesMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists Workspaces in a given Repository.
     * </pre>
     */
    public void listWorkspaces(
        com.google.cloud.dataform.v1alpha2.ListWorkspacesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.ListWorkspacesResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListWorkspacesMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Fetches a single Workspace.
     * </pre>
     */
    public void getWorkspace(
        com.google.cloud.dataform.v1alpha2.GetWorkspaceRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.Workspace>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWorkspaceMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a new Workspace in a given Repository.
     * </pre>
     */
    public void createWorkspace(
        com.google.cloud.dataform.v1alpha2.CreateWorkspaceRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.Workspace>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateWorkspaceMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a single Workspace.
     * </pre>
     */
    public void deleteWorkspace(
        com.google.cloud.dataform.v1alpha2.DeleteWorkspaceRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteWorkspaceMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Installs dependency NPM packages (inside a Workspace).
     * </pre>
     */
    public void installNpmPackages(
        com.google.cloud.dataform.v1alpha2.InstallNpmPackagesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.InstallNpmPackagesResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInstallNpmPackagesMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Pulls Git commits from the Repository's remote into a Workspace.
     * </pre>
     */
    public void pullGitCommits(
        com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPullGitCommitsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Pushes Git commits from a Workspace to the Repository's remote.
     * </pre>
     */
    public void pushGitCommits(
        com.google.cloud.dataform.v1alpha2.PushGitCommitsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPushGitCommitsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Fetches Git statuses for the files in a Workspace.
     * </pre>
     */
    public void fetchFileGitStatuses(
        com.google.cloud.dataform.v1alpha2.FetchFileGitStatusesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.FetchFileGitStatusesResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFetchFileGitStatusesMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Fetches Git ahead/behind against a remote branch.
     * </pre>
     */
    public void fetchGitAheadBehind(
        com.google.cloud.dataform.v1alpha2.FetchGitAheadBehindRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.FetchGitAheadBehindResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFetchGitAheadBehindMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Applies a Git commit for uncommitted files in a Workspace.
     * </pre>
     */
    public void commitWorkspaceChanges(
        com.google.cloud.dataform.v1alpha2.CommitWorkspaceChangesRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCommitWorkspaceChangesMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Performs a Git reset for uncommitted files in a Workspace.
     * </pre>
     */
    public void resetWorkspaceChanges(
        com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResetWorkspaceChangesMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Fetches Git diff for an uncommitted file in a Workspace.
     * </pre>
     */
    public void fetchFileDiff(
        com.google.cloud.dataform.v1alpha2.FetchFileDiffRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.FetchFileDiffResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFetchFileDiffMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Returns the contents of a given Workspace directory.
     * </pre>
     */
    public void queryDirectoryContents(
        com.google.cloud.dataform.v1alpha2.QueryDirectoryContentsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.dataform.v1alpha2.QueryDirectoryContentsResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryDirectoryContentsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a directory inside a Workspace.
     * </pre>
     */
    public void makeDirectory(
        com.google.cloud.dataform.v1alpha2.MakeDirectoryRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.MakeDirectoryResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMakeDirectoryMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a directory (inside a Workspace) and all of its contents.
     * </pre>
     */
    public void removeDirectory(
        com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveDirectoryMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Moves a directory (inside a Workspace), and all of its contents, to a new
     * location.
     * </pre>
     */
    public void moveDirectory(
        com.google.cloud.dataform.v1alpha2.MoveDirectoryRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.MoveDirectoryResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveDirectoryMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Returns the contents of a file (inside a Workspace).
     * </pre>
     */
    public void readFile(
        com.google.cloud.dataform.v1alpha2.ReadFileRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.ReadFileResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a file (inside a Workspace).
     * </pre>
     */
    public void removeFile(
        com.google.cloud.dataform.v1alpha2.RemoveFileRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Moves a file (inside a Workspace) to a new location.
     * </pre>
     */
    public void moveFile(
        com.google.cloud.dataform.v1alpha2.MoveFileRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.MoveFileResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Writes to a file (inside a Workspace).
     * </pre>
     */
    public void writeFile(
        com.google.cloud.dataform.v1alpha2.WriteFileRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.WriteFileResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWriteFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists CompilationResults in a given Repository.
     * </pre>
     */
    public void listCompilationResults(
        com.google.cloud.dataform.v1alpha2.ListCompilationResultsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.dataform.v1alpha2.ListCompilationResultsResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCompilationResultsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Fetches a single CompilationResult.
     * </pre>
     */
    public void getCompilationResult(
        com.google.cloud.dataform.v1alpha2.GetCompilationResultRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.CompilationResult>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCompilationResultMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a new CompilationResult in a given project and location.
     * </pre>
     */
    public void createCompilationResult(
        com.google.cloud.dataform.v1alpha2.CreateCompilationResultRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.CompilationResult>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCompilationResultMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Returns CompilationResultActions in a given CompilationResult.
     * </pre>
     */
    public void queryCompilationResultActions(
        com.google.cloud.dataform.v1alpha2.QueryCompilationResultActionsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.dataform.v1alpha2.QueryCompilationResultActionsResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryCompilationResultActionsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists WorkflowInvocations in a given Repository.
     * </pre>
     */
    public void listWorkflowInvocations(
        com.google.cloud.dataform.v1alpha2.ListWorkflowInvocationsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.dataform.v1alpha2.ListWorkflowInvocationsResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListWorkflowInvocationsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Fetches a single WorkflowInvocation.
     * </pre>
     */
    public void getWorkflowInvocation(
        com.google.cloud.dataform.v1alpha2.GetWorkflowInvocationRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.WorkflowInvocation>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWorkflowInvocationMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a new WorkflowInvocation in a given Repository.
     * </pre>
     */
    public void createWorkflowInvocation(
        com.google.cloud.dataform.v1alpha2.CreateWorkflowInvocationRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.WorkflowInvocation>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateWorkflowInvocationMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a single WorkflowInvocation.
     * </pre>
     */
    public void deleteWorkflowInvocation(
        com.google.cloud.dataform.v1alpha2.DeleteWorkflowInvocationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteWorkflowInvocationMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Requests cancellation of a running WorkflowInvocation.
     * </pre>
     */
    public void cancelWorkflowInvocation(
        com.google.cloud.dataform.v1alpha2.CancelWorkflowInvocationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelWorkflowInvocationMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Returns WorkflowInvocationActions in a given WorkflowInvocation.
     * </pre>
     */
    public void queryWorkflowInvocationActions(
        com.google.cloud.dataform.v1alpha2.QueryWorkflowInvocationActionsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.dataform.v1alpha2.QueryWorkflowInvocationActionsResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryWorkflowInvocationActionsMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Dataform.
   *
   * <pre>
   * Dataform is a service to develop, create, document, test, and update curated
   * tables in BigQuery.
   * </pre>
   */
  public static final class DataformBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DataformBlockingStub> {
    private DataformBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataformBlockingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataformBlockingStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Lists Repositories in a given project and location.
     * </pre>
     */
    public com.google.cloud.dataform.v1alpha2.ListRepositoriesResponse listRepositories(
        com.google.cloud.dataform.v1alpha2.ListRepositoriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRepositoriesMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Fetches a single Repository.
     * </pre>
     */
    public com.google.cloud.dataform.v1alpha2.Repository getRepository(
        com.google.cloud.dataform.v1alpha2.GetRepositoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRepositoryMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a new Repository in a given project and location.
     * </pre>
     */
    public com.google.cloud.dataform.v1alpha2.Repository createRepository(
        com.google.cloud.dataform.v1alpha2.CreateRepositoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRepositoryMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Updates a single Repository.
     * </pre>
     */
    public com.google.cloud.dataform.v1alpha2.Repository updateRepository(
        com.google.cloud.dataform.v1alpha2.UpdateRepositoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRepositoryMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a single Repository.
     * </pre>
     */
    public com.google.protobuf.Empty deleteRepository(
        com.google.cloud.dataform.v1alpha2.DeleteRepositoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRepositoryMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Fetches a Repository's remote branches.
     * </pre>
     */
    public com.google.cloud.dataform.v1alpha2.FetchRemoteBranchesResponse fetchRemoteBranches(
        com.google.cloud.dataform.v1alpha2.FetchRemoteBranchesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFetchRemoteBranchesMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists Workspaces in a given Repository.
     * </pre>
     */
    public com.google.cloud.dataform.v1alpha2.ListWorkspacesResponse listWorkspaces(
        com.google.cloud.dataform.v1alpha2.ListWorkspacesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListWorkspacesMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Fetches a single Workspace.
     * </pre>
     */
    public com.google.cloud.dataform.v1alpha2.Workspace getWorkspace(
        com.google.cloud.dataform.v1alpha2.GetWorkspaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWorkspaceMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a new Workspace in a given Repository.
     * </pre>
     */
    public com.google.cloud.dataform.v1alpha2.Workspace createWorkspace(
        com.google.cloud.dataform.v1alpha2.CreateWorkspaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateWorkspaceMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a single Workspace.
     * </pre>
     */
    public com.google.protobuf.Empty deleteWorkspace(
        com.google.cloud.dataform.v1alpha2.DeleteWorkspaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteWorkspaceMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Installs dependency NPM packages (inside a Workspace).
     * </pre>
     */
    public com.google.cloud.dataform.v1alpha2.InstallNpmPackagesResponse installNpmPackages(
        com.google.cloud.dataform.v1alpha2.InstallNpmPackagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInstallNpmPackagesMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Pulls Git commits from the Repository's remote into a Workspace.
     * </pre>
     */
    public com.google.protobuf.Empty pullGitCommits(
        com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPullGitCommitsMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Pushes Git commits from a Workspace to the Repository's remote.
     * </pre>
     */
    public com.google.protobuf.Empty pushGitCommits(
        com.google.cloud.dataform.v1alpha2.PushGitCommitsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPushGitCommitsMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Fetches Git statuses for the files in a Workspace.
     * </pre>
     */
    public com.google.cloud.dataform.v1alpha2.FetchFileGitStatusesResponse fetchFileGitStatuses(
        com.google.cloud.dataform.v1alpha2.FetchFileGitStatusesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFetchFileGitStatusesMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Fetches Git ahead/behind against a remote branch.
     * </pre>
     */
    public com.google.cloud.dataform.v1alpha2.FetchGitAheadBehindResponse fetchGitAheadBehind(
        com.google.cloud.dataform.v1alpha2.FetchGitAheadBehindRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFetchGitAheadBehindMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Applies a Git commit for uncommitted files in a Workspace.
     * </pre>
     */
    public com.google.protobuf.Empty commitWorkspaceChanges(
        com.google.cloud.dataform.v1alpha2.CommitWorkspaceChangesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCommitWorkspaceChangesMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Performs a Git reset for uncommitted files in a Workspace.
     * </pre>
     */
    public com.google.protobuf.Empty resetWorkspaceChanges(
        com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResetWorkspaceChangesMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Fetches Git diff for an uncommitted file in a Workspace.
     * </pre>
     */
    public com.google.cloud.dataform.v1alpha2.FetchFileDiffResponse fetchFileDiff(
        com.google.cloud.dataform.v1alpha2.FetchFileDiffRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFetchFileDiffMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Returns the contents of a given Workspace directory.
     * </pre>
     */
    public com.google.cloud.dataform.v1alpha2.QueryDirectoryContentsResponse queryDirectoryContents(
        com.google.cloud.dataform.v1alpha2.QueryDirectoryContentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryDirectoryContentsMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a directory inside a Workspace.
     * </pre>
     */
    public com.google.cloud.dataform.v1alpha2.MakeDirectoryResponse makeDirectory(
        com.google.cloud.dataform.v1alpha2.MakeDirectoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMakeDirectoryMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a directory (inside a Workspace) and all of its contents.
     * </pre>
     */
    public com.google.protobuf.Empty removeDirectory(
        com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveDirectoryMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Moves a directory (inside a Workspace), and all of its contents, to a new
     * location.
     * </pre>
     */
    public com.google.cloud.dataform.v1alpha2.MoveDirectoryResponse moveDirectory(
        com.google.cloud.dataform.v1alpha2.MoveDirectoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveDirectoryMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Returns the contents of a file (inside a Workspace).
     * </pre>
     */
    public com.google.cloud.dataform.v1alpha2.ReadFileResponse readFile(
        com.google.cloud.dataform.v1alpha2.ReadFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadFileMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a file (inside a Workspace).
     * </pre>
     */
    public com.google.protobuf.Empty removeFile(
        com.google.cloud.dataform.v1alpha2.RemoveFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveFileMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Moves a file (inside a Workspace) to a new location.
     * </pre>
     */
    public com.google.cloud.dataform.v1alpha2.MoveFileResponse moveFile(
        com.google.cloud.dataform.v1alpha2.MoveFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveFileMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Writes to a file (inside a Workspace).
     * </pre>
     */
    public com.google.cloud.dataform.v1alpha2.WriteFileResponse writeFile(
        com.google.cloud.dataform.v1alpha2.WriteFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWriteFileMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists CompilationResults in a given Repository.
     * </pre>
     */
    public com.google.cloud.dataform.v1alpha2.ListCompilationResultsResponse listCompilationResults(
        com.google.cloud.dataform.v1alpha2.ListCompilationResultsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCompilationResultsMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Fetches a single CompilationResult.
     * </pre>
     */
    public com.google.cloud.dataform.v1alpha2.CompilationResult getCompilationResult(
        com.google.cloud.dataform.v1alpha2.GetCompilationResultRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCompilationResultMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a new CompilationResult in a given project and location.
     * </pre>
     */
    public com.google.cloud.dataform.v1alpha2.CompilationResult createCompilationResult(
        com.google.cloud.dataform.v1alpha2.CreateCompilationResultRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCompilationResultMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Returns CompilationResultActions in a given CompilationResult.
     * </pre>
     */
    public com.google.cloud.dataform.v1alpha2.QueryCompilationResultActionsResponse
        queryCompilationResultActions(
            com.google.cloud.dataform.v1alpha2.QueryCompilationResultActionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryCompilationResultActionsMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists WorkflowInvocations in a given Repository.
     * </pre>
     */
    public com.google.cloud.dataform.v1alpha2.ListWorkflowInvocationsResponse
        listWorkflowInvocations(
            com.google.cloud.dataform.v1alpha2.ListWorkflowInvocationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListWorkflowInvocationsMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Fetches a single WorkflowInvocation.
     * </pre>
     */
    public com.google.cloud.dataform.v1alpha2.WorkflowInvocation getWorkflowInvocation(
        com.google.cloud.dataform.v1alpha2.GetWorkflowInvocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWorkflowInvocationMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a new WorkflowInvocation in a given Repository.
     * </pre>
     */
    public com.google.cloud.dataform.v1alpha2.WorkflowInvocation createWorkflowInvocation(
        com.google.cloud.dataform.v1alpha2.CreateWorkflowInvocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateWorkflowInvocationMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a single WorkflowInvocation.
     * </pre>
     */
    public com.google.protobuf.Empty deleteWorkflowInvocation(
        com.google.cloud.dataform.v1alpha2.DeleteWorkflowInvocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteWorkflowInvocationMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Requests cancellation of a running WorkflowInvocation.
     * </pre>
     */
    public com.google.protobuf.Empty cancelWorkflowInvocation(
        com.google.cloud.dataform.v1alpha2.CancelWorkflowInvocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelWorkflowInvocationMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Returns WorkflowInvocationActions in a given WorkflowInvocation.
     * </pre>
     */
    public com.google.cloud.dataform.v1alpha2.QueryWorkflowInvocationActionsResponse
        queryWorkflowInvocationActions(
            com.google.cloud.dataform.v1alpha2.QueryWorkflowInvocationActionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryWorkflowInvocationActionsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Dataform.
   *
   * <pre>
   * Dataform is a service to develop, create, document, test, and update curated
   * tables in BigQuery.
   * </pre>
   */
  public static final class DataformFutureStub
      extends io.grpc.stub.AbstractFutureStub<DataformFutureStub> {
    private DataformFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataformFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataformFutureStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Lists Repositories in a given project and location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dataform.v1alpha2.ListRepositoriesResponse>
        listRepositories(com.google.cloud.dataform.v1alpha2.ListRepositoriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRepositoriesMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Fetches a single Repository.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dataform.v1alpha2.Repository>
        getRepository(com.google.cloud.dataform.v1alpha2.GetRepositoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRepositoryMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a new Repository in a given project and location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dataform.v1alpha2.Repository>
        createRepository(com.google.cloud.dataform.v1alpha2.CreateRepositoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRepositoryMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Updates a single Repository.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dataform.v1alpha2.Repository>
        updateRepository(com.google.cloud.dataform.v1alpha2.UpdateRepositoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRepositoryMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a single Repository.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        deleteRepository(com.google.cloud.dataform.v1alpha2.DeleteRepositoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRepositoryMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Fetches a Repository's remote branches.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dataform.v1alpha2.FetchRemoteBranchesResponse>
        fetchRemoteBranches(com.google.cloud.dataform.v1alpha2.FetchRemoteBranchesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFetchRemoteBranchesMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists Workspaces in a given Repository.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dataform.v1alpha2.ListWorkspacesResponse>
        listWorkspaces(com.google.cloud.dataform.v1alpha2.ListWorkspacesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListWorkspacesMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Fetches a single Workspace.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dataform.v1alpha2.Workspace>
        getWorkspace(com.google.cloud.dataform.v1alpha2.GetWorkspaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWorkspaceMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a new Workspace in a given Repository.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dataform.v1alpha2.Workspace>
        createWorkspace(com.google.cloud.dataform.v1alpha2.CreateWorkspaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateWorkspaceMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a single Workspace.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        deleteWorkspace(com.google.cloud.dataform.v1alpha2.DeleteWorkspaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteWorkspaceMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Installs dependency NPM packages (inside a Workspace).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dataform.v1alpha2.InstallNpmPackagesResponse>
        installNpmPackages(com.google.cloud.dataform.v1alpha2.InstallNpmPackagesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInstallNpmPackagesMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Pulls Git commits from the Repository's remote into a Workspace.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        pullGitCommits(com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPullGitCommitsMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Pushes Git commits from a Workspace to the Repository's remote.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        pushGitCommits(com.google.cloud.dataform.v1alpha2.PushGitCommitsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPushGitCommitsMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Fetches Git statuses for the files in a Workspace.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dataform.v1alpha2.FetchFileGitStatusesResponse>
        fetchFileGitStatuses(
            com.google.cloud.dataform.v1alpha2.FetchFileGitStatusesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFetchFileGitStatusesMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Fetches Git ahead/behind against a remote branch.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dataform.v1alpha2.FetchGitAheadBehindResponse>
        fetchGitAheadBehind(com.google.cloud.dataform.v1alpha2.FetchGitAheadBehindRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFetchGitAheadBehindMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Applies a Git commit for uncommitted files in a Workspace.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        commitWorkspaceChanges(
            com.google.cloud.dataform.v1alpha2.CommitWorkspaceChangesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCommitWorkspaceChangesMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Performs a Git reset for uncommitted files in a Workspace.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        resetWorkspaceChanges(
            com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResetWorkspaceChangesMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Fetches Git diff for an uncommitted file in a Workspace.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dataform.v1alpha2.FetchFileDiffResponse>
        fetchFileDiff(com.google.cloud.dataform.v1alpha2.FetchFileDiffRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFetchFileDiffMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Returns the contents of a given Workspace directory.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dataform.v1alpha2.QueryDirectoryContentsResponse>
        queryDirectoryContents(
            com.google.cloud.dataform.v1alpha2.QueryDirectoryContentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryDirectoryContentsMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a directory inside a Workspace.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dataform.v1alpha2.MakeDirectoryResponse>
        makeDirectory(com.google.cloud.dataform.v1alpha2.MakeDirectoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMakeDirectoryMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a directory (inside a Workspace) and all of its contents.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        removeDirectory(com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveDirectoryMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Moves a directory (inside a Workspace), and all of its contents, to a new
     * location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dataform.v1alpha2.MoveDirectoryResponse>
        moveDirectory(com.google.cloud.dataform.v1alpha2.MoveDirectoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveDirectoryMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Returns the contents of a file (inside a Workspace).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dataform.v1alpha2.ReadFileResponse>
        readFile(com.google.cloud.dataform.v1alpha2.ReadFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadFileMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a file (inside a Workspace).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> removeFile(
        com.google.cloud.dataform.v1alpha2.RemoveFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveFileMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Moves a file (inside a Workspace) to a new location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dataform.v1alpha2.MoveFileResponse>
        moveFile(com.google.cloud.dataform.v1alpha2.MoveFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveFileMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Writes to a file (inside a Workspace).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dataform.v1alpha2.WriteFileResponse>
        writeFile(com.google.cloud.dataform.v1alpha2.WriteFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWriteFileMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists CompilationResults in a given Repository.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dataform.v1alpha2.ListCompilationResultsResponse>
        listCompilationResults(
            com.google.cloud.dataform.v1alpha2.ListCompilationResultsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCompilationResultsMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Fetches a single CompilationResult.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dataform.v1alpha2.CompilationResult>
        getCompilationResult(
            com.google.cloud.dataform.v1alpha2.GetCompilationResultRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCompilationResultMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a new CompilationResult in a given project and location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dataform.v1alpha2.CompilationResult>
        createCompilationResult(
            com.google.cloud.dataform.v1alpha2.CreateCompilationResultRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCompilationResultMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Returns CompilationResultActions in a given CompilationResult.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dataform.v1alpha2.QueryCompilationResultActionsResponse>
        queryCompilationResultActions(
            com.google.cloud.dataform.v1alpha2.QueryCompilationResultActionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryCompilationResultActionsMethod(), getCallOptions()),
          request);
    }

    /**
     *
     *
     * <pre>
     * Lists WorkflowInvocations in a given Repository.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dataform.v1alpha2.ListWorkflowInvocationsResponse>
        listWorkflowInvocations(
            com.google.cloud.dataform.v1alpha2.ListWorkflowInvocationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListWorkflowInvocationsMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Fetches a single WorkflowInvocation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dataform.v1alpha2.WorkflowInvocation>
        getWorkflowInvocation(
            com.google.cloud.dataform.v1alpha2.GetWorkflowInvocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWorkflowInvocationMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a new WorkflowInvocation in a given Repository.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dataform.v1alpha2.WorkflowInvocation>
        createWorkflowInvocation(
            com.google.cloud.dataform.v1alpha2.CreateWorkflowInvocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateWorkflowInvocationMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a single WorkflowInvocation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        deleteWorkflowInvocation(
            com.google.cloud.dataform.v1alpha2.DeleteWorkflowInvocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteWorkflowInvocationMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Requests cancellation of a running WorkflowInvocation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        cancelWorkflowInvocation(
            com.google.cloud.dataform.v1alpha2.CancelWorkflowInvocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelWorkflowInvocationMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Returns WorkflowInvocationActions in a given WorkflowInvocation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.dataform.v1alpha2.QueryWorkflowInvocationActionsResponse>
        queryWorkflowInvocationActions(
            com.google.cloud.dataform.v1alpha2.QueryWorkflowInvocationActionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryWorkflowInvocationActionsMethod(), getCallOptions()),
          request);
    }
  }

  private static final int METHODID_LIST_REPOSITORIES = 0;
  private static final int METHODID_GET_REPOSITORY = 1;
  private static final int METHODID_CREATE_REPOSITORY = 2;
  private static final int METHODID_UPDATE_REPOSITORY = 3;
  private static final int METHODID_DELETE_REPOSITORY = 4;
  private static final int METHODID_FETCH_REMOTE_BRANCHES = 5;
  private static final int METHODID_LIST_WORKSPACES = 6;
  private static final int METHODID_GET_WORKSPACE = 7;
  private static final int METHODID_CREATE_WORKSPACE = 8;
  private static final int METHODID_DELETE_WORKSPACE = 9;
  private static final int METHODID_INSTALL_NPM_PACKAGES = 10;
  private static final int METHODID_PULL_GIT_COMMITS = 11;
  private static final int METHODID_PUSH_GIT_COMMITS = 12;
  private static final int METHODID_FETCH_FILE_GIT_STATUSES = 13;
  private static final int METHODID_FETCH_GIT_AHEAD_BEHIND = 14;
  private static final int METHODID_COMMIT_WORKSPACE_CHANGES = 15;
  private static final int METHODID_RESET_WORKSPACE_CHANGES = 16;
  private static final int METHODID_FETCH_FILE_DIFF = 17;
  private static final int METHODID_QUERY_DIRECTORY_CONTENTS = 18;
  private static final int METHODID_MAKE_DIRECTORY = 19;
  private static final int METHODID_REMOVE_DIRECTORY = 20;
  private static final int METHODID_MOVE_DIRECTORY = 21;
  private static final int METHODID_READ_FILE = 22;
  private static final int METHODID_REMOVE_FILE = 23;
  private static final int METHODID_MOVE_FILE = 24;
  private static final int METHODID_WRITE_FILE = 25;
  private static final int METHODID_LIST_COMPILATION_RESULTS = 26;
  private static final int METHODID_GET_COMPILATION_RESULT = 27;
  private static final int METHODID_CREATE_COMPILATION_RESULT = 28;
  private static final int METHODID_QUERY_COMPILATION_RESULT_ACTIONS = 29;
  private static final int METHODID_LIST_WORKFLOW_INVOCATIONS = 30;
  private static final int METHODID_GET_WORKFLOW_INVOCATION = 31;
  private static final int METHODID_CREATE_WORKFLOW_INVOCATION = 32;
  private static final int METHODID_DELETE_WORKFLOW_INVOCATION = 33;
  private static final int METHODID_CANCEL_WORKFLOW_INVOCATION = 34;
  private static final int METHODID_QUERY_WORKFLOW_INVOCATION_ACTIONS = 35;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_REPOSITORIES:
          serviceImpl.listRepositories(
              (com.google.cloud.dataform.v1alpha2.ListRepositoriesRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.dataform.v1alpha2.ListRepositoriesResponse>)
                  responseObserver);
          break;
        case METHODID_GET_REPOSITORY:
          serviceImpl.getRepository(
              (com.google.cloud.dataform.v1alpha2.GetRepositoryRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.Repository>)
                  responseObserver);
          break;
        case METHODID_CREATE_REPOSITORY:
          serviceImpl.createRepository(
              (com.google.cloud.dataform.v1alpha2.CreateRepositoryRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.Repository>)
                  responseObserver);
          break;
        case METHODID_UPDATE_REPOSITORY:
          serviceImpl.updateRepository(
              (com.google.cloud.dataform.v1alpha2.UpdateRepositoryRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.Repository>)
                  responseObserver);
          break;
        case METHODID_DELETE_REPOSITORY:
          serviceImpl.deleteRepository(
              (com.google.cloud.dataform.v1alpha2.DeleteRepositoryRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_FETCH_REMOTE_BRANCHES:
          serviceImpl.fetchRemoteBranches(
              (com.google.cloud.dataform.v1alpha2.FetchRemoteBranchesRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.dataform.v1alpha2.FetchRemoteBranchesResponse>)
                  responseObserver);
          break;
        case METHODID_LIST_WORKSPACES:
          serviceImpl.listWorkspaces(
              (com.google.cloud.dataform.v1alpha2.ListWorkspacesRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.dataform.v1alpha2.ListWorkspacesResponse>)
                  responseObserver);
          break;
        case METHODID_GET_WORKSPACE:
          serviceImpl.getWorkspace(
              (com.google.cloud.dataform.v1alpha2.GetWorkspaceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.Workspace>)
                  responseObserver);
          break;
        case METHODID_CREATE_WORKSPACE:
          serviceImpl.createWorkspace(
              (com.google.cloud.dataform.v1alpha2.CreateWorkspaceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.Workspace>)
                  responseObserver);
          break;
        case METHODID_DELETE_WORKSPACE:
          serviceImpl.deleteWorkspace(
              (com.google.cloud.dataform.v1alpha2.DeleteWorkspaceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_INSTALL_NPM_PACKAGES:
          serviceImpl.installNpmPackages(
              (com.google.cloud.dataform.v1alpha2.InstallNpmPackagesRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.dataform.v1alpha2.InstallNpmPackagesResponse>)
                  responseObserver);
          break;
        case METHODID_PULL_GIT_COMMITS:
          serviceImpl.pullGitCommits(
              (com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_PUSH_GIT_COMMITS:
          serviceImpl.pushGitCommits(
              (com.google.cloud.dataform.v1alpha2.PushGitCommitsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_FETCH_FILE_GIT_STATUSES:
          serviceImpl.fetchFileGitStatuses(
              (com.google.cloud.dataform.v1alpha2.FetchFileGitStatusesRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.dataform.v1alpha2.FetchFileGitStatusesResponse>)
                  responseObserver);
          break;
        case METHODID_FETCH_GIT_AHEAD_BEHIND:
          serviceImpl.fetchGitAheadBehind(
              (com.google.cloud.dataform.v1alpha2.FetchGitAheadBehindRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.dataform.v1alpha2.FetchGitAheadBehindResponse>)
                  responseObserver);
          break;
        case METHODID_COMMIT_WORKSPACE_CHANGES:
          serviceImpl.commitWorkspaceChanges(
              (com.google.cloud.dataform.v1alpha2.CommitWorkspaceChangesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_RESET_WORKSPACE_CHANGES:
          serviceImpl.resetWorkspaceChanges(
              (com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_FETCH_FILE_DIFF:
          serviceImpl.fetchFileDiff(
              (com.google.cloud.dataform.v1alpha2.FetchFileDiffRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.dataform.v1alpha2.FetchFileDiffResponse>)
                  responseObserver);
          break;
        case METHODID_QUERY_DIRECTORY_CONTENTS:
          serviceImpl.queryDirectoryContents(
              (com.google.cloud.dataform.v1alpha2.QueryDirectoryContentsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.dataform.v1alpha2.QueryDirectoryContentsResponse>)
                  responseObserver);
          break;
        case METHODID_MAKE_DIRECTORY:
          serviceImpl.makeDirectory(
              (com.google.cloud.dataform.v1alpha2.MakeDirectoryRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.dataform.v1alpha2.MakeDirectoryResponse>)
                  responseObserver);
          break;
        case METHODID_REMOVE_DIRECTORY:
          serviceImpl.removeDirectory(
              (com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_MOVE_DIRECTORY:
          serviceImpl.moveDirectory(
              (com.google.cloud.dataform.v1alpha2.MoveDirectoryRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.dataform.v1alpha2.MoveDirectoryResponse>)
                  responseObserver);
          break;
        case METHODID_READ_FILE:
          serviceImpl.readFile(
              (com.google.cloud.dataform.v1alpha2.ReadFileRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.ReadFileResponse>)
                  responseObserver);
          break;
        case METHODID_REMOVE_FILE:
          serviceImpl.removeFile(
              (com.google.cloud.dataform.v1alpha2.RemoveFileRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_MOVE_FILE:
          serviceImpl.moveFile(
              (com.google.cloud.dataform.v1alpha2.MoveFileRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.MoveFileResponse>)
                  responseObserver);
          break;
        case METHODID_WRITE_FILE:
          serviceImpl.writeFile(
              (com.google.cloud.dataform.v1alpha2.WriteFileRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.WriteFileResponse>)
                  responseObserver);
          break;
        case METHODID_LIST_COMPILATION_RESULTS:
          serviceImpl.listCompilationResults(
              (com.google.cloud.dataform.v1alpha2.ListCompilationResultsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.dataform.v1alpha2.ListCompilationResultsResponse>)
                  responseObserver);
          break;
        case METHODID_GET_COMPILATION_RESULT:
          serviceImpl.getCompilationResult(
              (com.google.cloud.dataform.v1alpha2.GetCompilationResultRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.CompilationResult>)
                  responseObserver);
          break;
        case METHODID_CREATE_COMPILATION_RESULT:
          serviceImpl.createCompilationResult(
              (com.google.cloud.dataform.v1alpha2.CreateCompilationResultRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.CompilationResult>)
                  responseObserver);
          break;
        case METHODID_QUERY_COMPILATION_RESULT_ACTIONS:
          serviceImpl.queryCompilationResultActions(
              (com.google.cloud.dataform.v1alpha2.QueryCompilationResultActionsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.dataform.v1alpha2.QueryCompilationResultActionsResponse>)
                  responseObserver);
          break;
        case METHODID_LIST_WORKFLOW_INVOCATIONS:
          serviceImpl.listWorkflowInvocations(
              (com.google.cloud.dataform.v1alpha2.ListWorkflowInvocationsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.dataform.v1alpha2.ListWorkflowInvocationsResponse>)
                  responseObserver);
          break;
        case METHODID_GET_WORKFLOW_INVOCATION:
          serviceImpl.getWorkflowInvocation(
              (com.google.cloud.dataform.v1alpha2.GetWorkflowInvocationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.WorkflowInvocation>)
                  responseObserver);
          break;
        case METHODID_CREATE_WORKFLOW_INVOCATION:
          serviceImpl.createWorkflowInvocation(
              (com.google.cloud.dataform.v1alpha2.CreateWorkflowInvocationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.dataform.v1alpha2.WorkflowInvocation>)
                  responseObserver);
          break;
        case METHODID_DELETE_WORKFLOW_INVOCATION:
          serviceImpl.deleteWorkflowInvocation(
              (com.google.cloud.dataform.v1alpha2.DeleteWorkflowInvocationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CANCEL_WORKFLOW_INVOCATION:
          serviceImpl.cancelWorkflowInvocation(
              (com.google.cloud.dataform.v1alpha2.CancelWorkflowInvocationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_QUERY_WORKFLOW_INVOCATION_ACTIONS:
          serviceImpl.queryWorkflowInvocationActions(
              (com.google.cloud.dataform.v1alpha2.QueryWorkflowInvocationActionsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.dataform.v1alpha2.QueryWorkflowInvocationActionsResponse>)
                  responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
            getListRepositoriesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.dataform.v1alpha2.ListRepositoriesRequest,
                    com.google.cloud.dataform.v1alpha2.ListRepositoriesResponse>(
                    service, METHODID_LIST_REPOSITORIES)))
        .addMethod(
            getGetRepositoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.dataform.v1alpha2.GetRepositoryRequest,
                    com.google.cloud.dataform.v1alpha2.Repository>(
                    service, METHODID_GET_REPOSITORY)))
        .addMethod(
            getCreateRepositoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.dataform.v1alpha2.CreateRepositoryRequest,
                    com.google.cloud.dataform.v1alpha2.Repository>(
                    service, METHODID_CREATE_REPOSITORY)))
        .addMethod(
            getUpdateRepositoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.dataform.v1alpha2.UpdateRepositoryRequest,
                    com.google.cloud.dataform.v1alpha2.Repository>(
                    service, METHODID_UPDATE_REPOSITORY)))
        .addMethod(
            getDeleteRepositoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.dataform.v1alpha2.DeleteRepositoryRequest,
                    com.google.protobuf.Empty>(service, METHODID_DELETE_REPOSITORY)))
        .addMethod(
            getFetchRemoteBranchesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.dataform.v1alpha2.FetchRemoteBranchesRequest,
                    com.google.cloud.dataform.v1alpha2.FetchRemoteBranchesResponse>(
                    service, METHODID_FETCH_REMOTE_BRANCHES)))
        .addMethod(
            getListWorkspacesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.dataform.v1alpha2.ListWorkspacesRequest,
                    com.google.cloud.dataform.v1alpha2.ListWorkspacesResponse>(
                    service, METHODID_LIST_WORKSPACES)))
        .addMethod(
            getGetWorkspaceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.dataform.v1alpha2.GetWorkspaceRequest,
                    com.google.cloud.dataform.v1alpha2.Workspace>(service, METHODID_GET_WORKSPACE)))
        .addMethod(
            getCreateWorkspaceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.dataform.v1alpha2.CreateWorkspaceRequest,
                    com.google.cloud.dataform.v1alpha2.Workspace>(
                    service, METHODID_CREATE_WORKSPACE)))
        .addMethod(
            getDeleteWorkspaceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.dataform.v1alpha2.DeleteWorkspaceRequest,
                    com.google.protobuf.Empty>(service, METHODID_DELETE_WORKSPACE)))
        .addMethod(
            getInstallNpmPackagesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.dataform.v1alpha2.InstallNpmPackagesRequest,
                    com.google.cloud.dataform.v1alpha2.InstallNpmPackagesResponse>(
                    service, METHODID_INSTALL_NPM_PACKAGES)))
        .addMethod(
            getPullGitCommitsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.dataform.v1alpha2.PullGitCommitsRequest,
                    com.google.protobuf.Empty>(service, METHODID_PULL_GIT_COMMITS)))
        .addMethod(
            getPushGitCommitsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.dataform.v1alpha2.PushGitCommitsRequest,
                    com.google.protobuf.Empty>(service, METHODID_PUSH_GIT_COMMITS)))
        .addMethod(
            getFetchFileGitStatusesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.dataform.v1alpha2.FetchFileGitStatusesRequest,
                    com.google.cloud.dataform.v1alpha2.FetchFileGitStatusesResponse>(
                    service, METHODID_FETCH_FILE_GIT_STATUSES)))
        .addMethod(
            getFetchGitAheadBehindMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.dataform.v1alpha2.FetchGitAheadBehindRequest,
                    com.google.cloud.dataform.v1alpha2.FetchGitAheadBehindResponse>(
                    service, METHODID_FETCH_GIT_AHEAD_BEHIND)))
        .addMethod(
            getCommitWorkspaceChangesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.dataform.v1alpha2.CommitWorkspaceChangesRequest,
                    com.google.protobuf.Empty>(service, METHODID_COMMIT_WORKSPACE_CHANGES)))
        .addMethod(
            getResetWorkspaceChangesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.dataform.v1alpha2.ResetWorkspaceChangesRequest,
                    com.google.protobuf.Empty>(service, METHODID_RESET_WORKSPACE_CHANGES)))
        .addMethod(
            getFetchFileDiffMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.dataform.v1alpha2.FetchFileDiffRequest,
                    com.google.cloud.dataform.v1alpha2.FetchFileDiffResponse>(
                    service, METHODID_FETCH_FILE_DIFF)))
        .addMethod(
            getQueryDirectoryContentsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.dataform.v1alpha2.QueryDirectoryContentsRequest,
                    com.google.cloud.dataform.v1alpha2.QueryDirectoryContentsResponse>(
                    service, METHODID_QUERY_DIRECTORY_CONTENTS)))
        .addMethod(
            getMakeDirectoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.dataform.v1alpha2.MakeDirectoryRequest,
                    com.google.cloud.dataform.v1alpha2.MakeDirectoryResponse>(
                    service, METHODID_MAKE_DIRECTORY)))
        .addMethod(
            getRemoveDirectoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.dataform.v1alpha2.RemoveDirectoryRequest,
                    com.google.protobuf.Empty>(service, METHODID_REMOVE_DIRECTORY)))
        .addMethod(
            getMoveDirectoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.dataform.v1alpha2.MoveDirectoryRequest,
                    com.google.cloud.dataform.v1alpha2.MoveDirectoryResponse>(
                    service, METHODID_MOVE_DIRECTORY)))
        .addMethod(
            getReadFileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.dataform.v1alpha2.ReadFileRequest,
                    com.google.cloud.dataform.v1alpha2.ReadFileResponse>(
                    service, METHODID_READ_FILE)))
        .addMethod(
            getRemoveFileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.dataform.v1alpha2.RemoveFileRequest,
                    com.google.protobuf.Empty>(service, METHODID_REMOVE_FILE)))
        .addMethod(
            getMoveFileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.dataform.v1alpha2.MoveFileRequest,
                    com.google.cloud.dataform.v1alpha2.MoveFileResponse>(
                    service, METHODID_MOVE_FILE)))
        .addMethod(
            getWriteFileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.dataform.v1alpha2.WriteFileRequest,
                    com.google.cloud.dataform.v1alpha2.WriteFileResponse>(
                    service, METHODID_WRITE_FILE)))
        .addMethod(
            getListCompilationResultsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.dataform.v1alpha2.ListCompilationResultsRequest,
                    com.google.cloud.dataform.v1alpha2.ListCompilationResultsResponse>(
                    service, METHODID_LIST_COMPILATION_RESULTS)))
        .addMethod(
            getGetCompilationResultMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.dataform.v1alpha2.GetCompilationResultRequest,
                    com.google.cloud.dataform.v1alpha2.CompilationResult>(
                    service, METHODID_GET_COMPILATION_RESULT)))
        .addMethod(
            getCreateCompilationResultMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.dataform.v1alpha2.CreateCompilationResultRequest,
                    com.google.cloud.dataform.v1alpha2.CompilationResult>(
                    service, METHODID_CREATE_COMPILATION_RESULT)))
        .addMethod(
            getQueryCompilationResultActionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.dataform.v1alpha2.QueryCompilationResultActionsRequest,
                    com.google.cloud.dataform.v1alpha2.QueryCompilationResultActionsResponse>(
                    service, METHODID_QUERY_COMPILATION_RESULT_ACTIONS)))
        .addMethod(
            getListWorkflowInvocationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.dataform.v1alpha2.ListWorkflowInvocationsRequest,
                    com.google.cloud.dataform.v1alpha2.ListWorkflowInvocationsResponse>(
                    service, METHODID_LIST_WORKFLOW_INVOCATIONS)))
        .addMethod(
            getGetWorkflowInvocationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.dataform.v1alpha2.GetWorkflowInvocationRequest,
                    com.google.cloud.dataform.v1alpha2.WorkflowInvocation>(
                    service, METHODID_GET_WORKFLOW_INVOCATION)))
        .addMethod(
            getCreateWorkflowInvocationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.dataform.v1alpha2.CreateWorkflowInvocationRequest,
                    com.google.cloud.dataform.v1alpha2.WorkflowInvocation>(
                    service, METHODID_CREATE_WORKFLOW_INVOCATION)))
        .addMethod(
            getDeleteWorkflowInvocationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.dataform.v1alpha2.DeleteWorkflowInvocationRequest,
                    com.google.protobuf.Empty>(service, METHODID_DELETE_WORKFLOW_INVOCATION)))
        .addMethod(
            getCancelWorkflowInvocationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.dataform.v1alpha2.CancelWorkflowInvocationRequest,
                    com.google.protobuf.Empty>(service, METHODID_CANCEL_WORKFLOW_INVOCATION)))
        .addMethod(
            getQueryWorkflowInvocationActionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.dataform.v1alpha2.QueryWorkflowInvocationActionsRequest,
                    com.google.cloud.dataform.v1alpha2.QueryWorkflowInvocationActionsResponse>(
                    service, METHODID_QUERY_WORKFLOW_INVOCATION_ACTIONS)))
        .build();
  }

  private abstract static class DataformBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataformBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.dataform.v1alpha2.DataformProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Dataform");
    }
  }

  private static final class DataformFileDescriptorSupplier extends DataformBaseDescriptorSupplier {
    DataformFileDescriptorSupplier() {}
  }

  private static final class DataformMethodDescriptorSupplier extends DataformBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DataformMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DataformGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new DataformFileDescriptorSupplier())
                      .addMethod(getListRepositoriesMethod())
                      .addMethod(getGetRepositoryMethod())
                      .addMethod(getCreateRepositoryMethod())
                      .addMethod(getUpdateRepositoryMethod())
                      .addMethod(getDeleteRepositoryMethod())
                      .addMethod(getFetchRemoteBranchesMethod())
                      .addMethod(getListWorkspacesMethod())
                      .addMethod(getGetWorkspaceMethod())
                      .addMethod(getCreateWorkspaceMethod())
                      .addMethod(getDeleteWorkspaceMethod())
                      .addMethod(getInstallNpmPackagesMethod())
                      .addMethod(getPullGitCommitsMethod())
                      .addMethod(getPushGitCommitsMethod())
                      .addMethod(getFetchFileGitStatusesMethod())
                      .addMethod(getFetchGitAheadBehindMethod())
                      .addMethod(getCommitWorkspaceChangesMethod())
                      .addMethod(getResetWorkspaceChangesMethod())
                      .addMethod(getFetchFileDiffMethod())
                      .addMethod(getQueryDirectoryContentsMethod())
                      .addMethod(getMakeDirectoryMethod())
                      .addMethod(getRemoveDirectoryMethod())
                      .addMethod(getMoveDirectoryMethod())
                      .addMethod(getReadFileMethod())
                      .addMethod(getRemoveFileMethod())
                      .addMethod(getMoveFileMethod())
                      .addMethod(getWriteFileMethod())
                      .addMethod(getListCompilationResultsMethod())
                      .addMethod(getGetCompilationResultMethod())
                      .addMethod(getCreateCompilationResultMethod())
                      .addMethod(getQueryCompilationResultActionsMethod())
                      .addMethod(getListWorkflowInvocationsMethod())
                      .addMethod(getGetWorkflowInvocationMethod())
                      .addMethod(getCreateWorkflowInvocationMethod())
                      .addMethod(getDeleteWorkflowInvocationMethod())
                      .addMethod(getCancelWorkflowInvocationMethod())
                      .addMethod(getQueryWorkflowInvocationActionsMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
