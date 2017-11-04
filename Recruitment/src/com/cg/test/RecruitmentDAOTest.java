package com.cg.test;

import java.util.List;

import javax.persistence.EntityManager;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.cg.dao.IRecruitmentDAO;
import com.cg.dao.RecruitmentDAOImpl;
import com.cg.entities.CompanyMaster;
import com.cg.entities.JobApplied;
import com.cg.jpautil.JPAUtil;

public class RecruitmentDAOTest {

	EntityManager em=JPAUtil.getEntityManager();
	CompanyMaster comp;
	IRecruitmentDAO recruitmentDAO;
	@Before
	public void setUp() throws Exception {
		recruitmentDAO=new RecruitmentDAOImpl();
		comp=new CompanyMaster();
		comp.setCompanyId("1999");
		comp.setCompanyAddress("Talawade");
		comp.setCompanyName("Capgemini");
		comp.setContactNumber("1234567890");
		comp.setContactPerson("Akash");
		comp.setEmailId("a@cg.com");
	
		recruitmentDAO.addCompanyDetails(comp);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetCompany() {
		CompanyMaster temp=recruitmentDAO.getCompany(comp.getCompanyId());
		Assert.assertEquals(comp.getCompanyId(),temp.getCompanyId());
	}
	
	

}
