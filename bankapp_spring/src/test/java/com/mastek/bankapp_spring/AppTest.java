package com.mastek.bankapp_spring;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mastek.bankapp_spring.model.BankAccount;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	private static ApplicationContext context;
	@BeforeAll
    public static void beforeAll() {
        context = new ClassPathXmlApplicationContext("applicationConfig.xml");
    }
	
	@Test
	public void testAccount() {
		
		BankAccount account=(BankAccount) context.getBean("account");
		System.out.println(account);
		assertNotNull(account, "Account must be created");
}
}
