package com.docs.invoice.spring.filter;

import lombok.SneakyThrows;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import javax.servlet.FilterChain;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.springframework.http.HttpHeaders.*;
import static org.springframework.http.HttpMethod.OPTIONS;

/**
 * Filter for CORS header addition.
 */
public class CorsHeaderFilter extends CorsFilter {

  /**
   * Custom CorsFilter.
   */
  public CorsHeaderFilter(
      final CorsConfigurationSource configSource) {
    super(configSource);
  }

  @SneakyThrows
  @Override
  protected void doFilterInternal(
      final HttpServletRequest request,
      final HttpServletResponse response,
      final FilterChain filterChain
  ) {
    response.setHeader(ACCESS_CONTROL_ALLOW_ORIGIN, "http://localhost:4200");
    response.setHeader(ACCESS_CONTROL_ALLOW_HEADERS, "*");
    response.setHeader(ACCESS_CONTROL_EXPOSE_HEADERS, "*");
    if (OPTIONS.matches(request.getMethod())) {
      return;
    }
    filterChain.doFilter(request, response);
  }
}
