package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cg.entities.CandidateWorkHistory;
import com.cg.entities.CompanyMaster;
import com.cg.entities.HireDetails;
import com.cg.entities.JobApplied;
import com.cg.entities.JobRequirements;
import com.cg.jpautil.JPAUtil;

public class CompanyDaoImpl implements ICompanyDao {

	private EntityManager entityManager;
	
	public CompanyDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}
	
	
	
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
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
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
		
		Query query = entityManager.createNamedQuery("getAllAppliedCandidates");
		@SuppressWarnings("unchecked")
		List<JobApplied> appliedCandidatesList = query.getResultList();
		return appliedCandidatesList;
	}



	@Override
	public void addHiredCandidates(HireDetails hiredetails) {
		entityManager.persist(hiredetails);	
		
	}

}
