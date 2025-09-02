package com.rk.type_parameter;

class Accept<T>
{
	private T data;
	public Accept(T data)
	{
		super();
		this.data= data;
	}
	
	public T getData()
	{
		return data;
	}
}

class Student
{
	@Override
	public String toString() 
	{
		return "Batch 42";
	}
	
}

public class Generic 
{
	public static void main(String[] args)
	{
		Accept<Integer> intType= new Accept<>(123);
		System.out.println("Integer object is: "+intType.getData());
		
		Accept<String> StrType= new Accept<>("Raushan");
		System.out.println("String object is: "+StrType.getData());
		
		Accept<Student> stuType= new Accept<>(new Student());
		System.out.println("Student name is: "+stuType.getData());
	}
}
