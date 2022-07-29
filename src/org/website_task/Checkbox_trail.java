package org.website_task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_trail {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		
		ref.get("http://www.leafground.com/home.html");
		ref.findElement(By.xpath("//img[@alt='Checkbox']")).click();
		ref.findElement(By.xpath("(//input[@type='checkbox'])[1])")).click();
		
		//JavascriptExecutor js=(JavascriptExecutor)ref;
		//js.executeScript("document.getElementByxpath((//input[@type='checkbox'])[1]).checked=true");
	}

}
