package com.web.dto.education;

import java.io.Serializable;

import com.validation.ValidEmail;
import com.validation.ValidMobileNumber;
import com.validation.ValidateEmpty;

public class SchoolOwnerDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@ValidateEmpty
	private String name;

	private Long id;

	private Long userId;

	private String userType;

	@ValidEmail
	private String email;

	@ValidMobileNumber
	private String mobile;

	@ValidateEmpty
	private String address;

	private String dated;

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
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}