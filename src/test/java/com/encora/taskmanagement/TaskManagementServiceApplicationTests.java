package com.encora.taskmanagement;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles(value = {"test"})
// @ImportAutoConfiguration(
//    exclude = {
//      DataSourceAutoConfiguration.class,
//      MongoAutoConfiguration.class,
//      MongoDataAutoConfiguration.class
//    })
class TaskManagementServiceApplicationTests {

  @Test
  void contextLoads() {}
}
