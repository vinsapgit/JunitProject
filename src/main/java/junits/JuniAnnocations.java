package junits;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JuniAnnocations {

	

	@BeforeAll
	public static void methodonce()
	{
		System.out.println("This method will be called before all method");

	}
	
	@BeforeEach
	public void method1()
	{
		System.out.println("This method will be called before each method");

	}
	
	@Test
	@DisplayName("Positive Test scenario")
	public void test1()
	{
		Assertions.assertTrue(StringFunctions.ispallindrom("mom"));
	}
	
	@AfterEach
	public void method2()
	{
		System.out.println("This method will be called After each method");
	}
	
	@Test
	@Disabled
	@DisplayName("Negative test scenario")
	public void test2()
	{
		Assertions.assertFalse(StringFunctions.ispallindrom("BHAVIN"));
	}

	@AfterAll
	public static void methodtwice()
	{
		System.out.println("This method will be called after all method");

	}
}
