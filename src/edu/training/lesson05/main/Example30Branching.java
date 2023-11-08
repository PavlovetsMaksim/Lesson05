package edu.training.lesson05.main;

public class Example30Branching {

	public static void main(String[] args) {
		int a = 5;
		int b = 14;
		int c = -8;
		
		if (a > b && b > c) {
            a *= 2;
            b *= 2;
            c *= 2;
            System.out.println("Удвоенные числа: a = " + a + ", b = " + b + ", c = " + c);
        } else {
            a = Math.abs(a);
            b = Math.abs(b);
            c = Math.abs(c);
            System.out.println("Абсолютные значения: a = " + a + ", b = " + b + ", c = " + c);
        }

	}

}
