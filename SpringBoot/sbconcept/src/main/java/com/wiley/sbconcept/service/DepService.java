package com.wiley.sbconcept.service;

import java.util.List;

import com.wiley.sbconcept.exception.DepNotFoundException;
import com.wiley.sbconcept.model.Department;


public interface DepService {

	public Department createDepartment(Department dep);
	public List<Department> getAllDepartmentsList();
	public Department getDepartmentById(Long departmentId) throws DepNotFoundException;
	public Department updateDepartment(Long departmentId, Department dep);
	public void delDepartment(Long departmentId);
	Department getDepByName(String depName);
	
}
