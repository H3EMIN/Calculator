package smplcalc;

import static org.junit.Assert.*;

import org.junit.Test;

public class smplCalculatorTest {

	@Test
	public void testAdd() {
		smplCalculator cal = new smplCalculator();
		cal.add(10, 20);
		assertEquals(30,cal.getResult());
	}

}
