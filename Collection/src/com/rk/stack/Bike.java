package com.rk.stack;

public class Bike
{
	private Bike()
	{
		System.out.println("Private constructor called...");
	}
	
	public static Bike getInstance()
	{
		return new Bike();
	}
	
	public void ride()
	{
		System.out.println("Riding a bike...");
	}
	public static void main(String[] args) 
	{
		//Using factory method
		Bike bike= Bike.getInstance();
		bike.ride();
	}
}
