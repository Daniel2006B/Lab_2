package Task2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Введення параметрів трикутника
        System.out.print("Введіть основу трикутника: ");
        final double triangleBase = scanner.nextDouble();
        System.out.print("Введіть висоту трикутника: ");
        final double triangleHeight = scanner.nextDouble();
        Shape triangle = new Triangle(triangleBase, triangleHeight);
        System.out.println("Triangle area: " + triangle.getArea());

        // Введення параметрів квадрата
        System.out.print("Введіть сторону квадрата: ");
        final double squareSide = scanner.nextDouble();
        Shape square = new Square(squareSide);
        System.out.println("Square area: " + square.getArea());

        // Введення параметрів прямокутника
        System.out.print("Введіть ширину прямокутника: ");
        final double rectangleWidth = scanner.nextDouble();
        System.out.print("Введіть висоту прямокутника: ");
        final double rectangleHeight = scanner.nextDouble();
        Shape rectangle = new Rectangle(rectangleWidth, rectangleHeight);
        System.out.println("Rectangle area: " + rectangle.getArea());

        // Введення радіуса кола
        System.out.print("Введіть радіус кола: ");
        final double circleRadius = scanner.nextDouble();
        Shape circle = new Circle(circleRadius);
        System.out.println("Circle area: " + circle.getArea());

        // Введення радіуса сфери
        System.out.print("Введіть радіус сфери: ");
        final double sphereRadius = scanner.nextDouble();
        Shape sphere = new Sphere(sphereRadius);
        System.out.println("Sphere area: " + sphere.getArea());
        System.out.println("Sphere volume: " + sphere.getVolume());

        // Введення сторони куба
        System.out.print("Введіть сторону куба: ");
        final double cubeSide = scanner.nextDouble();
        Shape cube = new Cube(cubeSide);
        System.out.println("Cube area: " + cube.getArea());
        System.out.println("Cube volume: " + cube.getVolume());

        // Введення параметрів піраміди
        System.out.print("Введіть площу основи піраміди: ");
        final double pyramidBaseArea = scanner.nextDouble();
        System.out.print("Введіть висоту піраміди: ");
        final double pyramidHeight = scanner.nextDouble();
        Shape pyramid = new Pyramid(pyramidBaseArea, pyramidHeight);
        System.out.println("Pyramid area: " + pyramid.getArea());
        System.out.println("Pyramid volume: " + pyramid.getVolume());

        scanner.close(); // Закриваємо сканер
    }
}