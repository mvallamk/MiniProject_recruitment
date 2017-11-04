package com.cg.service;

import java.util.List;

import com.cg.dao.AdminDaoImpl;
import com.cg.dao.CompanyDaoImpl;
import com.cg.dao.IAdminDao;
import com.cg.dao.ICompanyDao;
import com.cg.dao.ILoginDao;
import com.cg.dao.IRecruitmentDAO;
import com.cg.dao.IUserDao;
import com.cg.dao.LoginDaoImpl;
import com.cg.dao.RecruitmentDAOImpl;
import com.cg.dao.UserDaoImpl;
import com.cg.entities.CandidatePersonal;
import com.cg.entities.CandidateQualifications;
import com.cg.entities.CandidateWorkHistory;
import com.cg.entities.CompanyMaster;
import com.cg.entities.HireDetails;
import com.cg.entities.JobApplied;
import com.cg.entities.JobRequirements;
import com.cg.entities.Login;
import com.cg.exception.RecruitmentException;


public class ServiceDaoImpl implements IServiceDao {
	
	IRecruitmentDAO userDao=new RecruitmentDAOImpl();
	IRecruitmentDAO loginDao=new RecruitmentDAOImpl();
	IRecruitmentDAO companyDao=new RecruitmentDAOImpl();
	IRecruitmentDAO adminDao = new RecruitmentDAOImpl();

	@Override
	public List<JobRequirements> getJobs() throws RecruitmentException 
	{
		return userDao.getJobs();
	}
	
	@Override
	public void candidPersonal(CandidatePersonal candpers)
			throws RecruitmentException {
		userDao.beginTransaction();
		userDao.candidPersonal(candpers);

		
	}

	@Override
	public void candidQualification(CandidateQualifications candQual) throws RecruitmentException {
		userDao.beginTransaction();
		userDao.candidQualification(candQual);
		
	}


	@Override
	public void candidWorkHistory(CandidateWorkHistory candHist)
			throws RecruitmentException {
		userDao.beginTransaction();
		userDao.candidWorkHistory(candHist);
		
	}
	

	
	@Override
	public void addCompanyDetails(CompanyMaster companyMaster) throws RecruitmentException {
		companyDao.beginTransaction();
		companyDao.addCompanyDetails(companyMaster);	
		companyDao.commitTransaction();
	}
	
	@Override
	public void updateCompanyDetails(CompanyMaster companyMaster) throws RecruitmentException {
		companyDao.beginTransaction();
		companyDao.updateCompanyDetails(companyMaster);	
		companyDao.commitTransaction();
	}
	@Override
	public void postJobRequirements(JobRequirements jobRequirements) throws RecruitmentException {
		companyDao.beginTransaction();
		companyDao.postJobRequirements(jobRequirements);
		companyDao.commitTransaction();
	}

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





	@Override
	public CompanyMaster getCompany(String companyId) {
		return companyDao.getCompany(companyId); 
	}

	@Override
	public List<JobRequirements> getJobByQual(String qual) {
		
		return userDao.getJobByQual(qual);
	}

	@Override
	public List<JobRequirements> getJobByPosition(String qual) {

		return userDao.getJobByPosition(qual);
	}

	@Override
	public List<JobRequirements> getJobByExperience(int exp) {
	
		return userDao.getJobByExperience(exp);
	}

	@Override
	public List<JobRequirements> getJobByLocation(String qual) {
		
		return userDao.getJobByLocation(qual);
	}

	@Override
	public List<CandidateWorkHistory> getCandidateByQual(String qual) {
	
		return companyDao.getCandidateByQual(qual);
	}

	@Override
	public List<CandidateWorkHistory> getCandidateByPosition(String pos) {
		return companyDao.getCandidateByPosition(pos);
	}

	@Override
	public List<CandidateWorkHistory> getCandidateByExperience(int exp) {
		return companyDao.getCandidateByExperience(exp);
	}

	@Override
	public List<JobApplied> getAllAppliedCandidates() {
		// 
		return companyDao.getAllAppliedCandidates() ;
	}

	@Override
	public void addHiredCandidates(HireDetails hiredetails) throws RecruitmentException {
		companyDao.beginTransaction();
		companyDao.addHiredCandidates(hiredetails);	
		companyDao.commitTransaction();
		
	}

	@Override
	public Login getLoginDetails(String loginId) {
		
		return loginDao.getLoginDetails(loginId);
	}

	@Override
	public void insertApplyJob(JobApplied jobApplied) throws RecruitmentException {
		userDao.insertApplyJob(jobApplied);
		
<<<<<<< HEAD
	}

	@Override
	public List<HireDetails> companyWiseDetaisl() {
		return adminDao.companyWiseDetaisl();
		
	}

	@Override
	public List<HireDetails> jobWiseDetaisl() {
		
		return adminDao.jobWiseDetaisl();
=======
		
>>>>>>> 1965e679f69cded9b57cd282eaa8fd05da50b197
	}	

}
