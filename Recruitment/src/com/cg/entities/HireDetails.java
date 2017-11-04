package com.cg.entities;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Hire_Details")
public class HireDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Sr_No")
	private int srNo;
	@Column(name="job_id")
	private String jobId;
	@Column(name="candidate_id")
	private String candidateId;
	@Column(name="hire_Date")
	private Date hireDate;
	@Column(name="Company_Id")
	private String companyId;
	public int getSrNo() {
		return srNo;
	}
	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public String getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	
	@Override
	public String toString() {
		return "HireDetails [srNo=" + srNo + ", jobId=" + jobId
				+ ", candidateId=" + candidateId + ", hireDate=" + hireDate
				+ ", companyId=" + companyId + "]";
	}
	public HireDetails(String jobId, String candidateId,
			Date hireDate, String companyId) {
		super();
		//this.srNo = srNo;
		this.jobId = jobId;
		this.candidateId = candidateId;
		this.hireDate = hireDate;
		this.companyId = companyId;
	}
	public HireDetails() {
		
	}
	
	
	
	
	
}
