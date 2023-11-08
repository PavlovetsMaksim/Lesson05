package edu.training.lesson05.main;

public class Example17Cycle {

	public static void main(String[] args) {
		int n = 4;
        double a = 1.3;
        double composition = 1;

        for (int i = 0; i < n; i++) {
            composition *= a + i;
        }

        System.out.println(composition);

	}

}
