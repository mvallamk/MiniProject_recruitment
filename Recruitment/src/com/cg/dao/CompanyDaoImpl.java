package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entities.CompanyMaster;
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

}
