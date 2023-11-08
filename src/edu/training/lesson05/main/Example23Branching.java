package edu.training.lesson05.main;

import java.util.Scanner;

public class Example23Branching {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите число > ");
		int day = sc.nextInt();
		
		System.out.print("Введите месяц по порядку > ");
		int numberOfMoth = sc.nextInt();

		if (day < 1 || day > 31) {
			System.out.println("Некорректные данные! Число дней в месяце должно быть в диапазоне от 1 до 30!");
		}

		if (numberOfMoth < 1 || numberOfMoth > 12) {
			System.out.println("Некорректные данные! Порядковый номер месяца должен быть в диапазоне от 1 до 12!");
		}
		
		sc.close();

	}

}
