package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		
		ref.get("https://www.amazon.in/");
		ref.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("oneplus 8 pro");
		Thread.sleep(2500);
		ref.findElement(By.cssSelector("#nav-search-submit-button")).click();
		JavascriptExecutor js=(JavascriptExecutor)ref;
		js.executeScript("window.scrollBy(0,750)");
		
		
		
	}

}
