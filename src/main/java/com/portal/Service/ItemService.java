package com.portal.Service;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ItemService
{
	Statement stmt = null;
	ResultSet r = null;
	int res;

public boolean check(String itemname,int quantity,int price_per_item) throws ClassNotFoundException
{	
	boolean b=false;
	String query,iname;
		try {
			MyConnection1 ma=new MyConnection1();
			b=ma.check();
			if(b)
			{
				stmt = ma.conn.createStatement();
				query = "insert into item values ('" + itemname + "',+ quantity + price_per_item ";

				res=stmt.executeUpdate(query);
			r = stmt.executeQuery("SELECT * FROM item");
			while(r.next()) {
				iname = r.getString(1);
				System.out.println(iname);
				
			}
			stmt.close();
		}
		}
		catch(SQLException s) {
			s.printStackTrace();
		}
		System.out.println(b);
	return b;	
	}

}
