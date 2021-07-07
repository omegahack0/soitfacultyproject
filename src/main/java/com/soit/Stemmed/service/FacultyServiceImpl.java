package com.soit.Stemmed.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soit.Stemmed.dao.FacultyRepository;
import com.soit.Stemmed.entity.Faculty;

@Service
public class FacultyServiceImpl implements FacultyService {

	
	public FacultyRepository facultyRepository;
	
	@Autowired
	public FacultyServiceImpl (FacultyRepository theFacultyRepository) {
		facultyRepository = theFacultyRepository;
	}
	
	
	
	@Override
	public List<Faculty> findAll() {
		return facultyRepository.findAllByOrderByLastNameAsc(); //findAllByOrderByLastNameAcs
	}

	@Override
	public Faculty findById(int theId) {
		Optional<Faculty> facultyid = facultyRepository.findById(theId);
		Faculty theFaculty = null;
		
		if(facultyid.isPresent()) {
			theFaculty = facultyid.get();
		}
		else {
			//faculty not found
			throw new RuntimeException("the FacultyId you've entered is invaled - "+theId);
		}
		
		return theFaculty;
	}

	@Override
	public void save(Faculty theFaculty) {
		facultyRepository.save(theFaculty);

	}

	@Override
	public void deleteById(int theId) {
		facultyRepository.deleteById(theId);

	}

}
