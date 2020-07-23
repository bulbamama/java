package ru.stqa.pft.testbox;

public class Plane {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();

        p1.x = 4;
        p1.y = 10;

        p2.x = 8;
        p2.y = 2;

        System.out.println("Расстояние между точками p1 и p2 равно " + distance(p1, p2));


    }
    public static double distance(Point p1, Point p2) {
        return Math.sqrt((p2.x-p1.x)*(p2.x-p1.x)+(p2.y-p1.y)*(p2.y-p1.y));
    }

}
