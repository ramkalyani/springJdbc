package com.zensar.entities;


/**
 * @author kalyani
 * @creation_date 25th sep 2019 4.44pm
 * @modification_date 10th oct 2019 4:00pm
 * @version 3.0
 * @copyright zensar technologies.all rights reserved
 * @description It is a persistance class
 *              It represents database table product
 *              It is pojo class
 *
 */

public class Product {
	
	private int productId;
	private String name;
	private String brand;
	private float price;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(int productId, String name, String brand, float price) {
		super();
		this.productId = productId;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}

}
