package org.website_task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DAY2_LOCATORS_SENDKEY {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		//login
//		driver.get("http://adactinhotelapp.com/");
//		driver.findElement(By.id("username")).sendKeys("praveenkumar");
//		driver.findElement(By.id("password")).sendKeys("Hi12345.");
//		driver.findElement(By.id("login")).click();
		
		//login
		driver.get("https://netbanking.hdfcbank.com/");
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("12345678");
		
	
	}

}
