package com.codingdojo.javaOOPAdvanced;

public class BankAccount {
	public String accountNumber;
	public double checkingBalance;
	public double savingBalance;
	public static int accountCount=0;
	public static double totalAmount = 0;
	
	public BankAccount() { //constructor of public class BankAccount !!
		 accountCount++;
		 this.accountNumber = getAccountNumber();
	}
	
	private String getAccountNumber() {
		String accountNumber="";
		for (int i=0; i<10; i++) {
			int num = (int) (Math.random()*10);
			accountNumber += num;
		}
		return accountNumber;
	}
	
	public void getBalances() {
		String checkingAccountBalance = String.format("%.2f", checkingBalance);
		System.out.println("Checking Account Balance: " + checkingAccountBalance);
		
		String savingAccountBalance = String.format("%.2f", savingBalance);
		System.out.println("Saving Account Balance: " + savingAccountBalance);
		
	}
	
	public void deposit(String accountType, double amount){
		String depAmount = String.format("%.2f", amount);
        if(accountType == "checking"){
            this.checkingBalance += amount;
        } else if(accountType == "savings"){
            this.savingBalance += amount;
        } else {
            System.out.println("Please enter correct Account Type: Checking or Saving and correct Amount");
        }
        totalAmount += amount;
        System.out.println("Deposited $"+ depAmount +" into your "+accountType+" account.");        
    }
    public void withdraw(String accountType, double amount){
    	String withAmount = String.format("%.2f", amount);
        if(accountType == "checking"){
            if(amount > this.checkingBalance){
                System.out.println("Insufficient funds.");
            }
            this.savingBalance -= amount;
        } else {
            System.out.println("Please enter correct Account Type: Checking or Saving and correct Amount");
        }
        totalAmount -= amount;
        System.out.println("Withdrawn $"+ withAmount +" from your "+accountType+" account.");
    }

}
