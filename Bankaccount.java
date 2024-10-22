package project4;
import java.util.Scanner;

public class bankaccount {

	

	
	class BankAccount {
	    private double balance;

	    
	    public BankAccount(double initialBalance) {
	        this.balance = initialBalance;
	    }

	   
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Successfully deposited $" + amount);
	        } else {
	            System.out.println("Deposit amount must be positive.");
	        }
	    }

	   
	    public void withdraw(double amount) {
	        if (amount > 0) {
	            if (amount <= balance) {
	                balance -= amount;
	                System.out.println("Successfully withdrew $" + amount);
	            } else {
	                System.out.println("Insufficient balance for the withdrawal.");
	            }
	        } else {
	            System.out.println("Withdrawal amount must be positive.");
	        }
	    }

	   
	    public double getBalance() {
	        return balance;
	    }
	}


	class ATM {
	    private BankAccount account;

	    
	    public ATM(BankAccount account) {
	        this.account = account;
	    }

	   
	    public void displayMenu() {
	        Scanner scanner = new Scanner(System.in);
	        boolean exit = false;

	        while (!exit) {
	            System.out.println("\nATM Menu:");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Deposit Money");
	            System.out.println("3. Withdraw Money");
	            System.out.println("4. Exit");
	            System.out.print("Choose an option (1-4): ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    checkBalance();
	                    break;
	                case 2:
	                    System.out.print("Enter amount to deposit: ");
	                    double depositAmount = scanner.nextDouble();
	                    deposit(depositAmount);
	                    break;
	                case 3:
	                    System.out.print("Enter amount to withdraw: ");
	                    double withdrawAmount = scanner.nextDouble();
	                    withdraw(withdrawAmount);
	                    break;
	                case 4:
	                    System.out.println("Thank you for using the ATM. Goodbye!");
	                    exit = true;
	                    break;
	                default:
	                    System.out.println("Invalid option. Please try again.");
	            }
	        }

	        scanner.close();
	    }

	  
	    private void checkBalance() {
	        System.out.println("Current Balance: $" + account.getBalance());
	    }

	   
	    private void deposit(double amount) {
	        account.deposit(amount);
	    }


	    private void withdraw(double amount) {
	        account.withdraw(amount);
	    }
	}

	public class ATMSystem {
	    public static void main(String[] args) {
	        
	        BankAccount userAccount = new BankAccount(500);  

	       
	        ATM atm = new ATM(userAccount);

	       
	        atm.displayMenu();
	    }
	    }
