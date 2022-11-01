/*
package com.logarithm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/school")
public class SchoolController {
	@Autowired
	private SchoolRepository schrepo;
	@GetMapping("/find/{sc}")
	public School findSchool(String sc) {
		return schrepo.findById(sc).get();
	}
	@GetMapping("/all")
	public ResponseEntity<List<School>> AllSchool(){
		List<School> sc = schrepo.findAll();
		return ResponseEntity.ok(sc);
	}
	

}
*/
