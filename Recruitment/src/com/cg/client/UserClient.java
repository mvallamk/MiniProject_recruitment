package com.cg.client;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.cg.entities.CandidatePersonal;
import com.cg.entities.CandidateQualifications;
import com.cg.entities.CandidateWorkHistory;
import com.cg.entities.JobApplied;
import com.cg.entities.JobRequirements;
import com.cg.exception.RecruitmentException;
import com.cg.service.ServiceDaoImpl;

public class UserClient {
	
	public UserClient()
	{
		
	}
	
	public UserClient(String candID)
	{
		//System.out.println("yay");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		ServiceDaoImpl service =new ServiceDaoImpl();
		CandidatePersonal candPers=new CandidatePersonal();
		CandidateQualifications candQual =new CandidateQualifications();
		CandidateWorkHistory candWork=new CandidateWorkHistory();
		
		
		Scanner sc=new Scanner(System.in);
		int swtch;
		//String candID;
		System.out.println("1.Add Resume");
		System.out.println("2.Modify Resume");
		System.out.println("3.Search jobs ");
		System.out.println("4.Apply For Job");
		System.out.println("Enter your choice");
		System.out.println("-----------------------");
		swtch=sc.nextInt();
		switch(swtch)
		{
		case 4:
			System.out.println("Enter job ID :");
			String jobID=sc.next();
			JobApplied jobApplied=new JobApplied();
			jobApplied.setJobId(jobID);
			jobApplied.setCandidateId(candID);
			try {
				service.insertApplyJob(jobApplied);
			} catch (RecruitmentException e1) {
				System.out.println(e1.getMessage());
			}
			break;
		case 3:
			System.out.println("1. By Qualification");
			System.out.println("2. By Position");
			System.out.println("3. By Experience (in years)");
			System.out.println("4. By Location (mumbai, pune, chennai, bangalore,hyderabad)");
			
			int switchsearch=sc.nextInt();
			List<JobRequirements> jobList=null;
			switch(switchsearch)
			{
			
			case 1:
				System.out.println("Enter Qualification (hsc,ssc,grad,be)");
				String qual=sc.next();
				//qual=qual.toLowerCase()
				jobList=service.getJobByQual(qual);
			
				break;
			case 2:
				System.out.println("Enter Position (se- Software Engineer, sse- Senior Software Engineer, c- Consultant)");
				String pos=sc.next();
				jobList=service.getJobByPosition(pos);
				break;
			case 3:
				System.out.println("Enter Experience in years");
				int exp=sc.nextInt();
				jobList=service.getJobByExperience(exp);
				break;
			case 4:
				System.out.println("Enter Location (mumbai, pune, chennai, bangalore,hyderabad)");
				String loc=sc.next();
				jobList=service.getJobByLocation(loc);
				break;
			}
			System.out.println(jobList);
			break;
		case 1:
		
			candPers.setCandidateId(candID);
			candQual.setCandidate(candID);
			candWork.setCandidateId(candID);
			System.out.println("Enter your name");
			String name = sc.next();
			candPers.setCandidateName(name);
			System.out.println("Enter address");
			String address = sc.next();
			candPers.setAddress(address);
			System.out.println("Enter DOB in format yyyy-MM-dd");
			String dateOfBirth = sc.next();
			LocalDate dob1=LocalDate.parse(dateOfBirth,dtf);
			Date dob=Date.valueOf(dob1);
			candPers.setDob(dob);
			System.out.println("Enter mail id");
			String mail = sc.next();
			candPers.setEmailId(mail);
			System.out.println("Enter Contact Number");
			String phone = sc.next();
			candPers.setContactNumber(phone);
			System.out.println("Enter Marital Status");
			String marital = sc.next();
			candPers.setMaritalStatus(marital);
			System.out.println("Enter Gender M/F");
			String gender = sc.next();
			candPers.setGender(gender);
			System.out.println("Enter Passport Number");
			String passport = sc.next();
			candPers.setPassportNumber(passport);
			try {

				service.candidPersonal(candPers);
			} 
			catch (RecruitmentException e) {

				System.out.println(e.getMessage());
			}
			System.out.println("Enter Qualification Id");
			String qualId = sc.next();
			candQual.setQualificationId(qualId);
			System.out.println("Enter Qualification Name");
			String qualName = sc.next();
			candQual.setQualificationName(qualName);
			System.out.println("Enter Specialization Area");
			String specialArea = sc.next();
			candQual.setSpecializationArea(specialArea);
			System.out.println("Enter College Name");
			String colName = sc.next();
			candQual.setCollegeName(colName);
			System.out.println("Enter University Name");
			String univName = sc.next();
			candQual.setUniversityName(univName);
			System.out.println("Enter Year of Passing in format yyyy-MM-dd");
			String passingYear = sc.next();
			LocalDate yearPass1=LocalDate.parse(passingYear,dtf);
			Date yearPass=Date.valueOf(yearPass1) ;
			candQual.setYearOfPassing(yearPass);
			System.out.println("Enter Percentage");
			double percent = sc.nextDouble();
			candQual.setPercentage(percent);
			try {
				service.candidQualification(candQual);
			} catch (RecruitmentException e) {

				e.printStackTrace();
				System.out.println(e.getMessage());
			}
			System.out.println("Enter Work Id");
			String workId = sc.next();
			candWork.setWorkId(workId);
			System.out.println("Enter Previous Employer");
			String prevEmpl = sc.next();
			candWork.setWhichEmployer(prevEmpl);
			System.out.println("Enter Contact Person");
			String contPers = sc.next();
			candWork.setContactPerson(contPers);
			System.out.println("Enter Position Held");
			String posHeld = sc.next();
			candWork.setPositionHeld(posHeld);
			System.out.println("Enter Company Name");
			String compName = sc.next();
			candWork.setCompanyName(compName);
			System.out.println("Enter Employment from in format yyyy-MM-dd");
			String emp = sc.next();
			LocalDate empFrom1 =LocalDate.parse(emp,dtf);
			Date empFrom=Date.valueOf(empFrom1);
			candWork.setEmploymentFrom(empFrom);
			System.out.println("Enter Employment to in format yyyy-MM-dd");
			String empT = sc.next();
			LocalDate empTo1 =LocalDate.parse(empT,dtf);
			Date empTo=Date.valueOf(empTo1);
			candWork.setEmploymentTo(empTo);
			System.out.println("Enter Reason for Leaving");
			String reasonLeav = sc.next();
			candWork.setReasonForLeaving(reasonLeav);
			System.out.println("Enter Responsibilities");
			String respon = sc.next();
			candWork.setResponsibilities(respon);
			System.out.println("Enter HR rep's Name");
			String hrName = sc.next();
			candWork.setHrRepName(hrName);
			System.out.println("Enter HR rep's Contact Number");
			String hrNumber = sc.next();
			candWork.setHrRepContactNumber(hrNumber);
			try {
				service.candidWorkHistory(candWork);
				
				System.out.println("Details Successfully Inserted !!!");
			} catch (RecruitmentException e) {			
				System.out.println(e.getMessage());
			}

		}
	}


}
