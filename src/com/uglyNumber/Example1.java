package com.uglyNumber;

public class Example1 { 
	public boolean isUgly(int num) {
		if(num<=0) {
		}
		while(num%2==0) {
			num/=2;
		}
		while(num%3==0) {
			num/=3;
		}
		while(num%5==0) {
			num/=5;
		}
		return num == 1;
	}

	public static void main(String[] args) {
		Example1 obj = new Example1();
		System.out.println(obj.isUgly(7)?"it is Ugly Number":"it is Not Ugly Number");
	}

}
