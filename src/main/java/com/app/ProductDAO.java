package com.app;

import java.util.List;

public interface ProductDAO {
	
	public List<Product> getProductByProductId(String paramName, Object paramValue);
	
	public List<Product> getProductByProductName(String paramName, Object paramValue);
	
	public List<Product> getProductByProductCodeAndProductName(String[] paramNames, Object[] paramValues);
}
