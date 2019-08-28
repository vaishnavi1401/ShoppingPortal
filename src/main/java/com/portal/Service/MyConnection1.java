package com.portal.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyConnection1 {


	boolean b=false;
Connection conn;
	Statement stmt = null;
	ResultSet r = null;
	int res;
public boolean check()
{ 
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shoppingportal","root","");
			{
			//	System.out.println("Connection Successful !");
				b=true;
			}
			
			
			}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException s) {
			s.printStackTrace();
		}
	//	System.out.println(b);

	return b;	
	}

}