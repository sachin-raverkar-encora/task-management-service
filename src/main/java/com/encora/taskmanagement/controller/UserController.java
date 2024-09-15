package com.encora.taskmanagement.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task-management-service/v1/tasks")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class UserController {}
