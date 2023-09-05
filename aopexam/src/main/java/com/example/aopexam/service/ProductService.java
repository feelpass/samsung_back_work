package com.example.aopexam.service;

import com.example.aopexam.domain.Product;

public interface ProductService {
	void addProduct(Product product);
	Product findByProductName(String name);
}
