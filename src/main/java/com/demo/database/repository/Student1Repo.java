package com.demo.database.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.database.Entity.Student1;

public interface Student1Repo extends JpaRepository<Student1, Integer> {

	
	List<Student1> findByName(String name);

}
