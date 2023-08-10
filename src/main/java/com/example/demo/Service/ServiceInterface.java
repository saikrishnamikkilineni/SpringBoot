package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Student;

public interface ServiceInterface {

	
	 boolean addStudent(Student std);
	 
	 Student updateStudent(Student std);

		
		Student getStudentById(int sid);

		
		List<Student> viewAllStudent();
		boolean deleteBysid(int sid);
}
