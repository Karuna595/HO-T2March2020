package com.mastek.app.dao;

import java.util.List;

public interface IDao<T> {

	List<T> findAll();
	T findById(long id);
	boolean save(T object);
	boolean delete (long id);
}
