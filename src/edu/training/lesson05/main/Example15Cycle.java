package edu.training.lesson05.main;

public class Example15Cycle {

	public static void main(String[] args) {
		int sum = 0;

        for (double i = 0; i <= 10; i++) {
            sum += Math.pow(2, i);
        }

        System.out.println("Сумма равна " + sum);

	}

}
