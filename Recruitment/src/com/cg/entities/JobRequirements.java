package com.cg.entities;

public class JobRequirements 
{
	private String jobID;
	private String companyId;
	private String positionRequired;
	private int numberRequired;
	private int experienceRequired;
	private String qualificationRequired;
	private String jobLocation;
	private String jobDescription;
	
	public JobRequirements() {
		super();
	}

	public JobRequirements(String jobID, String companyId,
			String positionRequired, int numberRequired,
			int experienceRequired, String qualificationRequired,
			String jobLocation, String jobDescription) {
		super();
		this.jobID = jobID;
		this.companyId = companyId;
		this.positionRequired = positionRequired;
		this.numberRequired = numberRequired;
		this.experienceRequired = experienceRequired;
		this.qualificationRequired = qualificationRequired;
		this.jobLocation = jobLocation;
		this.jobDescription = jobDescription;
	}

	public String getJobID() {
		return jobID;
	}

	public void setJobID(String jobID) {
		this.jobID = jobID;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getPositionRequired() {
		return positionRequired;
	}

	public void setPositionRequired(String positionRequired) {
		this.positionRequired = positionRequired;
	}

	public int getNumberRequired() {
		return numberRequired;
	}

	public void setNumberRequired(int numberRequired) {
		this.numberRequired = numberRequired;
	}

	public int getExperienceRequired() {
		return experienceRequired;
	}

	public void setExperienceRequired(int experienceRequired) {
		this.experienceRequired = experienceRequired;
	}

	public String getQualificationRequired() {
		return qualificationRequired;
	}

	public void setQualificationRequired(String qualificationRequired) {
		this.qualificationRequired = qualificationRequired;
	}

	public String getJobLocation() {
		return jobLocation;
	}

	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	@Override
	public String toString() {
		return "JobRequirements [jobID=" + jobID + ", companyId=" + companyId
				+ ", positionRequired=" + positionRequired
				+ ", numberRequired=" + numberRequired
				+ ", experienceRequired=" + experienceRequired
				+ ", qualificationRequired=" + qualificationRequired
				+ ", jobLocation=" + jobLocation + ", jobDescription="
				+ jobDescription + "]";
	}
	
	
}
