package com.mastek.bankapp01;

import com.mastek.bankapp01.model.BankAccount;
import com.mastek.bankapp01.model.SamePackage;
import com.mastek.bankapp01.model.SavingAccount;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	BankAccount account1=new BankAccount();
		System.out.println(account1);
		
		BankAccount account2=new BankAccount(1001,"Aditi",20000.00);
//		System.out.println(account2);
//		System.out.println(account2.accNo);
		SamePackage.showaccountDetails(account2);
		SavingAccount account3=new SavingAccount();
		account3.setAccNo(1002);
		account3.setAccName("Amit");
		account3.setBalance(300000.00);
		account3.showAccountDetails();
}
    }

