package com.example.todojpa.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.example.todojpa.service"})
public class ApplicationConfig {
	
}
