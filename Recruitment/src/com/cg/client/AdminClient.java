package com.cg.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cg.entities.CompWise;
import com.cg.entities.HireDetails;
import com.cg.entities.JobApplied;
import com.cg.entities.JobWise;
import com.cg.entities.MonthWise;
import com.cg.service.IServiceDao;
import com.cg.service.ServiceDaoImpl;

public class AdminClient {
	
	public AdminClient(){}
	
	public AdminClient(String adminId)
	{
	
	IServiceDao service = new ServiceDaoImpl();
	HireDetails hiredetails = new HireDetails();
	Scanner sc=new Scanner(System.in);

	int choice;
	System.out.println("Choose the Operation");
	System.out.println("1.MonthWise Placements report");
	System.out.println("2.CompanyWise Placements report");	
	System.out.println("3.PositionWise placement report");
	
	choice = sc.nextInt();
	
	switch(choice)
	{
	
	case 3 :
		System.out.println("PositionWise Placement report:");
		
		List<JobWise> jobList=service.jobWiseDetaisl();
		//for (HireDetails monthWiseList:service.jobWiseDetaisl() )
		System.out.println(jobList);
	
		break;
		
	case 2:
		System.out.println("CompanyWise Placements report:");
		
		List<CompWise> compList=service.companyWiseDetaisl();
				
		
			System.out.println(compList);
			break;
	case 1:
		System.out.println("Last Month's Placements report:");
		
		List<MonthWise> monthList=service.monthWiseDetaisl();
				
		
			System.out.println(monthList);
			break;
	
	}
	
	
	}
	
	
}
