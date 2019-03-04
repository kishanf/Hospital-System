package com.novus.hospital.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ward database table.
 * 
 */
@Entity
@NamedQuery(name="Ward.findAll", query="SELECT w FROM Ward w")
public class Ward implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String ward_Name;

	//bi-directional many-to-one association to Bed
	@OneToMany(mappedBy="ward")
	private List<Bed> beds;

	//bi-directional many-to-one association to Nurse
	@OneToMany(mappedBy="ward")
	private List<Nurse> nurses;

	public Ward() {
	}

	public String getWard_Name() {
		return this.ward_Name;
	}

	public void setWard_Name(String ward_Name) {
		this.ward_Name = ward_Name;
	}

	public List<Bed> getBeds() {
		return this.beds;
	}

	public void setBeds(List<Bed> beds) {
		this.beds = beds;
	}

	public Bed addBed(Bed bed) {
		getBeds().add(bed);
		bed.setWard(this);

		return bed;
	}

	public Bed removeBed(Bed bed) {
		getBeds().remove(bed);
		bed.setWard(null);

		return bed;
	}

	public List<Nurse> getNurses() {
		return this.nurses;
	}

	public void setNurses(List<Nurse> nurses) {
		this.nurses = nurses;
	}

	public Nurse addNurs(Nurse nurs) {
		getNurses().add(nurs);
		nurs.setWard(this);

		return nurs;
	}

	public Nurse removeNurs(Nurse nurs) {
		getNurses().remove(nurs);
		nurs.setWard(null);

		return nurs;
	}

}