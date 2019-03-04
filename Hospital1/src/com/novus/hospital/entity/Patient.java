package com.novus.hospital.entity;

import java.io.Serializable;

import javax.enterprise.inject.Model;
import javax.persistence.*;


/**
 * The persistent class for the patient database table.
 * patient.findAll , Patient.class 
 * 
 * return listPaitent; 
 */
@Model
@Entity
@NamedQuery(name="Patient.findAll", query="SELECT p FROM Patient p")
public class Patient implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String Patient_ID;

	private String Patient_First_Name;

	private String Patient_Gender;

	private String Patient_Last_Name;

	private String Patient_Nationality;

	private String Title;
	
	private String Medical_History_ID;
	
	private String Bed_ID; 
	
	//private String medical_History_ID;
	
	//private String bed_ID; 

	public Patient() {
		super();
	}

	public Patient(String patient_ID, String patient_First_Name, String patient_Gender, String patient_Last_Name,
			String patient_Nationality, String title, String medical_History_ID, String bed_ID) {
		super();
		this.Patient_ID = patient_ID;
		this.Patient_First_Name = patient_First_Name;
		this.Patient_Gender = patient_Gender;
		this.Patient_Last_Name = patient_Last_Name;
		this.Patient_Nationality = patient_Nationality;
		this.Title = title;
		this.Medical_History_ID = medical_History_ID;
		this.Bed_ID = bed_ID;
	}

	public String getPatient_ID() {
		return Patient_ID;
	}

	public void setPatient_ID(String patient_ID) {
		this.Patient_ID = patient_ID;
	}

	public String getPatient_First_Name() {
		return Patient_First_Name;
	}

	public void setPatient_First_Name(String patient_First_Name) {
		this.Patient_First_Name = patient_First_Name;
	}

	public String getPatient_Gender() {
		return Patient_Gender;
	}

	public void setPatient_Gender(String patient_Gender) {
		this.Patient_Gender = patient_Gender;
	}

	public String getPatient_Last_Name() {
		return Patient_Last_Name;
	}

	public void setPatient_Last_Name(String patient_Last_Name) {
		this.Patient_Last_Name = patient_Last_Name;
	}

	public String getPatient_Nationality() {
		return Patient_Nationality;
	}

	public void setPatient_Nationality(String patient_Nationality) {
		this.Patient_Nationality = patient_Nationality;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		this.Title = title;
	}

	public String getMedical_History_ID() {
		return Medical_History_ID;
	}

	public void setMedical_History_ID(String medical_History_ID) {
		Medical_History_ID = medical_History_ID;
	}

	public String getBed_ID() {
		return Bed_ID;
	}

	public void setBed_ID(String bed_ID) {
		Bed_ID = bed_ID;
	}

	@Override
	public String toString() {
		return "Patient [Patient_ID=" + Patient_ID + ", Patient_First_Name=" + Patient_First_Name + ", Patient_Gender="
				+ Patient_Gender + ", Patient_Last_Name=" + Patient_Last_Name + ", Patient_Nationality="
				+ Patient_Nationality + ", Title=" + Title + ", Medical_History_ID=" + Medical_History_ID + ", Bed_ID="
				+ Bed_ID + "]";
	}

		
}