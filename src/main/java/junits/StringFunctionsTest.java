package junits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringFunctionsTest {
	
	@Test
	@DisplayName("Positive Test scenario")
	public void test1()
	{
		Assertions.assertTrue(StringFunctions.ispallindrom("mom"));
	}

	@Test
	@DisplayName("Negative test scenario")
	public void test2()
	{
		Assertions.assertFalse(StringFunctions.ispallindrom("BHAVIN"));
	}
	
	@Test
	@DisplayName("Case sensitive test scenario")
	public void test3()
	{
		Assertions.assertTrue(StringFunctions.ispallindrom("Dad"));
	}
	
	@Test
	@DisplayName("Case sensitive test scenario")
	public void test4()
	{
		Assertions.assertTrue(StringFunctions.ispallindrom("Dad"));
	}
}
