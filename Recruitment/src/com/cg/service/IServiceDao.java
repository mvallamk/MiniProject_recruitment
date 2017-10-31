package com.cg.service;

import com.cg.entities.Login;
import com.cg.exception.RecruitmentException;

public interface IServiceDao {
	public abstract void signUp(Login loginSignup) throws RecruitmentException;
	//public abstract boolean validateLoginDetails(String loginId);
	boolean validateLoginDetails(String loginId, String password);

}
