package com.main;

import javax.security.auth.login.AccountNotFoundException;

import com.Account.AccountHolder;
import com.bank.AccountIdNotFound;
import com.bank.Bank;

public class BankDemo {

	public static void main(String[] args) throws AccountIdNotFound {

		AccountHolder bo1 = new AccountHolder("Raghu");
		AccountHolder bo2 = new AccountHolder("Teja");
		AccountHolder bo3 = new AccountHolder("Sai");

		AccountHolder[] listOfAccounts = { bo1, bo2, bo3 };
		Bank b = new Bank();
		b.setAccountArray(listOfAccounts);
		try {
			AccountHolder res = b.checkAccount(122);
			System.out.println(res);
		} catch (AccountIdNotFound ae) {
			System.out.println(ae.getMessage());
		}
		System.out.println("completed");
		try {
		String tranRes=b.balanceTransfer(1,2,500);
		System.out.println("Transfer status"+tranRes);
		
		}catch(AccountIdNotFound afe)
		{
			System.out.println(afe.getMessage());
		}
		double balanceResult=b.getBalanceUsingAcNum(1);
	     System.out.println(balanceResult);
		
		
		
	}//main
}
