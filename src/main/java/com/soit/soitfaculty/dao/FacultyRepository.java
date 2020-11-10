package com.soit.soitfaculty.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soit.soitfaculty.entity.Faculty;

import com.soit.soitfaculty.entity.*;
public interface FacultyRepository extends JpaRepository<Faculty, Integer> {

	
	
	//Method to sort the results by last name asc
	public List<Faculty>findAllByOrderByLastNameAsc();
	
	
}
