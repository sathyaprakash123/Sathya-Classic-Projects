package com.SuperSpring;

public class HelloWorld {

	public String message;
	
	public void setMessage(String mes)
	{
		this.message = mes;
	}
	
	public void getMessage()
	{
		System.out.println("Message is " + message);
	}
	
	public void init()
	{
		System.out.println("System is getting initiated");
	}
	
	public void destroy()
	{
		System.out.println("Bean has been destroyed");
	}
}


