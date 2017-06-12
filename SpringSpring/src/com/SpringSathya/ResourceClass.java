package com.SpringSathya;



public class ResourceClass {
	private static String message = "Hello. You are inside ResourceClass's Find Data Method";

	public void findData()
	{
		
		System.out.println(message);
				
	}
	
	public void setMessage(String message)
	{
		ResourceClass.message = message;
	}
	
	
	
	
}
