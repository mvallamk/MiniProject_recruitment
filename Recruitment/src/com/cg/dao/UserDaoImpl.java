package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.entities.CandidatePersonal;
import com.cg.entities.CandidateQualifications;
import com.cg.entities.CandidateWorkHistory;
import com.cg.entities.JobRequirements;
import com.cg.exception.RecruitmentException;
import com.cg.jpautil.JPAUtil;


public class UserDaoImpl implements IUserDao {

	EntityManager entityManager=JPAUtil.getEntityManager();

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

}
