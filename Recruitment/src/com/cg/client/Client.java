package com.cg.client;

import java.util.Scanner;

import com.cg.entities.Login;
import com.cg.exception.RecruitmentException;
import com.cg.service.IServiceDao;
import com.cg.service.ServiceDaoImpl;

public class Client {
	
	public static void main(String args[])
	{
		IServiceDao serviceDao=new ServiceDaoImpl();
		
		Scanner sc=new Scanner(System.in);
		String lop=null;
		do
		{
		System.out.println("Online Recruitment Management System");
		System.out.println("1. Login");
		System.out.println("2. Signup");
		
		
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			Login login=new Login();
			String log=null;
			
			System.out.println("Enter UserID:");
			login.setLoginId(sc.next());
			System.out.println("Enter Password:");
			login.setPassword(sc.next());
			boolean isValid=serviceDao.validateLoginDetails(login.getLoginId(), login.getPassword());
			do
			{
			if(isValid)
			{
				Login temp=serviceDao.getLoginDetails(login.getLoginId());
				login.setType(temp.getType());
				
				if(login.getType()=='U')
				{
			
					UserClient userClient=new UserClient(login.getLoginId());
					
				}
				else if(login.getType()=='C')
				{
					CompanyClient companyClient=new CompanyClient(login.getLoginId());
				}
				else if(login.getType()=='A')
				{
					AdminClient adminClient=new AdminClient(login.getLoginId());
				}
			}
			else
			{
				System.out.println("Invalid Credentials");
				break;
			}
			
			System.out.println("Do you want to continue ?Enter :Yes/No");
			log=sc.next();
			}while(log.equals("Yes"));
			break;
			
		case 2:
			System.out.println("Choose the Valid Option:");
			System.out.println("1. User");
			System.out.println("2. Company");
			System.out.println("3. Admin");
			int choice2=sc.nextInt();
			Login loginSignup=new Login();
			System.out.println("Enter UserID:");
			loginSignup.setLoginId(sc.next());
			System.out.println("Enter Password:");
			loginSignup.setPassword(sc.next());
			switch(choice2)
			{
			case 1:
				loginSignup.setType('U');
				break;
			case 2:
				loginSignup.setType('C');
				break;
			case 3:
				loginSignup.setType('A');
				break;
			}
			try
			{
			serviceDao.signUp(loginSignup);
			}
			catch(RecruitmentException re)
			{
				
				
				System.out.println(re.getMessage());
			}
			break;
			default:
				System.out.println("Invalid Choice");
		}
		System.out.println("Do you want to continue to Login/ SignUp ?Enter: Yes/No");
		 lop=sc.next();
		}while(lop.equals("Yes"));
		
		sc.close();
	}

}
