package com.encora.taskmanagement.repository;

import com.encora.taskmanagement.domain.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/** The task repository. */
@Repository
public interface TaskRepository extends MongoRepository<Task, String> {}
