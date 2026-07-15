package com.methods;

public class student {
	public void calculatePercentage() {
		int sub1= 100;
		int sub2= 100;
		int sub3= 100;
		int sub4= 100;
		int sub5=  50;
		int totalMarks = 500;
		int obtainedMarks=sub1+sub2+sub3+sub4+sub5;
		int percentage=(obtainedMarks*100)/totalMarks;
		System.out.println("Student Percentage Report");
		System.out.println("Total Marks : " +(sub1+sub2+sub3+sub4+sub5));
		System.out.println("Percentage: " + percentage);
	}

	public static void main(String[] args) {
		student s = new student();
		s.calculatePercentage();
	}

}
