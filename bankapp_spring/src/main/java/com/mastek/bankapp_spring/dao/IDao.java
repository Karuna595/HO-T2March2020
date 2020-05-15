package com.mastek.bankapp_spring.dao;

import java.util.List;

import com.mastek.bankapp_spring.model.BankAccount;

public interface IDao<T> {
	List<T> findAll();
    T findById(long id);
    boolean save(T object);
	boolean delete(BankAccount account);
}
