package com.bharat.framework.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;

	@Test
	public void testEasy() {
		driver.get("http://rediff.com/");
		String title = driver.getTitle();
		System.out.println("get title " + title);

	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@AfterTest
	public void afterTest() {
		// driver.quit();
	}

}
