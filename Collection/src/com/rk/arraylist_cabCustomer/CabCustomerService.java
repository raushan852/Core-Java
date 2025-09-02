package com.rk.arraylist_cabCustomer;

import java.util.ArrayList;
import java.util.List;

public class CabCustomerService
{
	private List<CabCustomer> customers= new ArrayList<>();
	
	public void addCabCustomer(CabCustomer customer)
	{
		customers.add(customer);
	}
	
	public boolean isFirstCustomer(CabCustomer customer)
	{
		for(CabCustomer c: customers ) 
		{
			if(customer.getPhone().equals(c.getPhone()) && c!=customer)
			{
				return false;
			}
		}
		return true;
	}
	
	public double calculateBill(CabCustomer customer)
	{
		if(isFirstCustomer(customer))
		{
			return 0;
		}
		else if(customer.getDistance() <= 4)
		{
			return 80;
		}
		else
		{
			return 80+(customer.getDistance()-4)*6;
		}
	}
	
	public String printBill(CabCustomer customer)
	{
		return customer.getCustomerName()+" Please pay your bill of Rs: "+calculateBill(customer);
	}
}
