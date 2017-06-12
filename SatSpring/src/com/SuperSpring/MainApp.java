package com.SuperSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String args[])
	
	{
		AbstractApplicationContext cont = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj = (HelloWorld) cont.getBean("HelloWorld");
		obj.setMessage("Sathya is here");
		obj.getMessage();
		
		HelloWorld obj1 = (HelloWorld) cont.getBean("HelloWorld");
		obj1.getMessage();		
		
		DateTime obj2 = (DateTime) cont.getBean("DateTime");
		obj2.displayTime();
		
		
	}
	
}
