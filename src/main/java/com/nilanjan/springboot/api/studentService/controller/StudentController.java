package com.nilanjan.springboot.api.studentService.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.nilanjan.springboot.api.studentService.model.StudentInfo;
import com.nilanjan.springboot.api.studentService.response.StudentResponse;
import com.nilanjan.springboot.api.studentService.service.StudentService;

@RestController
@RequestMapping("/v1")
public class StudentController {

	@Autowired
	private StudentService studentServ;
	
	@GetMapping("/studentData/{id}")
	public ResponseEntity<StudentResponse> getStudentInfoById(@PathVariable Long id){
		StudentResponse response = studentServ.findStudentInfoById(id);
		return ResponseEntity.ok(response);
	}
}
