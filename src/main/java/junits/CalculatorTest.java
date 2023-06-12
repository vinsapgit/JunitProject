package junits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	
	@Test
	public void test1() {
		
		int result=Calculator1.add(6, 7);
		Assertions.assertEquals(result, 13);
		
	}

	@Test	
	public void test2() {
		
		int result=Calculator1.sub(10,6);
		Assertions.assertEquals(result, 4);
		
	}
}

