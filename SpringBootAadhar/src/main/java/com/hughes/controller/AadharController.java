package com.hughes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hughes.model.Aadhar;
import com.hughes.services.AadharService;

@RestController
@RequestMapping("/api")
public class AadharController {
	@Autowired
	AadharService aService;
	@RequestMapping(value="/aadhar", method=RequestMethod.GET)
	public List<Aadhar> readAadhar(){
		return aService.readAadhar();
	}
	@RequestMapping(value="/insertaadhar", method=RequestMethod.GET)
	public Aadhar insertAadhar(@RequestBody Aadhar a){
		return aService.insertAadhar(a);
	}
}
