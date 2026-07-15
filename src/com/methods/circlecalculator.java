package com.methods;

public class circlecalculator {
	public static void calculatecircleArea() {
		int radius = 7;
		double area;
		area = 3.14 * radius* radius;
		System.out.println("Circle details");
		System.out.println("Radius: " + radius);
		System.out.println("Area of circle: " + area);
	}

	public static void main(String[] args) {
		circlecalculator.calculatecircleArea();
	}

}
