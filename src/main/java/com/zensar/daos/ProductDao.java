package com.zensar.daos;

import java.util.List;



import com.zensar.entities.Product;

/**
 * @author kalyani
 * @creation_date 4thth oct 2019 10:7am
 * @modification_date 4thth oct 2019 10:7am
 * @version 3.0
 * @copyright zensar technologies.all rights reserved
 * @description It is a product dao interface
 *              used in persistance layer
 */
public interface ProductDao {
	
List<Product> getAll();
Product getById(int productId);
void insert(Product product);
void update(Product product);
void delete(Product product); 

	
	
}
