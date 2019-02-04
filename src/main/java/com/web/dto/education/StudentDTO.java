package com.web.dto.education;

import java.io.Serializable;
import java.sql.Time;
import java.util.List;

import com.validation.ValidEmail;
import com.validation.ValidMobileNumber;
import com.validation.ValidateEmpty;

public class StudentDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;

	@ValidateEmpty
	private String name;

	private Long userId;

	private String userType;

	@ValidateEmpty
	private String enrollNo;

	@ValidateEmpty
	private String enrollDate;

	private String updated;

	@ValidEmail
	private String email;

	@ValidMobileNumber
	private String mobile;

	private String phone;

	@ValidateEmpty
	private String address;

	private Time time_in;

	private Time time_out;

	private List<String> hobbies;

	private String boodGroup;

	@ValidateEmpty
	private String dateOfBirth;

	@ValidateEmpty
	private Long guardianId;

	private String guardianName;

	private Long vehicleId;

	private String vehicleName;

	@ValidateEmpty
	private Long schoolId;

	private String schoolName;

	@ValidateEmpty
	private Long gradeId;

	private String gradeName;

	private String status = "Active";

	@ValidateEmpty
	private String gender;

	private String datedStr;

	private String updatedStr;

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
	 * @return the enrollDate
	 */
	public String getEnrollDate() {
		return enrollDate;
	}

	/**
	 * @param enrollDate the enrollDate to set
	 */
	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}

	/**
	 * @return the updated
	 */
	public String getUpdated() {
		return updated;
	}

	/**
	 * @param updated the updated to set
	 */
	public void setUpdated(String updated) {
		this.updated = updated;
	}

	/**
	 * @return the guardianId
	 */
	public Long getGuardianId() {
		return guardianId;
	}

	/**
	 * @param guardianId the guardianId to set
	 */
	public void setGuardianId(Long guardianId) {
		this.guardianId = guardianId;
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
	 * @return the enrollNo
	 */
	public String getEnrollNo() {
		return enrollNo;
	}

	/**
	 * @param enrollNo the enrollNo to set
	 */
	public void setEnrollNo(String enrollNo) {
		this.enrollNo = enrollNo;
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
	 * @return the time_in
	 */
	public Time getTime_in() {
		return time_in;
	}

	/**
	 * @param time_in the time_in to set
	 */
	public void setTime_in(Time time_in) {
		this.time_in = time_in;
	}

	/**
	 * @return the time_out
	 */
	public Time getTime_out() {
		return time_out;
	}

	/**
	 * @param time_out the time_out to set
	 */
	public void setTime_out(Time time_out) {
		this.time_out = time_out;
	}

	/**
	 * @return the hobbies
	 */
	public List<String> getHobbies() {
		return hobbies;
	}

	/**
	 * @param hobbies the hobbies to set
	 */
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	/**
	 * @return the boodGroup
	 */
	public String getBoodGroup() {
		return boodGroup;
	}

	/**
	 * @param boodGroup the boodGroup to set
	 */
	public void setBoodGroup(String boodGroup) {
		this.boodGroup = boodGroup;
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
	 * @return the guardianName
	 */
	public String getGuardianName() {
		return guardianName;
	}

	/**
	 * @param guardianName the guardianName to set
	 */
	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}

	/**
	 * @return the vehicleId
	 */
	public Long getVehicleId() {
		return vehicleId;
	}

	/**
	 * @param vehicleId the vehicleId to set
	 */
	public void setVehicleId(Long vehicleId) {
		this.vehicleId = vehicleId;
	}

	/**
	 * @return the vehicleName
	 */
	public String getVehicleName() {
		return vehicleName;
	}

	/**
	 * @param vehicleName the vehicleName to set
	 */
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	/**
	 * @return the schoolId
	 */
	public Long getSchoolId() {
		return schoolId;
	}

	/**
	 * @param schoolId the schoolId to set
	 */
	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
	}

	/**
	 * @return the schoolName
	 */
	public String getSchoolName() {
		return schoolName;
	}

	/**
	 * @param schoolName the schoolName to set
	 */
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
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
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the gradeId
	 */
	public Long getGradeId() {
		return gradeId;
	}

	/**
	 * @param gradeId the gradeId to set
	 */
	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	}

	/**
	 * @return the gradeName
	 */
	public String getGradeName() {
		return gradeName;
	}

	/**
	 * @param gradeName the gradeName to set
	 */
	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", name=" + name + ", userId=" + userId + ", userType=" + userType
				+ ", enrollNo=" + enrollNo + ", updated=" + updated + ", email=" + email + ", mobile=" + mobile
				+ ", phone=" + phone + ", address=" + address + ", DOB=" + time_in + ", time_out=" + time_out
				+ ", hobbies=" + hobbies + ", boodGroup=" + boodGroup + ", enrollDate=" + enrollDate + ", guardianId="
				+ guardianId + ", gradeId=" + gradeId + ", status=" + status + "]";
	}

}