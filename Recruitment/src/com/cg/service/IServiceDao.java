package com.cg.service;


import java.util.List;

import com.cg.entities.JobRequirements;
import com.cg.entities.Login;
import com.cg.exception.RecruitmentException;

public interface IServiceDao {
	public abstract void signUp(Login loginSignup) throws RecruitmentException;
	//public abstract boolean validateLoginDetails(String loginId);
	boolean validateLoginDetails(String loginId, String password);



public interface IServiceDao
{
	List<JobRequirements>getJobs();
}
