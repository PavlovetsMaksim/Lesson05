package edu.training.lesson05.main;

public class Example13Cycle {

	public static void main(String[] args) {
		int a = -5;
        int b = 5;
        double h = 0.5;
        double y;

        for (double i = a; i <= b; i += h) {
            y = 5 - (i * i) / 2.0;
            System.out.println("При х = " + i + " у = " + y);
        }

	}

}
