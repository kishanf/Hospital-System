package com.novus.hospital.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the medical_history database table.
 * 
 */
@Entity
@Table(name="medical_history")
@NamedQuery(name="MedicalHistory.findAll", query="SELECT m FROM MedicalHistory m")
public class MedicalHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String medical_History_ID;

	private String alcoholic;

	private String blood_Type;

	private String diabetic;

	private String height;

	private String hemorrhoids;

	private String patient_ID;

	private String smoker;

	private String weight;

	public MedicalHistory() {
	}

	public String getMedical_History_ID() {
		return this.medical_History_ID;
	}

	public void setMedical_History_ID(String medical_History_ID) {
		this.medical_History_ID = medical_History_ID;
	}

	public String getAlcoholic() {
		return this.alcoholic;
	}

	public void setAlcoholic(String alcoholic) {
		this.alcoholic = alcoholic;
	}

	public String getBlood_Type() {
		return this.blood_Type;
	}

	public void setBlood_Type(String blood_Type) {
		this.blood_Type = blood_Type;
	}

	public String getDiabetic() {
		return this.diabetic;
	}

	public void setDiabetic(String diabetic) {
		this.diabetic = diabetic;
	}

	public String getHeight() {
		return this.height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getHemorrhoids() {
		return this.hemorrhoids;
	}

	public void setHemorrhoids(String hemorrhoids) {
		this.hemorrhoids = hemorrhoids;
	}

	public String getPatient_ID() {
		return this.patient_ID;
	}

	public void setPatient_ID(String patient_ID) {
		this.patient_ID = patient_ID;
	}

	public String getSmoker() {
		return this.smoker;
	}

	public void setSmoker(String smoker) {
		this.smoker = smoker;
	}

	public String getWeight() {
		return this.weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

}