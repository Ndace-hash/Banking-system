package cpt311_2019_1_77106CT;

public class SavingsAccount extends Account {
	public double interestRate;
	
	public SavingsAccount(String accountNumber,Customer accountHolder) {
		super(accountNumber,accountHolder);

	}
	public double calculateInterest () {
		double interest = this.getBalance() * interestRate;
		return interest;
	}
	public void applyInterest() {
		
	}
}
