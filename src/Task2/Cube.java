package Task2;

public class Cube extends Shape {
    private final double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }
}

