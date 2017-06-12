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

public class xmlparser {

	public static void main (String args[]) throws IOException, ParserConfigurationException, SAXException
	
	{
		String s = args[0];
		URL url = new URL(s);		
		//URL url = new URL("http://shadow01.yumenetworks.com/dynamic_preroll_playlist.vast2xml?domain=1450euOcgaFe");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setDoOutput(true);
		
		DocumentBuilderFactory db = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = db.newDocumentBuilder();
		Document doc = builder.parse(con.getInputStream());
		doc.getDocumentElement().normalize();
		
		NodeList nl = doc.getElementsByTagName("Impression");
		System.out.println("Pinging Impression Trackers");
		System.out.println("***************************");
		for(int i=0;i<nl.getLength();i++)
		{
			
			System.out.println(nl.item(i).getTextContent());
			URL url1 = new URL(nl.item(i).getTextContent());
			HttpURLConnection con1 = (HttpURLConnection) url1.openConnection();
			con1.setRequestMethod("GET");
			con1.connect();
			System.out.println("Response Code : "+con.getResponseCode());
		}
		
	}
	
}
