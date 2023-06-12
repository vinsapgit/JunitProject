package junits;

import java.time.Month;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametersExample {

	
	@ParameterizedTest
	@ValueSource(strings = {"mom","dad","radar"})
	public void PalindromeCheck(String str)
	{
		Assertions.assertTrue(StringFunctions.ispallindrom(str));
	}

	@ParameterizedTest
	@ValueSource(ints = {2,32,54,4,12})
	public void EvenNumCheck(int num)
	{	
		Assertions.assertTrue(num%2==0);
	}
	
	@ParameterizedTest
	@EnumSource(Month.class)
	public void MonthCheck(Month monthname)
	{
		System.out.println(monthname.name() + " " + monthname.length(false));
		
		Assertions.assertTrue(monthname.length(false)==30 || monthname.length(false)==31 || monthname.length(false)==28);
		
	}
}
