package com.School.StudentManagement.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.School.StudentManagement.DTO.StudentDTO;
import com.School.StudentManagement.Repository.StudentRegistationRepository;

@Service
public class StudentRegistrationServiceImpl implements StudentRegistrationService {

	@Autowired
	StudentRegistationRepository studentRegistrationRepository;
	@Override
	public StudentDTO addStudentDetails(StudentDTO studentDTO) {
		// TODO Auto-generated method stub
		return studentRegistrationRepository.save(studentDTO);
		
	}
	@Override
	public List<StudentDTO> showAllStudents(){
		return  (List<StudentDTO>) studentRegistrationRepository.findAll();
	}
	@Override
	public StudentDTO viewStudentDetails(Integer regNo) {
		Optional<StudentDTO> optionalStudent = studentRegistrationRepository.findById(regNo);
        return optionalStudent.orElse(null);
	}

	

	
	

}
