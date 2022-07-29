package org.automationpractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_signup {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		
		ref.get("https://www.amazon.in/");
		ref.manage().window().maximize();
		ref.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		ref.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		ref.findElement(By.id("createAccountSubmit")).click();
		ref.findElement(By.id("ap_customer_name")).sendKeys("Praveen kuamr");
		ref.findElement(By.id("ap_email")).sendKeys("9597151868");
		ref.findElement(By.id("ap_password")).sendKeys("Hi12345.");
		ref.findElement(By.id("ap_password_check")).sendKeys("Hi12345.");
		ref.findElement(By.id("continue")).click();
		//WebElement ph = ref.findElement(By.className("a-button-text a-declarative"));
		//Select sc=new Select(ph);
		//sc.selectByVisibleText("IN +91");
		
		//Thread.sleep(1500);
		//Robot rob=new Robot();
		//rob.mouseMove(1400, 160);
		
	}

}
