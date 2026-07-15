package com.methods;

public class interestcalculator {
	public void calculateSI() {
		int principle = 10000;
		int rate = 5;
		int time = 2;
		int interest =(principle * rate * time) / 100;
		System.out.println("Simple Interest Details");
		System.out.println("Principle: " + principle);
		System.out.println("Rate: " + rate);
		System.out.println("Time: " + time);
		System.out.println("Interest: " + interest);
	}

	public static void main(String[] args) {
		interestcalculator result = new interestcalculator();
		result.calculateSI();
	}

}
