package com.mastek.inventorymgmt.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.mastek.inventorymgmt.model.Product;
@Component
public class ProductDaoImpl implements ProductDao<Product>{

	private JdbcTemplate jdbctemplate;
	@Autowired
	private ProductRowMapper rowmapper;
	
	public ProductDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public ProductDaoImpl(DataSource ds) {
		super();
		this.jdbctemplate = new JdbcTemplate(ds);
		this.rowmapper = new ProductRowMapper();
	}

	@Override
	public List<Product> findAll() {
		final String sql = "select * from product;";
		return jdbctemplate.query(sql, rowmapper);
	}

	@Override
	public Product findById(String id) {
		final String sql = "select product_id,product_name,unit_price,available_qty from product where product_id=?;";
		return (Product) jdbctemplate.queryForObject(sql, new Object[] { id }, new ProductRowMapper());
	}

	@Override
	public boolean save(Product object) {
		final String sql = "insert into product values(?,?,?,?);";
//		JdbcTemplate.update(sql_stmt,Object ... args)
		return jdbctemplate.update(sql, object.getProduct_id(), object.getProduct_name(), object.getUnit_price(), object.getAvailable_qty()) > 0;
	}

	@Override
	public boolean delete(String id) {
		
			final String sql = "delete from product where product_id=?;";
			return jdbctemplate.update(sql,id) > 0;
	}

	
}
