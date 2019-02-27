package com.Bank;

import com.Bank.exception.AccountNumberNotFound;
import com.Bank.exception.InvalidAccountBalance;
import com.BankAccount.AccountDetails;

public class Bank {
  

		private AccountDetails[] arrayOfAccountDetails;

		public AccountDetails[] getArrayOfAccountDetails() {
			return arrayOfAccountDetails;
		}

		public void setArrayOfAccountDetails(AccountDetails[] arrayOfAccountDetails) {
			this.arrayOfAccountDetails = arrayOfAccountDetails;
		}

		/**
		 * @param arrayOfAccountDetails
		 */
		public Bank(AccountDetails[] arrayOfAccountDetails) {
			super();
			this.arrayOfAccountDetails = arrayOfAccountDetails;
		}

		/**
		 * 
		 */
		public Bank() {
			super();
		}

		public String balanceTransfer(int fromAccountNumber, int toAccountNumber, double balanceToTransfer)
				throws AccountNumberNotFound, InvalidAccountBalance{
			String transferStatus = null;
			
			int accountFoundStatus=0;
			for (AccountDetails fromAccount: arrayOfAccountDetails) {
				for (AccountDetails toAccount: arrayOfAccountDetails) {
					if(fromAccount.getAccountNumber()==fromAccountNumber&&toAccount.getAccountNumber()==toAccountNumber&& fromAccount.getAccountNumber()!=toAccount.getAccountNumber()) {
						++accountFoundStatus;
					}
				}
			}
			
			boolean insufficeintBalance=false;
			if(accountFoundStatus>0) {
				for (AccountDetails fromAccount : arrayOfAccountDetails) {
					for (AccountDetails toAccount : arrayOfAccountDetails) {
						if(fromAccount.getAccountNumber()==fromAccountNumber && toAccount.getAccountNumber()==toAccountNumber) {
							if(fromAccount.getAccountBalance()>=balanceToTransfer) {
												fromAccount.setAccountBalance(fromAccount.getAccountBalance()-balanceToTransfer);
												toAccount.setAccountBalance(toAccount.getAccountBalance()+balanceToTransfer);
												transferStatus="Transfer completed";
												break;
							}else {
								insufficeintBalance=true;
							}
						}
					}
				}
			}else {
				throw new AccountNumberNotFound("Invalid Account Details");
			}
			if(insufficeintBalance) {
				throw new InvalidAccountBalance("Insufficient Funds Exception");
			}
				

			return transferStatus;

		}

	}

	

