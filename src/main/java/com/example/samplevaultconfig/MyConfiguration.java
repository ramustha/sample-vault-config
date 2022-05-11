package com.example.samplevaultconfig;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(value = "example")
public class MyConfiguration {
  private String password;
  private String username;
}
