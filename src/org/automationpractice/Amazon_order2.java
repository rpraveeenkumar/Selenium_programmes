package org.automationpractice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_order2 {
	
	public static void main(String[] args) {
		
	
	
	System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
	WebDriver ref=new ChromeDriver();
	
	ref.get("https://www.amazon.in/");
	ref.manage().window().maximize();
	ref.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	ref.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
	ref.findElement(By.id("ap_email")).sendKeys("r.praveenkumar@live.com");
	ref.findElement(By.id("continue")).click();
	ref.findElement(By.id("ap_password")).sendKeys("Praveen1+3.");
	ref.findElement(By.id("signInSubmit")).click();
	String homepage = ref.getTitle();
	System.out.println(homepage);
	
	JavascriptExecutor js=(JavascriptExecutor)ref;
	js.executeScript("window.scrollBy(0,650)");
	
	ref.findElement(By.xpath("//span[text()='Mobiles']")).click();
	String newpage = ref.getTitle();
	System.out.println(newpage);
	
	
	}
}
