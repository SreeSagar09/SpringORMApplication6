package com.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductDetails {
	@Autowired
	private ProductDAO productDAO;
	
	public List<Product> getProductDetailsByProductId(String paramName, Object paramValue){
		List<Product> productList = productDAO.getProductByProductId(paramName, paramValue);
		
		return productList;
	}
	
	public List<Product> getProductDetailsByProductName(String paramName, Object paramValue){
		List<Product> productList = productDAO.getProductByProductName(paramName, paramValue);
		
		return productList;
	}
	
	public List<Product> getProductDetailsByProductCodeAndProductName(String[] paramNames, Object[] paramValues){
		List<Product> productList = productDAO.getProductByProductCodeAndProductName(paramNames, paramValues);
		
		return productList;
	}
}

