package com.boseeda.loyo.domain.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the ACCESS_PRIVILEGE database table.
 * 
 */
@Entity
@Table(name="ACCESS_PRIVILEGE")
public class AccessPrivilege implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PRIVILEGE_KEY")
	private long privilegeKey;

    @Temporal( TemporalType.DATE)
	@Column(name="CREATION_TIME")
	private Date creationTime;

	@Column(name="CREATION_ZONE")
	private String creationZone;

	private String creator;

	private String descriptions;

	@Column(name="LIFE_STATE")
	private String lifeState;

    @Temporal( TemporalType.DATE)
	@Column(name="MODIFIED_TIME")
	private Date modifiedTime;

	@Column(name="MODIFIED_ZONE")
	private String modifiedZone;

	private String modifier;

	@Column(name="TRX_KEY")
	private String trxKey;

	//bi-directional many-to-one association to AccessOperation
    @ManyToOne
	@JoinColumn(name="OPERATION_KEY")
	private AccessOperation accessOperation;

	//bi-directional many-to-one association to AccessResource


	//bi-directional many-to-many association to AccessRole
	@ManyToMany(mappedBy="accessPrivileges")
	private Set<AccessRole> accessRoles;

    public AccessPrivilege() {
    }

	public long getPrivilegeKey() {
		return this.privilegeKey;
	}

	public void setPrivilegeKey(long privilegeKey) {
		this.privilegeKey = privilegeKey;
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

	public String getDescriptions() {
		return this.descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
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

	public String getTrxKey() {
		return this.trxKey;
	}

	public void setTrxKey(String trxKey) {
		this.trxKey = trxKey;
	}

	public AccessOperation getAccessOperation() {
		return this.accessOperation;
	}

	public void setAccessOperation(AccessOperation accessOperation) {
		this.accessOperation = accessOperation;
	}
	
	
	public Set<AccessRole> getAccessRoles() {
		return this.accessRoles;
	}

	public void setAccessRoles(Set<AccessRole> accessRoles) {
		this.accessRoles = accessRoles;
	}
	
}