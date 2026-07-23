package com.BankAccountManagementSystem;

public class Bankaccount {
	int accountNumber;
	String accountHolder;
	double balance;
//	constructors
	public Bankaccount(int accountNumber, String accountHolder, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
//	Getters
		public int getAccountNumber() {
			return accountNumber;
		}
		public String getAccountHolder() {
			return accountHolder;
		}
		public double getBalance() {
			return balance;
		}
//		setters
		public void setBalance(double balance) {
			this.balance=balance;
		}
//		methods
		public void deposit(double amount) {
			balance = balance + amount;
			System.out.println(amount +"  Deposited successfully");
	
		}
		public void withdraw(double amount) {
			if(balance >= amount) {
				balance = balance - amount;
				System.out.println(amount + "  Withdraw Successfully ");
			}else {
				System.out.println("insufficient Balance");
			}
			
		}
}
