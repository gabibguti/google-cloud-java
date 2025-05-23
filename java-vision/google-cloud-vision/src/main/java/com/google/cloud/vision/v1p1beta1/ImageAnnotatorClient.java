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

package com.google.cloud.vision.v1p1beta1;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.vision.v1p1beta1.stub.ImageAnnotatorStub;
import com.google.cloud.vision.v1p1beta1.stub.ImageAnnotatorStubSettings;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service that performs Google Cloud Vision API detection tasks over client
 * images, such as face, landmark, logo, label, and text detection. The ImageAnnotator service
 * returns detected entities from the images.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (ImageAnnotatorClient imageAnnotatorClient = ImageAnnotatorClient.create()) {
 *   List<AnnotateImageRequest> requests = new ArrayList<>();
 *   BatchAnnotateImagesResponse response = imageAnnotatorClient.batchAnnotateImages(requests);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the ImageAnnotatorClient object to clean up resources such
 * as threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of ImageAnnotatorSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * ImageAnnotatorSettings imageAnnotatorSettings =
 *     ImageAnnotatorSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ImageAnnotatorClient imageAnnotatorClient = ImageAnnotatorClient.create(imageAnnotatorSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * ImageAnnotatorSettings imageAnnotatorSettings =
 *     ImageAnnotatorSettings.newBuilder().setEndpoint(myEndpoint).build();
 * ImageAnnotatorClient imageAnnotatorClient = ImageAnnotatorClient.create(imageAnnotatorSettings);
 * }</pre>
 *
 * <p>To use REST (HTTP1.1/JSON) transport (instead of gRPC) for sending and receiving requests over
 * the wire:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * ImageAnnotatorSettings imageAnnotatorSettings =
 *     ImageAnnotatorSettings.newHttpJsonBuilder().build();
 * ImageAnnotatorClient imageAnnotatorClient = ImageAnnotatorClient.create(imageAnnotatorSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class ImageAnnotatorClient implements BackgroundResource {
  private final ImageAnnotatorSettings settings;
  private final ImageAnnotatorStub stub;

  /** Constructs an instance of ImageAnnotatorClient with default settings. */
  public static final ImageAnnotatorClient create() throws IOException {
    return create(ImageAnnotatorSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of ImageAnnotatorClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final ImageAnnotatorClient create(ImageAnnotatorSettings settings)
      throws IOException {
    return new ImageAnnotatorClient(settings);
  }

  /**
   * Constructs an instance of ImageAnnotatorClient, using the given stub for making calls. This is
   * for advanced usage - prefer using create(ImageAnnotatorSettings).
   */
  public static final ImageAnnotatorClient create(ImageAnnotatorStub stub) {
    return new ImageAnnotatorClient(stub);
  }

  /**
   * Constructs an instance of ImageAnnotatorClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected ImageAnnotatorClient(ImageAnnotatorSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((ImageAnnotatorStubSettings) settings.getStubSettings()).createStub();
  }

  protected ImageAnnotatorClient(ImageAnnotatorStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final ImageAnnotatorSettings getSettings() {
    return settings;
  }

  public ImageAnnotatorStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Run image detection and annotation for a batch of images.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ImageAnnotatorClient imageAnnotatorClient = ImageAnnotatorClient.create()) {
   *   List<AnnotateImageRequest> requests = new ArrayList<>();
   *   BatchAnnotateImagesResponse response = imageAnnotatorClient.batchAnnotateImages(requests);
   * }
   * }</pre>
   *
   * @param requests Required. Individual image annotation requests for this batch.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final BatchAnnotateImagesResponse batchAnnotateImages(
      List<AnnotateImageRequest> requests) {
    BatchAnnotateImagesRequest request =
        BatchAnnotateImagesRequest.newBuilder().addAllRequests(requests).build();
    return batchAnnotateImages(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Run image detection and annotation for a batch of images.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ImageAnnotatorClient imageAnnotatorClient = ImageAnnotatorClient.create()) {
   *   BatchAnnotateImagesRequest request =
   *       BatchAnnotateImagesRequest.newBuilder()
   *           .addAllRequests(new ArrayList<AnnotateImageRequest>())
   *           .build();
   *   BatchAnnotateImagesResponse response = imageAnnotatorClient.batchAnnotateImages(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final BatchAnnotateImagesResponse batchAnnotateImages(BatchAnnotateImagesRequest request) {
    return batchAnnotateImagesCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Run image detection and annotation for a batch of images.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ImageAnnotatorClient imageAnnotatorClient = ImageAnnotatorClient.create()) {
   *   BatchAnnotateImagesRequest request =
   *       BatchAnnotateImagesRequest.newBuilder()
   *           .addAllRequests(new ArrayList<AnnotateImageRequest>())
   *           .build();
   *   ApiFuture<BatchAnnotateImagesResponse> future =
   *       imageAnnotatorClient.batchAnnotateImagesCallable().futureCall(request);
   *   // Do something.
   *   BatchAnnotateImagesResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<BatchAnnotateImagesRequest, BatchAnnotateImagesResponse>
      batchAnnotateImagesCallable() {
    return stub.batchAnnotateImagesCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }
}
