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

package com.google.cloud.retail.v2alpha;

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
public class ModelName implements ResourceName {
  private static final PathTemplate PROJECT_LOCATION_CATALOG_MODEL =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/locations/{location}/catalogs/{catalog}/models/{model}");
  private volatile Map<String, String> fieldValuesMap;
  private final String project;
  private final String location;
  private final String catalog;
  private final String model;

  @Deprecated
  protected ModelName() {
    project = null;
    location = null;
    catalog = null;
    model = null;
  }

  private ModelName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    location = Preconditions.checkNotNull(builder.getLocation());
    catalog = Preconditions.checkNotNull(builder.getCatalog());
    model = Preconditions.checkNotNull(builder.getModel());
  }

  public String getProject() {
    return project;
  }

  public String getLocation() {
    return location;
  }

  public String getCatalog() {
    return catalog;
  }

  public String getModel() {
    return model;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static ModelName of(String project, String location, String catalog, String model) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setCatalog(catalog)
        .setModel(model)
        .build();
  }

  public static String format(String project, String location, String catalog, String model) {
    return newBuilder()
        .setProject(project)
        .setLocation(location)
        .setCatalog(catalog)
        .setModel(model)
        .build()
        .toString();
  }

  public static ModelName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PROJECT_LOCATION_CATALOG_MODEL.validatedMatch(
            formattedString, "ModelName.parse: formattedString not in valid format");
    return of(
        matchMap.get("project"),
        matchMap.get("location"),
        matchMap.get("catalog"),
        matchMap.get("model"));
  }

  public static List<ModelName> parseList(List<String> formattedStrings) {
    List<ModelName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<ModelName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (ModelName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PROJECT_LOCATION_CATALOG_MODEL.matches(formattedString);
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
          if (location != null) {
            fieldMapBuilder.put("location", location);
          }
          if (catalog != null) {
            fieldMapBuilder.put("catalog", catalog);
          }
          if (model != null) {
            fieldMapBuilder.put("model", model);
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
    return PROJECT_LOCATION_CATALOG_MODEL.instantiate(
        "project", project, "location", location, "catalog", catalog, "model", model);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      ModelName that = ((ModelName) o);
      return Objects.equals(this.project, that.project)
          && Objects.equals(this.location, that.location)
          && Objects.equals(this.catalog, that.catalog)
          && Objects.equals(this.model, that.model);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(project);
    h *= 1000003;
    h ^= Objects.hashCode(location);
    h *= 1000003;
    h ^= Objects.hashCode(catalog);
    h *= 1000003;
    h ^= Objects.hashCode(model);
    return h;
  }

  /** Builder for projects/{project}/locations/{location}/catalogs/{catalog}/models/{model}. */
  public static class Builder {
    private String project;
    private String location;
    private String catalog;
    private String model;

    protected Builder() {}

    public String getProject() {
      return project;
    }

    public String getLocation() {
      return location;
    }

    public String getCatalog() {
      return catalog;
    }

    public String getModel() {
      return model;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setLocation(String location) {
      this.location = location;
      return this;
    }

    public Builder setCatalog(String catalog) {
      this.catalog = catalog;
      return this;
    }

    public Builder setModel(String model) {
      this.model = model;
      return this;
    }

    private Builder(ModelName modelName) {
      this.project = modelName.project;
      this.location = modelName.location;
      this.catalog = modelName.catalog;
      this.model = modelName.model;
    }

    public ModelName build() {
      return new ModelName(this);
    }
  }
}
