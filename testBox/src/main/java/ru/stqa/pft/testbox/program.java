package ru.stqa.pft.testbox;

public class program {
	public static void main(String[] args) {

	hello("user");
	hello("Alex");
	hello("Gabe");

	double l = 5;
		System.out.println("Площадь квадрата со стороной " + l + " ровна " + area(l));

	double a = 4;
	double b = 6;
		System.out.println("Прямоугольник со сторонами " + "ровна" + area(a, b));

	}

	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}
	public static double area(double l) {return l*l; }
	public static double area(double a, double b) {return a * b; }
	

}