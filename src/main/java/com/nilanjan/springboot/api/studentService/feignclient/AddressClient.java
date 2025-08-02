package com.nilanjan.springboot.api.studentService.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.nilanjan.springboot.api.studentService.response.AddressResponse;

@FeignClient(name = "address-service", url = "http://localhost:8081", path = "/address-service/v1")
public interface AddressClient {
	
	@GetMapping("/studentaddress/{id}")
    public ResponseEntity<AddressResponse> getAddressByEmployeeId(@PathVariable("id") Long id);
	
}
