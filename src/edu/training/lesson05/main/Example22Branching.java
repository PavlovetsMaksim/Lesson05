package edu.training.lesson05.main;

public class Example22Branching {

	public static void main(String[] args) {
		int x = 4;
		int y = 6;
		
		int temp;
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x = " + x + "; y = " + y);

	}

}
