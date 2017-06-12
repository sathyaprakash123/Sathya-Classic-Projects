package com.RandomExer;

public class nested {

	public class nest2
	{
		public void display()
		{
			System.out.println("Hello From Inside Nested Class 2");
		}
		
	}
	
	public void access_inner()
	{
		nest2 n = new nest2();
		n.display();
	}
	
	public static void main(String args[])
	{
		nested n = new nested();
		n.access_inner();
		
	}
	
}
