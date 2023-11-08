package edu.training.lesson05.main;

public class Example25Cycle {

	public static void main(String[] args) {
		int number = 5;
        int result = 1;

        if (number == 0){
            result = 1;
        } else {
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
        }

        System.out.println(result);

	}

}
