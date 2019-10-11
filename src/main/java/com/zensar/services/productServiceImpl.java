package com.zensar.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.daos.ProductDao;
import com.zensar.daos.ProductDaoImpl;
import com.zensar.entities.Product;

@Service
public class productServiceImpl implements ProductService {
	@Autowired
	private ProductDao productDao;
    
	@Override
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return productDao.getAll(); 
	}

	@Override 
	public Product findProductById(int productId) {
		// TODO Auto-generated method stub
		
		return productDao.getById(productId); 
	}

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.insert(product);

	}
	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.update(product);

	}

	@Override
	public void removeProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.delete(product);

	}

	@Override
	public List<Product> findProductsByPriceRange(float min, float max) {
		// TODO Auto-generated method stub
		List<Product> productByRange=new ArrayList<Product>();
		List<Product> productAll=productDao.getAll();
		for(Product p:productByRange)
		{
			if(p.getPrice()<max && p.getPrice()>min)
			{
				 productAll.add(p);
			}					
	}
		return productAll;
	}
	
	@Override
	public List<Product> findProductByName(String name) {
		// TODO Auto-generated method stub
		List<Product> productByName=new ArrayList<Product>();
		List<Product> productAll=productDao.getAll();
		for(Product p:productByName) 
		{
			if(p.equals(name))
			{
				productAll.add(p);
			}
						
		}
		return productByName;		
		
	}

	@Override
	public List<Product> findProductByBrand(String brand) {
		// TODO Auto-generated method stub
		List<Product> productByBrand=new ArrayList<Product>();
		List<Product> productAll=productDao.getAll();
		for(Product p:productByBrand)
		if(p.equals(brand))
		{
			productAll.add(p);
	}
    return productByBrand;
	}
	
    @Override
	public long getProductCount() {
    	List<Product> productCount=new ArrayList<Product>();
		return (long)(productCount.size()); 
	}

}
