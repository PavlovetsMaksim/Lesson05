package edu.training.lesson05.main;

public class Example08Cycle {

	public static void main(String[] args) {
		int a = -3;
		int b = 16;
		int h = 2;
		int c = 1;
		int y;

		for (int i = a; i <= b; i += h) {
			if (i == 15) {
				y = (i + c) * 2;
			} else {
				y = (i - c) + 6;
			}
			System.out.println("При х = " + i + " у = " + y);
		}

	}

}
