package com.rk.initialization_through_parameter;

//Initializing the object properties using parameter variable
public class Customer 
{
	int customerId;
	String customerName;
	
	public void setCustomerData(int id, String name)
	{
		customerId= id;
		customerName= name;
	}
	
	public void getCustomerData()
	{
		System.out.println("Customer Id is: "+customerId);
		System.out.println("Customer Name is: "+customerName);
	}
}
