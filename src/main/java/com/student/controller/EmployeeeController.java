package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Employeee;
import com.student.service.IEmployeeeService;

@RestController
@RequestMapping("/employeee")
public class EmployeeeController {
	
	@Autowired
	private IEmployeeeService service;
	
	@GetMapping("/all")
	public ResponseEntity<List<Employeee>> getAll(){
		List<Employeee> list=	service.getAllEmployee();
		//return new ResponseEntity<>(list,HttpStatus.OK);
		return ResponseEntity.ok(list);
		
	}
	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody Employeee employeee){
		Integer id =service.saveEmplyeee(employeee);
		return ResponseEntity.ok("employee save="+ id);
		
	}

}
