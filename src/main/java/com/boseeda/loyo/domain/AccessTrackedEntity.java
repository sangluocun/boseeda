package com.boseeda.loyo.domain;

import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import com.boseeda.loyo.domain.model.AccessClue;

@MappedSuperclass
public abstract class AccessTrackedEntity
    extends IdEntity
{

    private static final long serialVersionUID = 1L;

    private AccessClue accessClue = null;

    @ManyToOne(optional = false)
    public AccessClue getAccessCule() {
        return this.accessClue;
    }

    public void setAccessCule(AccessClue accessClue) {
        this.accessClue = accessClue;
    }

}
