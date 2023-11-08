package edu.training.lesson05.main;

public class Example32Branching {

	public static void main(String[] args) {
		int a = 5;
		int b = -14;
		int c = -8;
		
		if (a + b >= 0) {
            System.out.println("Да");
        } else if (a + c >= 0) {
            System.out.println("Да");
        } else if (b + c >= 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }

	}

}
