package com.persistence.model.education;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import lombok.Getter;
import lombok.Setter;

/**
 * The persistent class for the doctor database table.
 * 
 */
@Entity
@Table(name = "staff")

public class Staff implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "staff_gen", sequenceName = "staff_seq",initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "staff_gen")	
	@Column(name = "staff_id", unique = true, nullable = false)
	private Long id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "user_id")
	private Long userId;

	private String email;

	private String mobile;

	private String phone;

	private String address;

	private String designation;

	@Column(name = "date_of_birth")
	@Getter@Setter
	private LocalDate staffDOB;

	private String gender;

	@Column(name = "time_in")
	private LocalTime timeIn;

	@Column(name = "time_out")
	private LocalTime timeOut;

	private String qualification;

	@Column(name = "martial_status")
	private String martialStatus;

	private String status;

//	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime dated;

//	@Temporal(TemporalType.TIMESTAMP)
	@Column(updatable=false)
	private LocalDateTime updated;

//    @ManyToMany(fetch = FetchType.EAGER)
//	@NotFound(action=NotFoundAction.IGNORE)
//    @Fetch(value = FetchMode.SUBSELECT)
//	@JoinTable(name = "staffs_schools", joinColumns = @JoinColumn(name = "staff_id", referencedColumnName = "staff_id"), inverseJoinColumns = @JoinColumn(name = "school_id", referencedColumnName = "school_id"))
//	private List<School> schools;
//
    @ManyToMany(fetch = FetchType.EAGER)
	@NotFound(action=NotFoundAction.IGNORE)
	@JoinColumn(name = "grade_Ids")
	private List<Grade> grades;

	// Bi-directional on-to-many association to subject
//	@OneToMany(mappedBy = "staff")
//	private Set<Subject> subjects;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * @return the qualification
	 */
	public String getQualification() {
		return qualification;
	}

	/**
	 * @param qualification the qualification to set
	 */
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the dated
	 */
	public LocalDateTime getDated() {
		return dated;
	}

	/**
	 * @param dated the dated to set
	 */
	public void setDated(LocalDateTime dated) {
		this.dated = dated;
	}

	/**
	 * @return the updated
	 */
	public LocalDateTime getUpdated() {
		return updated;
	}

	/**
	 * @param updated the updated to set
	 */
	public void setUpdated(LocalDateTime updated) {
		this.updated = updated;
	}


//	/**
//	 * @return the schools
//	 */
//	public List<School> getSchools() {
//		return schools;
//	}
//
//	/**
//	 * @param schools the schools to set
//	 */
//	public void setSchools(List<School> schools) {
//		this.schools = schools;
//	}
//
	/**
	 * @return the grades
	 */
	public List<Grade> getGrades() {
		return grades;
	}

	/**
	 * @param grades the grades to set
	 */
	public void setGrades(List<Grade> grades) {
		this.grades = grades;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the timeIn
	 */
	public LocalTime getTimeIn() {
		return timeIn;
	}

	/**
	 * @param timeIn the timeIn to set
	 */
	public void setTimeIn(LocalTime timeIn) {
		this.timeIn = timeIn;
	}

	/**
	 * @return the timeOut
	 */
	public LocalTime getTimeOut() {
		return timeOut;
	}

	/**
	 * @param timeOut the timeOut to set
	 */
	public void setTimeOut(LocalTime timeOut) {
		this.timeOut = timeOut;
	}

	/**
	 * @return the martialStatus
	 */
	public String getMartialStatus() {
		return martialStatus;
	}

	/**
	 * @param martialStatus the martialStatus to set
	 */
	public void setMartialStatus(String martialStatus) {
		this.martialStatus = martialStatus;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}