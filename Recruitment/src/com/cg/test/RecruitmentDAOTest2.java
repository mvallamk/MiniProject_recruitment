package com.cg.test;

import java.util.List;

import javax.persistence.EntityManager;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.cg.dao.IRecruitmentDAO;
import com.cg.dao.RecruitmentDAOImpl;
import com.cg.entities.CandidateWorkHistory;
import com.cg.entities.CompanyMaster;
import com.cg.entities.JobApplied;
import com.cg.entities.JobRequirements;
import com.cg.entities.Login;
import com.cg.jpautil.JPAUtil;

public class RecruitmentDAOTest2 {

	EntityManager em=JPAUtil.getEntityManager();
	CompanyMaster comp;
	IRecruitmentDAO recruitmentDAO;
	@Before
	public void setUp() throws Exception {
		recruitmentDAO=new RecruitmentDAOImpl();

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetJobByQual() {
		List<JobRequirements> compList=em.createNamedQuery("qual.getAll",JobRequirements.class).getResultList();
		Assert.assertEquals(true, compList.size()>0);
		
	}

	@Test
	public void testGetJobByPosition() {
		List<JobRequirements> compList=em.createNamedQuery("position.getAll",JobRequirements.class).getResultList();
		Assert.assertEquals(true, compList.size()>0);
	}

	@Test
	public void testGetJobByExperience() {
		List<JobRequirements> compList=em.createNamedQuery("exp.getAll",JobRequirements.class).getResultList();
		Assert.assertEquals(true, compList.size()>0);
		
	}

	@Test
	public void testGetJobByLocation() {
		List<JobRequirements> compList=em.createNamedQuery("loc.getAll",JobRequirements.class).getResultList();
		Assert.assertEquals(true, compList.size()>0);
	}
	
	@Test
	public void testGetAllAppliedCandidates() {
		List<JobApplied> compList=em.createNamedQuery("app.getAll",JobApplied.class).getResultList();
		Assert.assertEquals(true, compList.size()>0);
	}
	
	@Test
	public void testGetJobs() {
		List<JobRequirements> compList=em.createNamedQuery("job.getAll",JobRequirements.class).getResultList();
		Assert.assertEquals(true, compList.size()>0);
	
	}
	@Test
	public void testGetLoginDetails() {
		Login login=new Login();
		login.setLoginId("102");
		Assert.assertEquals("bansal", recruitmentDAO.getLoginDetails("102").getPassword());
		
	}
	

	@Test
	public void testGetCandidateByPosition() {
		List<CandidateWorkHistory> compList=em.createNamedQuery("pos.getAll",CandidateWorkHistory.class).getResultList();
		Assert.assertEquals(true, compList.size()>0);
	}


}
