package ua.goit.java.sergfam.Homework4p2;

import ua.goit.java.sergfam.Homework4p1.Figure;

import java.util.Scanner;

/**
 * Created by Serg-fam on 11.03.2016 on 11:39.
 */
public class CelsiusTempTable {

    public static void main(String[] args) {

        System.out.print("Enter your temperature Celsium: ");
        Scanner c = new Scanner(System.in);
        double cel = c.nextDouble();

        System.out.print("Enter your temperature Fahrenheit: ");
        Scanner f = new Scanner(System.in);

        double far = f.nextDouble();

        double farRez = CelsiusToFarengate(cel);
        double celRez = FarengateToCelsius(far);

        System.out.println("Fahrenheit= " + farRez);
        System.out.println("Celsium= " + celRez);

    }

    public static double CelsiusToFarengate(double cel) {
        return (cel * 1.8) + 32;
    }

    public static double FarengateToCelsius(double far) {
        return (far - 32) / 1.8;
    }
}


