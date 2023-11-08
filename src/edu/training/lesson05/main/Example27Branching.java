package edu.training.lesson05.main;

public class Example27Branching {

	public static void main(String[] args) {
		int a = 5;
		int b = 14;
		int c = 8;
		int d = 3;
		
		int maxVal = Math.max(Math.min(a, b), Math.min(c, d));
		
        System.out.println(maxVal);

	}

}
