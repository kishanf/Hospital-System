package com.novus.hospital.entity;

import java.util.List;

import javax.ejb.Local;

@Local
public interface PatientServiceLocal {
	
	void createPatient(Patient patient);
	
	void editPatient(Patient patient);
	
	void removePatient(Patient patient);
	
	List<Patient>findAllPatients() throws Exception; 

}
