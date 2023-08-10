package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.MyRepository;

@Service
public class ServiceImpl implements ServiceInterface {
	 @Autowired
	    MyRepository myRepo;

		@Override
		public boolean addStudent(Student std) {
			 myRepo.save(std);
			return true;
		}

		@Override
		public Student updateStudent(Student std) {
			 
		        Student std1=myRepo.getById(std.getSid());
		        std1.setEmail(std.getEmail());
		        std1.setScity(std.getScity());
		        std1.setSname(std.getSname());
		        Student s=myRepo.save(std1);
		        return s;
		        
		}

		@Override
		public Student getStudentById(int sid) {
			
			 return myRepo.findById(sid).get();
		}

		@Override
		public List<Student> viewAllStudent() {
			return myRepo.findAll();
		}

		@Override
		public boolean deleteBysid(int sid) {
			myRepo.deleteById(sid);
			return true;
		}

		

}
