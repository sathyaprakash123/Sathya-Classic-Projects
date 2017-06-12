package com.resto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class sokker {
	
	public static void main(String args[]) throws IOException
	{
		ServerSocket ss = new ServerSocket(4003);
		
		while (true)
		{
		Socket con = ss.accept();
		BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
		StringBuilder str = new StringBuilder();
		String line = null;
		
		
		while ((line = br.readLine())!=null)
		{
			str.append(line);
			str.append(System.getProperty("line.separator"));
			System.out.println(line);
					
		}
	
		br.close();
		PrintWriter pr = new PrintWriter(con.getOutputStream(), true);
		pr.write(str.toString());
		
		
		
		}	
		
	
	}
	
	

}
