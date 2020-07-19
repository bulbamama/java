package ru.stqa.pft.testbox;

public class program {
	public static void main(String[] args) {

	hello("user");
	hello("Alex");
	hello("Gabe");

	Square s = new Square(5);

	System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

	Rectangle r = new Rectangle(4, 6);

		System.out.println("Прямоугольник со сторонами " + r.a + " and " + r.b + " = " + r.area());

	}

	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}
}