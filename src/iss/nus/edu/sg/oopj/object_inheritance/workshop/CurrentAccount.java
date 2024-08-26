package iss.nus.edu.sg.oopj.object_inheritance.workshop;

public class CurrentAccount extends Account {
	private static double interest=0.0025;
	
	public CurrentAccount(String number,String holderId,double balance) {
		super(number,holderId,balance);
	}
	
	public double calculateInterest() {
		return this.getBalance()*interest;
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
		return "[CurrrentAccount] "+super.toString();
	}
}
