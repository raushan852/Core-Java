package com.rk.failfastIterator;

import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.ConcurrentSkipListMap;

class Concurrent extends Thread
{
	private Vector<String> cities;
	
	public Concurrent (Vector <String> cities)
	{
		super();
		this.cities= cities;
	}
	
	@Override
	public void run()
	{
		try
		{
			Thread.sleep(2500);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		cities.add("Goa");
	}
	
}


public class Demo1 
{
	public static void main(String[] args) throws InterruptedException
	{
		Vector<String> listOfCity= new Vector<String>();
		listOfCity.add("Surat");
		listOfCity.add("Pune");
		listOfCity.add("Ahmadabad");
		listOfCity.add("Vanaras");
		listOfCity.add("Hyderabad");
		
		Concurrent cons= new Concurrent(listOfCity);
		cons.start();
		
		Iterator<String> itr= listOfCity.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			Thread.sleep(500);
		}
	}
}
