package com.boseeda.loyo.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import com.boseeda.loyo.domain.AccessTrackedEntity;

/**
 * The role enables user to operate specific processes. 
 */
@Entity
@Table(name = "access_role")
@Inheritance(strategy = InheritanceType.JOINED)
public class AccessRole
    extends AccessTrackedEntity
{
    private static final long serialVersionUID = 1L;

    private String name = null;
    private String description = "";

    /**
     * The system unique name of the role
     * 
     * @return Returns the name.
     */
    @Column(nullable = false, unique = true)
    public String getName() {
        return this.name;
    }

    /**
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Returns the description.
     */
    @Column(nullable = false)
    public String getDescription() {
        return this.description;
    }

    /**
     * @param description The description to set.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toUniqueString() {
        return getName();
    }
 
}
