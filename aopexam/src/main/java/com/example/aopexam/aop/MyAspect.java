package com.example.aopexam.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	@Before("execution (* com.example.aopexam..ProductDao*.add*(..))")
	public void before(JoinPoint joinPoint) {
		System.out.println("############################ before #############");
	}
}
