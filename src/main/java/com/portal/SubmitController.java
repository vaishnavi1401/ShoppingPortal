package com.portal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.portal.Service.AdminService;
//import com.spring.service.AddService;

@Controller
public class SubmitController {
	@RequestMapping(value="/admin")
	public String admin()
	{
		return("Display1");
	}

@RequestMapping(value="/submit")
public  ModelAndView submit1(HttpServletRequest re,HttpServletResponse req){
	String user=(re.getParameter("username"));
	String psw=(re.getParameter("passward"));
	
	boolean b=false;
	

	AdminService as1=new AdminService();	
	ModelAndView mv=new ModelAndView();
	 System.out.println("hello");

	 mv.setViewName("item");

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
		}
	else
	{
		System.out.println("hello1");
	}
return mv;
}
}