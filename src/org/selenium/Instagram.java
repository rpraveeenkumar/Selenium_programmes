package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver sc = new ChromeDriver();
		
		sc.get("https://www.instagram.com/?hl=en/");
		
		Thread.sleep(3000);
		sc.findElement(By.xpath("//span[@class='_7UhW9   xLCgt        qyrsm      gtFbE       se6yk        ']")).click();
		
		
		Thread.sleep(3000);
		WebElement mobno = sc.findElement(By.xpath("//input[@aria-label='Mobile Number or Email']"));
		mobno.sendKeys("9566971997");
		
		WebElement fullname = sc.findElement(By.xpath("//input[@aria-label='Full Name']"));
		fullname.sendKeys("Praveen");
		
		WebElement username = sc.findElement(By.xpath("//input[@aria-label='Username']"));
		username.sendKeys("r_praveeenkumar");
		
		WebElement Password = sc.findElement(By.xpath("//input[@aria-label='Password']"));
		Password.sendKeys("Hi12345.");
		
		Thread.sleep(3000);
		sc.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(3000);
		
		sc.close();
		
	}
}
