package com.mastek.inventorymgmt.dao;

import java.util.List;

public interface ProductDao<T> {

	List<T> findAll();
	T findById(String id);
	boolean save(T object);
	boolean delete (String id);
}
