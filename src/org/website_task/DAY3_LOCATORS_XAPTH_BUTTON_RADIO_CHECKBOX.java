package org.website_task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DAY3_LOCATORS_XAPTH_BUTTON_RADIO_CHECKBOX {

	public static void main(String[] args)throws Throwable{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://management.ind.in/forum/lakshmi-vilas-bank-net-banking-application-form-157353.html");
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		
//		driver.findElement(By.xpath("//input[@id='navbar_username']")).sendKeys("123456");
//		driver.findElement(By.xpath("//input[@id='navbar_password']")).sendKeys("Hi123456.");
//		driver.findElement(By.xpath("//input[@id='cb_cookieuser_navbar']")).click();
//		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']")).sendKeys("7904468491");
		driver.findElement(By.xpath("//div[@class='submitBottomOption']")).click();
		
	}
}
