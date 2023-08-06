package com.School.StudentManagement.DTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Student")
public class StudentDTO {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer registrationNo;
	Integer rollNo;
	String fname;
	String lName;
	String contactNo;
	String address;
	String fatherFName;
	String fathersMName;
	String fathersLName;

	
	
}
