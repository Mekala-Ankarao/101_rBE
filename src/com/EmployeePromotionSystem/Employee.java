package com.EmployeePromotionSystem;

public class Employee {
	int empid;
	String name;
	String designation;
	double salary;
	int performanceRating;
	public Employee(int empid, String name,String designation,double salary,int performanceRating) {
		this.empid = empid;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.performanceRating = performanceRating;
	}
//	Getters
	public int getEmpId() {
		return empid;
	}
	public String getName() {
		return name;
	}
	public String getDesignation() {
		return designation;
	}
	public double getSalary() {
		return salary;
	}
	public int getPerformanceRating() {
		return performanceRating;
	}
//	Setters
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void promoteEmployee() {
		if(performanceRating >= 4) {
			salary= salary+(salary *20/100);
			if(designation.equalsIgnoreCase("Developer")) {
				designation = "Senior Developer";
				System.out.println("After Promotion");
				System.out.println("Updated salary:"+salary);
				System.out.println("New Designation: "+ designation);
						}
		}else {
	
				System.out.println("No Promotion \nYour Rating Is Low!");
			}
		}
	}
