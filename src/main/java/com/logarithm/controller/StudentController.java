/*
package com.logarithm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logarithm.services.IStudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private IStudentService iservice;
	@GetMapping("/find/{id}")
	public ResponseEntity<Student> findOne(@PathVariable Integer id) {
		Student std= iservice.findOne(id);
		return ResponseEntity.ok(std);
	}

}
*/
