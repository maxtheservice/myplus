package com.persistence.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


/**
 * The persistent class for the doctor database table.
 * 
 */
@Entity
@Table(
        name = "doctor",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "mobile"),
                @UniqueConstraint(columnNames = "name")
        }
)
public class Doctor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="doctor_id")
	private Long doctorId;

	private String address;

	private String availabe;

	private String datetime;

	private String email;

	private String mobile;

	private String name;

	private String speciality;
	
	private String dayFrom;
	
	private String dayTo;
	
	@Column(name="appointment_offer_type")
	private String appointmentOfferType;
	
	@Column(name="appointment_offer_value")
	private Short appointmentOfferValue;

	@Column(name="time_in")
	private String timeIn;

	@Column(name="time_out")
	private String timeOut;

	//bi-directional many-to-one association to Appointment
	@OneToMany(mappedBy="doctor")
	private List<Appointment> appointments;

	//bi-directional many-to-one association to Hospital
	@ManyToOne
	@JoinColumn(name="hospital_id")
	private Hospital hospital;

	public Doctor() {
	}


	/**
	 * @return the doctorId
	 */
	public Long getDoctorId() {
		return doctorId;
	}


	/**
	 * @param doctorId the doctorId to set
	 */
	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}


	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAvailabe() {
		return this.availabe;
	}

	public void setAvailabe(String availabe) {
		this.availabe = availabe;
	}

	public String getDatetime() {
		return this.datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpeciality() {
		return this.speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getTimeIn() {
		return this.timeIn;
	}

	public void setTimeIn(String timeIn) {
		this.timeIn = timeIn;
	}

	public String getTimeOut() {
		return this.timeOut;
	}

	public void setTimeOut(String timeOut) {
		this.timeOut = timeOut;
	}

	public List<Appointment> getAppointments() {
		return this.appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}

	public Appointment addAppointment(Appointment appointment) {
		getAppointments().add(appointment);
		appointment.setDoctor(this);

		return appointment;
	}

	public Appointment removeAppointment(Appointment appointment) {
		getAppointments().remove(appointment);
		appointment.setDoctor(null);

		return appointment;
	}

	public Hospital getHospital() {
		return this.hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public String getDayFrom() {
		return dayFrom;
	}

	public void setDayFrom(String dayFrom) {
		this.dayFrom = dayFrom;
	}

	public String getDayTo() {
		return dayTo;
	}

	public void setDayTo(String dayTo) {
		this.dayTo = dayTo;
	}

	public String getAppointmentOfferType() {
		return appointmentOfferType;
	}

	public void setAppointmentOfferType(String appointmentOfferType) {
		this.appointmentOfferType = appointmentOfferType;
	}

	public Short getAppointmentOfferValue() {
		return appointmentOfferValue;
	}

	public void setAppointmentOfferValue(Short appointmentOfferValue) {
		this.appointmentOfferValue = appointmentOfferValue;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", address=" + address + ", availabe=" + availabe + ", datetime="
				+ datetime + ", email=" + email + ", mobile=" + mobile + ", name=" + name + ", speciality=" + speciality
				+ ", dayFrom=" + dayFrom + ", dayTo=" + dayTo + ", appointmentOfferType=" + appointmentOfferType
				+ ", appointmentOfferValue=" + appointmentOfferValue + ", timeIn=" + timeIn + ", timeOut=" + timeOut
				+ ", appointments=" + appointments + ", hospital=" + hospital + "]";
	}

	
	
}