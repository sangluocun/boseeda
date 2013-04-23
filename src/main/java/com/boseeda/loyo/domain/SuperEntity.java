package com.boseeda.loyo.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@SuppressWarnings("serial")
@MappedSuperclass
public abstract class SuperEntity implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	protected String id;
	
	@Version
	private Integer version;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	} 

	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	
	public String toString() {
		return "" + getId();
	}
	
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		SuperEntity other = (SuperEntity) obj;
		if (getId() == null) {
			return false;
		} else if (!getId().equals(other.getId())) {
			return false;
		}
		return true;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (getId() == null ? 0 : getId().hashCode());
		return result;
	}
}
