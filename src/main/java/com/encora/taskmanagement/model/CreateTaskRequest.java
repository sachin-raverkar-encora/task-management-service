package com.encora.taskmanagement.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * CreateTaskRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class CreateTaskRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  private String title;

  private String description;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dueDate;

  public CreateTaskRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateTaskRequest(String title, String description, OffsetDateTime dueDate) {
    this.title = title;
    this.description = description;
    this.dueDate = dueDate;
  }

  public CreateTaskRequest title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Summary of the task.
   * @return title
  */
  @NotNull 
  @Schema(name = "title", example = "Send email to ABC customer.", description = "Summary of the task.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CreateTaskRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Details of the task.
   * @return description
  */
  @NotNull 
  @Schema(name = "description", example = "Send email to ABC customer immediately informing them to process the pending payments within two days.", description = "Details of the task.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateTaskRequest dueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * Date of the task.
   * @return dueDate
  */
  @NotNull @Valid 
  @Schema(name = "dueDate", example = "2024-12-28T15:30Z", description = "Date of the task.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dueDate")
  public OffsetDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTaskRequest createTaskRequest = (CreateTaskRequest) o;
    return Objects.equals(this.title, createTaskRequest.title) &&
        Objects.equals(this.description, createTaskRequest.description) &&
        Objects.equals(this.dueDate, createTaskRequest.dueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, dueDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTaskRequest {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
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

