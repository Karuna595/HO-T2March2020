package com.mastek.bankapp01.model;

public class BankAccount {

	int accNo;
	String accName;
	double balance;
	//alt+s+c -> default constructor / constructor without parameters
	public BankAccount() {
		super();
	}
	//alt+s+a -> overloaded constructor / constructor with parameters
	public BankAccount(int accNo, String accName, double balance) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.balance = balance;
	}
//	alt+s+r ->public accessor/getter and mutators setters
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
//	alt+s+s+s ->toString() object->String
	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", accName=" + accName + ", balance=" + balance + "]";
	}
	
}
