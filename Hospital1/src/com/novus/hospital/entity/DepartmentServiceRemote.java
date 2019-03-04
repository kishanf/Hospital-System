package com.novus.hospital.entity;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface DepartmentServiceRemote {

void createDepartment(Department department);
	
	void editDepartment(Department department);
	
	void removeDepartment(Department department);
	
	List<Department>findAllDepartments() throws Exception; 

}
