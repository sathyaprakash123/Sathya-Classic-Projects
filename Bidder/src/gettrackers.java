import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class gettrackers {	
	
	
	public static void main(String args[]) throws IOException, ParserConfigurationException, SAXException
	{
		
		for (int ii =0;ii<=50;ii++)
		{
	// Read request url
	StringBuilder pay = new StringBuilder();
	String line;
	String payload = "";
	File file1 = new File("C:/Users/sathyaprakash/Desktop/mobjson.txt");
	FileReader fr1 = new FileReader(file1);
	BufferedReader br1 = new BufferedReader(fr1);
	while((line = br1.readLine()) != null)
	{
		pay.append(line);
	}
	
	
	URL url = new URL("http://shadow01.yumenetworks.com/dynamic_preroll_playlist.vast2xml?domain=1450HEDQNtIV&placement_id=72713");
	HttpURLConnection con = (HttpURLConnection) url.openConnection();
	con.setRequestMethod("POST");
	con.setDoOutput(true);
	con.setDoInput(true);
	con.setRequestProperty("User-Agent","Mozilla/5.0 (Linux; U; Android 4.0.3; ko-kr; LG-L160L Build/IML74K) AppleWebkit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30");
	con.connect();
	
	
	OutputStream os = con.getOutputStream();
	PrintWriter pr1 = new PrintWriter(new OutputStreamWriter(os));
	pr1.write(pay.toString());
	pr1.close();
	System.out.println("Response Code : " + con.getResponseCode());
	
	
	//Download request url
	DocumentBuilderFactory db = DocumentBuilderFactory.newInstance();
	DocumentBuilder dbs = db.newDocumentBuilder();
	Document doc = dbs.parse(con.getInputStream());
	
	//Parse request url
	File file = new File("C:/Users/sathyaprakash/Desktop/trackerout2.txt");
	//FileWriter fw = new FileWriter(file, true);
	FileWriter ff = new FileWriter(file, true);
	BufferedWriter bw = new BufferedWriter(ff);
	PrintWriter ppr = new PrintWriter(bw);
	
	doc.getDocumentElement().normalize();
	NodeList nl = doc.getElementsByTagName("Impression");
	
	for (int i=0;i<nl.getLength();i++)
	{
		ppr.write(nl.item(i).getTextContent().toString().replaceAll("\\s+",""));
		System.out.println("impression : " + nl.item(i).getTextContent().replaceAll("\\s+",""));
		ppr.write(System.getProperty("line.separator"));
	}
	
	NodeList nl2 = doc.getElementsByTagName("Tracking");
	System.out.println("Quartile Trackers Length : "+ nl2.getLength());
	
	for (int x1=0;x1<nl2.getLength();x1++)
	{
		ppr.write(nl2.item(x1).getTextContent().toString().replaceAll("\\s+",""));
		System.out.println("quartiles : " + nl2.item(x1).getTextContent().replaceAll("\\s+",""));
		ppr.write(System.getProperty("line.separator"));
	}
	ppr.close();
	
	System.out.println("Count : " + ii + " Complete");
		}
		
	}
		
}
