package com.RandomExer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class workers implements Runnable{
	
	private employee emp;
	
	public workers(employee emp)
	{
		this.emp = emp;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		emp.getDetails();
		try {
			emp.getDetails();
			emp.setDetails("ajay", "male", 45);
			emp.getDetails();
			emp.setDetails("ram", "not decided", 23);
			emp.getDetails();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public static void main(String args[])
	{
		
		employee emp = new employee();
		ExecutorService exec = Executors.newFixedThreadPool(5);
		
		for (int i=0;i<5;i++)
		{
			Runnable workerguy = new workers(emp);
			exec.execute(workerguy);
		}
		
		
	}
	
	
}
