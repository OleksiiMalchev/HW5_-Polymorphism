package geometry;

public class Circle implements GeometricFigureArea {
    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new ArithmeticException("The radius of the circle cannot be negative and be equal to zero");
        }
        this.radius = radius;
    }

    @Override
    public double figureArea() {
        double pi = 3.141592653589793;
        return radius * radius * pi;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new ArithmeticException("The radius of the circle cannot be negative and be equal to zero");
        }
        this.radius = radius;
    }
}
