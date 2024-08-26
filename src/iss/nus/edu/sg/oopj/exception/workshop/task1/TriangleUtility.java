package iss.nus.edu.sg.oopj.exception.workshop.task1;

public class TriangleUtility {
	public static boolean isValidTriangle(double side1,double side2,double side3) {
		return side1>0&&side2>0&&side3>0&&side1+side2>side3&&side1+side3>side2&&side2+side3>side1;
	}
}
