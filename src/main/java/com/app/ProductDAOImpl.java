package com.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAOImpl implements ProductDAO{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public List<Product> getProductByProductId(String paramName, Object paramValue) {
		String queryName = "Product.findByProductId";
		List<Product> productList = (List<Product>) hibernateTemplate.findByNamedQueryAndNamedParam(queryName, paramName, paramValue);
		
		return productList;
	}

	@Override
	public List<Product> getProductByProductName(String paramName, Object paramValue) {
		String queryName = "Product.findByProductName";
		List<Product> productList = (List<Product>) hibernateTemplate.findByNamedQueryAndNamedParam(queryName, paramName, paramValue);
		
		return productList;
	}

	@Override
	public List<Product> getProductByProductCodeAndProductName(String[] paramNames, Object[] paramValues) {
		String queryName = "Product.findByProductCodeAndProductName";
		List<Product> productList = (List<Product>) hibernateTemplate.findByNamedQueryAndNamedParam(queryName, paramNames, paramValues);
		
		return productList;
	}
	
}
