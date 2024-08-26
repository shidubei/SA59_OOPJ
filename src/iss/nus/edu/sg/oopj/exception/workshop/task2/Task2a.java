package iss.nus.edu.sg.oopj.exception.workshop.task2;

public class Task2a {
	public static void main(String[] args) {
		System.out.println("Enter main:");
		Task2a task2a = new Task2a();
		try {
			task2a.m1();
		}catch(Exception e) {
			System.out.println("Catch block of main");
			System.out.println(e.getMessage());
		}
		System.out.println("Exit main");
	}
	
	public void m1() {
		try {
			System.out.println("Enter a block of m1");
			m2();
			System.out.println("Exit try block of m1");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Catch block of m1:");
		}
		System.out.println("Exit m1");
	}
	
	public void m2() {
		System.out.println("Enter m2");
		int y=0;
		int x=10/y;
		System.out.println("Exit m2");
	}
}
