package com.RandomExer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadingFile {

	public static void main(String args[]) throws IOException
	{
		
		URL url = new URL("http://hyperphysics.phy-astr.gsu.edu/hbase/mechanics/mechpic/rocketp.jpg");
		File dest = new File("C:/Users/sathyaprakash/Desktop/carfile.jpg");
		InputStream is = url.openStream();
		OutputStream os = new FileOutputStream(dest);
	    byte[] by = new byte[2048];
	    int length;
	    while ((length = is.read(by)) != -1 )
	    {
	    	os.write(by, 0, length);
	    	
	    }
		 System.out.println("------- Completed ------------");
	}
	
}
