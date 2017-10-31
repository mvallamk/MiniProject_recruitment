package com.cg.service;

import com.cg.entities.CompanyMaster;
import com.cg.entities.JobRequirements;

public interface IServiceDao {
	public void addCompanyDetails(CompanyMaster companyMaster);
	public void updateCompanyDetails(CompanyMaster companyMaster);
	public void postJobRequirements(JobRequirements jobRequirements);
	public CompanyMaster getCompany(String companyId);
}
