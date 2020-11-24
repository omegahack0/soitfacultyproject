package com.soit.Stemmed.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soit.Stemmed.entity.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, Integer> {

	
	
	//Method to sort the results by last name asc
	public List<Faculty>findAllByOrderByLastNameAsc();
	
	
}
