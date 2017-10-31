package com.cg.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Candidate_Qualifications")
public class CandidateQualifications implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	private String qualificationId;
	private String qualificationName;
	private String specializationArea;
	private String collegeName;
	private String universityName;
	private LocalDate yearOfPassing;
	private float percentage;
	private String candidateId;
	public String getQualificationId() {
		return qualificationId;
	}
	public void setQualificationId(String qualificationId) {
		this.qualificationId = qualificationId;
	}
	public String getQualificationName() {
		return qualificationName;
	}
	public void setQualificationName(String qualificationName) {
		this.qualificationName = qualificationName;
	}
	public String getSpecializationArea() {
		return specializationArea;
	}
	public void setSpecializationArea(String specializationArea) {
		this.specializationArea = specializationArea;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public LocalDate getYearOfPassing() {
		return yearOfPassing;
	}
	public void setYearOfPassing(LocalDate yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public String getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "CandidateQualifications [qualificationId=" + qualificationId
				+ ", qualificationName=" + qualificationName
				+ ", specializationArea=" + specializationArea
				+ ", collegeName=" + collegeName + ", universityName="
				+ universityName + ", yearOfPassing=" + yearOfPassing
				+ ", percentage=" + percentage + ", candidateId=" + candidateId
				+ "]";
	}



}
