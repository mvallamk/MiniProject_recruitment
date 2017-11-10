package com.cg.client;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.cg.entities.CandidateWorkHistory;
import com.cg.entities.CompanyMaster;
import com.cg.entities.HireDetails;
import com.cg.entities.JobApplied;
import com.cg.entities.JobRequirements;
import com.cg.exception.RecruitmentException;
import com.cg.service.IServiceDao;
import com.cg.service.ServiceDaoImpl;


public class CompanyClient {
	
	
public CompanyClient(String companyId)
{
		IServiceDao service = new ServiceDaoImpl();
		CompanyMaster companyMaster=new CompanyMaster();
		JobRequirements jobRequirements=new JobRequirements();
		Scanner sc=new Scanner(System.in);

		
		String companyName;	
		String companyAddress;		
		String contactPerson;		
		String emailId;
		String contactNumber;

		int choice;
		System.out.println("Choose the Operation");
		System.out.println("1.Add Company Details");
		System.out.println("2.Modify Company Details");	
		System.out.println("3.Post Job Requirements");
		System.out.println("4.Search Candidates");
		System.out.println("5.Hire from applied Candidates");

		choice=Integer.parseInt(sc.nextLine());
		switch(choice)
		{
		case 1:
			System.out.println("Enter the company details");
			//System.out.println("Enter the company ID ");
			//companyId=sc.next();
			System.out.println("Enter the company name");
			companyName=sc.next();
			System.out.println("Enter the company address");
			companyAddress=sc.next();
			System.out.println("Enter the contact person");
			contactPerson=sc.next();
			System.out.println("Enter the email id");
			emailId=sc.next();
			System.out.println("Enter the contact number");
			contactNumber=sc.next();

			companyMaster=new CompanyMaster(companyId,companyName,companyAddress,
					contactPerson,emailId,contactNumber);
			try {
				service.addCompanyDetails(companyMaster);
				System.out.println("Company Registered Successfully!!");
			} catch (RecruitmentException e) {
			
			 System.out.println(e.getMessage());
			}
			break;
		case 2:
			
			companyMaster=service.getCompany(companyId);
			System.out.println("Choose the company detail to be updated"); 
			System.out.println("1.Company Name");
			System.out.println("2.Company Address");
			System.out.println("3.Contact Person");
			System.out.println("4.Email Id");
			System.out.println("5.Contact Number");
			choice=Integer.parseInt(sc.next());
			switch(choice)
			{	
			case 1:
				System.out.println("Enter the company name to be updated");
				companyMaster.setCompanyName(sc.next());
				break;
			case 2:
				System.out.println("Enter the Company Address to be updated");
				companyMaster.setCompanyAddress(sc.next());
				break;
			case 3:
				System.out.println("Enter the Contact Person to be updated");
				companyMaster.setContactPerson(sc.next());
				break;
			case 4:
				System.out.println("Enter the Email Id to be updated");
				companyMaster.setEmailId(sc.next());
				break;
			case 5:
				System.out.println("Enter the Contact Number to be updated");
				companyMaster.setContactNumber(sc.next());
				break;
			}
			try {
				service.updateCompanyDetails(companyMaster);
				System.out.println("Details updated Successfully!!");
			} catch (RecruitmentException e) {
				 System.out.println(e.getMessage());
			}
			break;
		case 3:
			
			jobRequirements.setCompanyId(companyId);
			System.out.println("Enter the Job ID for the job");
			jobRequirements.setJobID(sc.next());			
			System.out.println("Enter the the job position required");
			jobRequirements.setPositionRequired(sc.next());
			System.out.println("Enter the number of candidates required");
			jobRequirements.setNumberRequired(sc.nextInt());
			System.out.println("Enter experience required for the job");
			jobRequirements.setExperienceRequired(sc.nextInt());
			System.out.println("Enter the the qualification required");
			jobRequirements.setQualificationRequired(sc.next());
			System.out.println("Enter the the job location");
			jobRequirements.setJobLocation(sc.next());
			System.out.println("Enter the the job description");
			jobRequirements.setJobDescription(sc.next());
			try {
				service.postJobRequirements(jobRequirements);
			} catch (RecruitmentException e) {
				 System.out.println(e.getMessage());
			}
			break;
		case 4:
			
			System.out.println("1. By Position");
			System.out.println("2. By Experience (in years)");

			int switchsearch=sc.nextInt();
			List<CandidateWorkHistory> jobList=null;
			switch(switchsearch)
			{

			case 1:
				System.out.println("Enter Position (se- Software Engineer, sse- Senior Software Engineer, c- Consultant)");
				String pos=sc.next();
				jobList=service.getCandidateByPosition(pos);
				break;
			case 2:
				System.out.println("Enter Experience in years");
				int exp=sc.nextInt();
				jobList=service.getCandidateByExperience(exp);
				break;

			}
			System.out.println(jobList);
			break;

		case 5:
			System.out.println("List of Candidate Applications:");
			for (JobApplied appliedCandidatesList:service.getAllAppliedCandidates())
				{System.out.println(appliedCandidatesList);

			System.out.println("Hire this candidate? [enter : yes/no]:");
			String hireChoice = sc.next();

			if(hireChoice.equals("yes"))
			{
				String candidateId = appliedCandidatesList.getCandidateId();
				LocalDate date = LocalDate.now();
                String compId = appliedCandidatesList.getCompId();
                String jobId = appliedCandidatesList.getJobId();
                Date dateOfHire=Date.valueOf(date);
                
                HireDetails hiredetails = new HireDetails(jobId, candidateId, dateOfHire, compId);
				
				try {
					service.addHiredCandidates(hiredetails);
					System.out.println(candidateId+" hired");
				} catch (RecruitmentException e) {
					
					e.printStackTrace();
				}
				


			}}

			break;
		}
	}
}
