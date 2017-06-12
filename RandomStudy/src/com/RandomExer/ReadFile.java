package com.RandomExer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFile {

	public static void main(String args[]) throws IOException
	
	{
		FileReader fr = new FileReader("C:/Users/sathyaprakash/Desktop/Qualcomm_Ad_Response.txt");
		BufferedReader br = new BufferedReader(fr);
		FileWriter wr = new FileWriter("C:/Users/sathyaprakash/Desktop/Sat.txt");
		BufferedWriter wri = new BufferedWriter(wr);
		String line;
		while((line = br.readLine()) != null)
		{
			
			wri.write(br.readLine());
						
			
		}
		fr.close();
	    wri.close();
		
		
		
	}
	
	
	
}
