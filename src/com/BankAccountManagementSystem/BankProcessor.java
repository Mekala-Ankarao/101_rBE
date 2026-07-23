package com.BankAccountManagementSystem;

public class BankProcessor {

	public static void main(String[] args) {
		Bankaccount account =new Bankaccount(123456789, "Ankarao",1200.0);
		System.out.println("Bank Account Created Successfully");
		System.out.println("Account Number: "+ account.getAccountNumber());
		System.out.println("Account Holder Name: "+ account.accountHolder);
		System.out.println("Current Balance: " + account.getBalance());
		account.deposit(500);
		account.withdraw(1500);
		System.out.println("Updated Balance: "+ account.getBalance());

	}

}
