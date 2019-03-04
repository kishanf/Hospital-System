package com.novus.hospital.entity;

import java.io.Serializable;

import javax.enterprise.inject.Model;
import javax.persistence.*;


/**
 * The persistent class for the admin database table.
 * 
 */
@Model
@Entity
@NamedQuery(name="Admin.findAll", query="SELECT a FROM Admin a")
public class Admin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String admin_Id;

	private String admin_First_Name;

	private String admin_Gender;

	private String admin_Last_Name;

	private String department_ID;

	public Admin() {
	}

	
	
	public Admin(String admin_Id, String admin_First_Name, String admin_Gender, String admin_Last_Name,
			String department_ID) {
		super();
		this.admin_Id = admin_Id;
		this.admin_First_Name = admin_First_Name;
		this.admin_Gender = admin_Gender;
		this.admin_Last_Name = admin_Last_Name;
		this.department_ID = department_ID;
	}



	public String getAdmin_ID() {
		return this.admin_Id;
	}

	public void setAdmin_ID(String admin_ID) {
		this.admin_Id = admin_ID;
	}

	public String getAdmin_First_Name() {
		return this.admin_First_Name;
	}

	public void setAdmin_First_Name(String admin_First_Name) {
		this.admin_First_Name = admin_First_Name;
	}

	public String getAdmin_Gender() {
		return this.admin_Gender;
	}

	public void setAdmin_Gender(String admin_Gender) {
		this.admin_Gender = admin_Gender;
	}

	public String getAdmin_Last_Name() {
		return this.admin_Last_Name;
	}

	public void setAdmin_Last_Name(String admin_Last_Name) {
		this.admin_Last_Name = admin_Last_Name;
	}

	public String getDepartment_ID() {
		return this.department_ID;
	}

	public void setDepartment_ID(String department_ID) {
		this.department_ID = department_ID;
	}



	@Override
	public String toString() {
		return "Admin [admin_Id=" + admin_Id + ", admin_First_Name=" + admin_First_Name + ", admin_Gender="
				+ admin_Gender + ", admin_Last_Name=" + admin_Last_Name + ", department_ID=" + department_ID + "]";
	}
}