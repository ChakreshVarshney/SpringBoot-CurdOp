package com.School.StudentManagement.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.School.StudentManagement.DTO.StudentDTO;

@Repository
public interface StudentRegistationRepository extends CrudRepository<StudentDTO, Integer> {

	//void addStudent(StudentDTO studentDTO);

}
