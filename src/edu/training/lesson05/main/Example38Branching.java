package edu.training.lesson05.main;

public class Example38Branching {

	public static void main(String[] args) {
		double x = 5;
		
		double f = 0;
		
		if (x >= 0 && x <= 3) {
			f = x * x;
		} else if (x > 3 || x < 0) {
			f = 4;
		}
		
		System.out.println("F(x) = " + f);

	}

}
