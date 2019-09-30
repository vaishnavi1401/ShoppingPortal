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
{	@RequestMapping(value="/user")
	public String user()
	{
		return("userlogin");
	}
	@RequestMapping(value="/newuser")
	public String newuser()
	{
		return("newuser");
	}
@RequestMapping("/user1")
public  ModelAndView user1(HttpServletRequest re,HttpServletResponse req) throws ClassNotFoundException{
	String user=(re.getParameter("username"));
	String psw=(re.getParameter("passward"));
	
	boolean b=false;
	

	UserService as1=new UserService();	
	ModelAndView mv=new ModelAndView();
	
	try {
	 b=as1.check(user,psw);
}
catch(Exception e) {
e.printStackTrace();
System.out.println(b+"hello");
} 
	if(b)
	{
		 mv.setViewName("cart");
	System.out.println("hello");
	mv.addObject("result","Successful");	}
	else
	{ mv.setViewName("newuser");
		System.out.println("hello1");
		mv.addObject("result","INVALID");
	}
	
return mv;
}

@RequestMapping(value="/admin1")
public ModelAndView admin1()
{	ModelAndView mv=new ModelAndView();
mv.setViewName("admin");
mv.addObject("result","Successful");
return mv;
}

@RequestMapping("/newuser1")
public  ModelAndView newuser1(HttpServletRequest re,HttpServletResponse req) throws ClassNotFoundException{
	String user=(re.getParameter("username"));
	String add=(re.getParameter("address"));
	String psw=(re.getParameter("passward"));
	String psw1=(re.getParameter("passward1"));
	System.out.println(user);
	
	boolean b=false;
	

	UserService as1=new UserService();	
	ModelAndView mv=new ModelAndView();
	
	try {
	 b=as1.check(user,add,psw,psw1);
}
catch(Exception e) {
e.printStackTrace();
System.out.println(b);
} 
	if(b)
	{
		 mv.setViewName("admin");
	System.out.println("hello");
	mv.addObject("result","Successful");	}
	else
	{ mv.setViewName("newuser");
		System.out.println("hello1");
			}
	
return mv;
}

}