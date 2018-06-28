package com.TestNGConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	
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
	@Test
	public void googleTitleTest() {
		String title =driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google", "title is not matched");
	}
	@Test
	public void googleLogoTest() {
		boolean b=driver.findElement(By.xpath("//img[@id = 'hplogo']")).isDisplayed();
		//System.out.println(b);
		Assert.assertTrue(b);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
