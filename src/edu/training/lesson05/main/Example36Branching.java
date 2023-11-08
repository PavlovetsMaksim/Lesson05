package edu.training.lesson05.main;

public class Example36Branching {

	public static void main(String[] args) {
		double x = 2;
		
		double f = 0;
		
		if (x <= 3) {
			f = x * x - 3 * x + 9;
		} else if (x > 3) {
			f = 1 / (x * x * x + 6);
		}
		
		System.out.println("F(x) = " + f);
		
	}

}
