package com.portal.Service;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserService {


	Statement stmt = null;
	ResultSet r = null;
	int res;

public boolean check(String user,String psw) throws ClassNotFoundException
{
	
	boolean b=false,b1=false;

	
	String query,email1,psw1;

		try {
			MyConnection1 ma=new MyConnection1();
			b=ma.check();
			if(b)
			{
				stmt = ma.conn.createStatement();
				query="INSERT INTO user values("  +user+ ",'" + psw+ "')"; 
				res=stmt.executeUpdate(query);
			r = stmt.executeQuery("SELECT * FROM user");
			while(r.next()) {
				email1 = r.getString(1);
				//psw = r.getInt(2);
				psw1 = r.getString(2);
				//msal = r.getInt(4);
				//System.out.println(email1+" "+psw1);
				if(user.equals(email1)&&psw1.equals(psw))
					b1=true;
				
			}
			stmt.close();
		//	ma.conn.close();
		}
		}
		catch(SQLException s) {
			s.printStackTrace();
		}
		System.out.println(b);
	return b1;	
	}

}
