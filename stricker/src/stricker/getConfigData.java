package stricker;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class getConfigData {
	String reqUrl,PostBody,responseXML;
	String userAgent="Mozilla/5.0 (iPad; U; CPU OS 3_2 like Mac OS X; en-us) AppleWebKit/531.21.10 (KHTML, like Gecko) Version/4.0.4 Mobile/7B334b Safari/531.21.10";
	
	public void ParseConfigXML() throws ParserConfigurationException, SAXException, IOException
	{
		DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = dbfactory.newDocumentBuilder();
		Document doc = builder.parse("C:/Users/sathyaprakash/workspace/stricker/src/resources/configFile.xml");
		//Document doc = builder.parse(file);
		doc.getDocumentElement().normalize();
		
		NodeList url = doc.getElementsByTagName("RequestUrl");
		reqUrl = url.item(0).getTextContent();
		NodeList body = doc.getElementsByTagName("PostJson");
		PostBody = body.item(0).getTextContent();
	}
	
	public String getRequestUrlValue()
	
	{
		return reqUrl;
			
				
	}
	
	public String getPostJson()
	
	{
	
	return PostBody;
		
	}
	
	public void intiateRequest() throws IOException
	{
		String line = null;
		StringBuilder sb = new StringBuilder();
		URL url = new URL(reqUrl);
		
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("POST");
	    con.setRequestProperty("User-Agent",userAgent);
	    con.setRequestProperty("Content-Type", "application/json");
	    con.setDoOutput(true);
	    con.setDoInput(true);
			
	    DataOutputStream pr = new DataOutputStream(con.getOutputStream());
		pr.writeBytes(PostBody);
		pr.close();
		
		System.out.println("Request made. Response Code:"+con.getResponseCode());
		
		BufferedReader br= new BufferedReader(new InputStreamReader(con.getInputStream()));
		while ((line=br.readLine()) != null)
		{
			sb.append(line);
		}
		responseXML = sb.toString();
		System.out.println("Ad Response:"+ sb.toString());
		
	}
	
	
	public void intiateRequestGet() throws IOException
	{
		String line = null;
		StringBuilder sb = new StringBuilder();
		URL url = new URL(reqUrl);
		
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
	    con.setRequestProperty("User-Agent",userAgent);
	    con.setRequestProperty("Content-Type", "application/json");
	    con.setDoOutput(true);
	    con.setDoInput(true);
			
	    DataOutputStream pr = new DataOutputStream(con.getOutputStream());
		pr.close();
		
		System.out.println("Request made. Response Code:"+con.getResponseCode());
		
		BufferedReader br= new BufferedReader(new InputStreamReader(con.getInputStream()));
		while ((line=br.readLine()) != null)
		{
			sb.append(line);
		}
		responseXML = sb.toString();
		System.out.println("Ad Response:"+ sb.toString());
		
	}
		
	public void fireTrackers() throws ParserConfigurationException, SAXException, IOException
	{
		
		System.out.println("********** Firing tracking events ***************");
		DocumentBuilderFactory dbfac= DocumentBuilderFactory.newInstance();
		DocumentBuilder dbb = dbfac.newDocumentBuilder();
		InputSource is = new InputSource(new StringReader(responseXML));
		Document doc = dbb.parse(is);
		doc.getDocumentElement().normalize();
		
		
		NodeList imp = doc.getElementsByTagName("Impression");
		for (int i=0;i<imp.getLength();i++)
		{
			URL url = new URL(imp.item(i).getTextContent());
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			System.out.println("Click Event:"+imp.item(i).getTextContent()+" : "+con.getResponseCode());
					
		}
		
		NodeList TrackingEvents = doc.getElementsByTagName("Tracking");
		for (int i=0;i<TrackingEvents.getLength();i++)
		{
			URL url = new URL(TrackingEvents.item(i).getTextContent());
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			System.out.println("Url:"+TrackingEvents.item(i).getTextContent()+": "+con.getResponseCode());
					
		}
		
		NodeList click = doc.getElementsByTagName("ClickTracking");
		for (int i=0;i<click.getLength();i++)
		{
		
		
		URL clicktracker = new URL(click.item(i).getTextContent());
		HttpURLConnection click1 = (HttpURLConnection) clicktracker.openConnection();
		click1.setRequestMethod("GET");
		System.out.println("Url:"+click.item(i).getTextContent()+": "+click1.getResponseCode());
		}
						
	}
	
	
}

