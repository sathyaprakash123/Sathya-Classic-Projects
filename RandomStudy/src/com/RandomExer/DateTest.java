package com.RandomExer;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {


	public static void main(String args[])
	
	{
		
		
		float f;
		DecimalFormat df = new DecimalFormat("#.##");
		double x = 5.345343;
		System.out.println("Decimal Number : " + df.format(x));
		
		
	DateFormat datefor = new SimpleDateFormat("YYYYMMDD_HH:MM:SS");	
	Date date = new Date();
	String dateVal = datefor.format(date);
	System.out.println("Date Value : " + dateVal);
	
	
		
	}
	
	
	
}
