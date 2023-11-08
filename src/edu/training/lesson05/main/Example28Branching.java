package edu.training.lesson05.main;

public class Example28Branching {

	public static void main(String[] args) {
		int a = 5;
		int b = 14;
		int c = 8;
		int d = 3;

		int maxVal = 0;

		if (d == a) {
			System.out.println("Число d равно числу a");
		} else if (d == b) {
			System.out.println("Число d равно числу b");
		} else if (d == c) {
			System.out.println("Число d равно числу c");
		} else {
			a = d - a;
			b = d - b;
			c = d - c;
			maxVal = Math.max(a, Math.max(b, c));
			System.out.println("Ни одно число не равно d! max(d — a, d — b, d — c) = " + maxVal);
		}

	}

}
