package org.ssglobal.training.codes;

import java.util.Arrays;
import java.util.Date;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MathOps {
	private static Logger logger1 = LogManager.getLogger("logger1");
	
	public MathOps() {
		
	}
	
	public MathOps(int x, int y) {
		
	}
	
	@SuppressWarnings("deprecation")
	public int add(int x, int y) {
		logger1.info("start of method add() with parameters x=%d, y=%d".formatted(x, y));
		
		logger1.warn("using custom Date() object");
		Date xmas = new Date(123, 1, 32);
		System.out.println(xmas);
		
		int sum = x + y;
		logger1.info("end of method add() with parameters x=%d, y=%d".formatted(x, y));
		return sum;
	}
	
	public int div(int x, int y) throws ArithmeticException, Exception{
		//first line of method execution
		logger1.info("start of method div() with parameters x=%d, y=%d".formatted(x, y));
		if(y == 0) {
			//before throw new
			logger1.error("division by zero error"); //severe - use to abnormal events in the method
			throw new ArithmeticException();
		}
		//before return
		logger1.info("end of method div() with parameters x=%d, y=%d".formatted(x, y));
		return x / y;
	}
	
	public int[] displayArray(int[] arrData) {
		logger1.info("start of method displayArray() with parameters arrData=%s".formatted(Arrays.toString(arrData)));
		try {
			int len = arrData.length;
			System.out.println("length of array: %d".formatted(len));
			System.out.println(Arrays.toString(arrData));
		} catch (NullPointerException e) {
			logger1.fatal(e.getMessage());
		}
		logger1.info("end of method displayArray() with parameters arrData=%s".formatted(Arrays.toString(arrData)));
		return arrData;
		
	}
}