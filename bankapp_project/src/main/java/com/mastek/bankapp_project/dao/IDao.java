package com.mastek.bankapp_project.dao;

import java.util.Set;

public interface IDao<T> {

	Set<T> findAll();
	T findById(long id);
	boolean add(T t);
	boolean delete(T t);
	boolean update(long id, T t);
}
