package com.RandomExer;

import java.io.Serializable;

public class Emp1 implements Serializable{
	
	public enum value{
		HIGH,
		LOW,
		MEDIUM
	}
	
	public String name;
	public int age;
	public int sal;
	public transient int id;
	public value val;
	
	public void displayAll()
	{
		System.out.println("Name :"+name +" Age: "+age+ " Sal: "+sal+ " id "+id+" Value : "+ val);
	}
	

}
