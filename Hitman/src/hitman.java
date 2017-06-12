import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
// import org.apache.commons.validator.UrlValidator;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;




public class hitman {

	static String url;
	static String XMLContent;
	static int repeat;

	@SuppressWarnings("deprecation")
/*	public boolean checkUrl(String urlvalue)
	{

		UrlValidator uv = new UrlValidator();
		if (uv.isValid(urlvalue))
		{return true;} 
		else
		{return false;}
	} */

	public static String downloadXML(String urlvalue) throws MalformedURLException, IOException

	{
		try {
			String readvalue;
			URLConnection con;
			URL link = new URL(urlvalue);
			con = link.openConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			StringBuilder sb = new StringBuilder();

			while ((readvalue = br.readLine()) != null)
			{
				sb.append(readvalue);
			}

			XMLContent = sb.toString();
			return sb.toString();
		}

		catch (UnknownHostException uhe)
		{
			System.out.println("Unknown Host Exception. Url invalid");
			XMLContent = "";
			return null;
		}

	}



	public void strike(String content)

	{
		try {
			URL url = new URL(content);
			URLConnection conn = url.openConnection();
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(conn.getInputStream()); 
			NodeList nodes = doc.getChildNodes();
			NodeList impression = doc.getElementsByTagName("Impression");
			//String firstquartile = doc.getElementsByTagName("Tracking").item(0).getTextContent();
			NodeList Quartile = doc.getElementsByTagName("Tracking");
			//System.out.println(firstquartile);
			
				


			for (int i = 0; i<impression.getLength();i++)
			{
				URL tracker = new URL(impression.item(i).getTextContent());
				HttpURLConnection getrequest = (HttpURLConnection) tracker.openConnection();
				getrequest.setRequestMethod("GET");
				getrequest.setRequestProperty("User-Agent", "Mozilla/5.0");
				int x = getrequest.getResponseCode();
				System.out.println("Pinging : "+impression.item(i).getTextContent()+ "||Response Status: "+  x);
			}
			
					for (int i = 0; i<Quartile.getLength();i++)
			{   URL tracker = new URL(Quartile.item(i).getTextContent());
				HttpURLConnection getrequest = (HttpURLConnection) tracker.openConnection();
				getrequest.setRequestMethod("GET");
				getrequest.setRequestProperty("User-Agent", "Mozilla/5.0");
				int x = getrequest.getResponseCode();
				System.out.println("Pinging : "+Quartile.item(i).getFirstChild().getTextContent()+ "||Response Status: "+  x);
			}
					

		}
		catch (Exception pce)
		{ System.out.println("Exception in Reading XML file. Invalid XML ");}

	}

	public String getUserInput() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("Type Ad Request Url :");
		String urlinput = br.readLine();
		return urlinput;
	}

	public int repeat() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("Type Impression Numbers: ");
		String urlinput = br.readLine();
		return Integer.parseInt(urlinput);
	}



	public static void main(String args[]) throws IOException
	{

		hitman hitman = new hitman();
		url = hitman.getUserInput();
		repeat = hitman.repeat();

	/*	if (hitman.checkUrl(url) == false)

		{
			System.out.println("Url Incorrectly Formed");

		}

		else

		{ */

			System.out.println("Url Formed Correctly");
			for (int i =0;i<repeat;i++)
			{hitman.strike(url);}
			
//		}
			System.out.println("*********** COMPLETED ***************");
	}

}
