package edu.training.lesson05.main;

public class Example14Cycle {

	public static void main(String[] args) {
		int n = 7;
        double sum = 0;

        for (double i = 1; i <= n; i++) {
            sum += 1 / i;
        }

        System.out.println("При n = " + n + " сумма равна " + sum);

	}

}
