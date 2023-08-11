package cpt311_2019_1_77106CT;

public class CurrentAccount extends Account {
	private double overdraftLimit;
	
	public CurrentAccount(String accountNumber,Customer accountHolder) {
		super(accountNumber,accountHolder);
	
	}
	public void setOverdraftLimit(double limit) {
		this.overdraftLimit = limit;
	}
	public void performOverdraft(double amount) {
		
	}
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
}
