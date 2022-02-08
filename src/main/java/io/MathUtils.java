package io;

public class MathUtils {

	public int add (int a, int b) {
		return a + b;
	}
	
	public int divide (int a, int b) {
		return a / b;
		
	}
	
	public double computeCircleArea(double radius) {
		return Math.PI * radius * radius;
		
	}
	
	
	public static void main(String[] args) {
		
		MathUtils mathUtils = new MathUtils();
		
		System.out.println(mathUtils.divide(10, 0));
		
	}
	
	
}
