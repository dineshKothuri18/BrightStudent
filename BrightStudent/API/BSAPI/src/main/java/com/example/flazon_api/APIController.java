package com.example.flazon_api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bsapi")
public class APIController {
	
	@Autowired
	public  static StudentRepositories studentRepo;
	
	APIController(StudentRepositories studentRepo){
		APIController.studentRepo = studentRepo;
	}
	
		
	@GetMapping("student")
	public List<Student> getListOfStudents() {
		return studentRepo.findAll();
	}

	
}
