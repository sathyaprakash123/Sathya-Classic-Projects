import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class RssReader {

	public void rssParser(String urlValue) throws ParserConfigurationException, SAXException, IOException
	{
		
		String line;
		String url = urlValue;
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(url);
		
		doc.getDocumentElement().normalize();
		NodeList title1 = doc.getElementsByTagName("title");
		NodeList description1 = doc.getElementsByTagName("description");
			
		
		
		for (int i = 0;i < title1.getLength(); i++)
		{
		System.out.println(title1.item(i).getTextContent());
		System.out.println(description1.item(i).getTextContent());
		
				
			
		}
		
		
		
		
		
		
	}
	
	
	public static void main(String args[]) throws ParserConfigurationException, SAXException, IOException
	
	{
		RssReader feed = new RssReader();
		feed.rssParser("http://feeds.bbci.co.uk/news/rss.xml");
				
	}
	
}

