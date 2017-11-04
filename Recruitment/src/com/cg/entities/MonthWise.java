package com.cg.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MonthWise {
	@Id
	@Column(name="candidate_id")
	String candidateId;
	@Column(name="hire_date")
	Date hireDate;
	@Column(name="company_id")
	String companyId;
	@Override
	public String toString() {
		return "MonthWise [candidateId=" + candidateId + ", hireDate="
				+ hireDate + ", companyId=" + companyId + "]";
	}
	
}
