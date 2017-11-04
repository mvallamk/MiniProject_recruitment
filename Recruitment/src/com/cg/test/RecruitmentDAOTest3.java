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
import com.cg.entities.Login;
import com.cg.jpautil.JPAUtil;

public class RecruitmentDAOTest3 {

	EntityManager em=JPAUtil.getEntityManager();
	CompanyMaster comp;
	IRecruitmentDAO recruitmentDAO;
	@Before
	public void setUp() throws Exception {
		recruitmentDAO=new RecruitmentDAOImpl();
	/*	comp=new CompanyMaster();
		comp.setCompanyId("1999");
		comp.setCompanyAddress("Talawade");
		comp.setCompanyName("Capgemini");
		comp.setContactNumber("1234567890");
		comp.setContactPerson("Akash");
		comp.setEmailId("a@cg.com");
	
		recruitmentDAO.addCompanyDetails(comp);
		*/
	}

	@After
	public void tearDown() throws Exception {
	}

	/*@Test
	public void testAddCompanyDetails() {
	
		//recruitmentDAO.addCompanyDetails(comp);
		List<CompanyMaster> compList=em.createNamedQuery("Company.getAll",CompanyMaster.class).getResultList();
		Assert.assertEquals(true, compList.size()>0);
	}

	@Test
	public void testUpdateCompanyDetails() {
		fail("Not yet implemented");
	}

	@Test
	public void testPostJobRequirements() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCompany() {
		CompanyMaster temp=recruitmentDAO.getCompany(comp.getCompanyId());
		Assert.assertEquals(comp.getCompanyId(),temp.getCompanyId());
	}

	@Test
	public void testGetCandidateByQual() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCandidateByPosition() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCandidateByExperience() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllAppliedCandidates() {
		List<JobApplied> appliedCandidatesList=recruitmentDAO.getAllAppliedCandidates();
		Assert.assertEquals(true, appliedCandidatesList.size()>0);
	}

	@Test
	public void testAddHiredCandidates() {
		fail("Not yet implemented");
	}

	@Test
	public void testSignUp() {
		fail("Not yet implemented");
	}
*/
	@Test
	public void testGetLoginDetails() {
		Login login=new Login();
		login.setLoginId("102");
		Assert.assertEquals("bansal", recruitmentDAO.getLoginDetails("102").getPassword());
		
	}
/*
	@Test
	public void testGetJobs() {
		fail("Not yet implemented");
	}


	@Test
	public void testCandidPersonal() {
		fail("Not yet implemented");
	}

	@Test
	public void testCandidQualification() {
		fail("Not yet implemented");
	}

	@Test
	public void testCandidWorkHistory() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetJobByQual() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetJobByPosition() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetJobByExperience() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetJobByLocation() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertApplyJob() {
		fail("Not yet implemented");
	}

	@Test
	public void testObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetClass() {
		fail("Not yet implemented");
	}

	@Test
	public void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	public void testClone() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testWait() {
		fail("Not yet implemented");
	}

	@Test
	public void testFinalize() {
		fail("Not yet implemented");
	}
*/
}
