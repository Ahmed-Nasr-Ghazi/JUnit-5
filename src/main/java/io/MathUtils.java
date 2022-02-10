package io;

interface Lam {
	void execute(int x);
}



public class MathUtils {

	public void test(Lam lam, int x) {
		lam.execute(x);
	}
	
	public int add (int a, int b) {
		return a + b;
	}
	
	public int divide (int a, int b) {
		return a / b;
		
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public double computeCircleArea(double radius) {
		return Math.PI * radius * radius;
		
	}
	
	
	public static void main(String[] args) {
		
		MathUtils mathUtils = new MathUtils();

		
		Lam lam = (int x) -> System.out.println(x);
		lam.execute(10);
		mathUtils.test( lam, 0);

		System.out.println(mathUtils.divide(10, 0));
		
	}
	
	
}
