package com.cg.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="Company_Master")
@NamedQueries(value = {@NamedQuery(name = "Company.getAll", query = "SELECT b FROM CompanyMaster b")})
public class CompanyMaster implements Serializable 
{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="Company_Id")
	private String companyId;
	
	@Column(name="Company_Name")
	private String companyName;
	
	@Column(name="Company_Address")
	private String companyAddress;
	
	@Column(name="Contact_Person")
	private String contactPerson;
	
	@Column(name="Email_Id")
	private String emailId;
	
	@Column(name="Contact_Number")
	private String contactNumber;

	public CompanyMaster() {
		super();

	}

	public CompanyMaster(String companyId, String companyName,
			String companyAddress, String contactPerson, String emailId,
			String contactNumber) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.contactPerson = contactPerson;
		this.emailId = emailId;
		this.contactNumber = contactNumber;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "Company_Master [companyId=" + companyId + ", companyName="
				+ companyName + ", companyAddress=" + companyAddress
				+ ", contactPerson=" + contactPerson + ", emailId=" + emailId
				+ ", contactNumber=" + contactNumber + "]";
	}

}
