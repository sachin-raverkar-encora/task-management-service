package com.encora.taskmanagement.web;

import com.encora.taskmanagement.DuplicateUserException;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

/** The type Global exception handler. */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

  /**
   * Handles duplicate user exception.
   *
   * @param ex duplicate user exception
   * @param request the request
   * @return the response entity
   */
  @ExceptionHandler(DuplicateUserException.class)
  public ResponseEntity<ProblemDetail> handleDuplicateUserException(
      DuplicateUserException ex, WebRequest request) {
    ProblemDetail problemDetail = ProblemDetail.forStatus(HttpStatus.CONFLICT);
    problemDetail.setType(URI.create("/signup"));
    problemDetail.setTitle("Duplicate User Error");
    problemDetail.setDetail(ex.getMessage());
    return new ResponseEntity<>(problemDetail, HttpStatus.CONFLICT);
  }

  /**
   * Handle all uncaught exceptions.
   *
   * @param ex general exception
   * @param request the request
   * @return the response entity
   */
  @ExceptionHandler(Exception.class)
  public ResponseEntity<?> handleAllExceptions(Exception ex, WebRequest request) {
    ProblemDetail problemDetail = ProblemDetail.forStatus(HttpStatus.INTERNAL_SERVER_ERROR);
    problemDetail.setTitle("Internal Server Error");
    problemDetail.setDetail(ex.getMessage());
    return new ResponseEntity<>(problemDetail, HttpStatus.INTERNAL_SERVER_ERROR);
  }

  /**
   * Handles method argument not valid exception.
   *
   * @param ex method argument not valid exception
   * @param request the request
   * @return the response entity
   */
  @ExceptionHandler(MethodArgumentNotValidException.class)
  public ResponseEntity<?> handleMethodArgumentNotValid(
      MethodArgumentNotValidException ex, WebRequest request) {
    // Get a list of validation errors
    List<String> errors =
        ex.getBindingResult().getFieldErrors().stream()
            .map(DefaultMessageSourceResolvable::getDefaultMessage)
            .collect(Collectors.toList());

    // Create a custom ProblemDetail with the validation error messages
    ProblemDetail problemDetail = ProblemDetail.forStatus(HttpStatus.BAD_REQUEST);
    problemDetail.setDetail("Validation errors: " + String.join(", ", errors));
    problemDetail.setInstance(URI.create(request.getContextPath()));

    return new ResponseEntity<>(problemDetail, HttpStatusCode.valueOf(400));
  }

  /**
   * Handles constraint violation exception.
   *
   * @param ex constraint violation exception
   * @param request the request
   * @return the response entity
   */
  @ExceptionHandler(ConstraintViolationException.class)
  public ResponseEntity<ProblemDetail> handleConstraintViolationException(
      ConstraintViolationException ex, WebRequest request) {

    // Get a list of validation errors
    List<String> errors =
        ex.getConstraintViolations().stream()
            .map(ConstraintViolation::getMessage)
            .collect(Collectors.toList());

    // Create a custom ProblemDetail with the validation error messages
    ProblemDetail problemDetail = ProblemDetail.forStatus(HttpStatus.BAD_REQUEST);
    problemDetail.setDetail("Validation errors: " + String.join(", ", errors));
    problemDetail.setInstance(URI.create(request.getContextPath()));

    return new ResponseEntity<>(problemDetail, HttpStatusCode.valueOf(400));
  }
}
