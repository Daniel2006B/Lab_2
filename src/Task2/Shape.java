package Task2;

// Абстрактний клас, який представляє загальну геометричну фігуру
public abstract class Shape {
    public abstract double getArea(); // Абстрактний метод для обчислення площі

    public double getVolume() {
        return 0; // Базова реалізація для фігур, які не мають об'єму
    }
}
