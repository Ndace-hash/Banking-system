package cpt311_2019_1_77106CT;

import java.util.Date;

public class Transaction {
	private String transactionId;
	private double amount;
	private TransactionType type;
	private Date date;
	public Transaction(double amount,TransactionType type){
		int randomId = (int) Math.floor(Math.random()*10000);
		Date time = new Date();
		setTransactionId(""+randomId);
		setAmount(amount);
		setType(type);
		setDate(time);
		
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public TransactionType getType() {
		return type;
	}
	public void setType(TransactionType type) {
		this.type = type;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
