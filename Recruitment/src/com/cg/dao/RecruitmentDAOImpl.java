package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cg.entities.CandidatePersonal;
import com.cg.entities.CandidateQualifications;
import com.cg.entities.CandidateWorkHistory;
import com.cg.entities.CompanyMaster;
import com.cg.entities.HireDetails;
import com.cg.entities.JobApplied;
import com.cg.entities.JobRequirements;
import com.cg.entities.Login;
import com.cg.exception.RecruitmentException;
import com.cg.jpautil.JPAUtil;

public class RecruitmentDAOImpl implements IRecruitmentDAO {
	EntityManager entityManager=JPAUtil.getEntityManager();
	
	
	
	@Override
	public void addCompanyDetails(CompanyMaster companyMaster) {
		entityManager.persist(companyMaster);		
	}

	@Override
	public void updateCompanyDetails(CompanyMaster companyMaster) {
		entityManager.merge(companyMaster);
	}

	@Override
	public void postJobRequirements(JobRequirements jobRequirements) {
		entityManager.persist(jobRequirements);	
	}
	
	@Override
	public CompanyMaster getCompany(String companyId) {
		return entityManager.find(CompanyMaster.class, companyId);	
	}

	

	@Override
	public List<CandidateWorkHistory> getCandidateByQual(String qual) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CandidateWorkHistory> getCandidateByPosition(String pos) {
		 TypedQuery<CandidateWorkHistory> query=entityManager.createQuery("select candidateWorkHistory From CandidateWorkHistory candidateWorkHistory  where candidateWorkHistory.positionHeld=:pPos",CandidateWorkHistory.class);
			query.setParameter("pPos", pos);
			List<CandidateWorkHistory> canList=query.getResultList();
			return canList;
	}

	@Override
	public List<CandidateWorkHistory> getCandidateByExperience(int exp) {
		Query query=entityManager.createNativeQuery("select * from candidateworkhistory where (select (employmentto-employmentfrom)/365 from candidateworkhistory)>="+exp,CandidateWorkHistory.class);
		//query.setParameter("pCustomerName", customerName);
		List<CandidateWorkHistory> accList=query.getResultList();
		return accList;
	}

	@Override
	public List<JobApplied> getAllAppliedCandidates() {
		

		TypedQuery<JobApplied> query = entityManager.createQuery("SELECT jobApplied FROM JobApplied jobApplied ",JobApplied.class);
		@SuppressWarnings("unchecked")
		List<JobApplied> appliedCandidatesList = query.getResultList();
		//logger.info("Candidate list of all candidates applied for the jobs is retrieved successfully");
		return appliedCandidatesList;
	}



	@Override
	public void addHiredCandidates(HireDetails hiredetails) {
		entityManager.persist(hiredetails);	
		
	}
	

	@Override
	public void signUp(Login loginSignup) throws RecruitmentException {
		try
		{
		entityManager.persist(loginSignup);
		entityManager.getTransaction().commit();
		}
		catch(Exception e)
		{
			throw new RecruitmentException("UserId already taken. Try Another Id.");
		}
	}
	

	@Override
	public Login getLoginDetails(String loginId) {
		
		return entityManager.find(Login.class, loginId);
	}
	
	@Override
	public List<JobRequirements> getJobs() throws RecruitmentException
	{
		TypedQuery<JobRequirements> query = entityManager.createQuery("SELECT jobs FROM JobRequirements jobs", JobRequirements.class);
		try
		{
			return query.getResultList();
		}
		catch(Exception e)
		{
			throw new RecruitmentException("Cant get jobs");
		}

	}

	@Override
	public void beginTransaction() 
	{
		entityManager.getTransaction().begin();

	}

	@Override
	public void commitTransaction() throws RecruitmentException 
	{
		try
		{
			entityManager.getTransaction().commit();
		}
		catch(Exception e)
		{
			throw new RecruitmentException("Error while committing the Transaction");
		}

	}

	@Override
	public void candidPersonal(CandidatePersonal candpers) throws RecruitmentException {
		try
		{
			System.out.println(candpers);
			entityManager.persist(candpers);
			entityManager.getTransaction().commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			//throw new RecruitmentException("cant insert into candidate Personal");
		}
	}



	@Override
	public void candidQualification(CandidateQualifications candQual)
			throws RecruitmentException {
		System.out.println(candQual);
		try
		{
			entityManager.persist(candQual);
			entityManager.getTransaction().commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw new RecruitmentException("cant insert into candidate Qualification");
		}
	}

	@Override
	public void candidWorkHistory(CandidateWorkHistory candHist)
			throws RecruitmentException {
		try
		{
			entityManager.persist(candHist);
			entityManager.getTransaction().commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw new RecruitmentException("cant insert into candidate Work History");
		}


	}

	@Override
	public List<JobRequirements> getJobByQual(String qual) {
    TypedQuery<JobRequirements> query=entityManager.createQuery("select jobRequirements From JobRequirements jobRequirements where jobRequirements.qualificationRequired=:pQual",JobRequirements.class);
		query.setParameter("pQual", qual);
		List<JobRequirements> accList=query.getResultList();
		return accList;
	}

	@Override
	public List<JobRequirements> getJobByPosition(String pos) {
		 TypedQuery<JobRequirements> query=entityManager.createQuery("select jobRequirements From JobRequirements jobRequirements where jobRequirements.positionRequired=:pPos",JobRequirements.class);
			query.setParameter("pPos", pos);
			List<JobRequirements> accList=query.getResultList();
			return accList;
	}

	@Override
	public List<JobRequirements> getJobByExperience(int exp) {
		 TypedQuery<JobRequirements> query=entityManager.createQuery("select jobRequirements From JobRequirements jobRequirements where jobRequirements.experienceRequired<=:pExp",JobRequirements.class);
			query.setParameter("pExp", exp);
			List<JobRequirements> accList=query.getResultList();
			return accList;
	}

	@Override
	public List<JobRequirements> getJobByLocation(String loc) {
		 TypedQuery<JobRequirements> query=entityManager.createQuery("select jobRequirements From JobRequirements jobRequirements where jobRequirements.jobLocation=:pLoc",JobRequirements.class);
			query.setParameter("pLoc", loc);
			List<JobRequirements> accList=query.getResultList();
			return accList;
	}

	@Override
	public void insertApplyJob(JobApplied jobApplied) throws RecruitmentException {
		beginTransaction();
		entityManager.persist(jobApplied);
		commitTransaction();
		
	}

}
