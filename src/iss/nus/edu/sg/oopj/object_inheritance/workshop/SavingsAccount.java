package iss.nus.edu.sg.oopj.object_inheritance.workshop;

public class SavingsAccount extends Account {
	private static double interest=0.01;
	
	public SavingsAccount(String number,String holderId,double balance) {
		super(number,holderId,balance);
	}
	
	public double calculateInterest() {
		double accountInterest =  this.getBalance()*interest;
		return accountInterest;
	}
	
	public void creditInterest() {
		this.setBalance(this.getBalance()+calculateInterest());
	}
	public boolean withdraw(double amount) {
		if(this.getBalance()>=amount) {
			this.setBalance(this.getBalance()-amount);
			return true;
		}
		return false;
	}
	public String toString() {
		return "[SavingsAccount] "+super.toString();
	}
}
