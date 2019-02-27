package com.main;

import java.util.Set;

import com.Bank.Bank;
import com.Bank.exception.AccountNumberNotFound;
import com.Bank.exception.InvalidAccountBalance;
import com.BankAccount.AccountDetails;

public class BankDemo {

	public static void main(String[] args) throws AccountNumberNotFound, InvalidAccountBalance {
		// TODO Auto-generated method stub
		
		AccountDetails ac=new AccountDetails(001,"raghu",10000);
		AccountDetails ac1=new AccountDetails(002,"teja",14000);
		AccountDetails ac2=new AccountDetails(003,"sai",20000);
		
		AccountDetails ad[]= {ac,ac1,ac2};
		
	    Bank ba=new Bank();
	 
	    ba.setArrayOfAccountDetails(ad);
	    try {
	    String Status = ba.balanceTransfer(001, 002,5000);
	    System.out.println(Status);
	    }catch(Exception ae)
	    {
	    	System.out.println(ae.getMessage());
	    }

	}

}
