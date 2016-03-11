package ua.goit.java.sergfam.Homework4p1;

/**
 * Created by Serg-fam on 11.03.2016 on 10:30.
 */
public class Square extends Figure {

    private double x;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Square(double a, double b) {
        super(a, b);
        x = Math.min(a, b);
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public double getSquare() {
        return x * x;
    }

    public double getDiagonal() {
        return Math.sqrt(2) * x;
    }
}
