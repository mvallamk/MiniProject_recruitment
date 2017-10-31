package com.cg.entities;

public class jobApplied
{
	private String jobId;
	private String candidateId;
	
	public jobApplied() {
		super();
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
