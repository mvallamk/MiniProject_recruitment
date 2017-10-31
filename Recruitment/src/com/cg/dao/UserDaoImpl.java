package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.cg.entities.JobRequirements;


public class UserDaoImpl implements IUserDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<JobRequirements> getJobs()
	{
		TypedQuery<JobRequirements> query = entityManager.createQuery("SELECT jobs FROM JobRequirements jobs", JobRequirements.class);
		return query.getResultList();
	}

}
