package com.encora.taskmanagement.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * User details.
 */

@Schema(name = "UserDetails", description = "User details.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class UserDetails implements Serializable {

  private static final long serialVersionUID = 1L;

  private String email;

  private String displayName;

  private String firstName;

  private String lastName;

  public UserDetails email(String email) {
    this.email = email;
    return this;
  }

  /**
   * User's email address (must be unique)
   * @return email
  */
  @jakarta.validation.constraints.Email 
  @Schema(name = "email", example = "john.doe@example.com", description = "User's email address (must be unique)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserDetails displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * User's display name (alphabets and spaces only)
   * @return displayName
  */
  @Size(max = 50) 
  @Schema(name = "displayName", example = "John Doe", description = "User's display name (alphabets and spaces only)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public UserDetails firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * User's first name (alphabets only)
   * @return firstName
  */
  @Size(max = 50) 
  @Schema(name = "firstName", example = "John", description = "User's first name (alphabets only)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserDetails lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * User's last name (alphabets only)
   * @return lastName
  */
  @Size(max = 50) 
  @Schema(name = "lastName", example = "Doe", description = "User's last name (alphabets only)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDetails userDetails = (UserDetails) o;
    return Objects.equals(this.email, userDetails.email) &&
        Objects.equals(this.displayName, userDetails.displayName) &&
        Objects.equals(this.firstName, userDetails.firstName) &&
        Objects.equals(this.lastName, userDetails.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, displayName, firstName, lastName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDetails {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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

