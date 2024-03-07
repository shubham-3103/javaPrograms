package com.hughes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hughes.repository.AadharRepository;
import com.hughes.model.Aadhar;
@Service
public class AadharService {
	@Autowired
	AadharRepository aRepo;
	
	public List<Aadhar> readAadhar(){
		return aRepo.findAll();
	}
	public Aadhar insertAadhar(Aadhar a){
		return aRepo.save(a);
	}
}
