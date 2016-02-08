package student.junit;

public class Calculator
{
	public double add(double number1, double number2)
	{
		return number1 + number2;
	}
	
	public double subtract(double number1, double number2)
	{
		return number1 - number2;
	}
	
	public double multiply(double number1, double number2)
	{
		return number1 * number2;
	}
	
	public double divide(double number1, double number2) 
	{
		if (new Double(number2).equals(0.0)) {
			throw new DivideByZeroException();
		}
		
		return number1 / number2;
	}
}
