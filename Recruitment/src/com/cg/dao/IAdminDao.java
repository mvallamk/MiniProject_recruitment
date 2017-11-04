package com.cg.dao;

import java.util.List;

import com.cg.entities.HireDetails;

public interface IAdminDao {

	public List<HireDetails> companyWiseDetaisl();
	public List<HireDetails> jobWiseDetaisl();
}
