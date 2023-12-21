package org.teamA04.iso;
public class App {
	public static void main(String[] args) {
		try {
			double[] coefficients = UserInterface.readCoefficients();
			Object[] roots = QuadraticEquationSolver.calculateRoots(coefficients[0], coefficients[1], coefficients[2]);
			UserInterface.displayRoots(roots);
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
