package com.REST;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ServiceClass {

	public String getDate()
	{
		DateFormat dateformat = new SimpleDateFormat("YYYY_MM_DD : HH_MM_SS");
		Date date = new Date();
		String datevalue = dateformat.format(date);
		return datevalue;
	}
	
	
}
