package org.website_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trail {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		launchbrowser();
		driver.get("https://www.flipkart.com/");
		buttonclick("//button[.='✕']");
		
		//driver.findElement(By.xpath("//button[.='✕']")).click();
		
	}
	
	
	public static WebDriver launchbrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		return driver;
	}
	
	public static WebDriver buttonclick(String path) {
		driver.findElement(By.xpath(path)).click();
		return driver;
	}
}
