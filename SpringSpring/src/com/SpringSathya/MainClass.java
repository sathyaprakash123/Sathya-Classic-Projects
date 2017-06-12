package com.SpringSathya;
import java.util.Iterator;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String args[])
	
	{
		AbstractApplicationContext xx = new ClassPathXmlApplicationContext("Beans.xml");
		
		ResourceClass rs = (ResourceClass) xx.getBean("ResourceClass");
		rs.findData();
		
		ResourceClass rs1 = (ResourceClass) xx.getBean("ResourceClass");
		rs1.setMessage("Hello, New message");
		rs1.findData();
		
		ListTest ls = (ListTest) xx.getBean("ListTest");
		ls.includeValue("Sathya");
		ls.includeValue("Surya");
		ls.includeValue("Bala");
		ls.displayList();
		
		
		
		
	}
	
}
