package com.cg.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Candidate_Personal")
public class CandidatePersonal implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	private String candidateId;
	private String candidateName;
	private String address;
	private LocalDate date;
	private String emailId;
	private String contactNumber;
	private String maritalStatus;
	private String Gender;
	private String passportNumber;
	public String getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
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
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "CandidatePersonal [candidateId=" + candidateId
				+ ", candidateName=" + candidateName + ", address=" + address
				+ ", date=" + date + ", emailId=" + emailId
				+ ", contactNumber=" + contactNumber + ", maritalStatus="
				+ maritalStatus + ", Gender=" + Gender + ", passportNumber="
				+ passportNumber + "]";
	}
	
	
	
	
}
