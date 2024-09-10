package com.encora.taskmanagement.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry
        .addMapping("/**") // Allow requests for all paths
        .allowedOrigins("http://localhost:5173") // Allow your React development server
        .allowedMethods("GET", "POST", "PUT", "DELETE") // Allow common HTTP methods
        .allowedHeaders(
            "*"); // Allow all headers (you might want to be more specific in production)
  }
}
