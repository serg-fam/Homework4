package ua.goit.java.sergfam.Homework4p1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Serg-fam on 11.03.2016 on 10:30.
 */
public class Menu {

    private final static int CREATE = 1;
    private final static int DELETE = 2;
    private final static int GET_SQUARE = 3;
    private final static int EXIT = 0;

    private List<Figure> figures = new ArrayList<>();

    public void start() {
        int userChoice = -1;
        while (true) {
            printMainMenu();
            userChoice = getUserIntInput();

            if (userChoice == EXIT)
                return;

            if (userChoice != CREATE && userChoice != DELETE && userChoice != GET_SQUARE && userChoice != EXIT) {
                System.out.println("Input Error");
                continue;
            }

            int figureType = -1;
            do {
                printFigureTypeMenu();
                figureType = getUserIntInput();
            } while (figureType != 1 && figureType != 2 && figureType != 3 && figureType != 4);
            switch (userChoice) {
                case CREATE:
                    System.out.println("Enter the first side");
                    double a = getUserDoubleInput();
                    System.out.println("Enter the second side");
                    double b = getUserDoubleInput();
                    createFigure(figureType, a, b);
                    break;
                case DELETE:
                    boolean deleteResult = deleteFigure(figureType);
                    if (!deleteResult)
                        System.out.println("Such figures are not in the list");
                    break;
                case GET_SQUARE:
                    printAllSquares(figureType);
            }
            printFiguresStatus();
        }

    }

    private void printFiguresStatus() {
        System.out.println("Total figures - " + figures.size());
        System.out.println("The total number of laps - " + countFigures(1));
        System.out.println("Total number of triangles - " + countFigures(2));
        System.out.println("The total number of squares - " + countFigures(3));

    }

    private int countFigures(int type) {
        int result = 0;
        if (type == 1) {
            for (Figure figure : figures) {
                if (figure.getClass() == Circle.class) {
                    result++;
                }
            }
        }
        if (type == 2)
            for (Figure figure : figures) {
                if (figure.getClass() == Triangle.class) {
                    result++;
                }
            }
        if (type == 3)
            for (Figure figure : figures) {
                if (figure.getClass() == Square.class) {
                    result++;
                }
            }


        return result;
    }

    private void printAllSquares(int type) {
        if (type == 1) {
            for (Figure figure : figures) {
                if (figure.getClass() == Circle.class) {
                    System.out.println(figure.getSquare());
                }
            }
        }
        if (type == 2)
            for (Figure figure : figures) {
                if (figure.getClass() == Triangle.class) {
                    System.out.println(figure.getSquare());
                }
            }
        if (type == 3)
            for (Figure figure : figures) {
                if (figure.getClass() == Square.class) {
                    System.out.println(figure.getSquare());
                }
            }

    }

    private void createFigure(int type, double a, double b) {
        if (type == 1)
            figures.add(new Circle(a, b));
        if (type == 2)
            figures.add(new Triangle(a, b));
        if (type == 3)
            figures.add(new Square(a, b));
    }


    private boolean deleteFigure(int type) {
        if (type == 1) {
            for (Figure figure : figures) {
                if (figure.getClass() == Circle.class) {
                    figures.remove(figure);
                    return true;
                }
            }
        }
        if (type == 2)
            for (Figure figure : figures) {
                if (figure.getClass() == Triangle.class) {
                    figures.remove(figure);
                    return true;
                }
            }
        if (type == 3)
            for (Figure figure : figures) {
                if (figure.getClass() == Square.class) {
                    figures.remove(figure);
                    return true;
                }
            }

        return false;
    }

    private void printMainMenu() {
        System.out.println("1 - Create");
        System.out.println("2 - Remove");
        System.out.println("3 - Area");
        System.out.println("0 - Exit");
    }

    private void printFigureTypeMenu() {
        System.out.println("1 – Circle");
        System.out.println("2 – Triangle");
        System.out.println("3 – Square");

    }

    private int getUserIntInput() {
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        return result;
    }

    private double getUserDoubleInput() {
        Scanner scanner = new Scanner(System.in);
        double result = scanner.nextDouble();
        return result;
    }
}

