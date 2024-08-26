package com.encora.taskmanagement.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
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
 * Definition of [RFC7807](https://tools.ietf.org/html/rfc7807) problem detail
 */

@Schema(name = "ProblemDetail", description = "Definition of [RFC7807](https://tools.ietf.org/html/rfc7807) problem detail")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class ProblemDetail implements Serializable {

  private static final long serialVersionUID = 1L;

  private String title;

  private String detail;

  private String type;

  private BigDecimal status;

  private String instance;

  public ProblemDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProblemDetail(String title, String detail) {
    this.title = title;
    this.detail = detail;
  }

  public ProblemDetail title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @NotNull 
  @Schema(name = "title", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ProblemDetail detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Get detail
   * @return detail
  */
  @NotNull 
  @Schema(name = "detail", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("detail")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public ProblemDetail type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ProblemDetail status(BigDecimal status) {
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
  public BigDecimal getStatus() {
    return status;
  }

  public void setStatus(BigDecimal status) {
    this.status = status;
  }

  public ProblemDetail instance(String instance) {
    this.instance = instance;
    return this;
  }

  /**
   * Get instance
   * @return instance
  */
  
  @Schema(name = "instance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instance")
  public String getInstance() {
    return instance;
  }

  public void setInstance(String instance) {
    this.instance = instance;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProblemDetail problemDetail = (ProblemDetail) o;
    return Objects.equals(this.title, problemDetail.title) &&
        Objects.equals(this.detail, problemDetail.detail) &&
        Objects.equals(this.type, problemDetail.type) &&
        Objects.equals(this.status, problemDetail.status) &&
        Objects.equals(this.instance, problemDetail.instance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, detail, type, status, instance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProblemDetail {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
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

