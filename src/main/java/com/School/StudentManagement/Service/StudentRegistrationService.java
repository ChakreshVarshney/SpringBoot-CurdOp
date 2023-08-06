package com.School.StudentManagement.Service;

import java.util.List;

import com.School.StudentManagement.DTO.StudentDTO;

public interface StudentRegistrationService {

	public StudentDTO addStudentDetails(StudentDTO studentDTO);
	public List<StudentDTO> showAllStudents();
	public StudentDTO viewStudentDetails(Integer regNo);
}
