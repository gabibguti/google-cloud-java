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

/**
 * A client to BigQuery Migration API
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>======================= MigrationServiceClient =======================
 *
 * <p>Service Description: Service to handle EDW migrations.
 *
 * <p>Sample for MigrationServiceClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (MigrationServiceClient migrationServiceClient = MigrationServiceClient.create()) {
 *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
 *   MigrationWorkflow migrationWorkflow = MigrationWorkflow.newBuilder().build();
 *   MigrationWorkflow response =
 *       migrationServiceClient.createMigrationWorkflow(parent, migrationWorkflow);
 * }
 * }</pre>
 *
 * <p>======================= SqlTranslationServiceClient =======================
 *
 * <p>Service Description: Provides other SQL dialects to GoogleSQL translation operations.
 *
 * <p>Sample for SqlTranslationServiceClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (SqlTranslationServiceClient sqlTranslationServiceClient =
 *     SqlTranslationServiceClient.create()) {
 *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
 *   TranslateQueryRequest.SqlTranslationSourceDialect sourceDialect =
 *       TranslateQueryRequest.SqlTranslationSourceDialect.forNumber(0);
 *   String query = "query107944136";
 *   TranslateQueryResponse response =
 *       sqlTranslationServiceClient.translateQuery(parent, sourceDialect, query);
 * }
 * }</pre>
 */
@Generated("by gapic-generator-java")
package com.google.cloud.bigquery.migration.v2alpha;

import javax.annotation.Generated;
