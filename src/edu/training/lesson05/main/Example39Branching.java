package edu.training.lesson05.main;

public class Example39Branching {

	public static void main(String[] args) {
		double x = 5;
		
		double f = 0;
		
		if (x >= 8) {
			f = Math.pow(-x, 2) + x - 9;
		} else if(x < 8) {
			f = 1 / ((Math.pow(x, 4)) - 6);
		}
		
		System.out.println("F(x) = " + f);

	}

}
