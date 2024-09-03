package com.encora.taskmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/** The Task management service application. */
@SpringBootApplication
@EntityScan
@EnableMongoRepositories
public class TaskManagementServiceApplication {

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    SpringApplication.run(TaskManagementServiceApplication.class, args);
  }
}
