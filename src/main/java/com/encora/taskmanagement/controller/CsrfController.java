package com.encora.taskmanagement.controller;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** The CSRF controller. */
@RestController
public class CsrfController {
  /**
   * Gets CSRF token.
   *
   * @param csrfToken the CSRF token
   * @return the CSRF token
   */
  @GetMapping("/csrf")
  public CsrfToken csrf(CsrfToken csrfToken) {
    return csrfToken;
  }
}
