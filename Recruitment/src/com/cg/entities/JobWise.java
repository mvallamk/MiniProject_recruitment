package com.cg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class JobWise {

	
	
	@Id
	@Column(name="job_id")
	String jobId;
	@Column(name="no_of_placed")
	Long count;
	@Override
	public String toString() {
		return "JobWise [jobId=" + jobId + ", count=" + count + "]"+"\n";
	}
	
	

}
