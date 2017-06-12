package com.RandomExer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class RestCaller {
	StringBuffer xml;

	public StringBuffer getSomthin(String urlValue) throws IOException
	{
		
		
		URL url = new URL(urlValue);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String x;
		while( (x= br.readLine()) != null)
		{
		 
			xml.append(x);
		}		
		
		return xml;
		
	}
	
	public static void main(String args[]) throws IOException
	{
		RestCaller caller = new RestCaller();
		StringBuffer jsonValue = caller.getSomthin("https://localhost:8081/Resto/rest/restbar/mongo");
		System.out.println(jsonValue);
				
	}
	
	
}
