package com.cg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class CompWise {
	
	@Id
	@Column(name="company_id")
	String companyId;
	@Column(name="no_of_placed")
	Long count;
	
	@Override
	public String toString() {
		return "CompWise [companyId=" + companyId + ", count=" + count + "]"+"\n";
	}


	

}
