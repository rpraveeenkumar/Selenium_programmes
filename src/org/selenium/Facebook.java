package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver sys = new ChromeDriver();
		
		sys.get("https://www.facebook.com/");
		String title = sys.getTitle();
		System.out.println(title);
		
		WebElement email = sys.findElement(By.name("email"));
		email.sendKeys("r.praveenkumar@live.com");
		
		WebElement pass = sys.findElement(By.id("pass"));
		pass.sendKeys("Mine1+6.");
		
		sys.findElement(By.name("login")).click();
		
		Thread.sleep(6000);
		sys.close();
		
		
		
		
	}
}
