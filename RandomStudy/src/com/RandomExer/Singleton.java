package com.RandomExer;

public class Singleton {

	String name;
	Integer age;
	
	private Singleton()
	{
		name = "sathya";
		age = 35;
				
	}
	
	public void displayDetails()
	{
		System.out.println("Name : "+ name + " Age : " + age);
	}
	
	
	public static void main(String args[])
	{
		Singleton s = new Singleton();
		s.displayDetails();
		
		
	}
	
	
}
