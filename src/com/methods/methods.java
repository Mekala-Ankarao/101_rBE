package com.methods;

public class methods {
	static String studentclass = "JAVA FULLSTACK ";
	String CourseId = "101r";
	int Strength = 70;
	public static void studentinfo() {
		System.out.println("Course: " + studentclass);
	}
	public void courseinfo() {
		System.out.println("ClassName: " + CourseId);
		System.out.println("Strength: " + Strength);
	}

	public static void main(String[] args) {
		methods std = new methods();
		methods.studentinfo();
		std.courseinfo();
	}

}
