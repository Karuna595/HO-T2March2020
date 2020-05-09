package com.mastek.solid01;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Set<BankAccount> accountSet=new TreeSet();
		accountSet.add(new BankAccount(1001, "Ajit", 10000));
		accountSet.add(new BankAccount(1002, "Amit", 10000));
		accountSet.add(new BankAccount(1003, "Ankit", 10000));
		System.out.println(accountSet);
//		To Sort by Name
		Comparator<BankAccount> comparator=new Comparator<BankAccount>() {
			@Override
			public int compare(BankAccount o1, BankAccount o2) {
				return o1.getAccName().compareTo(o2.getAccName());
			}
		}; 
		accountSet=new TreeSet(comparator);
		accountSet.add(new BankAccount(1001, "Amit", 10000));
		accountSet.add(new BankAccount(1002, "Ankit", 10000));
		accountSet.add(new BankAccount(1003, "Ajit", 10000));
		System.out.println(accountSet);
    }
}
