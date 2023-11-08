package edu.training.lesson05.main;

public class Example20Cycle {

	public static void main(String[] args) {
		double sum = 0.0;
        double e = 0.1;
        double an = 0.0;
        int n = 10;

        for (int i = 0; i <= n; i++) {
            an = 1.0 / ((3 * i - 2) * (3 * i + 1));
            if (Math.abs(an) >= e ){
                sum += an;
            }
        }

        System.out.println(sum);

	}

}
