package com.mastek.inventorymgmt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.mastek.inventorymgmt.model.Product;
@Component
public class ProductRowMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Product product=new Product();
		product.setProduct_id(rs.getString("product_id"));
		product.setProduct_name(rs.getString("product_name"));
		product.setUnit_price(rs.getDouble("unit_price"));
		product.setAvailable_qty(rs.getInt("available_quantity"));
		return product;
	}

}
