package edu.training.lesson05.main;

public class Example18Cycle {

	public static void main(String[] args) {
		double sum = 0.0;
        double e = 0.1;
        double an = 0.0;
        int n = 50;

        for (int i = 2; i <= n; i++) {
            an = Math.pow(-1, i - 1) / i;
            if (Math.abs(an) >= e ){
                sum += an;
            }
        }

        System.out.println(sum);

	}

}
