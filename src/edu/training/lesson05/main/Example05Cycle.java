package edu.training.lesson05.main;

public class Example05Cycle {

	public static void main(String[] args) {
		int i = 1;
        int sum = 0;

        while (i <= 99) {
            sum += i;
            i += 2;
        }
        
        System.out.println("Сумма всех нечетных чисел равна " + sum);
		
	}

}
