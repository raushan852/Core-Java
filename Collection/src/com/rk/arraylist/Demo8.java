package com.rk.arraylist;

import java.util.ArrayList;
import java.util.List;

record Professor(String name, String specialization)
{
	
}

class Department
{
	private String departmentName;
	private List<Professor> professors;
	
	public Department(String departmentName)
	{
		this.departmentName= departmentName;
		professors= new ArrayList<Professor>();
	}
	
	public String getDepartmentName()
	{
		return departmentName;
	}
	
	public List<Professor> getProfessors()
	{
		return professors;
	}
	
	public void addProfessor(Professor prof)
	{
		professors.add(prof);
	}
}
public class Demo8 
{
	public static void main(String[] args) 
	{
		Department dept= new Department("Computer Science");
	    dept.addProfessor(new Professor("Dr. Smith", "Java"));	
	    dept.addProfessor(new Professor("Dr. Alen", "Networking"));	
	    dept.addProfessor(new Professor("Dr. Scott", "Database"));	
	       
	    System.out.println("Professors in :"+dept.getDepartmentName());
	    dept.getProfessors().forEach(System.out::println);       
	    
	    System.out.println("------------------------------");
	    Department department = new Department("Civil Engineering");
	    department.addProfessor(new Professor("Dr. Raj", "Engineering Drawing"));	
	    department.addProfessor(new Professor("Dr. Samir", "Concrete Technology"));	
	    department.addProfessor(new Professor("Dr. Ankit", "Environmental Engineering"));

	    System.out.println("Professors in :"+department.getDepartmentName());
	    department.getProfessors().forEach(System.out::println);

	}
}
