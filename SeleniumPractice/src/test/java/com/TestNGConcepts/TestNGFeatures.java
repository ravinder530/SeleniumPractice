package com.TestNGConcepts;

import org.testng.annotations.Test;

public class TestNGFeatures {

	@Test
	public void loginTest() {
		System.out.println("loginTest");
		//int i=9/0;
	}
	@Test(dependsOnMethods="loginTest")
	public void homePageTest() {
		System.out.println("homePageTest");
	}
	@Test(dependsOnMethods="loginTest")
	public void searchPage() {
		System.out.println("search Page");
	}
	@Test(dependsOnMethods="loginTest")
	public void regPageTest() {
		System.out.println("regPageTest");
	}
}

