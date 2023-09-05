package com.example.aopexam.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan(basePackages = {"com.example.aopexam"})
@EnableAspectJAutoProxy
public class ApplicationConfig {

}
