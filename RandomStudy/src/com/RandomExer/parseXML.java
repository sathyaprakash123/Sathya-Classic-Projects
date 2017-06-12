package com.RandomExer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class parseXML {

	public String parse(String x) throws IOException
	{
		URL url = new URL(x);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
		StringBuilder sb = new StringBuilder();
		String line;
		
		while ((line = br.readLine()) != null)
		{
			sb.append(line);
		}
		
		System.out.println(sb.toString());
		return sb.toString();
					
		
	}
	
	public void invoke_trackers(String payload) throws ParserConfigurationException,  IOException, SAXException
	{
		try {
			
			
		DocumentBuilderFactory db = DocumentBuilderFactory.newInstance(); 
		DocumentBuilder d = db.newDocumentBuilder();
		Document doc = d.parse(payload);
		doc.getDocumentElement().normalize();
	    NodeList nl = doc.getElementsByTagName("Impression");
				
		for (int i=0;i<nl.getLength();i++)
		{
			URL url = new URL(nl.item(i).getTextContent().toString());
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setDoOutput(true);
			Integer responsecode = con.getResponseCode();
			System.out.println("Pinged Url : " + nl.item(i).getTextContent().toString() + " Response Code :" + responsecode);
			
			
		}
		
		}
		
		
		catch (MalformedURLException e)
		{
			System.out.println("Exception caught :" + e);
		}
		
	
		
	}
	
	
	public static void main(String args[]) throws IOException, ParserConfigurationException, SAXException
	{
		String link = args[0];
		parseXML x = new parseXML();
		String pay = x.parse(link);
		x.invoke_trackers(args[0]);
		
	}
	
}
