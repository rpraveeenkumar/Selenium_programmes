package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trail {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver sys = new ChromeDriver();
		
		sys.get("https://www.facebook.com/");
		WebElement name = sys.findElement(By.xpath("//input[@name='email']"));
		name.sendKeys("Praveen");
		
		
		
	}
	
}
