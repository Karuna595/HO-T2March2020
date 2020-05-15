package com.mastek.bankapp_project.dao;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.mastek.bankapp_project.BankAccount;

public class BankAccountDaoTest {

	private BankAccountDao accountDao;

	@BeforeEach
	void beforeEachTest() {
		accountDao = new BankAccountDao();
	}
	
	@Test
	void testFindAll() {
		
		assertNotNull(accountDao.findAll(), "Expected not null ");

	}

	@Test
	void testFindById() {
//		accountDao = new BankAccountDao();
		final long id = 1001;
		assertNotNull(accountDao.findById(id), "Expected not null ");

	}

	@Test
	void testFindByIdForNull() {
//		accountDao = new BankAccountDao();
		final long id = 1;
		assertNull(accountDao.findById(id), "Expected null ");
	}

	

	@Test
	void testAddTrue() {
	BankAccount account=new BankAccount("kajal",1004,12000);
		assertTrue(accountDao.add(account), "Must return true");
		
	}

	

	@Test
	void testDeleteTrue() {
//		accountDao = new BankAccountDao();
		BankAccount account = accountDao.findById(1001);
		assertTrue(accountDao.delete(account), "Must return true");

	}

	@Test
	void testDeleteFalse() {
//		accountDao = new BankAccountDao();
		BankAccount account = new BankAccount("Arati",1, 20000);
		assertFalse(accountDao.delete(account),"Must Return False value");
	}
}
