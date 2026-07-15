package com.loops;

public class Example2 {
	public void reverseNumber(int num) {
		int rev=0;
		while(num!=0) {
			int rem=num%10;
			rev=rev*10+rem;
			num /= 10;
	}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		Example2 obj=new Example2();
		obj.reverseNumber(123);
		}
	

}