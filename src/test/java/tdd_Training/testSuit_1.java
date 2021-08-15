package tdd_Training;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class testSuit_1 {
	private Calculator calculator;
	
	@Before
	public void initCalculator(){
		// Given
		calculator = new Calculator();
	}
	
	@Test
	public void testCase_01_Sum_Numbers() {
	
		// When
		int result = calculator.sum(2, 2);
		// Then
		if (result != 4) {   // if 2 + 2 != 4
			Assert.fail();
		}
		
	}
	
	@Test
	public void testCase_02_Minus_Numbers() {
		Assert.assertEquals(0, calculator.minus(2, 2));
	}
	
	@Test
	public void testCase_03_Divide_Numbers() {
		Assert.assertEquals(2, calculator.divide(6, 3));
	}
	
	@Test
	public void testCase_04_Multiply_Numbers() {
		Assert.assertEquals(18, calculator.multiply(6, 3));
	}
	
	@Test(expected = ArithmeticException.class)
	// Catching "Arithmetic Exception" here which makes test pass by ignoring
	public void testCase__05_Divide_Numbers() {
		calculator.divide(6, 0);
	}
	
}
