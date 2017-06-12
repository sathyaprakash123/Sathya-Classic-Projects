package com.RandomExer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serial {

	public static void main(String args[]) throws IOException
	{
		Emp1 e = new Emp1();
		e.name = "Shiva";
	    e.age = 35;
		e.id = 112233;
		e.sal=1000;
		e.val = e.val.HIGH;
		
		FileOutputStream fl = new FileOutputStream("C:/Users/sathyaprakash/Desktop/Sat.txt");
		ObjectOutputStream ob = new ObjectOutputStream(fl);
		ob.writeObject(e);
		ob.close();
		fl.close();
		
		
	}
	
}
