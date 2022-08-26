package geometry;

public class Triangle implements GeometricFigureArea {
    private double sideA, sideB, sideC;


    public Triangle(double sideA, double sideB, double sideC) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new ArithmeticException("The triangle of the circle cannot be negative and be equal to zero");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;


    }

    @Override
    public double figureArea() {
        double per = (sideA + sideB + sideC) / 2;

        return Math.sqrt(per * (per - sideA) * (per - sideB) * (per - sideC));
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideA(double sideA) {
        if (sideA <= 0) {
            throw new ArithmeticException("The side of a triangle cannot be negative and equal to zero");
        }
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        if (sideB <= 0) {
            throw new ArithmeticException("The side of a triangle cannot be negative and equal to zero");
        }
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        if (sideC <= 0) {
            throw new ArithmeticException("The side of a triangle cannot be negative and equal to zero");
        }
        this.sideC = sideC;
    }

}
