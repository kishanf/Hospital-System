package com.novus.hospital.entity;

import java.util.List;

import javax.ejb.Local;

@Local
public interface DoctorServiceLocal {
	
	void createDoctor(Doctor doctor);
	
	void editDoctor(Doctor doctor);
	
	void removeDoctor(Doctor doctor);
	
	List<Doctor>findAllDoctor() throws Exception; 

}