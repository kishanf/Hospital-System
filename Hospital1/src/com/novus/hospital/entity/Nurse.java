package com.novus.hospital.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the nurse database table.
 * 
 */
@Entity
@NamedQuery(name="Nurse.findAll", query="SELECT n FROM Nurse n")
public class Nurse implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String nurse_ID;

	private String nurse_First_Name;

	private String nurse_Gender;

	private String nurse_Last_Name;

	//bi-directional many-to-one association to Ward
	@ManyToOne
	@JoinColumn(name="Ward_Name")
	private Ward ward;

	public Nurse() {
	}

	public String getNurse_ID() {
		return this.nurse_ID;
	}

	public void setNurse_ID(String nurse_ID) {
		this.nurse_ID = nurse_ID;
	}

	public String getNurse_First_Name() {
		return this.nurse_First_Name;
	}

	public void setNurse_First_Name(String nurse_First_Name) {
		this.nurse_First_Name = nurse_First_Name;
	}

	public String getNurse_Gender() {
		return this.nurse_Gender;
	}

	public void setNurse_Gender(String nurse_Gender) {
		this.nurse_Gender = nurse_Gender;
	}

	public String getNurse_Last_Name() {
		return this.nurse_Last_Name;
	}

	public void setNurse_Last_Name(String nurse_Last_Name) {
		this.nurse_Last_Name = nurse_Last_Name;
	}

	public Ward getWard() {
		return this.ward;
	}

	public void setWard(Ward ward) {
		this.ward = ward;
	}

}