import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class Getter {

	
	public static void main(String args[]) throws IOException, ParserConfigurationException, SAXException
	{
		StringBuilder xmlresponse = new StringBuilder();
		for (String s : args)
		{
		
		System.out.println("Pinging Url : "+s);
		URL url = new URL(s);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();
		System.out.println("Response Code : " + connection.getResponseCode());
		
		String sat;
		BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		while ((sat = br.readLine()) != null)
		{
			System.out.println(sat);
			xmlresponse.append(sat);
		}
		
		//ParsePingXML xmldata = new ParsePingXML();
		//xmldata.pingXML(xmlresponse.toString());
		
		}
	}
	
}
