package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entities.Login;
import com.cg.exception.RecruitmentException;
import com.cg.jpautil.JPAUtil;

public class LoginDaoImpl implements ILoginDao {
	EntityManager entityManager=JPAUtil.getEntityManager();
	
	

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
	public void beginTransaction() {
		
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() throws RecruitmentException {
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
	public Login getLoginDetails(String loginId) {
		
		return entityManager.find(Login.class, loginId);
	}

}
