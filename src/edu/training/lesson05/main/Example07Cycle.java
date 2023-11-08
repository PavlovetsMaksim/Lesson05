package edu.training.lesson05.main;

public class Example07Cycle {

	public static void main(String[] args) {
		int a = -3;
		int b = 9;
		int h = 2;
		int y;

		for (int i = a; i <= b; i += h) {
			if (i > 2) {
				y = i;
			} else {
				y = i * (-1);
			}
			System.out.println("При х = " + i + " у = " + y);
		}

	}

}
