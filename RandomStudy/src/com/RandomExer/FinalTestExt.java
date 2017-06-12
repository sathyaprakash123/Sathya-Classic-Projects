package com.RandomExer;

public class FinalTestExt extends FinalTest{
	
	public void FinalTestExtMethod()
	{
		System.out.println("Printing Method FinalTetExtMethod");
		InnerClass ss = new InnerClass();
		ss.innerMethod();
		printSomething();
		
	}
	
	
	public class InnerClass
	{
		public void innerMethod()
		{
			System.out.println("Method from inside inner class");
		}
	}
	
	
	public static void main(String args[])
	
	{
		FinalTestExt ft = new FinalTestExt();
		ft.printSomething();
		ft.FinalTestExtMethod();
		
		
				
	}

	
	
}
