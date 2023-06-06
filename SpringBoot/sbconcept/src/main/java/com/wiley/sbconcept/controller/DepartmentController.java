package com.wiley.sbconcept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wiley.sbconcept.exception.DepNotFoundException;
import com.wiley.sbconcept.model.Department;
import com.wiley.sbconcept.service.DepService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	@Autowired
	private DepService depService;
	
	@PostMapping("/deps")
	public Department createDepartment(@RequestBody Department dep) {
		return depService.createDepartment(dep);
	}
	
	@GetMapping("/deps")
	public List<Department> getAllDepartment(){
		return depService.getAllDepartmentsList();
	}
	@GetMapping("/deps/{id}")
	public Department getDepartment(@PathVariable("id") Long depId) throws DepNotFoundException {
		return depService.getDepartmentById(depId);
	}
	
	@DeleteMapping("/deps/{id}")
	public String delDepById(@PathVariable("id") Long depId) {
		depService.delDepartment(depId);
		return "Department data deleted";
	}
	
	@GetMapping("/deps/name/{name}")
	public Department getDepByName(@PathVariable("name") String name) {
		return depService.getDepByName(name);
	}
	
	/*
	@PutMapping("/deps/{id}")
    public Department updateDepartment(
    		@PathVariable("id") Long id,
    		@RequestBody Department department){
        return depService.updateDepartment(department.getDepartmentId(),department);
    }
    */
}
