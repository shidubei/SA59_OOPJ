package iss.nus.edu.sg.oopj.object_inheritance.workshop;

public class Account {
	private String number;
	private String holderId;
	private double balance;
	
	public Account(String number,String holderId,double balance) {
		this.number=number;
		this.holderId=holderId;
		this.balance=balance;
	}
	public String getNumber() {
		return this.number;
	}
	public String getHolderId() {
		return this.holderId;
	}
	public double getBalance() {
		return this.balance;
	}
	public void setHolderId(String holderId) {
		this.holderId=holderId;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	public double calculateInterest() {
		return 0.0;
	}
	public void creditInterest() {
		
	}
	
	
	public void display() {
		System.out.printf("Account number %s;holder %s;balance %.1f\n",this.number,this.holderId,this.balance);
	}
	public void deposit(double amount) {
		this.balance+=amount;
	}
	public boolean withdraw(double amount) {
		if(this.balance-amount>0) {
			this.balance-=amount;
			return true;
		}
		return false;
	}
	public boolean transferTo(double amount,Account toAccount) {
		if(this.balance-amount>0) {
			this.balance-=amount;
			toAccount.deposit(amount);
			return true;
		}
		return false;
	}
	public String toString() {
		return "Account number "+this.number+";holderId "+this.holderId+";balance "+this.balance;
	}
}
