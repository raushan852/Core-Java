package com.rk.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

record Employee(Integer id, String name, Double salary) implements Comparable<Employee>
{

	@Override
	public int compareTo(Employee e2)
	{
		
		return this.salary.compareTo(e2.salary);
	}
	
}

public class EmployeeComparable
{
	public static void main(String[] args)
	{
		ArrayList<Employee> listOfEmployee= new ArrayList<>();
		listOfEmployee.add(new Employee(101, "Raushan", 14999D));
		listOfEmployee.add(new Employee(103, "Santosh", 24999D));
		listOfEmployee.add(new Employee(102, "Jyoti", 18999D));
		
		System.out.println("Original Data: ");
		listOfEmployee.forEach(System.out::println);
		System.out.println("----------------------");
		
		Collections.sort(listOfEmployee);
		System.out.println("Data after Sorting based on the ID: ");
		listOfEmployee.forEach(System.out::println);
		

	}

}
