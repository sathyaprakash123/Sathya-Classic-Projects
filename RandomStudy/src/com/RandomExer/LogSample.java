package com.RandomExer;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogSample {

	public static void main(String args[])
	{
	
		Logger log = Logger.getLogger("com.RandomExer.LogSample");
		log.log(Level.SEVERE, "Shutting down");
		log.log(Level.INFO, "Just chill mate. Everything is fucked");
			
	}
	
	}
