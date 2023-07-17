package com.springboot.student.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.student.details.StudentDetails;
import com.springboot.student.service.StudentService;

import ch.qos.logback.classic.Logger;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	Logger logger = (Logger) LoggerFactory.getLogger(StudentController.class);
	 
	@RequestMapping("/hello")
	public String hello() {
	    logger.info("This is sample info message");
	    logger.warn("This is sample warn message");
	    logger.error("This is sample error message");
	    logger.debug("This is sample debug message");
	 
	    return "Hello Simplifying Tech";
	}
	
	
	
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping()
	public StudentDetails saveDetails(@RequestBody StudentDetails studentDetails) {
		return studentService.saveStudent(studentDetails);
	}
	
	@GetMapping()
	public List<StudentDetails> getAllDetails(){
		return studentService.getAllDetails();
	}
	
	@GetMapping("/{id}")
	public StudentDetails getDetailsById(@PathVariable long id) throws Exception {
		if(id!=0) {
			return studentService.getDetailsById(id);
		}else {
			throw new Exception("the enter id not found : "+id);
		}
		
	}
	
	@PutMapping("update/{id}")
	public StudentDetails updateDetails(@PathVariable long id, @RequestBody StudentDetails details){
		details.setId(id);
		return studentService.updateDetailsById(details);
	}
	
	@DeleteMapping("/{id}")
	public void deleteDetails(@PathVariable long id) {
		studentService.deleteDetails(id);
	}

}
