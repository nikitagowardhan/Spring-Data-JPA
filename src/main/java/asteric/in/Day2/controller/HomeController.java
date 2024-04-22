package asteric.in.Day2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import asteric.in.Day2.model.User;
import asteric.in.Day2.repo.UserRepo;

@Controller
public class HomeController {

	@Autowired
	UserRepo ur;
	
	@RequestMapping("/test1")
      String fun(Model m)
	{
		User u = new User();
		m.addAttribute("obj", u);
		System.out.println("Before Form Data "+u);
    	  return "reg.html";
	}
      
	@RequestMapping("/registeruser")
	ModelAndView myfun1(@ModelAttribute("obj") User u1)
	{
		
		
		System.out.println("After Form User Object Data "+u1);
		ur.save(u1);
		ModelAndView mv = new ModelAndView("show.html");
		
		mv.addObject("o", u1);
		return mv;
	}
}
