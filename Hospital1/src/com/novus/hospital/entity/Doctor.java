package com.novus.hospital.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the doctor database table.
 * 
 */
@Entity
@NamedQuery(name="Doctor.findAll", query="SELECT d FROM Doctor d")
public class Doctor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String doctor_ID;

	private String doctor_First_Name;

	private String doctor_Gender;

	private String doctor_Last_Name;
	
	private String department_ID; 

	public Doctor() {
		super();
	}

	public Doctor(String doctor_ID, String doctor_First_Name, String doctor_Gender, String doctor_Last_Name,
			String department_ID) {
		super();
		this.doctor_ID = doctor_ID;
		this.doctor_First_Name = doctor_First_Name;
		this.doctor_Gender = doctor_Gender;
		this.doctor_Last_Name = doctor_Last_Name;
		this.department_ID(department_ID);
	}


	private void department_ID(String department_ID2) {
		// TODO Auto-generated method stub
		
	}

	public String getDoctor_ID() {
		return this.doctor_ID;
	}

	public void setDoctor_ID(String doctor_ID) {
		this.doctor_ID = doctor_ID;
	}

	public String getDoctor_First_Name() {
		return this.doctor_First_Name;
	}

	public void setDoctor_First_Name(String doctor_First_Name) {
		this.doctor_First_Name = doctor_First_Name;
	}

	public String getDoctor_Gender() {
		return this.doctor_Gender;
	}

	public void setDoctor_Gender(String doctor_Gender) {
		this.doctor_Gender = doctor_Gender;
	}

	public String getDoctor_Last_Name() {
		return this.doctor_Last_Name;
	}

	public void setDoctor_Last_Name(String doctor_Last_Name) {
		this.doctor_Last_Name = doctor_Last_Name;
	}

	public String getDepartment_ID() {
		return department_ID;
	}

	public void setDepartment_ID(String department_ID) {
		this.department_ID = department_ID;
	}

	@Override
	public String toString() {
		return "Doctor [doctor_ID=" + doctor_ID + ", doctor_First_Name=" + doctor_First_Name + ", doctor_Gender="
				+ doctor_Gender + ", doctor_Last_Name=" + doctor_Last_Name + ", department_ID=" + department_ID + "]";
	}

	

}