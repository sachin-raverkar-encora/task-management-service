package com.encora.taskmanagement.model;

import java.net.URI;
import java.util.Objects;
import com.encora.taskmanagement.model.TaskStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * SearchTasksRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class SearchTasksRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  private String title;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dueDateFrom;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dueDateTo;

  @Valid
  private List<TaskStatus> status;

  private Integer page = 0;

  private Integer size = 10;

  @Valid
  private List<String> sort;

  public SearchTasksRequest title(String title) {
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

  public SearchTasksRequest dueDateFrom(OffsetDateTime dueDateFrom) {
    this.dueDateFrom = dueDateFrom;
    return this;
  }

  /**
   * Date of the task.
   * @return dueDateFrom
  */
  @Valid 
  @Schema(name = "dueDateFrom", example = "2024-12-28T15:30Z", description = "Date of the task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dueDateFrom")
  public OffsetDateTime getDueDateFrom() {
    return dueDateFrom;
  }

  public void setDueDateFrom(OffsetDateTime dueDateFrom) {
    this.dueDateFrom = dueDateFrom;
  }

  public SearchTasksRequest dueDateTo(OffsetDateTime dueDateTo) {
    this.dueDateTo = dueDateTo;
    return this;
  }

  /**
   * Date of the task.
   * @return dueDateTo
  */
  @Valid 
  @Schema(name = "dueDateTo", example = "2024-12-28T15:30Z", description = "Date of the task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dueDateTo")
  public OffsetDateTime getDueDateTo() {
    return dueDateTo;
  }

  public void setDueDateTo(OffsetDateTime dueDateTo) {
    this.dueDateTo = dueDateTo;
  }

  public SearchTasksRequest status(List<TaskStatus> status) {
    this.status = status;
    return this;
  }

  public SearchTasksRequest addStatusItem(TaskStatus statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<>();
    }
    this.status.add(statusItem);
    return this;
  }

  /**
   * Optional array of task statuses to filter by.
   * @return status
  */
  @Valid 
  @Schema(name = "status", description = "Optional array of task statuses to filter by.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public List<TaskStatus> getStatus() {
    return status;
  }

  public void setStatus(List<TaskStatus> status) {
    this.status = status;
  }

  public SearchTasksRequest page(Integer page) {
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

  public SearchTasksRequest size(Integer size) {
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

  public SearchTasksRequest sort(List<String> sort) {
    this.sort = sort;
    return this;
  }

  public SearchTasksRequest addSortItem(String sortItem) {
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
    SearchTasksRequest searchTasksRequest = (SearchTasksRequest) o;
    return Objects.equals(this.title, searchTasksRequest.title) &&
        Objects.equals(this.dueDateFrom, searchTasksRequest.dueDateFrom) &&
        Objects.equals(this.dueDateTo, searchTasksRequest.dueDateTo) &&
        Objects.equals(this.status, searchTasksRequest.status) &&
        Objects.equals(this.page, searchTasksRequest.page) &&
        Objects.equals(this.size, searchTasksRequest.size) &&
        Objects.equals(this.sort, searchTasksRequest.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, dueDateFrom, dueDateTo, status, page, size, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchTasksRequest {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    dueDateFrom: ").append(toIndentedString(dueDateFrom)).append("\n");
    sb.append("    dueDateTo: ").append(toIndentedString(dueDateTo)).append("\n");
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

