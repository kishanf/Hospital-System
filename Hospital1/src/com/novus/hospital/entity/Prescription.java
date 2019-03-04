package com.novus.hospital.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the prescription database table.
 * 
 */
@Entity
@NamedQuery(name="Prescription.findAll", query="SELECT p FROM Prescription p")
public class Prescription implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String prescription_ID;

	private String patient_ID;

	private String prescription_Course;

	//bi-directional many-to-one association to Doctor
	@ManyToOne
	@JoinColumn(name="Doctor_ID")
	private Doctor doctor;

	//bi-directional many-to-one association to Medicine
	@ManyToOne
	@JoinColumn(name="Medicine_Type")
	private Medicine medicine;

	public Prescription() {
	}

	public String getPrescription_ID() {
		return this.prescription_ID;
	}

	public void setPrescription_ID(String prescription_ID) {
		this.prescription_ID = prescription_ID;
	}

	public String getPatient_ID() {
		return this.patient_ID;
	}

	public void setPatient_ID(String patient_ID) {
		this.patient_ID = patient_ID;
	}

	public String getPrescription_Course() {
		return this.prescription_Course;
	}

	public void setPrescription_Course(String prescription_Course) {
		this.prescription_Course = prescription_Course;
	}

	public Doctor getDoctor() {
		return this.doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Medicine getMedicine() {
		return this.medicine;
	}

	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}

}