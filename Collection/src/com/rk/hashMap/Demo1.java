package com.rk.hashMap;

import java.util.HashMap;
import java.util.Map;

class Student
{
	String name;
	String course;
	int marks;
	
	public Student(String name, String course, int marks)
	{
		this.name= name;
		this.course= course;
		this.marks= marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + ", marks=" + marks + "]";
	}
	
	
}

public class Demo1 
{
	public static void main(String[] args) 
	{
		Map<Integer,Student> students= new HashMap<>();
		students.put(101, new Student("Raushan","Java",52));
		students.put(102, new Student("Shubham",".NET",85));
		students.put(103, new Student("Santosh","Python",92));

		students.forEach((key, value) -> System.out.println(key+" -> "+value));

		
	}

}
