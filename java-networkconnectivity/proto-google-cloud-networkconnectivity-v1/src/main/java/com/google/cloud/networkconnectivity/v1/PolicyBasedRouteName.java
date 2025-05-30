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

package com.google.cloud.networkconnectivity.v1;

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
@Generated("by gapic-generator-java")
public class PolicyBasedRouteName implements ResourceName {
  private static final PathTemplate PROJECT_POLICY_BASED_ROUTE =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/locations/global/PolicyBasedRoutes/{policy_based_route}");
  private volatile Map<String, String> fieldValuesMap;
  private final String project;
  private final String policyBasedRoute;

  @Deprecated
  protected PolicyBasedRouteName() {
    project = null;
    policyBasedRoute = null;
  }

  private PolicyBasedRouteName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    policyBasedRoute = Preconditions.checkNotNull(builder.getPolicyBasedRoute());
  }

  public String getProject() {
    return project;
  }

  public String getPolicyBasedRoute() {
    return policyBasedRoute;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static PolicyBasedRouteName of(String project, String policyBasedRoute) {
    return newBuilder().setProject(project).setPolicyBasedRoute(policyBasedRoute).build();
  }

  public static String format(String project, String policyBasedRoute) {
    return newBuilder()
        .setProject(project)
        .setPolicyBasedRoute(policyBasedRoute)
        .build()
        .toString();
  }

  public static PolicyBasedRouteName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PROJECT_POLICY_BASED_ROUTE.validatedMatch(
            formattedString, "PolicyBasedRouteName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("policy_based_route"));
  }

  public static List<PolicyBasedRouteName> parseList(List<String> formattedStrings) {
    List<PolicyBasedRouteName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<PolicyBasedRouteName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (PolicyBasedRouteName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PROJECT_POLICY_BASED_ROUTE.matches(formattedString);
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          if (project != null) {
            fieldMapBuilder.put("project", project);
          }
          if (policyBasedRoute != null) {
            fieldMapBuilder.put("policy_based_route", policyBasedRoute);
          }
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return PROJECT_POLICY_BASED_ROUTE.instantiate(
        "project", project, "policy_based_route", policyBasedRoute);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      PolicyBasedRouteName that = ((PolicyBasedRouteName) o);
      return Objects.equals(this.project, that.project)
          && Objects.equals(this.policyBasedRoute, that.policyBasedRoute);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(project);
    h *= 1000003;
    h ^= Objects.hashCode(policyBasedRoute);
    return h;
  }

  /** Builder for projects/{project}/locations/global/PolicyBasedRoutes/{policy_based_route}. */
  public static class Builder {
    private String project;
    private String policyBasedRoute;

    protected Builder() {}

    public String getProject() {
      return project;
    }

    public String getPolicyBasedRoute() {
      return policyBasedRoute;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setPolicyBasedRoute(String policyBasedRoute) {
      this.policyBasedRoute = policyBasedRoute;
      return this;
    }

    private Builder(PolicyBasedRouteName policyBasedRouteName) {
      this.project = policyBasedRouteName.project;
      this.policyBasedRoute = policyBasedRouteName.policyBasedRoute;
    }

    public PolicyBasedRouteName build() {
      return new PolicyBasedRouteName(this);
    }
  }
}
