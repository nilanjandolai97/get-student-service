package com.nilanjan.springboot.api.studentService.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.nilanjan.springboot.api.studentService.repo.StudentInfoRepository;
import com.nilanjan.springboot.api.studentService.response.AddressResponse;
import com.nilanjan.springboot.api.studentService.response.StudentResponse;
import com.nilanjan.springboot.api.studentService.exception.ResourceNotFoundException;
import com.nilanjan.springboot.api.studentService.feignclient.AddressClient;
import com.nilanjan.springboot.api.studentService.model.StudentInfo;

@Service
public class StudentService {
	
	@Autowired
	private StudentInfoRepository studentInfoRepo;
	
	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private AddressClient addressClient;
	
	public StudentResponse findStudentInfoById(Long id) {
		StudentInfo studentInfo =  studentInfoRepo.findById(id)
													  .orElseThrow(() -> new ResourceNotFoundException("Address not found for ID: " + id));
		StudentResponse response = mapper.map(studentInfo, StudentResponse.class);
		
		ResponseEntity<AddressResponse> addressResponse = addressClient.getAddressByEmployeeId(id);
		response.setAddress(addressResponse.getBody());
		
		return response;
	}
}
