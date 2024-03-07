package org.edu;

import org.edu.model.Students;
import org.edu.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@EnableScheduling //It will activate scheduler in spring boot app
public class SpringBootJdbcExample implements CommandLineRunner {
	@Autowired
	StudentService studentservice;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringBootJdbcExample.class, args);
	}

	@Override
	public void run(String... args) {
//		for (Students obj : studentservice.findAll()) {
//			System.out.println(obj.getStudentId() + " " + obj.getStudentName());
//		}
		Students st = new Students();
//		st.setStudentId(6);
//		st.setStudentName("Hello");
//		st.setAge(30);
//		if (studentservice.save(st) == 1)
//			System.out.println("Data Inserted successfully");
//		else	System.out.println("Data not Inserted successfully");
//		
//		if (studentservice.delete(5) == 1)
//			System.out.println("Data Deleted successfully");
//		else	System.out.println("Data not Deleted successfully");

		// FOR UPDATING AGE
//		st.setStudentId(2);
//		st.setAge(45);
//		studentservice.update(st);
//		// FOR PRINTING ALL
//		for (Students obj : studentservice.findAll()) {
//			System.out.println(obj.getStudentId() + " " + obj.getStudentName() + " " + obj.getAge());
//		}
		//For printing by ID
		System.out.println(studentservice.findById(1).get().getStudentName());
	}

}
