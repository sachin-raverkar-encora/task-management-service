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
 * SignupRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class SignupRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  private String email;

  private String password;

  private String displayName;

  private String firstName;

  private String lastName;

  public SignupRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SignupRequest(String email, String password, String displayName, String firstName, String lastName) {
    this.email = email;
    this.password = password;
    this.displayName = displayName;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public SignupRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * User's email address (must be unique)
   * @return email
  */
  @NotNull @jakarta.validation.constraints.Email 
  @Schema(name = "email", example = "john.doe@example.com", description = "User's email address (must be unique)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public SignupRequest password(String password) {
    this.password = password;
    return this;
  }

  /**
   * User's password (at least 8 characters, one uppercase, one lowercase, one number, and one special character)
   * @return password
  */
  @NotNull @Size(min = 8) 
  @Schema(name = "password", example = "P@ssw0rd1", description = "User's password (at least 8 characters, one uppercase, one lowercase, one number, and one special character)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public SignupRequest displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * User's display name (alphabets and spaces only)
   * @return displayName
  */
  @NotNull @Size(max = 50) 
  @Schema(name = "displayName", example = "John Doe", description = "User's display name (alphabets and spaces only)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public SignupRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * User's first name (alphabets only)
   * @return firstName
  */
  @NotNull @Size(max = 50) 
  @Schema(name = "firstName", example = "John", description = "User's first name (alphabets only)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public SignupRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * User's last name (alphabets only)
   * @return lastName
  */
  @NotNull @Size(max = 50) 
  @Schema(name = "lastName", example = "Doe", description = "User's last name (alphabets only)", requiredMode = Schema.RequiredMode.REQUIRED)
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
    SignupRequest signupRequest = (SignupRequest) o;
    return Objects.equals(this.email, signupRequest.email) &&
        Objects.equals(this.password, signupRequest.password) &&
        Objects.equals(this.displayName, signupRequest.displayName) &&
        Objects.equals(this.firstName, signupRequest.firstName) &&
        Objects.equals(this.lastName, signupRequest.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, password, displayName, firstName, lastName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignupRequest {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append("*").append("\n");
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

