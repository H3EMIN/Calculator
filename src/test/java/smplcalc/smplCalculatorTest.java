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
	@Test
	public void testSub() {
		smplCalculator cal = new smplCalculator();
		cal.sub(40, 20);
		assertEquals(20,cal.getResult());
	}
	@Test
	public void testMulti() {
		smplCalculator cal = new smplCalculator();
		cal.multi(6, 8);
		assertEquals(48,cal.getResult());
	}
	@Test
	public void testDiv() {
		smplCalculator cal = new smplCalculator();
		cal.div(48, 6);
		assertEquals(8,cal.getResult());
	}
}
