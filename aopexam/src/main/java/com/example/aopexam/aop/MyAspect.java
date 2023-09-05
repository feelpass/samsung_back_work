package com.example.aopexam.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.example.aopexam.domain.Product;

@Component
@Aspect
public class MyAspect {
	@Pointcut("execution (* com.example.aopexam..add*(..))")
	private void pc() {}
	
	@Pointcut("execution (* findProduct(String))")
	private void pc2() {}
	
	@Before("execution (* com.example.aopexam..ProductDao*.add*(..))")
	public void before(JoinPoint joinPoint) {
		System.out.println("############################ before #############");
		
		Signature signature = joinPoint.getSignature();
		
		System.out.println(signature.getName());
		
		Object[] args =	joinPoint.getArgs();
		for (Object object : args) {
			System.out.println(" 인자:::::::::::::::::::"+object);
		}
	}
	
	@After("pc2()")
	public void after() {
		System.out.println("######################@After  메소드가 실행된 후 실행!!");
	}
	
	
	@AfterReturning(value = "pc2()", returning = "product")
	public void afterReturning(JoinPoint joinPoint, Product product) {
		System.out.println("######################@@AfterReturning  메소드가 실행된 예외없이 잘 실행되었을때 동작됨!!");
		Signature sig = joinPoint.getSignature();
		System.out.println("******"+sig.getName());
		
		Object[] args =	joinPoint.getArgs();
		for (Object object : args) {
			System.out.println("인자:::::::::::::"+object);
		}
		
		System.out.println("product :::"+product);
		
		product.setName("new Pen!!!");
		
		System.out.println("@AfterReturning end!!!");
	}
	
}
