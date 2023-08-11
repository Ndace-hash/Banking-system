package cpt311_2019_1_77106CT;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Main {
	final static Scanner input = new Scanner(System.in);
	static ArrayList<Customer> customers = new ArrayList<Customer>();
	static Database db;

	public static void main(String[] args) {
		File file = new File("c:/Users/user1/Documents/users.csv");
		
		String[] DBTableFields = {"customer ID","First Name","Last Name","Account Number"};
		db = new Database(file, DBTableFields);
		
		System.out.println("What do you want to do?");
		System.out.println("1. Create account");
		System.out.println("2. Transfer");
		System.out.println("3. Check balance");
		System.out.println("4. Deposit");
		System.out.println("5. Withdrawal");
		
		boolean wrongInput = false;
		String choice = input.next();
		do {
		switch(choice) {
		case "1":
			wrongInput = false;
			createAccount();
			break;
		default:
			System.out.println("Invalid option. Please try again.");
			wrongInput = true;
			break;
		
		}}while(wrongInput);
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
			String choice = input.next();
			
			String randomValue="";
			String accountNumber;
			Customer customer;
			switch(choice) {
			case "1":
				for(int i=1;i<=8;i++) {
					randomValue += ""+ (int)Math.floor(Math.random() * 10);
				}
				accountNumber ="30"+randomValue;
				customer = new Customer(customerId,firstName,lastName); 
				customers.add(customer);
				System.out.println("Your account number is "+ accountNumber);
				System.out.println("You have successfully created a new account.");
				db.writeToDB(customer.getCustomerId(),customer.getFirstName(),customer.getLastName(),accountNumber);
				customer.addAccount(new SavingsAccount(accountNumber, customer));
				wrongInput = false;
				break;
				
			case "2":
				for(int i=1;i<=8;i++) {
					randomValue += ""+ (int)Math.floor(Math.random() * 10);
				}
				accountNumber = "31"+randomValue;
				customer = new Customer(customerId,firstName,lastName); 
				customers.add(customer);
				customer.addAccount(new CurrentAccount(accountNumber, customer));
				System.out.println("You have successfully created a new account.");
				System.out.println("Your account number is "+ accountNumber);
				db.writeToDB(customer.getCustomerId(),customer.getFirstName(),customer.getLastName(),accountNumber);
				customer.addAccount(new SavingsAccount(accountNumber, customer));
				
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
