package com.mastek.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mastek.app.dao.BankAccountDao;
import com.mastek.app.model.BankAccount;
@Service
public class BankAccountService {
	@Autowired
	private BankAccountDao accountDao;

@Transactional(propagation=Propagation.REQUIRED,transactionManager="transactionManagerName")
	public boolean save(int accNo, String accName, double balance) {
		
		return accountDao.save(new BankAccount(accNo, accName, balance));
		
	}
	
}
