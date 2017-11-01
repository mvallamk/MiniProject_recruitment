package com.cg.dao;

import java.util.List;

import com.cg.entities.CandidatePersonal;
import com.cg.entities.CandidateQualifications;
import com.cg.entities.CandidateWorkHistory;
import com.cg.entities.JobRequirements;
import com.cg.exception.RecruitmentException;



public interface IUserDao 
{
	List<JobRequirements>getJobs() throws RecruitmentException;
	void beginTransaction();
	void commitTransaction() throws RecruitmentException;
	public abstract void candidPersonal(CandidatePersonal candpers) throws RecruitmentException;
	public abstract void candidQualification(CandidateQualifications candQual) throws RecruitmentException;
	public abstract void candidWorkHistory(CandidateWorkHistory candHist) throws RecruitmentException;
}
