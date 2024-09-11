package com.encora.taskmanagement.controller;

import com.encora.taskmanagement.api.AuthenticationApi;
import com.encora.taskmanagement.domain.User;
import com.encora.taskmanagement.mapper.UserMapper;
import com.encora.taskmanagement.model.LoginRequest;
import com.encora.taskmanagement.model.LoginResponse;
import com.encora.taskmanagement.model.UserDetails;
import com.encora.taskmanagement.service.UserService;
import jakarta.validation.Valid;
import java.net.URI;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task-management-service/v1")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class UserAuthenticationController implements AuthenticationApi {

  private final UserService userService;

  @Override
  public ResponseEntity<LoginResponse> loginPost(@Valid LoginRequest loginRequest) {
    final User user = userService.loginUser(loginRequest);
    final UserDetails userDetails = UserMapper.INSTANCE.toUserDetails(user);
    final LoginResponse loginResponse = new LoginResponse(userDetails);
    return ResponseEntity.ok().location(URI.create("/users/" + user.getId())).body(loginResponse);
  }
}
