package com.mastek.bankapp_project.service;

import java.util.Set;

import com.mastek.bankapp_project.BankAccount;
import com.mastek.bankapp_project.dao.BankAccountDao;

public class BankAccountService {

private BankAccountDao account = new BankAccountDao();
	
	public Set<BankAccount> findAll() {
		return account.findAll();
	}
	
	public BankAccount findById(long id) {
		return account.findById(id);
	}
	
	public boolean add(BankAccount t) {
		return account.add(t);
	}
	
	public boolean delete(BankAccount t) {
		return account.delete(t);
	}
	
	public boolean update(long id, BankAccount t) {
		return account.update(id,t);
	}
}
