package travis_ci_tutorial_java;

import java.security.InvalidParameterException;

public class SimpleCalculator {
	public int add(int a, int b) {
		return a + b;
	}

	public double subtract(double a, double b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		if (b == 0)
		{
			throw new InvalidParameterException("Denominator cannot be 0");
		}
		return a / b;
	}
}
