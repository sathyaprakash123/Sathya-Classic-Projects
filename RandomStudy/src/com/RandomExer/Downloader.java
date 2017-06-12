package com.RandomExer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.text.DecimalFormat;

public class Downloader {
	
	public static void main(String args[]) throws IOException
	{
		
		String url = args[0];
		String path = "c:/dell/test.jpg";
		URL link = new URL(url);
		BufferedInputStream br = new BufferedInputStream(link.openStream());
		FileOutputStream file = new FileOutputStream(path);
		BufferedOutputStream bout = new BufferedOutputStream(file, 1024);
		
		byte data[] = new byte[1024];
		int i;
		int total = 0;
		double mb;
		
		while((i = br.read(data, 0, 1024)) >= 0)
		{
			
			bout.write(data,0,i);
			total = total + i;
			mb = total / 1024;
			System.out.println("Downloaded "+ mb + " so far");
			
		}
	  
		System.out.println("File Downloaded");
	}
	

}
