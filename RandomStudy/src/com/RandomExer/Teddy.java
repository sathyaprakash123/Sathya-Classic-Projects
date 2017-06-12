package com.RandomExer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Teddy extends Thread{
	
	public static void main(String args[])
	{
		
		ExecutorService exec = Executors.newFixedThreadPool(5); 
		 ;
		
		for (int i =0;i<5;i++)
		{
	    Runnable roy = new Sema();
	    exec.execute(roy);
		}
		
	}
	
	

}
