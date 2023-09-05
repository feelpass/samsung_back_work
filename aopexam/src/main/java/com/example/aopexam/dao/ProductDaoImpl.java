package com.example.aopexam.dao;

import java.util.HashMap;
import java.util.Map;

import com.example.aopexam.domain.Product;

public class ProductDaoImpl implements ProductDao {
	private Map<String, Product> storeage = new HashMap();

	@Override
	public void addProduct(Product product) {
		storeage.put(product.getName(), product);
		
	}

	@Override
	public Product findProduct(String name) {
		// TODO Auto-generated method stub
		return storeage.get(name);
	}

}
