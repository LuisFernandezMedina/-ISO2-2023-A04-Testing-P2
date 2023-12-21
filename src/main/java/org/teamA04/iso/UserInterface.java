package org.teamA04.iso;

import java.util.Scanner;

public class UserInterface {
    private static final Scanner scanner = new Scanner(System.in);

    public static double[] readCoefficients() {
        double[] coefficients = new double[3];
        try {
            System.out.print("Enter coefficient a: ");
            coefficients[0] = scanner.nextDouble();

            System.out.print("Enter coefficient b: ");
            coefficients[1] = scanner.nextDouble();

            System.out.print("Enter coefficient c: ");
            coefficients[2] = scanner.nextDouble();
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid input. Please enter numeric values.");
        }
        return coefficients;
    }

    public static void displayRoots(Object[] roots) {
        for (Object root : roots) {
            System.out.println("Root: " + root + " ");
        }
        System.out.println();
    }
}