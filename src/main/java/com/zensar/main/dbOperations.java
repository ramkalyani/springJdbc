package com.zensar.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.entities.Product;
import com.zensar.services.ProductService;

public class dbOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx= new ClassPathXmlApplicationContext("dbConfig.xml");
		ProductService productService=ctx.getBean("productServiceImpl", ProductService.class);
		 List<Product> products=productService.findAllProducts();
		 for(Product p:products)
		 {
			 System.out.println(p);
		 }
		 //Product product=new Product(1005, "mobile", "samsung", 5000);
		 //productService.addProduct(product);
		 
		 Product p1=productService.findProductById(1001);
		 System.out.println("");
		 System.out.println("product info by certain id");
		 System.out.println(p1);
		 if(p1!=null)
		 {
			 productService.removeProduct(p1);
		 }
		 
	}

}
