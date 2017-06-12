package com.RandomExer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class UnSerial {
	
	

	public static void main(String args[]) throws IOException, ClassNotFoundException
	{
		Emp1 emp = null;
		FileInputStream fl = new FileInputStream("C:/Users/sathyaprakash/Desktop/Sat.txt");
		ObjectInputStream ob = new ObjectInputStream(fl);
		emp = (Emp1) ob.readObject();
		System.out.println("Name : "+emp.name+" Age:"+ emp.age+" Sal: "+emp.sal+" Id:"+ emp.id+" Enum Value :"+emp.val);
		emp.displayAll();		
	}
	
}
