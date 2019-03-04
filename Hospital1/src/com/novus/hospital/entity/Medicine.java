package com.novus.hospital.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the medicine database table.
 * 
 */
@Entity
@NamedQuery(name="Medicine.findAll", query="SELECT m FROM Medicine m")
public class Medicine implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String medicine_Type;

	//bi-directional many-to-one association to Prescription
	@OneToMany(mappedBy="medicine")
	private List<Prescription> prescriptions;

	public Medicine() {
	}

	public String getMedicine_Type() {
		return this.medicine_Type;
	}

	public void setMedicine_Type(String medicine_Type) {
		this.medicine_Type = medicine_Type;
	}

	public List<Prescription> getPrescriptions() {
		return this.prescriptions;
	}

	public void setPrescriptions(List<Prescription> prescriptions) {
		this.prescriptions = prescriptions;
	}

	public Prescription addPrescription(Prescription prescription) {
		getPrescriptions().add(prescription);
		prescription.setMedicine(this);

		return prescription;
	}

	public Prescription removePrescription(Prescription prescription) {
		getPrescriptions().remove(prescription);
		prescription.setMedicine(null);

		return prescription;
	}

}