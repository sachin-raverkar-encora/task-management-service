package com.encora.taskmanagement;

/** The user not found exception. */
public class UserNotFoundException extends RuntimeException {

  /**
   * Instantiates a new user not found exception.
   *
   * @param message the message
   */
  public UserNotFoundException(String message) {
    super(message);
  }
}
