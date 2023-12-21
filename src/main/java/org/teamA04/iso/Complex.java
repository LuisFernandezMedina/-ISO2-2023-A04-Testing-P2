package org.teamA04.iso;

public class Complex {
	private double real;
	private double imaginary;

	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public double getReal() {
		return real;
	}

	public double getImaginary() {
		return imaginary;
	}

	@Override
	public String toString() {
		return imaginary >= 0 ? real + " + " + imaginary + "i" : real + " - " + (-imaginary) + "i";
	}
}
