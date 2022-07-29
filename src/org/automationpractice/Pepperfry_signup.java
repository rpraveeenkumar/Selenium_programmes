package org.automationpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pepperfry_signup {
	
	public static void main(String[] args) {
		
		//launch browser 
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//launch url
		driver.get("https://www.pepperfry.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//signup
		driver.findElement(By.xpath("//div[@class='hd-profile-cta-wrap']")).click();
		driver.findElement(By.xpath("//input[@class='animate-input']")).sendKeys("Praveen kumar");
		driver.findElement(By.xpath("(//input[@name='mobile'])[2]")).sendKeys("7904468491");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("praveenkumarvjx@gmail.com");
		driver.findElement(By.xpath("//input[@id='password1-mreg']")).sendKeys("Mine1+6.");
		driver.findElement(By.xpath("(//input[@name=\"logSubmit\"])[1]")).click();
		
	}

}
