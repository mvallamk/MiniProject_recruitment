package com.cg.service;


import com.cg.entities.CompanyMaster;
import com.cg.entities.JobRequirements;

import com.cg.entities.Login;
import com.cg.exception.RecruitmentException;

public interface IServiceDao {
	public abstract void signUp(Login loginSignup) throws RecruitmentException;
	//public abstract boolean validateLoginDetails(String loginId);
	boolean validateLoginDetails(String loginId, String password);
	public void addCompanyDetails(CompanyMaster companyMaster);
	public void updateCompanyDetails(CompanyMaster companyMaster);
	public void postJobRequirements(JobRequirements jobRequirements);
	public CompanyMaster getCompany(String companyId);
}
