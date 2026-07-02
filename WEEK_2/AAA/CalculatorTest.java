package com.example.JUnitExercises;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
public class CalculatorTest {
	Calculator calculator;
	@Before
	public void setUp() {
		System.out.println("Before Test");
		calculator = new Calculator();
	}
	@Test
	public void testAdd() {
		//Arrange
		int num1 = 5;
		int num2 = 5;
		//Act
		int result = calculator.add(num1, num2);
		//Assert
		//Here the method is void
		assertEquals(10, result);
	}
	
	@After
	public void teardown() {
		System.out.print("After Test");
		calculator = null;
	}
}
