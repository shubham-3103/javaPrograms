package com.hughes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
	@RequestMapping("/login")
	public void display() {
		System.out.println("Inside display");
	}
}
