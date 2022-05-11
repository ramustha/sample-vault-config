package com.example.samplevaultconfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = MyConfiguration.class)
public class SampleVaultConfigApplication implements CommandLineRunner {
  
  @Autowired
  MyConfiguration configuration;
  
  public static void main(String[] args) {
    SpringApplication.run(SampleVaultConfigApplication.class, args);
  }
  
  @Override
  public void run(String... args) {
    
    Logger logger = LoggerFactory.getLogger(SampleVaultConfigApplication.class);
    
    logger.info("----------------------------------------");
    logger.info("Configuration properties");
    logger.info("   example.username is {}", configuration.getUsername());
    logger.info("   example.password is {}", configuration.getPassword());
    logger.info("----------------------------------------");
  }
  
}
