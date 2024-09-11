package com.encora.taskmanagement.repository;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import com.encora.taskmanagement.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/** The interface User repository. */
public interface UserRepository extends MongoRepository<User, String> {
  /**
   * Find user by email.
   *
   * @param email the email
   * @return the user
   */
User findByEmail(String email);

  /**
   * Exists by email boolean.
   *
   * @param email the email
   * @return the boolean
   */
boolean existsByEmail(String email);

  /**
   * Gets user by email and password.
   *
   * @param email the email
   * @param password the password
   * @return the user by email
   */
  User getUserByEmailAndPassword(@NotNull @Email String email, @NotNull String password);
}
