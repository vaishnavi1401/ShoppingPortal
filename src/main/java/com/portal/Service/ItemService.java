package com.portal.Service;

import java.sql.*;


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
				query = "INSERT INTO item values('" + itemname + "',"+ quantity +"," +price_per_item +")";
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

public boolean check(String olditemname,String itemname) {
	// TODO Auto-generated method stub
	boolean b=false;int j=1;
	String query,iname;
		try {
			MyConnection1 ma=new MyConnection1();
			PreparedStatement ps = null;
			b=ma.check();
			if(b)
			{
				stmt = ma.conn.createStatement();
				//try {
				if(j==1) {
				query = "update item set itemname = ? where itemname = ? ;";
				}
				else if(j==2)
					query = "update item set quantity = ? where quantity = ? ;";
				else 
					query = "update item set price = ? where price = ? ;";
				ps = ( ma.conn).prepareStatement(query);         
				            ps.setString(1,itemname); 
				           ps.setString(2, olditemname); 
				            int i = ps.executeUpdate();
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

public boolean check(String itemname) {
	// TODO Auto-generated method stub
	boolean b=false;int j=1;
	String query,iname;
		try {
			MyConnection1 ma=new MyConnection1();
			PreparedStatement ps = null;
			b=ma.check();
			if(b)
			{
				stmt = ma.conn.createStatement();
				//try {
					query = "delete from  item  where itemname ="+itemname ;
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
