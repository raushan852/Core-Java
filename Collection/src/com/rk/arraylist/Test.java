package com.rk.arraylist;

import java.util.ArrayList;


class Student
{
	int roll;
	String name;
	
	public Student(int roll, String name)
	{
		this.roll= roll;
		this.name= name;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}

}
public class Test 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> listOfStudents= new ArrayList<>();
		listOfStudents.add(new Student(101, "Aman"));
		listOfStudents.add(new Student(104, "Raju"));
		listOfStudents.add(new Student(102, "Jyoti"));
		
		//Ascending Order
		listOfStudents.sort((s1, s2) -> s1.roll - s2.roll);	
		listOfStudents.forEach(System.out::println);
		
		//Descending Order
		listOfStudents.sort((s1, s2) -> s2.roll - s1.roll);
		listOfStudents.forEach(System.out::println);
	}
}
