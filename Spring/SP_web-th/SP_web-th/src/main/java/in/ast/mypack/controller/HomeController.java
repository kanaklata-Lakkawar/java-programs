package in.ast.mypack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import in.ast.mypack.model.User;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	String fun(Model m) {
		String name="Riya";
		int id=101;
	double marks=66.44;
		m.addAttribute("uname",name);
		m.addAttribute("id",id);
		m.addAttribute("marks",marks);
		return "page1.html";
		
	}

	String fun2(Model m) {
		User u=new User(101,"uname",44.66);
		
		return "page2.html";
		
	}
	
	
}
