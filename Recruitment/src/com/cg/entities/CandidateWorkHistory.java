package com.cg.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Candidate_Work_History")
public class CandidateWorkHistory implements Serializable 
{
	private static final long serialVersionUID = 1L;
	@Id
	private String workId;
	private String candidateId;
	private String whichEmployer;
	private String contactPerson;
	private String positionHeld;
	private String companyName;
	private LocalDate employmentFrom;
	private LocalDate employmentTo;
	private String reasonForLeaving;
	private String responsibilities;
	private String hrRepName;
	private String hrRepContactNumber;
	public String getWorkId() {
		return workId;
	}
	public void setWorkId(String workId) {
		this.workId = workId;
	}
	public String getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}
	public String getWhichEmployer() {
		return whichEmployer;
	}
	public void setWhichEmployer(String whichEmployer) {
		this.whichEmployer = whichEmployer;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getPositionHeld() {
		return positionHeld;
	}
	public void setPositionHeld(String positionHeld) {
		this.positionHeld = positionHeld;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public LocalDate getEmploymentFrom() {
		return employmentFrom;
	}
	public void setEmploymentFrom(LocalDate employmentFrom) {
		this.employmentFrom = employmentFrom;
	}
	public LocalDate getEmploymentTo() {
		return employmentTo;
	}
	public void setEmploymentTo(LocalDate employmentTo) {
		this.employmentTo = employmentTo;
	}
	public String getReasonForLeaving() {
		return reasonForLeaving;
	}
	public void setReasonForLeaving(String reasonForLeaving) {
		this.reasonForLeaving = reasonForLeaving;
	}
	public String getResponsibilities() {
		return responsibilities;
	}
	public void setResponsibilities(String responsibilities) {
		this.responsibilities = responsibilities;
	}
	public String getHrRepName() {
		return hrRepName;
	}
	public void setHrRepName(String hrRepName) {
		this.hrRepName = hrRepName;
	}
	public String getHrRepContactNumber() {
		return hrRepContactNumber;
	}
	public void setHrRepContactNumber(String hrRepContactNumber) {
		this.hrRepContactNumber = hrRepContactNumber;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "CandidateWorkHistory [workId=" + workId + ", candidateId="
				+ candidateId + ", whichEmployer=" + whichEmployer
				+ ", contactPerson=" + contactPerson + ", positionHeld="
				+ positionHeld + ", companyName=" + companyName
				+ ", employmentFrom=" + employmentFrom + ", employmentTo="
				+ employmentTo + ", reasonForLeaving=" + reasonForLeaving
				+ ", responsibilities=" + responsibilities + ", hrRepName="
				+ hrRepName + ", hrRepContactNumber=" + hrRepContactNumber
				+ "]";
	}
	
	
}
