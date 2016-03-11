package ua.goit.java.sergfam.Homework4p1;

/**
 * Created by Serg-fam on 11.03.2016 on 9:26.
 */
public abstract class Figure {

    protected double a;
    protected double b;

    public Figure (double a, double b){

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

     public abstract String getName();
     public  abstract double getSquare();


}
