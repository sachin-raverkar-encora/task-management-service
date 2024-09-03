package com.encora.taskmanagement.service;

import com.encora.taskmanagement.DuplicateUserException;
import com.encora.taskmanagement.domain.User;
import com.encora.taskmanagement.mapper.UserMapper;
import com.encora.taskmanagement.model.SignupRequest;
import com.encora.taskmanagement.repository.UserRepository;
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

  public User createUser(SignupRequest signupRequest) {
    if (userRepository.existsByEmail(signupRequest.getEmail())) {
      throw new DuplicateUserException("User already exists.");
    }
    final User newUser = UserMapper.INSTANCE.toUser(signupRequest);
    return userRepository.save(newUser);
  }
}
