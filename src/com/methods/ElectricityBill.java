package com.methods;

public class ElectricityBill {
	public static void calculateBill() {
		int units = 250;
		int unit_cost = 8;
		int totalbill =(units * unit_cost);
		System.out.println("Electricity Bill");
		System.out.println("Units Used: " + units);
		System.out.println("Cost Per Unit: " + unit_cost);
		System.out.println("Total Bill: " + totalbill);
	}

	public static void main(String[] args) {
		ElectricityBill.calculateBill();
	}

}
