package geometry;

public class Square implements GeometricFigureArea {
    private double side;

    public Square(double side) {
        if (side <= 0) {
            throw new ArithmeticException("The side of the square cannot be negative and be equal to zero");
        }
        this.side = side;
    }

    @Override
    public double figureArea() {

        return side * side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            throw new ArithmeticException("The side of the square cannot be negative and be equal to zero");
        }
        this.side = side;
    }
}

