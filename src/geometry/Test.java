package geometry;

public class Test {
    public static void main(String[] args) {

        GeometricFigureArea[] geometricFigureArea = new GeometricFigureArea[30];
        geometricFigureArea[0] = new Circle(10);
        geometricFigureArea[1] = new Circle(25);
        geometricFigureArea[2] = new Circle(30);
        geometricFigureArea[3] = new Triangle(30, 50);
        geometricFigureArea[4] = new Triangle(100, 60);
        geometricFigureArea[5] = new Triangle(80, 30);
        geometricFigureArea[6] = new Square(100);
        geometricFigureArea[7] = new Square(120);
        geometricFigureArea[8] = new Square(170);
        geometricFigureArea[9] = new Square(500);

        totalAreaOfFigures(geometricFigureArea);

    }

    public static void totalAreaOfFigures(GeometricFigureArea[] array) {
        double sum = 0;
        for (GeometricFigureArea geometricFigureArea : array) {
            if (geometricFigureArea == null) {
                break;
            }
            sum += geometricFigureArea.figureArea();
        }
        System.out.println("The total area is" + " " + sum + " mm");
    }
}