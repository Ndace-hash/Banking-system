package cpt311_2019_1_77106CT;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	final static Scanner input = new Scanner(System.in);
	static ArrayList<Customer> customers = new ArrayList<Customer>();

	public static void main(String[] args) {
		
		System.out.println("What do you want to do?");
		System.out.println("1. Create account");
		System.out.println("2. Transfer");
		System.out.println("3. Check balance");
		System.out.println("4. Deposit");
		System.out.println("5. Withdrawal");
		
		int choice = input.nextInt();
		
		switch(choice) {
		case 1:
			createAccount();
		}
//		Customer zach = new Customer("ZaccheausYisa", "Zaccheaus" , "Yisa");
//		zach.addAccount(new SavingsAccount("1",zach, 2.4));
//		zach.addAccount(new CurrentAccount("3"));
//		Account savings = zach.getAccount("1");
//		Account current = zach.getAccount("3");
//		System.out.println(savings.getAccountNumber());
//		System.out.println(current.getAccountNumber());
//		System.out.println(savings.getBalance());
//		savings.withdraw(2000.00);
//		System.out.println(savings.getBalance());
//		savings.deposit(5000);
//		System.out.println(savings.getBalance());
//		savings.withdraw(2800.94);
//		System.out.println(savings.getBalance());
//				
//		System.out.print(zach.addAccount(new Account("1")));
		input.close();
	}
	
	private static void createAccount() {
		System.out.println("Open a new account. Please follow the procedure carefully.");
		System.out.print("Enter your first name: ");
		String firstName = input.next();
		
		System.out.print("Enter your last name: ");
		String lastName = input.next();
		String customerId = firstName + lastName;
		
		boolean wrongInput=false;
		do {
			
			System.out.println("\nSelect type of account:");
			System.out.println("1. Savings");
			System.out.println("2. Current");
			int choice = input.nextInt();
			
			int randomValue;
			String accountNumber;
			Customer customer;
			switch(choice) {
			case 1:
				randomValue = (int)Math.floor(Math.random() * 99999999);
				accountNumber = "30"+randomValue;
				customer = new Customer(customerId,firstName,lastName); 
				customers.add(customer);
				customer.addAccount(new SavingsAccount(accountNumber, customer));
				System.out.println("You have successfully created a new account.");
				System.out.println("Your account number is "+ accountNumber);
				wrongInput = false;
				break;
				
			case 2:
				randomValue = (int)Math.floor(Math.random() * 99999999);
				accountNumber = "31"+randomValue;
				customer = new Customer(customerId,firstName,lastName); 
				customers.add(customer);
				customer.addAccount(new CurrentAccount(accountNumber, customer));
				System.out.println("You have successfully created a new account.");
				System.out.println("Your account number is "+ accountNumber);
				wrongInput = false;
				break;
			default:
				System.out.println("Please pick a valid account type.");
				wrongInput = true;
				break;
			}
			
		} while (wrongInput);
		
	}

}
