package edu.training.lesson05.main;

public class Example24Cycle {

	public static void main(String[] args) {
		int number = 1234567;
		
        String string = "";
        String newString = "";
        
        int sum = 0;
        int symbol = 0;

        string = Integer.toString(number);
        
        for (int i = 1; i < string.length(); i+= 2){
            symbol = string.charAt(i) - '0';
            sum += symbol;
        }

        for (int i = string.length() - 1; i >= 0; i--){
            newString += string.charAt(i);
        }

        int newNumber = Integer.parseInt(newString);

        System.out.println("Cумма четных цифр, входящих в состав числа " + number + ", равна " + sum);
        System.out.println("Новое число: " + newNumber);

	}

}
