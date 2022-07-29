package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fbsignup {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver sc=new ChromeDriver();
		
		sc.get("https://www.facebook.com/");
		String url = sc.getCurrentUrl();
		System.out.println(url);
		
		sc.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		Thread.sleep(3000);
		
		WebElement firstname = sc.findElement(By.xpath("//input[@placeholder='First name']"));
	
		firstname.sendKeys("Praveen");
		
		WebElement lastname = sc.findElement(By.xpath("//input[@name='lastname']"));
		
		lastname.sendKeys("kumar");
		
		WebElement Phemail= sc.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
		Phemail.sendKeys("9566971997");	
		
		WebElement Pass = sc.findElement(By.xpath("//input[@autocomplete='new-password']"));
		Pass.sendKeys("Hi12345.");
		
		WebElement day = sc.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s1=new Select(day);
		s1.selectByValue("29");
		
		WebElement month = sc.findElement(By.xpath("//select[@title='Month']"));
		Select s2=new Select(month);
		s2.selectByValue("1");
		//s2.selectByVisibleText("Jan");

		WebElement year = sc.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s3=new Select(year);
		s3.selectByValue("1995");
		
		sc.findElement(By.xpath("//input[@value='2']")).click();
		
		sc.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		Thread.sleep(3000);
		sc.close();		
	
	}

}
