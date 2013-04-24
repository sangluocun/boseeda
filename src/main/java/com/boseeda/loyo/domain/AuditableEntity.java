package com.boseeda.loyo.domain;

import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AuditableEntity
    extends IdEntity
{

    private static final long serialVersionUID = 1L;

    private AuditLog auditClient = null;

    @ManyToOne(optional = false)
    public AuditLog getClient() {
        return this.auditClient;
    }

    public void setClient(AuditLog client) {
        this.auditClient = client;
    }

    public String toShortString() {
    	return super.toShortString() + "[client=" + auditClient.getNumber() + "]";
    }

}
