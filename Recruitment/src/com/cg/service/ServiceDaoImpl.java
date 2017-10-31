package com.cg.service;

import com.cg.dao.AdminDaoImpl;
import com.cg.dao.CompanyDaoImpl;
import com.cg.dao.IAdminDao;
import com.cg.dao.ICompanyDao;
import com.cg.dao.ILoginDao;
import com.cg.dao.IUserDao;
import com.cg.dao.LoginDaoImpl;
import com.cg.dao.UserDaoImpl;
import com.cg.entities.CompanyMaster;
import com.cg.entities.JobRequirements;

public class ServiceDaoImpl implements IServiceDao {
	
	IUserDao userDao=new UserDaoImpl();
	IAdminDao adminDao=new AdminDaoImpl();
	ICompanyDao companyDao=new CompanyDaoImpl();
	ILoginDao loginDao=new LoginDaoImpl();
	
	@Override
	public void addCompanyDetails(CompanyMaster companyMaster) {
		companyDao.beginTransaction();
		companyDao.addCompanyDetails(companyMaster);	
		companyDao.commitTransaction();
	}
	
	@Override
	public void updateCompanyDetails(CompanyMaster companyMaster) {
		companyDao.beginTransaction();
		companyDao.updateCompanyDetails(companyMaster);	
		companyDao.commitTransaction();
	}
	@Override
	public void postJobRequirements(JobRequirements jobRequirements) {
		companyDao.beginTransaction();
		companyDao.postJobRequirements(jobRequirements);
		companyDao.commitTransaction();
	}

	@Override
	public CompanyMaster getCompany(String companyId) {
		return companyDao.getCompany(companyId); 
	}	
}
