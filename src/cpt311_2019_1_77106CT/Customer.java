package cpt311_2019_1_77106CT;

import java.util.ArrayList;
 
public class Customer {
	private String customerId;
	private String firstName;
	private String lastName;
	private ArrayList<Account> account;
	public Customer(String customerId, String firstName, String lastName) {
		setCustomerId(customerId);
		setFirstName(firstName);
		setLastName(lastName);
		account = new ArrayList<Account>();
	}
	public void addAccount(Account account) {
		this.account.add(account);
	}
	public Account getAccount(String accountNumber) {
		Account target = null;
		for(int i=0;i<this.account.size();i++) {
			Account account = this.account.get(i);
			if(account.accountNumber.equals(accountNumber)) {
				target = account;
			}
		}
		return target;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
