package com.encora.taskmanagement.config;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.security.web.csrf.CsrfTokenRequestHandler;
import org.springframework.security.web.csrf.XorCsrfTokenRequestAttributeHandler;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class SecurityConfiguration {
  private static final String[] WHITELISTED_URLS = {
    "/csrf", "/task-management-service/v1/signup/**", "/task-management-service/v1/login/**"
  };

  //  private final AuthenticationFilter authenticationFilter;

  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    CookieCsrfTokenRepository tokenRepository = CookieCsrfTokenRepository.withHttpOnlyFalse();
    XorCsrfTokenRequestAttributeHandler delegate = new XorCsrfTokenRequestAttributeHandler();
    // set the name of the attribute the CsrfToken will be populated on
    delegate.setCsrfRequestAttributeName("_csrf");
    // Use only the handle() method of XorCsrfTokenRequestAttributeHandler and the
    // default implementation of resolveCsrfTokenValue() from CsrfTokenRequestHandler
    CsrfTokenRequestHandler requestHandler = delegate::handle;
    http.csrf(
            (csrf) ->
                csrf.csrfTokenRepository(tokenRepository)
                    .csrfTokenRequestHandler(requestHandler)
                    .ignoringRequestMatchers(WHITELISTED_URLS) // Disable CSRF for signup/login
            )
        .authorizeHttpRequests(
            (requests) ->
                requests.requestMatchers(WHITELISTED_URLS).permitAll().anyRequest().authenticated())
        .sessionManagement(
            session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
    // ... other security configurations
    ;
    return http.build();
  }
}
