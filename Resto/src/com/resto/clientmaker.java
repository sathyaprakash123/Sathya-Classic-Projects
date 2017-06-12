package com.resto;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class clientmaker {

	public static void main(String args[]) throws IOException
	
	{
		URL url = new URL("http://localhost:8080/Resto/rest/restbar/putsample");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", "Mozilla Firefox 2000");
		con.setRequestProperty("Content-Type", "application/json");
		con.setRequestProperty("Accept", "application/json");
		con.setDoOutput(true);
		OutputStreamWriter os = new OutputStreamWriter(con.getOutputStream());
		os.write("{\"name\":\"sathya\",\"age\":\"35\",\"city\":\"chennai\"}");	
		os.close();
		
		
	}
	
	
}
