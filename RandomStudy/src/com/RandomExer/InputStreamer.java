package com.RandomExer;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;

public class InputStreamer {

	
	public static void main(String args[]) throws IOException
	{
		int i; char c;
		StringBuilder value = new StringBuilder();
		InputStream is = new FileInputStream("C:/Users/sathyaprakash/Desktop/Qualcomm_Ad_Response.txt");
		//OutputStream  os = new FileOutputStream("C:/Users/sathyaprakash/Desktop/Sat.txt");
		
		Writer pw = new PrintWriter("C:/Users/sathyaprakash/Desktop/Sat.txt");
		BufferedWriter bw = new BufferedWriter(pw);
		String line;
		
		
		
		while((i = is.read()) != -1)
		
		{
			
			System.out.println(i);
			value.append(Integer.toString(i));
					
			
		}
		
		
		System.out.println(value);
		pw.append(value);
		
	}

}
