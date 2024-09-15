package com.encora.taskmanagement.model;

import java.net.URI;
import java.util.Objects;
import com.encora.taskmanagement.model.SearchTasksResponseContentInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * SearchTasksResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class SearchTasksResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  @Valid
  private List<@Valid SearchTasksResponseContentInner> content;

  private Integer page = 0;

  private Integer size = 10;

  private Integer totalElements;

  private Integer totalPages;

  private Boolean last;

  private Boolean first;

  private Integer numberOfElements;

  private Boolean empty;

  public SearchTasksResponse content(List<@Valid SearchTasksResponseContentInner> content) {
    this.content = content;
    return this;
  }

  public SearchTasksResponse addContentItem(SearchTasksResponseContentInner contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

  /**
   * Get content
   * @return content
  */
  @Valid 
  @Schema(name = "content", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("content")
  public List<@Valid SearchTasksResponseContentInner> getContent() {
    return content;
  }

  public void setContent(List<@Valid SearchTasksResponseContentInner> content) {
    this.content = content;
  }

  public SearchTasksResponse page(Integer page) {
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

  public SearchTasksResponse size(Integer size) {
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

  public SearchTasksResponse totalElements(Integer totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Total number of matching tasks
   * @return totalElements
  */
  
  @Schema(name = "totalElements", description = "Total number of matching tasks", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalElements")
  public Integer getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Integer totalElements) {
    this.totalElements = totalElements;
  }

  public SearchTasksResponse totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Total number of pages
   * @return totalPages
  */
  
  @Schema(name = "totalPages", description = "Total number of pages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalPages")
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public SearchTasksResponse last(Boolean last) {
    this.last = last;
    return this;
  }

  /**
   * True if this is the last page
   * @return last
  */
  
  @Schema(name = "last", description = "True if this is the last page", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last")
  public Boolean getLast() {
    return last;
  }

  public void setLast(Boolean last) {
    this.last = last;
  }

  public SearchTasksResponse first(Boolean first) {
    this.first = first;
    return this;
  }

  /**
   * True if this is the first page
   * @return first
  */
  
  @Schema(name = "first", description = "True if this is the first page", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("first")
  public Boolean getFirst() {
    return first;
  }

  public void setFirst(Boolean first) {
    this.first = first;
  }

  public SearchTasksResponse numberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
    return this;
  }

  /**
   * Number of elements on the current page
   * @return numberOfElements
  */
  
  @Schema(name = "numberOfElements", description = "Number of elements on the current page", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numberOfElements")
  public Integer getNumberOfElements() {
    return numberOfElements;
  }

  public void setNumberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
  }

  public SearchTasksResponse empty(Boolean empty) {
    this.empty = empty;
    return this;
  }

  /**
   * True if the content list is empty
   * @return empty
  */
  
  @Schema(name = "empty", description = "True if the content list is empty", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("empty")
  public Boolean getEmpty() {
    return empty;
  }

  public void setEmpty(Boolean empty) {
    this.empty = empty;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchTasksResponse searchTasksResponse = (SearchTasksResponse) o;
    return Objects.equals(this.content, searchTasksResponse.content) &&
        Objects.equals(this.page, searchTasksResponse.page) &&
        Objects.equals(this.size, searchTasksResponse.size) &&
        Objects.equals(this.totalElements, searchTasksResponse.totalElements) &&
        Objects.equals(this.totalPages, searchTasksResponse.totalPages) &&
        Objects.equals(this.last, searchTasksResponse.last) &&
        Objects.equals(this.first, searchTasksResponse.first) &&
        Objects.equals(this.numberOfElements, searchTasksResponse.numberOfElements) &&
        Objects.equals(this.empty, searchTasksResponse.empty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, page, size, totalElements, totalPages, last, first, numberOfElements, empty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchTasksResponse {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    numberOfElements: ").append(toIndentedString(numberOfElements)).append("\n");
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
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

