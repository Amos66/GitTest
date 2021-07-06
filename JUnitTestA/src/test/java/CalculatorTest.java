import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		
		Calculator clsCalc = new Calculator();
		if(clsCalc.add(1,5) != 6) {
			fail("Not yet implemented");
		}
	}
	
	@Test
	void testSubtract() {
		assertEquals(Calculator.subtract(7, 5), 2);
	}
	
	@Test
	void testMultiply() {
		assertEquals(Calculator.multiply(5, 10), 50);
	}
	
	@Test
	void testDivide() {
		assertEquals(Calculator.divide(10, 5), 2);
	}

}
