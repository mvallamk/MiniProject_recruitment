package com.cg.dao;

import com.cg.entities.CompanyMaster;
import com.cg.entities.JobRequirements;

public interface ICompanyDao {
public void addCompanyDetails(CompanyMaster companyMaster);
public void updateCompanyDetails(CompanyMaster companyMaster);
public void postJobRequirements(JobRequirements jobRequirements);
public void beginTransaction();
public void commitTransaction();
public CompanyMaster getCompany(String companyId); 
}
