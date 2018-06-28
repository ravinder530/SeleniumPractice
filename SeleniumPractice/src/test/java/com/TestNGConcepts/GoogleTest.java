package com.TestNGConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	@BeforeMethod
	public void setUP() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	
	@Test(priority=3, groups="Title")
	public void googleTitleTest() {
		
		String title =driver.getTitle();
		System.out.println(title);
	}
	@Test(priority=1, groups ="Logo")
	public void googleLogoTest() {
		boolean b=driver.findElement(By.xpath("//img[@id = 'hplogo']")).isDisplayed();
		System.out.println(b);
	}
	@Test(priority=2, groups ="Title")
	public void VerifyMailLink() {
		boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println(b);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
