package com.RandomExer;

public class InnerClass {

	private int age;
	private String name;
	
	private void outerMethod()
	{
		System.out.println("Outer Class Method");
		inner1 i1 = new inner1();
		i1.outerMethod();
			
	}
	
	
	public class inner1
	{
		
		public void outerMethod()
		{
			System.out.println("inner1 Method");
			inner2 i2 = new inner2();
			i2.outerMethod();
			
		}
		
		public int age;
		public String name;
		
		
		private class inner2
		{
			private int age;
			private String name;
			
			public void outerMethod()
			{
				System.out.println("inner2 Method");
			}
				
			
		}
				
		
	}
	
	
	public static void main(String args[])
	{
		InnerClass in = new InnerClass();
		in.outerMethod();
		
		
		
	}
	
	
}
