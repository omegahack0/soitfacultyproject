package com.soit.soitfaculty.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soit.soitfaculty.dao.FacultyRepository;
import com.soit.soitfaculty.entity.Faculty;

@Service
public class FacultyServiceImpl implements FacultyService {

	
	public FacultyRepository facultyRepository;
	
	@Autowired
	public FacultyServiceImpl (FacultyRepository theFacultyRepository) {
		facultyRepository = theFacultyRepository;
	}
	
	
	
	@Override
	public List<Faculty> findAll() {
		// TODO Auto-generated method stub
		return facultyRepository.findAllByOrderByLastNameAsc(); //findAllByOrderByLastNameAcs
	}

	@Override
	public Faculty findById(int theId) {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		facultyRepository.save(theFaculty);

	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		facultyRepository.deleteById(theId);

	}

}
