package com.soit.Stemmed.service;

import java.util.List;

import com.soit.Stemmed.entity.Faculty;

public interface FacultyService {

	public List<Faculty> findAll();
	public Faculty findById(int theId);
	
	public void save(Faculty theFaculty);
	
	public void deleteById (int theId);
	
}
