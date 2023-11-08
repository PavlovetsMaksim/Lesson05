package edu.training.lesson05.main;

public class Example40Branching {

	public static void main(String[] args) {
		double x = 12;
		
		double f = 0;
		
		if (x <= 13) {
			f = Math.pow(-x, 3) + 9;
		} else if (x > 13) {
			f = -3 / (x + 1);
		}
		
		System.out.println("F(x) = " + f);

	}

}
