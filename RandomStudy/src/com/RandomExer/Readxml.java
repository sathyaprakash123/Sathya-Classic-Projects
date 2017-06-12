package com.RandomExer;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;

public class Readxml {

	public static void main(String args[]) throws IOException
	{
		URL url = new URL("http://shadow01.yumenetworks.com/dynamic_preroll_playlist.vast2xml?domain=1450euOcgaFe");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String line;
		StringBuilder sb = new StringBuilder();
		
		while((line = br.readLine())!= null)
		{
			sb.append(line);
			System.out.println(line);
		}
			
		PrintWriter pr = new PrintWriter(new FileWriter("C:/Users/sathyaprakash/Desktop/Sat.txt"));
		System.out.println(sb);
		pr.write(sb.toString());
		pr.close();
		System.out.println("File Written");
		
		LinkedList ll = new LinkedList();
		ll.add("test");
		ll.add("hello");
		ll.add("uno");
		ll.add("jumiya");
		System.out.println("List items:"+ll);
		
		ArrayList al = new ArrayList();
		al.addAll(ll);
		System.out.println("Array List items: "+ al);
		
		
		
		
		
	}
	
	
	
}
