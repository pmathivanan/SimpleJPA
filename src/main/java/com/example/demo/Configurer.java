package com.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = { "com.example.demo" })
@EnableJpaRepositories(basePackages = { "com.example.demo" })
@EntityScan(basePackages = { "com.example.demo" })
@EnableAutoConfiguration

public class Configurer {

}
