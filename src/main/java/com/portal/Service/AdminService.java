package com.portal.Service;

public class AdminService {

public boolean check(String user,String psw)
{ 
	boolean b=false;
//System.out.println("true1");
	if(user.equals("vaishnavi")&&psw.equals("1234"))
		b=true;
	//boolean b1=psw.equalsIgnoreCase(pswr);
	return b;
}

}
