package iss.nus.edu.sg.oopj.exception.workshop.task1;

public class Triangle {
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle(double side1,double side2,double side3) throws BadTriangleException {
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
		
		if(!TriangleUtility.isValidTriangle(this.side1,this.side2,this.side3)) {
			throw new BadTriangleException("invalid sides");
		}
	}
	
	public double perimeter() {
		return side1+side2+side3;
	}
	
	public double area() {
		double per = (side1+side2+side3)/2;
		return Math.sqrt(per*(per-side1)*(per-side2)*(per-side3));
	}
}
