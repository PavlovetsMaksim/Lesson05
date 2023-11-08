package edu.training.lesson05.main;

public class Example29Branching {

	public static void main(String[] args) {
		int x1 = 5;
		int y1 = 2;
		
		int x2 = -3;
		int y2 = -1;
		
		int x3 = 8;
		int y3 = 6;
		
		double a = (y2 - y1) * (x3 - x2);
        double b = (x2 - x1) * (y3 - y2);
        double c = (x3 - x2) * (y2 - y1);

        if (a == b && b == c && c == 0) {
            System.out.println("Точки расположены на одной прямой");
        } else {
            System.out.println("Точки расположены не на одной прямой");
        }

	}

}
