package org.edu.services;

import java.util.List;
import java.util.Optional;

import org.edu.model.Students;
import org.edu.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepository studentrepo;
	public List<Students> findAll(){
		return studentrepo.findAll();
	}
	
	public int save(Students st) {
		return studentrepo.save(st);
	}

	public int delete(int id) {
		return studentrepo.delete(id);
	}

	public int update(Students st) {
		return studentrepo.update(st);
	}
	public  Optional<Students> findById(int id){
		return studentrepo.findById(id);
	}
	
}
