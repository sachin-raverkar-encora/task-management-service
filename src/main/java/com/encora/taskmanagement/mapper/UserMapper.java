package com.encora.taskmanagement.mapper;

import com.encora.taskmanagement.domain.User;
import com.encora.taskmanagement.model.SignupRequest;
import com.encora.taskmanagement.model.UserDetails;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/** The User mapper. */
@Mapper
public interface UserMapper {
  /** The constant INSTANCE. */
  UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

  /**
   * Maps sign up request to user.
   *
   * @param signupRequest the signup request
   * @return the user
   */
  @Mapping(target = "id", ignore = true)
  User toUser(SignupRequest signupRequest);

  /**
   * Maps user domain to user details.
   *
   * @param user the user
   * @return the user details
   */
  UserDetails toUserDetails(User user);
}
