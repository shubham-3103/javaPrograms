package com.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jdbc.LoginDetail;
import com.jdbc.WebappLogin;

@Controller
public class LoginController{
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
		LoginDetail logindetail = new LoginDetail();
		WebappLogin web = new WebappLogin(); 
		String username = request.getParameter("userName");
		String password = request.getParameter("password");
		logindetail.setUsername(username);
		logindetail.setPassword(password);
		
		if (username.length() == 0 || username.equals(""))
			return new ModelAndView("errorPage", "message", "Invalid Username and Password");
		if (web.validation(logindetail))
			return new ModelAndView("successPage", "message", "welcome User");
		else	return new ModelAndView("Index1", "message", "welcome");
	}
}
