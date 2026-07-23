package com.EmployeePromotionSystem;

public class EmployeeProcessor {

	public static void main(String[] args) {
		Employee emp = new Employee(201,"Bob","Developer",50000.0,5);
		System.out.println("Employee ID:"+emp.getEmpId());
		System.out.println("Name: "+emp.getName());
		System.out.println("Designation: "+emp.getDesignation());
		System.out.println("Salary:"+ emp.getSalary());
		System.out.println("Performance Rating: "+emp.getPerformanceRating());
		emp.getEmpId();
		emp.getName();
		emp.getDesignation();
		emp.getSalary();
		emp.getPerformanceRating();
		emp.promoteEmployee();
		
		
	}

}
