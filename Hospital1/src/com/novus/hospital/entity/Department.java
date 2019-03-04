package com.novus.hospital.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the department database table.
 * 
 */
@Entity
@NamedQuery(name="Department.findAll", query="SELECT d FROM Department d")
public class Department implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String department_ID;

	private String department_Name;

	public Department() {
	}

	public String getDepartment_ID() {
		return this.department_ID;
	}

	public void setDepartment_ID(String department_ID) {
		this.department_ID = department_ID;
	}

	public String getDepartment_Name() {
		return this.department_Name;
	}

	public void setDepartment_Name(String department_Name) {
		this.department_Name = department_Name;
	}

}