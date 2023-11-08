package edu.training.lesson05.main;

public class Example16Cycle {

	public static void main(String[] args) {
		int sum = 3;
        long composition = sum;

        for (double i = 3; i <= 10; i++) {
            sum += i;
            composition *= sum;
        }

        System.out.println(composition);

	}

}
