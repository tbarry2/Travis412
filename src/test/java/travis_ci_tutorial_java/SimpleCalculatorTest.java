package travis_ci_tutorial_java;

import java.security.InvalidParameterException;
import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}

	@Test
	public void testSubtract() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.subtract(5, 3), 2, .01);
	}

	@Test
	public void testMultiply() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(5, 3), 15);
	}

	@Test
	public void testDivide() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(6, 3), 2);
	}

	@Test (expected = InvalidParameterException.class)
	public void testDivideZeroDenominator()
	{
		SimpleCalculator calc = new SimpleCalculator();
		calc.divide(5, 0);
	}

	@Test
	public void testSubtractDecimals() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.subtract(5.9, 5.4), .5, .01);
	}
}
