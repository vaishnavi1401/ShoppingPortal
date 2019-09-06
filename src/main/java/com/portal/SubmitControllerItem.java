package com.portal;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.portal.Service.ItemService;

@Controller
public class SubmitControllerItem {
	  
@RequestMapping(value="/additem")
	public String additem()
	{
		
		return("additem");
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

			mv.setViewName("Welcome");
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
	}