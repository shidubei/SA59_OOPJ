package iss.nus.edu.sg.oopj.object_inheritance.workshop;

public class OverdraftAccount extends Account {
	private static double interest = 0.0025;
	private static double interestToBank = 0.06;
	
	public OverdraftAccount(String number,String holderId,double balance) {
		super(number,holderId,balance);
	}
	
	public double calculateInterest() {
		if(this.getBalance()>=0) {
			return this.getBalance()*interest;
		}
		return this.getBalance()*interestToBank;	
	}
	public void creditInterest() {
		this.setBalance(this.getBalance()+calculateInterest());
	}
	public boolean withdraw(double amount) {
		this.setBalance(this.getBalance()-amount);
		return true;
	}
	public String toString() {
		return "[OverdraftAccount] "+super.toString();
	}
}
