package ua.goit.java.sergfam.Homework4p3;

import java.util.Scanner;

/**
 * Created by Serg-fam on 11.03.2016 on 14:52.
 */

public class Point {

    double x;
    double y;

    void printPoint() {
        System.out.print("(" + x + ";" + y + ")");
    }


    void setPoint(double a, double b) {
        x = a;
        y = b;
    }


    void setPoint(double a) {
        x = a;
        y = a;
    }

    void inputPoint() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter abscissa: ");
        double a = inp.nextDouble();
        System.out.print("Enter ordinate: ");
        double b = inp.nextDouble();

        setPoint(a, b);
    }


    boolean isSame(Point a) {
        if (x == a.x && y == a.y) {
            return true;
        } else {
            return false;
        }
    }


    double getDistance(Point a) {
        return Math.sqrt(Math.pow(x - a.x, 2) + Math.pow(y - a.y, 2));
    }


    double getRadius() {
        Point a = new Point(0, 0);
        return this.getDistance(a);
    }


    Point() {
        x = 0;
        y = 0;
    }


    Point(double x, double y) {


        this.x = x;
        this.y = y;
    }

}

