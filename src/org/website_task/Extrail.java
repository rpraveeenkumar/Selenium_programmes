package org.website_task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Extrail {
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver sc=new ChromeDriver();
		sc.get("https://www.amazon.in/");
		
		String title1 = sc.getTitle();
		System.out.println(title1);
		
		//single_click_option
		sc.findElement(By.id("twotabsearchtextbox")).sendKeys("Oneplus");
		sc.findElement(By.id("nav-search-submit-button")).click();
		String title2 = sc.getTitle();
		System.out.println(title2);
		
	}

}
