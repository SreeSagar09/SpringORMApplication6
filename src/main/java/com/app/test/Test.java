package com.app.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.app.Product;
import com.app.ProductDetails;
import com.app.config.AppConfig;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ProductDetails productDetails = applicationContext.getBean(ProductDetails.class);
		
		System.out.println("------ Product List By Product Id --------");
		String paramName1 = "productId";
		Object paramValue1 = new Integer(2);
		List<Product> productList1 = productDetails.getProductDetailsByProductId(paramName1, paramValue1);
		productList1.forEach(p->{System.out.println(p);});
		
		System.out.println("------ Product List By Product Name -------");
		String paramName2 = "productName";
		Object paramValue2 = new String("Pen");
		List<Product> productList2 = productDetails.getProductDetailsByProductName(paramName2, paramValue2);
		productList2.forEach(p->{System.out.println(p);});
		
		System.out.println("------ Product List By Product Code And Product Name --------");
		String[] paramNames1 = {"productCode", "productName"};
		String[] paramValues1 = {"P004", "Pen"};
		List<Product> productList3 = productDetails.getProductDetailsByProductCodeAndProductName(paramNames1, paramValues1);
		productList3.forEach(p->{System.out.println(p);});
	}
}
