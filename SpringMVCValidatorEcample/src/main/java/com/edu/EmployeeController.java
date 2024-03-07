package com.edu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
	@RequestMapping("/login")
	public String display(Model e) {
		System.out.println("Inside display");
		e.addAttribute("Employee",new Employee());
		return "Login";
	}
}
