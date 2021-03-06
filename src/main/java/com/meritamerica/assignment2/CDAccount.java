package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount extends BankAccount {
	private CDOffering offering = null;
	private Date startDate;
	private double balance;

	CDAccount(CDOffering offering, double balance) {
		super(balance, offering.getInterestRate());
		this.offering = offering;
		this.startDate = new Date();
	}

	public double getBalance() {
		return super.getBalance();
	}

	public double getInterestRate() {
		return offering.getInterestRate();
	}

	public int getTerm() {
		return offering.getTerm();
	}

	public java.util.Date getStartDate() {
		return this.startDate;
	}

	public long getAccountNumber() {
		return getAccountNumber();
	}

	public double futureValue() {
		return (super.getBalance() * Math.pow(1.0 + offering.getInterestRate(), offering.getTerm()));

	}
}