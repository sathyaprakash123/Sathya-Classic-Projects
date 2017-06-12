package com.RandomExer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class arrlist {

	
	private PriorityQueue<String> queue = new PriorityQueue<String>();
	
	public static void main(String args[])
	{
		arrlist ar = new arrlist();
		ar.queue.add("zulphi");
		ar.queue.add("janis");
		ar.queue.add("abbas");
		ar.queue.add("badshah");
		
		System.out.println("Contents of queue is : "+ ar.queue);
		ar.queue.remove();
		System.out.println("Contents of queue after removal : "+ ar.queue);
		ar.queue.poll();
		System.out.println("Contents of queue after polling is removal : "+ ar.queue);
		ar.queue.poll();
		
		
	}
	
	
	
	
	
}
