package com.Account;

public class AccountHolder {

	private int accNum;
	private static int lastAssignedAccNum = 0;
	private String accName;
	private double accBal;

	public int getAccNum() {
		return accNum;
	}

	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public double getAccBal() {
		return accBal;
	}

	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}

	public AccountHolder(String accName) {
		super();
		this.accNum = ++lastAssignedAccNum;
		this.accName = accName;
		this.accBal = 1000;
	}

	public AccountHolder() {
		super();
	}

	@Override
	public String toString() {
		return "AccountHolder [accNum=" + accNum + ", accName=" + accName + ", accBal=" + accBal + "]";
	}

}
