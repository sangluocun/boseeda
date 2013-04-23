package com.boseeda.loyo.domain.model;

import java.io.Serializable;
import javax.persistence.*;

import com.boseeda.loyo.domain.SuperEntity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

/**
 * The persistent class for the ACCESS_USER database table.
 * 
 */
@Entity
@Table(name = "ACCESS_USER")
public class AccessUser extends SuperEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private String emailAddress;

	private String firstName;

	private String lastLoginIp;

	@Temporal(TemporalType.DATE)
	private Date lastLoginTime;

	private String lastLoginZone;

	private String lastName;

	private BigDecimal loginCount;

	private String mobilePhone;

	private String officePhone;

	private String password;

	@Temporal(TemporalType.DATE)
	private Date passwordExpiration;

	private String passwordExpirationZone;

	private String shiftKey;

	@Temporal(TemporalType.DATE)
	private Date userExpiration;

	private String userExpirationZone;

	private String userName;

	// bi-directional many-to-many association to AccessRole
	@ManyToMany
	@JoinTable(name = "ACCESS_USER_ROLE", joinColumns = { @JoinColumn(name = "USER_KEY") }, inverseJoinColumns = { @JoinColumn(name = "ROLE_KEY") })
	private Set<AccessRole> accessRoles;

	public AccessUser() {
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastLoginIp() {
		return this.lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public Date getLastLoginTime() {
		return this.lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getLastLoginZone() {
		return this.lastLoginZone;
	}

	public void setLastLoginZone(String lastLoginZone) {
		this.lastLoginZone = lastLoginZone;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public BigDecimal getLoginCount() {
		return this.loginCount;
	}

	public void setLoginCount(BigDecimal loginCount) {
		this.loginCount = loginCount;
	}

	public String getMobilePhone() {
		return this.mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getOfficePhone() {
		return this.officePhone;
	}

	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getPasswordExpiration() {
		return this.passwordExpiration;
	}

	public void setPasswordExpiration(Date passwordExpiration) {
		this.passwordExpiration = passwordExpiration;
	}

	public String getPasswordExpirationZone() {
		return this.passwordExpirationZone;
	}

	public Date getUserExpiration() {
		return this.userExpiration;
	}

	public void setUserExpiration(Date userExpiration) {
		this.userExpiration = userExpiration;
	}

	public String getUserExpirationZone() {
		return this.userExpirationZone;
	}

	public void setUserExpirationZone(String userExpirationZone) {
		this.userExpirationZone = userExpirationZone;
	}

	public String getUserName() {
		return this.userName;
	}

	public Set<AccessRole> getAccessRoles() {
		return this.accessRoles;
	}

	public void setAccessRoles(Set<AccessRole> accessRoles) {
		this.accessRoles = accessRoles;
	}	
	
	public boolean login(){
		return false;
	}
	
	public boolean changeState(){
		return true;
	}
}