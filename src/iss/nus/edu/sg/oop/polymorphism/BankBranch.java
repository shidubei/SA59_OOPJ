package iss.nus.edu.sg.oop.polymorphism;

import java.util.ArrayList;
import java.util.List;

import iss.nus.edu.sg.oopj.object_inheritance.workshop.Account;

public class BankBranch {
	public String name;
	
	public List<Account> accountList;
	
	public BankBranch(String name) {
		this.name=name;
		accountList=new ArrayList<Account>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void addAccount(Account account) {
		accountList.add(account);
	}
	
	public void printAccounts() {
		for(Account account:accountList) {
			System.out.println(account);
		}
	}
	
	public double totalDeposits() {
		double totalDeposits = 0.0;
		for(Account account:accountList) {
			if(account.getBalance()>=0) {
				totalDeposits+=account.getBalance()
;			}
		}
		return totalDeposits;
	}
	
	public double totalInterestPaid() {
		double totalInterestPaid = 0.0;
		for(Account account : accountList) {
			if(account.getBalance()>=0) {
				totalInterestPaid+=account.calculateInterest();
			}
		}
		return totalInterestPaid;
	}
	
	public double totalNegativeDeposits() {
		double totalNegativeDeposits = 0.0;
		for(Account account:accountList) {
			if(account.getBalance()<0) {
				totalNegativeDeposits+=account.getBalance()
;			}
		}
		return totalNegativeDeposits;
	}
	
	public double totalInterestEarned() {
		double totalInterestEarned = 0.0;
		for(Account account : accountList) {
			if(account.getBalance()<0) {
				totalInterestEarned+=account.calculateInterest();
			}
		}
		return totalInterestEarned;
	}
	
	public void printCustomers() {
		List<String> Customers = new ArrayList<String>();
		for(Account account:accountList) {
			if(!Customers.contains(account.getHolderId())) {
				System.out.println(account.getHolderId());
				Customers.add(account.getHolderId());
			}
		}
	}
	
	public String toString() {
		return "Branch:Clementi Central";
	}
}
