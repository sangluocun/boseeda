package com.boseeda.loyo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Client contains informations about the access client
 */
@Entity
@Table(name = "access_client")
@Inheritance(strategy = InheritanceType.JOINED)
public class AuditLog
    extends IdEntity
{
    private static final long serialVersionUID = 1L;

    private String name = null;

    private String number = null;
    
    private String code = "";

    private String email = "";

    private String phone = "";

    private String fax = ""; 

	private String computerName = "";

	private String ip ="";
	
	private String invokerMethod = "";
    
    /**
     * Creates a new instance of Client.
     */
    public AuditLog() {
        super();
    }

    /**
     * Creates a new instance of Client. This constructor must not be
     * used except of the system client.
     * 
     * @param id the id of the new client; for use of the system client
     *            only!
     */
    public AuditLog(long id) {
        super();
        setId(id);
    }

    /**
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
     * @return Returns the number.
     */
    @Column(nullable = false, unique = true, name="cl_nr")
    public String getNumber() {
        return this.number;
    }

    /**
     * @param number The number to set.
     */
    public void setNumber(String number) {
        this.number = number;
    }

    @Column(unique = true, name="cl_code")
    public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	/**
     * Returns the email address of the client. The email address can be
     * used to send automaticly generated emails.
     * 
     * @return Returns the email.
     */
//    @Column(nullable = false)
    public String getEmail() {
        return this.email;
    }

    /**
     * @see #getEmail()
     * @param email The email to set.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the fax
     */
    public String getFax() {
        return this.fax;
    }

    /**
     * @param fax the fax to set
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    @Override
    public String toUniqueString() {
        return getNumber();
    }

    @Transient
    public boolean isSystemClient() {
        if (getId() == 0)
            return true;
        else
            return false;
    }
    
    public String getComputerName() {
		return computerName;
	}

    public void setComputerName(String computerName) {
		this.computerName = computerName;
	}
    
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getInvokerMethod() {
		return invokerMethod;
	}

	public void setInvokerMethod(String invokerMethod) {
		this.invokerMethod = invokerMethod;
	}
}
