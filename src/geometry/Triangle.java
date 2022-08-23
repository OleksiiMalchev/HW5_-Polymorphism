package geometry;

public class Triangle implements GeometricFigureArea {
    private double side;
    private double height;

    public Triangle(double side, double height) {
        if (side <= 0 || height <= 0) {
            throw new ArithmeticException("The radius of the circle cannot be negative and be equal to zero");
        }
        this.side = side;
        this.height = height;

    }

    @Override
    public double figureArea() {
        return (side * height) / 2;
    }

    public double getSide() {
        return side;
    }

    public double getHeight() {
        return height;
    }

    public void setSide(double side) {
        if (side <= 0) {
            throw new ArithmeticException("The side of a triangle cannot be negative and equal to zero");
        }
        this.side = side;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new ArithmeticException("The height of a triangle cannot be negative and equal to zero");
        }
        this.height = height;
    }

}
