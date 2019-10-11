package com.zensar.daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 * @author kalyani
 * @creation_date 4thth oct 2019 10:7am
 * @modification_date 10th oct 2019 4:00pm
 * @version 3.0
 * @copyright zensar technologies.all rights reserved
 * @description It is a product dao interface
 *              used in persistance layer
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Product> getAll() { 
		// TODO Auto-generated method stub
		String sql="select *from product";
		return jdbcTemplate.query(sql, new ResultSetExtractor<List<Product> >() {

			@Override
			public List<Product> extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				List<Product> products=new ArrayList<Product>();
				while(rs.next())
				{
					Product product=new Product();
					product.setProductId(rs.getInt(1));
					product.setName(rs.getString(2));
					product.setPrice(rs.getFloat(4));
					product.setBrand(rs.getString(3));
					products.add(product);
				}
				return products;  
			}
		});
	}

	public Product getById(int productId) {
		// TODO Auto-generated method stub
		String sql="select *from product where id=?";
		return jdbcTemplate.query(sql,new Object[] {productId}, new ResultSetExtractor<Product>() {

			@Override
			public Product extractData(ResultSet rs) throws SQLException, DataAccessException {
				if(rs.next())
				{
					Product product=new Product();
					product.setProductId(rs.getInt(1));
					product.setName(rs.getString(2));
					product.setPrice(rs.getFloat(4));
					product.setBrand(rs.getString(3)); 
				}
				return null;
			}
		});
	}
				
		
	

	@Override
	public void insert(Product product) {
		// TODO Auto-generated method stub
		String sql="insert into product values(?,?,?,?)";
		jdbcTemplate.update(sql, product.getProductId(),product.getBrand(),product.getPrice());
		System.out.println("new product is added");
		
	}

	@Override 
	public void update(Product product) {
		// TODO Auto-generated method stub
		String sql="update product set name=?,brand=?, price=? where id=?";
		jdbcTemplate.update(sql, product.getName(),product.getBrand(),product.getPrice(),product.getProductId());
		System.out.println("product is updateed");
		
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		String sql="delete from product where id=?";
		jdbcTemplate.update(sql, product.getProductId());
		System.out.println("product is deleted");
		
	}
	
}