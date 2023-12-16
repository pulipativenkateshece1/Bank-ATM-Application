package org.bank_atm.com;

public class Account 
{
	String account_holder_name;
	String dob;
	int pin;
	double money;
	long account_number;
	public Account(String account_holder_name, String dob, int pin, double money, long account_number) {
		super();
		this.account_holder_name = account_holder_name;
		this.dob = dob;
		this.pin = pin;
		this.money = money;
		this.account_number = account_number;
	}
	public void accountDetails()
	{
		System.out.println(account_holder_name);
		System.out.println(dob);
		System.out.println(pin);
		System.out.println(money);
		System.out.println(account_number);
	}

}
