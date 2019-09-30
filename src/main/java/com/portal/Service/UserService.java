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
				//query="INSERT INTO user values("  +user+ ",'" + psw+ "')"; 
				//res=stmt.executeUpdate(query);
			r = stmt.executeQuery("SELECT * FROM user");
			while(r.next()) {
				email1 = r.getString(1);
				psw1 = r.getString(3);
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
			return b1;	
	}

public boolean check(String user, String add, String psw, String psw1) {

	boolean b=false,b1=false;
	String query;
		try {
			MyConnection1 ma=new MyConnection1();
			b=ma.check();
			System.out.println(user);
			if(b&&psw.equals(psw1))
			{
				stmt = ma.conn.createStatement();
				query = "INSERT INTO user values('" + user + "','"+ add +"','" + psw   +"')";
				res=stmt.executeUpdate(query);
			stmt.close();
			b1=true;
		}
		}
		catch(SQLException s) {
			s.printStackTrace();
		}
	return b1;	
}

}
