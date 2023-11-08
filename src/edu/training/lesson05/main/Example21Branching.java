package edu.training.lesson05.main;

public class Example21Branching {

	public static void main(String[] args) {
		char answer = 'М';

		System.out.println("Кто ты: мальчик или девочка? Введи Д или М");
		System.out.println(answer);

		switch (answer) {
		case 'М':
			System.out.println("Мне нравятся девочки!");
			break;
		case 'Д':
			System.out.println("Мне нравятся мальчики!");
			break;
		default:
			System.out.println("Неверное значение!");
		}

	}

}
