package edu.training.lesson05.main;

public class Example21Cycle {

	public static void main(String[] args) {
		double a = 0.0;
        double b = 7;
        double h = 0.2;
        double y = 0.0;

        for (double i = a; i <= b; i += h) {
            y = i - Math.sin(i);
            System.out.printf("%-11f%-11f\n", i , y);
        }

	}

}
