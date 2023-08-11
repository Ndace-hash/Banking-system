package cpt311_2019_1_77106CT;

import java.util.ArrayList;

public abstract class Account {
	protected String accountNumber;
	protected double balance;
	protected Customer accountHolder;
	private ArrayList<Transaction> transaction;
	public Account(String accountNumber, Customer accountHolder) {
		setBalance(0.0);
		setAccountNumber(accountNumber);
		setAccountHolder(accountHolder);
		transaction = new ArrayList<Transaction>();
	}
	public void setAccountHolder(Customer accountHolder) {
		this.accountHolder = accountHolder;
	}
	public Customer getAccountHolder() {
		return this.accountHolder;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return this.balance;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountNumber() {
		return this.accountNumber;
	}
	public void deposit(double amount) {
		this.balance = getBalance() + amount;
		transaction.add(new Transaction(amount, TransactionType.DEPOSIT));
	}
	public void withdraw(double amount) {
		if (getBalance() >= amount) {
			setBalance(getBalance()-amount);
			transaction.add(new Transaction(amount, TransactionType.WITHDRAWAL));
		}else {
			System.out.println("Insufficient funds. Please check your balance and try again.");
		}
	}
}
