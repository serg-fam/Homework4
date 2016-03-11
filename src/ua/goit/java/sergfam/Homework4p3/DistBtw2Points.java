package ua.goit.java.sergfam.Homework4p3;



/**
 * Created by Serg-fam on 11.03.2016 on 12:28.
 */
public class DistBtw2Points {

    public static void main(String[] args) {

        Point a = new Point();

        System.out.println("Set the coordinates of the first point on the plane:: ");

        a.inputPoint();

        Point b = new Point(0, 0);
        System.out.println("Set the coordinates of the second point on the plane: ");

        b.inputPoint();

        if (a.isSame(b)) {
            System.out.println("The points are the same!");
        } else {
            System.out.println("Distance between points: " + b.getDistance(a));
        }

        if (a.getRadius() < b.getRadius()) {
            System.out.println("By the beginning of the coordinates near the first point!");
        } else if (a.getRadius() == b.getRadius()) {
            System.out.println("The points equidistant from the origin!");
        } else {
            System.out.println("By the beginning of the coordinates near the second point!");
        }
    }

}

