package reverse_eng.com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import reverse_eng.com.model.User;
import reverse_eng.com.service.AddUserService;

@Controller
public class AddUserController {

	@Autowired
	private AddUserService addUserService;
	
	@RequestMapping(value="viewuser.do")
	public String viewUser(User user,Model model)
	{
		System.out.println("in");
		model.addAttribute("user", new User());
		return "Viewuser";
	}
	
	@RequestMapping(value="submituser.do",method=RequestMethod.POST)
	public String submitcontroller(User user,Model model)
	{
		System.out.println("submit");
		List<User> list=new ArrayList<User>();
		list=null;
		list=addUserService.submitService(user);
		model.addAttribute("list", list);
		return "success";
	}
}
