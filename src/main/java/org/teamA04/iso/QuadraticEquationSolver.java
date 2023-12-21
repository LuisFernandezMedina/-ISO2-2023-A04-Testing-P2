package org.teamA04.iso;

public class QuadraticEquationSolver {
	public static Object[] calculateRoots(double a, double b, double c) {
		double discriminant = b * b - 4 * a * c;
		if (discriminant > 0) {
			double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
			return new Object[] { root1, root2 };
		} else if (discriminant == 0) {
			double root = -b / (2 * a);
			return new Object[] { root };
		} else {
			double realPart = -b / (2 * a);
			double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
			return new Object[] { new Complex(realPart, imaginaryPart), new Complex(realPart, -imaginaryPart) };
		}
	}
}