package com.springboot.student.service;

import java.util.List;

import com.springboot.student.details.StudentDetails;

public interface StudentService {
	StudentDetails saveStudent(StudentDetails studentDetails);
	List<StudentDetails> getAllDetails();
	StudentDetails getDetailsById(long id) throws Exception;
	StudentDetails updateDetailsById(StudentDetails updateDetails);
	void deleteDetails(long id);
}
