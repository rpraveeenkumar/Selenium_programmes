package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
	WebDriver ref=new ChromeDriver();
	
	ref.get("https://www.instagram.com/?hl=en/");
	String currentUrl = ref.getCurrentUrl();
	System.out.println(currentUrl);
	
	Thread.sleep(3000);
	
	
	WebElement name = ref.findElement(By.name("username"));
	name.sendKeys("r.praveenkumar@live.com");
	
	Thread.sleep(3000);
	
	WebElement Password= ref.findElement(By.name("password"));
	Password.sendKeys("123456");	
		
	}

}
