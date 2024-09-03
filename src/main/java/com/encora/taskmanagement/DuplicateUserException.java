package com.encora.taskmanagement;

/** The Duplicate user exception. */
public class DuplicateUserException extends RuntimeException {

  /**
   * Instantiates a new Duplicate user exception.
   *
   * @param message the message
   */
  public DuplicateUserException(String message) {
    super(message);
  }
}
