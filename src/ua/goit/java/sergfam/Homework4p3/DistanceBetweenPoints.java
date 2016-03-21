package ua.goit.java.sergfam.Homework4p3;

import java.util.Scanner;

/**
 * Created by Serg-fam on 11.03.2016 on 12:28.
 */
public class DistanceBetweenPoints {



    public static void main(String[] args) {

        Point a = new Point();
        Point b = new Point();

        System.out.println("Set the coordinates of the first point on the plane: ");

        Scanner inpA = new Scanner(System.in);
        System.out.print("Enter abscissa: ");
        a.setPoint(inpA.nextDouble());
        System.out.print("Enter ordinate: ");
        b.setPoint(inpA.nextDouble());

        System.out.println("Set the coordinates of the second point on the plane: ");

        Scanner inpB = new Scanner(System.in);
        System.out.print("Enter abscissa: ");
        a.setPoint(inpB.nextDouble());
        System.out.print("Enter ordinate: ");
        b.setPoint(inpB.nextDouble());


        if (b.getDistance(a) == 0.0) {
            System.out.println("The points are the same!");
        } else {
            System.out.println("Distance between points: " + b.getDistance(a));
        }

        if (a.getDistance(new Point(0.0, 0.0)) < b.getDistance(new Point(0.0, 0.0))) {
            System.out.println("By the beginning of the coordinates near the first point!");
        } else if (a.getDistance(new Point(0.0, 0.0)) == b.getDistance(new Point(0.0, 0.0))) {
            System.out.println("The points equidistant from the origin!");
        } else {
            System.out.println("By the beginning of the coordinates near the second point!");
        }
    }
}

