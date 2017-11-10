package com.cg.service;



import java.util.List;

import com.cg.entities.CandidatePersonal;
import com.cg.entities.CandidateQualifications;
import com.cg.entities.CandidateWorkHistory;
import com.cg.entities.CompWise;
import com.cg.entities.CompanyMaster;
import com.cg.entities.HireDetails;
import com.cg.entities.JobApplied;
import com.cg.entities.JobRequirements;
import com.cg.entities.JobWise;
import com.cg.entities.Login;
import com.cg.entities.MonthWise;
import com.cg.exception.RecruitmentException;

public interface IServiceDao {
	public abstract void signUp(Login loginSignup) throws RecruitmentException;
	boolean validateLoginDetails(String loginId, String password);
	public abstract Login getLoginDetails(String loginId);

	List<JobRequirements>getJobs() throws RecruitmentException;
	public abstract void candidPersonal(CandidatePersonal candpers) throws RecruitmentException;
	public abstract void candidQualification(CandidateQualifications candQual) throws RecruitmentException;
	public abstract void candidWorkHistory(CandidateWorkHistory candHist) throws RecruitmentException;

	public void addCompanyDetails(CompanyMaster companyMaster) throws RecruitmentException;
	public void updateCompanyDetails(CompanyMaster companyMaster) throws RecruitmentException;
	public void postJobRequirements(JobRequirements jobRequirements) throws RecruitmentException;
	public CompanyMaster getCompany(String companyId);
	public abstract List<JobRequirements> getJobByQual(String qual);
	public abstract List<JobRequirements> getJobByPosition(String pos);
	public abstract List<JobRequirements> getJobByExperience(int exp);
	public abstract List<JobRequirements> getJobByLocation(String loc);
	public abstract List<CandidateWorkHistory> getCandidateByQual(String qual);
	public abstract List<CandidateWorkHistory> getCandidateByPosition(String pos);
	public abstract List<CandidateWorkHistory> getCandidateByExperience(int exp);
	public abstract List<JobApplied> getAllAppliedCandidates();
	public abstract void addHiredCandidates(HireDetails hiredetails) throws RecruitmentException;

	
	public abstract void insertApplyJob(JobApplied jobApplied) throws RecruitmentException;
	
	
	public List<CompWise> companyWiseDetaisl();
	public List<JobWise> jobWiseDetaisl();
	public List<MonthWise> monthWiseDetaisl();



}
