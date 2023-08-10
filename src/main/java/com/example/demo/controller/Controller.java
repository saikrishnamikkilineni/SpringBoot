package com.example.demo.controller;
//controller
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Service.ServiceImpl;

@RestController
public class Controller {
	  @Autowired
	    ServiceImpl serviceInterface;

	    @PostMapping("/addStudent")
	    public String addStudent(@RequestBody Student std) {

	        

	        serviceInterface.addStudent(std); 
	        

	        

	        return "record added successfully";

	    }
	    
	    @PutMapping("/updatestudent")
	    public Student updateStudent(@RequestBody Student std)
	    {
	    	Student std1=serviceInterface.updateStudent(std);
	    	return std1;
	    }
	    
	    @GetMapping("/getStudentById")
	    public Student getStudentById(@RequestBody Student std) {
	    	return serviceInterface.getStudentById(std.getSid());
	    	
	    }
	    
	    @GetMapping("/viewAllStudent")
	    public List<Student> viewAllStudent() {
	    	return serviceInterface.viewAllStudent();
	    	}

	    @DeleteMapping("/deleteBysid")
	    public String deleteBysid(@RequestBody Student std) {
	    	String str=null;
	    	boolean b=serviceInterface.deleteBysid(std.getSid());
	    	if(b) {
	    		str="Student record deleted successfully";
	    		
	    	}
	    	return str;
	    }
	    //http://localhost:8080/addStudent
}
