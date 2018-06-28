package com.TestNGConcepts;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {

	@Test(expectedExceptions = NumberFormatException.class)
	public void infiniteLoopTest() {
		String X= "100A";
		Integer.parseInt(X);
	}
}

