package com.novus.hospital.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the bed database table.
 * 
 */
@Entity
@NamedQuery(name="Bed.findAll", query="SELECT b FROM Bed b")
public class Bed implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String bed_ID;

	//bi-directional many-to-one association to Ward
	@ManyToOne
	@JoinColumn(name="Ward_Name")
	private Ward ward;

	public Bed() {
	}

	public String getBed_ID() {
		return this.bed_ID;
	}

	public void setBed_ID(String bed_ID) {
		this.bed_ID = bed_ID;
	}

	public Ward getWard() {
		return this.ward;
	}

	public void setWard(Ward ward) {
		this.ward = ward;
	}

}