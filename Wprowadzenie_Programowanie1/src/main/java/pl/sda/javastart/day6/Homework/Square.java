package pl.sda.javastart.day6.Homework;

public class Square extends Figure{
    Point p; //załóżmy, że punkt ten jest "dolnym lewym"
    double side;

    @Override
    public String toString() {
        return null;
    }

    @Override
    double getArea() {
        return 0;
    }

    @Override
    double getCircuit() {
        return 0;
    }

    @Override
    Point[] getEdges() {
        return new Point[0];
    }
}
