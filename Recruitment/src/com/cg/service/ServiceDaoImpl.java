package com.cg.service;

import com.cg.dao.AdminDaoImpl;
import com.cg.dao.CompanyDaoImpl;
import com.cg.dao.IAdminDao;
import com.cg.dao.ICompanyDao;
import com.cg.dao.ILoginDao;
import com.cg.dao.IUserDao;
import com.cg.dao.LoginDaoImpl;
import com.cg.dao.UserDaoImpl;
import com.cg.entities.Login;
import com.cg.exception.RecruitmentException;

public class ServiceDaoImpl implements IServiceDao {
	
	IUserDao userDao=new UserDaoImpl();
	IAdminDao adminDao=new AdminDaoImpl();
	ICompanyDao companyDao=new CompanyDaoImpl();
	ILoginDao loginDao=new LoginDaoImpl();
	
	@Override
	public void signUp(Login loginSignup) throws RecruitmentException {
	
		loginDao.beginTransaction();
		loginDao.signUp(loginSignup);
	
	}

	@Override
	public boolean validateLoginDetails(String loginId,String password) {
		
		
		if(loginDao.getLoginDetails(loginId)==null)
			return false;
		else
		{
			Login loginDetails=loginDao.getLoginDetails(loginId);
			if(loginDetails.getPassword().equals(password))
			{
				return true;
			}
			else
				return false;
		}
	}



}
