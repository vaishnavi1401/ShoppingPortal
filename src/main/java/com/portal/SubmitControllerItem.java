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
	   @RequestMapping(value="/processForm",params="Action1",method=RequestMethod.POST)
	    public void Action1()
	    {
	        System.out.println("Action1 block called");
	    }
	    @RequestMapping(value="/processForm",params="action2",method=RequestMethod.POST)
	    public void action2()
	    {
	        System.out.println("Action2 block called");
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
	if(b)
	{
		mv.setViewName("Welcome");
		mv.addObject("result","Successful");
	}
	else
	{
		mv.setViewName("Welcome");
		mv.addObject("result","NotSuccesfull");
	}
	
return mv;
}
	}