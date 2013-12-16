package machshevon;
import static org.junit.Assert.*;

import org.junit.*;


public class test {

	private StringCaclculator calc;
	@Before
	public void initCalc()
	{
		calc = new StringCaclculator();
	}
@Test


	public void EmptyString0() throws Exception
	{
		assertEquals(calc.add(""), 0);
	}

@Test
	public void SingleNumberReturns() throws Exception
	{
	assertEquals(calc.add("1"), 1);
	}
@Test
	public void TwoNumbersSum() throws Exception{
		assertEquals(calc.add("1,2"), 3);
	}

@Test
	public void TwoNumbersSumNewLine() throws Exception{
	assertEquals(calc.add("1\n2"), 3);
}

@Test 

	(expected =Exception.class)
	public void negativeExeption() throws Exception
	{
	
		calc.add("-1");
	}


}