package com.ATM;

public class BankingMenu {

	public static void main(String[] args) {
		double balance = 1000;
		int choice = 1;
		while (choice != 4)
		{
		
		System.out.println("1.Check Balance:");
		System.out.println("2.Deposit Money");
		System.out.println("3.Withdrawl Money");
		System.out.println("4.Exit");
		
		switch(choice)
		{
		case 1:
			System.out.println("Balance=" + balance);
			choice = 4;
			break;
		case 2:
			balance = balance + 500;
			System.out.println("Updated balance" + balance);
			choice = 4;
			break;
		case 3:
			balance = balance - 200;
			System.out.println("Updated balance" + balance);
			choice = 4;
			break;
		case 4:
			System.out.println("Thank you!");
			choice = 4;
			break;
			default:
				System.out.println("Invalid choice");
				choice = 4;
		  }
		}
	}

}

