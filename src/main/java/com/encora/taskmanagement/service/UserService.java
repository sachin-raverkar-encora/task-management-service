package com.encora.taskmanagement.service;

import com.encora.taskmanagement.DuplicateUserException;
import com.encora.taskmanagement.UserNotFoundException;
import com.encora.taskmanagement.domain.User;
import com.encora.taskmanagement.mapper.UserMapper;
import com.encora.taskmanagement.model.LoginRequest;
import com.encora.taskmanagement.model.SignupRequest;
import com.encora.taskmanagement.repository.UserRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** The User service. */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class UserService {
  private final UserRepository userRepository;

  /**
   * Create a new user.
   *
   * @param signupRequest the signup request
   * @return the user
   */
public User createUser(@Valid SignupRequest signupRequest) {
    if (userRepository.existsByEmail(signupRequest.getEmail())) {
      throw new DuplicateUserException("User already exists.");
    }
    final User newUser = UserMapper.INSTANCE.toUser(signupRequest);
    return userRepository.save(newUser);
  }

  /**
   * Validates user login details.
   *
   * @param loginRequest the login request
   * @return the user
   */
  public User loginUser(@Valid LoginRequest loginRequest) {
    final User user =
        userRepository.getUserByEmailAndPassword(
            loginRequest.getEmail(), loginRequest.getPassword());
    if (user == null) {
      throw new UserNotFoundException("Either email or password is incorrect.");
    }
    return user;
  }
}
