package org.bank_atm.com;

import java.util.Scanner;

public class Bank_Driver 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Bank Name to Open account");
		String bname=sc.next();
		System.out.println("Enter the Bank Location");
		String location =sc.next();
		System.out.println("Enter Bank IFSC Code");
		String ifsc_code =sc.next();
		
		Bank bank = new Bank(bname, location, ifsc_code);
		
		boolean option  =true;
		while(option)
		{
			System.out.println("Enter Your Choice");
			System.out.println("Enter 1. for Creating Account");
			System.out.println("Enter 2. for check details");
			System.out.println("Enter 3. for deposite money");
			System.out.println("Enter 4. for Withdraw money");
			System.out.println("Enter 5. for delete Account");
			System.out.println("Enter 6. for exits or close");
			
			int choice=sc.nextInt();
			switch (choice)
			{
			case 1: 
			{
				System.out.println("Enter Name");
				String name=sc.next();
				System.out.println("Enter DOB");
				String dob =sc.next();
				System.out.println("Enter pin ");
				int pin =sc.nextInt();
				System.out.println("Enter money to diposite");
				double money =sc.nextDouble();
				System.out.println("Enter account number of your choice");
				long accounnum=sc.nextLong();
				bank.createAccount(new Account(name, dob, pin, money, accounnum));
				System.out.println("======================================================");
				
				
				
			}
			break;
			case 2:
			{
				bank.bankDetails();
				System.out.println("========================================================");
			}
			break;
			case 3:
			{
				System.out.println("Enter account number to deposite money ");
				long ano1 = sc.nextLong();
				System.out.println("Enter the how much money tou want to diposite");
				double money1 = sc.nextDouble();
				bank.Deposite(ano1, money1);
				System.out.println("======================================================");
			}
			break;
			case 4:
			{
				System.out.println("Enter account number to withdraw money");
				long ano1 =sc.nextLong();
				System.out.println("Enter how much money you want to withdraw");
				double money1 =sc.nextDouble();
				bank.withDraw(ano1, money1);
				System.out.println("======================================================");
			}
			break;
			case 5:
			{
				bank.DeleteAccount();
			}
			break;
			case 6 :
			{
				System.out.println("Thank you for using "+bname);
				System.out.println("Have a Good Day...");
				option=false;
			}
			break;
			default:
			{
				System.out.println("Enter Valid choice");
				break;
			}
				
			}
		}
		
	}

}
