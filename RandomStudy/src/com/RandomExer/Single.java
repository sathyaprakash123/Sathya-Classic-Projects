package com.RandomExer;

public class Single {
	
	Single single1 = null;
	
	private String name = "Hello";
	
	private  Single(){}
	
	private static final Single single = new Single();
	
	public static Single createInstance()
	{
		
		
		
		return single;
				
		
	}
	
	
	public void print()
	{
		System.out.println("Singleton Class Method");
	}
	
	
	
	public static void main(String args[])
	{
		Single single = new Single();
		single.print();
		
		
	}

}
