package com.RandomExer;

public class InvalidAgeException extends Exception{

	public InvalidAgeException(String s)
	{
		System.out.println("Exception Caught. Age cannot be :" + s);
		SuperMan();
	}
	
	
	public void SuperMan()
	{
		System.out.println("Method called from Class : " + this.getClass().getName());
	}
	
	public static void main(String args[]) throws InvalidAgeException
	{
		try {
		 int age = 17;
		if (age > 18 )
		System.out.println("All Cool");
		else
		throw  new InvalidAgeException(Integer.toString(age));
		
		}
		catch (InvalidAgeException age)
		{
			System.out.println("Age exception caught");
			
			
		}
		
		
		System.out.println("Excution route if exception was not thrown");
		
		
		
		
		
	}
	
	
	
}
