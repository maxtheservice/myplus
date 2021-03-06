package com.web.dto.education;

import java.io.Serializable;

import com.validation.ValidEmail;
import com.validation.ValidMobileNumber;
import com.validation.ValidateEmpty;

public class GuardianDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;

	@ValidateEmpty
	private String name;

	private Long userId;

	private String userType;

	@ValidEmail
	private String email;

	@ValidMobileNumber
	private String mobile;

	private String phone;

	private String tempAddress;

	@ValidateEmpty
	private String permAddress;

	@ValidateEmpty
	private String relation;

	private String occupation;

//	private List<String> students;

	private String datedStr;

	private String updatedStr;

	private String status;

	private String cnic;

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
	 * @return the occupation
	 */
	public String getOccupation() {
		return occupation;
	}

	/**
	 * @param occupation the occupation to set
	 */
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

//	/**
//	 * @return the students
//	 */
//	public List<String> getStudents() {
//		return students;
//	}
//
//	/**
//	 * @param students the students to set
//	 */
//	public void setStudents(List<String> students) {
//		this.students = students;
//	}

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
	 * @return the tempAddress
	 */
	public String getTempAddress() {
		return tempAddress;
	}

	/**
	 * @param tempAddress the tempAddress to set
	 */
	public void setTempAddress(String tempAddress) {
		this.tempAddress = tempAddress;
	}

	/**
	 * @return the permAddress
	 */
	public String getPermAddress() {
		return permAddress;
	}

	/**
	 * @param permAddress the permAddress to set
	 */
	public void setPermAddress(String permAddress) {
		this.permAddress = permAddress;
	}

	/**
	 * @return the relation
	 */
	public String getRelation() {
		return relation;
	}

	/**
	 * @param relation the relation to set
	 */
	public void setRelation(String relation) {
		this.relation = relation;
	}

	/**
	 * @return the datedStr
	 */
	public String getDatedStr() {
		return datedStr;
	}

	/**
	 * @param datedStr the datedStr to set
	 */
	public void setDatedStr(String datedStr) {
		this.datedStr = datedStr;
	}

	/**
	 * @return the updatedStr
	 */
	public String getUpdatedStr() {
		return updatedStr;
	}

	/**
	 * @param updatedStr the updatedStr to set
	 */
	public void setUpdatedStr(String updatedStr) {
		this.updatedStr = updatedStr;
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
	 * @return the cnic
	 */
	public String getCnic() {
		return cnic;
	}

	/**
	 * @param cnic the cnic to set
	 */
	public void setCnic(String cnic) {
		this.cnic = cnic;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}