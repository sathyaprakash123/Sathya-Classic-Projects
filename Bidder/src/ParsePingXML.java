
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ParsePingXML {
	
	public void pingXML() throws ParserConfigurationException, SAXException, IOException
	{
		String line;
		String xml;
		StringBuilder jsontotal = new StringBuilder();
		File file = new File("C:/Users/sathyaprakash/Desktop/XMLresponse.txt");
		FileReader filetext = new FileReader(file);
		BufferedReader br = new BufferedReader(filetext);
	    while((line = br.readLine())!= null)
	    {
	    	
	    	jsontotal.append(line);
	    	jsontotal.append(System.getProperty("line.separator"));
	    	System.out.println(line);
	    	
	    }
		xml = jsontotal.toString();
		
		DocumentBuilderFactory fac = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = fac.newDocumentBuilder();
		Document doc = db.parse("C:/Users/sathyaprakash/Desktop/XMLresponse.txt");
		doc.getDocumentElement().normalize();
		NodeList nl = doc.getElementsByTagName("Impression");
		System.out.println("Pinging Impression Trackers");
		System.out.println("***************************");
		for(int i=0;i<nl.getLength();i++)
		{
			
			System.out.println(nl.item(i).getTextContent());
			URL url = new URL(nl.item(i).getTextContent());
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.connect();
			System.out.println("Response Code : "+con.getResponseCode());
		}
		
	}

	public static void main(String args[]) throws ParserConfigurationException, SAXException, IOException
	
	{
		ParsePingXML pps = new ParsePingXML();
		pps.pingXML();
	}
	
}
