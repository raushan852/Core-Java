package com.rk.arraylist_cabCustomer;

public class CabCustomerServiceTester 
{
	public static void main(String[] args) 
	{
		CabCustomer c1= new CabCustomer(101, "Raushan", "Yella Reddy", "Panjagutta", 3, "8521250590");
		CabCustomerService cs= new CabCustomerService();
		cs.addCabCustomer(c1);
		cs.isFirstCustomer(c1);
		cs.calculateBill(c1);
		System.out.println(cs.printBill(c1));
	
		CabCustomer c2= new CabCustomer(101, "Raushan", "Ameerpet", "Secundrabad", 5, "8521250590");
		cs.addCabCustomer(c2);
		cs.isFirstCustomer(c2);
		cs.calculateBill(c2);
		System.out.println(cs.printBill(c2));
	}
}
