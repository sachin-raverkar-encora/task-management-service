package com.encora.taskmanagement.model;

import java.net.URI;
import java.util.Objects;
import com.encora.taskmanagement.model.TaskStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
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
 * SearchTasksResponseContentInner
 */

@JsonTypeName("SearchTasksResponse_content_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class SearchTasksResponseContentInner implements Serializable {

  private static final long serialVersionUID = 1L;

  private Integer id;

  private String title;

  private String description;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dueDate;

  private TaskStatus status;

  public SearchTasksResponseContentInner id(Integer id) {
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

  public SearchTasksResponseContentInner title(String title) {
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

  public SearchTasksResponseContentInner description(String description) {
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

  public SearchTasksResponseContentInner dueDate(OffsetDateTime dueDate) {
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

  public SearchTasksResponseContentInner status(TaskStatus status) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchTasksResponseContentInner searchTasksResponseContentInner = (SearchTasksResponseContentInner) o;
    return Objects.equals(this.id, searchTasksResponseContentInner.id) &&
        Objects.equals(this.title, searchTasksResponseContentInner.title) &&
        Objects.equals(this.description, searchTasksResponseContentInner.description) &&
        Objects.equals(this.dueDate, searchTasksResponseContentInner.dueDate) &&
        Objects.equals(this.status, searchTasksResponseContentInner.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, dueDate, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchTasksResponseContentInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

