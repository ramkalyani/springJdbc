package com.zensar.services;

import java.util.List;

import com.zensar.entities.Product;

/**
 * @author kalyani
 * @creation_date 4thth oct 2019 11:40am
 * @modification_date 4thth oct 2019 11:40am
 * @version 1.0
 * @copyright zensar technologies.all rights reserved
 * @description It is a productService  interface
 *              used in Business layer
 */

public interface ProductService {

	List<Product> findAllProducts();
	void addProduct(Product product);
	void updateProduct(Product product);
	void removeProduct(Product product);
	List<Product> findProductsByPriceRange(float min,float max);
	List<Product> findProductByName(String name);
	List<Product> findProductByBrand(String brand);
	long getProductCount();
	Product findProductById(int productId);
}
