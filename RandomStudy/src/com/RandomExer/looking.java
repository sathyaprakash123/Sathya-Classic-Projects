package com.RandomExer;

import java.util.Observable;
import java.util.Observer;

public class looking implements Observer{

	looked l = null;
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
		l = (looked) o;
		l.getName();		
		
	}

	
	public static void main(String args[])
	{
		looked looked = new looked();
		looking looking = new looking();
		
		looked.addObserver(looking);
		
		looked.getName();
		looked.setName("halio");
		looked.setName("jiza");
		looked.setName("sathya");
	}
	
	
}
