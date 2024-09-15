package com.encora.taskmanagement.model;

import java.net.URI;
import java.util.Objects;
import com.encora.taskmanagement.model.TaskStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SearchTasksResponseInner
 */

@JsonTypeName("SearchTasksResponse_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class SearchTasksResponseInner implements Serializable {

  private static final long serialVersionUID = 1L;

  private Integer id;

  private String title;

  private String description;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dueDate;

  private TaskStatus status;

  private Integer page = 0;

  private Integer size = 10;

  @Valid
  private List<String> sort;

  public SearchTasksResponseInner id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Id of the task.
   * @return id
  */
  
  @Schema(name = "id", example = "101", description = "Id of the task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SearchTasksResponseInner title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Summary of the task.
   * @return title
  */
  
  @Schema(name = "title", example = "Send email to ABC customer.", description = "Summary of the task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public SearchTasksResponseInner description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Details of the task.
   * @return description
  */
  
  @Schema(name = "description", example = "Send email to ABC customer immediately informing them to process the pending payments within two days.", description = "Details of the task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SearchTasksResponseInner dueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * Date of the task.
   * @return dueDate
  */
  @Valid 
  @Schema(name = "dueDate", example = "2024-12-28T15:30Z", description = "Date of the task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dueDate")
  public OffsetDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public SearchTasksResponseInner status(TaskStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public TaskStatus getStatus() {
    return status;
  }

  public void setStatus(TaskStatus status) {
    this.status = status;
  }

  public SearchTasksResponseInner page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Page number (0-based)
   * @return page
  */
  
  @Schema(name = "page", description = "Page number (0-based)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("page")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public SearchTasksResponseInner size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Page size (number of records per page)
   * @return size
  */
  
  @Schema(name = "size", description = "Page size (number of records per page)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public SearchTasksResponseInner sort(List<String> sort) {
    this.sort = sort;
    return this;
  }

  public SearchTasksResponseInner addSortItem(String sortItem) {
    if (this.sort == null) {
      this.sort = new ArrayList<>();
    }
    this.sort.add(sortItem);
    return this;
  }

  /**
   * Get sort
   * @return sort
  */
  
  @Schema(name = "sort", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sort")
  public List<String> getSort() {
    return sort;
  }

  public void setSort(List<String> sort) {
    this.sort = sort;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchTasksResponseInner searchTasksResponseInner = (SearchTasksResponseInner) o;
    return Objects.equals(this.id, searchTasksResponseInner.id) &&
        Objects.equals(this.title, searchTasksResponseInner.title) &&
        Objects.equals(this.description, searchTasksResponseInner.description) &&
        Objects.equals(this.dueDate, searchTasksResponseInner.dueDate) &&
        Objects.equals(this.status, searchTasksResponseInner.status) &&
        Objects.equals(this.page, searchTasksResponseInner.page) &&
        Objects.equals(this.size, searchTasksResponseInner.size) &&
        Objects.equals(this.sort, searchTasksResponseInner.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, dueDate, status, page, size, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchTasksResponseInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

