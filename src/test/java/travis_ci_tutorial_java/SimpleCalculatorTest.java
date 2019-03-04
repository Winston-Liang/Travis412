package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	@Test   
	public void minus() {
	    	assertEquals((5-3), 2);
	    }
	@Test
	 public void testminus() {
			SimpleCalculator calc = new SimpleCalculator();
			assertEquals(calc.minus(5, 3), 2);
		}
	@Test
	 public void testdidvid() {
			SimpleCalculator calc = new SimpleCalculator();
			assertEquals(calc.divide(6, 3), 2);
		}
}
