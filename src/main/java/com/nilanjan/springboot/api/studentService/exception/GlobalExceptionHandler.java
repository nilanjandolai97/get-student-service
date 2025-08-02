package com.nilanjan.springboot.api.studentService.exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<Map<String, Object>> handleResourceNotFound(ResourceNotFoundException ex){
		Map<String, Object> body = new HashMap<>();
		body.put("status", 200);
		body.put("message", ex.getMessage());
		body.put("timeStamp", LocalDateTime.now());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(body);		
	}
	
	@ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, Object>> handleGeneric(Exception ex) {
		Map<String, Object> body = new HashMap<>();
	    body.put("timestamp", LocalDateTime.now());
	    body.put("message", ex.getMessage());
	    body.put("status", 500);
	    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(body);
    }
}
