package com.cg.service;



import java.util.List;

import com.cg.entities.CandidatePersonal;
import com.cg.entities.CandidateQualifications;
import com.cg.entities.CandidateWorkHistory;
import com.cg.entities.JobRequirements;

import com.cg.entities.CompanyMaster;
import com.cg.entities.JobRequirements;


import com.cg.entities.Login;
import com.cg.exception.RecruitmentException;

public interface IServiceDao {
	public abstract void signUp(Login loginSignup) throws RecruitmentException;
	//public abstract boolean validateLoginDetails(String loginId);
	boolean validateLoginDetails(String loginId, String password);

	List<JobRequirements>getJobs() throws RecruitmentException;
	public abstract void candidPersonal(CandidatePersonal candpers) throws RecruitmentException;
	public abstract void candidQualification(CandidateQualifications candQual) throws RecruitmentException;
	public abstract void candidWorkHistory(CandidateWorkHistory candHist) throws RecruitmentException;

	public void addCompanyDetails(CompanyMaster companyMaster);
	public void updateCompanyDetails(CompanyMaster companyMaster);
	public void postJobRequirements(JobRequirements jobRequirements);
	public CompanyMaster getCompany(String companyId);

}
