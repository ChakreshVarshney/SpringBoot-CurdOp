package com.School.StudentManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.School.StudentManagement.DTO.StudentDTO;
import com.School.StudentManagement.Service.StudentRegistrationService;


@RestController
public class StudentRegistrationController {
	
	StudentDTO studentDTO;
	
	@Autowired
	StudentRegistrationService studentRegistrationService;
	
	private static final String WELCOME_PAGE = "welcomePage";
	private static final String STUDENT_REGISTRATION_PAGE = "studentRegistrationPage";

	
	private static final String STUDENT_DTO = "studentDTO";

	@GetMapping("/welcome")
	public String welcomePage(Model model) {
		return WELCOME_PAGE;
	}
	
	@PostMapping("/enterDetails")
	public String enterStudentDetails(Model model) {
		studentDTO = new StudentDTO();
		model.addAttribute(STUDENT_DTO,studentDTO);
		return STUDENT_REGISTRATION_PAGE;
	}
	
	@PostMapping("/saveDetails")
	public StudentDTO saveStudentDetails(@RequestBody StudentDTO studentDTO) {
		//model.addAttribute(STUDENT_DTO,studentDTO);
		
		return studentRegistrationService.addStudentDetails(studentDTO);
	}

}
