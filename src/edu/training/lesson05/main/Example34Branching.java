package edu.training.lesson05.main;

public class Example34Branching {

	public static void main(String[] args) {
		double bookPrice = 189;
		double money = 200;

		if (money == bookPrice) {
			System.out.println("Спасибо");
		} else if (money > bookPrice) {
			double change = money - bookPrice;
			System.out.println("Возьмите сдачу " + change);
		} else {
			System.out.println("Для покупки книги Вам не хватает " + (bookPrice - money));
		}

	}

}
