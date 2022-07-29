package org.website_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
	WebDriver ref=new ChromeDriver();
	
	ref.get("https://www.swiggy.com/");
	ref.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
	ref.findElement(By.id("mobile")).sendKeys("0566971997");
	ref.findElement(By.id("name")).sendKeys("Praveen");
	ref.findElement(By.id("email")).sendKeys("hi@gmail.com");
	ref.findElement(By.id("password")).sendKeys("finedamapla");
	ref.findElement(By.xpath("//input[@type='submit']")).click();
}
}
