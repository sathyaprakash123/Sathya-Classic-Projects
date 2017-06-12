package com.RandomExer;

import java.sql.*;


public class jdbc {
	
	public static void main(String args[]) throws SQLException
	{

	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sathya","yume123");
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from emp1");  
		while(rs.next())  
		{
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			  
			//step5 close the connection object  
			con.close();  
			  
			}  
			  
			  
		
		
		
	} 
	catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
	

	
	
}
}
