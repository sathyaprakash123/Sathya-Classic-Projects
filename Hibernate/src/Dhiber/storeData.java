package Dhiber;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class storeData {

	public static void main(String args[])
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
	    Session session = factory.openSession();	
	    Transaction t = session.beginTransaction();
	    
	    Employee e1 = new Employee();
	    e1.setName("uuuuuuuuuuuudfjdbjdb");
	    e1.setGender("Female");
	    e1.setAge(70);
	    session.persist(e1);
	    t.commit();
	    session.close();
	    
	    Session sfx = factory.openSession();
	    Transaction t1 = sfx.beginTransaction();
	    List employees = sfx.createQuery("From Employee").list();
	     for (Iterator it = employees.iterator();it.hasNext();)
	    		 {
	    	 
	    	 Employee emp = (Employee) it.next();
	    	 System.out.println(emp.getAge());
	    	 System.out.println(emp.getName());
	    	 System.out.println(emp.getGender());
	    	 
	    	 	     }
	     t1.commit();
	     sfx.close();
	    
	    
	    
	    
	}
	
	
}
