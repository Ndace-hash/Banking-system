package cpt311_2019_1_77106CT;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
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
		
		
	}

}
