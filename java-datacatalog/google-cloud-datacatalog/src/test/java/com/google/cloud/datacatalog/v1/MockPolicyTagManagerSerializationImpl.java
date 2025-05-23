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

package com.google.cloud.datacatalog.v1;

import com.google.api.core.BetaApi;
import com.google.cloud.datacatalog.v1.PolicyTagManagerSerializationGrpc.PolicyTagManagerSerializationImplBase;
import com.google.protobuf.AbstractMessage;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.annotation.Generated;

@BetaApi
@Generated("by gapic-generator-java")
public class MockPolicyTagManagerSerializationImpl extends PolicyTagManagerSerializationImplBase {
  private List<AbstractMessage> requests;
  private Queue<Object> responses;

  public MockPolicyTagManagerSerializationImpl() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  public List<AbstractMessage> getRequests() {
    return requests;
  }

  public void addResponse(AbstractMessage response) {
    responses.add(response);
  }

  public void setResponses(List<AbstractMessage> responses) {
    this.responses = new LinkedList<Object>(responses);
  }

  public void addException(Exception exception) {
    responses.add(exception);
  }

  public void reset() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  @Override
  public void replaceTaxonomy(
      ReplaceTaxonomyRequest request, StreamObserver<Taxonomy> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Taxonomy) {
      requests.add(request);
      responseObserver.onNext(((Taxonomy) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method ReplaceTaxonomy, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Taxonomy.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void importTaxonomies(
      ImportTaxonomiesRequest request, StreamObserver<ImportTaxonomiesResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof ImportTaxonomiesResponse) {
      requests.add(request);
      responseObserver.onNext(((ImportTaxonomiesResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method ImportTaxonomies, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  ImportTaxonomiesResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void exportTaxonomies(
      ExportTaxonomiesRequest request, StreamObserver<ExportTaxonomiesResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof ExportTaxonomiesResponse) {
      requests.add(request);
      responseObserver.onNext(((ExportTaxonomiesResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method ExportTaxonomies, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  ExportTaxonomiesResponse.class.getName(),
                  Exception.class.getName())));
    }
  }
}
