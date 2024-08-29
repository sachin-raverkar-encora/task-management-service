package com.encora.taskmanagement.config;

import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;

@Configuration
public class MongoConfig {
  @Bean
  public MongoCustomConversions mongoCustomConversions() {
    return new MongoCustomConversions(
        List.of(
            // ... any custom converters you might need
            ));
  }

  @Bean
  public MongoTemplate mongoTemplate(MongoDatabaseFactory databaseFactory) {
    return new MongoTemplate(databaseFactory);
  }
}
