package com.novus.hospital.entity;

import java.util.List;

import javax.ejb.Local;

@Local
public interface DepartmentServiceLocal {
	
	void createDepartment(Department department);
	
	void editDepartment(Department department);
	
	void removeDepartment(Department department);
	
	List<Department>findAllDepartments() throws Exception; 

}