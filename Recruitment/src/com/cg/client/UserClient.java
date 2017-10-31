package com.cg.client;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.cg.entities.CandidatePersonal;
import com.cg.entities.CandidateQualifications;
import com.cg.entities.CandidateWorkHistory;
import com.cg.service.ServiceDaoImpl;

public class UserClient {
	public static void main(String[] args) 
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		ServiceDaoImpl service =new ServiceDaoImpl();
		CandidatePersonal candPers=new CandidatePersonal();
		CandidateQualifications candQual =new CandidateQualifications();
		CandidateWorkHistory candWork=new CandidateWorkHistory();
		Scanner sc=new Scanner(System.in);
		int swtch;
		System.out.println("1.Add Resume");
		System.out.println("2.Modify Resume");
		System.out.println("3.Search jobs ");
		System.out.println("4.Apply Job");
		System.out.println("Enter your choice");
		System.out.println("-----------------------");
		swtch=sc.nextInt();
		switch(swtch)
		{
		case 3:
			System.out.println(service.getJobs());
		case 1:
			System.out.println("Enter your name");
			String name = sc.next();
			candPers.setCandidateName(name);
			System.out.println("Enter address");
			String address = sc.next();
			candPers.setAddress(address);
			System.out.println("Enter DOB in format yyyy-MM-dd");
			String dateOfBirth = sc.next();
			System.out.println("Enter mail id");
			String mail = sc.next();
			candPers.setEmailId(mail);
			System.out.println("Enter Contat Number");
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
			LocalDate yearPass=LocalDate.parse(passingYear,dtf);
			candQual.setYearOfPassing(yearPass);
			System.out.println("Enter Percentage");
			Float percent = sc.nextFloat();
			candQual.setPercentage(percent);
			System.out.println("Enter Work Id");
			String workId = sc.next();
			System.out.println("Enter Previous Employer");
			String prevEmpl = sc.next();
			System.out.println("Enter Contact Person");
			String contPers = sc.next();
			System.out.println("Enter Position Held");
			String posHeld = sc.next();
			System.out.println("Enter Company Name");
			String compName = sc.next();
			System.out.println("Enter Employment from in format yyyy-MM-dd");
			String empFrom = sc.next();
			System.out.println("Enter Employment to in format yyyy-MM-dd");
			String empTo = sc.next();
			System.out.println("Enter Raeson for Leaving");
			String reasonLeav = sc.next();
			System.out.println("Enter Responsibilities");
			String respon = sc.next();
			System.out.println("Enter Hr rep's Name");
			String hrName = sc.next();
			System.out.println("Enter Hr rep's Contact Number");
			String hrNumber = sc.next();
		
		}
	}

}
