package com.RandomExer;

import java.util.concurrent.Semaphore;


public class employee {
	
	public String name, gender;
	private int age;
	
	public employee()
	{
		name = "Sathya";
		gender = "male";
		age = 35;
	}
	
	Semaphore lock = new Semaphore(1);

	
	
	public void getDetails()
	{
		System.out.println("Reading done by :"+ Thread.currentThread().getName());
		System.out.println("Name = "+ name + "  Age :"+ age+ " Gender : "+ gender);
		System.out.println("Reading done by : " + Thread.currentThread().getName());
		
	}
	
	public void setDetails(String name, String gender, int age) throws InterruptedException
	{
		System.out.println("Currently writing in progress by thread" + Thread.currentThread().getName());
		lock.acquire();
		this.name = name;
		this.gender = gender;
		this.age = age;
		lock.release();
		System.out.println("Writing Completed by "+ Thread.currentThread().getName());
	}
	
	
}
