package com.encora.taskmanagement.domain;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Getter
@Setter
public class User {
  @Id private String id;

  @Email(message = "User's email address (must be unique)")
  private String email;

  @NotBlank
  @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")
  @Size(min = 8)
  @Pattern(
      regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$",
      message =
          "User's password (at least 8 characters, one uppercase, one lowercase, one number, and"
              + " one special character)")
  private String password;

  @NotBlank(message = "User's display name (alphabets and spaces only)")
  private String displayName;

  @NotBlank(message = "User's first name (alphabets only)")
  private String firstName;

  @NotBlank(message = "User's first name (alphabets only)")
  private String lastName;
}
