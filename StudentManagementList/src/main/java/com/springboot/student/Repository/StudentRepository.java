package com.springboot.student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.student.details.StudentDetails;

public interface StudentRepository extends JpaRepository<StudentDetails, Long>{

}
