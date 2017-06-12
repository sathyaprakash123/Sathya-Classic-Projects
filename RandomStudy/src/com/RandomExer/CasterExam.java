package com.RandomExer;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class CasterExam extends Caster{
	
	public void print()
	{
		System.out.println("Caster Exam method");
	}
	
	public static void main(String args[]) throws IOException
	{
		
		CasterExam ct = new CasterExam();
		Caster ot = (Caster) ct;
		ot.getData();
		
		
		
		
		
				
		
		
	}
	

}
