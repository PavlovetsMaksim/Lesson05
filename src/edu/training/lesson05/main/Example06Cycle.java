package edu.training.lesson05.main;

public class Example06Cycle {

	public static void main(String[] args) {
		int i = 1;
        int number = 2;
        int sum = 0;

        while (i <= number) {
            sum += i;
            i++;
        }
        
        System.out.println(sum);

	}

}
