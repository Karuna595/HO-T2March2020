package com.mastek.inventorymgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mastek.inventorymgmt.dao.ProductDaoImpl;
import com.mastek.inventorymgmt.model.Product;
@Service
public class ProductService {

	@Autowired
	private ProductDaoImpl productdao;
	
	public Product findById(String id) {
		return productdao.findById(id);
	}
	
	
	public List<Product> findAll() {
		return productdao.findAll();
	}
	
	@Transactional(propagation = Propagation.REQUIRED, 
			transactionManager = "transactionManagerName")
	public boolean save(Product product) {
		 return productdao.save(product);
	}
	
	public boolean delete (String id) {
		return productdao.delete(id);
	}

}
