package com.boseeda.loyo.domain.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the ACCESS_ROLE database table.
 * 
 */
@Entity
@Table(name="ACCESS_ROLE")
public class AccessRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ROLE_KEY")
	private long roleKey;

    @Temporal( TemporalType.DATE)
	@Column(name="CREATION_TIME")
	private Date creationTime;

	@Column(name="CREATION_ZONE")
	private String creationZone;

	private String creator;

	private String description;

	@Column(name="DISPLAY_NAME")
	private String displayName;

	@Column(name="LIFE_STATE")
	private String lifeState;

    @Temporal( TemporalType.DATE)
	@Column(name="MODIFIED_TIME")
	private Date modifiedTime;

	@Column(name="MODIFIED_ZONE")
	private String modifiedZone;

	private String modifier;

	@Column(name="ROLE_NAME")
	private String roleName;

	@Column(name="TRX_KEY")
	private String trxKey;

	//bi-directional many-to-many association to AccessPrivilege
    @ManyToMany
	@JoinTable(
		name="ACCESS_ROLE_PRIVILEGE"
		, joinColumns={
			@JoinColumn(name="ROLE_KEY")
			}
		, inverseJoinColumns={
			@JoinColumn(name="PRIVILEGE_KEY")
			}
		)
	private Set<AccessPrivilege> accessPrivileges;

	//bi-directional many-to-many association to AccessUser
	@ManyToMany(mappedBy="accessRoles")
	private Set<AccessUser> accessUsers;

    public AccessRole() {
    }

	public long getRoleKey() {
		return this.roleKey;
	}

	public void setRoleKey(long roleKey) {
		this.roleKey = roleKey;
	}

	public Date getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public String getCreationZone() {
		return this.creationZone;
	}

	public void setCreationZone(String creationZone) {
		this.creationZone = creationZone;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getLifeState() {
		return this.lifeState;
	}

	public void setLifeState(String lifeState) {
		this.lifeState = lifeState;
	}

	public Date getModifiedTime() {
		return this.modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getModifiedZone() {
		return this.modifiedZone;
	}

	public void setModifiedZone(String modifiedZone) {
		this.modifiedZone = modifiedZone;
	}

	public String getModifier() {
		return this.modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getTrxKey() {
		return this.trxKey;
	}

	public void setTrxKey(String trxKey) {
		this.trxKey = trxKey;
	}

	public Set<AccessPrivilege> getAccessPrivileges() {
		return this.accessPrivileges;
	}

	public void setAccessPrivileges(Set<AccessPrivilege> accessPrivileges) {
		this.accessPrivileges = accessPrivileges;
	}
	
	public Set<AccessUser> getAccessUsers() {
		return this.accessUsers;
	}

	public void setAccessUsers(Set<AccessUser> accessUsers) {
		this.accessUsers = accessUsers;
	}
	
}