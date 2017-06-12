package com.resto;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class rssReader {
	
	public StringBuilder rssParser(String urlValue) throws ParserConfigurationException, SAXException, IOException
	{
		
		String line;
		String url = urlValue;
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(url);
		
		doc.getDocumentElement().normalize();
		NodeList title1 = doc.getElementsByTagName("title");
		NodeList description1 = doc.getElementsByTagName("description");
		StringBuilder sb = new StringBuilder();
		
		
		for (int i = 0;i < title1.getLength(); i++)
		{
		    try {
			System.out.println(title1.item(i).getTextContent());
			System.out.println(description1.item(i).getTextContent());
			sb.append(title1.item(i).getTextContent().toString());
			sb.append("\n");
			sb.append(description1.item(i).getTextContent().toString());
			sb.append("\n");
		    }
		    
		    catch (NullPointerException e)
		    {
		    	System.out.println("Yup, its null pointer exception");
		    }
				
			
		}
		
		System.out.println(sb);
	    return sb;	
  
	}
	
	
}
