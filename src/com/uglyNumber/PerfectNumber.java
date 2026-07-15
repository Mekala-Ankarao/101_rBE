package com.uglyNumber;

public class PerfectNumber {
	public boolean isPerfect(int num) {
		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i == 0) {
				sum +=i;
			}
		}
		return sum==num;
	}
	public static void main(String[] args) {
		PerfectNumber p=new PerfectNumber();
		System.out.println(p.isPerfect(6)?"Perfect Number":"! Perfect Number");
	}

}
