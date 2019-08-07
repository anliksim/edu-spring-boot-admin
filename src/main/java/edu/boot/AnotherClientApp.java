package edu.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableAutoConfiguration
@PropertySource("classpath:application-another.properties")
public class AnotherClientApp {

    public static void main(String[] args) {
        SpringApplication.run(AnotherClientApp.class, args);
    }
}