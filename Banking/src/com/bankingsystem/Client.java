package com.bankingsystem;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BankLogin bankLogin = BankLogin.getInstance();
	        BankAccount account = new BankAccount(100000);
	        
	        account.viewBalance();
	        bankLogin.login();
	        account.viewBalance();
	        account.deposit(5000);
	        account.withdraw(5000);
	        account.viewBalance();
	        bankLogin.logout();
	        account.viewBalance();
	        account.deposit(10000);

	}

}
