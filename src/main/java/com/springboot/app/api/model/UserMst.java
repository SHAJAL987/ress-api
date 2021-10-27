package com.springboot.app.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="ms_user_mst")
public class UserMst {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="USER_NAME", nullable = false)
	private String pUserName;
	@Column(name="EMAIL", nullable = false)
	private String pEmail;
	@Column(name="MOBILE", nullable = true)
	private String pMobile;
	@Column(name="USER_TYPE", nullable = true)
	private String pUserType;
	@Column(name="USER_IMG", nullable = true)
	private String pUserImage;
	@Column(name="ROLE_ID", nullable = false)
	private int pRoleId;
	@Column(name="USER_PASS", nullable = false)
	private String pUserPass;
	@Column(name="STATUS", nullable = true)
	private String pStatus;
	@Column(name="CREATE_BY", nullable = false)
	private String pCreateBy;
	@Column(name="CREATE_ON", nullable = true)
	private String pCreateOn;
	@Column(name="UPDATE_BY", nullable = true)
	private String pUpdateBy;
	@Column(name="UPDATE_ON", nullable = true)
	private String pUpdateOn;
	@Column(name="GROUP_CODE", nullable = false)
	private String pGroupCode;
	@Column(name="GENDER", nullable = true)
	private String pGender;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getpUserName() {
		return pUserName;
	}
	public void setpUserName(String pUserName) {
		this.pUserName = pUserName;
	}
	public String getpEmail() {
		return pEmail;
	}
	public void setpEmail(String pEmail) {
		this.pEmail = pEmail;
	}
	public String getpMobile() {
		return pMobile;
	}
	public void setpMobile(String pMobile) {
		this.pMobile = pMobile;
	}
	public String getpUserType() {
		return pUserType;
	}
	public void setpUserType(String pUserType) {
		this.pUserType = pUserType;
	}
	public String getpUserImage() {
		return pUserImage;
	}
	public void setpUserImage(String pUserImage) {
		this.pUserImage = pUserImage;
	}
	public int getpRoleId() {
		return pRoleId;
	}
	public void setpRoleId(int pRoleId) {
		this.pRoleId = pRoleId;
	}
	public String getpUserPass() {
		return pUserPass;
	}
	public void setpUserPass(String pUserPass) {
		this.pUserPass = pUserPass;
	}
	public String getpStatus() {
		return pStatus;
	}
	public void setpStatus(String pStatus) {
		this.pStatus = pStatus;
	}
	public String getpCreateBy() {
		return pCreateBy;
	}
	public void setpCreateBy(String pCreateBy) {
		this.pCreateBy = pCreateBy;
	}
	public String getpCreateOn() {
		return pCreateOn;
	}
	public void setpCreateOn(String pCreateOn) {
		this.pCreateOn = pCreateOn;
	}
	public String getpUpdateBy() {
		return pUpdateBy;
	}
	public void setpUpdateBy(String pUpdateBy) {
		this.pUpdateBy = pUpdateBy;
	}
	public String getpUpdateOn() {
		return pUpdateOn;
	}
	public void setpUpdateOn(String pUpdateOn) {
		this.pUpdateOn = pUpdateOn;
	}
	public String getpGroupCode() {
		return pGroupCode;
	}
	public void setpGroupCode(String pGroupCode) {
		this.pGroupCode = pGroupCode;
	}
	
	public String getpGender() {
		return pGender;
	}
	public void setpGender(String pGender) {
		this.pGender = pGender;
	}
	
	
	
}
