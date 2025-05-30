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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/webhook.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public final class WebhookProto {
  private WebhookProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_GenericWebService_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_GenericWebService_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_GenericWebService_RequestHeadersEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_GenericWebService_RequestHeadersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_GenericWebService_ParameterMappingEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_GenericWebService_ParameterMappingEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_ServiceDirectoryConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_ServiceDirectoryConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListWebhooksRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListWebhooksRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListWebhooksResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListWebhooksResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetWebhookRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetWebhookRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_CreateWebhookRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_CreateWebhookRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateWebhookRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateWebhookRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteWebhookRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteWebhookRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_FulfillmentInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_FulfillmentInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_IntentInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_IntentInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_IntentInfo_IntentParameterValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_IntentInfo_IntentParameterValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_IntentInfo_ParametersEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_IntentInfo_ParametersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_SentimentAnalysisResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_SentimentAnalysisResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookResponse_FulfillmentResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookResponse_FulfillmentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_PageInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_PageInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_PageInfo_FormInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_PageInfo_FormInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_PageInfo_FormInfo_ParameterInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_PageInfo_FormInfo_ParameterInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_SessionInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_SessionInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_SessionInfo_ParametersEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_SessionInfo_ParametersEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/dialogflow/cx/v3beta1/web"
          + "hook.proto\022\"google.cloud.dialogflow.cx.v"
          + "3beta1\032\034google/api/annotations.proto\032\027go"
          + "ogle/api/client.proto\032\037google/api/field_"
          + "behavior.proto\032\031google/api/resource.prot"
          + "o\0329google/cloud/dialogflow/cx/v3beta1/re"
          + "sponse_message.proto\032\036google/protobuf/du"
          + "ration.proto\032\033google/protobuf/empty.prot"
          + "o\032 google/protobuf/field_mask.proto\032\034goo"
          + "gle/protobuf/struct.proto\"\325\013\n\007Webhook\022\014\n"
          + "\004name\030\001 \001(\t\022\032\n\014display_name\030\002 \001(\tB\004\342A\001\002\022"
          + "\\\n\023generic_web_service\030\004 \001(\0132=.google.cl"
          + "oud.dialogflow.cx.v3beta1.Webhook.Generi"
          + "cWebServiceH\000\022_\n\021service_directory\030\007 \001(\013"
          + "2B.google.cloud.dialogflow.cx.v3beta1.We"
          + "bhook.ServiceDirectoryConfigH\000\022*\n\007timeou"
          + "t\030\006 \001(\0132\031.google.protobuf.Duration\022\020\n\010di"
          + "sabled\030\005 \001(\010\032\352\006\n\021GenericWebService\022\021\n\003ur"
          + "i\030\001 \001(\tB\004\342A\001\002\022\024\n\010username\030\002 \001(\tB\002\030\001\022\024\n\010p"
          + "assword\030\003 \001(\tB\002\030\001\022j\n\017request_headers\030\004 \003"
          + "(\0132Q.google.cloud.dialogflow.cx.v3beta1."
          + "Webhook.GenericWebService.RequestHeaders"
          + "Entry\022\036\n\020allowed_ca_certs\030\005 \003(\014B\004\342A\001\001\022e\n"
          + "\014webhook_type\030\006 \001(\0162I.google.cloud.dialo"
          + "gflow.cx.v3beta1.Webhook.GenericWebServi"
          + "ce.WebhookTypeB\004\342A\001\001\022c\n\013http_method\030\007 \001("
          + "\0162H.google.cloud.dialogflow.cx.v3beta1.W"
          + "ebhook.GenericWebService.HttpMethodB\004\342A\001"
          + "\001\022\032\n\014request_body\030\010 \001(\tB\004\342A\001\001\022t\n\021paramet"
          + "er_mapping\030\t \003(\0132S.google.cloud.dialogfl"
          + "ow.cx.v3beta1.Webhook.GenericWebService."
          + "ParameterMappingEntryB\004\342A\001\001\0325\n\023RequestHe"
          + "adersEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\002"
          + "8\001\0327\n\025ParameterMappingEntry\022\013\n\003key\030\001 \001(\t"
          + "\022\r\n\005value\030\002 \001(\t:\0028\001\"G\n\013WebhookType\022\034\n\030WE"
          + "BHOOK_TYPE_UNSPECIFIED\020\000\022\014\n\010STANDARD\020\001\022\014"
          + "\n\010FLEXIBLE\020\002\"s\n\nHttpMethod\022\033\n\027HTTP_METHO"
          + "D_UNSPECIFIED\020\000\022\010\n\004POST\020\001\022\007\n\003GET\020\002\022\010\n\004HE"
          + "AD\020\003\022\007\n\003PUT\020\004\022\n\n\006DELETE\020\005\022\t\n\005PATCH\020\006\022\013\n\007"
          + "OPTIONS\020\007\032\267\001\n\026ServiceDirectoryConfig\022A\n\007"
          + "service\030\001 \001(\tB0\342A\001\002\372A)\n\'servicedirectory"
          + ".googleapis.com/Service\022Z\n\023generic_web_s"
          + "ervice\030\002 \001(\0132=.google.cloud.dialogflow.c"
          + "x.v3beta1.Webhook.GenericWebService:q\352An"
          + "\n!dialogflow.googleapis.com/Webhook\022Ipro"
          + "jects/{project}/locations/{location}/age"
          + "nts/{agent}/webhooks/{webhook}B\t\n\007webhoo"
          + "k\"x\n\023ListWebhooksRequest\022:\n\006parent\030\001 \001(\t"
          + "B*\342A\001\002\372A#\022!dialogflow.googleapis.com/Web"
          + "hook\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 "
          + "\001(\t\"n\n\024ListWebhooksResponse\022=\n\010webhooks\030"
          + "\001 \003(\0132+.google.cloud.dialogflow.cx.v3bet"
          + "a1.Webhook\022\027\n\017next_page_token\030\002 \001(\t\"M\n\021G"
          + "etWebhookRequest\0228\n\004name\030\001 \001(\tB*\342A\001\002\372A#\n"
          + "!dialogflow.googleapis.com/Webhook\"\226\001\n\024C"
          + "reateWebhookRequest\022:\n\006parent\030\001 \001(\tB*\342A\001"
          + "\002\372A#\022!dialogflow.googleapis.com/Webhook\022"
          + "B\n\007webhook\030\002 \001(\0132+.google.cloud.dialogfl"
          + "ow.cx.v3beta1.WebhookB\004\342A\001\002\"\213\001\n\024UpdateWe"
          + "bhookRequest\022B\n\007webhook\030\001 \001(\0132+.google.c"
          + "loud.dialogflow.cx.v3beta1.WebhookB\004\342A\001\002"
          + "\022/\n\013update_mask\030\002 \001(\0132\032.google.protobuf."
          + "FieldMask\"_\n\024DeleteWebhookRequest\0228\n\004nam"
          + "e\030\001 \001(\tB*\342A\001\002\372A#\n!dialogflow.googleapis."
          + "com/Webhook\022\r\n\005force\030\002 \001(\010\"\251\n\n\016WebhookRe"
          + "quest\022!\n\031detect_intent_response_id\030\001 \001(\t"
          + "\022\016\n\004text\030\n \001(\tH\000\022?\n\016trigger_intent\030\013 \001(\t"
          + "B%\372A\"\n dialogflow.googleapis.com/IntentH"
          + "\000\022\024\n\ntranscript\030\014 \001(\tH\000\022\027\n\rtrigger_event"
          + "\030\016 \001(\tH\000\022\025\n\013dtmf_digits\030\021 \001(\tH\000\022\025\n\rlangu"
          + "age_code\030\017 \001(\t\022\\\n\020fulfillment_info\030\006 \001(\013"
          + "2B.google.cloud.dialogflow.cx.v3beta1.We"
          + "bhookRequest.FulfillmentInfo\022R\n\013intent_i"
          + "nfo\030\003 \001(\0132=.google.cloud.dialogflow.cx.v"
          + "3beta1.WebhookRequest.IntentInfo\022?\n\tpage"
          + "_info\030\004 \001(\0132,.google.cloud.dialogflow.cx"
          + ".v3beta1.PageInfo\022E\n\014session_info\030\005 \001(\0132"
          + "/.google.cloud.dialogflow.cx.v3beta1.Ses"
          + "sionInfo\022E\n\010messages\030\007 \003(\01323.google.clou"
          + "d.dialogflow.cx.v3beta1.ResponseMessage\022"
          + "(\n\007payload\030\010 \001(\0132\027.google.protobuf.Struc"
          + "t\022m\n\031sentiment_analysis_result\030\t \001(\0132J.g"
          + "oogle.cloud.dialogflow.cx.v3beta1.Webhoo"
          + "kRequest.SentimentAnalysisResult\032\036\n\017Fulf"
          + "illmentInfo\022\013\n\003tag\030\001 \001(\t\032\305\003\n\nIntentInfo\022"
          + "B\n\023last_matched_intent\030\001 \001(\tB%\372A\"\n dialo"
          + "gflow.googleapis.com/Intent\022\024\n\014display_n"
          + "ame\030\003 \001(\t\022a\n\nparameters\030\002 \003(\0132M.google.c"
          + "loud.dialogflow.cx.v3beta1.WebhookReques"
          + "t.IntentInfo.ParametersEntry\022\022\n\nconfiden"
          + "ce\030\004 \001(\002\032^\n\024IntentParameterValue\022\026\n\016orig"
          + "inal_value\030\001 \001(\t\022.\n\016resolved_value\030\002 \001(\013"
          + "2\026.google.protobuf.Value\032\205\001\n\017ParametersE"
          + "ntry\022\013\n\003key\030\001 \001(\t\022a\n\005value\030\002 \001(\0132R.googl"
          + "e.cloud.dialogflow.cx.v3beta1.WebhookReq"
          + "uest.IntentInfo.IntentParameterValue:\0028\001"
          + "\032;\n\027SentimentAnalysisResult\022\r\n\005score\030\001 \001"
          + "(\002\022\021\n\tmagnitude\030\002 \001(\002B\007\n\005query\"\310\005\n\017Webho"
          + "okResponse\022e\n\024fulfillment_response\030\001 \001(\013"
          + "2G.google.cloud.dialogflow.cx.v3beta1.We"
          + "bhookResponse.FulfillmentResponse\022?\n\tpag"
          + "e_info\030\002 \001(\0132,.google.cloud.dialogflow.c"
          + "x.v3beta1.PageInfo\022E\n\014session_info\030\003 \001(\013"
          + "2/.google.cloud.dialogflow.cx.v3beta1.Se"
          + "ssionInfo\022(\n\007payload\030\004 \001(\0132\027.google.prot"
          + "obuf.Struct\022:\n\013target_page\030\005 \001(\tB#\372A \n\036d"
          + "ialogflow.googleapis.com/PageH\000\022:\n\013targe"
          + "t_flow\030\006 \001(\tB#\372A \n\036dialogflow.googleapis"
          + ".com/FlowH\000\032\225\002\n\023FulfillmentResponse\022E\n\010m"
          + "essages\030\001 \003(\01323.google.cloud.dialogflow."
          + "cx.v3beta1.ResponseMessage\022m\n\016merge_beha"
          + "vior\030\002 \001(\0162U.google.cloud.dialogflow.cx."
          + "v3beta1.WebhookResponse.FulfillmentRespo"
          + "nse.MergeBehavior\"H\n\rMergeBehavior\022\036\n\032ME"
          + "RGE_BEHAVIOR_UNSPECIFIED\020\000\022\n\n\006APPEND\020\001\022\013"
          + "\n\007REPLACE\020\002B\014\n\ntransition\"\302\004\n\010PageInfo\0229"
          + "\n\014current_page\030\001 \001(\tB#\372A \n\036dialogflow.go"
          + "ogleapis.com/Page\022\024\n\014display_name\030\004 \001(\t\022"
          + "H\n\tform_info\030\003 \001(\01325.google.cloud.dialog"
          + "flow.cx.v3beta1.PageInfo.FormInfo\032\232\003\n\010Fo"
          + "rmInfo\022[\n\016parameter_info\030\002 \003(\0132C.google."
          + "cloud.dialogflow.cx.v3beta1.PageInfo.For"
          + "mInfo.ParameterInfo\032\260\002\n\rParameterInfo\022\024\n"
          + "\014display_name\030\001 \001(\t\022\020\n\010required\030\002 \001(\010\022a\n"
          + "\005state\030\003 \001(\0162R.google.cloud.dialogflow.c"
          + "x.v3beta1.PageInfo.FormInfo.ParameterInf"
          + "o.ParameterState\022%\n\005value\030\004 \001(\0132\026.google"
          + ".protobuf.Value\022\026\n\016just_collected\030\005 \001(\010\""
          + "U\n\016ParameterState\022\037\n\033PARAMETER_STATE_UNS"
          + "PECIFIED\020\000\022\t\n\005EMPTY\020\001\022\013\n\007INVALID\020\002\022\n\n\006FI"
          + "LLED\020\003\"\346\001\n\013SessionInfo\0227\n\007session\030\001 \001(\tB"
          + "&\372A#\n!dialogflow.googleapis.com/Session\022"
          + "S\n\nparameters\030\002 \003(\0132?.google.cloud.dialo"
          + "gflow.cx.v3beta1.SessionInfo.ParametersE"
          + "ntry\032I\n\017ParametersEntry\022\013\n\003key\030\001 \001(\t\022%\n\005"
          + "value\030\002 \001(\0132\026.google.protobuf.Value:\0028\0012"
          + "\375\010\n\010Webhooks\022\316\001\n\014ListWebhooks\0227.google.c"
          + "loud.dialogflow.cx.v3beta1.ListWebhooksR"
          + "equest\0328.google.cloud.dialogflow.cx.v3be"
          + "ta1.ListWebhooksResponse\"K\332A\006parent\202\323\344\223\002"
          + "<\022:/v3beta1/{parent=projects/*/locations"
          + "/*/agents/*}/webhooks\022\273\001\n\nGetWebhook\0225.g"
          + "oogle.cloud.dialogflow.cx.v3beta1.GetWeb"
          + "hookRequest\032+.google.cloud.dialogflow.cx"
          + ".v3beta1.Webhook\"I\332A\004name\202\323\344\223\002<\022:/v3beta"
          + "1/{name=projects/*/locations/*/agents/*/"
          + "webhooks/*}\022\324\001\n\rCreateWebhook\0228.google.c"
          + "loud.dialogflow.cx.v3beta1.CreateWebhook"
          + "Request\032+.google.cloud.dialogflow.cx.v3b"
          + "eta1.Webhook\"\\\332A\016parent,webhook\202\323\344\223\002E\":/"
          + "v3beta1/{parent=projects/*/locations/*/a"
          + "gents/*}/webhooks:\007webhook\022\341\001\n\rUpdateWeb"
          + "hook\0228.google.cloud.dialogflow.cx.v3beta"
          + "1.UpdateWebhookRequest\032+.google.cloud.di"
          + "alogflow.cx.v3beta1.Webhook\"i\332A\023webhook,"
          + "update_mask\202\323\344\223\002M2B/v3beta1/{webhook.nam"
          + "e=projects/*/locations/*/agents/*/webhoo"
          + "ks/*}:\007webhook\022\254\001\n\rDeleteWebhook\0228.googl"
          + "e.cloud.dialogflow.cx.v3beta1.DeleteWebh"
          + "ookRequest\032\026.google.protobuf.Empty\"I\332A\004n"
          + "ame\202\323\344\223\002<*:/v3beta1/{name=projects/*/loc"
          + "ations/*/agents/*/webhooks/*}\032x\312A\031dialog"
          + "flow.googleapis.com\322AYhttps://www.google"
          + "apis.com/auth/cloud-platform,https://www"
          + ".googleapis.com/auth/dialogflowB\305\002\n&com."
          + "google.cloud.dialogflow.cx.v3beta1B\014Webh"
          + "ookProtoP\001Z6cloud.google.com/go/dialogfl"
          + "ow/cx/apiv3beta1/cxpb;cxpb\370\001\001\242\002\002DF\252\002\"Goo"
          + "gle.Cloud.Dialogflow.Cx.V3Beta1\352\002&Google"
          + "::Cloud::Dialogflow::CX::V3beta1\352A|\n\'ser"
          + "vicedirectory.googleapis.com/Service\022Qpr"
          + "ojects/{project}/locations/{location}/na"
          + "mespaces/{namespace}/services/{service}b"
          + "\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dialogflow.cx.v3beta1.ResponseMessageProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "GenericWebService",
              "ServiceDirectory",
              "Timeout",
              "Disabled",
              "Webhook",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_GenericWebService_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_GenericWebService_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_GenericWebService_descriptor,
            new java.lang.String[] {
              "Uri",
              "Username",
              "Password",
              "RequestHeaders",
              "AllowedCaCerts",
              "WebhookType",
              "HttpMethod",
              "RequestBody",
              "ParameterMapping",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_GenericWebService_RequestHeadersEntry_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_GenericWebService_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_GenericWebService_RequestHeadersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_GenericWebService_RequestHeadersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_GenericWebService_ParameterMappingEntry_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_GenericWebService_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_GenericWebService_ParameterMappingEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_GenericWebService_ParameterMappingEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_ServiceDirectoryConfig_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_ServiceDirectoryConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Webhook_ServiceDirectoryConfig_descriptor,
            new java.lang.String[] {
              "Service", "GenericWebService",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListWebhooksRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListWebhooksRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ListWebhooksRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListWebhooksResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListWebhooksResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ListWebhooksResponse_descriptor,
            new java.lang.String[] {
              "Webhooks", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetWebhookRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetWebhookRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_GetWebhookRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateWebhookRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateWebhookRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_CreateWebhookRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Webhook",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateWebhookRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateWebhookRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateWebhookRequest_descriptor,
            new java.lang.String[] {
              "Webhook", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteWebhookRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteWebhookRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteWebhookRequest_descriptor,
            new java.lang.String[] {
              "Name", "Force",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_descriptor,
            new java.lang.String[] {
              "DetectIntentResponseId",
              "Text",
              "TriggerIntent",
              "Transcript",
              "TriggerEvent",
              "DtmfDigits",
              "LanguageCode",
              "FulfillmentInfo",
              "IntentInfo",
              "PageInfo",
              "SessionInfo",
              "Messages",
              "Payload",
              "SentimentAnalysisResult",
              "Query",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_FulfillmentInfo_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_FulfillmentInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_FulfillmentInfo_descriptor,
            new java.lang.String[] {
              "Tag",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_IntentInfo_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_IntentInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_IntentInfo_descriptor,
            new java.lang.String[] {
              "LastMatchedIntent", "DisplayName", "Parameters", "Confidence",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_IntentInfo_IntentParameterValue_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_IntentInfo_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_IntentInfo_IntentParameterValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_IntentInfo_IntentParameterValue_descriptor,
            new java.lang.String[] {
              "OriginalValue", "ResolvedValue",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_IntentInfo_ParametersEntry_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_IntentInfo_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_IntentInfo_ParametersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_IntentInfo_ParametersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_SentimentAnalysisResult_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_SentimentAnalysisResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookRequest_SentimentAnalysisResult_descriptor,
            new java.lang.String[] {
              "Score", "Magnitude",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookResponse_descriptor,
            new java.lang.String[] {
              "FulfillmentResponse",
              "PageInfo",
              "SessionInfo",
              "Payload",
              "TargetPage",
              "TargetFlow",
              "Transition",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookResponse_FulfillmentResponse_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookResponse_FulfillmentResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_WebhookResponse_FulfillmentResponse_descriptor,
            new java.lang.String[] {
              "Messages", "MergeBehavior",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_PageInfo_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_cx_v3beta1_PageInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_PageInfo_descriptor,
            new java.lang.String[] {
              "CurrentPage", "DisplayName", "FormInfo",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_PageInfo_FormInfo_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_PageInfo_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_PageInfo_FormInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_PageInfo_FormInfo_descriptor,
            new java.lang.String[] {
              "ParameterInfo",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_PageInfo_FormInfo_ParameterInfo_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_PageInfo_FormInfo_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_PageInfo_FormInfo_ParameterInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_PageInfo_FormInfo_ParameterInfo_descriptor,
            new java.lang.String[] {
              "DisplayName", "Required", "State", "Value", "JustCollected",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_SessionInfo_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_cx_v3beta1_SessionInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_SessionInfo_descriptor,
            new java.lang.String[] {
              "Session", "Parameters",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_SessionInfo_ParametersEntry_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_SessionInfo_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_SessionInfo_ParametersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_SessionInfo_ParametersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.cx.v3beta1.ResponseMessageProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
