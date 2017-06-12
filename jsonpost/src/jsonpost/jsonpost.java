package jsonpost;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class jsonpost  {

	
	public static void main(String args[]) throws IOException
	{
	String buffer;
	StringBuilder sb = new StringBuilder();
	BufferedReader br = new BufferedReader(new FileReader("C:/Users/sathyaprakash/Desktop/jsonpost.txt"));
	
	while((buffer = br.readLine().toString()) != null) 
	{
			
		
		sb.append(buffer);
		
	}
	System.out.println("String Builder Value = " + sb.toString());
	}
	
	}
	
	

