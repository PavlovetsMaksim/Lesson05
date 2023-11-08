package edu.training.lesson05.main;

public class Example26Branching {

	public static void main(String[] args) {
		int a = 5;
		int b = 14;
		int c = 8;

		int maxVal = Math.max(a, Math.max(b, c));
		int minVal = Math.min(a, Math.min(b, c));

		int sum = maxVal + minVal;
		
		System.out.println(sum);

	}

}
