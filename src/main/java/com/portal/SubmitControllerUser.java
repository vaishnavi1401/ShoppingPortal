package com.portal;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.portal.Service.AdminService;
import com.portal.Service.UserService;


@Controller
public class SubmitControllerUser
{
	@RequestMapping("/user")
	public String user()
	{
		return("userlogin");
	}
	/*
	@RequestMapping("/user1")
	public String user1()
	{
		return("Welcome");
	}
*/

@RequestMapping("/user1")
public  ModelAndView user1(HttpServletRequest re,HttpServletResponse req) throws ClassNotFoundException{
	String user=(re.getParameter("username"));
	String psw=(re.getParameter("passward"));
	
	boolean b=false;
	

	UserService as1=new UserService();	
	ModelAndView mv=new ModelAndView();
	 System.out.println("hello");
	 mv.setViewName("admin");
	try {
	 b=as1.check(user,psw);
}
catch(Exception e) {
e.printStackTrace();
System.out.println(b);
} 
	if(b)
	{
	System.out.println("hello");
	mv.addObject("result","Successful");	}
	else
	{
		System.out.println("hello1");
		mv.addObject("result","NotSuccesfull");
	}
	
return mv;
}
}