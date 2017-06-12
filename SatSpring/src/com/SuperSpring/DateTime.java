package com.SuperSpring;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {

	private String time;
	private static final String YYYYMMDD_HHMMSS = null;

	public void displayTime()
	{
		
		DateFormat df = new SimpleDateFormat("YYYY:MM:DD_HH:MM:SS");
		Date date = new Date();
		time = df.format(date);
		System.out.println("Current Date is : " +  time);
		
	}
	
	
}
