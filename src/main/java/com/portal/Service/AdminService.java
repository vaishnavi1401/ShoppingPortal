package com.portal.Service;

public class AdminService {
	
 public boolean add(String psw,String pswr)
 {
	//boolean b=email.equalsIgnoreCase("vaishnaviaggarwal1401@gmail.com");
   boolean b1=false;
		  b1=psw.equalsIgnoreCase(pswr);
  return b1;
    
}
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
