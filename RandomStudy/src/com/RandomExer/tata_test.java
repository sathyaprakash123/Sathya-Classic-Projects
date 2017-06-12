package com.RandomExer;

public class tata_test implements tata {

	@Override
	public void printAge() {
		System.out.println("Inside Print Age method");
		
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return 50;
	}
	
	
	public void newMethod()
	{
		System.out.println("Adding new method from the extended class");
	}
	
	public static void main(String args[])
	{
		tata_test tt = new tata_test();
		tt.printAge();
		System.out.println(tata.age);
		tt.newMethod();
		
	}

}
