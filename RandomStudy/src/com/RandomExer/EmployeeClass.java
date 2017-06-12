package com.RandomExer;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class EmployeeClass {

	private String name;
	private int age;
	private int sal;
	
	
	public EmployeeClass(String name, int age, int sal)
	{
		
		this.name = name;
		this.age = age;
		this.sal = sal;
		
	}
	
	
	public void setEmpolyee(String name, int age, int sal)
	{
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	
	public void displayEmp()
	
	{
		System.out.println("Name : "+ name);
		System.out.println("age" + age);
		System.out.println("Sal" + sal);
		
	}
	
	
}
