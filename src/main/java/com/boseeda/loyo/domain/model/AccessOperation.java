package com.boseeda.loyo.domain.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the ACCESS_OPERATION database table.
 * 
 */
@Entity
@Table(name="ACCESS_OPERATION")
public class AccessOperation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="OPERATION_KEY")
	private long operationKey;

    @Temporal( TemporalType.DATE)
	@Column(name="CREATION_TIME")
	private Date creationTime;

	@Column(name="CREATION_ZONE")
	private String creationZone;

	private String creator;

	private String descriptions;

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

	@Column(name="OPERATION_NAME")
	private String operationName;

	@Column(name="TRX_KEY")
	private String trxKey;

	//bi-directional many-to-one association to AccessPrivilege
	@OneToMany(mappedBy="accessOperation")
	private Set<AccessPrivilege> accessPrivileges;

    public AccessOperation() {
    }

	public long getOperationKey() {
		return this.operationKey;
	}

	public void setOperationKey(long operationKey) {
		this.operationKey = operationKey;
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

	public String getOperationName() {
		return this.operationName;
	}

	public void setOperationName(String operationName) {
		this.operationName = operationName;
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
	
}