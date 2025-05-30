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

package com.google.cloud.discoveryengine.v1.stub;

import static com.google.cloud.discoveryengine.v1.DocumentServiceClient.ListDocumentsPagedResponse;

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.discoveryengine.v1.CreateDocumentRequest;
import com.google.cloud.discoveryengine.v1.DeleteDocumentRequest;
import com.google.cloud.discoveryengine.v1.Document;
import com.google.cloud.discoveryengine.v1.GetDocumentRequest;
import com.google.cloud.discoveryengine.v1.ImportDocumentsMetadata;
import com.google.cloud.discoveryengine.v1.ImportDocumentsRequest;
import com.google.cloud.discoveryengine.v1.ImportDocumentsResponse;
import com.google.cloud.discoveryengine.v1.ListDocumentsRequest;
import com.google.cloud.discoveryengine.v1.ListDocumentsResponse;
import com.google.cloud.discoveryengine.v1.PurgeDocumentsMetadata;
import com.google.cloud.discoveryengine.v1.PurgeDocumentsRequest;
import com.google.cloud.discoveryengine.v1.PurgeDocumentsResponse;
import com.google.cloud.discoveryengine.v1.UpdateDocumentRequest;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the DocumentService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class DocumentServiceStub implements BackgroundResource {

  public OperationsStub getOperationsStub() {
    return null;
  }

  public com.google.api.gax.httpjson.longrunning.stub.OperationsStub getHttpJsonOperationsStub() {
    return null;
  }

  public UnaryCallable<GetDocumentRequest, Document> getDocumentCallable() {
    throw new UnsupportedOperationException("Not implemented: getDocumentCallable()");
  }

  public UnaryCallable<ListDocumentsRequest, ListDocumentsPagedResponse>
      listDocumentsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listDocumentsPagedCallable()");
  }

  public UnaryCallable<ListDocumentsRequest, ListDocumentsResponse> listDocumentsCallable() {
    throw new UnsupportedOperationException("Not implemented: listDocumentsCallable()");
  }

  public UnaryCallable<CreateDocumentRequest, Document> createDocumentCallable() {
    throw new UnsupportedOperationException("Not implemented: createDocumentCallable()");
  }

  public UnaryCallable<UpdateDocumentRequest, Document> updateDocumentCallable() {
    throw new UnsupportedOperationException("Not implemented: updateDocumentCallable()");
  }

  public UnaryCallable<DeleteDocumentRequest, Empty> deleteDocumentCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteDocumentCallable()");
  }

  public OperationCallable<ImportDocumentsRequest, ImportDocumentsResponse, ImportDocumentsMetadata>
      importDocumentsOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: importDocumentsOperationCallable()");
  }

  public UnaryCallable<ImportDocumentsRequest, Operation> importDocumentsCallable() {
    throw new UnsupportedOperationException("Not implemented: importDocumentsCallable()");
  }

  public OperationCallable<PurgeDocumentsRequest, PurgeDocumentsResponse, PurgeDocumentsMetadata>
      purgeDocumentsOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: purgeDocumentsOperationCallable()");
  }

  public UnaryCallable<PurgeDocumentsRequest, Operation> purgeDocumentsCallable() {
    throw new UnsupportedOperationException("Not implemented: purgeDocumentsCallable()");
  }

  @Override
  public abstract void close();
}
