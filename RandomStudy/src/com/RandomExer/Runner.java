package com.RandomExer;

public class Runner implements Runnable{
	
	static Integer variable = 0;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		variable ++;
		System.out.println("Thread Running : " + Thread.currentThread() + "Variable Value = "+ variable);
		
	}

	
	public static void main(String args[])
	{
		Runner t1 = new Runner();
	    Thread tt1 = new Thread(t1);
	    
	    Runner t2 = new Runner();
	    Thread tt2 = new Thread(t2);
	    
	    tt1.start();
	    tt2.start();
	    
	    System.out.println(Runner.variable);
		
	}
	
	
}
