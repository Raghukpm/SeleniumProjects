package com.bank;

import com.Account.AccountHolder;

public class Bank {

	private AccountHolder[] accountArray;

	public Bank(AccountHolder[] accountArray) {
		super();
		this.accountArray = accountArray;
	}

	public AccountHolder[] getAccountArray() {
		return accountArray;
	}

	public void setAccountArray(AccountHolder[] accountArray) {
		this.accountArray = accountArray;
	}

	public AccountHolder checkAccount(int accountNum) throws AccountIdNotFound {
		AccountHolder res = null;
		int accFoundStatus = 0;
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i].getAccNum() == accountNum) {
				++accFoundStatus;
			}
		} // for
		if (accFoundStatus > 0) {
			for (int i = 0; i < accountArray.length; i++) {
				if (accountArray[i].getAccNum() == accountNum) {
					res = accountArray[i];
				}
			}
		} else {
			throw new AccountIdNotFound("AccountID Not Found");

		}
		return res;

	}// checkAccount

	public Bank() {
		super();
	}
   public String balanceTransfer(int fromAcc,int toAcc,double bal ) throws AccountIdNotFound
   {  String tranferStatus=null;
   System.out.println(fromAcc+" "+toAcc+" "+this.accountArray.length);
       for(int i=0;i<this.accountArray.length;i++)
       {
    	   System.out.println(this.accountArray[i].getAccNum());
    	   for(int j=0;j<this.accountArray.length;j++)
    	   {
    		   System.out.println(this.accountArray[j].getAccNum()+"....."+this.accountArray[i].getAccNum());
    		   if(this.accountArray[i].getAccNum()==fromAcc&&this.accountArray[j].getAccNum()==toAcc&&
    				   this.accountArray[i].getAccBal()>bal)
     		   {
    			   System.out.println(this.accountArray[i].getAccNum()+" "+this.accountArray[j].getAccNum());
    			   this.accountArray[i].setAccBal(this.accountArray[i].getAccBal()-bal);
    			   this.accountArray[j].setAccBal(this.accountArray[j].getAccBal()+bal);
    			   tranferStatus="Success";
    			   break;
    		   }else {
    			   throw new AccountIdNotFound("Failed to transfer");
    		   }
    	   }//J-For
    	   
       }//I=for
	   
	   return  tranferStatus;
   }//balanceTransfer()
	
   public double getBalanceUsingAcNum(int acNum)
   {   double foundBalance=0;
	   AccountHolder res = null;
		int accFoundStatus = 0;
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i].getAccNum() == acNum)
			{  
				foundBalance=accountArray[i].getAccBal();
			}
			}
		 return foundBalance; 
   }//getBalanceUsingAzNum
	
}// Bank-BLC
