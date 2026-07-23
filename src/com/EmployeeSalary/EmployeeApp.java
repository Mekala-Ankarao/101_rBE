package com.EmployeeSalary;
import java.util.Scanner;
public class EmployeeApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name: ");
		String employeeName = sc.nextLine();
		System.out.println("Enter Basic Salary: ");
		int basicsalary = sc.nextInt();
		Employee obj = new Employee(employeeName, basicsalary);
		obj.displaySalaryDetails();
		sc.close();
	}

}
