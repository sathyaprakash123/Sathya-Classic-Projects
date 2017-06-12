package com.SpringSathya;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
	

		private List list = new ArrayList();
		
		public void includeValue(String string)
		{
			
			list.add(string);
			
			
		}
		
		public void displayList()
		{
			System.out.println(list);
			Iterator it = list.iterator();
			System.out.println(it.next());
			System.out.println(it.next());
			
		}
		
		
	}


