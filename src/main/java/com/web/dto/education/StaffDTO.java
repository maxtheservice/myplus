package com.web.dto.education;

import java.io.Serializable;
import java.util.Set;

import com.validation.ValidEmail;
import com.validation.ValidMobileNumber;
import com.validation.ValidateEmpty;

public class StaffDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;

	@ValidateEmpty
	private String name;

	private String code;

	private Long userId;

	private String userType;

	@ValidEmail
	private String email;

	@ValidMobileNumber
	private String mobile;

	private String phone;

	@ValidateEmpty
	private String address;

	@ValidateEmpty
	private String designation;

	@ValidateEmpty
	private String dateOfBirth;

	@ValidateEmpty
	private String gender;

	private String timeIn;

	private String timeOut;

	@ValidateEmpty
	private String qualification;

	private Boolean married = false;

	private Boolean status = true;

	private String dated;

	@ValidateEmpty
	private Set<Long> schoolIds;

	@ValidateEmpty
	private Set<Long> gradeIds;

	@ValidateEmpty
	private Set<Long> subjectIds;

	private Set<String> schoolNames;

	private Set<String> gradeNames;

	private Set<String> subjectNames;

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
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
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
	 * @return the userType
	 */
	public String getUserType() {
		return userType;
	}

	/**
	 * @param userType the userType to set
	 */
	public void setUserType(String userType) {
		this.userType = userType;
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
	public Boolean getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}

	/**
	 * @return the dated
	 */
	public String getDated() {
		return dated;
	}

	/**
	 * @param dated the dated to set
	 */
	public void setDated(String dated) {
		this.dated = dated;
	}

	/**
	 * @return the schoolIds
	 */
	public Set<Long> getSchoolIds() {
		return schoolIds;
	}

	/**
	 * @param schoolIds the schoolIds to set
	 */
	public void setSchoolIds(Set<Long> schoolIds) {
		this.schoolIds = schoolIds;
	}

	/**
	 * @return the gradeIds
	 */
	public Set<Long> getGradeIds() {
		return gradeIds;
	}

	/**
	 * @param gradeIds the gradeIds to set
	 */
	public void setGradeIds(Set<Long> gradeIds) {
		this.gradeIds = gradeIds;
	}

	/**
	 * @return the subjectIds
	 */
	public Set<Long> getSubjectIds() {
		return subjectIds;
	}

	/**
	 * @param subjectIds the subjectIds to set
	 */
	public void setSubjectIds(Set<Long> subjectIds) {
		this.subjectIds = subjectIds;
	}

	/**
	 * @return the schoolNames
	 */
	public Set<String> getSchoolNames() {
		return schoolNames;
	}

	/**
	 * @param schoolNames the schoolNames to set
	 */
	public void setSchoolNames(Set<String> schoolNames) {
		this.schoolNames = schoolNames;
	}

	/**
	 * @return the gradeNames
	 */
	public Set<String> getGradeNames() {
		return gradeNames;
	}

	/**
	 * @param gradeNames the gradeNames to set
	 */
	public void setGradeNames(Set<String> gradeNames) {
		this.gradeNames = gradeNames;
	}

	/**
	 * @return the subjectNames
	 */
	public Set<String> getSubjectNames() {
		return subjectNames;
	}

	/**
	 * @param subjectNames the subjectNames to set
	 */
	public void setSubjectNames(Set<String> subjectNames) {
		this.subjectNames = subjectNames;
	}

	/**
	 * @return the dateOfBirth
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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
	public String getTimeIn() {
		return timeIn;
	}

	/**
	 * @param timeIn the timeIn to set
	 */
	public void setTimeIn(String timeIn) {
		this.timeIn = timeIn;
	}

	/**
	 * @return the timeOut
	 */
	public String getTimeOut() {
		return timeOut;
	}

	/**
	 * @param timeOut the timeOut to set
	 */
	public void setTimeOut(String timeOut) {
		this.timeOut = timeOut;
	}

	/**
	 * @return the married
	 */
	public Boolean getMarried() {
		return married;
	}

	/**
	 * @param married the married to set
	 */
	public void setMarried(Boolean married) {
		this.married = married;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}