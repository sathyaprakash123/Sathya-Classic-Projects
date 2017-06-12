import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HttpsURLConnection;

public class fire {

	
	StringBuilder sb = new StringBuilder();
	public static void main(String args[]) throws IOException
	{
	String line;
	StringBuilder sb;
	File file = new File("C:/Users/sathyaprakash/Desktop/trackerout1.txt");
	BufferedReader br = new BufferedReader(new FileReader(file));
	while ((line = br.readLine())!=null)
	{
		System.out.println("Tracker Url   : " + line.toString());
		URL url = new URL(line.toString());
		URLConnection con = (URLConnection) url.openConnection();
		
		if (con instanceof HttpURLConnection)
		{	
	    HttpURLConnection con1 = (HttpURLConnection) url.openConnection();
        con1.setRequestMethod("GET");
        con1.setRequestProperty("User-Agent","Mozilla/5.0 (Linux; U; Android 4.0.3; ko-kr; LG-L160L Build/IML74K) AppleWebkit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30");
        con1.connect();
        System.out.println("Response Code : " + con1.getResponseCode());
		}
		else
		{
			HttpsURLConnection con2 = (HttpsURLConnection) url.openConnection();
	        con2.setRequestMethod("GET");
	        con2.setRequestProperty("User-Agent","Mozilla/5.0 (Linux; U; Android 4.0.3; ko-kr; LG-L160L Build/IML74K) AppleWebkit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30");
	        con2.connect();
	        System.out.println("Response Code : " + con2);
	        
			
			}
		}
	
	System.out.println("Completed");
	
	}
	
	
}


