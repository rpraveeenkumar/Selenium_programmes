package org.website_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 {
	
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		
		ref.get("http://www.greenstechnologys.com/");
		ref.findElement(By.xpath("//a[@href='contact.php'")).click();
		
	
	}
	
	
	}

