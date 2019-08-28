package com.portal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	//System.out.println("true");
	boolean b=false;
	UserService as=new UserService();	
	//MyConnection1 ma=new MyConnection1();

	System.out.println("hello");
	ModelAndView mv=new ModelAndView();
	 //System.out.println("hello");
//	mv.setViewName("Welcome");
	


	 b=as.check(user,psw);

		//System.out.println("hello");
		System.out.println(b);
	if(b)
	{
		System.out.println("yes");
		mv.setViewName("Welcome");
		mv.addObject("result","Successful");
	}
	else
	{mv.setViewName("Welcome");
		mv.addObject("result","NotSuccesfull");
	}
		//mv.addObject("how","yes");
return mv;}
}