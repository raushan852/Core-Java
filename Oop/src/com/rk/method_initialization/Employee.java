package com.rk.method_initialization;

import java.util.Scanner;

//Initializing the object properties using Method without parameter (using Scanner Class) 
public class Employee 
{
	int employeeNumber;
	String employeeName;
	double employeeSalary;
	
	public void setEmployeeData()
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter employee Number: ");
		employeeNumber= sc.nextInt();
		sc.nextLine();
		System.out.print("Enter employee Name: ");
		employeeName= sc.nextLine();
		System.out.print("Enter employee Salary: ");
		employeeSalary= sc.nextDouble();
	}
	
	public void getEmployeeData()
	{
		System.out.println("Employee Number is: "+employeeNumber);
		System.out.println("Employee Name is: "+employeeName);
		System.out.println("Employee Salary is: "+employeeSalary);
	}
}
