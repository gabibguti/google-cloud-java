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

package com.google.cloud.channel.v1.samples;

// [START cloudchannel_v1_generated_CloudChannelService_ChangeOffer_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.channel.v1.ChangeOfferRequest;
import com.google.cloud.channel.v1.CloudChannelServiceClient;
import com.google.cloud.channel.v1.OfferName;
import com.google.cloud.channel.v1.Parameter;
import com.google.longrunning.Operation;
import java.util.ArrayList;

public class AsyncChangeOffer {

  public static void main(String[] args) throws Exception {
    asyncChangeOffer();
  }

  public static void asyncChangeOffer() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (CloudChannelServiceClient cloudChannelServiceClient = CloudChannelServiceClient.create()) {
      ChangeOfferRequest request =
          ChangeOfferRequest.newBuilder()
              .setName("name3373707")
              .setOffer(OfferName.of("[ACCOUNT]", "[OFFER]").toString())
              .addAllParameters(new ArrayList<Parameter>())
              .setPurchaseOrderId("purchaseOrderId2029917384")
              .setRequestId("requestId693933066")
              .setBillingAccount("billingAccount708726578")
              .build();
      ApiFuture<Operation> future =
          cloudChannelServiceClient.changeOfferCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END cloudchannel_v1_generated_CloudChannelService_ChangeOffer_async]
