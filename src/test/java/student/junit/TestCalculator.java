package student.junit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestCalculator 
{
	Calculator calculator;
	
	@Before
	public void setup()
	{
		calculator = new Calculator();
	}
	
	@Test
	public void add_basic()
	{
		assertEquals(calculator.add(1, 2), 3, 0);
	}

	@Test
	public void subtract_basic()
	{
		assertEquals(calculator.subtract(9, 5), 4, 0);
	}

	@Test
	public void subtract_lessThanZero()
	{
		assertEquals(calculator.subtract(9, 5), 4, 0);
	}
	
	@Test
	public void multiply_basic()
	{
		assertEquals(calculator.multiply(1, 2), 2, 0);
	}

	@Test
	public void multiply_byZero()
	{
		assertEquals(calculator.multiply(0, 2), 0, 0);
	}
	
	@Test
	public void divide_basic()
	{
		assertEquals(calculator.divide(6, 3), 2, 0);
	}

	@Test
	public void divide_nontrivial()
	{
		assertEquals(calculator.divide(9, 4), 2.25, 0);
	}
	
	@Test
	public void divide_byZero()
	{
		assertEquals(calculator.divide(9, 0), Double.POSITIVE_INFINITY, 0);
	}
}
