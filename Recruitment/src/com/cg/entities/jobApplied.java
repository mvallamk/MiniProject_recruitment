package com.cg.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Job_Applied")
public class jobApplied implements Serializable 
{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	private String jobId;
	private String candidateId;
	
	public jobApplied() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public jobApplied(String jobId, String candidateId) {
		super();
		this.jobId = jobId;
		this.candidateId = candidateId;
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

	@Override
	public String toString() {
		return "jobApplied [jobId=" + jobId + ", candidateId=" + candidateId
				+ "]";
	}
	
	
	
	
}
