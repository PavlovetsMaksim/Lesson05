package edu.training.lesson05.main;

public class Example31Branching {

	public static void main(String[] args) {
		double a = 10, b = 8;
		double x = 9, y = 9, z = 20;

		if ((a > x) & (b > y)) {
			System.out.println("Проидет.");
		} else if ((a > y) & (b > x)) {
			System.out.println("Проидет.");
		} else if ((a > x) & (b > z)) {
			System.out.println("Проидет.");
		} else if ((a > z) & (b > x)) {
			System.out.println("Проидет.");
		} else if ((a > y) & (b > z)) {
			System.out.println("Проидет.");
		} else if ((a > z) & (b > y)) {
			System.out.println("Проидет.");
		} else {
			System.out.println("Не проидет.");
		}

	}

}
