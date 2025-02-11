package Task2;

public class Sphere extends Shape {
    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }
}

