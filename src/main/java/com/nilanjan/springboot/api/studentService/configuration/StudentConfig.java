package com.nilanjan.springboot.api.studentService.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.*;

@Configuration
public class StudentConfig {
	
	@Bean
    public ModelMapper modelMapperBean() {
        return new ModelMapper();
    }
}
