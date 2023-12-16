package org.bank_atm.com;

public class Bank 
{
	String bname;
	String location;
	String ifsc_code;
	Account account;
	public Bank(String bname, String location, String ifsc_code) 
	{
		super();
		this.bname = bname;
		this.location = location;
		this.ifsc_code = ifsc_code;
		
	}
	public void bankDetails()
	{
		System.out.println("Bank Name : "+bname);
		System.out.println("Location : "+location);
		System.out.println("IFSC Code : "+ifsc_code);
		
		if(account != null)
		{
			System.out.println("Name : "+account.account_holder_name);
			System.out.println("DOB : "+account.dob);
			System.out.println("PIN : "+account.pin);
			System.out.println("Money : "+account.account_number);
		}
		else
		{
			System.out.println("Open Your Account first..");
		}
		
		
		
	}
	public void createAccount(Account account)
	{
		if(this.account==null)
		{
			this.account=account;
			System.out.println("Account Successfully create");
		}
		else
		{
			System.out.println("Already Account is existing ");
		}
	}
	public void Deposite(long account_number, double money)
	{
		if(account.account_number==account_number)
		{
			if(money !=0)
			{
				account.money=account.money+money;
				System.out.println("Depoosite money is :" +money);
				System.out.println("Total Balance is : "+account.money);
			}
			else
			{
				System.out.println("Enter a Valid amount to add in account");
			}
			
		}
		else
		{
			System.out.println("Enter valid account number");
		}
	}
	public void withDraw(long account_number, double money)
	{
		if(account.account_number==account_number)
		{
			if(account.money>=money)
			{
				account.money=account.money+money;
				System.out.println("Withdraw amount is "+money);
				System.out.println("Total Balance is : "+account.money+account.money);
			}
			else
			{
				System.out.println("Enter the Valid amount to add in account");
			}
		}
		
	}
	public void DeleteAccount()
	{
		this.account=null;
		System.out.println("Account Deleted");
	}

}
