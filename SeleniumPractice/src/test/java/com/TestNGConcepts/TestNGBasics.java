package com.TestNGConcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	@BeforeSuite //1
	public void setup() {
		System.out.println("setu system property for chrome");
	}
//Pre-conditions annotations --starting with @Before
	@BeforeClass //3
	public void login() {
		System.out.println("Launch Chrome Browser");
	}
	@BeforeTest //2
	public void launchBrowser() {
		System.out.println("Login Method");
	}
	@BeforeMethod //4
	public void enterURL() {
		System.out.println("Enter URL");
	}
	//Test Case -- Starting with @Test
	@Test //5
	public void googleTitleTest() {
		System.out.println("Google Title Test");
	}
	@Test
	public void search() {
		System.out.println("Search Test Case");
	}
	@Test
	public void logoTest() {
		System.out.println("Logo Test");
	}
	//Post conditions -- Starting with @Aster
	@AfterMethod //6
	public void logout() {
		System.out.println("logout");
	}
	@AfterClass //7
	public void afterClass() {
		System.out.println("closing the browser");
	}
	@AfterTest //8
	public void deleteAllCookies() {
		System.out.println("deleting cookies");
			}
	@AfterSuite
	public void report() {
		System.out.println("gen reports");
	}
}
