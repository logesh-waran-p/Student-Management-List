package com.springboot.student.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.student.Repository.StudentRepository;
import com.springboot.student.details.StudentDetails;
import com.springboot.student.service.StudentService;

@Service
public class StudentImp implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public StudentDetails saveStudent(StudentDetails studentDetails) {
		return studentRepository.save(studentDetails);
	}

	@Override
	public List<StudentDetails> getAllDetails() {
		return studentRepository.findAll();
		
	}

	@Override
	public StudentDetails getDetailsById(long id) throws Exception {
		Optional<StudentDetails> studentDetails = studentRepository.findById(id);
		if(studentDetails.isPresent()) {
			return studentDetails.get();			
		}else {
			throw new Exception("There is no details found the given id: "+id);
		}
	}

	
	@Override
	public StudentDetails updateDetailsById(StudentDetails studentDetails) {		
		return studentRepository.save(studentDetails);
	}

	@Override
	public void deleteDetails(long id) {
		studentRepository.deleteById(id);
	}

}
