package com.project.back_end.models;

import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;


@Document(collection = "prescriptions")
public class Prescription{
    @Id
    private String id;
    @NotNull
    @Size(min = 3, max = 100)
    private String patientName;
    @NotNull
    @Size(min = 3, max = 20)
    private String appointmentId;
    @NotNull
    @Size(min = 3, max = 100)
    private String medication;
    @NotNull
    @Size(min = 3, max = 20)
    private String dosage;
    @NotNull
    @Size(max = 200)
    private String doctorNotes;


    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}

	public String getMedication() {
		return medication;
	}

	public void setMedication(String medication) {
		this.medication = medication;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public String getDoctorNotes() {
		return doctorNotes;
	}

	public void setDoctorNotes(String doctorNotes) {
		this.doctorNotes = doctorNotes;
	}
}