package org.ssglobal.training.codes.test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.apache.logging.log4j.core.appender.rolling.DefaultRolloverStrategy;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.ssglobal.training.codes.MathOps;

public class TestMathOps {
	private MathOps mo;
	
	@BeforeEach
	public void setup() {
		mo = new MathOps();
	}
	
	@AfterEach
	public void tearDown() {
		mo = null;
	}
	
	//sunny
	@Test
	public void testDivOp() {
		assertDoesNotThrow(()->{
			int result = mo.div(10, 2);
			assertEquals(5, result);
		});
	}
	//rainy
	@Test
	public void testDivOpRainy() {
		assertThrows((ArithmeticException.class), ()->{
			int result = mo.div(10, 0);
			assertEquals(0, result);
		});
	}
	
	@RepeatedTest(40)
	public void testDisplayArraySunny() {
		int[] testData = {10,11,23,13,12};
		int[] result = mo.displayArray(testData);
		assertSame(testData, result);
	}
	
	@Test
	public void testDisplayArrayRainy() {
		int[] testData = null;
		int[] result = mo.displayArray(testData);
		assertSame(testData, result);
	}
	
	@Test
	public void testAddOp() {
		int result = mo.add(2, 3);
		assertSame(5, result);
	}
}