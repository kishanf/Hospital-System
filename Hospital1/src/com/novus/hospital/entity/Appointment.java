package com.novus.hospital.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the appointment database table.
 * 
 */
@Entity
@NamedQuery(name="Appointment.findAll", query="SELECT a FROM Appointment a")
public class Appointment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String appointment_ID;

	private String appointment_Date;

	private String appointment_Time;

	private String patient_ID;

	//bi-directional many-to-one association to Doctor
	@ManyToOne
	@JoinColumn(name="Doctor_ID")
	private Doctor doctor;

	public Appointment() {
	}

	public String getAppointment_ID() {
		return this.appointment_ID;
	}

	public void setAppointment_ID(String appointment_ID) {
		this.appointment_ID = appointment_ID;
	}

	public String getAppointment_Date() {
		return this.appointment_Date;
	}

	public void setAppointment_Date(String appointment_Date) {
		this.appointment_Date = appointment_Date;
	}

	public String getAppointment_Time() {
		return this.appointment_Time;
	}

	public void setAppointment_Time(String appointment_Time) {
		this.appointment_Time = appointment_Time;
	}

	public String getPatient_ID() {
		return this.patient_ID;
	}

	public void setPatient_ID(String patient_ID) {
		this.patient_ID = patient_ID;
	}

	public Doctor getDoctor() {
		return this.doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

}