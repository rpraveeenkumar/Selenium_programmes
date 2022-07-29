package org.automationpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pepperfry_cart {
	
	public static void main(String[] args) throws Throwable {
		
		//launch browser & URL
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//launch URL & login
		driver.get("https://www.pepperfry.com/");
		driver.findElement(By.xpath("//div[@class='hd-profile-cta-wrap']")).click();
		//System.out.println("hi");
		//Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//div[@class='reg-modal-right-bottom-btn-wrap pf-margin-bottom20']")).click();
		//driver.findElement(By.xpath("(//a[@data-modal=\"loginModal\"])[1]")).click();
		
		//System.out.println("hi");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='user[new]']")).sendKeys("praveenkumarvjx@gmail.com");
		//System.out.println("hi");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Mine1+6.");
		//System.out.println("hi");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class=\"home-login-rgstrbtn pf-center btn-blue\"])[3]")).click();
		//Thread.sleep(2000);
		//System.out.println("hi");
	}

}
