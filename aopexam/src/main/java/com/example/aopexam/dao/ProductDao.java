package com.example.aopexam.dao;

import com.example.aopexam.domain.Product;

public interface ProductDao {
	void addProduct(Product product);
	Product findProduct(String name);
}
