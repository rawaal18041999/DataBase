package com.demo.database.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.database.Entity.Student1;
import com.demo.database.repository.Student1Repo;

@RestController
@RequestMapping("/api/demo")


public class controller {
	@Autowired
	Student1Repo student1;
	
	@GetMapping(path="/student/{id}")
	public Optional<Student1> studentbyid(@PathVariable int id)
	{
		return student1.findById(id);
		
	}
	@GetMapping(path="/student")
	public List<Student1> studentbyid(@RequestParam String name)
	{
		return student1.findByName(name);
		
	}
	@PostMapping(path="/student")
	public String uploadstudent(@RequestBody Student1 student)
	{
		student1.save(student);
		return "Student Created";
	}

}
