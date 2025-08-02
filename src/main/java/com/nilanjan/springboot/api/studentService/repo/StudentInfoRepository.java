package com.nilanjan.springboot.api.studentService.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nilanjan.springboot.api.studentService.model.StudentInfo;

public interface StudentInfoRepository  extends JpaRepository<StudentInfo, Long>{
	
}
