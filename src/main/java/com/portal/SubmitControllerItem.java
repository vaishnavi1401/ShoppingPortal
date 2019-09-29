package com.portal;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.portal.Service.ItemService;

@Controller
public class SubmitControllerItem {
	  
@RequestMapping(value="/additem")
	public String additem()
	{
		
		return("additem");
	}

@RequestMapping(value="/updateitem")
public String updateitem()
{
	
	return("updateitem");
}
@RequestMapping(value="/deleteitem")
public String deleteitem()
{
	
	return("delete");
}
@RequestMapping(value="/itemupdatename")
public String itemupdatename()
{
	
	return("updatelist1");
}

@RequestMapping(value="/itemupdateprice")
public String itemupdateprice()
{
	
	return("updatelist2");
}
@RequestMapping(value="/submtitem")
public  ModelAndView submititem(HttpServletRequest re,HttpServletResponse req) throws ClassNotFoundException, SQLException
{
	String itemname=(re.getParameter("itemname"));
	int quantity=Integer.parseInt(re.getParameter("quantity"));
	int price=Integer.parseInt(re.getParameter("price_per_item"));
	boolean b=false;
	ItemService as=new ItemService();	
		ModelAndView mv=new ModelAndView();
		 b=as.check(itemname,quantity,price);

			mv.setViewName("admin");
	if(b)
	{
		mv.addObject("result","Successful");
	}
	else
	{
		mv.addObject("result","NotSuccesfull");
	}
	
return mv;
}

@RequestMapping(value="/itemupdate")
public  ModelAndView itemupdate(HttpServletRequest re,HttpServletResponse req) throws ClassNotFoundException, SQLException
{
	String itemname=(re.getParameter("itemname"));
	int quantity=Integer.parseInt(re.getParameter("quantity"));
	int price=Integer.parseInt(re.getParameter("price_per_item"));
	boolean b=false;
	ItemService as=new ItemService();	
		ModelAndView mv=new ModelAndView();
		 b=as.check(itemname,quantity,price);

			mv.setViewName("admin");
	if(b)
	{
		mv.addObject("result","Successful");
	}
	else
	{
		mv.addObject("result","NotSuccesfull");
	}
	
return mv;
}

@RequestMapping(value="/x")
public  ModelAndView x(HttpServletRequest re,HttpServletResponse req) throws ClassNotFoundException, SQLException
{
	String olditemname=(re.getParameter("olditemname"));
	String itemname=(re.getParameter("newitemname"));
	boolean b=false;
	ItemService as=new ItemService();	
		ModelAndView mv=new ModelAndView();
		 b=as.check(olditemname,itemname);

			mv.setViewName("admin");
			if(b)
			{
				mv.addObject("result","Succesfull");
			}
			else
			{
				mv.addObject("result","NotSuccesfull");
			}return mv;
}

@RequestMapping(value="/x1")
public  ModelAndView x1(HttpServletRequest re,HttpServletResponse req) throws ClassNotFoundException, SQLException
{
	String olditemname=(re.getParameter("olditemname"));
	String itemname=(re.getParameter("newitemname"));
	boolean b=false;
	ItemService as=new ItemService();	
		ModelAndView mv=new ModelAndView();
		 b=as.check(olditemname,itemname);

			mv.setViewName("admin");
			if(b)
			{
				mv.addObject("result","Succesfull");
			}
			else
			{
				mv.addObject("result","NotSuccesfull");
			}return mv;
}

@RequestMapping(value="/deletename")
public  ModelAndView deletename(HttpServletRequest re,HttpServletResponse req) throws ClassNotFoundException, SQLException
{	String itemname=(re.getParameter("item"));
	boolean b=false;
	ItemService as=new ItemService();	
		ModelAndView mv=new ModelAndView();
		 b=as.check(itemname);
			mv.setViewName("admin");
	if(b)
	{
		mv.addObject("result","Succesfull");
	}
	else
	{
		mv.addObject("result","NotSuccesfull");
	}
	
return mv;
}
	}

