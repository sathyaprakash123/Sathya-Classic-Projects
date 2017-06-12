package com.RandomExer;

import java.util.Observable;
import java.util.Observer;

public class Obser implements Observer{

	
	private Observed obs = null;
	
 

@Override
public void update(Observable obs1, Object arg1) {
	// TODO Auto-generated method stub
	
	obs = (Observed) obs1;
	System.out.println("Current Name = " + obs.getName());
	
}

public static void main(String args[])
{

	
Observed a = new Observed();
Obser b = new Obser();
System.out.println(a.getName());
a.addObserver(b);
a.setName("Hula");
a.setName("Ula");



}
}
