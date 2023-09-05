package com.example.aopexam.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.aopexam.config.ApplicationConfig;
import com.example.aopexam.domain.Product;
import com.example.aopexam.service.ProductService;

public class ProductRun {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		ProductService service = context.getBean(ProductService.class);
		
		service.addProduct(new Product("pen", 3000));
		
		Product product =	service.findByProductName("pen");
		
		System.out.println(product);
		
	}

}
